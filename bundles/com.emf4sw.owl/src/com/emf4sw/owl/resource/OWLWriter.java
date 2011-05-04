package com.emf4sw.owl.resource;


abstract public interface OWLWriter {
	
	Object write(OWLResource resource, OWLFormats format);
	
}
