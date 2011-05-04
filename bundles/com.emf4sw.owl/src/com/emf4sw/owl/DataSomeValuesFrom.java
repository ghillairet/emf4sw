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
 * A representation of the model object '<em><b>Data Some Values From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.DataSomeValuesFrom#getSomeValuesFrom <em>Some Values From</em>}</li>
 *   <li>{@link com.emf4sw.owl.DataSomeValuesFrom#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getDataSomeValuesFrom()
 * @model
 * @generated
 */
public interface DataSomeValuesFrom extends DataPropertyRestriction {
	/**
	 * Returns the value of the '<em><b>Some Values From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Some Values From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Some Values From</em>' reference.
	 * @see #setSomeValuesFrom(DataRange)
	 * @see com.emf4sw.owl.OWLPackage#getDataSomeValuesFrom_SomeValuesFrom()
	 * @model annotation="emf4sw.OWLClass uri='http://www.w3.org/2002/07/owl#someValuesFrom'"
	 * @generated
	 */
	DataRange getSomeValuesFrom();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DataSomeValuesFrom#getSomeValuesFrom <em>Some Values From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Some Values From</em>' reference.
	 * @see #getSomeValuesFrom()
	 * @generated
	 */
	void setSomeValuesFrom(DataRange value);

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
	 * @see com.emf4sw.owl.OWLPackage#getDataSomeValuesFrom_Properties()
	 * @model annotation="emf4sw.OWLClass uri='http://www.w3.org/2002/07/owl#onProperty'"
	 * @generated
	 */
	EList<DataProperty> getProperties();

} // DataSomeValuesFrom
