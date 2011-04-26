/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emf4sw.rdf.jena;

import com.emf4sw.rdf.DocumentGraph;
import com.emf4sw.rdf.Namespace;
import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.resource.RDFResource;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.StmtIterator;

/**
 * {@link DocumentGraphInjector}
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class DocumentGraphInjector {

	private final Model aModel;

	private final TripleInjector aTripleInjector;

	private final RDFFactory factory = RDFFactory.eINSTANCE;
	
	public DocumentGraphInjector(Model aModel) {
		this.aModel = aModel;
		this.aTripleInjector = new TripleInjector();
	}

	public RDFGraph inject(RDFResource resource) {
		final DocumentGraph aGraph = factory.createDocumentGraph();
		resource.getContents().add(aGraph);
		
		for (StmtIterator it = aModel.listStatements(); it.hasNext(); ) {
			aTripleInjector.inject(it.next(), aGraph);
		}
		for (String namespace: aModel.getNsPrefixMap().keySet()) {
			final Namespace ns = factory.createNamespace();
			ns.setPrefix( namespace );
			ns.setURI( aModel.getNsPrefixMap().get( namespace ) );
			ns.setGraph(aGraph);
		}
		
		return aGraph;
	}

}
