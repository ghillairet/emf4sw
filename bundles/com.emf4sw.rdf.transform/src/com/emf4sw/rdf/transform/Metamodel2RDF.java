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
package com.emf4sw.rdf.transform;

import static com.atl.common.models.Models.get;
import static com.atl.common.models.Models.inject;
import static com.atl.common.utils.Preconditions.checkArgument;
import static com.atl.common.utils.Preconditions.checkNotNull;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;

import com.atl.common.models.Models;
import com.atl.common.trans.Transformations;
import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.resource.RDFFormats;

/**
 * 
 * 
 * @author <a href=g.hillairet@gmail.com>guillaume hillairet</a>
 * @since 0.7.0
 */
public class Metamodel2RDF extends RDFTransformation {
	
	private static final String asm = "resources/Metamodel2RDF.asm";
	
	public Metamodel2RDF() {
		super();
	}
	
	public Resource transform(Resource resource, Map<String, Object> options) {
		checkNotNull(resource);
		checkArgument(!resource.getContents().isEmpty());
		
		if (options == null) {
			options = new HashMap<String, Object>();
		}
		
		final RDFFormats format = options.containsKey(OPTION_RDF_FORMAT) ? 
				(RDFFormats) options.get(OPTION_RDF_FORMAT) : 
					RDFFormats.RDF_XML_FORMAT;
		
		checkFactoryIsRegistered(format);
		
		return Transformations.transform( inject(resource, Models.ecore() ),
				new Transformations.Builder()
				.asm(loadASM(super_asm), loadASM(asm))
				.lib("RDFHelpers", loadASM(lib_rdf))
				.options(atloptions())
				.in(Models.ecore(), "IN", "Model")
				.out(get(RDFPackage.eNS_URI), "OUT", "RDF", RDFFormats.factory(format))
				.buildOneInOneOut()).getResource();
	}
		
}
