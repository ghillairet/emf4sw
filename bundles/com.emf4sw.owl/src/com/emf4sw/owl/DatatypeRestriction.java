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
 * A representation of the model object '<em><b>Datatype Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.DatatypeRestriction#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link com.emf4sw.owl.DatatypeRestriction#getRestrictions <em>Restrictions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getDatatypeRestriction()
 * @model
 * @generated
 */
public interface DatatypeRestriction extends DataRange {
	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' reference.
	 * @see #setDatatype(DataRange)
	 * @see com.emf4sw.owl.OWLPackage#getDatatypeRestriction_Datatype()
	 * @model
	 * @generated
	 */
	DataRange getDatatype();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DatatypeRestriction#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataRange value);

	/**
	 * Returns the value of the '<em><b>Restrictions</b></em>' containment reference list.
	 * The list contents are of type {@link com.emf4sw.owl.FacetRestriction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restrictions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restrictions</em>' containment reference list.
	 * @see com.emf4sw.owl.OWLPackage#getDatatypeRestriction_Restrictions()
	 * @model containment="true"
	 * @generated
	 */
	EList<FacetRestriction> getRestrictions();

} // DatatypeRestriction
