/*******************************************************************************
 * Copyright (c) 2011 Guillaume Hillairet.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Guillaume Hillairet - initial API and implementation
 *******************************************************************************/
package com.emf4sw.rdf.resource.impl;

import org.eclipse.emf.common.util.URI;

import com.emf4sw.rdf.resource.RDFResource;
import com.emf4sw.rdf.resource.RDFResource.RDFResourceFactory;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7
 */
public class RDFXMLResourceFactory implements RDFResourceFactory { 

	@Override
	public RDFResource createResource(URI uri) {
		return new RDFXMLResourceImpl(uri);
	}

}