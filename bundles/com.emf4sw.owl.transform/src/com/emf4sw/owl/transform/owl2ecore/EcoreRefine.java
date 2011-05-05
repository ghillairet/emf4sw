package com.emf4sw.owl.transform.owl2ecore;

import static com.atl.common.trans.Transformations.transform;
import static com.atl.common.utils.Preconditions.checkNotNull;
import static com.emf4sw.owl.transform.OWLTransformations.ecoreRefine;

import org.eclipse.m2m.atl.core.emf.EMFModel;

import com.atl.common.trans.Transformation;

public class EcoreRefine implements Transformation<EMFModel, EMFModel> {

	@Override
	public EMFModel apply(EMFModel from) {
		checkNotNull(from, "Cannot execute transformation " + this + ", on null parameter.");
		 
		return transform(from, ecoreRefine());
	}

}
