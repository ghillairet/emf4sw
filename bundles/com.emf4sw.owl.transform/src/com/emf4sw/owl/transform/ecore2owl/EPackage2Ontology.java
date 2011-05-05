package com.emf4sw.owl.transform.ecore2owl;

import static com.atl.common.trans.Transformations.transform;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

import com.atl.common.trans.Transformation;
import com.emf4sw.owl.Ontology;
import com.emf4sw.owl.resource.OWLResource;

/**
 * 
 * Transformation taking as input a {@link EPackage}. This {@link EPackage} has to be the sole 
 * {@link EPackage} in his containing {@link Resource}. Result as a single {@link Ontology}. 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class EPackage2Ontology implements Transformation<EPackage, Ontology> {

	@Override
	public Ontology apply(EPackage from) {
		Resource resource = 
			transform(from.eResource(), new Ecore2OWL());
		if (resource instanceof OWLResource)
			return ((OWLResource) resource).getOntology();
		else 
			return (Ontology) resource.getContents().get(0);
	}
	
}
