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

import static com.atl.common.models.Models.atl;
import static com.atl.common.models.Models.ecore;
import static com.atl.common.models.Models.emptyModel;
import static com.atl.common.models.Models.inject;
import static com.atl.common.trans.Transformations.transform;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.engine.emfvm.ASM;
import org.eclipse.m2m.atl.engine.emfvm.ASMXMLReader;

import com.atl.common.models.resource.ATLResourceFactory;
import com.atl.common.trans.ATLModel2ASM;
import com.atl.common.trans.Transformation;
import com.atl.common.trans.Transformations;

/**
 * 
 * @author <a href=g.hillairet@gmail.com>guillaume hillairet</a>
 * @since 0.6.0
 */
public class RDF2ModelGen {

	private static final String lib_rdf_gen = "resources/RDFGenHelpers.asm";
	private static final String lib_rdf = "resources/RDFHelpers.asm";
	private static final String lib_ecore = "resources/EcoreHelpers.asm";

	private Resource resource;

	private final EPackage ePackage;
		
	private final EMFInjector injector = new EMFInjector();

	private ASM asm;
	
	public RDF2ModelGen(EPackage ePackage) {
		this.ePackage = ePackage;
	}
		
	public RDF2ModelGen(Resource resource) {
		this.ePackage = (EPackage) resource.getContents().get(0);
	}
	
	public Resource getResource() {
		if (resource == null) {
			final EMFModel model = transform(inject(ePackage.eResource(), ecore()), hot_rdf2model());
			
			if (model == null || model.getResource() == null) {
				throw new NullPointerException("Cannot create model transformation rdf2model.");
			}
			
			resource = model.getResource();
		}
		
		return resource;
	}
	
	public ASM getASM() {
		if (asm == null) {
			final EMFModel model = emptyModel(atl());
			injector.inject(model, getResource());
			asm = transform(model, new ATLModel2ASM());
		}
		return asm;
	}

	protected Transformation<EMFModel, EMFModel> hot_rdf2model() {
		return hot("resources/RDF2EcoreGen.asm"); 
	}
	
	protected Transformation<EMFModel, EMFModel> hot(String... asm) {
		return 
			new Transformations.Builder()
			.asm(getASMS(asm))
			.lib("RDFHelpers", loadASM(lib_rdf))
			.lib("RDFGenHelpers", loadASM(lib_rdf_gen))
			.lib("EcoreHelpers", loadASM(lib_ecore))
			.in(ecore(), "IN", "Model")
			.out(atl(), "OUT", "ATL", new ATLResourceFactory())
			.buildOneInOneOut();
	}
	
	protected ASM loadASM(String location) {
		return new ASMXMLReader().read(getClass().getResourceAsStream(location));
	}
	
	private ASM[] getASMS(String... asm) {
		ASM[] asms = new ASM[asm.length];
		for (int i=0;i<asm.length;i++) {
			asms[i] = loadASM(asm[i]);
		}
		return asms;
	}
}
