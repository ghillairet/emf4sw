package com.emf4sw.owl.impl.notify;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;

import com.emf4sw.owl.DataProperty;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.ObjectProperty;
import com.emf4sw.owl.Ontology;
import com.emf4sw.owl.vocabulary.OWL;
import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.vocabulary.RDF;
import com.emf4sw.rdf.vocabulary.RDFS;

public abstract class ClassPropertyTripleAdapter extends AdapterImpl {

	public ClassPropertyTripleAdapter() {

	}

	@Override
	public void notifyChanged(Notification msg) {
		super.notifyChanged(msg);
	}

	protected void addPropertyTypeTriple(Notification msg, Ontology ontology, String type) {
		final boolean value = msg.getNewBooleanValue();
		if (value)
			ontology.addTriple((Node)
					msg.getNotifier(), ontology.getProperty(RDF.type), 
					ontology.getResource(type));
	}

	protected void addPropertyValueTriple(Notification msg, Ontology ontology, String type) {
		if (ontology == null || ontology.getProperty(type) == null)
			return;
		final Object value = msg.getNewValue();
		
		if (value != null) {
			ontology.addTriple((Node)
					msg.getNotifier(), ontology.getProperty(type), 
					(Node)value);
		}
	}

	public static class ObjectPropertyTripleAdapter extends ClassPropertyTripleAdapter {
		public ObjectPropertyTripleAdapter() {

		}

		@Override
		public void notifyChanged(Notification msg) {
			switch (msg.getEventType()) {
			case Notification.ADD:
			case Notification.ADD_MANY:
				if (msg.getNotifier() instanceof EObject)
				{
					Ontology ontology = (Ontology) ((EObject)msg.getNotifier()).eContainer();

					switch (msg.getFeatureID(ObjectProperty.class)) {
					case OWLPackage.OBJECT_PROPERTY__DOMAIN:
						addPropertyValueTriple(msg, ontology, RDFS.domain);
						break;
					case OWLPackage.OBJECT_PROPERTY__RANGE:
						addPropertyValueTriple(msg, ontology, RDFS.range);
						break;
					case OWLPackage.OBJECT_PROPERTY__SUB_PROPERTY_OF:
						addPropertyValueTriple(msg, ontology, RDFS.subPropertyOf);
						break;
					case OWLPackage.OBJECT_PROPERTY__EQUIVALENT_PROPERTIES:
						addPropertyValueTriple(msg, ontology, OWL.equivalentProperty);
						break;
					case OWLPackage.OBJECT_PROPERTY__DISJOINT_PROPERTIES:
						addPropertyValueTriple(msg, ontology, OWL.propertyDisjointWith);
						break;
					case OWLPackage.OBJECT_PROPERTY__IS_FUNCTIONAL:
						addPropertyTypeTriple(msg, ontology, OWL.FunctionalProperty);
						break;
					case OWLPackage.OBJECT_PROPERTY__IS_INVERSE_FUNCTIONAL:
						addPropertyTypeTriple(msg, ontology, OWL.InverseFunctionalProperty);
						break;
					case OWLPackage.OBJECT_PROPERTY__IS_SYMMETRIC:
						addPropertyTypeTriple(msg, ontology, OWL.SymmetricProperty);
						break;
					case OWLPackage.OBJECT_PROPERTY__IS_ASYMMETRIC:
						addPropertyTypeTriple(msg, ontology, OWL.AsymmetricProperty);
						break;
					case OWLPackage.OBJECT_PROPERTY__IS_TRANSITIVE:
						addPropertyTypeTriple(msg, ontology, OWL.TransitiveProperty);
						break;
					case OWLPackage.OBJECT_PROPERTY__IS_REFLEXIVE:
						addPropertyTypeTriple(msg, ontology, OWL.ReflexiveProperty);
						break;
					case OWLPackage.OBJECT_PROPERTY__IS_IRREFLEXIVE:
						addPropertyTypeTriple(msg, ontology, OWL.IrreflexiveProperty);
						break;
					default:
						break;
					}
				}
				break;
			default:
				break;
			}
			super.notifyChanged(msg);
		}

	}

	public static class DataPropertyTripleAdapter extends ClassPropertyTripleAdapter {
		public DataPropertyTripleAdapter() {

		}

		@Override
		public void notifyChanged(Notification msg) {
			switch (msg.getEventType()) {
			case Notification.ADD:
			case Notification.ADD_MANY:
				if (msg.getNotifier() instanceof EObject)
				{
					Ontology ontology = (Ontology) ((EObject)msg.getNotifier()).eContainer();

					switch (msg.getFeatureID(DataProperty.class)) {
					case OWLPackage.DATA_PROPERTY__DOMAIN:
						addPropertyValueTriple(msg, ontology, RDFS.domain);
						break;
					case OWLPackage.DATA_PROPERTY__RANGE:
						addPropertyValueTriple(msg, ontology, RDFS.range);
						break;
					case OWLPackage.DATA_PROPERTY__SUB_PROPERTY_OF:
						addPropertyValueTriple(msg, ontology, RDFS.subPropertyOf);
						break;
					case OWLPackage.DATA_PROPERTY__EQUIVALENT_PROPERTIES:
						addPropertyValueTriple(msg, ontology, OWL.equivalentProperty);
						break;
					case OWLPackage.DATA_PROPERTY__DISJOINT_PROPERTIES:
						addPropertyValueTriple(msg, ontology, OWL.propertyDisjointWith);
						break;
					case OWLPackage.DATA_PROPERTY__IS_FUNCTIONAL:
						addPropertyTypeTriple(msg, ontology, OWL.FunctionalProperty);
						break;
					default:
						break;
					}
				}
				break;
			default:
				break;
			}
			super.notifyChanged(msg);
		}
	}
}
