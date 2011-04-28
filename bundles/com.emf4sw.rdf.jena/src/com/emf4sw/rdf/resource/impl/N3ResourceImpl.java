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

import com.emf4sw.rdf.jena.JenaRDFReader;
import com.emf4sw.rdf.jena.JenaRDFWriter;
import com.emf4sw.rdf.resource.N3Resource;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7
 */
public class N3ResourceImpl extends JenaResourceImpl implements N3Resource {
	
	public N3ResourceImpl() {
		super();
		reader = new JenaRDFReader();
		writer = new JenaRDFWriter();
	}
	
	public N3ResourceImpl(URI uri) {
		super(uri);
		reader = new JenaRDFReader();
		writer = new JenaRDFWriter();
	}
}
