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

	private static final RDFFactory factory = RDFFactory.eINSTANCE;
	
	private DocumentGraphInjector() {}

	public static RDFGraph inject(Model aModel, RDFResource resource) {
		final DocumentGraph aGraph = factory.createDocumentGraph();
		resource.getContents().add(aGraph);
		
		for (StmtIterator it = aModel.listStatements(); it.hasNext(); ) {
			TripleInjector.inject(it.next(), aGraph);
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
