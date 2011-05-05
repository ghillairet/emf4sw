package com.emf4sw.owl.transform.ecore2owl;

import static com.atl.common.models.Models.get;
import static com.atl.common.models.Models.inject;
import static com.atl.common.models.Models.register;
import static com.atl.common.models.Models.setOf;
import static com.atl.common.trans.Transformations.transform;
import static com.atl.common.utils.Preconditions.checkNotNull;
import static com.emf4sw.owl.transform.OWLTransformations.ecore2owl;

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.emf.EMFModel;

import com.atl.common.models.Properties;
import com.atl.common.trans.Transformation;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.resource.OWLFormats;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.0
 */
public class Ecore2OWLResource implements Transformation<Resource, Resource> {
	
	private final Properties<?, ?> properties;

	private final OWLFormats format;
	
	static {
		register(OWLPackage.eINSTANCE);
	}
	
    public Ecore2OWLResource() {
    	this.properties = Properties.createProperties();
    	this.format = OWLFormats.OWL;
    }

    public Ecore2OWLResource(OWLFormats format) {
    	this.properties = Properties.createProperties();
    	this.format = format;
    }
    
    public Ecore2OWLResource(Map<String, Object> options) {
    	this.properties = Properties.createProperties(options);
    	this.format = OWLFormats.OWL;
    }
    
    public Ecore2OWLResource(OWLFormats format, Map<String, Object> options) {
    	this.properties = Properties.createProperties(options);
    	this.format = format;
    }
    
	@Override
	public Resource apply(Resource from) {
		checkNotNull(from, "Cannot execute transformation " + this + ", on null parameter.");
		
		final EMFModel propertiesModel = inject(properties.serialize(), Properties.getReferenceModel());
		final EMFModel result = transform(setOf(inject(from, get(OWLPackage.eNS_URI)), propertiesModel), ecore2owl(format));
		
		return result == null ? null : result.getResource();
	}

}
