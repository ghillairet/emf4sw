/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;

import org.eclipse.emf.common.util.EList;

import com.emf4sw.rdf.BlankNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Union Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.ObjectUnionOf#getUnionOf <em>Union Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getObjectUnionOf()
 * @model
 * @generated
 */
public interface ObjectUnionOf extends ClassExpression, BlankNode {
	/**
	 * Returns the value of the '<em><b>Union Of</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.owl.ClassExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Union Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Union Of</em>' reference list.
	 * @see com.emf4sw.owl.OWLPackage#getObjectUnionOf_UnionOf()
	 * @model
	 * @generated
	 */
	EList<ClassExpression> getUnionOf();

} // ObjectUnionOf
