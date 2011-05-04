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
 * A representation of the model object '<em><b>Class Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.ClassProperty#getIsFunctional <em>Is Functional</em>}</li>
 *   <li>{@link com.emf4sw.owl.ClassProperty#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getClassProperty()
 * @model abstract="true"
 * @generated
 */
public interface ClassProperty extends OWLProperty {
	/**
	 * Returns the value of the '<em><b>Is Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Functional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Functional</em>' attribute.
	 * @see #setIsFunctional(Boolean)
	 * @see com.emf4sw.owl.OWLPackage#getClassProperty_IsFunctional()
	 * @model
	 * @generated
	 */
	Boolean getIsFunctional();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.ClassProperty#getIsFunctional <em>Is Functional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Functional</em>' attribute.
	 * @see #getIsFunctional()
	 * @generated
	 */
	void setIsFunctional(Boolean value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.owl.ClassExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference list.
	 * @see com.emf4sw.owl.OWLPackage#getClassProperty_Domain()
	 * @model annotation="emf4sw.OWLClass uri='http://www.w3.org/2000/01/rdf-schema#domain'"
	 * @generated
	 */
	EList<ClassExpression> getDomain();

} // ClassProperty
