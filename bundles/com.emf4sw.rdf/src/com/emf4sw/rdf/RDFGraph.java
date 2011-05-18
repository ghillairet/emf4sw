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
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.RDFGraph#getNodes <em>Nodes</em>}</li>
 *   <li>{@link com.emf4sw.rdf.RDFGraph#getResources <em>Resources</em>}</li>
 *   <li>{@link com.emf4sw.rdf.RDFGraph#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.emf4sw.rdf.RDFGraph#getBlankNodes <em>Blank Nodes</em>}</li>
 *   <li>{@link com.emf4sw.rdf.RDFGraph#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link com.emf4sw.rdf.RDFGraph#getLiterals <em>Literals</em>}</li>
 *   <li>{@link com.emf4sw.rdf.RDFGraph#getTriples <em>Triples</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.rdf.RDFPackage#getRDFGraph()
 * @model abstract="true"
 * @generated
 */
public interface RDFGraph extends URIElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' attribute list.
	 * @see com.emf4sw.rdf.RDFPackage#getRDFGraph_Nodes()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group'"
	 * @generated
	 */
	FeatureMap getNodes();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link com.emf4sw.rdf.Resource}.
	 * It is bidirectional and its opposite is '{@link com.emf4sw.rdf.Resource#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see com.emf4sw.rdf.RDFPackage#getRDFGraph_Resources()
	 * @see com.emf4sw.rdf.Resource#getGraph
	 * @model opposite="graph" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#nodes'"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link com.emf4sw.rdf.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see com.emf4sw.rdf.RDFPackage#getRDFGraph_Properties()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#nodes'"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Blank Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link com.emf4sw.rdf.BlankNode}.
	 * It is bidirectional and its opposite is '{@link com.emf4sw.rdf.BlankNode#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blank Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blank Nodes</em>' containment reference list.
	 * @see com.emf4sw.rdf.RDFPackage#getRDFGraph_BlankNodes()
	 * @see com.emf4sw.rdf.BlankNode#getGraph
	 * @model opposite="graph" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#nodes'"
	 * @generated
	 */
	EList<BlankNode> getBlankNodes();

	/**
	 * Returns the value of the '<em><b>Datatypes</b></em>' containment reference list.
	 * The list contents are of type {@link com.emf4sw.rdf.Datatype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatypes</em>' containment reference list.
	 * @see com.emf4sw.rdf.RDFPackage#getRDFGraph_Datatypes()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#nodes'"
	 * @generated
	 */
	EList<Datatype> getDatatypes();

	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link com.emf4sw.rdf.Literal}.
	 * It is bidirectional and its opposite is '{@link com.emf4sw.rdf.Literal#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see com.emf4sw.rdf.RDFPackage#getRDFGraph_Literals()
	 * @see com.emf4sw.rdf.Literal#getGraph
	 * @model opposite="graph" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#nodes'"
	 * @generated
	 */
	EList<Literal> getLiterals();

	/**
	 * Returns the value of the '<em><b>Triples</b></em>' containment reference list.
	 * The list contents are of type {@link com.emf4sw.rdf.Triple}.
	 * It is bidirectional and its opposite is '{@link com.emf4sw.rdf.Triple#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triples</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triples</em>' containment reference list.
	 * @see com.emf4sw.rdf.RDFPackage#getRDFGraph_Triples()
	 * @see com.emf4sw.rdf.Triple#getGraph
	 * @model opposite="graph" containment="true"
	 * @generated
	 */
	EList<Triple> getTriples();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isEquivalentTo(RDFGraph graph);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void add(RDFGraph graph);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RDFGraph union(RDFGraph graph);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RDFGraph diff(RDFGraph graph);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Triple addTriple(Node subject, Property property, Node object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<SubjectNode> listSubjectsWithProperty(Property property);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<SubjectNode> listSubjectsWithPropertyValue(Property property, Node object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Triple> listAllTriples();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Resource> listAllResources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Property> listAllProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<SubjectNode> listSubjects();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Resource getResource(String uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Property getProperty(String uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Datatype getDatatype(String uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	BlankNode getBlankNode(String nodeID);

} // RDFGraph
