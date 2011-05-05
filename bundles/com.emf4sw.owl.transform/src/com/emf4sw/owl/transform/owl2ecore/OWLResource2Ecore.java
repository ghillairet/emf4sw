package com.emf4sw.owl.transform.owl2ecore;

import static com.atl.common.models.Models.get;
import static com.atl.common.models.Models.inject;
import static com.atl.common.models.Models.register;
import static com.atl.common.trans.Transformations.transform;
import static com.atl.common.utils.Preconditions.checkNotNull;
import static com.emf4sw.owl.transform.OWLTransformations.owl2ecore;
import static com.emf4sw.owl.transform.utils.OWL2EcoreOptions.needRefiningTransformation;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.emf.EMFModel;

import com.atl.common.trans.Transformation;
import com.emf4sw.owl.OWLPackage;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.6
 */
public class OWLResource2Ecore implements Transformation<Resource, Resource> {

	private final Map<String, Object> options;
	
	public OWLResource2Ecore() {
		this.options = new HashMap<String, Object>();
	}
	
	public OWLResource2Ecore(Map<String, Object> options) {
		this.options = options;
	}
	
	static {
		register(OWLPackage.eINSTANCE.eResource());
	}
	
	@Override
	public Resource apply(Resource from) {
		 checkNotNull(from, "Cannot execute transformation " + this + ", on null parameter.");
		 
		final EMFModel result = transform(inject(from, get(OWLPackage.eNS_URI)), owl2ecore());
		
		if (result != null && needRefiningTransformation(options)) {
			final EMFModel model = transform(result, new EcoreRefine());
			return  model == null ? null : model.getResource();
		} else {
			return  result == null ? null : result.getResource();
		}
	}

}
