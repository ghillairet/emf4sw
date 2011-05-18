package com.emf4sw.rdf.examples;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.SubjectNode;
import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.resource.impl.RDFXMLResourceFactory;
import com.emf4sw.rdf.resource.impl.TTLResourceFactory;
import com.emf4sw.rdf.vocabulary.RDF;

/**
 * RDF Example
 * 
 * How to read and write RDF files.
 * 
 * 
 * @author guillaume hillairet
 *
 */
public class ReadRdfFile {

	final static String foaf = "http://xmlns.com/foaf/0.1/";
	
	public static void main(String[] args) {
		// Register Factroy RDFXMLResourceFactory to read rdf/xml files
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("rdf", new RDFXMLResourceFactory());
		
		// Register Factroy TTLResourceFactory to read turtle files
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ttl", new TTLResourceFactory());
		
		// ResourceSet is used to create Resources
		ResourceSet resourceSet = new ResourceSetImpl();
		
		// This will create a resource that contains the RDF model corresponding to the file 
		Resource rdfxml = resourceSet.getResource(URI.createURI("src/foaf.rdf"), true);
		
		// The root element is a RDFGraph
		RDFGraph graph = (RDFGraph) rdfxml.getContents().get(0);
		
		// This will print all triples in the graph
		for (Triple triple: graph.getTriples()) {
			System.out.println(triple);
		}
		
		List<SubjectNode> nodes = 
			graph.listSubjectsWithPropertyValue(graph.getProperty(RDF.type), graph.getResource(foaf+"Person"));
		
		for (SubjectNode node: nodes) 
			System.out.println("found "+node);
		
		// Save the file in turtle
		Resource ttl = resourceSet.createResource(URI.createURI("src/foaf.ttl"));
		ttl.getContents().addAll(rdfxml.getContents());
		
		try {
			ttl.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
