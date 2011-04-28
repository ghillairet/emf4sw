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
 * A representation of the model object '<em><b>Blank Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.BlankNode#getNodeID <em>Node ID</em>}</li>
 *   <li>{@link com.emf4sw.rdf.BlankNode#getGraph <em>Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.rdf.RDFPackage#getBlankNode()
 * @model
 * @generated
 */
public interface BlankNode extends SubjectNode {
	/**
	 * Returns the value of the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node ID</em>' attribute.
	 * @see #setNodeID(String)
	 * @see com.emf4sw.rdf.RDFPackage#getBlankNode_NodeID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getNodeID();

	/**
	 * Sets the value of the '{@link com.emf4sw.rdf.BlankNode#getNodeID <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node ID</em>' attribute.
	 * @see #getNodeID()
	 * @generated
	 */
	void setNodeID(String value);

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.emf4sw.rdf.RDFGraph#getBlankNodes <em>Blank Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' container reference.
	 * @see #setGraph(RDFGraph)
	 * @see com.emf4sw.rdf.RDFPackage#getBlankNode_Graph()
	 * @see com.emf4sw.rdf.RDFGraph#getBlankNodes
	 * @model opposite="blankNodes" transient="false"
	 * @generated
	 */
	RDFGraph getGraph();

	/**
	 * Sets the value of the '{@link com.emf4sw.rdf.BlankNode#getGraph <em>Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' container reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(RDFGraph value);

} // BlankNode
