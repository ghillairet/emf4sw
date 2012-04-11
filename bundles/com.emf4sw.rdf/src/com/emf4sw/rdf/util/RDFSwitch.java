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
package com.emf4sw.rdf.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.emf4sw.rdf.BlankNode;
import com.emf4sw.rdf.Datatype;
import com.emf4sw.rdf.DocumentGraph;
import com.emf4sw.rdf.Literal;
import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.Namespace;
import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.Property;
import com.emf4sw.rdf.RDFAlt;
import com.emf4sw.rdf.RDFBag;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.RDFList;
import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.RDFSContainer;
import com.emf4sw.rdf.RDFSeq;
import com.emf4sw.rdf.Resource;
import com.emf4sw.rdf.SubjectNode;
import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.TripleNode;
import com.emf4sw.rdf.URIElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.emf4sw.rdf.RDFPackage
 * @generated
 */
public class RDFSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RDFPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSwitch() {
		if (modelPackage == null) {
			modelPackage = RDFPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RDFPackage.URI_ELEMENT: {
				URIElement uriElement = (URIElement)theEObject;
				T result = caseURIElement(uriElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RDFPackage.NAMESPACE: {
				Namespace namespace = (Namespace)theEObject;
				T result = caseNamespace(namespace);
				if (result == null) result = caseURIElement(namespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RDFPackage.RDF_GRAPH: {
				RDFGraph rdfGraph = (RDFGraph)theEObject;
				T result = caseRDFGraph(rdfGraph);
				if (result == null) result = caseURIElement(rdfGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RDFPackage.DOCUMENT_GRAPH: {
				DocumentGraph documentGraph = (DocumentGraph)theEObject;
				T result = caseDocumentGraph(documentGraph);
				if (result == null) result = caseRDFGraph(documentGraph);
				if (result == null) result = caseURIElement(documentGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RDFPackage.TRIPLE: {
				Triple triple = (Triple)theEObject;
				T result = caseTriple(triple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RDFPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RDFPackage.SUBJECT_NODE: {
				SubjectNode subjectNode = (SubjectNode)theEObject;
				T result = caseSubjectNode(subjectNode);
				if (result == null) result = caseNode(subjectNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RDFPackage.NAMED_GRAPH: {
				NamedGraph namedGraph = (NamedGraph)theEObject;
				T result = caseNamedGraph(namedGraph);
				if (result == null) result = caseRDFGraph(namedGraph);
				if (result == null) result = caseNode(namedGraph);
				if (result == null) result = caseURIElement(namedGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RDFPackage.BLANK_NODE: {
				BlankNode blankNode = (BlankNode)theEObject;
				T result = caseBlankNode(blankNode);
				if (result == null) result = caseSubjectNode(blankNode);
				if (result == null) result = caseNode(blankNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RDFPackage.TRIPLE_NODE: {
				TripleNode tripleNode = (TripleNode)theEObject;
				T result = caseTripleNode(tripleNode);
				if (result == null) result = caseResource(tripleNode);
				if (result == null) result = caseSubjectNode(tripleNode);
				if (result == null) result = caseURIElement(tripleNode);
				if (result == null) result = caseNode(tripleNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RDFPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseSubjectNode(resource);
				if (result == null) result = caseURIElement(resource);
				if (result == null) result = caseNode(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RDFPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseResource(property);
				if (result == null) result = caseSubjectNode(property);
				if (result == null) result = caseURIElement(property);
				if (result == null) result = caseNode(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RDFPackage.DATATYPE: {
				Datatype datatype = (Datatype)theEObject;
				T result = caseDatatype(datatype);
				if (result == null) result = caseResource(datatype);
				if (result == null) result = caseSubjectNode(datatype);
				if (result == null) result = caseURIElement(datatype);
				if (result == null) result = caseNode(datatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RDFPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = caseNode(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RDFPackage.RDF_SCONTAINER: {
				RDFSContainer rdfsContainer = (RDFSContainer)theEObject;
				T result = caseRDFSContainer(rdfsContainer);
				if (result == null) result = caseBlankNode(rdfsContainer);
				if (result == null) result = caseSubjectNode(rdfsContainer);
				if (result == null) result = caseNode(rdfsContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RDFPackage.RDF_BAG: {
				RDFBag rdfBag = (RDFBag)theEObject;
				T result = caseRDFBag(rdfBag);
				if (result == null) result = caseRDFSContainer(rdfBag);
				if (result == null) result = caseBlankNode(rdfBag);
				if (result == null) result = caseSubjectNode(rdfBag);
				if (result == null) result = caseNode(rdfBag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RDFPackage.RDF_ALT: {
				RDFAlt rdfAlt = (RDFAlt)theEObject;
				T result = caseRDFAlt(rdfAlt);
				if (result == null) result = caseRDFSContainer(rdfAlt);
				if (result == null) result = caseBlankNode(rdfAlt);
				if (result == null) result = caseSubjectNode(rdfAlt);
				if (result == null) result = caseNode(rdfAlt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RDFPackage.RDF_SEQ: {
				RDFSeq rdfSeq = (RDFSeq)theEObject;
				T result = caseRDFSeq(rdfSeq);
				if (result == null) result = caseRDFSContainer(rdfSeq);
				if (result == null) result = caseBlankNode(rdfSeq);
				if (result == null) result = caseSubjectNode(rdfSeq);
				if (result == null) result = caseNode(rdfSeq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RDFPackage.RDF_LIST: {
				RDFList rdfList = (RDFList)theEObject;
				T result = caseRDFList(rdfList);
				if (result == null) result = caseBlankNode(rdfList);
				if (result == null) result = caseSubjectNode(rdfList);
				if (result == null) result = caseNode(rdfList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URI Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URI Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURIElement(URIElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFGraph(RDFGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentGraph(DocumentGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedGraph(NamedGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriple(Triple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectNode(SubjectNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blank Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blank Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlankNode(BlankNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triple Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triple Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTripleNode(TripleNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatype(Datatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SContainer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SContainer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFSContainer(RDFSContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFBag(RDFBag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFAlt(RDFAlt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFSeq(RDFSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFList(RDFList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //RDFSwitch
