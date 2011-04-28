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

import java.util.Iterator;

import org.openrdf.model.BNode;
import org.openrdf.model.Graph;
import org.openrdf.model.Literal;
import org.openrdf.model.Resource;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.rio.helpers.StatementCollector;

import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.Property;
import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.RDFGraph;

/**
 * {@link SesameGraph2RDFGraph}
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class SesameGraph2RDFGraph {
	
	public SesameGraph2RDFGraph() {
	}
	
	public void to(final Graph graph, final RDFGraph aGraph) {
		for (Iterator<Statement> stmtIt = graph.iterator(); stmtIt.hasNext();) {
			Statement stmt = stmtIt.next();
			
			aGraph.addTriple(
					asResource( stmt.getSubject(), aGraph ),
					asProperty( stmt.getPredicate(), aGraph ),
					asNode( stmt.getObject(), aGraph ) );
		}
	}
	
	public void to(final StatementCollector source, final RDFGraph aGraph) {
		for (Statement stmt: source.getStatements()) {
			aGraph.addTriple(
					asResource( stmt.getSubject(), aGraph ),
					asProperty( stmt.getPredicate(), aGraph ),
					asNode( stmt.getObject(), aGraph ) );
		}
	}
	
	private Property asProperty(URI aURI, RDFGraph aGraph) {
		return aGraph.getProperty( aURI.toString() );
	}

	private Node asNode(Value object, RDFGraph aGraph) {
		Node aNode = null;
		if (object instanceof Literal) 
		{
			aNode = RDFFactory.eINSTANCE.createLiteral();
			((com.emf4sw.rdf.Literal)aNode).setLexicalForm( ((Literal)object).getLabel() );
			
			if (((Literal)object).getLanguage() != null) 
			{
				((com.emf4sw.rdf.Literal)aNode).setLang(((Literal)object).getLanguage());
			}
			if (((Literal)object).getDatatype() != null) 
			{
				((com.emf4sw.rdf.Literal)aNode).setDatatype(aGraph.getDatatype( ((Literal)object).getDatatype().stringValue() ));
			}
		} 
		else if (object instanceof BNode) 
		{
			aNode = RDFFactory.eINSTANCE.createBlankNode();
		}
		else if (object instanceof URI)
		{
			aNode = aGraph.getResource( ((URI)object).toString() );
		} 
		return aNode;
	}

	private com.emf4sw.rdf.Resource asResource(Resource aResource, RDFGraph aGraph) {
		return aGraph.getResource( aResource.stringValue() );
	}
}
