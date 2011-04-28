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
 * A representation of the model object '<em><b>Named Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.NamedGraph#getDocument <em>Document</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.rdf.RDFPackage#getNamedGraph()
 * @model
 * @generated
 */
public interface NamedGraph extends RDFGraph, Node {

	/**
	 * Returns the value of the '<em><b>Document</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.emf4sw.rdf.DocumentGraph#getSubGraphs <em>Sub Graphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' reference.
	 * @see #setDocument(DocumentGraph)
	 * @see com.emf4sw.rdf.RDFPackage#getNamedGraph_Document()
	 * @see com.emf4sw.rdf.DocumentGraph#getSubGraphs
	 * @model opposite="subGraphs" required="true"
	 * @generated
	 */
	DocumentGraph getDocument();

	/**
	 * Sets the value of the '{@link com.emf4sw.rdf.NamedGraph#getDocument <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(DocumentGraph value);

} // NamedGraph
