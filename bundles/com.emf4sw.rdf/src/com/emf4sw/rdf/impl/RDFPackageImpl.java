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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import com.emf4sw.rdf.RDFFactory;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RDFPackageImpl extends EPackageImpl implements RDFPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uriElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tripleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blankNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tripleNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfsContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfBagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfAltEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfListEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.emf4sw.rdf.RDFPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RDFPackageImpl() {
		super(eNS_URI, RDFFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RDFPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RDFPackage init() {
		if (isInited) return (RDFPackage)EPackage.Registry.INSTANCE.getEPackage(RDFPackage.eNS_URI);

		// Obtain or create and register package
		RDFPackageImpl theRDFPackage = (RDFPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RDFPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RDFPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRDFPackage.createPackageContents();

		// Initialize created meta-data
		theRDFPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRDFPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RDFPackage.eNS_URI, theRDFPackage);
		return theRDFPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURIElement() {
		return uriElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURIElement_URI() {
		return (EAttribute)uriElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getURIElement_Namespace() {
		return (EReference)uriElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespace_Prefix() {
		return (EAttribute)namespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_Graph() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDFGraph() {
		return rdfGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDFGraph_Nodes() {
		return (EAttribute)rdfGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFGraph_Resources() {
		return (EReference)rdfGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFGraph_Properties() {
		return (EReference)rdfGraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFGraph_BlankNodes() {
		return (EReference)rdfGraphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFGraph_Datatypes() {
		return (EReference)rdfGraphEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFGraph_Literals() {
		return (EReference)rdfGraphEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFGraph_Triples() {
		return (EReference)rdfGraphEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentGraph() {
		return documentGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentGraph_Namespaces() {
		return (EReference)documentGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentGraph_SubGraphs() {
		return (EReference)documentGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedGraph() {
		return namedGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedGraph_Document() {
		return (EReference)namedGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriple() {
		return tripleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriple_Subject() {
		return (EReference)tripleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriple_Predicate() {
		return (EReference)tripleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriple_Object() {
		return (EReference)tripleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriple_Graph() {
		return (EReference)tripleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Label() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Comment() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_ObjectOf() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubjectNode() {
		return subjectNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubjectNode_SubjectOf() {
		return (EReference)subjectNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlankNode() {
		return blankNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlankNode_NodeID() {
		return (EAttribute)blankNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlankNode_Graph() {
		return (EReference)blankNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTripleNode() {
		return tripleNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTripleNode_Triple() {
		return (EReference)tripleNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Graph() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_PredicateOf() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatype() {
		return datatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_LexicalForm() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_Lang() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiteral_Datatype() {
		return (EReference)literalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiteral_Graph() {
		return (EReference)literalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDFSContainer() {
		return rdfsContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDFBag() {
		return rdfBagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFBag_Elements() {
		return (EReference)rdfBagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDFAlt() {
		return rdfAltEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFAlt_Elements() {
		return (EReference)rdfAltEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDFSeq() {
		return rdfSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFSeq_Elements() {
		return (EReference)rdfSeqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDFList() {
		return rdfListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFList_Elements() {
		return (EReference)rdfListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFFactory getRDFFactory() {
		return (RDFFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		uriElementEClass = createEClass(URI_ELEMENT);
		createEAttribute(uriElementEClass, URI_ELEMENT__URI);
		createEReference(uriElementEClass, URI_ELEMENT__NAMESPACE);

		namespaceEClass = createEClass(NAMESPACE);
		createEAttribute(namespaceEClass, NAMESPACE__PREFIX);
		createEReference(namespaceEClass, NAMESPACE__GRAPH);

		rdfGraphEClass = createEClass(RDF_GRAPH);
		createEAttribute(rdfGraphEClass, RDF_GRAPH__NODES);
		createEReference(rdfGraphEClass, RDF_GRAPH__RESOURCES);
		createEReference(rdfGraphEClass, RDF_GRAPH__PROPERTIES);
		createEReference(rdfGraphEClass, RDF_GRAPH__BLANK_NODES);
		createEReference(rdfGraphEClass, RDF_GRAPH__DATATYPES);
		createEReference(rdfGraphEClass, RDF_GRAPH__LITERALS);
		createEReference(rdfGraphEClass, RDF_GRAPH__TRIPLES);

		documentGraphEClass = createEClass(DOCUMENT_GRAPH);
		createEReference(documentGraphEClass, DOCUMENT_GRAPH__NAMESPACES);
		createEReference(documentGraphEClass, DOCUMENT_GRAPH__SUB_GRAPHS);

		tripleEClass = createEClass(TRIPLE);
		createEReference(tripleEClass, TRIPLE__SUBJECT);
		createEReference(tripleEClass, TRIPLE__PREDICATE);
		createEReference(tripleEClass, TRIPLE__OBJECT);
		createEReference(tripleEClass, TRIPLE__GRAPH);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__LABEL);
		createEAttribute(nodeEClass, NODE__COMMENT);
		createEReference(nodeEClass, NODE__OBJECT_OF);

		subjectNodeEClass = createEClass(SUBJECT_NODE);
		createEReference(subjectNodeEClass, SUBJECT_NODE__SUBJECT_OF);

		namedGraphEClass = createEClass(NAMED_GRAPH);
		createEReference(namedGraphEClass, NAMED_GRAPH__DOCUMENT);

		blankNodeEClass = createEClass(BLANK_NODE);
		createEAttribute(blankNodeEClass, BLANK_NODE__NODE_ID);
		createEReference(blankNodeEClass, BLANK_NODE__GRAPH);

		tripleNodeEClass = createEClass(TRIPLE_NODE);
		createEReference(tripleNodeEClass, TRIPLE_NODE__TRIPLE);

		resourceEClass = createEClass(RESOURCE);
		createEReference(resourceEClass, RESOURCE__GRAPH);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__PREDICATE_OF);

		datatypeEClass = createEClass(DATATYPE);

		literalEClass = createEClass(LITERAL);
		createEAttribute(literalEClass, LITERAL__LEXICAL_FORM);
		createEAttribute(literalEClass, LITERAL__LANG);
		createEReference(literalEClass, LITERAL__DATATYPE);
		createEReference(literalEClass, LITERAL__GRAPH);

		rdfsContainerEClass = createEClass(RDF_SCONTAINER);

		rdfBagEClass = createEClass(RDF_BAG);
		createEReference(rdfBagEClass, RDF_BAG__ELEMENTS);

		rdfAltEClass = createEClass(RDF_ALT);
		createEReference(rdfAltEClass, RDF_ALT__ELEMENTS);

		rdfSeqEClass = createEClass(RDF_SEQ);
		createEReference(rdfSeqEClass, RDF_SEQ__ELEMENTS);

		rdfListEClass = createEClass(RDF_LIST);
		createEReference(rdfListEClass, RDF_LIST__ELEMENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		namespaceEClass.getESuperTypes().add(this.getURIElement());
		rdfGraphEClass.getESuperTypes().add(this.getURIElement());
		documentGraphEClass.getESuperTypes().add(this.getRDFGraph());
		subjectNodeEClass.getESuperTypes().add(this.getNode());
		namedGraphEClass.getESuperTypes().add(this.getRDFGraph());
		namedGraphEClass.getESuperTypes().add(this.getNode());
		blankNodeEClass.getESuperTypes().add(this.getSubjectNode());
		tripleNodeEClass.getESuperTypes().add(this.getResource());
		resourceEClass.getESuperTypes().add(this.getSubjectNode());
		resourceEClass.getESuperTypes().add(this.getURIElement());
		propertyEClass.getESuperTypes().add(this.getResource());
		datatypeEClass.getESuperTypes().add(this.getResource());
		literalEClass.getESuperTypes().add(this.getNode());
		rdfsContainerEClass.getESuperTypes().add(this.getBlankNode());
		rdfBagEClass.getESuperTypes().add(this.getRDFSContainer());
		rdfAltEClass.getESuperTypes().add(this.getRDFSContainer());
		rdfSeqEClass.getESuperTypes().add(this.getRDFSContainer());
		rdfListEClass.getESuperTypes().add(this.getBlankNode());

		// Initialize classes and features; add operations and parameters
		initEClass(uriElementEClass, URIElement.class, "URIElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURIElement_URI(), ecorePackage.getEString(), "URI", null, 1, 1, URIElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getURIElement_Namespace(), this.getNamespace(), null, "namespace", null, 0, 1, URIElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(uriElementEClass, ecorePackage.getEString(), "getLocalName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(namespaceEClass, Namespace.class, "Namespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamespace_Prefix(), ecorePackage.getEString(), "prefix", null, 1, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamespace_Graph(), this.getDocumentGraph(), this.getDocumentGraph_Namespaces(), "graph", null, 1, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdfGraphEClass, RDFGraph.class, "RDFGraph", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRDFGraph_Nodes(), ecorePackage.getEFeatureMapEntry(), "nodes", null, 0, -1, RDFGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDFGraph_Resources(), this.getResource(), this.getResource_Graph(), "resources", null, 0, -1, RDFGraph.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRDFGraph_Properties(), this.getProperty(), null, "properties", null, 0, -1, RDFGraph.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRDFGraph_BlankNodes(), this.getBlankNode(), this.getBlankNode_Graph(), "blankNodes", null, 0, -1, RDFGraph.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRDFGraph_Datatypes(), this.getDatatype(), null, "datatypes", null, 0, -1, RDFGraph.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRDFGraph_Literals(), this.getLiteral(), this.getLiteral_Graph(), "literals", null, 0, -1, RDFGraph.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRDFGraph_Triples(), this.getTriple(), this.getTriple_Graph(), "triples", null, 0, -1, RDFGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(rdfGraphEClass, ecorePackage.getEBoolean(), "isEquivalentTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRDFGraph(), "graph", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(rdfGraphEClass, null, "add", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRDFGraph(), "graph", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(rdfGraphEClass, this.getRDFGraph(), "union", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRDFGraph(), "graph", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(rdfGraphEClass, this.getRDFGraph(), "diff", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRDFGraph(), "graph", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(rdfGraphEClass, this.getTriple(), "addTriple", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "subject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProperty(), "property", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(rdfGraphEClass, this.getSubjectNode(), "listSubjectsWithProperty", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProperty(), "property", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(rdfGraphEClass, this.getSubjectNode(), "listSubjectsWithPropertyValue", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProperty(), "property", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(rdfGraphEClass, this.getSubjectNode(), "listSubjects", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(rdfGraphEClass, this.getResource(), "getResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(rdfGraphEClass, this.getProperty(), "getProperty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(rdfGraphEClass, this.getDatatype(), "getDatatype", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(rdfGraphEClass, this.getBlankNode(), "getBlankNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nodeID", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(rdfGraphEClass, this.getTriple(), "listAllTriples", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(rdfGraphEClass, this.getResource(), "listAllResources", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(rdfGraphEClass, this.getProperty(), "listAllProperties", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(documentGraphEClass, DocumentGraph.class, "DocumentGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentGraph_Namespaces(), this.getNamespace(), this.getNamespace_Graph(), "namespaces", null, 0, -1, DocumentGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentGraph_SubGraphs(), this.getNamedGraph(), this.getNamedGraph_Document(), "subGraphs", null, 0, -1, DocumentGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(documentGraphEClass, this.getNamedGraph(), "getNamedGraph", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tripleEClass, Triple.class, "Triple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTriple_Subject(), this.getSubjectNode(), this.getSubjectNode_SubjectOf(), "subject", null, 1, 1, Triple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriple_Predicate(), this.getProperty(), this.getProperty_PredicateOf(), "predicate", null, 1, 1, Triple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriple_Object(), this.getNode(), this.getNode_ObjectOf(), "object", null, 1, 1, Triple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriple_Graph(), this.getRDFGraph(), this.getRDFGraph_Triples(), "graph", null, 1, 1, Triple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Label(), ecorePackage.getEString(), "label", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_ObjectOf(), this.getTriple(), this.getTriple_Object(), "objectOf", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subjectNodeEClass, SubjectNode.class, "SubjectNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubjectNode_SubjectOf(), this.getTriple(), this.getTriple_Subject(), "subjectOf", null, 0, -1, SubjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(subjectNodeEClass, ecorePackage.getEBoolean(), "isTypeOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(subjectNodeEClass, this.getResource(), "getTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(subjectNodeEClass, ecorePackage.getEString(), "getStringValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(subjectNodeEClass, this.getNode(), "getValues", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(subjectNodeEClass, ecorePackage.getEString(), "getURIValues", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(subjectNodeEClass, this.getNode(), "getObject", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(namedGraphEClass, NamedGraph.class, "NamedGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedGraph_Document(), this.getDocumentGraph(), this.getDocumentGraph_SubGraphs(), "document", null, 1, 1, NamedGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blankNodeEClass, BlankNode.class, "BlankNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlankNode_NodeID(), ecorePackage.getEString(), "nodeID", null, 1, 1, BlankNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlankNode_Graph(), this.getRDFGraph(), this.getRDFGraph_BlankNodes(), "graph", null, 0, 1, BlankNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tripleNodeEClass, TripleNode.class, "TripleNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTripleNode_Triple(), this.getTriple(), null, "triple", null, 1, 1, TripleNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResource_Graph(), this.getRDFGraph(), this.getRDFGraph_Resources(), "graph", null, 0, 1, Resource.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(resourceEClass, ecorePackage.getEBoolean(), "isTypeOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_PredicateOf(), this.getTriple(), this.getTriple_Predicate(), "predicateOf", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypeEClass, Datatype.class, "Datatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteral_LexicalForm(), ecorePackage.getEString(), "lexicalForm", null, 1, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteral_Lang(), ecorePackage.getEString(), "lang", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLiteral_Datatype(), this.getDatatype(), null, "datatype", null, 1, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLiteral_Graph(), this.getRDFGraph(), this.getRDFGraph_Literals(), "graph", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdfsContainerEClass, RDFSContainer.class, "RDFSContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rdfBagEClass, RDFBag.class, "RDFBag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDFBag_Elements(), this.getNode(), null, "elements", null, 0, -1, RDFBag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdfAltEClass, RDFAlt.class, "RDFAlt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDFAlt_Elements(), this.getNode(), null, "elements", null, 0, -1, RDFAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdfSeqEClass, RDFSeq.class, "RDFSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDFSeq_Elements(), this.getNode(), null, "elements", null, 0, -1, RDFSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdfListEClass, RDFList.class, "RDFList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDFList_Elements(), this.getNode(), null, "elements", null, 0, -1, RDFList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Id
		createIdAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Id</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createIdAnnotations() {
		String source = "Id";		
		addAnnotation
		  (getURIElement_URI(), 
		   source, 
		   new String[] {
			 "base", ""
		   });						
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (getRDFGraph_Nodes(), 
		   source, 
		   new String[] {
			 "kind", "group"
		   });		
		addAnnotation
		  (getRDFGraph_Resources(), 
		   source, 
		   new String[] {
			 "group", "#nodes"
		   });		
		addAnnotation
		  (getRDFGraph_Properties(), 
		   source, 
		   new String[] {
			 "group", "#nodes"
		   });		
		addAnnotation
		  (getRDFGraph_BlankNodes(), 
		   source, 
		   new String[] {
			 "group", "#nodes"
		   });		
		addAnnotation
		  (getRDFGraph_Datatypes(), 
		   source, 
		   new String[] {
			 "group", "#nodes"
		   });		
		addAnnotation
		  (getRDFGraph_Literals(), 
		   source, 
		   new String[] {
			 "group", "#nodes"
		   });
	}

} //RDFPackageImpl
