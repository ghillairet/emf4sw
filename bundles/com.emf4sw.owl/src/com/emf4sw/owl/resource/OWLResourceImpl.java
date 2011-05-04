package com.emf4sw.owl.resource;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

import com.emf4sw.owl.OWLFactory;
import com.emf4sw.owl.Ontology;

public abstract class OWLResourceImpl extends ResourceImpl implements OWLResource {

	protected OWLReader reader;
	
	protected OWLWriter writer;
	
	public OWLResourceImpl() {
		super();
		setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());
	}
	
	public OWLResourceImpl(URI uri) {
		super(uri);
		setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());
	}
	
	@Override
	public Ontology getOntology() {
		return getContents().get(0) != null && getContents().get(0) instanceof Ontology ? 
				(Ontology)getContents().get(0) : null;
	}

	@Override
	public Ontology createOntology(URI uri) {
		final Ontology aOntology = OWLFactory.eINSTANCE.createOntology();
		aOntology.setURI(uri.toString());
//		aOntology.eAdapters().add(new TripleAddAdapter());
		
		getContents().add(aOntology);
		
		return aOntology;
	}

}
