/*******************************************************************************
 * Copyright (c) 2011 Guillaume Hillairet.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Guillaume Hillairet - initial API and implementation
 *******************************************************************************/
package com.emf4sw.rdf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triple Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.TripleNode#getTriple <em>Triple</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.rdf.RDFPackage#getTripleNode()
 * @model
 * @generated
 */
public interface TripleNode extends Resource {
	/**
	 * Returns the value of the '<em><b>Triple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triple</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triple</em>' reference.
	 * @see #setTriple(Triple)
	 * @see com.emf4sw.rdf.RDFPackage#getTripleNode_Triple()
	 * @model required="true"
	 * @generated
	 */
	Triple getTriple();

	/**
	 * Sets the value of the '{@link com.emf4sw.rdf.TripleNode#getTriple <em>Triple</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triple</em>' reference.
	 * @see #getTriple()
	 * @generated
	 */
	void setTriple(Triple value);

} // TripleNode
