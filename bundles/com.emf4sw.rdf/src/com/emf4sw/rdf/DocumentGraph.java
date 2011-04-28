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
 * A representation of the model object '<em><b>Document Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.DocumentGraph#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link com.emf4sw.rdf.DocumentGraph#getSubGraphs <em>Sub Graphs</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.rdf.RDFPackage#getDocumentGraph()
 * @model
 * @generated
 */
public interface DocumentGraph extends RDFGraph {
	/**
	 * Returns the value of the '<em><b>Namespaces</b></em>' containment reference list.
	 * The list contents are of type {@link com.emf4sw.rdf.Namespace}.
	 * It is bidirectional and its opposite is '{@link com.emf4sw.rdf.Namespace#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespaces</em>' containment reference list.
	 * @see com.emf4sw.rdf.RDFPackage#getDocumentGraph_Namespaces()
	 * @see com.emf4sw.rdf.Namespace#getGraph
	 * @model opposite="graph" containment="true"
	 * @generated
	 */
	EList<Namespace> getNamespaces();

	/**
	 * Returns the value of the '<em><b>Sub Graphs</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.rdf.NamedGraph}.
	 * It is bidirectional and its opposite is '{@link com.emf4sw.rdf.NamedGraph#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Graphs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Graphs</em>' reference list.
	 * @see com.emf4sw.rdf.RDFPackage#getDocumentGraph_SubGraphs()
	 * @see com.emf4sw.rdf.NamedGraph#getDocument
	 * @model opposite="document"
	 * @generated
	 */
	EList<NamedGraph> getSubGraphs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	NamedGraph getNamedGraph(String uri);

} // DocumentGraph
