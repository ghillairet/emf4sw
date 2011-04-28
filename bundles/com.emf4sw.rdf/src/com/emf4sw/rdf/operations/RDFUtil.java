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
package com.emf4sw.rdf.operations;

import com.emf4sw.rdf.Datatype;
import com.emf4sw.rdf.Literal;
import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.Property;
import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.Resource;
import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.TripleNode;
import com.emf4sw.rdf.util.RDFSwitch;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.0
 */
public class RDFUtil {

	public static void copyTriple(Triple triple, RDFGraph aGraph) {
		aGraph.addTriple(
				copyNode( triple.getSubject(), aGraph ), 
				(Property) copyNode(triple.getPredicate(), aGraph),
				copyNode( triple.getObject(), aGraph ));
	}

	public static Node copyNode(Node node, RDFGraph aGraph) {
		return new RDFCopy(aGraph).doSwitch(node);
	}

	private static final class RDFCopy extends RDFSwitch<Node> {

		private RDFGraph aGraph;

		public RDFCopy(RDFGraph aGraph) {
			this.aGraph = aGraph;
		}
		
		@Override
		public Node caseTripleNode(TripleNode object) {		
			return super.caseTripleNode(object);
		}
		
		@Override
		public Node caseResource(Resource object) {
			return aGraph.getResource( object.getURI() );
		}
		
		@Override
		public Node caseProperty(Property object) {
			return aGraph.getProperty( object.getURI() );
		}
		
		@Override
		public Node caseDatatype(Datatype object) {
			return aGraph.getDatatype( object.getURI() );
		}
		
		@Override
		public Node caseNamedGraph(NamedGraph object) {
			final NamedGraph aSubGraph = RDFFactory.eINSTANCE.createNamedGraph();
			aSubGraph.setURI( object.getURI() );
			aSubGraph.add( object );
			
			return aSubGraph;
		}
		
		@Override
		public Node caseLiteral(Literal object) {
			final Literal aLiteral = RDFFactory.eINSTANCE.createLiteral();
			aLiteral.setLexicalForm( object.getLexicalForm() );
			if (object.getDatatype() != null) {
				aLiteral.setDatatype( aGraph.getDatatype(object.getDatatype().getURI()) );
			}
			if (object.getLang() != null && !object.getLang().trim().isEmpty()) {
				aLiteral.setLang( object.getLang() );
			}
			aGraph.getLiterals().add( aLiteral );
			
			return aLiteral;
		}
	}
}
