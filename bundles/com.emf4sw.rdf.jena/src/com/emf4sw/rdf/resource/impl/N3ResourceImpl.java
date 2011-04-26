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
