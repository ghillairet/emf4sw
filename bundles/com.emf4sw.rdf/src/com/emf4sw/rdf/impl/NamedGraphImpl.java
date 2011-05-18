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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import com.emf4sw.rdf.DocumentGraph;
import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.Property;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.Resource;
import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.operations.RDFUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.impl.NamedGraphImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.NamedGraphImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.NamedGraphImpl#getObjectOf <em>Object Of</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.NamedGraphImpl#getDocument <em>Document</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedGraphImpl extends RDFGraphImpl implements NamedGraph {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObjectOf() <em>Object Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Triple> objectOf;

	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected DocumentGraph document;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDFPackage.Literals.NAMED_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDFPackage.NAMED_GRAPH__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDFPackage.NAMED_GRAPH__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	@Override
	public void add(RDFGraph graph) {
		for (Triple triple: graph.getTriples()) {
			RDFUtil.copyTriple(triple, this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public EList<Triple> listAllTriples() {
		return getTriples();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public EList<Resource> listAllResources() {
		final Collection<Resource> all = 
			EcoreUtil.getObjectsByType(getNodes(), RDFPackage.eINSTANCE.getResource());
		return new BasicEList<Resource>(all);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public EList<Property> listAllProperties() {
		final Collection<Property> all = 
			EcoreUtil.getObjectsByType(getNodes(), RDFPackage.eINSTANCE.getProperty());
		return new BasicEList<Property>(all);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triple> getObjectOf() {
		if (objectOf == null) {
			objectOf = new EObjectWithInverseResolvingEList<Triple>(Triple.class, this, RDFPackage.NAMED_GRAPH__OBJECT_OF, RDFPackage.TRIPLE__OBJECT);
		}
		return objectOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentGraph getDocument() {
		if (document != null && document.eIsProxy()) {
			InternalEObject oldDocument = (InternalEObject)document;
			document = (DocumentGraph)eResolveProxy(oldDocument);
			if (document != oldDocument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RDFPackage.NAMED_GRAPH__DOCUMENT, oldDocument, document));
			}
		}
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentGraph basicGetDocument() {
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocument(DocumentGraph newDocument, NotificationChain msgs) {
		DocumentGraph oldDocument = document;
		document = newDocument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDFPackage.NAMED_GRAPH__DOCUMENT, oldDocument, newDocument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocument(DocumentGraph newDocument) {
		if (newDocument != document) {
			NotificationChain msgs = null;
			if (document != null)
				msgs = ((InternalEObject)document).eInverseRemove(this, RDFPackage.DOCUMENT_GRAPH__SUB_GRAPHS, DocumentGraph.class, msgs);
			if (newDocument != null)
				msgs = ((InternalEObject)newDocument).eInverseAdd(this, RDFPackage.DOCUMENT_GRAPH__SUB_GRAPHS, DocumentGraph.class, msgs);
			msgs = basicSetDocument(newDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDFPackage.NAMED_GRAPH__DOCUMENT, newDocument, newDocument));
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
			case RDFPackage.NAMED_GRAPH__OBJECT_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObjectOf()).basicAdd(otherEnd, msgs);
			case RDFPackage.NAMED_GRAPH__DOCUMENT:
				if (document != null)
					msgs = ((InternalEObject)document).eInverseRemove(this, RDFPackage.DOCUMENT_GRAPH__SUB_GRAPHS, DocumentGraph.class, msgs);
				return basicSetDocument((DocumentGraph)otherEnd, msgs);
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
			case RDFPackage.NAMED_GRAPH__OBJECT_OF:
				return ((InternalEList<?>)getObjectOf()).basicRemove(otherEnd, msgs);
			case RDFPackage.NAMED_GRAPH__DOCUMENT:
				return basicSetDocument(null, msgs);
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
			case RDFPackage.NAMED_GRAPH__LABEL:
				return getLabel();
			case RDFPackage.NAMED_GRAPH__COMMENT:
				return getComment();
			case RDFPackage.NAMED_GRAPH__OBJECT_OF:
				return getObjectOf();
			case RDFPackage.NAMED_GRAPH__DOCUMENT:
				if (resolve) return getDocument();
				return basicGetDocument();
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
			case RDFPackage.NAMED_GRAPH__LABEL:
				setLabel((String)newValue);
				return;
			case RDFPackage.NAMED_GRAPH__COMMENT:
				setComment((String)newValue);
				return;
			case RDFPackage.NAMED_GRAPH__OBJECT_OF:
				getObjectOf().clear();
				getObjectOf().addAll((Collection<? extends Triple>)newValue);
				return;
			case RDFPackage.NAMED_GRAPH__DOCUMENT:
				setDocument((DocumentGraph)newValue);
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
			case RDFPackage.NAMED_GRAPH__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case RDFPackage.NAMED_GRAPH__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case RDFPackage.NAMED_GRAPH__OBJECT_OF:
				getObjectOf().clear();
				return;
			case RDFPackage.NAMED_GRAPH__DOCUMENT:
				setDocument((DocumentGraph)null);
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
			case RDFPackage.NAMED_GRAPH__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case RDFPackage.NAMED_GRAPH__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case RDFPackage.NAMED_GRAPH__OBJECT_OF:
				return objectOf != null && !objectOf.isEmpty();
			case RDFPackage.NAMED_GRAPH__DOCUMENT:
				return document != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Node.class) {
			switch (derivedFeatureID) {
				case RDFPackage.NAMED_GRAPH__LABEL: return RDFPackage.NODE__LABEL;
				case RDFPackage.NAMED_GRAPH__COMMENT: return RDFPackage.NODE__COMMENT;
				case RDFPackage.NAMED_GRAPH__OBJECT_OF: return RDFPackage.NODE__OBJECT_OF;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Node.class) {
			switch (baseFeatureID) {
				case RDFPackage.NODE__LABEL: return RDFPackage.NAMED_GRAPH__LABEL;
				case RDFPackage.NODE__COMMENT: return RDFPackage.NAMED_GRAPH__COMMENT;
				case RDFPackage.NODE__OBJECT_OF: return RDFPackage.NAMED_GRAPH__OBJECT_OF;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //NamedGraphImpl
