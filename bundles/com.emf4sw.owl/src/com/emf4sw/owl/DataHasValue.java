/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;

import com.emf4sw.rdf.Literal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Has Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.DataHasValue#getHasValue <em>Has Value</em>}</li>
 *   <li>{@link com.emf4sw.owl.DataHasValue#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getDataHasValue()
 * @model
 * @generated
 */
public interface DataHasValue extends DataPropertyRestriction {
	/**
	 * Returns the value of the '<em><b>Has Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Value</em>' reference.
	 * @see #setHasValue(Literal)
	 * @see com.emf4sw.owl.OWLPackage#getDataHasValue_HasValue()
	 * @model annotation="emf4sw.OWLClass uri='http://www.w3.org/2002/07/owl#hasValue'"
	 * @generated
	 */
	Literal getHasValue();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DataHasValue#getHasValue <em>Has Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Value</em>' reference.
	 * @see #getHasValue()
	 * @generated
	 */
	void setHasValue(Literal value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(DataProperty)
	 * @see com.emf4sw.owl.OWLPackage#getDataHasValue_Property()
	 * @model annotation="emf4sw.OWLClass uri='http://www.w3.org/2002/07/owl#onProperty'"
	 * @generated
	 */
	DataProperty getProperty();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DataHasValue#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(DataProperty value);

} // DataHasValue
