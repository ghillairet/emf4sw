package com.emf4sw.rdf.examples;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.atl.common.models.Models;
import com.emf4sw.rdf.resource.RDFFormats;
import com.emf4sw.rdf.resource.impl.TTLResourceFactory;
import com.emf4sw.rdf.transform.Model2RDF;
import com.emf4sw.rdf.transform.RDFTransformation;

/**
 * 
 * 
 * @author guillaume hillairet
 *
 */
public class EcoreModelInRdf {

	public static void main(String[] args) {
		// Register Factroy XMIResourceFactoryImpl to read ecore, xmi files
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		
		// Register Factroy TTLResourceFactory to read turtle files
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ttl", new TTLResourceFactory());
		
		// Here we use Models class from atl-commons to register models in a ResourceSet		
		Models.register(Models.resource("src/person.ecore", true));
		
		Map<String, Object> options = new HashMap<String, Object>();
		options.put(RDFTransformation.OPTION_RDF_FORMAT, RDFFormats.TURTLE_FORMAT);
		
		Model2RDF model2rdf = new Model2RDF();
		Resource rdfResult = model2rdf.transform(Models.resource("src/model.person.xmi", true), options);
		
		
		rdfResult.setURI(URI.createURI("src/person.model.ttl"));
		try {
			rdfResult.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
