/*******************************************************************************
 * Copyright (c) 2011 Guillaume Hillairet.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Guillaume Hillairet - initial API and implementation
 *******************************************************************************/
package com.emf4sw.rdf.resource.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;

import com.emf4sw.rdf.jena.JenaRDFReader;
import com.emf4sw.rdf.jena.JenaRDFWriter;
import com.emf4sw.rdf.resource.NTriplesResource;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7
 */
public class NTriplesResourceImpl extends JenaResourceImpl implements NTriplesResource {

	public NTriplesResourceImpl() {
		super();
		reader = new JenaRDFReader();
		writer = new JenaRDFWriter();
	}

	public NTriplesResourceImpl(URI uri) {
		super(uri);
		reader = new JenaRDFReader();
		writer = new JenaRDFWriter();
	}

	@Override
	public void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		Notification notification = setLoaded(true);
		try {
			final Model aModel = ModelFactory.createDefaultModel();
			final com.hp.hpl.jena.rdf.model.RDFReader reader = aModel.getReader("N-TRIPLES");
			reader.setProperty("WARN_REDEFINITION_OF_ID","EM_IGNORE");
			try {
				try {
					reader.read(aModel, inputStream, "");
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (!aModel.isEmpty()) {
					((JenaRDFReader)this.reader).read(aModel, this);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} finally {
			if (notification != null) {
				eNotify(notification);
			}
			setModified(false);
		}
	}

	@Override
	public void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
		final Model aModel = ModelFactory.createDefaultModel();
		((JenaRDFWriter)writer).write(this, aModel);
		
		if (!aModel.isEmpty()) {
			com.hp.hpl.jena.rdf.model.RDFWriter writer = aModel.getWriter("N-TRIPLES");

			writer.write(aModel, outputStream, "");
		}
	}

}
