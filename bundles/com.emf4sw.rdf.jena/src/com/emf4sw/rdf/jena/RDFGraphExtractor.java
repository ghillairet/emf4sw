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
import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.Namespace;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.vocabulary.RDF;
import com.emf4sw.rdf.vocabulary.RDFS;
import com.emf4sw.rdf.vocabulary.XSD;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.vocabulary.OWL;

public class RDFGraphExtractor {
	
	public static Model extract(RDFGraph graph) {
		return extract(graph, ModelFactory.createDefaultModel());
	}
	
	public static Model extract(RDFGraph graph, Model model) {
		if (graph instanceof DocumentGraph) {
			return doExtractDocument((DocumentGraph)graph, model);
		} else {
			return doExtractGraph((NamedGraph)graph, model);
		}
	}

	private static Model doExtractGraph(NamedGraph graph, Model model) {
		for(com.emf4sw.rdf.Triple triple : graph.getTriples()) 
		{
			Statement stmt = TripleExtractor.extract( triple, model );
			if (stmt != null) 
			{
				model.add(stmt);
			}
		}
		return model;
	}

	private static Model doExtractDocument(DocumentGraph graph, Model model)
	{
		for(Namespace namespace: graph.getNamespaces()) {
			model.setNsPrefix(namespace.getPrefix(), namespace.getURI());
		}
		model.setNsPrefix("rdf", RDF.NS);
		model.setNsPrefix("rdfs", RDFS.NS);
		model.setNsPrefix("owl", OWL.NS);
		model.setNsPrefix("xsd", XSD.NS);
		for(com.emf4sw.rdf.Triple triple : graph.listAllTriples()) {
			if (!(triple.getSubject() instanceof NamedGraph)) {
				Statement stmt = TripleExtractor.extract( triple, model );
				if (stmt != null) {
					model.add(stmt);
				}
			}
		}
		return model;
	}

	
}
