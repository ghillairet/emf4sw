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
package com.emf4sw.rdf.jena;

import org.eclipse.emf.ecore.resource.Resource;

import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.resource.RDFResourceImpl;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;

/**
 * {@link NamedGraphInjector}
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class NamedGraphInjector {
	
	private NamedGraphInjector() {}
	
	public static void inject(Model aModel, RDFGraph aGraph) {
		for (ExtendedIterator<Statement> it = aModel.listStatements(); it.hasNext(); ) {
			TripleInjector.inject(it.next(), aGraph);
		}
	}
	
	public static NamedGraph inject(Model model) {
		final Resource aResource = new RDFResourceImpl() {
			@Override
			public Object getDelegate() { return null; }
			
			@Override
			public void addDelegate(Triple obj) {}
		};
		
		final NamedGraph aGraph = RDFFactory.eINSTANCE.createNamedGraph();
		aResource.getContents().add(aGraph);
		
		for (ExtendedIterator<Statement> it = model.listStatements(); it.hasNext(); ) {
			TripleInjector.inject(it.next(), aGraph);
		}
		
		return aGraph;
	}
}
