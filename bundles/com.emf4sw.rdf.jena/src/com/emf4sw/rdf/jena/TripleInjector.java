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

import com.emf4sw.rdf.BlankNode;
import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.RDFGraph;
import com.hp.hpl.jena.rdf.model.AnonId;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.RDFVisitor;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Statement;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class TripleInjector {
	
	private static final RDFFactory factory = RDFFactory.eINSTANCE;
	
	private TripleInjector() {}
	
	public static com.emf4sw.rdf.Triple inject(Statement stmt, RDFGraph graph) {
		final NodeVisitorInjector visitor = new NodeVisitorInjector(graph);
		
		final com.emf4sw.rdf.Node subject = (Node) stmt.getSubject().visitWith(visitor);
		final com.emf4sw.rdf.Property predicate = inject(stmt.getPredicate(), graph);
		final com.emf4sw.rdf.Node object = (com.emf4sw.rdf.Node) stmt.getObject().visitWith(visitor);

		return graph.addTriple(subject, predicate, object);
	}

	protected static com.emf4sw.rdf.Property inject(Property predicate, RDFGraph graph) {
		if (predicate.getURI() == null) {
			return null;
		}
		
		com.emf4sw.rdf.Property ret = graph.getProperty( predicate.getURI() );
		if (ret == null) {
			ret = factory.createProperty();
			ret.setURI( predicate.getURI() );
			graph.getProperties().add(ret);
		}
		
		return ret;
	}
	
	/**
	 * Implements {@link RDFVisitor}
	 * 
	 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
	 *
	 */
	public static class NodeVisitorInjector implements RDFVisitor {

		private final RDFGraph graph;
		
		NodeVisitorInjector(RDFGraph graph) {
			this.graph = graph;
		}

		@Override
		public Object visitBlank(Resource node, AnonId arg1) {
			final BlankNode ret = factory.createBlankNode();
			ret.setNodeID( arg1.toString() );
			graph.getBlankNodes().add(ret);
			
			return ret;
		}

		@Override
		public Object visitLiteral(Literal literal) {
			final com.emf4sw.rdf.Literal ret = factory.createLiteral();
			ret.setLexicalForm(literal.getLexicalForm());
			ret.setLang(literal.getLanguage());
			
			if (literal.getDatatypeURI() != null) {
				ret.setDatatype(graph.getDatatype(literal.getDatatypeURI()));
			}
			graph.getLiterals().add(ret);
			
			return ret;
		}

		@Override
		public Object visitURI(Resource resource, String arg1) {
			if (resource.getURI() == null) {
				return null;
			}
			
			com.emf4sw.rdf.Resource ret = graph.getResource(resource.getURI());
			if (ret == null) {
				ret = factory.createResource();
				ret.setURI( resource.getURI() );
				graph.getResources().add( ret );
			}
			return ret;
		}
		
	}
}
