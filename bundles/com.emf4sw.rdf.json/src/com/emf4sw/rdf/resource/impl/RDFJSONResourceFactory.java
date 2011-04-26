package com.emf4sw.rdf.resource.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class RDFJSONResourceFactory extends ResourceFactoryImpl {

	@Override
	public Resource createResource(URI uri) {
		return new RDFJSONResourceImpl(uri);
	}
}
