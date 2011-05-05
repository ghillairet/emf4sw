package com.emf4sw.owl.resource.impl;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.DataAllValuesFrom;
import com.emf4sw.owl.DataExactCardinality;
import com.emf4sw.owl.DataMaxCardinality;
import com.emf4sw.owl.DataMinCardinality;
import com.emf4sw.owl.DataProperty;
import com.emf4sw.owl.DataRange;
import com.emf4sw.owl.Individual;
import com.emf4sw.owl.OWLClass;
import com.emf4sw.owl.OWLDatatype;
import com.emf4sw.owl.OWLFactory;
import com.emf4sw.owl.ObjectAllValuesFrom;
import com.emf4sw.owl.ObjectComplementOf;
import com.emf4sw.owl.ObjectExactCardinality;
import com.emf4sw.owl.ObjectIntersectionOf;
import com.emf4sw.owl.ObjectMaxCardinality;
import com.emf4sw.owl.ObjectMinCardinality;
import com.emf4sw.owl.ObjectOneOf;
import com.emf4sw.owl.ObjectUnionOf;
import com.emf4sw.owl.jena.utils.OntModelSwitch;
import com.emf4sw.owl.resource.OWLFormats;
import com.emf4sw.owl.resource.OWLReader;
import com.emf4sw.owl.resource.OWLResource;
import com.emf4sw.rdf.vocabulary.XSD;
import com.hp.hpl.jena.ontology.AllValuesFromRestriction;
import com.hp.hpl.jena.ontology.CardinalityQRestriction;
import com.hp.hpl.jena.ontology.CardinalityRestriction;
import com.hp.hpl.jena.ontology.ComplementClass;
import com.hp.hpl.jena.ontology.DatatypeProperty;
import com.hp.hpl.jena.ontology.EnumeratedClass;
import com.hp.hpl.jena.ontology.IntersectionClass;
import com.hp.hpl.jena.ontology.MaxCardinalityQRestriction;
import com.hp.hpl.jena.ontology.MaxCardinalityRestriction;
import com.hp.hpl.jena.ontology.MinCardinalityQRestriction;
import com.hp.hpl.jena.ontology.MinCardinalityRestriction;
import com.hp.hpl.jena.ontology.ObjectProperty;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.ontology.OntProperty;
import com.hp.hpl.jena.ontology.OntResource;
import com.hp.hpl.jena.ontology.Ontology;
import com.hp.hpl.jena.ontology.UnionClass;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.RDFReader;
import com.hp.hpl.jena.rdf.model.ResIterator;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;

/**
 * 
 * @author ehilgui
 *
 */
public class OWLJenaReader implements OWLReader {

	@Override
	public void read(InputStream inputStream, OWLResource resource, OWLFormats format) {
		final OntModel model = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);
		final RDFReader aReader = model.getReader(format.value());
		try {
			aReader.read(model, inputStream, "");
		} catch (Exception e) {
			e.printStackTrace();
		}

		doInject(resource, model);
	}

	protected OWLResource doInject(final OWLResource resource, OntModel model) {
		if (resource == null) {
			throw new IllegalArgumentException();
		}

		for (ExtendedIterator<Ontology> it = model.listOntologies(); it.hasNext();) {
			com.emf4sw.owl.Ontology ontology = doCreateAxioms(model, it.next());
			if (ontology != null) {
				resource.getContents().add(ontology);
			}
		}

		return resource;
	}

	private com.emf4sw.owl.Ontology doCreateAxioms(OntModel ontModel, Ontology ontology) {		
		final com.emf4sw.owl.Ontology onto = doOntology(ontology);
		final OntModelReaderSwitch swtch = new OntModelReaderSwitch(ontModel, onto);	

		for (ResIterator it = ontModel.listSubjects(); it.hasNext();) 
		{
			com.hp.hpl.jena.rdf.model.Resource res = it.next();
			swtch.doSwitch(res);
		}

		return onto;
	}

	private com.emf4sw.owl.Ontology doOntology(Ontology ontology) {
		final com.emf4sw.owl.Ontology target = OWLFactory.eINSTANCE.createOntology();
		target.setURI(ontology.getURI());

		return target;
	}
	
	private static class OntModelReaderSwitch extends OntModelSwitch<Object> {
		
		private final static OWLFactory factory = OWLFactory.eINSTANCE;
		private final Map<OntResource, Object> registry;
		private final Map<String, OWLDatatype> datatypes;
		private final com.emf4sw.owl.Ontology target;

		public OntModelReaderSwitch(OntModel model, com.emf4sw.owl.Ontology target) {
			this.target = target;
			this.registry = new HashMap<OntResource, Object>();
			this.datatypes = new HashMap<String, OWLDatatype>();
		}

		private OWLDatatype createDatatype(String uri) {
			if (datatypes.containsKey(uri))
				return datatypes.get(uri);
			else {
				final OWLDatatype datatype = OWLFactory.eINSTANCE.createOWLDatatype();
				datatype.setURI(uri);
				datatypes.put(uri, datatype);
				target.getDatatypes().add(datatype);
				
				return datatype;
			}
		}
		
		@Override
		public Object caseOntClass(OntClass object) {
			if (datatype(object)) {
				if (object.canAs(com.hp.hpl.jena.ontology.DataRange.class)) {
					return caseDatatype(object.asDataRange());
				} else {
					return createDatatype(object.getURI());
				}
			}
			
			final ClassExpression entity;
			if (registry.containsKey(object)) 
			{
				entity = (ClassExpression) registry.get(object);
			} 
			else 
			{
				entity = factory.createOWLClass();
				((OWLClass) entity).setURI(object.getURI());
				registry.put(object, entity);
				target.getClasses().add((OWLClass) entity);

				if (object.getLabel(null) != null)
					entity.setLabel(object.getLabel(null));

				if (object.getComment(null) != null)
					entity.setComment(object.getComment(null));

				completeClassExpression(entity, object);
			}

			return entity;
		}
		
		private static Boolean datatype(OntResource res) {
			if (res != null && res.getURI() != null)
				if (!res.isDataRange())
					return res.getURI().startsWith(XSD.NS);
				else return true;
			else return false;
		}

		private void completeClassExpression(final ClassExpression entity, final OntClass object) {
			for (OntClass sup: object.listSuperClasses().toList())
			{
				Object ce = (ClassExpression) doSwitch(sup);
				if (ce instanceof ClassExpression)
				{
					entity.getSubClassOf().add((ClassExpression) ce);
				}
			}
			for (OntClass sup: object.listEquivalentClasses().toList())
			{
				Object ce = (ClassExpression) doSwitch(sup);
				if (ce instanceof ClassExpression)
				{
					entity.getEquivalentClasses().add((ClassExpression) ce);
				}
			}
			for (OntClass sup: object.listDisjointWith().toList())
			{
				Object ce = (ClassExpression) doSwitch(sup);
				if (ce instanceof ClassExpression)
				{
					entity.getDisjointClasses().add((ClassExpression) ce);
				}
			}
		}

		@Override
		public Object caseUnionClass(UnionClass object) {
			final ClassExpression expression;
			if (registry.containsKey(object)) 
			{
				expression = (ClassExpression) registry.get(object);
			} 
			else 
			{
				expression = factory.createObjectUnionOf();
				registry.put(object, expression);
				target.getClassExpressions().add(expression);

				final ExtendedIterator<? extends OntClass> it = object.listOperands();
				for(;it.hasNext();) 
				{
					final OntClass ontClass = it.next();
					try {
						final Object switched = this.doSwitch(ontClass);
						if (switched instanceof ClassExpression) 
						{
							((ObjectUnionOf) expression).getUnionOf().add( (ClassExpression) switched );
						}
					} catch (ClassCastException e) {
						e.printStackTrace();
					}
				}

				completeClassExpression(expression, object);

			}
			return expression;
		}

		@Override
		public Object caseIntersectionClass(IntersectionClass object) {
			final ClassExpression expression;
			if (registry.containsKey(object)) 
			{
				expression = (ClassExpression) registry.get(object);
			} 
			else 
			{
				expression = factory.createObjectIntersectionOf();
				registry.put(object, expression);
				target.getClassExpressions().add(expression);

				final ExtendedIterator<? extends OntClass> it = object.listOperands();
				for(;it.hasNext();) 
				{
					final OntClass ontClass = it.next();
					try {
						final Object switched = this.doSwitch(ontClass);
						if (switched instanceof ClassExpression) 
						{
							((ObjectIntersectionOf) expression).getIntersectionOf().add( (ClassExpression) switched );
						}
					} catch (ClassCastException e) {
						e.printStackTrace();
					}
				}

				completeClassExpression(expression, object);

			}
			return expression;
		}

		@Override
		public Object caseComplementClass(ComplementClass object) {
			final ClassExpression expression;
			if (registry.containsKey(object)) {
				expression = (ClassExpression) registry.get(object);
			} else {
				expression = factory.createObjectComplementOf();
				registry.put(object, expression);
				target.getClassExpressions().add(expression);

				if (object.getOperand().canAs(OntClass.class)) 
				{
					Object operand = caseOntClass(object.as(OntClass.class));
					((ObjectComplementOf) expression).getComplementOf().add((ClassExpression) operand);
				}

				completeClassExpression(expression, object);
			}
			return expression;
		}

		@Override
		public Object caseEnumeratedClass(EnumeratedClass object) {
			final ObjectOneOf expression;
			if (registry.containsKey(object)) {
				expression = (ObjectOneOf) registry.get(object);
			} else {
				expression = factory.createObjectOneOf();
				target.getClassExpressions().add(expression);
				registry.put(object, expression);
				
				for (ExtendedIterator<RDFNode> it = object.getOneOf().iterator(); it.hasNext();) {
					Object node = doSwitch(it.next());
					if (node instanceof Individual) {
						expression.getOneOf().add((Individual) node);
					}
				}
				
			}

			return expression;
		}

		@Override
		public Object caseCardinalityRestriction(CardinalityRestriction object) {
			ClassExpression aExpression = null;
			final Object switchedP = doSwitch( object.getOnProperty() );
			int card = object.getCardinality();
			
			if (switchedP instanceof DataProperty) {
				aExpression = factory.createDataExactCardinality();
				((DataExactCardinality) aExpression).setCardinality( card );
				((DataExactCardinality) aExpression).setProperty((DataProperty) switchedP);
			} else if (switchedP instanceof com.emf4sw.owl.ObjectProperty) {
				aExpression = factory.createObjectExactCardinality();
				((ObjectExactCardinality) aExpression).setCardinality( card );
				((ObjectExactCardinality) aExpression).setProperty((com.emf4sw.owl.ObjectProperty) switchedP);
			}
			
			target.getClassExpressions().add(aExpression);
			registry.put(object, aExpression);
			
			return aExpression;
		}

		@Override
		public Object caseCardinalityQRestriction(CardinalityQRestriction object) {
			ClassExpression aExpression = null;
			final Object switchedQ = doSwitch( object.getHasClassQ() );
			final Object switchedP = doSwitch( object.getOnProperty() );
			int card = object.getCardinalityQ();
			
			if (switchedP instanceof DataProperty) {
				aExpression = factory.createDataExactCardinality();
				((DataExactCardinality) aExpression).setCardinality( card );
				((DataExactCardinality) aExpression).setProperty((DataProperty) switchedP);
				if (switchedQ instanceof DataRange) {
					((DataExactCardinality) aExpression).setDataRange(((DataRange) switchedQ));
				}
			} else if (switchedP instanceof com.emf4sw.owl.ObjectProperty) {
				aExpression = factory.createObjectExactCardinality();
				((ObjectExactCardinality) aExpression).setCardinality( card );
				((ObjectExactCardinality) aExpression).setProperty(
						(com.emf4sw.owl.ObjectProperty) switchedP);
				if (switchedQ instanceof ClassExpression) {
					((ObjectExactCardinality) aExpression).setOnClass(
							(ClassExpression) switchedQ); 
				}
			}
			
			target.getClassExpressions().add(aExpression);
			registry.put(object, aExpression);
			
			return aExpression;
		}

		@Override
		public Object caseMinCardinalityRestriction(MinCardinalityRestriction object) {
			ClassExpression aExpression = null;
			final Object switchedP = doSwitch( object.getOnProperty() );
			int card = object.getMinCardinality();
			
			if (switchedP instanceof DataProperty) {
				aExpression = factory.createDataMinCardinality();
				((DataMinCardinality) aExpression).setCardinality( card );
				((DataMinCardinality) aExpression).setProperty((DataProperty) switchedP);
			} else if (switchedP instanceof com.emf4sw.owl.ObjectProperty) {
				aExpression = factory.createObjectMinCardinality();
				((ObjectMinCardinality) aExpression).setCardinality( card );
				((ObjectMinCardinality) aExpression).setProperty(
						(com.emf4sw.owl.ObjectProperty) switchedP);
			}
			
			target.getClassExpressions().add(aExpression);
			registry.put(object, aExpression);
			
			return aExpression;
		}

		@Override
		public Object caseMinCardinalityQRestriction(MinCardinalityQRestriction object) {
			ClassExpression aExpression = null;
			final Object switchedQ = doSwitch( object.getHasClassQ() );
			final Object switchedP = doSwitch( object.getOnProperty() );
			int card = object.getMinCardinalityQ();
			
			if (switchedP instanceof DataProperty) {
				aExpression = factory.createDataMinCardinality();
				((DataMinCardinality) aExpression).setCardinality( card );
				((DataMinCardinality) aExpression).setProperty((DataProperty) switchedP);
				if (switchedQ instanceof DataRange) {
					((DataMinCardinality) aExpression).setDataRange((DataRange) switchedQ);
				}
			} else if (switchedP instanceof com.emf4sw.owl.ObjectProperty) {
				aExpression = factory.createObjectMinCardinality();
				((ObjectMinCardinality) aExpression).setCardinality( card );
				((ObjectMinCardinality) aExpression).setProperty(
						(com.emf4sw.owl.ObjectProperty) switchedP);
				if (switchedQ instanceof ClassExpression) {
					((ObjectMinCardinality) aExpression).setOnClass((ClassExpression) switchedQ);   
				}
			}
			
			target.getClassExpressions().add(aExpression);
			registry.put(object, aExpression);
			
			return aExpression;
		}

		@Override
		public Object caseMaxCardinalityRestriction(MaxCardinalityRestriction object) {
			ClassExpression aExpression = null;
			final Object switchedP = doSwitch( object.getOnProperty() );
			int card = object.getMaxCardinality();
			
			if (switchedP instanceof DataProperty) {
				aExpression = factory.createDataMaxCardinality();
				((DataMaxCardinality) aExpression).setCardinality( card );
				((DataMaxCardinality) aExpression).setProperty((DataProperty) switchedP);
			} else if (switchedP instanceof com.emf4sw.owl.ObjectProperty) {
				aExpression = factory.createObjectMaxCardinality();
				((ObjectMaxCardinality) aExpression).setCardinality( card );
				((ObjectMaxCardinality) aExpression).setProperty(
						(com.emf4sw.owl.ObjectProperty) switchedP);
			}
			
			target.getClassExpressions().add(aExpression);
			registry.put(object, aExpression);
			
			return aExpression;
		}

		@Override
		public Object caseMaxCardinalityQRestriction(MaxCardinalityQRestriction object) {
			ClassExpression aExpression = null;
			final Object switchedQ = doSwitch( object.getHasClassQ() );
			final Object switchedP = doSwitch( object.getOnProperty() );
			int card = object.getMaxCardinalityQ();
			
			if (switchedP instanceof DataProperty) {
				aExpression = factory.createDataMaxCardinality();
				((DataMaxCardinality) aExpression).setCardinality( card );
				((DataMaxCardinality) aExpression).setProperty((DataProperty) switchedP);
				if (switchedQ instanceof DataRange) {
					((DataMaxCardinality) aExpression).setDataRange((DataRange) switchedQ);
				}
			} else if (switchedP instanceof com.emf4sw.owl.ObjectProperty) {
				aExpression = factory.createObjectMaxCardinality();
				((ObjectMaxCardinality) aExpression).setCardinality( card );
				((ObjectMaxCardinality) aExpression).setProperty(
						(com.emf4sw.owl.ObjectProperty) switchedP);
				if (switchedQ instanceof ClassExpression) {
					((ObjectMaxCardinality) aExpression).setOnClass((ClassExpression) switchedQ);   
				}
			}
			
			target.getClassExpressions().add(aExpression);
			registry.put(object, aExpression);
			
			return aExpression;
		}

		@Override
		public Object caseAllValuesFromRestriction(AllValuesFromRestriction object) {
			ClassExpression all = null;
			final OntProperty property = object.getOnProperty();
			
			if (property.isObjectProperty()) {
				all = createObjectAllValuesFrom(object);
			} else if (property.isDatatypeProperty()) {
				all = createDataAllValuesFrom(object);
			}
			
			target.getClassExpressions().add(all);
			registry.put(object, all);
			
			return all;
		}

		private ClassExpression createDataAllValuesFrom(AllValuesFromRestriction object) {
			final DataAllValuesFrom all = factory.createDataAllValuesFrom();
			final Object switched = doSwitch(object.getOnProperty());
			
			if (switched instanceof DataProperty) 
			{
				all.getProperties().add((DataProperty) switched);
				Object aExpression = doSwitch(object.getAllValuesFrom());
				if (aExpression instanceof DataRange) {
					all.setAllValuesFrom((DataRange) aExpression);  
				}
			}

			return all;
		}

		private ClassExpression createObjectAllValuesFrom(AllValuesFromRestriction object) {
			final ObjectAllValuesFrom all = factory.createObjectAllValuesFrom();
			final Object switched = doSwitch(object.getOnProperty());
			
			if (switched instanceof com.emf4sw.owl.ObjectProperty) {
				all.setProperty((com.emf4sw.owl.ObjectProperty) switched);
				Object aExpression = doSwitch(object.getAllValuesFrom());
				if (aExpression instanceof ClassExpression) {
					all.setAllValuesFrom((ClassExpression) aExpression);    
				}
			}

			return all;
		}

		@Override
		public Object caseDatatypeProperty(DatatypeProperty object) {
			final DataProperty entity;
			if (registry.containsKey(object)) {
				entity = (DataProperty) registry.get(object);
			} else {
				entity = factory.createDataProperty();
				entity.setURI(object.getURI());
				if (object.getLabel(null) != null)
					entity.setLabel(object.getLabel(null));
				if (object.getComment(null) != null)
					entity.setComment(object.getComment(null));

				for (OntResource res: object.listDomain().toList()) {
					if (doSwitch(res) != null) {
						entity.getDomain().add((ClassExpression) doSwitch(res));
					}
				}
				
				for (OntResource res: object.listRange().toList()) {
					if (doSwitch(res) != null && doSwitch(res) instanceof DataRange) {
						entity.getRange().add((DataRange) doSwitch(res));
					}
				}
				
				target.getDataProperties().add(entity);
				registry.put(object, entity);
			}

			return entity;
		}

		@Override
		public Object caseObjectProperty(ObjectProperty object) {
			final com.emf4sw.owl.ObjectProperty entity;
			if (registry.containsKey(object)) {
				entity = (com.emf4sw.owl.ObjectProperty) registry.get(object);
			} else {
				entity = factory.createObjectProperty();
				entity.setURI(object.getURI());
				
				if (object.getLabel(null) != null)
					entity.setLabel(object.getLabel(null));
				
				if (object.getComment(null) != null)
					entity.setComment(object.getComment(null));
				
				for (OntResource res: object.listDomain().toList()) {
					if (doSwitch(res) != null) {
						entity.getDomain().add((ClassExpression) doSwitch(res));
					}
				}
				
				for (OntResource res: object.listRange().toList()) {
					if (doSwitch(res) != null) {
						entity.getRange().add((ClassExpression) doSwitch(res));
					}
				}
				
				target.getObjectProperties().add(entity);
				registry.put(object, entity);
			}

			return entity;
		}

		@Override
		public Object caseDatatype(com.hp.hpl.jena.ontology.DataRange object) {
			return createDatatype(object.getURI());			
		}
	}
}
