/**
 * 
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 */
package com.emf4sw.owl.transform.owl2ecore;

import static com.atl.common.models.Models.register;
import static com.atl.common.trans.Transformations.transform;
import static com.atl.common.utils.Preconditions.checkNotNull;

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.emf.EMFModel;

import com.atl.common.models.Models;
import com.atl.common.trans.Transformation;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.transform.OWLTransformations;

/**
 * {@link OWL2Ecore}
 * 
 * Launcher class for the OWL2Ecore.atl tranformation.
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.4
 */
public class OWL2Ecore implements Transformation<Resource, Resource> {

//	private final Map<String, Object> options;
	
	static {
		register(OWLPackage.eINSTANCE.eResource());
	}
	
    public OWL2Ecore() {
//    	options = new HashMap<String, Object>();
    }

    public OWL2Ecore(Map<String, Object> options) {
//    	this.options = options; 
    }
    
    static {
    	register(OWLPackage.eINSTANCE.eResource());
    }
    
	public Resource apply(Resource arg) {
        checkNotNull(arg, "Cannot execute transformation " + this + ", cause input null.");
        
        EMFModel in = Models.inject(arg, Models.get(OWLPackage.eNS_URI));
        EMFModel out = transform(in, OWLTransformations.owl2ecore());
        
        return out != null ? out.getResource() : null;
	}
	
}
