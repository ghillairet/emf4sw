package com.emf4sw.rdf.resource.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import com.emf4sw.rdf.resource.RDFResource.RDFResourceFactory;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7
 */
public class TTLResourceFactory implements RDFResourceFactory {
	
	@Override
	public Resource createResource(URI uri) {
		return new TTLResourceImpl(uri);
	}

}