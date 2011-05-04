/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.DataProperty#getRange <em>Range</em>}</li>
 *   <li>{@link com.emf4sw.owl.DataProperty#getEquivalentProperties <em>Equivalent Properties</em>}</li>
 *   <li>{@link com.emf4sw.owl.DataProperty#getSubPropertyOf <em>Sub Property Of</em>}</li>
 *   <li>{@link com.emf4sw.owl.DataProperty#getDisjointProperties <em>Disjoint Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getDataProperty()
 * @model annotation="emf4sw.OWLClass uri='http://www.w3.org/2002/07/owl#DatatypeProperty'"
 * @generated
 */
public interface DataProperty extends ClassProperty {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.owl.DataRange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' reference list.
	 * @see com.emf4sw.owl.OWLPackage#getDataProperty_Range()
	 * @model annotation="emf4sw.OWLClass uri='http://www.w3.org/2000/01/rdf-schema#range'"
	 * @generated
	 */
	EList<DataRange> getRange();

	/**
	 * Returns the value of the '<em><b>Equivalent Properties</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.owl.DataProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent Properties</em>' reference list.
	 * @see com.emf4sw.owl.OWLPackage#getDataProperty_EquivalentProperties()
	 * @model
	 * @generated
	 */
	EList<DataProperty> getEquivalentProperties();

	/**
	 * Returns the value of the '<em><b>Sub Property Of</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.owl.DataProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Property Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Property Of</em>' reference list.
	 * @see com.emf4sw.owl.OWLPackage#getDataProperty_SubPropertyOf()
	 * @model
	 * @generated
	 */
	EList<DataProperty> getSubPropertyOf();

	/**
	 * Returns the value of the '<em><b>Disjoint Properties</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.owl.DataProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disjoint Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disjoint Properties</em>' reference list.
	 * @see com.emf4sw.owl.OWLPackage#getDataProperty_DisjointProperties()
	 * @model
	 * @generated
	 */
	EList<DataProperty> getDisjointProperties();

} // DataProperty
