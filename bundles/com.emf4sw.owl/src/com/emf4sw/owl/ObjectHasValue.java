/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;

import com.emf4sw.rdf.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Has Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.ObjectHasValue#getHasValue <em>Has Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getObjectHasValue()
 * @model
 * @generated
 */
public interface ObjectHasValue extends ObjectPropertyRestriction {
	/**
	 * Returns the value of the '<em><b>Has Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Value</em>' reference.
	 * @see #setHasValue(Resource)
	 * @see com.emf4sw.owl.OWLPackage#getObjectHasValue_HasValue()
	 * @model annotation="emf4sw.OWLClass uri='http://www.w3.org/2002/07/owl#hasValue'"
	 * @generated
	 */
	Resource getHasValue();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.ObjectHasValue#getHasValue <em>Has Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Value</em>' reference.
	 * @see #getHasValue()
	 * @generated
	 */
	void setHasValue(Resource value);

} // ObjectHasValue
