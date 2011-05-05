/**
 * 
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 */
package com.emf4sw.owl.transform.ecore2owl;

import static com.atl.common.models.Models.inject;
import static com.atl.common.models.Models.setOf;
import static com.atl.common.trans.Transformations.transform;
import static com.atl.common.utils.Preconditions.checkNotNull;

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.emf.EMFModel;

import com.atl.common.models.Models;
import com.atl.common.models.Properties;
import com.atl.common.trans.Transformation;
import com.emf4sw.owl.resource.OWLFormats;
import com.emf4sw.owl.transform.OWLTransformations;

/**
 * 
 * Launcher class for the Ecore2OWL.atl transformation.
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.4
 */
public class Ecore2OWL implements Transformation<Resource, Resource> {

	private final Properties<?, ?> properties;

	private final OWLFormats format;
	
    public Ecore2OWL() {
    	this.properties = Properties.createProperties();
    	this.format = OWLFormats.OWL;
    }

    public Ecore2OWL(OWLFormats format) {
    	this.properties = Properties.createProperties();
    	this.format = format;
    }
    
    public Ecore2OWL(Map<String, Object> options) {
    	this.properties = Properties.createProperties(options);
    	this.format = OWLFormats.OWL;
    }
    
    public Ecore2OWL(OWLFormats format, Map<String, Object> options) {
    	this.properties = Properties.createProperties(options);
    	this.format = format;
    }
    
	public Resource apply(Resource arg) {
        checkNotNull(arg, "Cannot execute transformation " + this + ", cause input null.");
        
        EMFModel in = Models.inject(arg, Models.ecore());
        EMFModel propertiesModel = inject(properties.serialize(), Properties.getReferenceModel());
        
        EMFModel out = transform(setOf(in, propertiesModel), OWLTransformations.ecore2owl(format));
        
        return out != null ? out.getResource() : null;
	}

}
