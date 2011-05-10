package com.emf4sw.rdf.examples;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import com.atl.common.models.Models;
import com.emf4sw.rdf.transform.RDF2ModelGen;

public class GenerateRdf2Model {
	public static void main(String[] args) {
		
		RDF2ModelGen generator = new RDF2ModelGen(Models.resource("src/person2.ecore", true));
		Resource atl = generator.getResource();
		
		atl.setURI(URI.createURI("src/rdf2person.atl"));
		try {
			atl.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
