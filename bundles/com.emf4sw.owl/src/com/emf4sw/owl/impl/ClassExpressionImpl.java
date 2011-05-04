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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.emf4sw.owl.AnnotatedElement;
import com.emf4sw.owl.Annotation;
import com.emf4sw.owl.AnnotationProperty;
import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.OWLProperty;
import com.emf4sw.rdf.impl.SubjectNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.ClassExpressionImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ClassExpressionImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ClassExpressionImpl#getSubClassOf <em>Sub Class Of</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ClassExpressionImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ClassExpressionImpl#getDisjointClasses <em>Disjoint Classes</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ClassExpressionImpl#getEquivalentClasses <em>Equivalent Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ClassExpressionImpl extends SubjectNodeImpl implements ClassExpression {
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
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<OWLProperty> keys;

	/**
	 * The cached value of the '{@link #getSubClassOf() <em>Sub Class Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClassOf()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassExpression> subClassOf;

	/**
	 * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClass()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassExpression> superClass;

	/**
	 * The cached value of the '{@link #getDisjointClasses() <em>Disjoint Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjointClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassExpression> disjointClasses;

	/**
	 * The cached value of the '{@link #getEquivalentClasses() <em>Equivalent Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassExpression> equivalentClasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.CLASS_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, OWLPackage.CLASS_EXPRESSION__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OWLProperty> getKeys() {
		if (keys == null) {
			keys = new EObjectResolvingEList<OWLProperty>(OWLProperty.class, this, OWLPackage.CLASS_EXPRESSION__KEYS);
		}
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassExpression> getSubClassOf() {
		if (subClassOf == null) {
			subClassOf = new EObjectWithInverseResolvingEList.ManyInverse<ClassExpression>(ClassExpression.class, this, OWLPackage.CLASS_EXPRESSION__SUB_CLASS_OF, OWLPackage.CLASS_EXPRESSION__SUPER_CLASS);
		}
		return subClassOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassExpression> getSuperClass() {
		if (superClass == null) {
			superClass = new EObjectWithInverseResolvingEList.ManyInverse<ClassExpression>(ClassExpression.class, this, OWLPackage.CLASS_EXPRESSION__SUPER_CLASS, OWLPackage.CLASS_EXPRESSION__SUB_CLASS_OF);
		}
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassExpression> getDisjointClasses() {
		if (disjointClasses == null) {
			disjointClasses = new EObjectResolvingEList<ClassExpression>(ClassExpression.class, this, OWLPackage.CLASS_EXPRESSION__DISJOINT_CLASSES);
		}
		return disjointClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassExpression> getEquivalentClasses() {
		if (equivalentClasses == null) {
			equivalentClasses = new EObjectResolvingEList<ClassExpression>(ClassExpression.class, this, OWLPackage.CLASS_EXPRESSION__EQUIVALENT_CLASSES);
		}
		return equivalentClasses;
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.CLASS_EXPRESSION__SUB_CLASS_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubClassOf()).basicAdd(otherEnd, msgs);
			case OWLPackage.CLASS_EXPRESSION__SUPER_CLASS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuperClass()).basicAdd(otherEnd, msgs);
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
			case OWLPackage.CLASS_EXPRESSION__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case OWLPackage.CLASS_EXPRESSION__SUB_CLASS_OF:
				return ((InternalEList<?>)getSubClassOf()).basicRemove(otherEnd, msgs);
			case OWLPackage.CLASS_EXPRESSION__SUPER_CLASS:
				return ((InternalEList<?>)getSuperClass()).basicRemove(otherEnd, msgs);
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
			case OWLPackage.CLASS_EXPRESSION__ANNOTATIONS:
				return getAnnotations();
			case OWLPackage.CLASS_EXPRESSION__KEYS:
				return getKeys();
			case OWLPackage.CLASS_EXPRESSION__SUB_CLASS_OF:
				return getSubClassOf();
			case OWLPackage.CLASS_EXPRESSION__SUPER_CLASS:
				return getSuperClass();
			case OWLPackage.CLASS_EXPRESSION__DISJOINT_CLASSES:
				return getDisjointClasses();
			case OWLPackage.CLASS_EXPRESSION__EQUIVALENT_CLASSES:
				return getEquivalentClasses();
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
			case OWLPackage.CLASS_EXPRESSION__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case OWLPackage.CLASS_EXPRESSION__KEYS:
				getKeys().clear();
				getKeys().addAll((Collection<? extends OWLProperty>)newValue);
				return;
			case OWLPackage.CLASS_EXPRESSION__SUB_CLASS_OF:
				getSubClassOf().clear();
				getSubClassOf().addAll((Collection<? extends ClassExpression>)newValue);
				return;
			case OWLPackage.CLASS_EXPRESSION__SUPER_CLASS:
				getSuperClass().clear();
				getSuperClass().addAll((Collection<? extends ClassExpression>)newValue);
				return;
			case OWLPackage.CLASS_EXPRESSION__DISJOINT_CLASSES:
				getDisjointClasses().clear();
				getDisjointClasses().addAll((Collection<? extends ClassExpression>)newValue);
				return;
			case OWLPackage.CLASS_EXPRESSION__EQUIVALENT_CLASSES:
				getEquivalentClasses().clear();
				getEquivalentClasses().addAll((Collection<? extends ClassExpression>)newValue);
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
			case OWLPackage.CLASS_EXPRESSION__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case OWLPackage.CLASS_EXPRESSION__KEYS:
				getKeys().clear();
				return;
			case OWLPackage.CLASS_EXPRESSION__SUB_CLASS_OF:
				getSubClassOf().clear();
				return;
			case OWLPackage.CLASS_EXPRESSION__SUPER_CLASS:
				getSuperClass().clear();
				return;
			case OWLPackage.CLASS_EXPRESSION__DISJOINT_CLASSES:
				getDisjointClasses().clear();
				return;
			case OWLPackage.CLASS_EXPRESSION__EQUIVALENT_CLASSES:
				getEquivalentClasses().clear();
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
			case OWLPackage.CLASS_EXPRESSION__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case OWLPackage.CLASS_EXPRESSION__KEYS:
				return keys != null && !keys.isEmpty();
			case OWLPackage.CLASS_EXPRESSION__SUB_CLASS_OF:
				return subClassOf != null && !subClassOf.isEmpty();
			case OWLPackage.CLASS_EXPRESSION__SUPER_CLASS:
				return superClass != null && !superClass.isEmpty();
			case OWLPackage.CLASS_EXPRESSION__DISJOINT_CLASSES:
				return disjointClasses != null && !disjointClasses.isEmpty();
			case OWLPackage.CLASS_EXPRESSION__EQUIVALENT_CLASSES:
				return equivalentClasses != null && !equivalentClasses.isEmpty();
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
				case OWLPackage.CLASS_EXPRESSION__ANNOTATIONS: return OWLPackage.ANNOTATED_ELEMENT__ANNOTATIONS;
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
				case OWLPackage.ANNOTATED_ELEMENT__ANNOTATIONS: return OWLPackage.CLASS_EXPRESSION__ANNOTATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ClassExpressionImpl
