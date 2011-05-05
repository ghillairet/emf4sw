package com.emf4sw.owl.jena.utils;

import com.hp.hpl.jena.ontology.AllDifferent;
import com.hp.hpl.jena.ontology.AllValuesFromRestriction;
import com.hp.hpl.jena.ontology.AnnotationProperty;
import com.hp.hpl.jena.ontology.CardinalityQRestriction;
import com.hp.hpl.jena.ontology.CardinalityRestriction;
import com.hp.hpl.jena.ontology.ComplementClass;
import com.hp.hpl.jena.ontology.DataRange;
import com.hp.hpl.jena.ontology.DatatypeProperty;
import com.hp.hpl.jena.ontology.EnumeratedClass;
import com.hp.hpl.jena.ontology.HasValueRestriction;
import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.IntersectionClass;
import com.hp.hpl.jena.ontology.MaxCardinalityQRestriction;
import com.hp.hpl.jena.ontology.MaxCardinalityRestriction;
import com.hp.hpl.jena.ontology.MinCardinalityQRestriction;
import com.hp.hpl.jena.ontology.MinCardinalityRestriction;
import com.hp.hpl.jena.ontology.ObjectProperty;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntResource;
import com.hp.hpl.jena.ontology.Ontology;
import com.hp.hpl.jena.ontology.Restriction;
import com.hp.hpl.jena.ontology.SomeValuesFromRestriction;
import com.hp.hpl.jena.ontology.UnionClass;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;

public class OntModelSwitch<T> {

	public OntModelSwitch() {	
	}

	public T caseOntology(Ontology object) {
		return null;
	}

	public T caseOntClass(OntClass object) {
		return null;		
	}

	public T caseUnionClass(UnionClass object) {
		return null;
	}

	public T caseIntersectionClass(IntersectionClass object) {
		return null;
	}

	public T caseComplementClass(ComplementClass object) {
		return null;
	}

	public T caseEnumeratedClass(EnumeratedClass object) {
		return null;
	}

	public T caseObjectProperty(ObjectProperty object) {
		return null;
	}

	public T caseDatatypeProperty(DatatypeProperty object) {
		return null;
	}

	public T caseIndividual(Individual object) {
		return null;
	}

	public T caseAllValuesFromRestriction(AllValuesFromRestriction object) {
		return null;
	}

	public T caseSomeValuesFromRestriction(SomeValuesFromRestriction object) {
		return null;
	}

	public T caseHasValueRestriction(HasValueRestriction object) {
		return null;
	}
	
	public T caseMaxCardinalityRestriction(MaxCardinalityRestriction object) {
		return null;
	}

	public T caseCardinalityRestriction(CardinalityRestriction object) {
		return null;
	}
	
	public T caseCardinalityQRestriction(CardinalityQRestriction object) {
		return null;
	}
	
	public T caseMaxCardinalityQRestriction(MaxCardinalityQRestriction object) {
		return null;
	}

	public T caseMinCardinalityRestriction(MinCardinalityRestriction object) {
		return null;
	}
	
	public T caseMinCardinalityQRestriction(MinCardinalityQRestriction object) {
		return null;
	}
	
	public T caseAllDifferent(AllDifferent asAllDifferent) {
		return null;
	}

	public T caseAnnotationProperty(AnnotationProperty asAnnotationProperty) {
		return null;
	}

	public T caseDatatype(DataRange dataRange) {
		return null;
	}

	public T doSwitch(Resource res) {
		T result = null;
		if (res.canAs(OntResource.class)) {
			OntResource ontRes = res.as(OntResource.class);
			if (ontRes.isProperty()) {
				if (ontRes.isObjectProperty()) {
					result = caseObjectProperty(ontRes.asObjectProperty());
				} else if (ontRes.isDatatypeProperty()) {
					result = caseDatatypeProperty(ontRes.asDatatypeProperty());
				} else if (ontRes.isAnnotationProperty()) {
					result = caseAnnotationProperty(ontRes.asAnnotationProperty());
				}
			} 
			else if (ontRes.isClass()) {
				OntClass ontClass = res.as(OntClass.class);
				if (ontClass.isAllDifferent()) {
					result = caseAllDifferent(ontClass.asAllDifferent());
				} else if (ontClass.isComplementClass()) {
					result = caseComplementClass(ontClass.asComplementClass());
				} else if (ontClass.isUnionClass()) {
					result = caseUnionClass(ontClass.asUnionClass());
				} else if (ontClass.isIntersectionClass()) {
					result = caseIntersectionClass(ontClass.asIntersectionClass());
				} else if (ontClass.isRestriction()) {
					Restriction restriction = ontClass.asRestriction();
					if (restriction.isAllValuesFromRestriction()) {
						result = caseAllValuesFromRestriction(restriction.asAllValuesFromRestriction());
					} else if (restriction.isSomeValuesFromRestriction()) {
						result = caseSomeValuesFromRestriction(restriction.asSomeValuesFromRestriction());
					} else if (restriction.isHasValueRestriction()) {
						result = caseHasValueRestriction(restriction.asHasValueRestriction());
					}
				} else {
					result = caseOntClass(ontClass);
				}
			}
			else if (ontRes.isOntology()) {
				result = caseOntology(res.as(Ontology.class));	
			}
			else if (ontRes.isIndividual()) {
				result = caseIndividual(res.as(Individual.class));
			}
			else if (ontRes.isDataRange()) {
				DataRange dataRange = res.as(DataRange.class);
				if (dataRange.isURIResource()) {
					result = caseDatatype(dataRange);
				}
			}
		}
		return result;
	}

	public T doSwitch(RDFNode node) {
		return null;
	}
}
