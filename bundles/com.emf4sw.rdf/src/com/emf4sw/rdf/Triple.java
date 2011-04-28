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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.Triple#getSubject <em>Subject</em>}</li>
 *   <li>{@link com.emf4sw.rdf.Triple#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link com.emf4sw.rdf.Triple#getObject <em>Object</em>}</li>
 *   <li>{@link com.emf4sw.rdf.Triple#getGraph <em>Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.rdf.RDFPackage#getTriple()
 * @model
 * @generated
 */
public interface Triple extends EObject {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.emf4sw.rdf.SubjectNode#getSubjectOf <em>Subject Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(SubjectNode)
	 * @see com.emf4sw.rdf.RDFPackage#getTriple_Subject()
	 * @see com.emf4sw.rdf.SubjectNode#getSubjectOf
	 * @model opposite="subjectOf" required="true"
	 * @generated
	 */
	SubjectNode getSubject();

	/**
	 * Sets the value of the '{@link com.emf4sw.rdf.Triple#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(SubjectNode value);

	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.emf4sw.rdf.Property#getPredicateOf <em>Predicate Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' reference.
	 * @see #setPredicate(Property)
	 * @see com.emf4sw.rdf.RDFPackage#getTriple_Predicate()
	 * @see com.emf4sw.rdf.Property#getPredicateOf
	 * @model opposite="predicateOf" required="true"
	 * @generated
	 */
	Property getPredicate();

	/**
	 * Sets the value of the '{@link com.emf4sw.rdf.Triple#getPredicate <em>Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(Property value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.emf4sw.rdf.Node#getObjectOf <em>Object Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(Node)
	 * @see com.emf4sw.rdf.RDFPackage#getTriple_Object()
	 * @see com.emf4sw.rdf.Node#getObjectOf
	 * @model opposite="objectOf" required="true"
	 * @generated
	 */
	Node getObject();

	/**
	 * Sets the value of the '{@link com.emf4sw.rdf.Triple#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(Node value);

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.emf4sw.rdf.RDFGraph#getTriples <em>Triples</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' container reference.
	 * @see #setGraph(RDFGraph)
	 * @see com.emf4sw.rdf.RDFPackage#getTriple_Graph()
	 * @see com.emf4sw.rdf.RDFGraph#getTriples
	 * @model opposite="triples" required="true" transient="false"
	 * @generated
	 */
	RDFGraph getGraph();

	/**
	 * Sets the value of the '{@link com.emf4sw.rdf.Triple#getGraph <em>Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' container reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(RDFGraph value);

} // Triple
