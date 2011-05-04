/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.emf4sw.owl.AnnotatedElement;
import com.emf4sw.owl.Annotation;
import com.emf4sw.owl.AnnotationProperty;
import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.ClassProperty;
import com.emf4sw.owl.DataAllValuesFrom;
import com.emf4sw.owl.DataComplementOf;
import com.emf4sw.owl.DataExactCardinality;
import com.emf4sw.owl.DataHasValue;
import com.emf4sw.owl.DataIntersectionOf;
import com.emf4sw.owl.DataMaxCardinality;
import com.emf4sw.owl.DataMinCardinality;
import com.emf4sw.owl.DataOneOf;
import com.emf4sw.owl.DataProperty;
import com.emf4sw.owl.DataPropertyRestriction;
import com.emf4sw.owl.DataRange;
import com.emf4sw.owl.DataSomeValuesFrom;
import com.emf4sw.owl.DataUnionOf;
import com.emf4sw.owl.DatatypeDefinition;
import com.emf4sw.owl.DatatypeRestriction;
import com.emf4sw.owl.FacetRestriction;
import com.emf4sw.owl.Individual;
import com.emf4sw.owl.OWLClass;
import com.emf4sw.owl.OWLDatatype;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.OWLProperty;
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
import com.emf4sw.owl.ObjectPropertyRestriction;
import com.emf4sw.owl.ObjectSomeValuesFrom;
import com.emf4sw.owl.ObjectUnionOf;
import com.emf4sw.owl.Ontology;
import com.emf4sw.rdf.BlankNode;
import com.emf4sw.rdf.Datatype;
import com.emf4sw.rdf.DocumentGraph;
import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.Resource;
import com.emf4sw.rdf.SubjectNode;
import com.emf4sw.rdf.URIElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.emf4sw.owl.OWLPackage
 * @generated
 */
public class OWLSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OWLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLSwitch() {
		if (modelPackage == null) {
			modelPackage = OWLPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OWLPackage.ONTOLOGY: {
				Ontology ontology = (Ontology)theEObject;
				T result = caseOntology(ontology);
				if (result == null) result = caseDocumentGraph(ontology);
				if (result == null) result = caseAnnotatedElement(ontology);
				if (result == null) result = caseRDFGraph(ontology);
				if (result == null) result = caseURIElement(ontology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.ANNOTATED_ELEMENT: {
				AnnotatedElement annotatedElement = (AnnotatedElement)theEObject;
				T result = caseAnnotatedElement(annotatedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.CLASS_EXPRESSION: {
				ClassExpression classExpression = (ClassExpression)theEObject;
				T result = caseClassExpression(classExpression);
				if (result == null) result = caseSubjectNode(classExpression);
				if (result == null) result = caseAnnotatedElement(classExpression);
				if (result == null) result = caseNode(classExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OWL_CLASS: {
				OWLClass owlClass = (OWLClass)theEObject;
				T result = caseOWLClass(owlClass);
				if (result == null) result = caseResource(owlClass);
				if (result == null) result = caseClassExpression(owlClass);
				if (result == null) result = caseSubjectNode(owlClass);
				if (result == null) result = caseURIElement(owlClass);
				if (result == null) result = caseAnnotatedElement(owlClass);
				if (result == null) result = caseNode(owlClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_UNION_OF: {
				ObjectUnionOf objectUnionOf = (ObjectUnionOf)theEObject;
				T result = caseObjectUnionOf(objectUnionOf);
				if (result == null) result = caseClassExpression(objectUnionOf);
				if (result == null) result = caseBlankNode(objectUnionOf);
				if (result == null) result = caseSubjectNode(objectUnionOf);
				if (result == null) result = caseAnnotatedElement(objectUnionOf);
				if (result == null) result = caseNode(objectUnionOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_INTERSECTION_OF: {
				ObjectIntersectionOf objectIntersectionOf = (ObjectIntersectionOf)theEObject;
				T result = caseObjectIntersectionOf(objectIntersectionOf);
				if (result == null) result = caseClassExpression(objectIntersectionOf);
				if (result == null) result = caseBlankNode(objectIntersectionOf);
				if (result == null) result = caseSubjectNode(objectIntersectionOf);
				if (result == null) result = caseAnnotatedElement(objectIntersectionOf);
				if (result == null) result = caseNode(objectIntersectionOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_COMPLEMENT_OF: {
				ObjectComplementOf objectComplementOf = (ObjectComplementOf)theEObject;
				T result = caseObjectComplementOf(objectComplementOf);
				if (result == null) result = caseClassExpression(objectComplementOf);
				if (result == null) result = caseBlankNode(objectComplementOf);
				if (result == null) result = caseSubjectNode(objectComplementOf);
				if (result == null) result = caseAnnotatedElement(objectComplementOf);
				if (result == null) result = caseNode(objectComplementOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_ONE_OF: {
				ObjectOneOf objectOneOf = (ObjectOneOf)theEObject;
				T result = caseObjectOneOf(objectOneOf);
				if (result == null) result = caseClassExpression(objectOneOf);
				if (result == null) result = caseBlankNode(objectOneOf);
				if (result == null) result = caseSubjectNode(objectOneOf);
				if (result == null) result = caseAnnotatedElement(objectOneOf);
				if (result == null) result = caseNode(objectOneOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_PROPERTY_RESTRICTION: {
				ObjectPropertyRestriction objectPropertyRestriction = (ObjectPropertyRestriction)theEObject;
				T result = caseObjectPropertyRestriction(objectPropertyRestriction);
				if (result == null) result = caseClassExpression(objectPropertyRestriction);
				if (result == null) result = caseBlankNode(objectPropertyRestriction);
				if (result == null) result = caseSubjectNode(objectPropertyRestriction);
				if (result == null) result = caseAnnotatedElement(objectPropertyRestriction);
				if (result == null) result = caseNode(objectPropertyRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_SOME_VALUES_FROM: {
				ObjectSomeValuesFrom objectSomeValuesFrom = (ObjectSomeValuesFrom)theEObject;
				T result = caseObjectSomeValuesFrom(objectSomeValuesFrom);
				if (result == null) result = caseObjectPropertyRestriction(objectSomeValuesFrom);
				if (result == null) result = caseClassExpression(objectSomeValuesFrom);
				if (result == null) result = caseBlankNode(objectSomeValuesFrom);
				if (result == null) result = caseSubjectNode(objectSomeValuesFrom);
				if (result == null) result = caseAnnotatedElement(objectSomeValuesFrom);
				if (result == null) result = caseNode(objectSomeValuesFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_ALL_VALUES_FROM: {
				ObjectAllValuesFrom objectAllValuesFrom = (ObjectAllValuesFrom)theEObject;
				T result = caseObjectAllValuesFrom(objectAllValuesFrom);
				if (result == null) result = caseObjectPropertyRestriction(objectAllValuesFrom);
				if (result == null) result = caseClassExpression(objectAllValuesFrom);
				if (result == null) result = caseBlankNode(objectAllValuesFrom);
				if (result == null) result = caseSubjectNode(objectAllValuesFrom);
				if (result == null) result = caseAnnotatedElement(objectAllValuesFrom);
				if (result == null) result = caseNode(objectAllValuesFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_HAS_VALUE: {
				ObjectHasValue objectHasValue = (ObjectHasValue)theEObject;
				T result = caseObjectHasValue(objectHasValue);
				if (result == null) result = caseObjectPropertyRestriction(objectHasValue);
				if (result == null) result = caseClassExpression(objectHasValue);
				if (result == null) result = caseBlankNode(objectHasValue);
				if (result == null) result = caseSubjectNode(objectHasValue);
				if (result == null) result = caseAnnotatedElement(objectHasValue);
				if (result == null) result = caseNode(objectHasValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_HAS_SELF: {
				ObjectHasSelf objectHasSelf = (ObjectHasSelf)theEObject;
				T result = caseObjectHasSelf(objectHasSelf);
				if (result == null) result = caseObjectPropertyRestriction(objectHasSelf);
				if (result == null) result = caseClassExpression(objectHasSelf);
				if (result == null) result = caseBlankNode(objectHasSelf);
				if (result == null) result = caseSubjectNode(objectHasSelf);
				if (result == null) result = caseAnnotatedElement(objectHasSelf);
				if (result == null) result = caseNode(objectHasSelf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_EXACT_CARDINALITY: {
				ObjectExactCardinality objectExactCardinality = (ObjectExactCardinality)theEObject;
				T result = caseObjectExactCardinality(objectExactCardinality);
				if (result == null) result = caseObjectPropertyRestriction(objectExactCardinality);
				if (result == null) result = caseClassExpression(objectExactCardinality);
				if (result == null) result = caseBlankNode(objectExactCardinality);
				if (result == null) result = caseSubjectNode(objectExactCardinality);
				if (result == null) result = caseAnnotatedElement(objectExactCardinality);
				if (result == null) result = caseNode(objectExactCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_MAX_CARDINALITY: {
				ObjectMaxCardinality objectMaxCardinality = (ObjectMaxCardinality)theEObject;
				T result = caseObjectMaxCardinality(objectMaxCardinality);
				if (result == null) result = caseObjectPropertyRestriction(objectMaxCardinality);
				if (result == null) result = caseClassExpression(objectMaxCardinality);
				if (result == null) result = caseBlankNode(objectMaxCardinality);
				if (result == null) result = caseSubjectNode(objectMaxCardinality);
				if (result == null) result = caseAnnotatedElement(objectMaxCardinality);
				if (result == null) result = caseNode(objectMaxCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_MIN_CARDINALITY: {
				ObjectMinCardinality objectMinCardinality = (ObjectMinCardinality)theEObject;
				T result = caseObjectMinCardinality(objectMinCardinality);
				if (result == null) result = caseObjectPropertyRestriction(objectMinCardinality);
				if (result == null) result = caseClassExpression(objectMinCardinality);
				if (result == null) result = caseBlankNode(objectMinCardinality);
				if (result == null) result = caseSubjectNode(objectMinCardinality);
				if (result == null) result = caseAnnotatedElement(objectMinCardinality);
				if (result == null) result = caseNode(objectMinCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_PROPERTY_RESTRICTION: {
				DataPropertyRestriction dataPropertyRestriction = (DataPropertyRestriction)theEObject;
				T result = caseDataPropertyRestriction(dataPropertyRestriction);
				if (result == null) result = caseClassExpression(dataPropertyRestriction);
				if (result == null) result = caseBlankNode(dataPropertyRestriction);
				if (result == null) result = caseSubjectNode(dataPropertyRestriction);
				if (result == null) result = caseAnnotatedElement(dataPropertyRestriction);
				if (result == null) result = caseNode(dataPropertyRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_SOME_VALUES_FROM: {
				DataSomeValuesFrom dataSomeValuesFrom = (DataSomeValuesFrom)theEObject;
				T result = caseDataSomeValuesFrom(dataSomeValuesFrom);
				if (result == null) result = caseDataPropertyRestriction(dataSomeValuesFrom);
				if (result == null) result = caseClassExpression(dataSomeValuesFrom);
				if (result == null) result = caseBlankNode(dataSomeValuesFrom);
				if (result == null) result = caseSubjectNode(dataSomeValuesFrom);
				if (result == null) result = caseAnnotatedElement(dataSomeValuesFrom);
				if (result == null) result = caseNode(dataSomeValuesFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_ALL_VALUES_FROM: {
				DataAllValuesFrom dataAllValuesFrom = (DataAllValuesFrom)theEObject;
				T result = caseDataAllValuesFrom(dataAllValuesFrom);
				if (result == null) result = caseDataPropertyRestriction(dataAllValuesFrom);
				if (result == null) result = caseClassExpression(dataAllValuesFrom);
				if (result == null) result = caseBlankNode(dataAllValuesFrom);
				if (result == null) result = caseSubjectNode(dataAllValuesFrom);
				if (result == null) result = caseAnnotatedElement(dataAllValuesFrom);
				if (result == null) result = caseNode(dataAllValuesFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_HAS_VALUE: {
				DataHasValue dataHasValue = (DataHasValue)theEObject;
				T result = caseDataHasValue(dataHasValue);
				if (result == null) result = caseDataPropertyRestriction(dataHasValue);
				if (result == null) result = caseClassExpression(dataHasValue);
				if (result == null) result = caseBlankNode(dataHasValue);
				if (result == null) result = caseSubjectNode(dataHasValue);
				if (result == null) result = caseAnnotatedElement(dataHasValue);
				if (result == null) result = caseNode(dataHasValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_EXACT_CARDINALITY: {
				DataExactCardinality dataExactCardinality = (DataExactCardinality)theEObject;
				T result = caseDataExactCardinality(dataExactCardinality);
				if (result == null) result = caseDataPropertyRestriction(dataExactCardinality);
				if (result == null) result = caseClassExpression(dataExactCardinality);
				if (result == null) result = caseBlankNode(dataExactCardinality);
				if (result == null) result = caseSubjectNode(dataExactCardinality);
				if (result == null) result = caseAnnotatedElement(dataExactCardinality);
				if (result == null) result = caseNode(dataExactCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_MAX_CARDINALITY: {
				DataMaxCardinality dataMaxCardinality = (DataMaxCardinality)theEObject;
				T result = caseDataMaxCardinality(dataMaxCardinality);
				if (result == null) result = caseDataPropertyRestriction(dataMaxCardinality);
				if (result == null) result = caseClassExpression(dataMaxCardinality);
				if (result == null) result = caseBlankNode(dataMaxCardinality);
				if (result == null) result = caseSubjectNode(dataMaxCardinality);
				if (result == null) result = caseAnnotatedElement(dataMaxCardinality);
				if (result == null) result = caseNode(dataMaxCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_MIN_CARDINALITY: {
				DataMinCardinality dataMinCardinality = (DataMinCardinality)theEObject;
				T result = caseDataMinCardinality(dataMinCardinality);
				if (result == null) result = caseDataPropertyRestriction(dataMinCardinality);
				if (result == null) result = caseClassExpression(dataMinCardinality);
				if (result == null) result = caseBlankNode(dataMinCardinality);
				if (result == null) result = caseSubjectNode(dataMinCardinality);
				if (result == null) result = caseAnnotatedElement(dataMinCardinality);
				if (result == null) result = caseNode(dataMinCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OWL_PROPERTY: {
				OWLProperty owlProperty = (OWLProperty)theEObject;
				T result = caseOWLProperty(owlProperty);
				if (result == null) result = caseResource(owlProperty);
				if (result == null) result = caseAnnotatedElement(owlProperty);
				if (result == null) result = caseSubjectNode(owlProperty);
				if (result == null) result = caseURIElement(owlProperty);
				if (result == null) result = caseNode(owlProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.CLASS_PROPERTY: {
				ClassProperty classProperty = (ClassProperty)theEObject;
				T result = caseClassProperty(classProperty);
				if (result == null) result = caseOWLProperty(classProperty);
				if (result == null) result = caseResource(classProperty);
				if (result == null) result = caseAnnotatedElement(classProperty);
				if (result == null) result = caseSubjectNode(classProperty);
				if (result == null) result = caseURIElement(classProperty);
				if (result == null) result = caseNode(classProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_PROPERTY: {
				DataProperty dataProperty = (DataProperty)theEObject;
				T result = caseDataProperty(dataProperty);
				if (result == null) result = caseClassProperty(dataProperty);
				if (result == null) result = caseOWLProperty(dataProperty);
				if (result == null) result = caseResource(dataProperty);
				if (result == null) result = caseAnnotatedElement(dataProperty);
				if (result == null) result = caseSubjectNode(dataProperty);
				if (result == null) result = caseURIElement(dataProperty);
				if (result == null) result = caseNode(dataProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_PROPERTY: {
				ObjectProperty objectProperty = (ObjectProperty)theEObject;
				T result = caseObjectProperty(objectProperty);
				if (result == null) result = caseClassProperty(objectProperty);
				if (result == null) result = caseOWLProperty(objectProperty);
				if (result == null) result = caseResource(objectProperty);
				if (result == null) result = caseAnnotatedElement(objectProperty);
				if (result == null) result = caseSubjectNode(objectProperty);
				if (result == null) result = caseURIElement(objectProperty);
				if (result == null) result = caseNode(objectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_PROPERTY_CHAIN: {
				ObjectPropertyChain objectPropertyChain = (ObjectPropertyChain)theEObject;
				T result = caseObjectPropertyChain(objectPropertyChain);
				if (result == null) result = caseObjectProperty(objectPropertyChain);
				if (result == null) result = caseClassProperty(objectPropertyChain);
				if (result == null) result = caseOWLProperty(objectPropertyChain);
				if (result == null) result = caseResource(objectPropertyChain);
				if (result == null) result = caseAnnotatedElement(objectPropertyChain);
				if (result == null) result = caseSubjectNode(objectPropertyChain);
				if (result == null) result = caseURIElement(objectPropertyChain);
				if (result == null) result = caseNode(objectPropertyChain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.ANNOTATION_PROPERTY: {
				AnnotationProperty annotationProperty = (AnnotationProperty)theEObject;
				T result = caseAnnotationProperty(annotationProperty);
				if (result == null) result = caseOWLProperty(annotationProperty);
				if (result == null) result = caseResource(annotationProperty);
				if (result == null) result = caseAnnotatedElement(annotationProperty);
				if (result == null) result = caseSubjectNode(annotationProperty);
				if (result == null) result = caseURIElement(annotationProperty);
				if (result == null) result = caseNode(annotationProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_RANGE: {
				DataRange dataRange = (DataRange)theEObject;
				T result = caseDataRange(dataRange);
				if (result == null) result = caseSubjectNode(dataRange);
				if (result == null) result = caseAnnotatedElement(dataRange);
				if (result == null) result = caseNode(dataRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OWL_DATATYPE: {
				OWLDatatype owlDatatype = (OWLDatatype)theEObject;
				T result = caseOWLDatatype(owlDatatype);
				if (result == null) result = caseDatatype(owlDatatype);
				if (result == null) result = caseDataRange(owlDatatype);
				if (result == null) result = caseResource(owlDatatype);
				if (result == null) result = caseAnnotatedElement(owlDatatype);
				if (result == null) result = caseSubjectNode(owlDatatype);
				if (result == null) result = caseURIElement(owlDatatype);
				if (result == null) result = caseNode(owlDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_COMPLEMENT_OF: {
				DataComplementOf dataComplementOf = (DataComplementOf)theEObject;
				T result = caseDataComplementOf(dataComplementOf);
				if (result == null) result = caseDataRange(dataComplementOf);
				if (result == null) result = caseSubjectNode(dataComplementOf);
				if (result == null) result = caseAnnotatedElement(dataComplementOf);
				if (result == null) result = caseNode(dataComplementOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_UNION_OF: {
				DataUnionOf dataUnionOf = (DataUnionOf)theEObject;
				T result = caseDataUnionOf(dataUnionOf);
				if (result == null) result = caseDataRange(dataUnionOf);
				if (result == null) result = caseSubjectNode(dataUnionOf);
				if (result == null) result = caseAnnotatedElement(dataUnionOf);
				if (result == null) result = caseNode(dataUnionOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_INTERSECTION_OF: {
				DataIntersectionOf dataIntersectionOf = (DataIntersectionOf)theEObject;
				T result = caseDataIntersectionOf(dataIntersectionOf);
				if (result == null) result = caseDataRange(dataIntersectionOf);
				if (result == null) result = caseSubjectNode(dataIntersectionOf);
				if (result == null) result = caseAnnotatedElement(dataIntersectionOf);
				if (result == null) result = caseNode(dataIntersectionOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_ONE_OF: {
				DataOneOf dataOneOf = (DataOneOf)theEObject;
				T result = caseDataOneOf(dataOneOf);
				if (result == null) result = caseDataRange(dataOneOf);
				if (result == null) result = caseSubjectNode(dataOneOf);
				if (result == null) result = caseAnnotatedElement(dataOneOf);
				if (result == null) result = caseNode(dataOneOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATATYPE_RESTRICTION: {
				DatatypeRestriction datatypeRestriction = (DatatypeRestriction)theEObject;
				T result = caseDatatypeRestriction(datatypeRestriction);
				if (result == null) result = caseDataRange(datatypeRestriction);
				if (result == null) result = caseSubjectNode(datatypeRestriction);
				if (result == null) result = caseAnnotatedElement(datatypeRestriction);
				if (result == null) result = caseNode(datatypeRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATATYPE_DEFINITION: {
				DatatypeDefinition datatypeDefinition = (DatatypeDefinition)theEObject;
				T result = caseDatatypeDefinition(datatypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.FACET_RESTRICTION: {
				FacetRestriction facetRestriction = (FacetRestriction)theEObject;
				T result = caseFacetRestriction(facetRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = caseAnnotatedElement(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.INDIVIDUAL: {
				Individual individual = (Individual)theEObject;
				T result = caseIndividual(individual);
				if (result == null) result = caseResource(individual);
				if (result == null) result = caseSubjectNode(individual);
				if (result == null) result = caseURIElement(individual);
				if (result == null) result = caseNode(individual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntology(Ontology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotated Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotated Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotatedElement(AnnotatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassExpression(ClassExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOWLClass(OWLClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Union Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Union Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectUnionOf(ObjectUnionOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Intersection Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Intersection Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectIntersectionOf(ObjectIntersectionOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Complement Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Complement Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectComplementOf(ObjectComplementOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object One Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object One Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectOneOf(ObjectOneOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectPropertyRestriction(ObjectPropertyRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Some Values From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Some Values From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectSomeValuesFrom(ObjectSomeValuesFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object All Values From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object All Values From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectAllValuesFrom(ObjectAllValuesFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Has Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Has Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectHasValue(ObjectHasValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Has Self</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Has Self</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectHasSelf(ObjectHasSelf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Exact Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Exact Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectExactCardinality(ObjectExactCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Max Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Max Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectMaxCardinality(ObjectMaxCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Min Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Min Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectMinCardinality(ObjectMinCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPropertyRestriction(DataPropertyRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Some Values From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Some Values From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSomeValuesFrom(DataSomeValuesFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data All Values From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data All Values From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAllValuesFrom(DataAllValuesFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Has Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Has Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataHasValue(DataHasValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Exact Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Exact Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataExactCardinality(DataExactCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Max Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Max Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataMaxCardinality(DataMaxCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Min Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Min Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataMinCardinality(DataMinCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOWLProperty(OWLProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassProperty(ClassProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataProperty(DataProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectProperty(ObjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property Chain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property Chain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectPropertyChain(ObjectPropertyChain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationProperty(AnnotationProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRange(DataRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOWLDatatype(OWLDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Complement Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Complement Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataComplementOf(DataComplementOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Union Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Union Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataUnionOf(DataUnionOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Intersection Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Intersection Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataIntersectionOf(DataIntersectionOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data One Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data One Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataOneOf(DataOneOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeRestriction(DatatypeRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeDefinition(DatatypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facet Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facet Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacetRestriction(FacetRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividual(Individual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URI Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URI Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURIElement(URIElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFGraph(RDFGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentGraph(DocumentGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectNode(SubjectNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blank Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blank Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlankNode(BlankNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatype(Datatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //OWLSwitch
