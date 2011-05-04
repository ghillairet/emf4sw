/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.emf4sw.owl.AnnotatedElement;
import com.emf4sw.owl.Annotation;
import com.emf4sw.owl.AnnotationProperty;
import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.ClassProperty;
import com.emf4sw.owl.DataAllValuesFrom;
import com.emf4sw.owl.DataComplementOf;
import com.emf4sw.owl.DataExactCardinality;
import com.emf4sw.owl.DataHasValue;
import com.emf4sw.owl.DataIntersectionOf;
import com.emf4sw.owl.DataMaxCardinality;
import com.emf4sw.owl.DataMinCardinality;
import com.emf4sw.owl.DataOneOf;
import com.emf4sw.owl.DataProperty;
import com.emf4sw.owl.DataPropertyRestriction;
import com.emf4sw.owl.DataRange;
import com.emf4sw.owl.DataSomeValuesFrom;
import com.emf4sw.owl.DataUnionOf;
import com.emf4sw.owl.DatatypeDefinition;
import com.emf4sw.owl.DatatypeRestriction;
import com.emf4sw.owl.FacetRestriction;
import com.emf4sw.owl.Individual;
import com.emf4sw.owl.OWLClass;
import com.emf4sw.owl.OWLDatatype;
import com.emf4sw.owl.OWLFactory;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.OWLProperty;
import com.emf4sw.owl.ObjectAllValuesFrom;
import com.emf4sw.owl.ObjectComplementOf;
import com.emf4sw.owl.ObjectExactCardinality;
import com.emf4sw.owl.ObjectHasSelf;
import com.emf4sw.owl.ObjectHasValue;
import com.emf4sw.owl.ObjectIntersectionOf;
import com.emf4sw.owl.ObjectMaxCardinality;
import com.emf4sw.owl.ObjectMinCardinality;
import com.emf4sw.owl.ObjectOneOf;
import com.emf4sw.owl.ObjectProperty;
import com.emf4sw.owl.ObjectPropertyChain;
import com.emf4sw.owl.ObjectPropertyRestriction;
import com.emf4sw.owl.ObjectSomeValuesFrom;
import com.emf4sw.owl.ObjectUnionOf;
import com.emf4sw.owl.Ontology;
import com.emf4sw.rdf.RDFPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OWLPackageImpl extends EPackageImpl implements OWLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotatedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectUnionOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectIntersectionOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectComplementOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectOneOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectSomeValuesFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectAllValuesFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectHasValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectHasSelfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectExactCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectMaxCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectMinCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSomeValuesFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAllValuesFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataHasValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataExactCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataMaxCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataMinCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyChainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlDatatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataComplementOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataUnionOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataIntersectionOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataOneOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facetRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualEClass = null;

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
	 * @see com.emf4sw.owl.OWLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OWLPackageImpl() {
		super(eNS_URI, OWLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OWLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OWLPackage init() {
		if (isInited) return (OWLPackage)EPackage.Registry.INSTANCE.getEPackage(OWLPackage.eNS_URI);

		// Obtain or create and register package
		OWLPackageImpl theOWLPackage = (OWLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OWLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OWLPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RDFPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOWLPackage.createPackageContents();

		// Initialize created meta-data
		theOWLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOWLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OWLPackage.eNS_URI, theOWLPackage);
		return theOWLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOntology() {
		return ontologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_Classes() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_DataProperties() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_ObjectProperties() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_DataRanges() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_ClassExpressions() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_OwlDatatypes() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotatedElement() {
		return annotatedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotatedElement_Annotations() {
		return (EReference)annotatedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassExpression() {
		return classExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassExpression_Keys() {
		return (EReference)classExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassExpression_SubClassOf() {
		return (EReference)classExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassExpression_SuperClass() {
		return (EReference)classExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassExpression_DisjointClasses() {
		return (EReference)classExpressionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassExpression_EquivalentClasses() {
		return (EReference)classExpressionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOWLClass() {
		return owlClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectUnionOf() {
		return objectUnionOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectUnionOf_UnionOf() {
		return (EReference)objectUnionOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectIntersectionOf() {
		return objectIntersectionOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIntersectionOf_IntersectionOf() {
		return (EReference)objectIntersectionOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectComplementOf() {
		return objectComplementOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectComplementOf_ComplementOf() {
		return (EReference)objectComplementOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectOneOf() {
		return objectOneOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectOneOf_OneOf() {
		return (EReference)objectOneOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyRestriction() {
		return objectPropertyRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyRestriction_Property() {
		return (EReference)objectPropertyRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectSomeValuesFrom() {
		return objectSomeValuesFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_SomeValuesFrom() {
		return (EReference)objectSomeValuesFromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectAllValuesFrom() {
		return objectAllValuesFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_AllValuesFrom() {
		return (EReference)objectAllValuesFromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectHasValue() {
		return objectHasValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectHasValue_HasValue() {
		return (EReference)objectHasValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectHasSelf() {
		return objectHasSelfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectExactCardinality() {
		return objectExactCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectExactCardinality_Cardinality() {
		return (EAttribute)objectExactCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_OnClass() {
		return (EReference)objectExactCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectMaxCardinality() {
		return objectMaxCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectMaxCardinality_Cardinality() {
		return (EAttribute)objectMaxCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_OnClass() {
		return (EReference)objectMaxCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectMinCardinality() {
		return objectMinCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectMinCardinality_Cardinality() {
		return (EAttribute)objectMinCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_OnClass() {
		return (EReference)objectMinCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyRestriction() {
		return dataPropertyRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSomeValuesFrom() {
		return dataSomeValuesFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSomeValuesFrom_SomeValuesFrom() {
		return (EReference)dataSomeValuesFromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSomeValuesFrom_Properties() {
		return (EReference)dataSomeValuesFromEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAllValuesFrom() {
		return dataAllValuesFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAllValuesFrom_AllValuesFrom() {
		return (EReference)dataAllValuesFromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAllValuesFrom_Properties() {
		return (EReference)dataAllValuesFromEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataHasValue() {
		return dataHasValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataHasValue_HasValue() {
		return (EReference)dataHasValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataHasValue_Property() {
		return (EReference)dataHasValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataExactCardinality() {
		return dataExactCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataExactCardinality_Cardinality() {
		return (EAttribute)dataExactCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExactCardinality_DataRange() {
		return (EReference)dataExactCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExactCardinality_Property() {
		return (EReference)dataExactCardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataMaxCardinality() {
		return dataMaxCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataMaxCardinality_Cardinality() {
		return (EAttribute)dataMaxCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMaxCardinality_DataRange() {
		return (EReference)dataMaxCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMaxCardinality_Property() {
		return (EReference)dataMaxCardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataMinCardinality() {
		return dataMinCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataMinCardinality_Cardinality() {
		return (EAttribute)dataMinCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMinCardinality_DataRange() {
		return (EReference)dataMinCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMinCardinality_Property() {
		return (EReference)dataMinCardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOWLProperty() {
		return owlPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassProperty() {
		return classPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassProperty_IsFunctional() {
		return (EAttribute)classPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassProperty_Domain() {
		return (EReference)classPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataProperty() {
		return dataPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataProperty_Range() {
		return (EReference)dataPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataProperty_EquivalentProperties() {
		return (EReference)dataPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataProperty_SubPropertyOf() {
		return (EReference)dataPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataProperty_DisjointProperties() {
		return (EReference)dataPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectProperty() {
		return objectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectProperty_IsInverseFunctional() {
		return (EAttribute)objectPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectProperty_IsSymmetric() {
		return (EAttribute)objectPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectProperty_IsAsymmetric() {
		return (EAttribute)objectPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectProperty_IsTransitive() {
		return (EAttribute)objectPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectProperty_IsReflexive() {
		return (EAttribute)objectPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectProperty_IsIrreflexive() {
		return (EAttribute)objectPropertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectProperty_InverseOf() {
		return (EReference)objectPropertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectProperty_Range() {
		return (EReference)objectPropertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectProperty_EquivalentProperties() {
		return (EReference)objectPropertyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectProperty_SubPropertyOf() {
		return (EReference)objectPropertyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectProperty_DisjointProperties() {
		return (EReference)objectPropertyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyChain() {
		return objectPropertyChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyChain_Properties() {
		return (EReference)objectPropertyChainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationProperty() {
		return annotationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataRange() {
		return dataRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOWLDatatype() {
		return owlDatatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataComplementOf() {
		return dataComplementOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataComplementOf_DataRange() {
		return (EReference)dataComplementOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataUnionOf() {
		return dataUnionOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataUnionOf_DataRanges() {
		return (EReference)dataUnionOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataIntersectionOf() {
		return dataIntersectionOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataIntersectionOf_DataRanges() {
		return (EReference)dataIntersectionOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataOneOf() {
		return dataOneOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataOneOf_OneOf() {
		return (EReference)dataOneOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeRestriction() {
		return datatypeRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeRestriction_Datatype() {
		return (EReference)datatypeRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeRestriction_Restrictions() {
		return (EReference)datatypeRestrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeDefinition() {
		return datatypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeDefinition_DataRange() {
		return (EReference)datatypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeDefinition_Datatype() {
		return (EReference)datatypeDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacetRestriction() {
		return facetRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacetRestriction_Datatype() {
		return (EReference)facetRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacetRestriction_Value() {
		return (EReference)facetRestrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_Property() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_Value() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividual() {
		return individualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividual_SameAs() {
		return (EReference)individualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividual_DifferentFrom() {
		return (EReference)individualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLFactory getOWLFactory() {
		return (OWLFactory)getEFactoryInstance();
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
		ontologyEClass = createEClass(ONTOLOGY);
		createEReference(ontologyEClass, ONTOLOGY__CLASSES);
		createEReference(ontologyEClass, ONTOLOGY__DATA_PROPERTIES);
		createEReference(ontologyEClass, ONTOLOGY__OBJECT_PROPERTIES);
		createEReference(ontologyEClass, ONTOLOGY__DATA_RANGES);
		createEReference(ontologyEClass, ONTOLOGY__CLASS_EXPRESSIONS);
		createEReference(ontologyEClass, ONTOLOGY__OWL_DATATYPES);

		annotatedElementEClass = createEClass(ANNOTATED_ELEMENT);
		createEReference(annotatedElementEClass, ANNOTATED_ELEMENT__ANNOTATIONS);

		classExpressionEClass = createEClass(CLASS_EXPRESSION);
		createEReference(classExpressionEClass, CLASS_EXPRESSION__KEYS);
		createEReference(classExpressionEClass, CLASS_EXPRESSION__SUB_CLASS_OF);
		createEReference(classExpressionEClass, CLASS_EXPRESSION__SUPER_CLASS);
		createEReference(classExpressionEClass, CLASS_EXPRESSION__DISJOINT_CLASSES);
		createEReference(classExpressionEClass, CLASS_EXPRESSION__EQUIVALENT_CLASSES);

		owlClassEClass = createEClass(OWL_CLASS);

		objectUnionOfEClass = createEClass(OBJECT_UNION_OF);
		createEReference(objectUnionOfEClass, OBJECT_UNION_OF__UNION_OF);

		objectIntersectionOfEClass = createEClass(OBJECT_INTERSECTION_OF);
		createEReference(objectIntersectionOfEClass, OBJECT_INTERSECTION_OF__INTERSECTION_OF);

		objectComplementOfEClass = createEClass(OBJECT_COMPLEMENT_OF);
		createEReference(objectComplementOfEClass, OBJECT_COMPLEMENT_OF__COMPLEMENT_OF);

		objectOneOfEClass = createEClass(OBJECT_ONE_OF);
		createEReference(objectOneOfEClass, OBJECT_ONE_OF__ONE_OF);

		objectPropertyRestrictionEClass = createEClass(OBJECT_PROPERTY_RESTRICTION);
		createEReference(objectPropertyRestrictionEClass, OBJECT_PROPERTY_RESTRICTION__PROPERTY);

		objectSomeValuesFromEClass = createEClass(OBJECT_SOME_VALUES_FROM);
		createEReference(objectSomeValuesFromEClass, OBJECT_SOME_VALUES_FROM__SOME_VALUES_FROM);

		objectAllValuesFromEClass = createEClass(OBJECT_ALL_VALUES_FROM);
		createEReference(objectAllValuesFromEClass, OBJECT_ALL_VALUES_FROM__ALL_VALUES_FROM);

		objectHasValueEClass = createEClass(OBJECT_HAS_VALUE);
		createEReference(objectHasValueEClass, OBJECT_HAS_VALUE__HAS_VALUE);

		objectHasSelfEClass = createEClass(OBJECT_HAS_SELF);

		objectExactCardinalityEClass = createEClass(OBJECT_EXACT_CARDINALITY);
		createEAttribute(objectExactCardinalityEClass, OBJECT_EXACT_CARDINALITY__CARDINALITY);
		createEReference(objectExactCardinalityEClass, OBJECT_EXACT_CARDINALITY__ON_CLASS);

		objectMaxCardinalityEClass = createEClass(OBJECT_MAX_CARDINALITY);
		createEAttribute(objectMaxCardinalityEClass, OBJECT_MAX_CARDINALITY__CARDINALITY);
		createEReference(objectMaxCardinalityEClass, OBJECT_MAX_CARDINALITY__ON_CLASS);

		objectMinCardinalityEClass = createEClass(OBJECT_MIN_CARDINALITY);
		createEAttribute(objectMinCardinalityEClass, OBJECT_MIN_CARDINALITY__CARDINALITY);
		createEReference(objectMinCardinalityEClass, OBJECT_MIN_CARDINALITY__ON_CLASS);

		dataPropertyRestrictionEClass = createEClass(DATA_PROPERTY_RESTRICTION);

		dataSomeValuesFromEClass = createEClass(DATA_SOME_VALUES_FROM);
		createEReference(dataSomeValuesFromEClass, DATA_SOME_VALUES_FROM__SOME_VALUES_FROM);
		createEReference(dataSomeValuesFromEClass, DATA_SOME_VALUES_FROM__PROPERTIES);

		dataAllValuesFromEClass = createEClass(DATA_ALL_VALUES_FROM);
		createEReference(dataAllValuesFromEClass, DATA_ALL_VALUES_FROM__ALL_VALUES_FROM);
		createEReference(dataAllValuesFromEClass, DATA_ALL_VALUES_FROM__PROPERTIES);

		dataHasValueEClass = createEClass(DATA_HAS_VALUE);
		createEReference(dataHasValueEClass, DATA_HAS_VALUE__HAS_VALUE);
		createEReference(dataHasValueEClass, DATA_HAS_VALUE__PROPERTY);

		dataExactCardinalityEClass = createEClass(DATA_EXACT_CARDINALITY);
		createEAttribute(dataExactCardinalityEClass, DATA_EXACT_CARDINALITY__CARDINALITY);
		createEReference(dataExactCardinalityEClass, DATA_EXACT_CARDINALITY__DATA_RANGE);
		createEReference(dataExactCardinalityEClass, DATA_EXACT_CARDINALITY__PROPERTY);

		dataMaxCardinalityEClass = createEClass(DATA_MAX_CARDINALITY);
		createEAttribute(dataMaxCardinalityEClass, DATA_MAX_CARDINALITY__CARDINALITY);
		createEReference(dataMaxCardinalityEClass, DATA_MAX_CARDINALITY__DATA_RANGE);
		createEReference(dataMaxCardinalityEClass, DATA_MAX_CARDINALITY__PROPERTY);

		dataMinCardinalityEClass = createEClass(DATA_MIN_CARDINALITY);
		createEAttribute(dataMinCardinalityEClass, DATA_MIN_CARDINALITY__CARDINALITY);
		createEReference(dataMinCardinalityEClass, DATA_MIN_CARDINALITY__DATA_RANGE);
		createEReference(dataMinCardinalityEClass, DATA_MIN_CARDINALITY__PROPERTY);

		owlPropertyEClass = createEClass(OWL_PROPERTY);

		classPropertyEClass = createEClass(CLASS_PROPERTY);
		createEAttribute(classPropertyEClass, CLASS_PROPERTY__IS_FUNCTIONAL);
		createEReference(classPropertyEClass, CLASS_PROPERTY__DOMAIN);

		dataPropertyEClass = createEClass(DATA_PROPERTY);
		createEReference(dataPropertyEClass, DATA_PROPERTY__RANGE);
		createEReference(dataPropertyEClass, DATA_PROPERTY__EQUIVALENT_PROPERTIES);
		createEReference(dataPropertyEClass, DATA_PROPERTY__SUB_PROPERTY_OF);
		createEReference(dataPropertyEClass, DATA_PROPERTY__DISJOINT_PROPERTIES);

		objectPropertyEClass = createEClass(OBJECT_PROPERTY);
		createEAttribute(objectPropertyEClass, OBJECT_PROPERTY__IS_INVERSE_FUNCTIONAL);
		createEAttribute(objectPropertyEClass, OBJECT_PROPERTY__IS_SYMMETRIC);
		createEAttribute(objectPropertyEClass, OBJECT_PROPERTY__IS_ASYMMETRIC);
		createEAttribute(objectPropertyEClass, OBJECT_PROPERTY__IS_TRANSITIVE);
		createEAttribute(objectPropertyEClass, OBJECT_PROPERTY__IS_REFLEXIVE);
		createEAttribute(objectPropertyEClass, OBJECT_PROPERTY__IS_IRREFLEXIVE);
		createEReference(objectPropertyEClass, OBJECT_PROPERTY__INVERSE_OF);
		createEReference(objectPropertyEClass, OBJECT_PROPERTY__RANGE);
		createEReference(objectPropertyEClass, OBJECT_PROPERTY__EQUIVALENT_PROPERTIES);
		createEReference(objectPropertyEClass, OBJECT_PROPERTY__SUB_PROPERTY_OF);
		createEReference(objectPropertyEClass, OBJECT_PROPERTY__DISJOINT_PROPERTIES);

		objectPropertyChainEClass = createEClass(OBJECT_PROPERTY_CHAIN);
		createEReference(objectPropertyChainEClass, OBJECT_PROPERTY_CHAIN__PROPERTIES);

		annotationPropertyEClass = createEClass(ANNOTATION_PROPERTY);

		dataRangeEClass = createEClass(DATA_RANGE);

		owlDatatypeEClass = createEClass(OWL_DATATYPE);

		dataComplementOfEClass = createEClass(DATA_COMPLEMENT_OF);
		createEReference(dataComplementOfEClass, DATA_COMPLEMENT_OF__DATA_RANGE);

		dataUnionOfEClass = createEClass(DATA_UNION_OF);
		createEReference(dataUnionOfEClass, DATA_UNION_OF__DATA_RANGES);

		dataIntersectionOfEClass = createEClass(DATA_INTERSECTION_OF);
		createEReference(dataIntersectionOfEClass, DATA_INTERSECTION_OF__DATA_RANGES);

		dataOneOfEClass = createEClass(DATA_ONE_OF);
		createEReference(dataOneOfEClass, DATA_ONE_OF__ONE_OF);

		datatypeRestrictionEClass = createEClass(DATATYPE_RESTRICTION);
		createEReference(datatypeRestrictionEClass, DATATYPE_RESTRICTION__DATATYPE);
		createEReference(datatypeRestrictionEClass, DATATYPE_RESTRICTION__RESTRICTIONS);

		datatypeDefinitionEClass = createEClass(DATATYPE_DEFINITION);
		createEReference(datatypeDefinitionEClass, DATATYPE_DEFINITION__DATA_RANGE);
		createEReference(datatypeDefinitionEClass, DATATYPE_DEFINITION__DATATYPE);

		facetRestrictionEClass = createEClass(FACET_RESTRICTION);
		createEReference(facetRestrictionEClass, FACET_RESTRICTION__DATATYPE);
		createEReference(facetRestrictionEClass, FACET_RESTRICTION__VALUE);

		annotationEClass = createEClass(ANNOTATION);
		createEReference(annotationEClass, ANNOTATION__PROPERTY);
		createEReference(annotationEClass, ANNOTATION__VALUE);

		individualEClass = createEClass(INDIVIDUAL);
		createEReference(individualEClass, INDIVIDUAL__SAME_AS);
		createEReference(individualEClass, INDIVIDUAL__DIFFERENT_FROM);
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

		// Obtain other dependent packages
		RDFPackage theRDFPackage = (RDFPackage)EPackage.Registry.INSTANCE.getEPackage(RDFPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ontologyEClass.getESuperTypes().add(theRDFPackage.getDocumentGraph());
		ontologyEClass.getESuperTypes().add(this.getAnnotatedElement());
		classExpressionEClass.getESuperTypes().add(theRDFPackage.getSubjectNode());
		classExpressionEClass.getESuperTypes().add(this.getAnnotatedElement());
		owlClassEClass.getESuperTypes().add(theRDFPackage.getResource());
		owlClassEClass.getESuperTypes().add(this.getClassExpression());
		objectUnionOfEClass.getESuperTypes().add(this.getClassExpression());
		objectUnionOfEClass.getESuperTypes().add(theRDFPackage.getBlankNode());
		objectIntersectionOfEClass.getESuperTypes().add(this.getClassExpression());
		objectIntersectionOfEClass.getESuperTypes().add(theRDFPackage.getBlankNode());
		objectComplementOfEClass.getESuperTypes().add(this.getClassExpression());
		objectComplementOfEClass.getESuperTypes().add(theRDFPackage.getBlankNode());
		objectOneOfEClass.getESuperTypes().add(this.getClassExpression());
		objectOneOfEClass.getESuperTypes().add(theRDFPackage.getBlankNode());
		objectPropertyRestrictionEClass.getESuperTypes().add(this.getClassExpression());
		objectPropertyRestrictionEClass.getESuperTypes().add(theRDFPackage.getBlankNode());
		objectSomeValuesFromEClass.getESuperTypes().add(this.getObjectPropertyRestriction());
		objectAllValuesFromEClass.getESuperTypes().add(this.getObjectPropertyRestriction());
		objectHasValueEClass.getESuperTypes().add(this.getObjectPropertyRestriction());
		objectHasSelfEClass.getESuperTypes().add(this.getObjectPropertyRestriction());
		objectExactCardinalityEClass.getESuperTypes().add(this.getObjectPropertyRestriction());
		objectMaxCardinalityEClass.getESuperTypes().add(this.getObjectPropertyRestriction());
		objectMinCardinalityEClass.getESuperTypes().add(this.getObjectPropertyRestriction());
		dataPropertyRestrictionEClass.getESuperTypes().add(this.getClassExpression());
		dataPropertyRestrictionEClass.getESuperTypes().add(theRDFPackage.getBlankNode());
		dataSomeValuesFromEClass.getESuperTypes().add(this.getDataPropertyRestriction());
		dataAllValuesFromEClass.getESuperTypes().add(this.getDataPropertyRestriction());
		dataHasValueEClass.getESuperTypes().add(this.getDataPropertyRestriction());
		dataExactCardinalityEClass.getESuperTypes().add(this.getDataPropertyRestriction());
		dataMaxCardinalityEClass.getESuperTypes().add(this.getDataPropertyRestriction());
		dataMinCardinalityEClass.getESuperTypes().add(this.getDataPropertyRestriction());
		owlPropertyEClass.getESuperTypes().add(theRDFPackage.getResource());
		owlPropertyEClass.getESuperTypes().add(this.getAnnotatedElement());
		classPropertyEClass.getESuperTypes().add(this.getOWLProperty());
		dataPropertyEClass.getESuperTypes().add(this.getClassProperty());
		objectPropertyEClass.getESuperTypes().add(this.getClassProperty());
		objectPropertyChainEClass.getESuperTypes().add(this.getObjectProperty());
		annotationPropertyEClass.getESuperTypes().add(this.getOWLProperty());
		dataRangeEClass.getESuperTypes().add(theRDFPackage.getSubjectNode());
		dataRangeEClass.getESuperTypes().add(this.getAnnotatedElement());
		owlDatatypeEClass.getESuperTypes().add(theRDFPackage.getDatatype());
		owlDatatypeEClass.getESuperTypes().add(this.getDataRange());
		dataComplementOfEClass.getESuperTypes().add(this.getDataRange());
		dataUnionOfEClass.getESuperTypes().add(this.getDataRange());
		dataIntersectionOfEClass.getESuperTypes().add(this.getDataRange());
		dataOneOfEClass.getESuperTypes().add(this.getDataRange());
		datatypeRestrictionEClass.getESuperTypes().add(this.getDataRange());
		annotationEClass.getESuperTypes().add(this.getAnnotatedElement());
		individualEClass.getESuperTypes().add(theRDFPackage.getResource());

		// Initialize classes and features; add operations and parameters
		initEClass(ontologyEClass, Ontology.class, "Ontology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOntology_Classes(), this.getOWLClass(), null, "classes", null, 0, -1, Ontology.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOntology_DataProperties(), this.getDataProperty(), null, "dataProperties", null, 0, -1, Ontology.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOntology_ObjectProperties(), this.getObjectProperty(), null, "objectProperties", null, 0, -1, Ontology.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOntology_DataRanges(), this.getDataRange(), null, "dataRanges", null, 0, -1, Ontology.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOntology_ClassExpressions(), this.getClassExpression(), null, "classExpressions", null, 0, -1, Ontology.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOntology_OwlDatatypes(), this.getOWLDatatype(), null, "owlDatatypes", null, 0, -1, Ontology.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(annotatedElementEClass, AnnotatedElement.class, "AnnotatedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotatedElement_Annotations(), this.getAnnotation(), null, "annotations", null, 0, -1, AnnotatedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(annotatedElementEClass, null, "addAnnotation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAnnotationProperty(), "property", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(classExpressionEClass, ClassExpression.class, "ClassExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassExpression_Keys(), this.getOWLProperty(), null, "keys", null, 0, -1, ClassExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassExpression_SubClassOf(), this.getClassExpression(), this.getClassExpression_SuperClass(), "subClassOf", null, 0, -1, ClassExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassExpression_SuperClass(), this.getClassExpression(), this.getClassExpression_SubClassOf(), "superClass", null, 0, -1, ClassExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassExpression_DisjointClasses(), this.getClassExpression(), null, "disjointClasses", null, 0, -1, ClassExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassExpression_EquivalentClasses(), this.getClassExpression(), null, "equivalentClasses", null, 0, -1, ClassExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owlClassEClass, OWLClass.class, "OWLClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectUnionOfEClass, ObjectUnionOf.class, "ObjectUnionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectUnionOf_UnionOf(), this.getClassExpression(), null, "unionOf", null, 0, -1, ObjectUnionOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectIntersectionOfEClass, ObjectIntersectionOf.class, "ObjectIntersectionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectIntersectionOf_IntersectionOf(), this.getClassExpression(), null, "intersectionOf", null, 0, -1, ObjectIntersectionOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectComplementOfEClass, ObjectComplementOf.class, "ObjectComplementOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectComplementOf_ComplementOf(), this.getClassExpression(), null, "complementOf", null, 0, -1, ObjectComplementOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectOneOfEClass, ObjectOneOf.class, "ObjectOneOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectOneOf_OneOf(), theRDFPackage.getResource(), null, "oneOf", null, 0, -1, ObjectOneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectPropertyRestrictionEClass, ObjectPropertyRestriction.class, "ObjectPropertyRestriction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectPropertyRestriction_Property(), this.getObjectProperty(), null, "property", null, 0, 1, ObjectPropertyRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectSomeValuesFromEClass, ObjectSomeValuesFrom.class, "ObjectSomeValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectSomeValuesFrom_SomeValuesFrom(), this.getClassExpression(), null, "someValuesFrom", null, 0, 1, ObjectSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectAllValuesFromEClass, ObjectAllValuesFrom.class, "ObjectAllValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectAllValuesFrom_AllValuesFrom(), this.getClassExpression(), null, "allValuesFrom", null, 0, 1, ObjectAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectHasValueEClass, ObjectHasValue.class, "ObjectHasValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectHasValue_HasValue(), theRDFPackage.getResource(), null, "hasValue", null, 0, 1, ObjectHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectHasSelfEClass, ObjectHasSelf.class, "ObjectHasSelf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectExactCardinalityEClass, ObjectExactCardinality.class, "ObjectExactCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectExactCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 0, 1, ObjectExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectExactCardinality_OnClass(), this.getClassExpression(), null, "onClass", null, 0, 1, ObjectExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectMaxCardinalityEClass, ObjectMaxCardinality.class, "ObjectMaxCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectMaxCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 0, 1, ObjectMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectMaxCardinality_OnClass(), this.getClassExpression(), null, "onClass", null, 0, 1, ObjectMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectMinCardinalityEClass, ObjectMinCardinality.class, "ObjectMinCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectMinCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 0, 1, ObjectMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectMinCardinality_OnClass(), this.getClassExpression(), null, "onClass", null, 0, 1, ObjectMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPropertyRestrictionEClass, DataPropertyRestriction.class, "DataPropertyRestriction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataSomeValuesFromEClass, DataSomeValuesFrom.class, "DataSomeValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSomeValuesFrom_SomeValuesFrom(), this.getDataRange(), null, "someValuesFrom", null, 0, 1, DataSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSomeValuesFrom_Properties(), this.getDataProperty(), null, "properties", null, 0, -1, DataSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAllValuesFromEClass, DataAllValuesFrom.class, "DataAllValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataAllValuesFrom_AllValuesFrom(), this.getDataRange(), null, "allValuesFrom", null, 0, 1, DataAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAllValuesFrom_Properties(), this.getDataProperty(), null, "properties", null, 0, -1, DataAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataHasValueEClass, DataHasValue.class, "DataHasValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataHasValue_HasValue(), theRDFPackage.getLiteral(), null, "hasValue", null, 0, 1, DataHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataHasValue_Property(), this.getDataProperty(), null, "property", null, 0, 1, DataHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataExactCardinalityEClass, DataExactCardinality.class, "DataExactCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataExactCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 0, 1, DataExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataExactCardinality_DataRange(), this.getDataRange(), null, "dataRange", null, 0, 1, DataExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataExactCardinality_Property(), this.getDataProperty(), null, "property", null, 0, 1, DataExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataMaxCardinalityEClass, DataMaxCardinality.class, "DataMaxCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataMaxCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 0, 1, DataMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataMaxCardinality_DataRange(), this.getDataRange(), null, "dataRange", null, 0, 1, DataMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataMaxCardinality_Property(), this.getDataProperty(), null, "property", null, 0, 1, DataMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataMinCardinalityEClass, DataMinCardinality.class, "DataMinCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataMinCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 0, 1, DataMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataMinCardinality_DataRange(), this.getDataRange(), null, "dataRange", null, 0, 1, DataMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataMinCardinality_Property(), this.getDataProperty(), null, "property", null, 0, 1, DataMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owlPropertyEClass, OWLProperty.class, "OWLProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classPropertyEClass, ClassProperty.class, "ClassProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassProperty_IsFunctional(), ecorePackage.getEBooleanObject(), "isFunctional", null, 0, 1, ClassProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassProperty_Domain(), this.getClassExpression(), null, "domain", null, 0, -1, ClassProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPropertyEClass, DataProperty.class, "DataProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataProperty_Range(), this.getDataRange(), null, "range", null, 0, -1, DataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataProperty_EquivalentProperties(), this.getDataProperty(), null, "equivalentProperties", null, 0, -1, DataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataProperty_SubPropertyOf(), this.getDataProperty(), null, "subPropertyOf", null, 0, -1, DataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataProperty_DisjointProperties(), this.getDataProperty(), null, "disjointProperties", null, 0, -1, DataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectPropertyEClass, ObjectProperty.class, "ObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectProperty_IsInverseFunctional(), ecorePackage.getEBooleanObject(), "isInverseFunctional", null, 0, 1, ObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectProperty_IsSymmetric(), ecorePackage.getEBooleanObject(), "isSymmetric", null, 0, 1, ObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectProperty_IsAsymmetric(), ecorePackage.getEBooleanObject(), "isAsymmetric", null, 0, 1, ObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectProperty_IsTransitive(), ecorePackage.getEBooleanObject(), "isTransitive", null, 0, 1, ObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectProperty_IsReflexive(), ecorePackage.getEBooleanObject(), "isReflexive", null, 0, 1, ObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectProperty_IsIrreflexive(), ecorePackage.getEBooleanObject(), "isIrreflexive", null, 0, 1, ObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectProperty_InverseOf(), this.getObjectProperty(), null, "inverseOf", null, 0, -1, ObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectProperty_Range(), this.getClassExpression(), null, "range", null, 0, -1, ObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectProperty_EquivalentProperties(), this.getObjectProperty(), null, "equivalentProperties", null, 0, -1, ObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectProperty_SubPropertyOf(), this.getObjectProperty(), null, "subPropertyOf", null, 0, -1, ObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectProperty_DisjointProperties(), this.getObjectProperty(), null, "disjointProperties", null, 0, -1, ObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectPropertyChainEClass, ObjectPropertyChain.class, "ObjectPropertyChain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectPropertyChain_Properties(), this.getObjectProperty(), null, "properties", null, 0, -1, ObjectPropertyChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationPropertyEClass, AnnotationProperty.class, "AnnotationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataRangeEClass, DataRange.class, "DataRange", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(owlDatatypeEClass, OWLDatatype.class, "OWLDatatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataComplementOfEClass, DataComplementOf.class, "DataComplementOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataComplementOf_DataRange(), this.getDataRange(), null, "dataRange", null, 0, 1, DataComplementOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataUnionOfEClass, DataUnionOf.class, "DataUnionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataUnionOf_DataRanges(), this.getDataRange(), null, "dataRanges", null, 0, -1, DataUnionOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataIntersectionOfEClass, DataIntersectionOf.class, "DataIntersectionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataIntersectionOf_DataRanges(), this.getDataRange(), null, "dataRanges", null, 0, -1, DataIntersectionOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataOneOfEClass, DataOneOf.class, "DataOneOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataOneOf_OneOf(), theRDFPackage.getLiteral(), null, "oneOf", null, 0, -1, DataOneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypeRestrictionEClass, DatatypeRestriction.class, "DatatypeRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatatypeRestriction_Datatype(), this.getDataRange(), null, "datatype", null, 0, 1, DatatypeRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatatypeRestriction_Restrictions(), this.getFacetRestriction(), null, "restrictions", null, 0, -1, DatatypeRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypeDefinitionEClass, DatatypeDefinition.class, "DatatypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatatypeDefinition_DataRange(), this.getDataRange(), null, "dataRange", null, 1, 1, DatatypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatatypeDefinition_Datatype(), this.getOWLDatatype(), null, "datatype", null, 1, 1, DatatypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(facetRestrictionEClass, FacetRestriction.class, "FacetRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFacetRestriction_Datatype(), this.getDataRange(), null, "datatype", null, 0, 1, FacetRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacetRestriction_Value(), theRDFPackage.getLiteral(), null, "value", null, 0, 1, FacetRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotation_Property(), this.getAnnotationProperty(), null, "property", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotation_Value(), theRDFPackage.getLiteral(), null, "value", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(individualEClass, Individual.class, "Individual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndividual_SameAs(), this.getIndividual(), null, "sameAs", null, 0, -1, Individual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndividual_DifferentFrom(), this.getIndividual(), null, "differentFrom", null, 0, -1, Individual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(individualEClass, this.getClassExpression(), "getClasses", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(individualEClass, null, "addObjectValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObjectProperty(), "property", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndividual(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(individualEClass, null, "addObjectValues", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObjectProperty(), "property", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndividual(), "values", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(individualEClass, null, "addDataValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataProperty(), "property", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRDFPackage.getLiteral(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(individualEClass, null, "addDataValues", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataProperty(), "property", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRDFPackage.getLiteral(), "values", 0, -1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// emf4sw.OWLClass
		createEmf4swAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>emf4sw.OWLClass</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmf4swAnnotations() {
		String source = "emf4sw.OWLClass";		
		addAnnotation
		  (ontologyEClass, 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#Ontology"
		   });								
		addAnnotation
		  (owlClassEClass, 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2000/01/rdf-schema#Class"
		   });		
		addAnnotation
		  (owlClassEClass, 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#Class"
		   });		
		addAnnotation
		  (getObjectPropertyRestriction_Property(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#onProperty"
		   });		
		addAnnotation
		  (getObjectSomeValuesFrom_SomeValuesFrom(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#someValuesFrom"
		   });		
		addAnnotation
		  (getObjectAllValuesFrom_AllValuesFrom(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#allValuesFrom"
		   });		
		addAnnotation
		  (getObjectHasValue_HasValue(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#hasValue"
		   });		
		addAnnotation
		  (getObjectExactCardinality_Cardinality(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#cardinality"
		   });		
		addAnnotation
		  (getObjectExactCardinality_OnClass(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#onClass"
		   });		
		addAnnotation
		  (getObjectMaxCardinality_Cardinality(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#maxCardinality"
		   });		
		addAnnotation
		  (getObjectMaxCardinality_OnClass(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#onClass"
		   });		
		addAnnotation
		  (getObjectMinCardinality_Cardinality(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#minCardinality"
		   });		
		addAnnotation
		  (getObjectMinCardinality_OnClass(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#onClass"
		   });		
		addAnnotation
		  (getDataSomeValuesFrom_SomeValuesFrom(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#someValuesFrom"
		   });		
		addAnnotation
		  (getDataSomeValuesFrom_Properties(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#onProperty"
		   });		
		addAnnotation
		  (getDataAllValuesFrom_AllValuesFrom(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#allValuesFrom"
		   });		
		addAnnotation
		  (getDataAllValuesFrom_Properties(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#onProperty"
		   });		
		addAnnotation
		  (getDataHasValue_HasValue(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#hasValue"
		   });		
		addAnnotation
		  (getDataHasValue_Property(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#onProperty"
		   });		
		addAnnotation
		  (getDataExactCardinality_Cardinality(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#cardinality"
		   });		
		addAnnotation
		  (getDataExactCardinality_DataRange(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#onDataRange"
		   });		
		addAnnotation
		  (getDataExactCardinality_Property(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#onProperty"
		   });		
		addAnnotation
		  (getDataMaxCardinality_Cardinality(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#maxCardinality"
		   });		
		addAnnotation
		  (getDataMaxCardinality_DataRange(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#onDataRange"
		   });		
		addAnnotation
		  (getDataMaxCardinality_Property(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#onProperty"
		   });		
		addAnnotation
		  (getDataMinCardinality_Cardinality(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#minCardinality"
		   });		
		addAnnotation
		  (getDataMinCardinality_DataRange(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#onDataRange"
		   });		
		addAnnotation
		  (getDataMinCardinality_Property(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#onProperty"
		   });		
		addAnnotation
		  (getClassProperty_Domain(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2000/01/rdf-schema#domain"
		   });		
		addAnnotation
		  (dataPropertyEClass, 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#DatatypeProperty"
		   });		
		addAnnotation
		  (getDataProperty_Range(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2000/01/rdf-schema#range"
		   });		
		addAnnotation
		  (objectPropertyEClass, 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2002/07/owl#ObjectProperty"
		   });		
		addAnnotation
		  (getObjectProperty_Range(), 
		   source, 
		   new String[] {
			 "uri", "http://www.w3.org/2000/01/rdf-schema#range"
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
		  (getOntology_Classes(), 
		   source, 
		   new String[] {
			 "group", "#nodes"
		   });		
		addAnnotation
		  (getOntology_DataProperties(), 
		   source, 
		   new String[] {
			 "group", "#nodes"
		   });		
		addAnnotation
		  (getOntology_ObjectProperties(), 
		   source, 
		   new String[] {
			 "group", "#nodes"
		   });		
		addAnnotation
		  (getOntology_DataRanges(), 
		   source, 
		   new String[] {
			 "group", "#nodes"
		   });		
		addAnnotation
		  (getOntology_ClassExpressions(), 
		   source, 
		   new String[] {
			 "group", "#nodes"
		   });		
		addAnnotation
		  (getOntology_OwlDatatypes(), 
		   source, 
		   new String[] {
			 "group", "#nodes"
		   });																																
	}

} //OWLPackageImpl
