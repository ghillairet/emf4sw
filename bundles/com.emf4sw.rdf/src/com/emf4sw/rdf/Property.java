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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.Property#getPredicateOf <em>Predicate Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.rdf.RDFPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends Resource {
	/**
	 * Returns the value of the '<em><b>Predicate Of</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.rdf.Triple}.
	 * It is bidirectional and its opposite is '{@link com.emf4sw.rdf.Triple#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate Of</em>' reference list.
	 * @see com.emf4sw.rdf.RDFPackage#getProperty_PredicateOf()
	 * @see com.emf4sw.rdf.Triple#getPredicate
	 * @model opposite="predicate"
	 * @generated
	 */
	EList<Triple> getPredicateOf();

} // Property
