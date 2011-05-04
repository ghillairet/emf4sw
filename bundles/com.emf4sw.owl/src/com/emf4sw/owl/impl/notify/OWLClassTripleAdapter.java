package com.emf4sw.owl.impl.notify;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;

import com.emf4sw.owl.OWLClass;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.Ontology;
import com.emf4sw.owl.vocabulary.OWL;
import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.vocabulary.RDFS;

public class OWLClassTripleAdapter extends AdapterImpl {

	public OWLClassTripleAdapter() {
		
	}

	@Override
	public void notifyChanged(Notification msg) {
		if (msg.getNotifier() instanceof EObject)
		{
			Ontology ontology = (Ontology) ((EObject)msg.getNotifier()).eContainer();

			switch (msg.getFeatureID(OWLClass.class)) {
			case OWLPackage.OWL_CLASS__SUB_CLASS_OF:
				addSubClassOfTriple(msg, ontology);
				break;
			case OWLPackage.OWL_CLASS__EQUIVALENT_CLASSES:
				addEquivqlentClassTriple(msg, ontology);
				break;
			case OWLPackage.OWL_CLASS__DISJOINT_CLASSES:
				addDisjointClassTriple(msg, ontology);
				break;
			default:
				break;
			}
		}
		super.notifyChanged(msg);
	}

	private void addDisjointClassTriple(Notification msg, Ontology ontology) {
		final Object value = msg.getNewValue();
		ontology.addTriple((Node)
				msg.getNotifier(), ontology.getProperty(OWL.disjointWith), 
				(Node)value);
	}

	private void addEquivqlentClassTriple(Notification msg, Ontology ontology) {
		final Object value = msg.getNewValue();
		ontology.addTriple((Node)
				msg.getNotifier(), ontology.getProperty(OWL.equivalentClass), 
				(Node)value);
	}

	private void addSubClassOfTriple(Notification msg, Ontology ontology) {
		final Object value = msg.getNewValue();
		ontology.addTriple((Node)
				msg.getNotifier(), ontology.getProperty(RDFS.subClassOf), 
				(Node)value);
	}
}
