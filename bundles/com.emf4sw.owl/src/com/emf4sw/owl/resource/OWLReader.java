package com.emf4sw.owl.resource;

import java.io.InputStream;

abstract public interface OWLReader {

	void read(InputStream inStream, OWLResource resource, OWLFormats format);
	
}
