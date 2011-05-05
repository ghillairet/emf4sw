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
package com.emf4sw.rdf.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.JsonNodeFactory;
import org.codehaus.jackson.node.ObjectNode;

import com.emf4sw.rdf.BlankNode;
import com.emf4sw.rdf.DocumentGraph;
import com.emf4sw.rdf.Literal;
import com.emf4sw.rdf.Namespace;
import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.Property;
import com.emf4sw.rdf.SubjectNode;
import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.URIElement;
import com.emf4sw.rdf.util.RDFSwitch;

/**
 * 
 * @author ehilgui
 *
 */
public class RDFGraph2Json {

	public static ObjectNode createJsonTree(DocumentGraph graph) {
		final ObjectMapper mapper = new ObjectMapper();
		final RDF2JsonSwitch switcher = new RDF2JsonSwitch();
		final ObjectNode root = mapper.createObjectNode();
		
		for (Namespace ns: graph.getNamespaces()) {
			final ObjectNode node = mapper.createObjectNode();
			final ObjectNode nodeP = mapper.createObjectNode();
			nodeP.put(ns.getPrefix(), ns.getURI());
			node.put("@prefix", nodeP);
			root.putAll(node);
		}
		
		for (SubjectNode n: graph.listSubjects()) {
			final ObjectNode node = mapper.createObjectNode();
			final ObjectNode a = mapper.createObjectNode();
			
			final Map<Property, List<Node>> valuesByProperty = new HashMap<Property, List<Node>>();
			for (Triple tr: n.getSubjectOf()) {
				if (valuesByProperty.containsKey(tr.getPredicate())) {
					valuesByProperty.get(tr.getPredicate()).add(tr.getObject());
				} else {
					final List<Node> list = new ArrayList<Node>();
					list.add(tr.getObject());
					valuesByProperty.put(tr.getPredicate(), list);
				}
			}
			
			for (Property p: valuesByProperty.keySet()) {
				ObjectNode n2 = mapper.createObjectNode();
				if (valuesByProperty.get(p).size() > 1) {
					ArrayNode an = mapper.createArrayNode();
					for (Node nn: valuesByProperty.get(p)) {
						an.add(switcher.doSwitch(nn));
					}
					n2.put(p.getLocalName(), an);
				} else {
					n2.put(p.getLocalName(), switcher.doSwitch(valuesByProperty.get(p).get(0)));
				}
				a.putAll(n2);
			}
			
			node.put(((URIElement) n).getURI(), a);
			root.putAll(node);
		}
		
		return root;
	}
	
	static class RDF2JsonSwitch extends RDFSwitch<JsonNode> {
		@Override
		public JsonNode caseLiteral(Literal object) {
			return JsonNodeFactory.instance.textNode(object.getLexicalForm());
		}
		@Override
		public JsonNode caseBlankNode(BlankNode object) {
			return JsonNodeFactory.instance.arrayNode();
		}
		@Override
		public JsonNode caseURIElement(URIElement object) {
			return JsonNodeFactory.instance.textNode("<" + object.getURI() + ">");
		}
	}
	
}
