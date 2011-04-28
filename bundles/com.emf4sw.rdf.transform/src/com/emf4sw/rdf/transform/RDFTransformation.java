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

import static com.atl.common.models.Models.register;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.m2m.atl.engine.emfvm.ASM;
import org.eclipse.m2m.atl.engine.emfvm.ASMXMLReader;
import org.eclipse.m2m.atl.engine.emfvm.lib.LibExtension;

import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.resource.RDFFormats;
import com.emf4sw.rdf.transform.lib.ETripleLibExtension;

/**
 * 
 * 
 * @author <a href=g.hillairet@gmail.com>guillaume hillairet</a>
 * @since 0.7.0
 */
public abstract class RDFTransformation {
	
	protected RDFTransformation() {
		register( RDFPackage.eINSTANCE );
	}
	
	/*
	 * ATL Files
	 */
	protected static final String super_asm = "resources/RDF.asm";
	protected static final String lib_rdf = "resources/RDFHelpers.asm";
	protected static final String lib_ecore = "resources/EcoreHelpers.asm";
	
	/**
	 * @see RDFFormats
	 */
	public static final String OPTION_RDF_FORMAT = "OPTION_RDF_FORMAT";
	
	/**
	 * This option is used to set the objects base namespace. Use this when a model contains classes that do 
	 * not make use of the @Id annotation.
	 */
	public static final String OPTION_BASE_NAMESPACE = "OPTION_BASE_NAMESPACE";
	
	/**
	 * If true, the whole type hierarchy of an object will be represented in RDF. 
	 * This option takes a Boolean parameter. 
	 */
	public static final String OPTION_DIRECT_TYPE_ONLY = "OPTION_DIRECT_TYPE_ONLY";
	
	/**
	 * If true, the transformer will not add a special property to the object that declares 
	 * the direct type of the object.
	 */
	public static final String OPTION_NO_ECORE_TYPE = "OPTION_NO_ECORE_TYPE";
	
	protected EPackage registerAndGetPackage(Resource resource) {
		final EPackage ePackage = resource.getContents().get(0).eClass().getEPackage();
		register(ePackage);
		
		return ePackage;
	}
	
	protected Map<String, Object> atloptions() {
		final List<LibExtension> list = new ArrayList<LibExtension>();
		list.add(new ETripleLibExtension());
		
		final Map<String, Object> atloptions = new HashMap<String, Object>();
		atloptions.put("extensionObjects", list);
		
		return atloptions;
	}
	
	protected ASM loadASM(String location) {
		return new ASMXMLReader().read(this.getClass().getResourceAsStream(location));
	}
		
	protected static void checkFactoryIsRegistered(RDFFormats format) {
		if (!Registry.INSTANCE.getExtensionToFactoryMap().containsKey(format.extension())) {
			Registry.INSTANCE.getExtensionToFactoryMap().put(format.extension(), RDFFormats.factory(format));
		}
	}
}
