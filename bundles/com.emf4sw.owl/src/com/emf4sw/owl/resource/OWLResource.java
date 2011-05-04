package com.emf4sw.owl.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import com.emf4sw.owl.Ontology;

public interface OWLResource extends Resource {
	
	Ontology getOntology();
	
	Ontology createOntology(URI uri);
	
}
