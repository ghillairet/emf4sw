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
 * A representation of the model object '<em><b>Data All Values From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.DataAllValuesFrom#getAllValuesFrom <em>All Values From</em>}</li>
 *   <li>{@link com.emf4sw.owl.DataAllValuesFrom#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getDataAllValuesFrom()
 * @model
 * @generated
 */
public interface DataAllValuesFrom extends DataPropertyRestriction {
	/**
	 * Returns the value of the '<em><b>All Values From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Values From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Values From</em>' reference.
	 * @see #setAllValuesFrom(DataRange)
	 * @see com.emf4sw.owl.OWLPackage#getDataAllValuesFrom_AllValuesFrom()
	 * @model annotation="emf4sw.OWLClass uri='http://www.w3.org/2002/07/owl#allValuesFrom'"
	 * @generated
	 */
	DataRange getAllValuesFrom();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DataAllValuesFrom#getAllValuesFrom <em>All Values From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Values From</em>' reference.
	 * @see #getAllValuesFrom()
	 * @generated
	 */
	void setAllValuesFrom(DataRange value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.owl.DataProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see com.emf4sw.owl.OWLPackage#getDataAllValuesFrom_Properties()
	 * @model annotation="emf4sw.OWLClass uri='http://www.w3.org/2002/07/owl#onProperty'"
	 * @generated
	 */
	EList<DataProperty> getProperties();

} // DataAllValuesFrom
