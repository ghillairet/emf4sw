/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;

import org.eclipse.emf.ecore.EObject;

import com.emf4sw.rdf.Literal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facet Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.FacetRestriction#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link com.emf4sw.owl.FacetRestriction#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getFacetRestriction()
 * @model
 * @generated
 */
public interface FacetRestriction extends EObject {
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
	 * @see com.emf4sw.owl.OWLPackage#getFacetRestriction_Datatype()
	 * @model
	 * @generated
	 */
	DataRange getDatatype();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.FacetRestriction#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataRange value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Literal)
	 * @see com.emf4sw.owl.OWLPackage#getFacetRestriction_Value()
	 * @model
	 * @generated
	 */
	Literal getValue();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.FacetRestriction#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Literal value);

} // FacetRestriction
