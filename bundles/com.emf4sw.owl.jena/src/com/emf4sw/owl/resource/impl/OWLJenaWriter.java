package com.emf4sw.owl.resource.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.DataAllValuesFrom;
import com.emf4sw.owl.DataExactCardinality;
import com.emf4sw.owl.DataHasValue;
import com.emf4sw.owl.DataMaxCardinality;
import com.emf4sw.owl.DataMinCardinality;
import com.emf4sw.owl.DataProperty;
import com.emf4sw.owl.DataRange;
import com.emf4sw.owl.DataSomeValuesFrom;
import com.emf4sw.owl.OWLClass;
import com.emf4sw.owl.ObjectAllValuesFrom;
import com.emf4sw.owl.ObjectComplementOf;
import com.emf4sw.owl.ObjectExactCardinality;
import com.emf4sw.owl.ObjectHasSelf;
import com.emf4sw.owl.ObjectHasValue;
import com.emf4sw.owl.ObjectIntersectionOf;
import com.emf4sw.owl.ObjectMaxCardinality;
import com.emf4sw.owl.ObjectMinCardinality;
import com.emf4sw.owl.ObjectOneOf;
import com.emf4sw.owl.ObjectProperty;
import com.emf4sw.owl.ObjectPropertyChain;
import com.emf4sw.owl.ObjectSomeValuesFrom;
import com.emf4sw.owl.ObjectUnionOf;
import com.emf4sw.owl.Ontology;
import com.emf4sw.owl.resource.OWLFormats;
import com.emf4sw.owl.resource.OWLResource;
import com.emf4sw.owl.resource.OWLWriter;
import com.emf4sw.owl.util.OWLSwitch;
import com.emf4sw.owl.vocabulary.OWL;
import com.emf4sw.rdf.Resource;
import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.ontology.ComplementClass;
import com.hp.hpl.jena.ontology.EnumeratedClass;
import com.hp.hpl.jena.ontology.IntersectionClass;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.ontology.OntResource;
import com.hp.hpl.jena.ontology.Restriction;
import com.hp.hpl.jena.ontology.UnionClass;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.RDFList;

public class OWLJenaWriter implements OWLWriter {

	public OWLJenaWriter() {
	}

	@Override
	public OntModel write(OWLResource resource, OWLFormats format) {
		final OntModel model = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);
		final Ontology ontology = resource.getOntology();
		final OWLSwitchImpl cswitch = new OWLSwitchImpl(model);
		
		extract(ontology.getClasses(), cswitch, model);
		extract(ontology.getObjectProperties(), cswitch, model);
		extract(ontology.getDataProperties(), cswitch, model);
		extract(ontology.getClassExpressions(), cswitch, model);
		
		model.createOntology(ontology.getURI());
		
		return model;
	}

	private Model extract(EList<? extends EObject> list, OWLSwitchImpl cswitch, OntModel model) {
		for (EObject ce: list)
		{
			if (!cache.containsKey(ce))
				cswitch.doSwitch(ce);
		}
		return model;
	}

	private final static Map<EObject, OntResource> cache = new HashMap<EObject, OntResource>();
	
	private class OWLSwitchImpl extends OWLSwitch<OntResource> {
		private final OntModel model;
		
		public OWLSwitchImpl(OntModel model) {
			this.model = model;
			cache.clear();
		}

		private void doClass(OntClass aClass, ClassExpression object) {
			for (ClassExpression ce: object.getSubClassOf())
			{
				OntResource superClass = this.doSwitch(ce);
				if (superClass != null)
				{
					aClass.addSuperClass(superClass);
				}
			}
			for (ClassExpression ce: object.getEquivalentClasses()) {
				OntResource equiClass = this.doSwitch(ce);
				if (equiClass != null)
				{
					aClass.addEquivalentClass(equiClass);
				}
			}
			for (ClassExpression ce: object.getDisjointClasses()) {
				OntResource disjClass = this.doSwitch(ce);
				if (disjClass != null)
				{
					aClass.addDisjointWith(disjClass);
				}
			}
		}

		@Override
		public OntResource caseOWLClass(OWLClass object) {
			if (cache.containsKey(object))
				return cache.get(object);

			final OntClass aClass;
			if (object.getURI() != null)
				aClass = model.createClass(object.getURI());
			else 
				aClass = model.createClass();

			cache.put(object, aClass);

			doClass(aClass, object);

			return aClass;
		}
		@Override
		public OntResource caseObjectUnionOf(ObjectUnionOf object) {
			if (cache.containsKey(object))
				return cache.get(object);

			RDFList list = model.createList();
			for (ClassExpression ce: object.getUnionOf()) {
				OntResource c = this.doSwitch(ce);
				if (c != null) {
					list = list.cons( c );
				}
			}
			UnionClass uClass = model.createUnionClass(null, list);
			cache.put(object, uClass);
			doClass(uClass, object);

			return uClass; 
		}
		@Override
		public OntResource caseObjectIntersectionOf(ObjectIntersectionOf object) {
			if (cache.containsKey(object))
				return cache.get(object);

			RDFList list = model.createList();
			for (ClassExpression ce: object.getIntersectionOf()) {
				OntResource c = this.doSwitch(ce);
				if (c != null) {
					list = list.cons( c );
				}
			}
			IntersectionClass iClass = model.createIntersectionClass(null, list);
			cache.put(object, iClass);
			doClass(iClass, object);

			return iClass;
		}
		@Override
		public OntResource caseObjectComplementOf(ObjectComplementOf object) {
			if (cache.containsKey(object))
				return cache.get(object);

			boolean addSelfLater = false;
			RDFList list = model.createList();
			for (ClassExpression ce: object.getComplementOf()) {
				if (ce == object) {
					addSelfLater = true;
				} else {
					OntResource c = this.doSwitch(ce);
					if (c != null) {
						list = list.cons( c );
					}
				}
			}
			ComplementClass cClass = model.createComplementClass(null, list);
			cache.put(object, cClass);
			if (addSelfLater) {
//				cClass.addOperand(cClass);
//				list = list.cons( cClass );
			}
			doClass(cClass, object);

			return cClass;
		}
		@Override
		public OntResource caseObjectOneOf(ObjectOneOf object) {
			if (cache.containsKey(object))
				return cache.get(object);
			
			RDFList list = model.createList();
			for (Resource individual: object.getOneOf()) {

				com.hp.hpl.jena.ontology.Individual ind = model.createIndividual(
						model.getResource(individual.getURI()));
				if (ind != null) {
					list = list.cons( ind );
				}
			}
			EnumeratedClass ec = model.createEnumeratedClass(null, list);
			cache.put(object, ec);
			
			return ec; 
		}
		@Override
		public OntResource caseObjectAllValuesFrom(ObjectAllValuesFrom object) {
			if (cache.containsKey(object))
				return cache.get(object);
			
			com.hp.hpl.jena.ontology.OntClass ret = null;
			final OntResource values = this.doSwitch(object.getAllValuesFrom());
			final Property property = model.getProperty(object.getProperty().getURI());

			if (property != null && values != null) {
				ret = model.createSomeValuesFromRestriction(null, property, values);
				cache.put(object, ret);
			}
			return ret;
		}
		@Override
		public OntResource caseObjectSomeValuesFrom(ObjectSomeValuesFrom object) {
			if (cache.containsKey(object))
				return cache.get(object);
			
			com.hp.hpl.jena.ontology.OntClass ret = null;
			final OntResource values = this.doSwitch(object.getSomeValuesFrom());
			final Property property = model.getProperty(object.getProperty().getURI());
 
			if (property != null && values != null) {
				ret = model.createSomeValuesFromRestriction(null, property, values);
				cache.put(object, ret);
			}
			return ret;
		}
		@Override
		public OntResource caseObjectHasValue(ObjectHasValue object) {
			if (cache.containsKey(object))
				return cache.get(object);
			
			OntClass ret = null;
			final com.hp.hpl.jena.ontology.Individual ind = model.createIndividual(
					model.getResource(object.getHasValue().getURI()));
			final Property property = model.getProperty(object.getProperty().getURI());

			if (property != null && ind != null) {
				ret = model.createHasValueRestriction(null, property, ind);
				cache.put(object, ret);
			}
			return ret;
		}
		@Override
		public OntResource caseObjectHasSelf(ObjectHasSelf object) {
			if (cache.containsKey(object))
				return cache.get(object);
			
			OntClass ret = model.createOntResource(null).as(Restriction.class);
			final Property property = model.getProperty(object.getProperty().getURI());

			if (property != null) {
				model.add(model.createStatement(ret, model.getProperty(OWL.onProperty), property.getURI()));
				Literal lit = model.createTypedLiteral("true", XSDDatatype.XSDboolean);
				model.add(model.createStatement(ret, model.getProperty(OWL.hasSelf), lit));
				cache.put(object, ret);
			}
			return ret;
		}
		@Override
		public OntResource caseObjectExactCardinality(ObjectExactCardinality object) {
			if (cache.containsKey(object))
				return cache.get(object);
			
			com.hp.hpl.jena.ontology.OntClass ret = null;
			if (object.getOnClass() == null) {
				ret = model.createCardinalityRestriction(null, 
						model.getProperty(object.getProperty().getURI()), 
						object.getCardinality() );
			} else {
				ret = model.createCardinalityRestriction(null, 
						model.getProperty(object.getProperty().getURI()), 
						object.getCardinality() );

				OntResource aClass = doSwitch(object.getOnClass());
				if (aClass != null) {
					model.add(model.createStatement(ret, model.getProperty(OWL.onClass), aClass));
				}
			}
			cache.put(object, ret);
			return ret;
		}
		@Override
		public OntResource caseObjectMaxCardinality(ObjectMaxCardinality object) {
			if (cache.containsKey(object))
				return cache.get(object);
			
			com.hp.hpl.jena.ontology.OntClass ret = null;
			if (object.getOnClass() == null) {
				ret = model.createMaxCardinalityRestriction(null, 
						model.getProperty(object.getProperty().getURI()), 
						object.getCardinality() );
			} else {
				ret = model.createMaxCardinalityRestriction(null, 
						model.getProperty(object.getProperty().getURI()), 
						object.getCardinality() );

				OntResource aClass = doSwitch(object.getOnClass());
				if (aClass != null) {
					model.add(model.createStatement(ret, model.getProperty(OWL.onClass), aClass));
				}
			}
			cache.put(object, ret);
			return ret;
		}
		@Override
		public OntResource caseObjectMinCardinality(ObjectMinCardinality object) {
			if (cache.containsKey(object))
				return cache.get(object);
			
			com.hp.hpl.jena.ontology.OntClass ret = null;
			if (object.getOnClass() == null) {
				ret = model.createMinCardinalityRestriction(null, 
						model.getProperty(object.getProperty().getURI()), 
						object.getCardinality() );
			} else {
				ret = model.createMinCardinalityRestriction(null, 
						model.getProperty(object.getProperty().getURI()), 
						object.getCardinality() );

				OntResource aClass = doSwitch(object.getOnClass());
				if (aClass != null) {
					model.add(model.createStatement(ret, model.getProperty(OWL.onClass), aClass));
				}
			}
			cache.put(object, ret);
			return ret;
		}
		@Override
		public OntResource caseDataSomeValuesFrom(DataSomeValuesFrom object) {
			if (cache.containsKey(object))
				return cache.get(object);
			
			com.hp.hpl.jena.ontology.OntClass ret = null;
			com.hp.hpl.jena.rdf.model.Resource dataRange = 
				DataRangeFactory.createDataRange(object.getSomeValuesFrom(), model);

			if (dataRange != null) 
			{
				for (DataProperty aExpression: object.getProperties()) 
				{
					Property property = model.createProperty(aExpression.getURI());
					if (property != null) {
						ret = model.createSomeValuesFromRestriction(null, property, dataRange);
						cache.put(object, ret);
					}
				}
			}
			
			return ret;
		}
		@Override
		public OntResource caseDataAllValuesFrom(DataAllValuesFrom object) {
			if (cache.containsKey(object))
				return cache.get(object);
			
			com.hp.hpl.jena.ontology.OntClass ret = null;
			com.hp.hpl.jena.rdf.model.Resource dataRange = 
				DataRangeFactory.createDataRange(object.getAllValuesFrom(), model);

			if (dataRange != null) 
			{
				for (DataProperty aExpression: object.getProperties()) 
				{
					Property property = model.createProperty(aExpression.getURI());		
					if (property != null) {
						ret = model.createAllValuesFromRestriction(null, property, dataRange);
						cache.put(object, ret);
					}
				}
			}
			return ret;
		}
		@Override
		public OntResource caseDataHasValue(DataHasValue object) {
			if (cache.containsKey(object))
				return cache.get(object);
			
			com.hp.hpl.jena.ontology.OntClass ret = null;
			final Literal literal = model.createLiteral(object.getHasValue().getLexicalForm());
			final Property property = model.createProperty(object.getProperty().getURI());

			if (property != null && literal != null) {
				ret = model.createHasValueRestriction(null, property, literal);
				cache.put(object, ret);
			}
			return ret;
		}
		@Override
		public OntResource caseDataExactCardinality(DataExactCardinality object) {
			if (cache.containsKey(object))
				return cache.get(object);
			
			com.hp.hpl.jena.ontology.OntClass ret = null;
			if (object.getDataRange() == null) {
				ret = model.createCardinalityRestriction(null, 
						model.getProperty(object.getProperty().getURI()), 
						object.getCardinality() );
			} else {
				ret = model.createCardinalityRestriction(null, 
						model.getProperty(object.getProperty().getURI()), 
						object.getCardinality() );

				com.hp.hpl.jena.rdf.model.Resource res = DataRangeFactory.createDataRange(object.getDataRange(), model);
				if (res != null) {
					model.add(model.createStatement(ret, model.getProperty(OWL.onDataRange) ,res));
				}
			}
			cache.put(object, ret);
			return ret;
		}
		@Override
		public OntResource caseDataMaxCardinality(DataMaxCardinality object) {
			if (cache.containsKey(object))
				return cache.get(object);
			
			com.hp.hpl.jena.ontology.OntClass ret = null;
			if (object.getDataRange() == null) {
				ret = model.createCardinalityRestriction(null, 
						model.getProperty(object.getProperty().getURI()), 
						object.getCardinality() );
			} else {
				ret = model.createCardinalityRestriction(null, 
						model.getProperty(object.getProperty().getURI()), 
						object.getCardinality() );

				com.hp.hpl.jena.rdf.model.Resource res = DataRangeFactory.createDataRange(object.getDataRange(), model);
				if (res != null) {
					model.add(model.createStatement(ret, model.getProperty(OWL.onDataRange) ,res));
				}
			}
			cache.put(object, ret);
			return ret;
		}
		@Override
		public OntResource caseDataMinCardinality(DataMinCardinality object) {
			if (cache.containsKey(object))
				return cache.get(object);
			
			com.hp.hpl.jena.ontology.OntClass ret = null;
			if (object.getDataRange() == null) {
				ret = model.createMinCardinalityRestriction(null, 
						model.getProperty(object.getProperty().getURI()), 
						object.getCardinality() );
			} else {
				ret = model.createMinCardinalityRestriction(null, 
						model.getProperty(object.getProperty().getURI()), 
						object.getCardinality() );

				com.hp.hpl.jena.rdf.model.Resource res = DataRangeFactory.createDataRange(object.getDataRange(), model);
				if (res != null) {
					model.add(model.createStatement(ret, model.getProperty(OWL.onDataRange) ,res));
				}
			}
			cache.put(object, ret);
			return ret;
		}
		@Override
		public OntResource caseObjectProperty(ObjectProperty object) {
			if (cache.containsKey(object))
				return cache.get(object);

			com.hp.hpl.jena.ontology.ObjectProperty oProperty = model.createObjectProperty(object.getURI());
			cache.put(object, oProperty);

			for (ClassExpression ce: object.getDomain()) {
				oProperty.addDomain(doSwitch(ce));
			}
			for (ClassExpression ce: object.getRange()) {
				oProperty.addRange(doSwitch(ce));
			}
			for (ObjectProperty property: object.getSubPropertyOf()) {
				oProperty.addSuperProperty((Property) doSwitch(property));
			}

			return oProperty;
		}
		@Override
		public OntResource caseObjectPropertyChain(ObjectPropertyChain object) {
			if (cache.containsKey(object))
				return cache.get(object);
			
			return super.caseObjectPropertyChain(object);
		}
		@Override
		public OntResource caseDataProperty(DataProperty object) {
			if (cache.containsKey(object))
				return cache.get(object);

			com.hp.hpl.jena.ontology.DatatypeProperty oProperty = model.createDatatypeProperty(object.getURI());
			cache.put(object, oProperty);

			for (ClassExpression ce: object.getDomain()) {
				oProperty.addDomain(doSwitch(ce));
			}
			for (DataRange ce: object.getRange()) {
				oProperty.addRange(doSwitch(ce));
			}
			for (DataProperty property: object.getSubPropertyOf()) {
				oProperty.addSuperProperty((Property) doSwitch(property));
			}

			return oProperty;
		}
	}
}
