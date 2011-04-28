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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

import com.emf4sw.rdf.DocumentGraph;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.json.RDFGraph2Json;

/**
 * 
 * @author ehilgui
 *
 */
public class RDFJSONResourceImpl extends ResourceImpl {

	public RDFJSONResourceImpl() {
		super();
	}
	
	public RDFJSONResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		// TODO Auto-generated method stub
		super.doLoad(inputStream, options);
	}
	
	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
		if (!getContents().isEmpty()) {
			if (getContents().get(0) instanceof RDFGraph) {
				ObjectMapper mapper = new ObjectMapper();
				mapper.configure(SerializationConfig.Feature.INDENT_OUTPUT, true);
				JsonNode root = RDFGraph2Json.createJsonTree((DocumentGraph) getContents().get(0));
				
				mapper.writeValue(outputStream, root);
			}
		}
	}
}
