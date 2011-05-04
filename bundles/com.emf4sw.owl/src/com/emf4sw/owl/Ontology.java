/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;

import org.eclipse.emf.common.util.EList;

import com.emf4sw.rdf.DocumentGraph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ontology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.Ontology#getClasses <em>Classes</em>}</li>
 *   <li>{@link com.emf4sw.owl.Ontology#getDataProperties <em>Data Properties</em>}</li>
 *   <li>{@link com.emf4sw.owl.Ontology#getObjectProperties <em>Object Properties</em>}</li>
 *   <li>{@link com.emf4sw.owl.Ontology#getDataRanges <em>Data Ranges</em>}</li>
 *   <li>{@link com.emf4sw.owl.Ontology#getClassExpressions <em>Class Expressions</em>}</li>
 *   <li>{@link com.emf4sw.owl.Ontology#getOwlDatatypes <em>Owl Datatypes</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getOntology()
 * @model annotation="emf4sw.OWLClass uri='http://www.w3.org/2002/07/owl#Ontology'"
 * @generated
 */
public interface Ontology extends DocumentGraph, AnnotatedElement {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link com.emf4sw.owl.OWLClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see com.emf4sw.owl.OWLPackage#getOntology_Classes()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#nodes'"
	 * @generated
	 */
	EList<OWLClass> getClasses();

	/**
	 * Returns the value of the '<em><b>Data Properties</b></em>' containment reference list.
	 * The list contents are of type {@link com.emf4sw.owl.DataProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Properties</em>' containment reference list.
	 * @see com.emf4sw.owl.OWLPackage#getOntology_DataProperties()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#nodes'"
	 * @generated
	 */
	EList<DataProperty> getDataProperties();

	/**
	 * Returns the value of the '<em><b>Object Properties</b></em>' containment reference list.
	 * The list contents are of type {@link com.emf4sw.owl.ObjectProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Properties</em>' containment reference list.
	 * @see com.emf4sw.owl.OWLPackage#getOntology_ObjectProperties()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#nodes'"
	 * @generated
	 */
	EList<ObjectProperty> getObjectProperties();

	/**
	 * Returns the value of the '<em><b>Data Ranges</b></em>' containment reference list.
	 * The list contents are of type {@link com.emf4sw.owl.DataRange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Ranges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Ranges</em>' containment reference list.
	 * @see com.emf4sw.owl.OWLPackage#getOntology_DataRanges()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#nodes'"
	 * @generated
	 */
	EList<DataRange> getDataRanges();

	/**
	 * Returns the value of the '<em><b>Class Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link com.emf4sw.owl.ClassExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Expressions</em>' containment reference list.
	 * @see com.emf4sw.owl.OWLPackage#getOntology_ClassExpressions()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#nodes'"
	 * @generated
	 */
	EList<ClassExpression> getClassExpressions();

	/**
	 * Returns the value of the '<em><b>Owl Datatypes</b></em>' containment reference list.
	 * The list contents are of type {@link com.emf4sw.owl.OWLDatatype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owl Datatypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owl Datatypes</em>' containment reference list.
	 * @see com.emf4sw.owl.OWLPackage#getOntology_OwlDatatypes()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#nodes'"
	 * @generated
	 */
	EList<OWLDatatype> getOwlDatatypes();

} // Ontology
