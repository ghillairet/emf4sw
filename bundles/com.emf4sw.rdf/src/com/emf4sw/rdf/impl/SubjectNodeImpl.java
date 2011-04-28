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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.emf4sw.rdf.Literal;
import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.Resource;
import com.emf4sw.rdf.SubjectNode;
import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.URIElement;
import com.emf4sw.rdf.vocabulary.RDF;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subject Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.impl.SubjectNodeImpl#getSubjectOf <em>Subject Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SubjectNodeImpl extends NodeImpl implements SubjectNode {
	/**
	 * The cached value of the '{@link #getSubjectOf() <em>Subject Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Triple> subjectOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDFPackage.Literals.SUBJECT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triple> getSubjectOf() {
		if (subjectOf == null) {
			subjectOf = new EObjectWithInverseResolvingEList<Triple>(Triple.class, this, RDFPackage.SUBJECT_NODE__SUBJECT_OF, RDFPackage.TRIPLE__SUBJECT);
		}
		return subjectOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isTypeOf(String uri) {
		for (Triple trp: this.getSubjectOf()) {
			if (trp.getPredicate().getURI().equals(RDF.type)) {
				if (((URIElement) trp.getObject()).getURI().equals(uri)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Resource> getTypes() {
		final EList<Resource> res = new BasicEList<Resource>();
		for (Triple trp: this.getSubjectOf()) {
			if (trp.getPredicate().getURI().equals(RDF.type)) {
				if (trp.getObject() instanceof Resource)
					res.add((Resource) trp.getObject());
			}
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getStringValue(String uri) {
		for (Triple trp: getSubjectOf()) {
			if (trp.getPredicate().getURI().equals(uri)) {
				if (trp.getObject() instanceof Literal) {
					return ((Literal) trp.getObject()).getLexicalForm();
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Node> getValues(String uri) {
		final EList<Node> res = new BasicEList<Node>();
		for (Triple trp: getSubjectOf()) {
			if (trp.getPredicate().getURI().equals(uri)) {
				res.add(trp.getObject());
			}
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getURIValues(String uri) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getObject(String uri) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case RDFPackage.SUBJECT_NODE__SUBJECT_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubjectOf()).basicAdd(otherEnd, msgs);
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
			case RDFPackage.SUBJECT_NODE__SUBJECT_OF:
				return ((InternalEList<?>)getSubjectOf()).basicRemove(otherEnd, msgs);
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
			case RDFPackage.SUBJECT_NODE__SUBJECT_OF:
				return getSubjectOf();
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
			case RDFPackage.SUBJECT_NODE__SUBJECT_OF:
				getSubjectOf().clear();
				getSubjectOf().addAll((Collection<? extends Triple>)newValue);
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
			case RDFPackage.SUBJECT_NODE__SUBJECT_OF:
				getSubjectOf().clear();
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
			case RDFPackage.SUBJECT_NODE__SUBJECT_OF:
				return subjectOf != null && !subjectOf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubjectNodeImpl
