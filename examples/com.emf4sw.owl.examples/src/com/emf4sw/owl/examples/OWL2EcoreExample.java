package com.emf4sw.owl.examples;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.emf4sw.owl.resource.impl.TTLResourceFactory;
import com.emf4sw.owl.transform.owl2ecore.OWL2Ecore;

/**
 * OWL Example
 * 
 * This example shows how to transform an OWL Ontology into an Ecore Model.
 * 
 * @author guillaume hillairet
 *
 */
public class OWL2EcoreExample {
	public static void main(String[] args) throws IOException {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ttl", new TTLResourceFactory());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource owl = resourceSet.createResource(URI.createURI("src/person.ttl"));
		owl.load(null);
		
		Resource model = new OWL2Ecore().apply(owl);
		
		model.setURI(URI.createURI("src/person.owl.ecore"));
		model.save(null);
	}
}
