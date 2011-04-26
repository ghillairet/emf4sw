/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
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

	private final RDFGraph graph;

	private final static ValueFactory sesameFactory = new ValueFactoryImpl();

	public RDFGraph2SesameGraph(RDFGraph graph) {
		this.graph = graph;
	}

	public void to(Graph sesameGraph) {
		for (Triple triple: graph.getTriples()) 
		{
			Statement aStatement = extractAsSesameStatement( triple );
			if (aStatement != null) 
			{
				sesameGraph.add( aStatement );
			}
		}
	}

	public Graph extract() {
		final Graph aGraph = new GraphImpl();
	
		for (Triple triple: graph.getTriples()) 
		{
			Statement aStatement = extractAsSesameStatement( triple );
			if (aStatement != null)
			{
				aGraph.add( aStatement );
			}
		}
		
		return aGraph;
	}
	
	public static Statement extractAsSesameStatement(Triple triple) {
		final org.openrdf.model.Resource aResource = asSesameResource( triple.getSubject() );
		final URI aURI = asSesameURI( triple.getPredicate() );
		final Value aValue = asSesameValue( triple.getObject());
		
		return aResource != null && aURI != null && aValue != null ?
				sesameFactory.createStatement(aResource, aURI, aValue) :
				null;
	}

	private static URI asSesameURI(URIElement predicate) {
		return new URIImpl(predicate.getURI());
	}

	private static org.openrdf.model.Resource asSesameResource(Node aNode) {
		org.openrdf.model.Resource aResource = null;
		
		if (aNode instanceof Resource || 
				aNode instanceof NamedGraph || 
					aNode instanceof TripleNode) {
			aResource = asSesameResource((URIElement)aNode);
		}
		
		return aResource;
	}
	
	private static org.openrdf.model.Resource asSesameResource(URIElement aNode) {	
		return sesameFactory.createURI( aNode.getURI() );
	}

	private static Value asSesameValue(Node aNode) {
		Value value = null;
		if (aNode instanceof Resource || 
				aNode instanceof NamedGraph || 
					aNode instanceof TripleNode) 
		{
			value = asSesameResource((URIElement)aNode);
		}
		else if (aNode instanceof BlankNode) 
		{
			value = sesameFactory.createBNode();
		}
		else if (aNode instanceof Literal)
		{
			Literal aLiteral = (Literal) aNode;
			if (aLiteral.getLang() != null && !aLiteral.getLang().trim().isEmpty()) 
			{
				value = sesameFactory.createLiteral(aLiteral.getLexicalForm(), aLiteral.getLang());
			} 
			else if (aLiteral.getDatatype() != null) 
			{
				value = sesameFactory.createLiteral(aLiteral.getLexicalForm(), 
						sesameFactory.createURI(aLiteral.getDatatype().getURI()));
			}
			else 
			{
				value = sesameFactory.createLiteral(aLiteral.getLexicalForm());
			}
		}
		return value;
	}

}
