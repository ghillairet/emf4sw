package com.emf4sw.owl.transform.ecore2owl;

import static com.atl.common.models.Models.ecore;
import static com.atl.common.models.Models.inject;
import static com.atl.common.models.Models.register;
import static com.atl.common.models.Models.setOf;
import static com.atl.common.trans.Transformations.transform;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.emf.EMFModel;

import com.atl.common.models.Properties;
import com.atl.common.trans.Transformation;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.resource.OWLFormats;
import com.emf4sw.owl.resource.OWLResource;
import com.emf4sw.owl.transform.OWLTransformations;
import com.emf4sw.owl.transform.utils.OntologySplitter;

/**
 * {@link Ecore2OWLResources}
 * 
 * {@link Transformation} taking as imput a {@link Resource} containing one or more {@link EPackage}. Result in 
 * a {@link List} of {@link OWLResource} being of the size of the number of {@link EPackage} taken as imput.
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 *
 */
public class Ecore2OWLResources implements Transformation<Resource, List<Resource>> {

	private final OWLFormats format;
	
	private final Properties<?, ?> properties;
	
	static {
		register(OWLPackage.eINSTANCE);
	}
	
	public Ecore2OWLResources(OWLFormats format) {
		this.properties = Properties.createProperties();
		this.format = format;
	}
	
	public <K, V> Ecore2OWLResources(OWLFormats format, Map<String, Object> options) {
    	this.properties = Properties.createProperties(options);
		this.format = format;
	}
	
	@Override
	public List<Resource> apply(Resource from) {
		return getOntologies( transform( 
				setOf(inject(from, ecore()), 
						inject(properties.serialize(), Properties.getReferenceModel())), 
							OWLTransformations.ecore2owl(format) ) );
	}

	private List<Resource> getOntologies(EMFModel model) {
		return new OntologySplitter().split( model.getResource(), format );
	}

}
