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

import org.eclipse.emf.common.util.URI;

import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.jena.TripleExtractor;
import com.emf4sw.rdf.resource.RDFResourceImpl;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public abstract class JenaResourceImpl extends RDFResourceImpl {

	private Model model;
	
	public JenaResourceImpl() {
		super();
		model = ModelFactory.createDefaultModel();
	}
	
	public JenaResourceImpl(URI uri) {
		super(uri);
		model = ModelFactory.createDefaultModel();
	}
	
	@Override
	public Object getDelegate() {
		return model;
	}

	@Override
	public void addDelegate(Triple obj) {
		model.add( TripleExtractor.extract(obj, model) );
	}
}
