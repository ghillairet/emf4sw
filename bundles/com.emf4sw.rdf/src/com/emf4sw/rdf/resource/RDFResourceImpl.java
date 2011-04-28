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
package com.emf4sw.rdf.resource;

import static org.eclipse.emf.ecore.util.EcoreUtil.getObjectsByType;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

import com.emf4sw.rdf.DocumentGraph;
import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.Triple;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.2
 */
public abstract class RDFResourceImpl extends ResourceImpl implements RDFResource {

	protected RDFReader<?> reader;

	protected RDFWriter<?> writer;

	public RDFResourceImpl() {
		super();
		setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());
	}

	public RDFResourceImpl(URI uri) {
		super(uri);
		setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());
	}

	@Override
	public NamedGraph createNamedGraph(URI uri) {
		if (!getContents().isEmpty()) {
			throw new IllegalStateException("Cannot create NamedGraph, RDFResource already contains a graph");
		}
		
		final NamedGraph aGraph = RDFFactory.eINSTANCE.createNamedGraph();
		aGraph.setURI(uri.toString());
		getContents().add(aGraph);

		return aGraph;
	}
	
	@Override
	public DocumentGraph createGraph() {
		if (!getContents().isEmpty()) {
			throw new IllegalStateException("Cannot create DocumentGraph, RDFResource already contains a graph");
		}
		
		final DocumentGraph aGraph = RDFFactory.eINSTANCE.createDocumentGraph();
		getContents().add(aGraph);

		return aGraph;
	}

	@Override
	public DocumentGraph getGraph() {
		if (getContents().size() == 0) {
			return null;
		}
		
		return getContents().get(0) == null ? null : (DocumentGraph) getContents().get(0);
	}

	@Override
	public NamedGraph getNamedGraph(URI uri) {
		if (getContents().size() == 0) {
			return null;
		}
		
		if (getContents().get(0) instanceof DocumentGraph) {
			return ((DocumentGraph)getContents().get(0)).getNamedGraph(uri.toString());
		}
		
		for (Object aGraph: getObjectsByType(getContents(), RDFPackage.eINSTANCE.getNamedGraph())) {
			if (aGraph instanceof NamedGraph) {
				if (((NamedGraph)aGraph).getURI() == uri.toString()) {
					return (NamedGraph) aGraph;
				}
			}
		}
		
		return null;
	}

//	public final static class DummyRDFResource extends RDFResourceImpl {
//		public DummyRDFResource() {
//			super();
//		}
//
//		@Override
//		protected void doLoad(InputStream inputStream, Map<?, ?> options) throws UnsupportedOperationException {
//			throw new UnsupportedOperationException("Can't load dummy resources, use other implementation.");
//		}
//
//		@Override
//		protected void doSave(OutputStream outputStream, Map<?, ?> options) throws UnsupportedOperationException {
//			throw new UnsupportedOperationException("Can't save dummy resources, use other implementation.");
//		}
//
//		@Override
//		public Object getDelegate() {
//			throw new UnsupportedOperationException();
//		}
//
//		@Override
//		public void addDelegate(Triple obj) {}
//
//	}

	public abstract void addDelegate(Triple obj);
}
