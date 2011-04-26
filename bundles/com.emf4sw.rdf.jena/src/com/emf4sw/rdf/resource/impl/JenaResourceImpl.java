package com.emf4sw.rdf.resource.impl;

import org.eclipse.emf.common.util.URI;

import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.jena.RDFGraphExtractor;
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
		model.add( RDFGraphExtractor.extract(obj, model) );
	}
}
