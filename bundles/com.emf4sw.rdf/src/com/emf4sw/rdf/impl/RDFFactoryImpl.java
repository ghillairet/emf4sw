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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.emf4sw.rdf.BlankNode;
import com.emf4sw.rdf.Datatype;
import com.emf4sw.rdf.DocumentGraph;
import com.emf4sw.rdf.Literal;
import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.Namespace;
import com.emf4sw.rdf.Property;
import com.emf4sw.rdf.RDFAlt;
import com.emf4sw.rdf.RDFBag;
import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.RDFList;
import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.RDFSeq;
import com.emf4sw.rdf.Resource;
import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.TripleNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RDFFactoryImpl extends EFactoryImpl implements RDFFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RDFFactory init() {
		try {
			RDFFactory theRDFFactory = (RDFFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.w3.org/1999/02/22-rdf-syntax-ns#"); 
			if (theRDFFactory != null) {
				return theRDFFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RDFFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RDFPackage.NAMESPACE: return createNamespace();
			case RDFPackage.DOCUMENT_GRAPH: return createDocumentGraph();
			case RDFPackage.TRIPLE: return createTriple();
			case RDFPackage.NAMED_GRAPH: return createNamedGraph();
			case RDFPackage.BLANK_NODE: return createBlankNode();
			case RDFPackage.TRIPLE_NODE: return createTripleNode();
			case RDFPackage.RESOURCE: return createResource();
			case RDFPackage.PROPERTY: return createProperty();
			case RDFPackage.DATATYPE: return createDatatype();
			case RDFPackage.LITERAL: return createLiteral();
			case RDFPackage.RDF_BAG: return createRDFBag();
			case RDFPackage.RDF_ALT: return createRDFAlt();
			case RDFPackage.RDF_SEQ: return createRDFSeq();
			case RDFPackage.RDF_LIST: return createRDFList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace createNamespace() {
		NamespaceImpl namespace = new NamespaceImpl();
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentGraph createDocumentGraph() {
		DocumentGraphImpl documentGraph = new DocumentGraphImpl();
		return documentGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedGraph createNamedGraph() {
		NamedGraphImpl namedGraph = new NamedGraphImpl();
		return namedGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Triple createTriple() {
		TripleImpl triple = new TripleImpl();
		return triple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlankNode createBlankNode() {
		BlankNodeImpl blankNode = new BlankNodeImpl();
		return blankNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TripleNode createTripleNode() {
		TripleNodeImpl tripleNode = new TripleNodeImpl();
		return tripleNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype createDatatype() {
		DatatypeImpl datatype = new DatatypeImpl();
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFBag createRDFBag() {
		RDFBagImpl rdfBag = new RDFBagImpl();
		return rdfBag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFAlt createRDFAlt() {
		RDFAltImpl rdfAlt = new RDFAltImpl();
		return rdfAlt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSeq createRDFSeq() {
		RDFSeqImpl rdfSeq = new RDFSeqImpl();
		return rdfSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFList createRDFList() {
		RDFListImpl rdfList = new RDFListImpl();
		return rdfList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFPackage getRDFPackage() {
		return (RDFPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RDFPackage getPackage() {
		return RDFPackage.eINSTANCE;
	}

} //RDFFactoryImpl
