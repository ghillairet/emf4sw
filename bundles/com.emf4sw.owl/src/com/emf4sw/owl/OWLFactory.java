/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.emf4sw.owl.OWLPackage
 * @generated
 */
public interface OWLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OWLFactory eINSTANCE = com.emf4sw.owl.impl.OWLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ontology</em>'.
	 * @generated
	 */
	Ontology createOntology();

	/**
	 * Returns a new object of class '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class</em>'.
	 * @generated
	 */
	OWLClass createOWLClass();

	/**
	 * Returns a new object of class '<em>Object Union Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Union Of</em>'.
	 * @generated
	 */
	ObjectUnionOf createObjectUnionOf();

	/**
	 * Returns a new object of class '<em>Object Intersection Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Intersection Of</em>'.
	 * @generated
	 */
	ObjectIntersectionOf createObjectIntersectionOf();

	/**
	 * Returns a new object of class '<em>Object Complement Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Complement Of</em>'.
	 * @generated
	 */
	ObjectComplementOf createObjectComplementOf();

	/**
	 * Returns a new object of class '<em>Object One Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object One Of</em>'.
	 * @generated
	 */
	ObjectOneOf createObjectOneOf();

	/**
	 * Returns a new object of class '<em>Object Some Values From</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Some Values From</em>'.
	 * @generated
	 */
	ObjectSomeValuesFrom createObjectSomeValuesFrom();

	/**
	 * Returns a new object of class '<em>Object All Values From</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object All Values From</em>'.
	 * @generated
	 */
	ObjectAllValuesFrom createObjectAllValuesFrom();

	/**
	 * Returns a new object of class '<em>Object Has Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Has Value</em>'.
	 * @generated
	 */
	ObjectHasValue createObjectHasValue();

	/**
	 * Returns a new object of class '<em>Object Has Self</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Has Self</em>'.
	 * @generated
	 */
	ObjectHasSelf createObjectHasSelf();

	/**
	 * Returns a new object of class '<em>Object Exact Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Exact Cardinality</em>'.
	 * @generated
	 */
	ObjectExactCardinality createObjectExactCardinality();

	/**
	 * Returns a new object of class '<em>Object Max Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Max Cardinality</em>'.
	 * @generated
	 */
	ObjectMaxCardinality createObjectMaxCardinality();

	/**
	 * Returns a new object of class '<em>Object Min Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Min Cardinality</em>'.
	 * @generated
	 */
	ObjectMinCardinality createObjectMinCardinality();

	/**
	 * Returns a new object of class '<em>Data Some Values From</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Some Values From</em>'.
	 * @generated
	 */
	DataSomeValuesFrom createDataSomeValuesFrom();

	/**
	 * Returns a new object of class '<em>Data All Values From</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data All Values From</em>'.
	 * @generated
	 */
	DataAllValuesFrom createDataAllValuesFrom();

	/**
	 * Returns a new object of class '<em>Data Has Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Has Value</em>'.
	 * @generated
	 */
	DataHasValue createDataHasValue();

	/**
	 * Returns a new object of class '<em>Data Exact Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Exact Cardinality</em>'.
	 * @generated
	 */
	DataExactCardinality createDataExactCardinality();

	/**
	 * Returns a new object of class '<em>Data Max Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Max Cardinality</em>'.
	 * @generated
	 */
	DataMaxCardinality createDataMaxCardinality();

	/**
	 * Returns a new object of class '<em>Data Min Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Min Cardinality</em>'.
	 * @generated
	 */
	DataMinCardinality createDataMinCardinality();

	/**
	 * Returns a new object of class '<em>Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Property</em>'.
	 * @generated
	 */
	DataProperty createDataProperty();

	/**
	 * Returns a new object of class '<em>Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Property</em>'.
	 * @generated
	 */
	ObjectProperty createObjectProperty();

	/**
	 * Returns a new object of class '<em>Object Property Chain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Property Chain</em>'.
	 * @generated
	 */
	ObjectPropertyChain createObjectPropertyChain();

	/**
	 * Returns a new object of class '<em>Annotation Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Property</em>'.
	 * @generated
	 */
	AnnotationProperty createAnnotationProperty();

	/**
	 * Returns a new object of class '<em>Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype</em>'.
	 * @generated
	 */
	OWLDatatype createOWLDatatype();

	/**
	 * Returns a new object of class '<em>Data Complement Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Complement Of</em>'.
	 * @generated
	 */
	DataComplementOf createDataComplementOf();

	/**
	 * Returns a new object of class '<em>Data Union Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Union Of</em>'.
	 * @generated
	 */
	DataUnionOf createDataUnionOf();

	/**
	 * Returns a new object of class '<em>Data Intersection Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Intersection Of</em>'.
	 * @generated
	 */
	DataIntersectionOf createDataIntersectionOf();

	/**
	 * Returns a new object of class '<em>Data One Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data One Of</em>'.
	 * @generated
	 */
	DataOneOf createDataOneOf();

	/**
	 * Returns a new object of class '<em>Datatype Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Restriction</em>'.
	 * @generated
	 */
	DatatypeRestriction createDatatypeRestriction();

	/**
	 * Returns a new object of class '<em>Datatype Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Definition</em>'.
	 * @generated
	 */
	DatatypeDefinition createDatatypeDefinition();

	/**
	 * Returns a new object of class '<em>Facet Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facet Restriction</em>'.
	 * @generated
	 */
	FacetRestriction createFacetRestriction();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns a new object of class '<em>Individual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Individual</em>'.
	 * @generated
	 */
	Individual createIndividual();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OWLPackage getOWLPackage();

} //OWLFactory
