/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.DatatypeDefinition#getDataRange <em>Data Range</em>}</li>
 *   <li>{@link com.emf4sw.owl.DatatypeDefinition#getDatatype <em>Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getDatatypeDefinition()
 * @model
 * @generated
 */
public interface DatatypeDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Range</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Range</em>' reference.
	 * @see #setDataRange(DataRange)
	 * @see com.emf4sw.owl.OWLPackage#getDatatypeDefinition_DataRange()
	 * @model required="true"
	 * @generated
	 */
	DataRange getDataRange();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DatatypeDefinition#getDataRange <em>Data Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Range</em>' reference.
	 * @see #getDataRange()
	 * @generated
	 */
	void setDataRange(DataRange value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' reference.
	 * @see #setDatatype(OWLDatatype)
	 * @see com.emf4sw.owl.OWLPackage#getDatatypeDefinition_Datatype()
	 * @model required="true"
	 * @generated
	 */
	OWLDatatype getDatatype();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DatatypeDefinition#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(OWLDatatype value);

} // DatatypeDefinition
