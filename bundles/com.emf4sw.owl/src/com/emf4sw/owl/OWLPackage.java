/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import com.emf4sw.rdf.RDFPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.emf4sw.owl.OWLFactory
 * @model kind="package"
 * @generated
 */
public interface OWLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "owl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/2002/07/owl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "OWL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OWLPackage eINSTANCE = com.emf4sw.owl.impl.OWLPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.OntologyImpl <em>Ontology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.OntologyImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getOntology()
	 * @generated
	 */
	int ONTOLOGY = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__URI = RDFPackage.DOCUMENT_GRAPH__URI;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__NAMESPACE = RDFPackage.DOCUMENT_GRAPH__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__NODES = RDFPackage.DOCUMENT_GRAPH__NODES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__RESOURCES = RDFPackage.DOCUMENT_GRAPH__RESOURCES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__PROPERTIES = RDFPackage.DOCUMENT_GRAPH__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Blank Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__BLANK_NODES = RDFPackage.DOCUMENT_GRAPH__BLANK_NODES;

	/**
	 * The feature id for the '<em><b>Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__DATATYPES = RDFPackage.DOCUMENT_GRAPH__DATATYPES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__LITERALS = RDFPackage.DOCUMENT_GRAPH__LITERALS;

	/**
	 * The feature id for the '<em><b>Triples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__TRIPLES = RDFPackage.DOCUMENT_GRAPH__TRIPLES;

	/**
	 * The feature id for the '<em><b>Namespaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__NAMESPACES = RDFPackage.DOCUMENT_GRAPH__NAMESPACES;

	/**
	 * The feature id for the '<em><b>Sub Graphs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__SUB_GRAPHS = RDFPackage.DOCUMENT_GRAPH__SUB_GRAPHS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__ANNOTATIONS = RDFPackage.DOCUMENT_GRAPH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__CLASSES = RDFPackage.DOCUMENT_GRAPH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__DATA_PROPERTIES = RDFPackage.DOCUMENT_GRAPH_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Object Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__OBJECT_PROPERTIES = RDFPackage.DOCUMENT_GRAPH_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Ranges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__DATA_RANGES = RDFPackage.DOCUMENT_GRAPH_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Class Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__CLASS_EXPRESSIONS = RDFPackage.DOCUMENT_GRAPH_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owl Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__OWL_DATATYPES = RDFPackage.DOCUMENT_GRAPH_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Ontology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_FEATURE_COUNT = RDFPackage.DOCUMENT_GRAPH_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.AnnotatedElementImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAnnotatedElement()
	 * @generated
	 */
	int ANNOTATED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT__ANNOTATIONS = 0;

	/**
	 * The number of structural features of the '<em>Annotated Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ClassExpressionImpl <em>Class Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ClassExpressionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getClassExpression()
	 * @generated
	 */
	int CLASS_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXPRESSION__LABEL = RDFPackage.SUBJECT_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXPRESSION__COMMENT = RDFPackage.SUBJECT_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXPRESSION__OBJECT_OF = RDFPackage.SUBJECT_NODE__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXPRESSION__SUBJECT_OF = RDFPackage.SUBJECT_NODE__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXPRESSION__ANNOTATIONS = RDFPackage.SUBJECT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXPRESSION__KEYS = RDFPackage.SUBJECT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXPRESSION__SUB_CLASS_OF = RDFPackage.SUBJECT_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXPRESSION__SUPER_CLASS = RDFPackage.SUBJECT_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Disjoint Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXPRESSION__DISJOINT_CLASSES = RDFPackage.SUBJECT_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Equivalent Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXPRESSION__EQUIVALENT_CLASSES = RDFPackage.SUBJECT_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Class Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXPRESSION_FEATURE_COUNT = RDFPackage.SUBJECT_NODE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.OWLClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.OWLClassImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getOWLClass()
	 * @generated
	 */
	int OWL_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__LABEL = RDFPackage.RESOURCE__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__COMMENT = RDFPackage.RESOURCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__OBJECT_OF = RDFPackage.RESOURCE__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__SUBJECT_OF = RDFPackage.RESOURCE__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__URI = RDFPackage.RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__NAMESPACE = RDFPackage.RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__GRAPH = RDFPackage.RESOURCE__GRAPH;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__ANNOTATIONS = RDFPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__KEYS = RDFPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__SUB_CLASS_OF = RDFPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__SUPER_CLASS = RDFPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Disjoint Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__DISJOINT_CLASSES = RDFPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Equivalent Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__EQUIVALENT_CLASSES = RDFPackage.RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS_FEATURE_COUNT = RDFPackage.RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectUnionOfImpl <em>Object Union Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectUnionOfImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectUnionOf()
	 * @generated
	 */
	int OBJECT_UNION_OF = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_UNION_OF__LABEL = CLASS_EXPRESSION__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_UNION_OF__COMMENT = CLASS_EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_UNION_OF__OBJECT_OF = CLASS_EXPRESSION__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_UNION_OF__SUBJECT_OF = CLASS_EXPRESSION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_UNION_OF__ANNOTATIONS = CLASS_EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_UNION_OF__KEYS = CLASS_EXPRESSION__KEYS;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_UNION_OF__SUB_CLASS_OF = CLASS_EXPRESSION__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_UNION_OF__SUPER_CLASS = CLASS_EXPRESSION__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Disjoint Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_UNION_OF__DISJOINT_CLASSES = CLASS_EXPRESSION__DISJOINT_CLASSES;

	/**
	 * The feature id for the '<em><b>Equivalent Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_UNION_OF__EQUIVALENT_CLASSES = CLASS_EXPRESSION__EQUIVALENT_CLASSES;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_UNION_OF__NODE_ID = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_UNION_OF__GRAPH = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Union Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_UNION_OF__UNION_OF = CLASS_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Union Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_UNION_OF_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectIntersectionOfImpl <em>Object Intersection Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectIntersectionOfImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectIntersectionOf()
	 * @generated
	 */
	int OBJECT_INTERSECTION_OF = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INTERSECTION_OF__LABEL = CLASS_EXPRESSION__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INTERSECTION_OF__COMMENT = CLASS_EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INTERSECTION_OF__OBJECT_OF = CLASS_EXPRESSION__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INTERSECTION_OF__SUBJECT_OF = CLASS_EXPRESSION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INTERSECTION_OF__ANNOTATIONS = CLASS_EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INTERSECTION_OF__KEYS = CLASS_EXPRESSION__KEYS;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INTERSECTION_OF__SUB_CLASS_OF = CLASS_EXPRESSION__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INTERSECTION_OF__SUPER_CLASS = CLASS_EXPRESSION__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Disjoint Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INTERSECTION_OF__DISJOINT_CLASSES = CLASS_EXPRESSION__DISJOINT_CLASSES;

	/**
	 * The feature id for the '<em><b>Equivalent Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INTERSECTION_OF__EQUIVALENT_CLASSES = CLASS_EXPRESSION__EQUIVALENT_CLASSES;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INTERSECTION_OF__NODE_ID = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INTERSECTION_OF__GRAPH = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Intersection Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INTERSECTION_OF__INTERSECTION_OF = CLASS_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Intersection Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INTERSECTION_OF_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectComplementOfImpl <em>Object Complement Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectComplementOfImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectComplementOf()
	 * @generated
	 */
	int OBJECT_COMPLEMENT_OF = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPLEMENT_OF__LABEL = CLASS_EXPRESSION__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPLEMENT_OF__COMMENT = CLASS_EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPLEMENT_OF__OBJECT_OF = CLASS_EXPRESSION__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPLEMENT_OF__SUBJECT_OF = CLASS_EXPRESSION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPLEMENT_OF__ANNOTATIONS = CLASS_EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPLEMENT_OF__KEYS = CLASS_EXPRESSION__KEYS;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPLEMENT_OF__SUB_CLASS_OF = CLASS_EXPRESSION__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPLEMENT_OF__SUPER_CLASS = CLASS_EXPRESSION__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Disjoint Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPLEMENT_OF__DISJOINT_CLASSES = CLASS_EXPRESSION__DISJOINT_CLASSES;

	/**
	 * The feature id for the '<em><b>Equivalent Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPLEMENT_OF__EQUIVALENT_CLASSES = CLASS_EXPRESSION__EQUIVALENT_CLASSES;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPLEMENT_OF__NODE_ID = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPLEMENT_OF__GRAPH = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Complement Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPLEMENT_OF__COMPLEMENT_OF = CLASS_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Complement Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPLEMENT_OF_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectOneOfImpl <em>Object One Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectOneOfImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectOneOf()
	 * @generated
	 */
	int OBJECT_ONE_OF = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ONE_OF__LABEL = CLASS_EXPRESSION__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ONE_OF__COMMENT = CLASS_EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ONE_OF__OBJECT_OF = CLASS_EXPRESSION__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ONE_OF__SUBJECT_OF = CLASS_EXPRESSION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ONE_OF__ANNOTATIONS = CLASS_EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ONE_OF__KEYS = CLASS_EXPRESSION__KEYS;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ONE_OF__SUB_CLASS_OF = CLASS_EXPRESSION__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ONE_OF__SUPER_CLASS = CLASS_EXPRESSION__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Disjoint Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ONE_OF__DISJOINT_CLASSES = CLASS_EXPRESSION__DISJOINT_CLASSES;

	/**
	 * The feature id for the '<em><b>Equivalent Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ONE_OF__EQUIVALENT_CLASSES = CLASS_EXPRESSION__EQUIVALENT_CLASSES;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ONE_OF__NODE_ID = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ONE_OF__GRAPH = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ONE_OF__ONE_OF = CLASS_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object One Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ONE_OF_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectPropertyRestrictionImpl <em>Object Property Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectPropertyRestrictionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectPropertyRestriction()
	 * @generated
	 */
	int OBJECT_PROPERTY_RESTRICTION = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_RESTRICTION__LABEL = CLASS_EXPRESSION__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_RESTRICTION__COMMENT = CLASS_EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_RESTRICTION__OBJECT_OF = CLASS_EXPRESSION__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_RESTRICTION__SUBJECT_OF = CLASS_EXPRESSION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_RESTRICTION__ANNOTATIONS = CLASS_EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_RESTRICTION__KEYS = CLASS_EXPRESSION__KEYS;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_RESTRICTION__SUB_CLASS_OF = CLASS_EXPRESSION__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_RESTRICTION__SUPER_CLASS = CLASS_EXPRESSION__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Disjoint Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_RESTRICTION__DISJOINT_CLASSES = CLASS_EXPRESSION__DISJOINT_CLASSES;

	/**
	 * The feature id for the '<em><b>Equivalent Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_RESTRICTION__EQUIVALENT_CLASSES = CLASS_EXPRESSION__EQUIVALENT_CLASSES;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_RESTRICTION__NODE_ID = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_RESTRICTION__GRAPH = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_RESTRICTION__PROPERTY = CLASS_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Property Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectSomeValuesFromImpl <em>Object Some Values From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectSomeValuesFromImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectSomeValuesFrom()
	 * @generated
	 */
	int OBJECT_SOME_VALUES_FROM = 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SOME_VALUES_FROM__LABEL = OBJECT_PROPERTY_RESTRICTION__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SOME_VALUES_FROM__COMMENT = OBJECT_PROPERTY_RESTRICTION__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SOME_VALUES_FROM__OBJECT_OF = OBJECT_PROPERTY_RESTRICTION__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SOME_VALUES_FROM__SUBJECT_OF = OBJECT_PROPERTY_RESTRICTION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SOME_VALUES_FROM__ANNOTATIONS = OBJECT_PROPERTY_RESTRICTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SOME_VALUES_FROM__KEYS = OBJECT_PROPERTY_RESTRICTION__KEYS;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SOME_VALUES_FROM__SUB_CLASS_OF = OBJECT_PROPERTY_RESTRICTION__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SOME_VALUES_FROM__SUPER_CLASS = OBJECT_PROPERTY_RESTRICTION__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Disjoint Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SOME_VALUES_FROM__DISJOINT_CLASSES = OBJECT_PROPERTY_RESTRICTION__DISJOINT_CLASSES;

	/**
	 * The feature id for the '<em><b>Equivalent Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SOME_VALUES_FROM__EQUIVALENT_CLASSES = OBJECT_PROPERTY_RESTRICTION__EQUIVALENT_CLASSES;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SOME_VALUES_FROM__NODE_ID = OBJECT_PROPERTY_RESTRICTION__NODE_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SOME_VALUES_FROM__GRAPH = OBJECT_PROPERTY_RESTRICTION__GRAPH;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SOME_VALUES_FROM__PROPERTY = OBJECT_PROPERTY_RESTRICTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Some Values From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SOME_VALUES_FROM__SOME_VALUES_FROM = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Some Values From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SOME_VALUES_FROM_FEATURE_COUNT = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectAllValuesFromImpl <em>Object All Values From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectAllValuesFromImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectAllValuesFrom()
	 * @generated
	 */
	int OBJECT_ALL_VALUES_FROM = 10;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ALL_VALUES_FROM__LABEL = OBJECT_PROPERTY_RESTRICTION__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ALL_VALUES_FROM__COMMENT = OBJECT_PROPERTY_RESTRICTION__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ALL_VALUES_FROM__OBJECT_OF = OBJECT_PROPERTY_RESTRICTION__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ALL_VALUES_FROM__SUBJECT_OF = OBJECT_PROPERTY_RESTRICTION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ALL_VALUES_FROM__ANNOTATIONS = OBJECT_PROPERTY_RESTRICTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ALL_VALUES_FROM__KEYS = OBJECT_PROPERTY_RESTRICTION__KEYS;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ALL_VALUES_FROM__SUB_CLASS_OF = OBJECT_PROPERTY_RESTRICTION__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ALL_VALUES_FROM__SUPER_CLASS = OBJECT_PROPERTY_RESTRICTION__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Disjoint Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ALL_VALUES_FROM__DISJOINT_CLASSES = OBJECT_PROPERTY_RESTRICTION__DISJOINT_CLASSES;

	/**
	 * The feature id for the '<em><b>Equivalent Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ALL_VALUES_FROM__EQUIVALENT_CLASSES = OBJECT_PROPERTY_RESTRICTION__EQUIVALENT_CLASSES;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ALL_VALUES_FROM__NODE_ID = OBJECT_PROPERTY_RESTRICTION__NODE_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ALL_VALUES_FROM__GRAPH = OBJECT_PROPERTY_RESTRICTION__GRAPH;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ALL_VALUES_FROM__PROPERTY = OBJECT_PROPERTY_RESTRICTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>All Values From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ALL_VALUES_FROM__ALL_VALUES_FROM = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object All Values From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ALL_VALUES_FROM_FEATURE_COUNT = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectHasValueImpl <em>Object Has Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectHasValueImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectHasValue()
	 * @generated
	 */
	int OBJECT_HAS_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_VALUE__LABEL = OBJECT_PROPERTY_RESTRICTION__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_VALUE__COMMENT = OBJECT_PROPERTY_RESTRICTION__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_VALUE__OBJECT_OF = OBJECT_PROPERTY_RESTRICTION__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_VALUE__SUBJECT_OF = OBJECT_PROPERTY_RESTRICTION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_VALUE__ANNOTATIONS = OBJECT_PROPERTY_RESTRICTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_VALUE__KEYS = OBJECT_PROPERTY_RESTRICTION__KEYS;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_VALUE__SUB_CLASS_OF = OBJECT_PROPERTY_RESTRICTION__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_VALUE__SUPER_CLASS = OBJECT_PROPERTY_RESTRICTION__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Disjoint Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_VALUE__DISJOINT_CLASSES = OBJECT_PROPERTY_RESTRICTION__DISJOINT_CLASSES;

	/**
	 * The feature id for the '<em><b>Equivalent Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_VALUE__EQUIVALENT_CLASSES = OBJECT_PROPERTY_RESTRICTION__EQUIVALENT_CLASSES;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_VALUE__NODE_ID = OBJECT_PROPERTY_RESTRICTION__NODE_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_VALUE__GRAPH = OBJECT_PROPERTY_RESTRICTION__GRAPH;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_VALUE__PROPERTY = OBJECT_PROPERTY_RESTRICTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Has Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_VALUE__HAS_VALUE = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Has Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_VALUE_FEATURE_COUNT = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectHasSelfImpl <em>Object Has Self</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectHasSelfImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectHasSelf()
	 * @generated
	 */
	int OBJECT_HAS_SELF = 12;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_SELF__LABEL = OBJECT_PROPERTY_RESTRICTION__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_SELF__COMMENT = OBJECT_PROPERTY_RESTRICTION__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_SELF__OBJECT_OF = OBJECT_PROPERTY_RESTRICTION__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_SELF__SUBJECT_OF = OBJECT_PROPERTY_RESTRICTION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_SELF__ANNOTATIONS = OBJECT_PROPERTY_RESTRICTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_SELF__KEYS = OBJECT_PROPERTY_RESTRICTION__KEYS;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_SELF__SUB_CLASS_OF = OBJECT_PROPERTY_RESTRICTION__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_SELF__SUPER_CLASS = OBJECT_PROPERTY_RESTRICTION__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Disjoint Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_SELF__DISJOINT_CLASSES = OBJECT_PROPERTY_RESTRICTION__DISJOINT_CLASSES;

	/**
	 * The feature id for the '<em><b>Equivalent Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_SELF__EQUIVALENT_CLASSES = OBJECT_PROPERTY_RESTRICTION__EQUIVALENT_CLASSES;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_SELF__NODE_ID = OBJECT_PROPERTY_RESTRICTION__NODE_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_SELF__GRAPH = OBJECT_PROPERTY_RESTRICTION__GRAPH;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_SELF__PROPERTY = OBJECT_PROPERTY_RESTRICTION__PROPERTY;

	/**
	 * The number of structural features of the '<em>Object Has Self</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_SELF_FEATURE_COUNT = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectExactCardinalityImpl <em>Object Exact Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectExactCardinalityImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectExactCardinality()
	 * @generated
	 */
	int OBJECT_EXACT_CARDINALITY = 13;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXACT_CARDINALITY__LABEL = OBJECT_PROPERTY_RESTRICTION__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXACT_CARDINALITY__COMMENT = OBJECT_PROPERTY_RESTRICTION__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXACT_CARDINALITY__OBJECT_OF = OBJECT_PROPERTY_RESTRICTION__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXACT_CARDINALITY__SUBJECT_OF = OBJECT_PROPERTY_RESTRICTION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXACT_CARDINALITY__ANNOTATIONS = OBJECT_PROPERTY_RESTRICTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXACT_CARDINALITY__KEYS = OBJECT_PROPERTY_RESTRICTION__KEYS;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXACT_CARDINALITY__SUB_CLASS_OF = OBJECT_PROPERTY_RESTRICTION__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXACT_CARDINALITY__SUPER_CLASS = OBJECT_PROPERTY_RESTRICTION__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Disjoint Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXACT_CARDINALITY__DISJOINT_CLASSES = OBJECT_PROPERTY_RESTRICTION__DISJOINT_CLASSES;

	/**
	 * The feature id for the '<em><b>Equivalent Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXACT_CARDINALITY__EQUIVALENT_CLASSES = OBJECT_PROPERTY_RESTRICTION__EQUIVALENT_CLASSES;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXACT_CARDINALITY__NODE_ID = OBJECT_PROPERTY_RESTRICTION__NODE_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXACT_CARDINALITY__GRAPH = OBJECT_PROPERTY_RESTRICTION__GRAPH;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXACT_CARDINALITY__PROPERTY = OBJECT_PROPERTY_RESTRICTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXACT_CARDINALITY__CARDINALITY = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXACT_CARDINALITY__ON_CLASS = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Exact Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXACT_CARDINALITY_FEATURE_COUNT = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectMaxCardinalityImpl <em>Object Max Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectMaxCardinalityImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectMaxCardinality()
	 * @generated
	 */
	int OBJECT_MAX_CARDINALITY = 14;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAX_CARDINALITY__LABEL = OBJECT_PROPERTY_RESTRICTION__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAX_CARDINALITY__COMMENT = OBJECT_PROPERTY_RESTRICTION__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAX_CARDINALITY__OBJECT_OF = OBJECT_PROPERTY_RESTRICTION__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAX_CARDINALITY__SUBJECT_OF = OBJECT_PROPERTY_RESTRICTION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAX_CARDINALITY__ANNOTATIONS = OBJECT_PROPERTY_RESTRICTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAX_CARDINALITY__KEYS = OBJECT_PROPERTY_RESTRICTION__KEYS;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAX_CARDINALITY__SUB_CLASS_OF = OBJECT_PROPERTY_RESTRICTION__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAX_CARDINALITY__SUPER_CLASS = OBJECT_PROPERTY_RESTRICTION__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Disjoint Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAX_CARDINALITY__DISJOINT_CLASSES = OBJECT_PROPERTY_RESTRICTION__DISJOINT_CLASSES;

	/**
	 * The feature id for the '<em><b>Equivalent Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAX_CARDINALITY__EQUIVALENT_CLASSES = OBJECT_PROPERTY_RESTRICTION__EQUIVALENT_CLASSES;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAX_CARDINALITY__NODE_ID = OBJECT_PROPERTY_RESTRICTION__NODE_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAX_CARDINALITY__GRAPH = OBJECT_PROPERTY_RESTRICTION__GRAPH;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAX_CARDINALITY__PROPERTY = OBJECT_PROPERTY_RESTRICTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAX_CARDINALITY__CARDINALITY = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAX_CARDINALITY__ON_CLASS = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Max Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAX_CARDINALITY_FEATURE_COUNT = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectMinCardinalityImpl <em>Object Min Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectMinCardinalityImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectMinCardinality()
	 * @generated
	 */
	int OBJECT_MIN_CARDINALITY = 15;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MIN_CARDINALITY__LABEL = OBJECT_PROPERTY_RESTRICTION__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MIN_CARDINALITY__COMMENT = OBJECT_PROPERTY_RESTRICTION__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MIN_CARDINALITY__OBJECT_OF = OBJECT_PROPERTY_RESTRICTION__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MIN_CARDINALITY__SUBJECT_OF = OBJECT_PROPERTY_RESTRICTION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MIN_CARDINALITY__ANNOTATIONS = OBJECT_PROPERTY_RESTRICTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MIN_CARDINALITY__KEYS = OBJECT_PROPERTY_RESTRICTION__KEYS;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MIN_CARDINALITY__SUB_CLASS_OF = OBJECT_PROPERTY_RESTRICTION__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MIN_CARDINALITY__SUPER_CLASS = OBJECT_PROPERTY_RESTRICTION__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Disjoint Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MIN_CARDINALITY__DISJOINT_CLASSES = OBJECT_PROPERTY_RESTRICTION__DISJOINT_CLASSES;

	/**
	 * The feature id for the '<em><b>Equivalent Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MIN_CARDINALITY__EQUIVALENT_CLASSES = OBJECT_PROPERTY_RESTRICTION__EQUIVALENT_CLASSES;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MIN_CARDINALITY__NODE_ID = OBJECT_PROPERTY_RESTRICTION__NODE_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MIN_CARDINALITY__GRAPH = OBJECT_PROPERTY_RESTRICTION__GRAPH;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MIN_CARDINALITY__PROPERTY = OBJECT_PROPERTY_RESTRICTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MIN_CARDINALITY__CARDINALITY = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MIN_CARDINALITY__ON_CLASS = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Min Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MIN_CARDINALITY_FEATURE_COUNT = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataPropertyRestrictionImpl <em>Data Property Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataPropertyRestrictionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataPropertyRestriction()
	 * @generated
	 */
	int DATA_PROPERTY_RESTRICTION = 16;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_RESTRICTION__LABEL = CLASS_EXPRESSION__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_RESTRICTION__COMMENT = CLASS_EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_RESTRICTION__OBJECT_OF = CLASS_EXPRESSION__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_RESTRICTION__SUBJECT_OF = CLASS_EXPRESSION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_RESTRICTION__ANNOTATIONS = CLASS_EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_RESTRICTION__KEYS = CLASS_EXPRESSION__KEYS;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_RESTRICTION__SUB_CLASS_OF = CLASS_EXPRESSION__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_RESTRICTION__SUPER_CLASS = CLASS_EXPRESSION__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Disjoint Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_RESTRICTION__DISJOINT_CLASSES = CLASS_EXPRESSION__DISJOINT_CLASSES;

	/**
	 * The feature id for the '<em><b>Equivalent Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_RESTRICTION__EQUIVALENT_CLASSES = CLASS_EXPRESSION__EQUIVALENT_CLASSES;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_RESTRICTION__NODE_ID = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_RESTRICTION__GRAPH = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Property Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_RESTRICTION_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataSomeValuesFromImpl <em>Data Some Values From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataSomeValuesFromImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataSomeValuesFrom()
	 * @generated
	 */
	int DATA_SOME_VALUES_FROM = 17;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOME_VALUES_FROM__LABEL = DATA_PROPERTY_RESTRICTION__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOME_VALUES_FROM__COMMENT = DATA_PROPERTY_RESTRICTION__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOME_VALUES_FROM__OBJECT_OF = DATA_PROPERTY_RESTRICTION__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOME_VALUES_FROM__SUBJECT_OF = DATA_PROPERTY_RESTRICTION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOME_VALUES_FROM__ANNOTATIONS = DATA_PROPERTY_RESTRICTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOME_VALUES_FROM__KEYS = DATA_PROPERTY_RESTRICTION__KEYS;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOME_VALUES_FROM__SUB_CLASS_OF = DATA_PROPERTY_RESTRICTION__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOME_VALUES_FROM__SUPER_CLASS = DATA_PROPERTY_RESTRICTION__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Disjoint Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOME_VALUES_FROM__DISJOINT_CLASSES = DATA_PROPERTY_RESTRICTION__DISJOINT_CLASSES;

	/**
	 * The feature id for the '<em><b>Equivalent Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOME_VALUES_FROM__EQUIVALENT_CLASSES = DATA_PROPERTY_RESTRICTION__EQUIVALENT_CLASSES;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOME_VALUES_FROM__NODE_ID = DATA_PROPERTY_RESTRICTION__NODE_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOME_VALUES_FROM__GRAPH = DATA_PROPERTY_RESTRICTION__GRAPH;

	/**
	 * The feature id for the '<em><b>Some Values From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOME_VALUES_FROM__SOME_VALUES_FROM = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOME_VALUES_FROM__PROPERTIES = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Some Values From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOME_VALUES_FROM_FEATURE_COUNT = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataAllValuesFromImpl <em>Data All Values From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataAllValuesFromImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataAllValuesFrom()
	 * @generated
	 */
	int DATA_ALL_VALUES_FROM = 18;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ALL_VALUES_FROM__LABEL = DATA_PROPERTY_RESTRICTION__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ALL_VALUES_FROM__COMMENT = DATA_PROPERTY_RESTRICTION__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ALL_VALUES_FROM__OBJECT_OF = DATA_PROPERTY_RESTRICTION__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ALL_VALUES_FROM__SUBJECT_OF = DATA_PROPERTY_RESTRICTION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ALL_VALUES_FROM__ANNOTATIONS = DATA_PROPERTY_RESTRICTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ALL_VALUES_FROM__KEYS = DATA_PROPERTY_RESTRICTION__KEYS;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ALL_VALUES_FROM__SUB_CLASS_OF = DATA_PROPERTY_RESTRICTION__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ALL_VALUES_FROM__SUPER_CLASS = DATA_PROPERTY_RESTRICTION__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Disjoint Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ALL_VALUES_FROM__DISJOINT_CLASSES = DATA_PROPERTY_RESTRICTION__DISJOINT_CLASSES;

	/**
	 * The feature id for the '<em><b>Equivalent Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ALL_VALUES_FROM__EQUIVALENT_CLASSES = DATA_PROPERTY_RESTRICTION__EQUIVALENT_CLASSES;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ALL_VALUES_FROM__NODE_ID = DATA_PROPERTY_RESTRICTION__NODE_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ALL_VALUES_FROM__GRAPH = DATA_PROPERTY_RESTRICTION__GRAPH;

	/**
	 * The feature id for the '<em><b>All Values From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ALL_VALUES_FROM__ALL_VALUES_FROM = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ALL_VALUES_FROM__PROPERTIES = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data All Values From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ALL_VALUES_FROM_FEATURE_COUNT = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataHasValueImpl <em>Data Has Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataHasValueImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataHasValue()
	 * @generated
	 */
	int DATA_HAS_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HAS_VALUE__LABEL = DATA_PROPERTY_RESTRICTION__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HAS_VALUE__COMMENT = DATA_PROPERTY_RESTRICTION__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HAS_VALUE__OBJECT_OF = DATA_PROPERTY_RESTRICTION__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HAS_VALUE__SUBJECT_OF = DATA_PROPERTY_RESTRICTION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HAS_VALUE__ANNOTATIONS = DATA_PROPERTY_RESTRICTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HAS_VALUE__KEYS = DATA_PROPERTY_RESTRICTION__KEYS;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HAS_VALUE__SUB_CLASS_OF = DATA_PROPERTY_RESTRICTION__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HAS_VALUE__SUPER_CLASS = DATA_PROPERTY_RESTRICTION__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Disjoint Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HAS_VALUE__DISJOINT_CLASSES = DATA_PROPERTY_RESTRICTION__DISJOINT_CLASSES;

	/**
	 * The feature id for the '<em><b>Equivalent Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HAS_VALUE__EQUIVALENT_CLASSES = DATA_PROPERTY_RESTRICTION__EQUIVALENT_CLASSES;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HAS_VALUE__NODE_ID = DATA_PROPERTY_RESTRICTION__NODE_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HAS_VALUE__GRAPH = DATA_PROPERTY_RESTRICTION__GRAPH;

	/**
	 * The feature id for the '<em><b>Has Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HAS_VALUE__HAS_VALUE = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HAS_VALUE__PROPERTY = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Has Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HAS_VALUE_FEATURE_COUNT = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataExactCardinalityImpl <em>Data Exact Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataExactCardinalityImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataExactCardinality()
	 * @generated
	 */
	int DATA_EXACT_CARDINALITY = 20;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXACT_CARDINALITY__LABEL = DATA_PROPERTY_RESTRICTION__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXACT_CARDINALITY__COMMENT = DATA_PROPERTY_RESTRICTION__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXACT_CARDINALITY__OBJECT_OF = DATA_PROPERTY_RESTRICTION__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXACT_CARDINALITY__SUBJECT_OF = DATA_PROPERTY_RESTRICTION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXACT_CARDINALITY__ANNOTATIONS = DATA_PROPERTY_RESTRICTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXACT_CARDINALITY__KEYS = DATA_PROPERTY_RESTRICTION__KEYS;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXACT_CARDINALITY__SUB_CLASS_OF = DATA_PROPERTY_RESTRICTION__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXACT_CARDINALITY__SUPER_CLASS = DATA_PROPERTY_RESTRICTION__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Disjoint Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXACT_CARDINALITY__DISJOINT_CLASSES = DATA_PROPERTY_RESTRICTION__DISJOINT_CLASSES;

	/**
	 * The feature id for the '<em><b>Equivalent Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXACT_CARDINALITY__EQUIVALENT_CLASSES = DATA_PROPERTY_RESTRICTION__EQUIVALENT_CLASSES;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXACT_CARDINALITY__NODE_ID = DATA_PROPERTY_RESTRICTION__NODE_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXACT_CARDINALITY__GRAPH = DATA_PROPERTY_RESTRICTION__GRAPH;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXACT_CARDINALITY__CARDINALITY = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXACT_CARDINALITY__DATA_RANGE = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXACT_CARDINALITY__PROPERTY = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Exact Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXACT_CARDINALITY_FEATURE_COUNT = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataMaxCardinalityImpl <em>Data Max Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataMaxCardinalityImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataMaxCardinality()
	 * @generated
	 */
	int DATA_MAX_CARDINALITY = 21;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAX_CARDINALITY__LABEL = DATA_PROPERTY_RESTRICTION__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAX_CARDINALITY__COMMENT = DATA_PROPERTY_RESTRICTION__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAX_CARDINALITY__OBJECT_OF = DATA_PROPERTY_RESTRICTION__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAX_CARDINALITY__SUBJECT_OF = DATA_PROPERTY_RESTRICTION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAX_CARDINALITY__ANNOTATIONS = DATA_PROPERTY_RESTRICTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAX_CARDINALITY__KEYS = DATA_PROPERTY_RESTRICTION__KEYS;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAX_CARDINALITY__SUB_CLASS_OF = DATA_PROPERTY_RESTRICTION__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAX_CARDINALITY__SUPER_CLASS = DATA_PROPERTY_RESTRICTION__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Disjoint Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAX_CARDINALITY__DISJOINT_CLASSES = DATA_PROPERTY_RESTRICTION__DISJOINT_CLASSES;

	/**
	 * The feature id for the '<em><b>Equivalent Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAX_CARDINALITY__EQUIVALENT_CLASSES = DATA_PROPERTY_RESTRICTION__EQUIVALENT_CLASSES;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAX_CARDINALITY__NODE_ID = DATA_PROPERTY_RESTRICTION__NODE_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAX_CARDINALITY__GRAPH = DATA_PROPERTY_RESTRICTION__GRAPH;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAX_CARDINALITY__CARDINALITY = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAX_CARDINALITY__DATA_RANGE = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAX_CARDINALITY__PROPERTY = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Max Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAX_CARDINALITY_FEATURE_COUNT = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataMinCardinalityImpl <em>Data Min Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataMinCardinalityImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataMinCardinality()
	 * @generated
	 */
	int DATA_MIN_CARDINALITY = 22;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIN_CARDINALITY__LABEL = DATA_PROPERTY_RESTRICTION__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIN_CARDINALITY__COMMENT = DATA_PROPERTY_RESTRICTION__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIN_CARDINALITY__OBJECT_OF = DATA_PROPERTY_RESTRICTION__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIN_CARDINALITY__SUBJECT_OF = DATA_PROPERTY_RESTRICTION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIN_CARDINALITY__ANNOTATIONS = DATA_PROPERTY_RESTRICTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIN_CARDINALITY__KEYS = DATA_PROPERTY_RESTRICTION__KEYS;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIN_CARDINALITY__SUB_CLASS_OF = DATA_PROPERTY_RESTRICTION__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIN_CARDINALITY__SUPER_CLASS = DATA_PROPERTY_RESTRICTION__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Disjoint Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIN_CARDINALITY__DISJOINT_CLASSES = DATA_PROPERTY_RESTRICTION__DISJOINT_CLASSES;

	/**
	 * The feature id for the '<em><b>Equivalent Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIN_CARDINALITY__EQUIVALENT_CLASSES = DATA_PROPERTY_RESTRICTION__EQUIVALENT_CLASSES;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIN_CARDINALITY__NODE_ID = DATA_PROPERTY_RESTRICTION__NODE_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIN_CARDINALITY__GRAPH = DATA_PROPERTY_RESTRICTION__GRAPH;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIN_CARDINALITY__CARDINALITY = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIN_CARDINALITY__DATA_RANGE = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIN_CARDINALITY__PROPERTY = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Min Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIN_CARDINALITY_FEATURE_COUNT = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.OWLPropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.OWLPropertyImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getOWLProperty()
	 * @generated
	 */
	int OWL_PROPERTY = 23;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_PROPERTY__LABEL = RDFPackage.RESOURCE__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_PROPERTY__COMMENT = RDFPackage.RESOURCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_PROPERTY__OBJECT_OF = RDFPackage.RESOURCE__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_PROPERTY__SUBJECT_OF = RDFPackage.RESOURCE__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_PROPERTY__URI = RDFPackage.RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_PROPERTY__NAMESPACE = RDFPackage.RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_PROPERTY__GRAPH = RDFPackage.RESOURCE__GRAPH;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_PROPERTY__ANNOTATIONS = RDFPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_PROPERTY_FEATURE_COUNT = RDFPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ClassPropertyImpl <em>Class Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ClassPropertyImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getClassProperty()
	 * @generated
	 */
	int CLASS_PROPERTY = 24;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PROPERTY__LABEL = OWL_PROPERTY__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PROPERTY__COMMENT = OWL_PROPERTY__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PROPERTY__OBJECT_OF = OWL_PROPERTY__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PROPERTY__SUBJECT_OF = OWL_PROPERTY__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PROPERTY__URI = OWL_PROPERTY__URI;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PROPERTY__NAMESPACE = OWL_PROPERTY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PROPERTY__GRAPH = OWL_PROPERTY__GRAPH;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PROPERTY__ANNOTATIONS = OWL_PROPERTY__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PROPERTY__IS_FUNCTIONAL = OWL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PROPERTY__DOMAIN = OWL_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PROPERTY_FEATURE_COUNT = OWL_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataPropertyImpl <em>Data Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataPropertyImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataProperty()
	 * @generated
	 */
	int DATA_PROPERTY = 25;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__LABEL = CLASS_PROPERTY__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__COMMENT = CLASS_PROPERTY__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__OBJECT_OF = CLASS_PROPERTY__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__SUBJECT_OF = CLASS_PROPERTY__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__URI = CLASS_PROPERTY__URI;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__NAMESPACE = CLASS_PROPERTY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__GRAPH = CLASS_PROPERTY__GRAPH;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__ANNOTATIONS = CLASS_PROPERTY__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__IS_FUNCTIONAL = CLASS_PROPERTY__IS_FUNCTIONAL;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__DOMAIN = CLASS_PROPERTY__DOMAIN;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__RANGE = CLASS_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Equivalent Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__EQUIVALENT_PROPERTIES = CLASS_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Property Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__SUB_PROPERTY_OF = CLASS_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disjoint Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__DISJOINT_PROPERTIES = CLASS_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_FEATURE_COUNT = CLASS_PROPERTY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectPropertyImpl <em>Object Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectPropertyImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectProperty()
	 * @generated
	 */
	int OBJECT_PROPERTY = 26;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__LABEL = CLASS_PROPERTY__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__COMMENT = CLASS_PROPERTY__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__OBJECT_OF = CLASS_PROPERTY__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__SUBJECT_OF = CLASS_PROPERTY__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__URI = CLASS_PROPERTY__URI;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__NAMESPACE = CLASS_PROPERTY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__GRAPH = CLASS_PROPERTY__GRAPH;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__ANNOTATIONS = CLASS_PROPERTY__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__IS_FUNCTIONAL = CLASS_PROPERTY__IS_FUNCTIONAL;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__DOMAIN = CLASS_PROPERTY__DOMAIN;

	/**
	 * The feature id for the '<em><b>Is Inverse Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__IS_INVERSE_FUNCTIONAL = CLASS_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Symmetric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__IS_SYMMETRIC = CLASS_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Asymmetric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__IS_ASYMMETRIC = CLASS_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__IS_TRANSITIVE = CLASS_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Reflexive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__IS_REFLEXIVE = CLASS_PROPERTY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Irreflexive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__IS_IRREFLEXIVE = CLASS_PROPERTY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Inverse Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__INVERSE_OF = CLASS_PROPERTY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__RANGE = CLASS_PROPERTY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Equivalent Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__EQUIVALENT_PROPERTIES = CLASS_PROPERTY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Sub Property Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__SUB_PROPERTY_OF = CLASS_PROPERTY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Disjoint Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__DISJOINT_PROPERTIES = CLASS_PROPERTY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Object Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_FEATURE_COUNT = CLASS_PROPERTY_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectPropertyChainImpl <em>Object Property Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectPropertyChainImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectPropertyChain()
	 * @generated
	 */
	int OBJECT_PROPERTY_CHAIN = 27;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_CHAIN__LABEL = OBJECT_PROPERTY__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_CHAIN__COMMENT = OBJECT_PROPERTY__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_CHAIN__OBJECT_OF = OBJECT_PROPERTY__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_CHAIN__SUBJECT_OF = OBJECT_PROPERTY__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_CHAIN__URI = OBJECT_PROPERTY__URI;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_CHAIN__NAMESPACE = OBJECT_PROPERTY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_CHAIN__GRAPH = OBJECT_PROPERTY__GRAPH;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_CHAIN__ANNOTATIONS = OBJECT_PROPERTY__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_CHAIN__IS_FUNCTIONAL = OBJECT_PROPERTY__IS_FUNCTIONAL;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_CHAIN__DOMAIN = OBJECT_PROPERTY__DOMAIN;

	/**
	 * The feature id for the '<em><b>Is Inverse Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_CHAIN__IS_INVERSE_FUNCTIONAL = OBJECT_PROPERTY__IS_INVERSE_FUNCTIONAL;

	/**
	 * The feature id for the '<em><b>Is Symmetric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_CHAIN__IS_SYMMETRIC = OBJECT_PROPERTY__IS_SYMMETRIC;

	/**
	 * The feature id for the '<em><b>Is Asymmetric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_CHAIN__IS_ASYMMETRIC = OBJECT_PROPERTY__IS_ASYMMETRIC;

	/**
	 * The feature id for the '<em><b>Is Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_CHAIN__IS_TRANSITIVE = OBJECT_PROPERTY__IS_TRANSITIVE;

	/**
	 * The feature id for the '<em><b>Is Reflexive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_CHAIN__IS_REFLEXIVE = OBJECT_PROPERTY__IS_REFLEXIVE;

	/**
	 * The feature id for the '<em><b>Is Irreflexive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_CHAIN__IS_IRREFLEXIVE = OBJECT_PROPERTY__IS_IRREFLEXIVE;

	/**
	 * The feature id for the '<em><b>Inverse Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_CHAIN__INVERSE_OF = OBJECT_PROPERTY__INVERSE_OF;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_CHAIN__RANGE = OBJECT_PROPERTY__RANGE;

	/**
	 * The feature id for the '<em><b>Equivalent Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_CHAIN__EQUIVALENT_PROPERTIES = OBJECT_PROPERTY__EQUIVALENT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Sub Property Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_CHAIN__SUB_PROPERTY_OF = OBJECT_PROPERTY__SUB_PROPERTY_OF;

	/**
	 * The feature id for the '<em><b>Disjoint Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_CHAIN__DISJOINT_PROPERTIES = OBJECT_PROPERTY__DISJOINT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_CHAIN__PROPERTIES = OBJECT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Property Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_CHAIN_FEATURE_COUNT = OBJECT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.AnnotationPropertyImpl <em>Annotation Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.AnnotationPropertyImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAnnotationProperty()
	 * @generated
	 */
	int ANNOTATION_PROPERTY = 28;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY__LABEL = OWL_PROPERTY__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY__COMMENT = OWL_PROPERTY__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY__OBJECT_OF = OWL_PROPERTY__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY__SUBJECT_OF = OWL_PROPERTY__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY__URI = OWL_PROPERTY__URI;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY__NAMESPACE = OWL_PROPERTY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY__GRAPH = OWL_PROPERTY__GRAPH;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY__ANNOTATIONS = OWL_PROPERTY__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Annotation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_FEATURE_COUNT = OWL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataRangeImpl <em>Data Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataRangeImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataRange()
	 * @generated
	 */
	int DATA_RANGE = 29;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__LABEL = RDFPackage.SUBJECT_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__COMMENT = RDFPackage.SUBJECT_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__OBJECT_OF = RDFPackage.SUBJECT_NODE__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__SUBJECT_OF = RDFPackage.SUBJECT_NODE__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__ANNOTATIONS = RDFPackage.SUBJECT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_FEATURE_COUNT = RDFPackage.SUBJECT_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.OWLDatatypeImpl <em>Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.OWLDatatypeImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getOWLDatatype()
	 * @generated
	 */
	int OWL_DATATYPE = 30;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE__LABEL = RDFPackage.DATATYPE__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE__COMMENT = RDFPackage.DATATYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE__OBJECT_OF = RDFPackage.DATATYPE__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE__SUBJECT_OF = RDFPackage.DATATYPE__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE__URI = RDFPackage.DATATYPE__URI;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE__NAMESPACE = RDFPackage.DATATYPE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE__GRAPH = RDFPackage.DATATYPE__GRAPH;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE__ANNOTATIONS = RDFPackage.DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE_FEATURE_COUNT = RDFPackage.DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataComplementOfImpl <em>Data Complement Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataComplementOfImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataComplementOf()
	 * @generated
	 */
	int DATA_COMPLEMENT_OF = 31;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COMPLEMENT_OF__LABEL = DATA_RANGE__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COMPLEMENT_OF__COMMENT = DATA_RANGE__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COMPLEMENT_OF__OBJECT_OF = DATA_RANGE__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COMPLEMENT_OF__SUBJECT_OF = DATA_RANGE__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COMPLEMENT_OF__ANNOTATIONS = DATA_RANGE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Data Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COMPLEMENT_OF__DATA_RANGE = DATA_RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Complement Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COMPLEMENT_OF_FEATURE_COUNT = DATA_RANGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataUnionOfImpl <em>Data Union Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataUnionOfImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataUnionOf()
	 * @generated
	 */
	int DATA_UNION_OF = 32;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNION_OF__LABEL = DATA_RANGE__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNION_OF__COMMENT = DATA_RANGE__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNION_OF__OBJECT_OF = DATA_RANGE__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNION_OF__SUBJECT_OF = DATA_RANGE__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNION_OF__ANNOTATIONS = DATA_RANGE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Data Ranges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNION_OF__DATA_RANGES = DATA_RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Union Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNION_OF_FEATURE_COUNT = DATA_RANGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataIntersectionOfImpl <em>Data Intersection Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataIntersectionOfImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataIntersectionOf()
	 * @generated
	 */
	int DATA_INTERSECTION_OF = 33;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTERSECTION_OF__LABEL = DATA_RANGE__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTERSECTION_OF__COMMENT = DATA_RANGE__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTERSECTION_OF__OBJECT_OF = DATA_RANGE__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTERSECTION_OF__SUBJECT_OF = DATA_RANGE__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTERSECTION_OF__ANNOTATIONS = DATA_RANGE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Data Ranges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTERSECTION_OF__DATA_RANGES = DATA_RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Intersection Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTERSECTION_OF_FEATURE_COUNT = DATA_RANGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataOneOfImpl <em>Data One Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataOneOfImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataOneOf()
	 * @generated
	 */
	int DATA_ONE_OF = 34;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ONE_OF__LABEL = DATA_RANGE__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ONE_OF__COMMENT = DATA_RANGE__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ONE_OF__OBJECT_OF = DATA_RANGE__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ONE_OF__SUBJECT_OF = DATA_RANGE__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ONE_OF__ANNOTATIONS = DATA_RANGE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ONE_OF__ONE_OF = DATA_RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data One Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ONE_OF_FEATURE_COUNT = DATA_RANGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DatatypeRestrictionImpl <em>Datatype Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DatatypeRestrictionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDatatypeRestriction()
	 * @generated
	 */
	int DATATYPE_RESTRICTION = 35;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_RESTRICTION__LABEL = DATA_RANGE__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_RESTRICTION__COMMENT = DATA_RANGE__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_RESTRICTION__OBJECT_OF = DATA_RANGE__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_RESTRICTION__SUBJECT_OF = DATA_RANGE__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_RESTRICTION__ANNOTATIONS = DATA_RANGE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_RESTRICTION__DATATYPE = DATA_RANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_RESTRICTION__RESTRICTIONS = DATA_RANGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Datatype Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_RESTRICTION_FEATURE_COUNT = DATA_RANGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DatatypeDefinitionImpl <em>Datatype Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DatatypeDefinitionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDatatypeDefinition()
	 * @generated
	 */
	int DATATYPE_DEFINITION = 36;

	/**
	 * The feature id for the '<em><b>Data Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION__DATA_RANGE = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION__DATATYPE = 1;

	/**
	 * The number of structural features of the '<em>Datatype Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.FacetRestrictionImpl <em>Facet Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.FacetRestrictionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getFacetRestriction()
	 * @generated
	 */
	int FACET_RESTRICTION = 37;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_RESTRICTION__DATATYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_RESTRICTION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Facet Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_RESTRICTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.AnnotationImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 38;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATIONS = ANNOTATED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__PROPERTY = ANNOTATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__VALUE = ANNOTATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = ANNOTATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.IndividualImpl <em>Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.IndividualImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getIndividual()
	 * @generated
	 */
	int INDIVIDUAL = 39;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__LABEL = RDFPackage.RESOURCE__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__COMMENT = RDFPackage.RESOURCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__OBJECT_OF = RDFPackage.RESOURCE__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__SUBJECT_OF = RDFPackage.RESOURCE__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__URI = RDFPackage.RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__NAMESPACE = RDFPackage.RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__GRAPH = RDFPackage.RESOURCE__GRAPH;

	/**
	 * The feature id for the '<em><b>Same As</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__SAME_AS = RDFPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Different From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__DIFFERENT_FROM = RDFPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_FEATURE_COUNT = RDFPackage.RESOURCE_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.Ontology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontology</em>'.
	 * @see com.emf4sw.owl.Ontology
	 * @generated
	 */
	EClass getOntology();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.Ontology#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see com.emf4sw.owl.Ontology#getClasses()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_Classes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.Ontology#getDataProperties <em>Data Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Properties</em>'.
	 * @see com.emf4sw.owl.Ontology#getDataProperties()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_DataProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.Ontology#getObjectProperties <em>Object Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Properties</em>'.
	 * @see com.emf4sw.owl.Ontology#getObjectProperties()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_ObjectProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.Ontology#getDataRanges <em>Data Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Ranges</em>'.
	 * @see com.emf4sw.owl.Ontology#getDataRanges()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_DataRanges();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.Ontology#getClassExpressions <em>Class Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class Expressions</em>'.
	 * @see com.emf4sw.owl.Ontology#getClassExpressions()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_ClassExpressions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.Ontology#getOwlDatatypes <em>Owl Datatypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owl Datatypes</em>'.
	 * @see com.emf4sw.owl.Ontology#getOwlDatatypes()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_OwlDatatypes();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.AnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated Element</em>'.
	 * @see com.emf4sw.owl.AnnotatedElement
	 * @generated
	 */
	EClass getAnnotatedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.AnnotatedElement#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see com.emf4sw.owl.AnnotatedElement#getAnnotations()
	 * @see #getAnnotatedElement()
	 * @generated
	 */
	EReference getAnnotatedElement_Annotations();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ClassExpression <em>Class Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Expression</em>'.
	 * @see com.emf4sw.owl.ClassExpression
	 * @generated
	 */
	EClass getClassExpression();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.ClassExpression#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Keys</em>'.
	 * @see com.emf4sw.owl.ClassExpression#getKeys()
	 * @see #getClassExpression()
	 * @generated
	 */
	EReference getClassExpression_Keys();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.ClassExpression#getSubClassOf <em>Sub Class Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Class Of</em>'.
	 * @see com.emf4sw.owl.ClassExpression#getSubClassOf()
	 * @see #getClassExpression()
	 * @generated
	 */
	EReference getClassExpression_SubClassOf();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.ClassExpression#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Class</em>'.
	 * @see com.emf4sw.owl.ClassExpression#getSuperClass()
	 * @see #getClassExpression()
	 * @generated
	 */
	EReference getClassExpression_SuperClass();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.ClassExpression#getDisjointClasses <em>Disjoint Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Disjoint Classes</em>'.
	 * @see com.emf4sw.owl.ClassExpression#getDisjointClasses()
	 * @see #getClassExpression()
	 * @generated
	 */
	EReference getClassExpression_DisjointClasses();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.ClassExpression#getEquivalentClasses <em>Equivalent Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equivalent Classes</em>'.
	 * @see com.emf4sw.owl.ClassExpression#getEquivalentClasses()
	 * @see #getClassExpression()
	 * @generated
	 */
	EReference getClassExpression_EquivalentClasses();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.OWLClass <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see com.emf4sw.owl.OWLClass
	 * @generated
	 */
	EClass getOWLClass();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectUnionOf <em>Object Union Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Union Of</em>'.
	 * @see com.emf4sw.owl.ObjectUnionOf
	 * @generated
	 */
	EClass getObjectUnionOf();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.ObjectUnionOf#getUnionOf <em>Union Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Union Of</em>'.
	 * @see com.emf4sw.owl.ObjectUnionOf#getUnionOf()
	 * @see #getObjectUnionOf()
	 * @generated
	 */
	EReference getObjectUnionOf_UnionOf();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectIntersectionOf <em>Object Intersection Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Intersection Of</em>'.
	 * @see com.emf4sw.owl.ObjectIntersectionOf
	 * @generated
	 */
	EClass getObjectIntersectionOf();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.ObjectIntersectionOf#getIntersectionOf <em>Intersection Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Intersection Of</em>'.
	 * @see com.emf4sw.owl.ObjectIntersectionOf#getIntersectionOf()
	 * @see #getObjectIntersectionOf()
	 * @generated
	 */
	EReference getObjectIntersectionOf_IntersectionOf();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectComplementOf <em>Object Complement Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Complement Of</em>'.
	 * @see com.emf4sw.owl.ObjectComplementOf
	 * @generated
	 */
	EClass getObjectComplementOf();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.ObjectComplementOf#getComplementOf <em>Complement Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Complement Of</em>'.
	 * @see com.emf4sw.owl.ObjectComplementOf#getComplementOf()
	 * @see #getObjectComplementOf()
	 * @generated
	 */
	EReference getObjectComplementOf_ComplementOf();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectOneOf <em>Object One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object One Of</em>'.
	 * @see com.emf4sw.owl.ObjectOneOf
	 * @generated
	 */
	EClass getObjectOneOf();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.ObjectOneOf#getOneOf <em>One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>One Of</em>'.
	 * @see com.emf4sw.owl.ObjectOneOf#getOneOf()
	 * @see #getObjectOneOf()
	 * @generated
	 */
	EReference getObjectOneOf_OneOf();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectPropertyRestriction <em>Object Property Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Property Restriction</em>'.
	 * @see com.emf4sw.owl.ObjectPropertyRestriction
	 * @generated
	 */
	EClass getObjectPropertyRestriction();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.ObjectPropertyRestriction#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see com.emf4sw.owl.ObjectPropertyRestriction#getProperty()
	 * @see #getObjectPropertyRestriction()
	 * @generated
	 */
	EReference getObjectPropertyRestriction_Property();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectSomeValuesFrom <em>Object Some Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Some Values From</em>'.
	 * @see com.emf4sw.owl.ObjectSomeValuesFrom
	 * @generated
	 */
	EClass getObjectSomeValuesFrom();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.ObjectSomeValuesFrom#getSomeValuesFrom <em>Some Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Some Values From</em>'.
	 * @see com.emf4sw.owl.ObjectSomeValuesFrom#getSomeValuesFrom()
	 * @see #getObjectSomeValuesFrom()
	 * @generated
	 */
	EReference getObjectSomeValuesFrom_SomeValuesFrom();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectAllValuesFrom <em>Object All Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object All Values From</em>'.
	 * @see com.emf4sw.owl.ObjectAllValuesFrom
	 * @generated
	 */
	EClass getObjectAllValuesFrom();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.ObjectAllValuesFrom#getAllValuesFrom <em>All Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>All Values From</em>'.
	 * @see com.emf4sw.owl.ObjectAllValuesFrom#getAllValuesFrom()
	 * @see #getObjectAllValuesFrom()
	 * @generated
	 */
	EReference getObjectAllValuesFrom_AllValuesFrom();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectHasValue <em>Object Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Has Value</em>'.
	 * @see com.emf4sw.owl.ObjectHasValue
	 * @generated
	 */
	EClass getObjectHasValue();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.ObjectHasValue#getHasValue <em>Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Value</em>'.
	 * @see com.emf4sw.owl.ObjectHasValue#getHasValue()
	 * @see #getObjectHasValue()
	 * @generated
	 */
	EReference getObjectHasValue_HasValue();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectHasSelf <em>Object Has Self</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Has Self</em>'.
	 * @see com.emf4sw.owl.ObjectHasSelf
	 * @generated
	 */
	EClass getObjectHasSelf();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectExactCardinality <em>Object Exact Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Exact Cardinality</em>'.
	 * @see com.emf4sw.owl.ObjectExactCardinality
	 * @generated
	 */
	EClass getObjectExactCardinality();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.owl.ObjectExactCardinality#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see com.emf4sw.owl.ObjectExactCardinality#getCardinality()
	 * @see #getObjectExactCardinality()
	 * @generated
	 */
	EAttribute getObjectExactCardinality_Cardinality();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.ObjectExactCardinality#getOnClass <em>On Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On Class</em>'.
	 * @see com.emf4sw.owl.ObjectExactCardinality#getOnClass()
	 * @see #getObjectExactCardinality()
	 * @generated
	 */
	EReference getObjectExactCardinality_OnClass();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectMaxCardinality <em>Object Max Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Max Cardinality</em>'.
	 * @see com.emf4sw.owl.ObjectMaxCardinality
	 * @generated
	 */
	EClass getObjectMaxCardinality();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.owl.ObjectMaxCardinality#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see com.emf4sw.owl.ObjectMaxCardinality#getCardinality()
	 * @see #getObjectMaxCardinality()
	 * @generated
	 */
	EAttribute getObjectMaxCardinality_Cardinality();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.ObjectMaxCardinality#getOnClass <em>On Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On Class</em>'.
	 * @see com.emf4sw.owl.ObjectMaxCardinality#getOnClass()
	 * @see #getObjectMaxCardinality()
	 * @generated
	 */
	EReference getObjectMaxCardinality_OnClass();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectMinCardinality <em>Object Min Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Min Cardinality</em>'.
	 * @see com.emf4sw.owl.ObjectMinCardinality
	 * @generated
	 */
	EClass getObjectMinCardinality();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.owl.ObjectMinCardinality#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see com.emf4sw.owl.ObjectMinCardinality#getCardinality()
	 * @see #getObjectMinCardinality()
	 * @generated
	 */
	EAttribute getObjectMinCardinality_Cardinality();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.ObjectMinCardinality#getOnClass <em>On Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On Class</em>'.
	 * @see com.emf4sw.owl.ObjectMinCardinality#getOnClass()
	 * @see #getObjectMinCardinality()
	 * @generated
	 */
	EReference getObjectMinCardinality_OnClass();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataPropertyRestriction <em>Data Property Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Property Restriction</em>'.
	 * @see com.emf4sw.owl.DataPropertyRestriction
	 * @generated
	 */
	EClass getDataPropertyRestriction();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataSomeValuesFrom <em>Data Some Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Some Values From</em>'.
	 * @see com.emf4sw.owl.DataSomeValuesFrom
	 * @generated
	 */
	EClass getDataSomeValuesFrom();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.DataSomeValuesFrom#getSomeValuesFrom <em>Some Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Some Values From</em>'.
	 * @see com.emf4sw.owl.DataSomeValuesFrom#getSomeValuesFrom()
	 * @see #getDataSomeValuesFrom()
	 * @generated
	 */
	EReference getDataSomeValuesFrom_SomeValuesFrom();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.DataSomeValuesFrom#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see com.emf4sw.owl.DataSomeValuesFrom#getProperties()
	 * @see #getDataSomeValuesFrom()
	 * @generated
	 */
	EReference getDataSomeValuesFrom_Properties();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataAllValuesFrom <em>Data All Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data All Values From</em>'.
	 * @see com.emf4sw.owl.DataAllValuesFrom
	 * @generated
	 */
	EClass getDataAllValuesFrom();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.DataAllValuesFrom#getAllValuesFrom <em>All Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>All Values From</em>'.
	 * @see com.emf4sw.owl.DataAllValuesFrom#getAllValuesFrom()
	 * @see #getDataAllValuesFrom()
	 * @generated
	 */
	EReference getDataAllValuesFrom_AllValuesFrom();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.DataAllValuesFrom#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see com.emf4sw.owl.DataAllValuesFrom#getProperties()
	 * @see #getDataAllValuesFrom()
	 * @generated
	 */
	EReference getDataAllValuesFrom_Properties();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataHasValue <em>Data Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Has Value</em>'.
	 * @see com.emf4sw.owl.DataHasValue
	 * @generated
	 */
	EClass getDataHasValue();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.DataHasValue#getHasValue <em>Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Value</em>'.
	 * @see com.emf4sw.owl.DataHasValue#getHasValue()
	 * @see #getDataHasValue()
	 * @generated
	 */
	EReference getDataHasValue_HasValue();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.DataHasValue#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see com.emf4sw.owl.DataHasValue#getProperty()
	 * @see #getDataHasValue()
	 * @generated
	 */
	EReference getDataHasValue_Property();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataExactCardinality <em>Data Exact Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Exact Cardinality</em>'.
	 * @see com.emf4sw.owl.DataExactCardinality
	 * @generated
	 */
	EClass getDataExactCardinality();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.owl.DataExactCardinality#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see com.emf4sw.owl.DataExactCardinality#getCardinality()
	 * @see #getDataExactCardinality()
	 * @generated
	 */
	EAttribute getDataExactCardinality_Cardinality();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.DataExactCardinality#getDataRange <em>Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Range</em>'.
	 * @see com.emf4sw.owl.DataExactCardinality#getDataRange()
	 * @see #getDataExactCardinality()
	 * @generated
	 */
	EReference getDataExactCardinality_DataRange();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.DataExactCardinality#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see com.emf4sw.owl.DataExactCardinality#getProperty()
	 * @see #getDataExactCardinality()
	 * @generated
	 */
	EReference getDataExactCardinality_Property();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataMaxCardinality <em>Data Max Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Max Cardinality</em>'.
	 * @see com.emf4sw.owl.DataMaxCardinality
	 * @generated
	 */
	EClass getDataMaxCardinality();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.owl.DataMaxCardinality#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see com.emf4sw.owl.DataMaxCardinality#getCardinality()
	 * @see #getDataMaxCardinality()
	 * @generated
	 */
	EAttribute getDataMaxCardinality_Cardinality();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.DataMaxCardinality#getDataRange <em>Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Range</em>'.
	 * @see com.emf4sw.owl.DataMaxCardinality#getDataRange()
	 * @see #getDataMaxCardinality()
	 * @generated
	 */
	EReference getDataMaxCardinality_DataRange();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.DataMaxCardinality#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see com.emf4sw.owl.DataMaxCardinality#getProperty()
	 * @see #getDataMaxCardinality()
	 * @generated
	 */
	EReference getDataMaxCardinality_Property();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataMinCardinality <em>Data Min Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Min Cardinality</em>'.
	 * @see com.emf4sw.owl.DataMinCardinality
	 * @generated
	 */
	EClass getDataMinCardinality();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.owl.DataMinCardinality#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see com.emf4sw.owl.DataMinCardinality#getCardinality()
	 * @see #getDataMinCardinality()
	 * @generated
	 */
	EAttribute getDataMinCardinality_Cardinality();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.DataMinCardinality#getDataRange <em>Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Range</em>'.
	 * @see com.emf4sw.owl.DataMinCardinality#getDataRange()
	 * @see #getDataMinCardinality()
	 * @generated
	 */
	EReference getDataMinCardinality_DataRange();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.DataMinCardinality#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see com.emf4sw.owl.DataMinCardinality#getProperty()
	 * @see #getDataMinCardinality()
	 * @generated
	 */
	EReference getDataMinCardinality_Property();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.OWLProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see com.emf4sw.owl.OWLProperty
	 * @generated
	 */
	EClass getOWLProperty();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ClassProperty <em>Class Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Property</em>'.
	 * @see com.emf4sw.owl.ClassProperty
	 * @generated
	 */
	EClass getClassProperty();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.owl.ClassProperty#getIsFunctional <em>Is Functional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Functional</em>'.
	 * @see com.emf4sw.owl.ClassProperty#getIsFunctional()
	 * @see #getClassProperty()
	 * @generated
	 */
	EAttribute getClassProperty_IsFunctional();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.ClassProperty#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain</em>'.
	 * @see com.emf4sw.owl.ClassProperty#getDomain()
	 * @see #getClassProperty()
	 * @generated
	 */
	EReference getClassProperty_Domain();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataProperty <em>Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Property</em>'.
	 * @see com.emf4sw.owl.DataProperty
	 * @generated
	 */
	EClass getDataProperty();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.DataProperty#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Range</em>'.
	 * @see com.emf4sw.owl.DataProperty#getRange()
	 * @see #getDataProperty()
	 * @generated
	 */
	EReference getDataProperty_Range();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.DataProperty#getEquivalentProperties <em>Equivalent Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equivalent Properties</em>'.
	 * @see com.emf4sw.owl.DataProperty#getEquivalentProperties()
	 * @see #getDataProperty()
	 * @generated
	 */
	EReference getDataProperty_EquivalentProperties();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.DataProperty#getSubPropertyOf <em>Sub Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Property Of</em>'.
	 * @see com.emf4sw.owl.DataProperty#getSubPropertyOf()
	 * @see #getDataProperty()
	 * @generated
	 */
	EReference getDataProperty_SubPropertyOf();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.DataProperty#getDisjointProperties <em>Disjoint Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Disjoint Properties</em>'.
	 * @see com.emf4sw.owl.DataProperty#getDisjointProperties()
	 * @see #getDataProperty()
	 * @generated
	 */
	EReference getDataProperty_DisjointProperties();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectProperty <em>Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Property</em>'.
	 * @see com.emf4sw.owl.ObjectProperty
	 * @generated
	 */
	EClass getObjectProperty();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.owl.ObjectProperty#getIsInverseFunctional <em>Is Inverse Functional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Inverse Functional</em>'.
	 * @see com.emf4sw.owl.ObjectProperty#getIsInverseFunctional()
	 * @see #getObjectProperty()
	 * @generated
	 */
	EAttribute getObjectProperty_IsInverseFunctional();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.owl.ObjectProperty#getIsSymmetric <em>Is Symmetric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Symmetric</em>'.
	 * @see com.emf4sw.owl.ObjectProperty#getIsSymmetric()
	 * @see #getObjectProperty()
	 * @generated
	 */
	EAttribute getObjectProperty_IsSymmetric();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.owl.ObjectProperty#getIsAsymmetric <em>Is Asymmetric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Asymmetric</em>'.
	 * @see com.emf4sw.owl.ObjectProperty#getIsAsymmetric()
	 * @see #getObjectProperty()
	 * @generated
	 */
	EAttribute getObjectProperty_IsAsymmetric();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.owl.ObjectProperty#getIsTransitive <em>Is Transitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Transitive</em>'.
	 * @see com.emf4sw.owl.ObjectProperty#getIsTransitive()
	 * @see #getObjectProperty()
	 * @generated
	 */
	EAttribute getObjectProperty_IsTransitive();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.owl.ObjectProperty#getIsReflexive <em>Is Reflexive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Reflexive</em>'.
	 * @see com.emf4sw.owl.ObjectProperty#getIsReflexive()
	 * @see #getObjectProperty()
	 * @generated
	 */
	EAttribute getObjectProperty_IsReflexive();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.owl.ObjectProperty#getIsIrreflexive <em>Is Irreflexive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Irreflexive</em>'.
	 * @see com.emf4sw.owl.ObjectProperty#getIsIrreflexive()
	 * @see #getObjectProperty()
	 * @generated
	 */
	EAttribute getObjectProperty_IsIrreflexive();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.ObjectProperty#getInverseOf <em>Inverse Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inverse Of</em>'.
	 * @see com.emf4sw.owl.ObjectProperty#getInverseOf()
	 * @see #getObjectProperty()
	 * @generated
	 */
	EReference getObjectProperty_InverseOf();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.ObjectProperty#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Range</em>'.
	 * @see com.emf4sw.owl.ObjectProperty#getRange()
	 * @see #getObjectProperty()
	 * @generated
	 */
	EReference getObjectProperty_Range();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.ObjectProperty#getEquivalentProperties <em>Equivalent Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equivalent Properties</em>'.
	 * @see com.emf4sw.owl.ObjectProperty#getEquivalentProperties()
	 * @see #getObjectProperty()
	 * @generated
	 */
	EReference getObjectProperty_EquivalentProperties();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.ObjectProperty#getSubPropertyOf <em>Sub Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Property Of</em>'.
	 * @see com.emf4sw.owl.ObjectProperty#getSubPropertyOf()
	 * @see #getObjectProperty()
	 * @generated
	 */
	EReference getObjectProperty_SubPropertyOf();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.ObjectProperty#getDisjointProperties <em>Disjoint Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Disjoint Properties</em>'.
	 * @see com.emf4sw.owl.ObjectProperty#getDisjointProperties()
	 * @see #getObjectProperty()
	 * @generated
	 */
	EReference getObjectProperty_DisjointProperties();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectPropertyChain <em>Object Property Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Property Chain</em>'.
	 * @see com.emf4sw.owl.ObjectPropertyChain
	 * @generated
	 */
	EClass getObjectPropertyChain();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.ObjectPropertyChain#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see com.emf4sw.owl.ObjectPropertyChain#getProperties()
	 * @see #getObjectPropertyChain()
	 * @generated
	 */
	EReference getObjectPropertyChain_Properties();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.AnnotationProperty <em>Annotation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Property</em>'.
	 * @see com.emf4sw.owl.AnnotationProperty
	 * @generated
	 */
	EClass getAnnotationProperty();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataRange <em>Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Range</em>'.
	 * @see com.emf4sw.owl.DataRange
	 * @generated
	 */
	EClass getDataRange();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.OWLDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype</em>'.
	 * @see com.emf4sw.owl.OWLDatatype
	 * @generated
	 */
	EClass getOWLDatatype();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataComplementOf <em>Data Complement Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Complement Of</em>'.
	 * @see com.emf4sw.owl.DataComplementOf
	 * @generated
	 */
	EClass getDataComplementOf();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.DataComplementOf#getDataRange <em>Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Range</em>'.
	 * @see com.emf4sw.owl.DataComplementOf#getDataRange()
	 * @see #getDataComplementOf()
	 * @generated
	 */
	EReference getDataComplementOf_DataRange();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataUnionOf <em>Data Union Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Union Of</em>'.
	 * @see com.emf4sw.owl.DataUnionOf
	 * @generated
	 */
	EClass getDataUnionOf();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.DataUnionOf#getDataRanges <em>Data Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Ranges</em>'.
	 * @see com.emf4sw.owl.DataUnionOf#getDataRanges()
	 * @see #getDataUnionOf()
	 * @generated
	 */
	EReference getDataUnionOf_DataRanges();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataIntersectionOf <em>Data Intersection Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Intersection Of</em>'.
	 * @see com.emf4sw.owl.DataIntersectionOf
	 * @generated
	 */
	EClass getDataIntersectionOf();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.DataIntersectionOf#getDataRanges <em>Data Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Ranges</em>'.
	 * @see com.emf4sw.owl.DataIntersectionOf#getDataRanges()
	 * @see #getDataIntersectionOf()
	 * @generated
	 */
	EReference getDataIntersectionOf_DataRanges();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataOneOf <em>Data One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data One Of</em>'.
	 * @see com.emf4sw.owl.DataOneOf
	 * @generated
	 */
	EClass getDataOneOf();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.DataOneOf#getOneOf <em>One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>One Of</em>'.
	 * @see com.emf4sw.owl.DataOneOf#getOneOf()
	 * @see #getDataOneOf()
	 * @generated
	 */
	EReference getDataOneOf_OneOf();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DatatypeRestriction <em>Datatype Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Restriction</em>'.
	 * @see com.emf4sw.owl.DatatypeRestriction
	 * @generated
	 */
	EClass getDatatypeRestriction();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.DatatypeRestriction#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see com.emf4sw.owl.DatatypeRestriction#getDatatype()
	 * @see #getDatatypeRestriction()
	 * @generated
	 */
	EReference getDatatypeRestriction_Datatype();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.DatatypeRestriction#getRestrictions <em>Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Restrictions</em>'.
	 * @see com.emf4sw.owl.DatatypeRestriction#getRestrictions()
	 * @see #getDatatypeRestriction()
	 * @generated
	 */
	EReference getDatatypeRestriction_Restrictions();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DatatypeDefinition <em>Datatype Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition</em>'.
	 * @see com.emf4sw.owl.DatatypeDefinition
	 * @generated
	 */
	EClass getDatatypeDefinition();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.DatatypeDefinition#getDataRange <em>Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Range</em>'.
	 * @see com.emf4sw.owl.DatatypeDefinition#getDataRange()
	 * @see #getDatatypeDefinition()
	 * @generated
	 */
	EReference getDatatypeDefinition_DataRange();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.DatatypeDefinition#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see com.emf4sw.owl.DatatypeDefinition#getDatatype()
	 * @see #getDatatypeDefinition()
	 * @generated
	 */
	EReference getDatatypeDefinition_Datatype();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.FacetRestriction <em>Facet Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facet Restriction</em>'.
	 * @see com.emf4sw.owl.FacetRestriction
	 * @generated
	 */
	EClass getFacetRestriction();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.FacetRestriction#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see com.emf4sw.owl.FacetRestriction#getDatatype()
	 * @see #getFacetRestriction()
	 * @generated
	 */
	EReference getFacetRestriction_Datatype();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.FacetRestriction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see com.emf4sw.owl.FacetRestriction#getValue()
	 * @see #getFacetRestriction()
	 * @generated
	 */
	EReference getFacetRestriction_Value();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see com.emf4sw.owl.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.Annotation#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see com.emf4sw.owl.Annotation#getProperty()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Property();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.Annotation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see com.emf4sw.owl.Annotation#getValue()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Value();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual</em>'.
	 * @see com.emf4sw.owl.Individual
	 * @generated
	 */
	EClass getIndividual();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.Individual#getSameAs <em>Same As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Same As</em>'.
	 * @see com.emf4sw.owl.Individual#getSameAs()
	 * @see #getIndividual()
	 * @generated
	 */
	EReference getIndividual_SameAs();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.Individual#getDifferentFrom <em>Different From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Different From</em>'.
	 * @see com.emf4sw.owl.Individual#getDifferentFrom()
	 * @see #getIndividual()
	 * @generated
	 */
	EReference getIndividual_DifferentFrom();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OWLFactory getOWLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.OntologyImpl <em>Ontology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.OntologyImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getOntology()
		 * @generated
		 */
		EClass ONTOLOGY = eINSTANCE.getOntology();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__CLASSES = eINSTANCE.getOntology_Classes();

		/**
		 * The meta object literal for the '<em><b>Data Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__DATA_PROPERTIES = eINSTANCE.getOntology_DataProperties();

		/**
		 * The meta object literal for the '<em><b>Object Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__OBJECT_PROPERTIES = eINSTANCE.getOntology_ObjectProperties();

		/**
		 * The meta object literal for the '<em><b>Data Ranges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__DATA_RANGES = eINSTANCE.getOntology_DataRanges();

		/**
		 * The meta object literal for the '<em><b>Class Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__CLASS_EXPRESSIONS = eINSTANCE.getOntology_ClassExpressions();

		/**
		 * The meta object literal for the '<em><b>Owl Datatypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__OWL_DATATYPES = eINSTANCE.getOntology_OwlDatatypes();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.AnnotatedElementImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAnnotatedElement()
		 * @generated
		 */
		EClass ANNOTATED_ELEMENT = eINSTANCE.getAnnotatedElement();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATED_ELEMENT__ANNOTATIONS = eINSTANCE.getAnnotatedElement_Annotations();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ClassExpressionImpl <em>Class Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ClassExpressionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getClassExpression()
		 * @generated
		 */
		EClass CLASS_EXPRESSION = eINSTANCE.getClassExpression();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_EXPRESSION__KEYS = eINSTANCE.getClassExpression_Keys();

		/**
		 * The meta object literal for the '<em><b>Sub Class Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_EXPRESSION__SUB_CLASS_OF = eINSTANCE.getClassExpression_SubClassOf();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_EXPRESSION__SUPER_CLASS = eINSTANCE.getClassExpression_SuperClass();

		/**
		 * The meta object literal for the '<em><b>Disjoint Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_EXPRESSION__DISJOINT_CLASSES = eINSTANCE.getClassExpression_DisjointClasses();

		/**
		 * The meta object literal for the '<em><b>Equivalent Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_EXPRESSION__EQUIVALENT_CLASSES = eINSTANCE.getClassExpression_EquivalentClasses();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.OWLClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.OWLClassImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getOWLClass()
		 * @generated
		 */
		EClass OWL_CLASS = eINSTANCE.getOWLClass();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectUnionOfImpl <em>Object Union Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectUnionOfImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectUnionOf()
		 * @generated
		 */
		EClass OBJECT_UNION_OF = eINSTANCE.getObjectUnionOf();

		/**
		 * The meta object literal for the '<em><b>Union Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_UNION_OF__UNION_OF = eINSTANCE.getObjectUnionOf_UnionOf();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectIntersectionOfImpl <em>Object Intersection Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectIntersectionOfImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectIntersectionOf()
		 * @generated
		 */
		EClass OBJECT_INTERSECTION_OF = eINSTANCE.getObjectIntersectionOf();

		/**
		 * The meta object literal for the '<em><b>Intersection Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_INTERSECTION_OF__INTERSECTION_OF = eINSTANCE.getObjectIntersectionOf_IntersectionOf();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectComplementOfImpl <em>Object Complement Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectComplementOfImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectComplementOf()
		 * @generated
		 */
		EClass OBJECT_COMPLEMENT_OF = eINSTANCE.getObjectComplementOf();

		/**
		 * The meta object literal for the '<em><b>Complement Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_COMPLEMENT_OF__COMPLEMENT_OF = eINSTANCE.getObjectComplementOf_ComplementOf();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectOneOfImpl <em>Object One Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectOneOfImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectOneOf()
		 * @generated
		 */
		EClass OBJECT_ONE_OF = eINSTANCE.getObjectOneOf();

		/**
		 * The meta object literal for the '<em><b>One Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_ONE_OF__ONE_OF = eINSTANCE.getObjectOneOf_OneOf();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectPropertyRestrictionImpl <em>Object Property Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectPropertyRestrictionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectPropertyRestriction()
		 * @generated
		 */
		EClass OBJECT_PROPERTY_RESTRICTION = eINSTANCE.getObjectPropertyRestriction();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_PROPERTY_RESTRICTION__PROPERTY = eINSTANCE.getObjectPropertyRestriction_Property();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectSomeValuesFromImpl <em>Object Some Values From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectSomeValuesFromImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectSomeValuesFrom()
		 * @generated
		 */
		EClass OBJECT_SOME_VALUES_FROM = eINSTANCE.getObjectSomeValuesFrom();

		/**
		 * The meta object literal for the '<em><b>Some Values From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_SOME_VALUES_FROM__SOME_VALUES_FROM = eINSTANCE.getObjectSomeValuesFrom_SomeValuesFrom();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectAllValuesFromImpl <em>Object All Values From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectAllValuesFromImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectAllValuesFrom()
		 * @generated
		 */
		EClass OBJECT_ALL_VALUES_FROM = eINSTANCE.getObjectAllValuesFrom();

		/**
		 * The meta object literal for the '<em><b>All Values From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_ALL_VALUES_FROM__ALL_VALUES_FROM = eINSTANCE.getObjectAllValuesFrom_AllValuesFrom();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectHasValueImpl <em>Object Has Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectHasValueImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectHasValue()
		 * @generated
		 */
		EClass OBJECT_HAS_VALUE = eINSTANCE.getObjectHasValue();

		/**
		 * The meta object literal for the '<em><b>Has Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_HAS_VALUE__HAS_VALUE = eINSTANCE.getObjectHasValue_HasValue();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectHasSelfImpl <em>Object Has Self</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectHasSelfImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectHasSelf()
		 * @generated
		 */
		EClass OBJECT_HAS_SELF = eINSTANCE.getObjectHasSelf();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectExactCardinalityImpl <em>Object Exact Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectExactCardinalityImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectExactCardinality()
		 * @generated
		 */
		EClass OBJECT_EXACT_CARDINALITY = eINSTANCE.getObjectExactCardinality();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_EXACT_CARDINALITY__CARDINALITY = eINSTANCE.getObjectExactCardinality_Cardinality();

		/**
		 * The meta object literal for the '<em><b>On Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_EXACT_CARDINALITY__ON_CLASS = eINSTANCE.getObjectExactCardinality_OnClass();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectMaxCardinalityImpl <em>Object Max Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectMaxCardinalityImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectMaxCardinality()
		 * @generated
		 */
		EClass OBJECT_MAX_CARDINALITY = eINSTANCE.getObjectMaxCardinality();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_MAX_CARDINALITY__CARDINALITY = eINSTANCE.getObjectMaxCardinality_Cardinality();

		/**
		 * The meta object literal for the '<em><b>On Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_MAX_CARDINALITY__ON_CLASS = eINSTANCE.getObjectMaxCardinality_OnClass();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectMinCardinalityImpl <em>Object Min Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectMinCardinalityImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectMinCardinality()
		 * @generated
		 */
		EClass OBJECT_MIN_CARDINALITY = eINSTANCE.getObjectMinCardinality();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_MIN_CARDINALITY__CARDINALITY = eINSTANCE.getObjectMinCardinality_Cardinality();

		/**
		 * The meta object literal for the '<em><b>On Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_MIN_CARDINALITY__ON_CLASS = eINSTANCE.getObjectMinCardinality_OnClass();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataPropertyRestrictionImpl <em>Data Property Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataPropertyRestrictionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataPropertyRestriction()
		 * @generated
		 */
		EClass DATA_PROPERTY_RESTRICTION = eINSTANCE.getDataPropertyRestriction();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataSomeValuesFromImpl <em>Data Some Values From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataSomeValuesFromImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataSomeValuesFrom()
		 * @generated
		 */
		EClass DATA_SOME_VALUES_FROM = eINSTANCE.getDataSomeValuesFrom();

		/**
		 * The meta object literal for the '<em><b>Some Values From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOME_VALUES_FROM__SOME_VALUES_FROM = eINSTANCE.getDataSomeValuesFrom_SomeValuesFrom();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOME_VALUES_FROM__PROPERTIES = eINSTANCE.getDataSomeValuesFrom_Properties();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataAllValuesFromImpl <em>Data All Values From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataAllValuesFromImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataAllValuesFrom()
		 * @generated
		 */
		EClass DATA_ALL_VALUES_FROM = eINSTANCE.getDataAllValuesFrom();

		/**
		 * The meta object literal for the '<em><b>All Values From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ALL_VALUES_FROM__ALL_VALUES_FROM = eINSTANCE.getDataAllValuesFrom_AllValuesFrom();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ALL_VALUES_FROM__PROPERTIES = eINSTANCE.getDataAllValuesFrom_Properties();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataHasValueImpl <em>Data Has Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataHasValueImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataHasValue()
		 * @generated
		 */
		EClass DATA_HAS_VALUE = eINSTANCE.getDataHasValue();

		/**
		 * The meta object literal for the '<em><b>Has Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_HAS_VALUE__HAS_VALUE = eINSTANCE.getDataHasValue_HasValue();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_HAS_VALUE__PROPERTY = eINSTANCE.getDataHasValue_Property();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataExactCardinalityImpl <em>Data Exact Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataExactCardinalityImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataExactCardinality()
		 * @generated
		 */
		EClass DATA_EXACT_CARDINALITY = eINSTANCE.getDataExactCardinality();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_EXACT_CARDINALITY__CARDINALITY = eINSTANCE.getDataExactCardinality_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Data Range</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXACT_CARDINALITY__DATA_RANGE = eINSTANCE.getDataExactCardinality_DataRange();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXACT_CARDINALITY__PROPERTY = eINSTANCE.getDataExactCardinality_Property();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataMaxCardinalityImpl <em>Data Max Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataMaxCardinalityImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataMaxCardinality()
		 * @generated
		 */
		EClass DATA_MAX_CARDINALITY = eINSTANCE.getDataMaxCardinality();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MAX_CARDINALITY__CARDINALITY = eINSTANCE.getDataMaxCardinality_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Data Range</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MAX_CARDINALITY__DATA_RANGE = eINSTANCE.getDataMaxCardinality_DataRange();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MAX_CARDINALITY__PROPERTY = eINSTANCE.getDataMaxCardinality_Property();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataMinCardinalityImpl <em>Data Min Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataMinCardinalityImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataMinCardinality()
		 * @generated
		 */
		EClass DATA_MIN_CARDINALITY = eINSTANCE.getDataMinCardinality();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MIN_CARDINALITY__CARDINALITY = eINSTANCE.getDataMinCardinality_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Data Range</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MIN_CARDINALITY__DATA_RANGE = eINSTANCE.getDataMinCardinality_DataRange();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MIN_CARDINALITY__PROPERTY = eINSTANCE.getDataMinCardinality_Property();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.OWLPropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.OWLPropertyImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getOWLProperty()
		 * @generated
		 */
		EClass OWL_PROPERTY = eINSTANCE.getOWLProperty();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ClassPropertyImpl <em>Class Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ClassPropertyImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getClassProperty()
		 * @generated
		 */
		EClass CLASS_PROPERTY = eINSTANCE.getClassProperty();

		/**
		 * The meta object literal for the '<em><b>Is Functional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_PROPERTY__IS_FUNCTIONAL = eINSTANCE.getClassProperty_IsFunctional();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_PROPERTY__DOMAIN = eINSTANCE.getClassProperty_Domain();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataPropertyImpl <em>Data Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataPropertyImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataProperty()
		 * @generated
		 */
		EClass DATA_PROPERTY = eINSTANCE.getDataProperty();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY__RANGE = eINSTANCE.getDataProperty_Range();

		/**
		 * The meta object literal for the '<em><b>Equivalent Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY__EQUIVALENT_PROPERTIES = eINSTANCE.getDataProperty_EquivalentProperties();

		/**
		 * The meta object literal for the '<em><b>Sub Property Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY__SUB_PROPERTY_OF = eINSTANCE.getDataProperty_SubPropertyOf();

		/**
		 * The meta object literal for the '<em><b>Disjoint Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY__DISJOINT_PROPERTIES = eINSTANCE.getDataProperty_DisjointProperties();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectPropertyImpl <em>Object Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectPropertyImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectProperty()
		 * @generated
		 */
		EClass OBJECT_PROPERTY = eINSTANCE.getObjectProperty();

		/**
		 * The meta object literal for the '<em><b>Is Inverse Functional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_PROPERTY__IS_INVERSE_FUNCTIONAL = eINSTANCE.getObjectProperty_IsInverseFunctional();

		/**
		 * The meta object literal for the '<em><b>Is Symmetric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_PROPERTY__IS_SYMMETRIC = eINSTANCE.getObjectProperty_IsSymmetric();

		/**
		 * The meta object literal for the '<em><b>Is Asymmetric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_PROPERTY__IS_ASYMMETRIC = eINSTANCE.getObjectProperty_IsAsymmetric();

		/**
		 * The meta object literal for the '<em><b>Is Transitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_PROPERTY__IS_TRANSITIVE = eINSTANCE.getObjectProperty_IsTransitive();

		/**
		 * The meta object literal for the '<em><b>Is Reflexive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_PROPERTY__IS_REFLEXIVE = eINSTANCE.getObjectProperty_IsReflexive();

		/**
		 * The meta object literal for the '<em><b>Is Irreflexive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_PROPERTY__IS_IRREFLEXIVE = eINSTANCE.getObjectProperty_IsIrreflexive();

		/**
		 * The meta object literal for the '<em><b>Inverse Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_PROPERTY__INVERSE_OF = eINSTANCE.getObjectProperty_InverseOf();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_PROPERTY__RANGE = eINSTANCE.getObjectProperty_Range();

		/**
		 * The meta object literal for the '<em><b>Equivalent Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_PROPERTY__EQUIVALENT_PROPERTIES = eINSTANCE.getObjectProperty_EquivalentProperties();

		/**
		 * The meta object literal for the '<em><b>Sub Property Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_PROPERTY__SUB_PROPERTY_OF = eINSTANCE.getObjectProperty_SubPropertyOf();

		/**
		 * The meta object literal for the '<em><b>Disjoint Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_PROPERTY__DISJOINT_PROPERTIES = eINSTANCE.getObjectProperty_DisjointProperties();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectPropertyChainImpl <em>Object Property Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectPropertyChainImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectPropertyChain()
		 * @generated
		 */
		EClass OBJECT_PROPERTY_CHAIN = eINSTANCE.getObjectPropertyChain();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_PROPERTY_CHAIN__PROPERTIES = eINSTANCE.getObjectPropertyChain_Properties();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.AnnotationPropertyImpl <em>Annotation Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.AnnotationPropertyImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAnnotationProperty()
		 * @generated
		 */
		EClass ANNOTATION_PROPERTY = eINSTANCE.getAnnotationProperty();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataRangeImpl <em>Data Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataRangeImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataRange()
		 * @generated
		 */
		EClass DATA_RANGE = eINSTANCE.getDataRange();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.OWLDatatypeImpl <em>Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.OWLDatatypeImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getOWLDatatype()
		 * @generated
		 */
		EClass OWL_DATATYPE = eINSTANCE.getOWLDatatype();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataComplementOfImpl <em>Data Complement Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataComplementOfImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataComplementOf()
		 * @generated
		 */
		EClass DATA_COMPLEMENT_OF = eINSTANCE.getDataComplementOf();

		/**
		 * The meta object literal for the '<em><b>Data Range</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_COMPLEMENT_OF__DATA_RANGE = eINSTANCE.getDataComplementOf_DataRange();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataUnionOfImpl <em>Data Union Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataUnionOfImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataUnionOf()
		 * @generated
		 */
		EClass DATA_UNION_OF = eINSTANCE.getDataUnionOf();

		/**
		 * The meta object literal for the '<em><b>Data Ranges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_UNION_OF__DATA_RANGES = eINSTANCE.getDataUnionOf_DataRanges();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataIntersectionOfImpl <em>Data Intersection Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataIntersectionOfImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataIntersectionOf()
		 * @generated
		 */
		EClass DATA_INTERSECTION_OF = eINSTANCE.getDataIntersectionOf();

		/**
		 * The meta object literal for the '<em><b>Data Ranges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_INTERSECTION_OF__DATA_RANGES = eINSTANCE.getDataIntersectionOf_DataRanges();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataOneOfImpl <em>Data One Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataOneOfImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataOneOf()
		 * @generated
		 */
		EClass DATA_ONE_OF = eINSTANCE.getDataOneOf();

		/**
		 * The meta object literal for the '<em><b>One Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ONE_OF__ONE_OF = eINSTANCE.getDataOneOf_OneOf();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DatatypeRestrictionImpl <em>Datatype Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DatatypeRestrictionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDatatypeRestriction()
		 * @generated
		 */
		EClass DATATYPE_RESTRICTION = eINSTANCE.getDatatypeRestriction();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPE_RESTRICTION__DATATYPE = eINSTANCE.getDatatypeRestriction_Datatype();

		/**
		 * The meta object literal for the '<em><b>Restrictions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPE_RESTRICTION__RESTRICTIONS = eINSTANCE.getDatatypeRestriction_Restrictions();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DatatypeDefinitionImpl <em>Datatype Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DatatypeDefinitionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDatatypeDefinition()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION = eINSTANCE.getDatatypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Data Range</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPE_DEFINITION__DATA_RANGE = eINSTANCE.getDatatypeDefinition_DataRange();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPE_DEFINITION__DATATYPE = eINSTANCE.getDatatypeDefinition_Datatype();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.FacetRestrictionImpl <em>Facet Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.FacetRestrictionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getFacetRestriction()
		 * @generated
		 */
		EClass FACET_RESTRICTION = eINSTANCE.getFacetRestriction();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET_RESTRICTION__DATATYPE = eINSTANCE.getFacetRestriction_Datatype();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET_RESTRICTION__VALUE = eINSTANCE.getFacetRestriction_Value();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.AnnotationImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__PROPERTY = eINSTANCE.getAnnotation_Property();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__VALUE = eINSTANCE.getAnnotation_Value();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.IndividualImpl <em>Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.IndividualImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getIndividual()
		 * @generated
		 */
		EClass INDIVIDUAL = eINSTANCE.getIndividual();

		/**
		 * The meta object literal for the '<em><b>Same As</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL__SAME_AS = eINSTANCE.getIndividual_SameAs();

		/**
		 * The meta object literal for the '<em><b>Different From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL__DIFFERENT_FROM = eINSTANCE.getIndividual_DifferentFrom();

	}

} //OWLPackage
