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
import static com.atl.common.models.Models.setOf;
import static com.atl.common.utils.Preconditions.checkArgument;
import static com.atl.common.utils.Preconditions.checkNotNull;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.emf.EMFModel;

import com.atl.common.models.Models;
import com.atl.common.models.Properties;
import com.atl.common.trans.MultiInOneOutTransformation;
import com.atl.common.trans.Transformations;
import com.emf4sw.rdf.RDFPackage;

/**
 * 
 * @author <a href=g.hillairet@gmail.com>guillaume hillairet</a>
 * @since 0.6.0
 */
public class RDF2Model extends RDFTransformation {

	private final RDF2ModelGen generator;

	protected static final String rdf2model_asm = "resources/RDF2Model.asm";
	
	private EPackage ePackage;

	public RDF2Model(EPackage ePackage) {
		super();
		this.ePackage = ePackage;
		this.generator = new RDF2ModelGen(ePackage);
	}

	public RDF2Model(Resource resource) {
		super();
		this.ePackage = (EPackage) resource.getContents().get(0);
		this.generator = new RDF2ModelGen(ePackage);
	}

	public Resource transform(Resource resource, Map<String, Object> options) {
		checkNotNull(resource);
		checkArgument(!resource.getContents().isEmpty());
		
		final Map<String, Object> copyOptions = (options == null) ? 
				new HashMap<String, Object>() : 
					new HashMap<String, Object>(options);
		
		final Properties<String, Object> properties = Properties.createProperties(copyOptions);		
		final EMFModel propertiesModel = inject(properties.serialize(), Properties.getReferenceModel());
		
		return Transformations.transform( 
				setOf(
						inject(resource, get(RDFPackage.eNS_URI)), 
						propertiesModel, 
						inject(ePackage.eResource(), Models.ecore())
				), 
				transformation()).getResource();
	}
	
	public Resource transform(Resource resource) {
		return transform(resource, new HashMap<String, Object>());
	}
	
	private MultiInOneOutTransformation transformation() {
		return new Transformations.Builder()
			.asm(loadASM(rdf2model_asm), generator.getASM())
			.lib("EcoreHelpers", loadASM(lib_ecore))
			.lib("PropertiesHelpers", Properties.getHelpers())
			.options(atloptions())
			.in(get(RDFPackage.eNS_URI), "IN", "RDF")
			.in(Properties.getReferenceModel(), "IN2", "Properties")
			.in(Models.ecore(), "IN3", "Ecore")
			.out(get(ePackage.getNsURI()), "OUT", "Model")
			.buildMultiInOneOut();
	}

}
