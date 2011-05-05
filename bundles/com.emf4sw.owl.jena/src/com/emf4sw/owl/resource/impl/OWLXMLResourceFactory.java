package com.emf4sw.owl.resource.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;

/**
 * {@link OWLXMLResourceFactory}
 * 
 * <p>
 * A factory for creating owl documents in rdf/xml format.
 * </p>
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class OWLXMLResourceFactory implements Factory {

	@Override
	public Resource createResource(URI uri) {
		return new OWLXMLResource(uri);
	}

}