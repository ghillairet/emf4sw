package com.emf4sw.rdf.resource.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.5
 */
public class RDFXMLResourceFactory implements Resource.Factory {

	@Override
	public Resource createResource(URI uri) {
		return new RDFXMLResource(uri);
	}

}
