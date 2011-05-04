package com.emf4sw.owl.impl.notify;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;

import com.emf4sw.owl.DataProperty;
import com.emf4sw.owl.OWLClass;
import com.emf4sw.owl.ObjectAllValuesFrom;
import com.emf4sw.owl.ObjectExactCardinality;
import com.emf4sw.owl.ObjectMaxCardinality;
import com.emf4sw.owl.ObjectMinCardinality;
import com.emf4sw.owl.ObjectProperty;
import com.emf4sw.owl.ObjectSomeValuesFrom;
import com.emf4sw.owl.Ontology;
import com.emf4sw.owl.util.OWLSwitch;
import com.emf4sw.owl.vocabulary.OWL;
import com.emf4sw.rdf.Literal;
import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.vocabulary.RDF;

public class OntologyTripleAdapter extends EContentAdapter {

	@Override
	public void notifyChanged(Notification msg) {
		EStructuralFeature feature = (EStructuralFeature) msg.getFeature();
		if (feature instanceof EReference) {
			Object value = msg.getNewValue();
			if (value instanceof EObject) {
				Ontology ontology = (Ontology) ((EObject) value).eContainer();

				Triple added = new TripleBuilderSwitch(ontology).doSwitch((EObject) value);
				if (added != null)
					ontology.getTriples().add(added);
			}
		}
	}


	public static class TripleBuilderSwitch extends OWLSwitch<Triple> {
		Ontology ontology;

		public TripleBuilderSwitch(Ontology ontology) {
			this.ontology = ontology;
		}

		@Override
		public Triple caseOWLClass(OWLClass object) {
			return ontology.addTriple(object,
					ontology.getProperty(RDF.type),
					ontology.getResource(OWL.Class));
		}
		@Override
		public Triple caseDataProperty(DataProperty object) {
			return ontology.addTriple(object,
					ontology.getProperty(RDF.type),
					ontology.getResource(OWL.DatatypeProperty));
		}
		@Override
		public Triple caseObjectProperty(ObjectProperty object) {
			return ontology.addTriple(object,
					ontology.getProperty(RDF.type),
					ontology.getResource(OWL.ObjectProperty));
		}
		@Override
		public Triple caseObjectAllValuesFrom(ObjectAllValuesFrom object) {
			return ontology.addTriple(object,
					ontology.getProperty(RDF.type),
					ontology.getResource(OWL.Restriction));
		}
		@Override
		public Triple caseObjectSomeValuesFrom(ObjectSomeValuesFrom object) {
			return ontology.addTriple(object,
					ontology.getProperty(RDF.type),
					ontology.getResource(OWL.Restriction));
		}
		@Override
		public Triple caseObjectExactCardinality(ObjectExactCardinality object) {
			ontology.addTriple(object, ontology.getProperty(OWL.cardinality), 
					createLiteral(object.getCardinality(), ontology));
			return ontology.addTriple(object, ontology.getProperty(RDF.type), 
					ontology.getResource(OWL.Restriction));
		}
		@Override
		public Triple caseObjectMaxCardinality(ObjectMaxCardinality object) {
			ontology.addTriple(object, ontology.getProperty(OWL.maxCardinality), 
					createLiteral(object.getCardinality(), ontology));
			return ontology.addTriple(object,
					ontology.getProperty(RDF.type),
					ontology.getResource(OWL.Restriction));
		}
		@Override
		public Triple caseObjectMinCardinality(ObjectMinCardinality object) {
			ontology.addTriple(object, ontology.getProperty(OWL.minCardinality), 
					createLiteral(object.getCardinality(), ontology));
			return ontology.addTriple(object,
					ontology.getProperty(RDF.type),
					ontology.getResource(OWL.Restriction));
		}

		private Literal createLiteral(Object value, Ontology ontology) {
			Literal literal = RDFFactory.eINSTANCE.createLiteral();
			literal.setLexicalForm(value.toString());
			ontology.getLiterals().add(literal);

			return literal;
		}
	}
}
