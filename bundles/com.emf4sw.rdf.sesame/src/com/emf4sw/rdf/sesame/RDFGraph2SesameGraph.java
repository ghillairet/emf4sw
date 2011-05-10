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
package com.emf4sw.rdf.sesame;

import org.openrdf.model.Graph;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.GraphImpl;
import org.openrdf.model.impl.URIImpl;
import org.openrdf.model.impl.ValueFactoryImpl;

import com.emf4sw.rdf.BlankNode;
import com.emf4sw.rdf.Literal;
import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.Resource;
import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.TripleNode;
import com.emf4sw.rdf.URIElement;

/**
 * {@link RDFGraph2SesameGraph}
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class RDFGraph2SesameGraph {

	private RDFGraph2SesameGraph() {}

	public static void extract(RDFGraph graph, Graph sesameGraph, String namedGraph) {
		final ValueFactory valueFactory = new ValueFactoryImpl();
		for (Triple triple: graph.getTriples()) 
		{
			Statement aStatement = extractAsSesameStatement(triple, namedGraph, valueFactory);
			if (aStatement != null) 
			{
				sesameGraph.add( aStatement );
			}
		}
	}

	public static Graph extract(Iterable<Triple> triples, String namedGraphURI, ValueFactory valueFactory) {
		final Graph aGraph = new GraphImpl();
		for (Triple triple: triples) 
		{
			Statement aStatement = extractAsSesameStatement(triple, namedGraphURI, valueFactory);
			if (aStatement != null) 
			{
				aGraph.add( aStatement );
			}
		}
		return aGraph;
	}

	public static Graph extract(RDFGraph graph) {
		return extract(graph, null);
	}
	
	public static Graph extract(RDFGraph graph, String namedGraph) {
		final Graph aGraph = new GraphImpl();
		final ValueFactory valueFactory = new ValueFactoryImpl();
		
		for (Triple triple: graph.getTriples()) 
		{
			Statement aStatement = extractAsSesameStatement(triple, namedGraph, valueFactory);
			if (aStatement != null)
			{
				aGraph.add( aStatement );
			}
		}
		
		return aGraph;
	}
	
	public static Graph extract(Iterable<Triple> triples) {
		return extract(triples, null);
	}
	
	public static Graph extract(Iterable<Triple> triples, String namedGraph) {
		final Graph aGraph = new GraphImpl();
		final ValueFactory valueFactory = new ValueFactoryImpl();
		
		for (Triple triple: triples) 
		{
			Statement aStatement = extractAsSesameStatement(triple, namedGraph, valueFactory);
			if (aStatement != null)
			{
				aGraph.add( aStatement );
			}
		}
		
		return aGraph;
	}
	
	public static Statement extractAsSesameStatement(Triple triple, String namedGraph, ValueFactory valueFactory) {
		final org.openrdf.model.Resource aResource = asSesameResource( triple.getSubject(), valueFactory );
		final URI aURI = asSesameURI( triple.getPredicate() );
		final Value aValue = asSesameValue( triple.getObject(), valueFactory);
		
		return (aResource != null && aURI != null && aValue != null) ?
				(namedGraph == null) ?
						valueFactory.createStatement(aResource, aURI, aValue) :
							valueFactory.createStatement(aResource, aURI, aValue, valueFactory.createURI(namedGraph))
					:
				null;
	}

	private static URI asSesameURI(URIElement predicate) {
		return new URIImpl(predicate.getURI());
	}

	private static org.openrdf.model.Resource asSesameResource(Node aNode, ValueFactory valueFactory) {
		org.openrdf.model.Resource aResource = null;
		
		if (aNode instanceof Resource || 
				aNode instanceof NamedGraph || 
					aNode instanceof TripleNode) {
			aResource = asSesameResource((URIElement)aNode, valueFactory);
		}
		
		return aResource;
	}
	
	private static org.openrdf.model.Resource asSesameResource(URIElement aNode, ValueFactory valueFactory) {	
		return valueFactory.createURI( aNode.getURI() );
	}

	private static Value asSesameValue(Node aNode, ValueFactory valueFactory) {
		Value value = null;
		if (aNode instanceof Resource || 
				aNode instanceof NamedGraph || 
					aNode instanceof TripleNode) 
		{
			value = asSesameResource((URIElement)aNode, valueFactory);
		}
		else if (aNode instanceof BlankNode) 
		{
			value = valueFactory.createBNode();
		}
		else if (aNode instanceof Literal)
		{
			Literal aLiteral = (Literal) aNode;
			if (aLiteral.getLang() != null && !aLiteral.getLang().trim().isEmpty()) 
			{
				value = valueFactory.createLiteral(aLiteral.getLexicalForm(), aLiteral.getLang());
			} 
			else if (aLiteral.getDatatype() != null) 
			{
				value = valueFactory.createLiteral(aLiteral.getLexicalForm(), 
						valueFactory.createURI(aLiteral.getDatatype().getURI()));
			}
			else 
			{
				value = valueFactory.createLiteral(aLiteral.getLexicalForm());
			}
		}
		return value;
	}


}
