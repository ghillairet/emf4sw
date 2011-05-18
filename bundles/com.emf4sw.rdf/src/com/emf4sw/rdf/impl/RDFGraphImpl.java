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
package com.emf4sw.rdf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import com.emf4sw.rdf.BlankNode;
import com.emf4sw.rdf.Datatype;
import com.emf4sw.rdf.Literal;
import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.Property;
import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.Resource;
import com.emf4sw.rdf.SubjectNode;
import com.emf4sw.rdf.Triple;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.impl.RDFGraphImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.RDFGraphImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.RDFGraphImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.RDFGraphImpl#getBlankNodes <em>Blank Nodes</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.RDFGraphImpl#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.RDFGraphImpl#getLiterals <em>Literals</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.RDFGraphImpl#getTriples <em>Triples</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RDFGraphImpl extends URIElementImpl implements RDFGraph {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap nodes;

	/**
	 * The cached value of the '{@link #getTriples() <em>Triples</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriples()
	 * @generated
	 * @ordered
	 */
	protected EList<Triple> triples;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDFGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDFPackage.Literals.RDF_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getNodes() {
		if (nodes == null) {
			nodes = new BasicFeatureMap(this, RDFPackage.RDF_GRAPH__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResources() {
		return getNodes().list(RDFPackage.Literals.RDF_GRAPH__RESOURCES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		return getNodes().list(RDFPackage.Literals.RDF_GRAPH__PROPERTIES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BlankNode> getBlankNodes() {
		return getNodes().list(RDFPackage.Literals.RDF_GRAPH__BLANK_NODES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Datatype> getDatatypes() {
		return getNodes().list(RDFPackage.Literals.RDF_GRAPH__DATATYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Literal> getLiterals() {
		return getNodes().list(RDFPackage.Literals.RDF_GRAPH__LITERALS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triple> getTriples() {
		if (triples == null) {
			triples = new EObjectContainmentWithInverseEList<Triple>(Triple.class, this, RDFPackage.RDF_GRAPH__TRIPLES, RDFPackage.TRIPLE__GRAPH);
		}
		return triples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isEquivalentTo(RDFGraph graph) {
		return false;
//		return RDFOperations.equivalentTo(this, graph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract void add(RDFGraph graph);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RDFGraph union(RDFGraph graph) {
		return graph;
//		return RDFOperations.unionOf(this, graph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RDFGraph diff(RDFGraph graph) {
		return graph;
//		return RDFOperations.differenceOf(this, graph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Triple addTriple(Node subject, Property property, Node object) {
		Triple triple = null;
		if (subject != null && property != null && object != null) {
			 triple = RDFFactory.eINSTANCE.createTriple();
			 triple.setSubject((SubjectNode) subject);
			 triple.setPredicate(property);
			 triple.setObject(object);
			 this.getTriples().add(triple);
		}
		return triple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<SubjectNode> listSubjectsWithProperty(Property property) {
		final EList<SubjectNode> nodes = new BasicEList<SubjectNode>();
		for (Triple triple: listAllTriples()) {
			if (triple.getPredicate().equals(property)) {
				nodes.add(triple.getSubject());
			}
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<SubjectNode> listSubjectsWithPropertyValue(Property property, Node object) {
		final EList<SubjectNode> nodes = new BasicEList<SubjectNode>();
		for (Triple triple: listAllTriples()) {
			if (triple.getPredicate().equals(property) && triple.getObject().equals(object)) {
				nodes.add(triple.getSubject());
			}
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<Triple> listAllTriples();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<Resource> listAllResources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<Property> listAllProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<SubjectNode> listSubjects() {
		final EList<SubjectNode> subjects = new BasicEList<SubjectNode>();
		for (Triple aTriple: getTriples()) {
			if (!subjects.contains(aTriple.getSubject())) {
				subjects.add(aTriple.getSubject());
			}
		}
		return subjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Resource getResource(String uri) {
		EObject obj = eResource() == null ? null : eResource().getEObject(uri);
		if (obj == null) {
			obj = RDFFactory.eINSTANCE.createResource();
			((Resource) obj).setURI(uri);
			this.getResources().add((Resource) obj);
		}
		return obj instanceof Resource ? (Resource)obj : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Property getProperty(String uri) {
		EObject obj = eResource() == null ? null : eResource().getEObject(uri);
		if (obj == null) {
			obj = RDFFactory.eINSTANCE.createProperty();
			((Property) obj).setURI(uri);
			this.getProperties().add((Property) obj);
		}
		return obj instanceof Property ? (Property)obj : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Datatype getDatatype(String uri) {
		EObject obj = eResource() == null ? null : eResource().getEObject(uri);
		if (obj == null) {
			obj = RDFFactory.eINSTANCE.createDatatype();
			((Datatype) obj).setURI(uri);
			this.getDatatypes().add((Datatype) obj);
		}
		return obj instanceof Datatype ? (Datatype)obj : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BlankNode getBlankNode(String nodeID) {
		EObject obj = eResource() == null ? null : eResource().getEObject(nodeID);
		if (obj == null) {
			obj = RDFFactory.eINSTANCE.createBlankNode();
			((BlankNode) obj).setNodeID(nodeID);
			this.getBlankNodes().add((BlankNode) obj);
		}
		return obj instanceof BlankNode ? (BlankNode)obj : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RDFPackage.RDF_GRAPH__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
			case RDFPackage.RDF_GRAPH__BLANK_NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBlankNodes()).basicAdd(otherEnd, msgs);
			case RDFPackage.RDF_GRAPH__LITERALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLiterals()).basicAdd(otherEnd, msgs);
			case RDFPackage.RDF_GRAPH__TRIPLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTriples()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RDFPackage.RDF_GRAPH__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case RDFPackage.RDF_GRAPH__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case RDFPackage.RDF_GRAPH__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case RDFPackage.RDF_GRAPH__BLANK_NODES:
				return ((InternalEList<?>)getBlankNodes()).basicRemove(otherEnd, msgs);
			case RDFPackage.RDF_GRAPH__DATATYPES:
				return ((InternalEList<?>)getDatatypes()).basicRemove(otherEnd, msgs);
			case RDFPackage.RDF_GRAPH__LITERALS:
				return ((InternalEList<?>)getLiterals()).basicRemove(otherEnd, msgs);
			case RDFPackage.RDF_GRAPH__TRIPLES:
				return ((InternalEList<?>)getTriples()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RDFPackage.RDF_GRAPH__NODES:
				if (coreType) return getNodes();
				return ((FeatureMap.Internal)getNodes()).getWrapper();
			case RDFPackage.RDF_GRAPH__RESOURCES:
				return getResources();
			case RDFPackage.RDF_GRAPH__PROPERTIES:
				return getProperties();
			case RDFPackage.RDF_GRAPH__BLANK_NODES:
				return getBlankNodes();
			case RDFPackage.RDF_GRAPH__DATATYPES:
				return getDatatypes();
			case RDFPackage.RDF_GRAPH__LITERALS:
				return getLiterals();
			case RDFPackage.RDF_GRAPH__TRIPLES:
				return getTriples();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RDFPackage.RDF_GRAPH__NODES:
				((FeatureMap.Internal)getNodes()).set(newValue);
				return;
			case RDFPackage.RDF_GRAPH__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case RDFPackage.RDF_GRAPH__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case RDFPackage.RDF_GRAPH__BLANK_NODES:
				getBlankNodes().clear();
				getBlankNodes().addAll((Collection<? extends BlankNode>)newValue);
				return;
			case RDFPackage.RDF_GRAPH__DATATYPES:
				getDatatypes().clear();
				getDatatypes().addAll((Collection<? extends Datatype>)newValue);
				return;
			case RDFPackage.RDF_GRAPH__LITERALS:
				getLiterals().clear();
				getLiterals().addAll((Collection<? extends Literal>)newValue);
				return;
			case RDFPackage.RDF_GRAPH__TRIPLES:
				getTriples().clear();
				getTriples().addAll((Collection<? extends Triple>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RDFPackage.RDF_GRAPH__NODES:
				getNodes().clear();
				return;
			case RDFPackage.RDF_GRAPH__RESOURCES:
				getResources().clear();
				return;
			case RDFPackage.RDF_GRAPH__PROPERTIES:
				getProperties().clear();
				return;
			case RDFPackage.RDF_GRAPH__BLANK_NODES:
				getBlankNodes().clear();
				return;
			case RDFPackage.RDF_GRAPH__DATATYPES:
				getDatatypes().clear();
				return;
			case RDFPackage.RDF_GRAPH__LITERALS:
				getLiterals().clear();
				return;
			case RDFPackage.RDF_GRAPH__TRIPLES:
				getTriples().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RDFPackage.RDF_GRAPH__NODES:
				return nodes != null && !nodes.isEmpty();
			case RDFPackage.RDF_GRAPH__RESOURCES:
				return !getResources().isEmpty();
			case RDFPackage.RDF_GRAPH__PROPERTIES:
				return !getProperties().isEmpty();
			case RDFPackage.RDF_GRAPH__BLANK_NODES:
				return !getBlankNodes().isEmpty();
			case RDFPackage.RDF_GRAPH__DATATYPES:
				return !getDatatypes().isEmpty();
			case RDFPackage.RDF_GRAPH__LITERALS:
				return !getLiterals().isEmpty();
			case RDFPackage.RDF_GRAPH__TRIPLES:
				return triples != null && !triples.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();
		
		return "<"+uri+">";
	}

} //RDFGraphImpl
