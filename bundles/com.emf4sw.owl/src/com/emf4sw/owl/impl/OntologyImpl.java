/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.emf4sw.owl.AnnotatedElement;
import com.emf4sw.owl.Annotation;
import com.emf4sw.owl.AnnotationProperty;
import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.DataProperty;
import com.emf4sw.owl.DataRange;
import com.emf4sw.owl.OWLClass;
import com.emf4sw.owl.OWLDatatype;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.ObjectProperty;
import com.emf4sw.owl.Ontology;
import com.emf4sw.owl.impl.notify.OntologyTripleAdapter;
import com.emf4sw.rdf.impl.DocumentGraphImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ontology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.OntologyImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.OntologyImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.OntologyImpl#getDataProperties <em>Data Properties</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.OntologyImpl#getObjectProperties <em>Object Properties</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.OntologyImpl#getDataRanges <em>Data Ranges</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.OntologyImpl#getClassExpressions <em>Class Expressions</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.OntologyImpl#getOwlDatatypes <em>Owl Datatypes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OntologyImpl extends DocumentGraphImpl implements Ontology {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected OntologyImpl() {
		super();
		eAdapters().add(new OntologyTripleAdapter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.ONTOLOGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, OWLPackage.ONTOLOGY__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OWLClass> getClasses() {
		return getNodes().list(OWLPackage.Literals.ONTOLOGY__CLASSES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataProperty> getDataProperties() {
		return getNodes().list(OWLPackage.Literals.ONTOLOGY__DATA_PROPERTIES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectProperty> getObjectProperties() {
		return getNodes().list(OWLPackage.Literals.ONTOLOGY__OBJECT_PROPERTIES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataRange> getDataRanges() {
		return getNodes().list(OWLPackage.Literals.ONTOLOGY__DATA_RANGES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassExpression> getClassExpressions() {
		return getNodes().list(OWLPackage.Literals.ONTOLOGY__CLASS_EXPRESSIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OWLDatatype> getOwlDatatypes() {
		return getNodes().list(OWLPackage.Literals.ONTOLOGY__OWL_DATATYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAnnotation(AnnotationProperty property, Object value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.ONTOLOGY__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case OWLPackage.ONTOLOGY__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case OWLPackage.ONTOLOGY__DATA_PROPERTIES:
				return ((InternalEList<?>)getDataProperties()).basicRemove(otherEnd, msgs);
			case OWLPackage.ONTOLOGY__OBJECT_PROPERTIES:
				return ((InternalEList<?>)getObjectProperties()).basicRemove(otherEnd, msgs);
			case OWLPackage.ONTOLOGY__DATA_RANGES:
				return ((InternalEList<?>)getDataRanges()).basicRemove(otherEnd, msgs);
			case OWLPackage.ONTOLOGY__CLASS_EXPRESSIONS:
				return ((InternalEList<?>)getClassExpressions()).basicRemove(otherEnd, msgs);
			case OWLPackage.ONTOLOGY__OWL_DATATYPES:
				return ((InternalEList<?>)getOwlDatatypes()).basicRemove(otherEnd, msgs);
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
			case OWLPackage.ONTOLOGY__ANNOTATIONS:
				return getAnnotations();
			case OWLPackage.ONTOLOGY__CLASSES:
				return getClasses();
			case OWLPackage.ONTOLOGY__DATA_PROPERTIES:
				return getDataProperties();
			case OWLPackage.ONTOLOGY__OBJECT_PROPERTIES:
				return getObjectProperties();
			case OWLPackage.ONTOLOGY__DATA_RANGES:
				return getDataRanges();
			case OWLPackage.ONTOLOGY__CLASS_EXPRESSIONS:
				return getClassExpressions();
			case OWLPackage.ONTOLOGY__OWL_DATATYPES:
				return getOwlDatatypes();
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
			case OWLPackage.ONTOLOGY__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case OWLPackage.ONTOLOGY__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends OWLClass>)newValue);
				return;
			case OWLPackage.ONTOLOGY__DATA_PROPERTIES:
				getDataProperties().clear();
				getDataProperties().addAll((Collection<? extends DataProperty>)newValue);
				return;
			case OWLPackage.ONTOLOGY__OBJECT_PROPERTIES:
				getObjectProperties().clear();
				getObjectProperties().addAll((Collection<? extends ObjectProperty>)newValue);
				return;
			case OWLPackage.ONTOLOGY__DATA_RANGES:
				getDataRanges().clear();
				getDataRanges().addAll((Collection<? extends DataRange>)newValue);
				return;
			case OWLPackage.ONTOLOGY__CLASS_EXPRESSIONS:
				getClassExpressions().clear();
				getClassExpressions().addAll((Collection<? extends ClassExpression>)newValue);
				return;
			case OWLPackage.ONTOLOGY__OWL_DATATYPES:
				getOwlDatatypes().clear();
				getOwlDatatypes().addAll((Collection<? extends OWLDatatype>)newValue);
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
			case OWLPackage.ONTOLOGY__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case OWLPackage.ONTOLOGY__CLASSES:
				getClasses().clear();
				return;
			case OWLPackage.ONTOLOGY__DATA_PROPERTIES:
				getDataProperties().clear();
				return;
			case OWLPackage.ONTOLOGY__OBJECT_PROPERTIES:
				getObjectProperties().clear();
				return;
			case OWLPackage.ONTOLOGY__DATA_RANGES:
				getDataRanges().clear();
				return;
			case OWLPackage.ONTOLOGY__CLASS_EXPRESSIONS:
				getClassExpressions().clear();
				return;
			case OWLPackage.ONTOLOGY__OWL_DATATYPES:
				getOwlDatatypes().clear();
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
			case OWLPackage.ONTOLOGY__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case OWLPackage.ONTOLOGY__CLASSES:
				return !getClasses().isEmpty();
			case OWLPackage.ONTOLOGY__DATA_PROPERTIES:
				return !getDataProperties().isEmpty();
			case OWLPackage.ONTOLOGY__OBJECT_PROPERTIES:
				return !getObjectProperties().isEmpty();
			case OWLPackage.ONTOLOGY__DATA_RANGES:
				return !getDataRanges().isEmpty();
			case OWLPackage.ONTOLOGY__CLASS_EXPRESSIONS:
				return !getClassExpressions().isEmpty();
			case OWLPackage.ONTOLOGY__OWL_DATATYPES:
				return !getOwlDatatypes().isEmpty();
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
		if (baseClass == AnnotatedElement.class) {
			switch (derivedFeatureID) {
				case OWLPackage.ONTOLOGY__ANNOTATIONS: return OWLPackage.ANNOTATED_ELEMENT__ANNOTATIONS;
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
		if (baseClass == AnnotatedElement.class) {
			switch (baseFeatureID) {
				case OWLPackage.ANNOTATED_ELEMENT__ANNOTATIONS: return OWLPackage.ONTOLOGY__ANNOTATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //OntologyImpl
