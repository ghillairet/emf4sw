/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;

import com.emf4sw.rdf.BlankNode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Property Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.ObjectPropertyRestriction#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getObjectPropertyRestriction()
 * @model abstract="true"
 * @generated
 */
public interface ObjectPropertyRestriction extends ClassExpression, BlankNode {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(ObjectProperty)
	 * @see com.emf4sw.owl.OWLPackage#getObjectPropertyRestriction_Property()
	 * @model annotation="emf4sw.OWLClass uri='http://www.w3.org/2002/07/owl#onProperty'"
	 * @generated
	 */
	ObjectProperty getProperty();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.ObjectPropertyRestriction#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(ObjectProperty value);

} // ObjectPropertyRestriction
