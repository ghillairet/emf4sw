/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Exact Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.ObjectExactCardinality#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link com.emf4sw.owl.ObjectExactCardinality#getOnClass <em>On Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getObjectExactCardinality()
 * @model
 * @generated
 */
public interface ObjectExactCardinality extends ObjectPropertyRestriction {
	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(int)
	 * @see com.emf4sw.owl.OWLPackage#getObjectExactCardinality_Cardinality()
	 * @model annotation="emf4sw.OWLClass uri='http://www.w3.org/2002/07/owl#cardinality'"
	 * @generated
	 */
	int getCardinality();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.ObjectExactCardinality#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(int value);

	/**
	 * Returns the value of the '<em><b>On Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Class</em>' reference.
	 * @see #setOnClass(ClassExpression)
	 * @see com.emf4sw.owl.OWLPackage#getObjectExactCardinality_OnClass()
	 * @model annotation="emf4sw.OWLClass uri='http://www.w3.org/2002/07/owl#onClass'"
	 * @generated
	 */
	ClassExpression getOnClass();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.ObjectExactCardinality#getOnClass <em>On Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Class</em>' reference.
	 * @see #getOnClass()
	 * @generated
	 */
	void setOnClass(ClassExpression value);

} // ObjectExactCardinality
