/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;

import org.eclipse.emf.common.util.EList;

import com.emf4sw.rdf.BlankNode;
import com.emf4sw.rdf.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object One Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.ObjectOneOf#getOneOf <em>One Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getObjectOneOf()
 * @model
 * @generated
 */
public interface ObjectOneOf extends ClassExpression, BlankNode {
	/**
	 * Returns the value of the '<em><b>One Of</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.rdf.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>One Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One Of</em>' reference list.
	 * @see com.emf4sw.owl.OWLPackage#getObjectOneOf_OneOf()
	 * @model
	 * @generated
	 */
	EList<Resource> getOneOf();

} // ObjectOneOf
