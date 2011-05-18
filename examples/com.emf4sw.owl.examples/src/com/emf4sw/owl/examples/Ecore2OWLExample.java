package com.emf4sw.owl.examples;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.emf4sw.owl.resource.OWLFormats;
import com.emf4sw.owl.resource.impl.OWLXMLResourceFactory;
import com.emf4sw.owl.resource.impl.TTLResourceFactory;
import com.emf4sw.owl.transform.ecore2owl.Ecore2OWL;

/**
 * OWL Example
 * 
 * This example shows how to convert a Ecore Model into an OWL Model, and how to save this latter 
 * in OWL/XML and Turtle. 
 * 
 * @author guillaume hillairet
 *
 */
public class Ecore2OWLExample {
	
	public static void main(String[] args) throws IOException {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("owl", new OWLXMLResourceFactory());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ttl", new TTLResourceFactory());
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		
		ResourceSet resourceSet = new ResourceSetImpl();
		
		Resource meta = resourceSet.createResource(URI.createURI("src/person2.ecore"));
		meta.load(null);
		
		Resource owl = new Ecore2OWL(OWLFormats.XMI).apply(meta);
		owl.setURI(URI.createURI("src/person.owl.xmi"));
		owl.save(null);
		
		Resource owlxml = new Ecore2OWL(OWLFormats.OWL).apply(meta);
		owlxml.setURI(URI.createURI("src/person.owl"));
		owlxml.save(null);
		
		Resource owlttl = new Ecore2OWL(OWLFormats.TURTLE).apply(meta);
		owlttl.setURI(URI.createURI("src/person.ttl"));
		owlttl.save(null);
	}
	
}
