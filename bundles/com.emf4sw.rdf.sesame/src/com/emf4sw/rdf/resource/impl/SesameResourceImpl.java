package com.emf4sw.rdf.resource.impl;

import org.eclipse.emf.common.util.URI;
import org.openrdf.model.Graph;
import org.openrdf.model.impl.GraphImpl;

import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.resource.RDFResourceImpl;
import com.emf4sw.rdf.sesame.RDFGraph2SesameGraph;

public class SesameResourceImpl extends RDFResourceImpl {

	private final Graph sesameGraph;
	
	public SesameResourceImpl() {
		super();
		this.sesameGraph = new GraphImpl();
	}
	
	public SesameResourceImpl(URI uri) {
		super(uri);
		this.sesameGraph = new GraphImpl();
	}
	
	@Override
	public Object getDelegate() {
		return sesameGraph;
	}

	@Override
	public void addDelegate(Triple obj) {
		try {
			sesameGraph.add(RDFGraph2SesameGraph.extractAsSesameStatement(obj));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
