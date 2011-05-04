/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object All Values From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.ObjectAllValuesFrom#getAllValuesFrom <em>All Values From</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getObjectAllValuesFrom()
 * @model
 * @generated
 */
public interface ObjectAllValuesFrom extends ObjectPropertyRestriction {
	/**
	 * Returns the value of the '<em><b>All Values From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Values From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Values From</em>' reference.
	 * @see #setAllValuesFrom(ClassExpression)
	 * @see com.emf4sw.owl.OWLPackage#getObjectAllValuesFrom_AllValuesFrom()
	 * @model annotation="emf4sw.OWLClass uri='http://www.w3.org/2002/07/owl#allValuesFrom'"
	 * @generated
	 */
	ClassExpression getAllValuesFrom();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.ObjectAllValuesFrom#getAllValuesFrom <em>All Values From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Values From</em>' reference.
	 * @see #getAllValuesFrom()
	 * @generated
	 */
	void setAllValuesFrom(ClassExpression value);

} // ObjectAllValuesFrom
