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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.emf4sw.rdf.RDFPackage
 * @generated
 */
public class RDFAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RDFPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RDFPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDFSwitch<Adapter> modelSwitch =
		new RDFSwitch<Adapter>() {
			@Override
			public Adapter caseURIElement(URIElement object) {
				return createURIElementAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
			}
			@Override
			public Adapter caseRDFGraph(RDFGraph object) {
				return createRDFGraphAdapter();
			}
			@Override
			public Adapter caseDocumentGraph(DocumentGraph object) {
				return createDocumentGraphAdapter();
			}
			@Override
			public Adapter caseTriple(Triple object) {
				return createTripleAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseSubjectNode(SubjectNode object) {
				return createSubjectNodeAdapter();
			}
			@Override
			public Adapter caseNamedGraph(NamedGraph object) {
				return createNamedGraphAdapter();
			}
			@Override
			public Adapter caseBlankNode(BlankNode object) {
				return createBlankNodeAdapter();
			}
			@Override
			public Adapter caseTripleNode(TripleNode object) {
				return createTripleNodeAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseDatatype(Datatype object) {
				return createDatatypeAdapter();
			}
			@Override
			public Adapter caseLiteral(Literal object) {
				return createLiteralAdapter();
			}
			@Override
			public Adapter caseRDFSContainer(RDFSContainer object) {
				return createRDFSContainerAdapter();
			}
			@Override
			public Adapter caseRDFBag(RDFBag object) {
				return createRDFBagAdapter();
			}
			@Override
			public Adapter caseRDFAlt(RDFAlt object) {
				return createRDFAltAdapter();
			}
			@Override
			public Adapter caseRDFSeq(RDFSeq object) {
				return createRDFSeqAdapter();
			}
			@Override
			public Adapter caseRDFList(RDFList object) {
				return createRDFListAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.URIElement <em>URI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.URIElement
	 * @generated
	 */
	public Adapter createURIElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.RDFGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.RDFGraph
	 * @generated
	 */
	public Adapter createRDFGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.DocumentGraph <em>Document Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.DocumentGraph
	 * @generated
	 */
	public Adapter createDocumentGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.NamedGraph <em>Named Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.NamedGraph
	 * @generated
	 */
	public Adapter createNamedGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.Triple <em>Triple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.Triple
	 * @generated
	 */
	public Adapter createTripleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.SubjectNode <em>Subject Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.SubjectNode
	 * @generated
	 */
	public Adapter createSubjectNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.BlankNode <em>Blank Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.BlankNode
	 * @generated
	 */
	public Adapter createBlankNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.TripleNode <em>Triple Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.TripleNode
	 * @generated
	 */
	public Adapter createTripleNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.Datatype
	 * @generated
	 */
	public Adapter createDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.RDFSContainer <em>SContainer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.RDFSContainer
	 * @generated
	 */
	public Adapter createRDFSContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.RDFBag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.RDFBag
	 * @generated
	 */
	public Adapter createRDFBagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.RDFAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.RDFAlt
	 * @generated
	 */
	public Adapter createRDFAltAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.RDFSeq <em>Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.RDFSeq
	 * @generated
	 */
	public Adapter createRDFSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.RDFList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.RDFList
	 * @generated
	 */
	public Adapter createRDFListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RDFAdapterFactory
