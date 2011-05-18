package com.emf4sw.owl.examples;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.emf4sw.owl.OWLClass;
import com.emf4sw.owl.Ontology;
import com.emf4sw.owl.resource.impl.OWLXMLResourceFactory;

/**
 * OWL Example
 * 
 * This example shows how to load an OWL model from an OWL/XML file.
 * 
 * @author guillaume hillairet
 *
 */
public class ReadOwlFile {
	public static void main(String[] args) throws IOException {
		// Register the OWLXMLResourceFactory to load OWL/XML files
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("owl", new OWLXMLResourceFactory());
		
		ResourceSet resourceSet = new ResourceSetImpl();
		
		Resource onto = resourceSet.createResource(URI.createURI("src/software.owl"));
		onto.load(null);
		
		Ontology ontology = (Ontology) onto.getContents().get(0);
		
		for (OWLClass oClass: ontology.getClasses()) {
			System.out.println(oClass.getLocalName()+" is "+oClass.getLabel());
		}
	}
}
