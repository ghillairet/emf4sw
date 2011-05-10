package com.emf4sw.rdf.examples;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.atl.common.models.Models;
import com.emf4sw.rdf.resource.impl.TTLResourceFactory;
import com.emf4sw.rdf.transform.RDF2Model;

public class Rdf2EcoreModelWithAnnotations {
	public static void main(String[] args) {
		// Register Factroy XMIResourceFactoryImpl to read ecore, xmi files
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		
		// Register Factroy TTLResourceFactory to read turtle files
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ttl", new TTLResourceFactory());
		
		// Here we use Models class from atl-commons to register models in a ResourceSet		
		Models.register(Models.resource("src/person2.ecore", true));
		
		RDF2Model r2m = new RDF2Model(Models.resource("src/person2.ecore", true));
		Resource model = r2m.transform(Models.resource("src/person2.model.ttl", true));
		
		model.setURI(URI.createURI("src/person2.ttl.xmi"));
		try {
			model.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
