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
 * A representation of the model object '<em><b>Object Intersection Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.ObjectIntersectionOf#getIntersectionOf <em>Intersection Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getObjectIntersectionOf()
 * @model
 * @generated
 */
public interface ObjectIntersectionOf extends ClassExpression, BlankNode {
	/**
	 * Returns the value of the '<em><b>Intersection Of</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.owl.ClassExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intersection Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intersection Of</em>' reference list.
	 * @see com.emf4sw.owl.OWLPackage#getObjectIntersectionOf_IntersectionOf()
	 * @model
	 * @generated
	 */
	EList<ClassExpression> getIntersectionOf();

} // ObjectIntersectionOf
