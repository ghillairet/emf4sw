/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.ObjectProperty;
import com.emf4sw.owl.impl.notify.ClassPropertyTripleAdapter.ObjectPropertyTripleAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.ObjectPropertyImpl#getIsInverseFunctional <em>Is Inverse Functional</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectPropertyImpl#getIsSymmetric <em>Is Symmetric</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectPropertyImpl#getIsAsymmetric <em>Is Asymmetric</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectPropertyImpl#getIsTransitive <em>Is Transitive</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectPropertyImpl#getIsReflexive <em>Is Reflexive</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectPropertyImpl#getIsIrreflexive <em>Is Irreflexive</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectPropertyImpl#getInverseOf <em>Inverse Of</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectPropertyImpl#getRange <em>Range</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectPropertyImpl#getEquivalentProperties <em>Equivalent Properties</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectPropertyImpl#getSubPropertyOf <em>Sub Property Of</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectPropertyImpl#getDisjointProperties <em>Disjoint Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectPropertyImpl extends ClassPropertyImpl implements ObjectProperty {
	/**
	 * The default value of the '{@link #getIsInverseFunctional() <em>Is Inverse Functional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInverseFunctional()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_INVERSE_FUNCTIONAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsInverseFunctional() <em>Is Inverse Functional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInverseFunctional()
	 * @generated
	 * @ordered
	 */
	protected Boolean isInverseFunctional = IS_INVERSE_FUNCTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsSymmetric() <em>Is Symmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSymmetric()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SYMMETRIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsSymmetric() <em>Is Symmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSymmetric()
	 * @generated
	 * @ordered
	 */
	protected Boolean isSymmetric = IS_SYMMETRIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsAsymmetric() <em>Is Asymmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAsymmetric()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ASYMMETRIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsAsymmetric() <em>Is Asymmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAsymmetric()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAsymmetric = IS_ASYMMETRIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsTransitive() <em>Is Transitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTransitive()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_TRANSITIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsTransitive() <em>Is Transitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTransitive()
	 * @generated
	 * @ordered
	 */
	protected Boolean isTransitive = IS_TRANSITIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsReflexive() <em>Is Reflexive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReflexive()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_REFLEXIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsReflexive() <em>Is Reflexive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReflexive()
	 * @generated
	 * @ordered
	 */
	protected Boolean isReflexive = IS_REFLEXIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsIrreflexive() <em>Is Irreflexive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsIrreflexive()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_IRREFLEXIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsIrreflexive() <em>Is Irreflexive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsIrreflexive()
	 * @generated
	 * @ordered
	 */
	protected Boolean isIrreflexive = IS_IRREFLEXIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInverseOf() <em>Inverse Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseOf()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectProperty> inverseOf;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassExpression> range;

	/**
	 * The cached value of the '{@link #getEquivalentProperties() <em>Equivalent Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectProperty> equivalentProperties;

	/**
	 * The cached value of the '{@link #getSubPropertyOf() <em>Sub Property Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPropertyOf()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectProperty> subPropertyOf;

	/**
	 * The cached value of the '{@link #getDisjointProperties() <em>Disjoint Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjointProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectProperty> disjointProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ObjectPropertyImpl() {
		super();
		eAdapters().add(new ObjectPropertyTripleAdapter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.OBJECT_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsInverseFunctional() {
		return isInverseFunctional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInverseFunctional(Boolean newIsInverseFunctional) {
		Boolean oldIsInverseFunctional = isInverseFunctional;
		isInverseFunctional = newIsInverseFunctional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_PROPERTY__IS_INVERSE_FUNCTIONAL, oldIsInverseFunctional, isInverseFunctional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsSymmetric() {
		return isSymmetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSymmetric(Boolean newIsSymmetric) {
		Boolean oldIsSymmetric = isSymmetric;
		isSymmetric = newIsSymmetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_PROPERTY__IS_SYMMETRIC, oldIsSymmetric, isSymmetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAsymmetric() {
		return isAsymmetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAsymmetric(Boolean newIsAsymmetric) {
		Boolean oldIsAsymmetric = isAsymmetric;
		isAsymmetric = newIsAsymmetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_PROPERTY__IS_ASYMMETRIC, oldIsAsymmetric, isAsymmetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsTransitive() {
		return isTransitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTransitive(Boolean newIsTransitive) {
		Boolean oldIsTransitive = isTransitive;
		isTransitive = newIsTransitive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_PROPERTY__IS_TRANSITIVE, oldIsTransitive, isTransitive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsReflexive() {
		return isReflexive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReflexive(Boolean newIsReflexive) {
		Boolean oldIsReflexive = isReflexive;
		isReflexive = newIsReflexive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_PROPERTY__IS_REFLEXIVE, oldIsReflexive, isReflexive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsIrreflexive() {
		return isIrreflexive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIrreflexive(Boolean newIsIrreflexive) {
		Boolean oldIsIrreflexive = isIrreflexive;
		isIrreflexive = newIsIrreflexive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_PROPERTY__IS_IRREFLEXIVE, oldIsIrreflexive, isIrreflexive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectProperty> getInverseOf() {
		if (inverseOf == null) {
			inverseOf = new EObjectResolvingEList<ObjectProperty>(ObjectProperty.class, this, OWLPackage.OBJECT_PROPERTY__INVERSE_OF);
		}
		return inverseOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassExpression> getRange() {
		if (range == null) {
			range = new EObjectResolvingEList<ClassExpression>(ClassExpression.class, this, OWLPackage.OBJECT_PROPERTY__RANGE);
		}
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectProperty> getEquivalentProperties() {
		if (equivalentProperties == null) {
			equivalentProperties = new EObjectResolvingEList<ObjectProperty>(ObjectProperty.class, this, OWLPackage.OBJECT_PROPERTY__EQUIVALENT_PROPERTIES);
		}
		return equivalentProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectProperty> getSubPropertyOf() {
		if (subPropertyOf == null) {
			subPropertyOf = new EObjectResolvingEList<ObjectProperty>(ObjectProperty.class, this, OWLPackage.OBJECT_PROPERTY__SUB_PROPERTY_OF);
		}
		return subPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectProperty> getDisjointProperties() {
		if (disjointProperties == null) {
			disjointProperties = new EObjectResolvingEList<ObjectProperty>(ObjectProperty.class, this, OWLPackage.OBJECT_PROPERTY__DISJOINT_PROPERTIES);
		}
		return disjointProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OWLPackage.OBJECT_PROPERTY__IS_INVERSE_FUNCTIONAL:
				return getIsInverseFunctional();
			case OWLPackage.OBJECT_PROPERTY__IS_SYMMETRIC:
				return getIsSymmetric();
			case OWLPackage.OBJECT_PROPERTY__IS_ASYMMETRIC:
				return getIsAsymmetric();
			case OWLPackage.OBJECT_PROPERTY__IS_TRANSITIVE:
				return getIsTransitive();
			case OWLPackage.OBJECT_PROPERTY__IS_REFLEXIVE:
				return getIsReflexive();
			case OWLPackage.OBJECT_PROPERTY__IS_IRREFLEXIVE:
				return getIsIrreflexive();
			case OWLPackage.OBJECT_PROPERTY__INVERSE_OF:
				return getInverseOf();
			case OWLPackage.OBJECT_PROPERTY__RANGE:
				return getRange();
			case OWLPackage.OBJECT_PROPERTY__EQUIVALENT_PROPERTIES:
				return getEquivalentProperties();
			case OWLPackage.OBJECT_PROPERTY__SUB_PROPERTY_OF:
				return getSubPropertyOf();
			case OWLPackage.OBJECT_PROPERTY__DISJOINT_PROPERTIES:
				return getDisjointProperties();
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
			case OWLPackage.OBJECT_PROPERTY__IS_INVERSE_FUNCTIONAL:
				setIsInverseFunctional((Boolean)newValue);
				return;
			case OWLPackage.OBJECT_PROPERTY__IS_SYMMETRIC:
				setIsSymmetric((Boolean)newValue);
				return;
			case OWLPackage.OBJECT_PROPERTY__IS_ASYMMETRIC:
				setIsAsymmetric((Boolean)newValue);
				return;
			case OWLPackage.OBJECT_PROPERTY__IS_TRANSITIVE:
				setIsTransitive((Boolean)newValue);
				return;
			case OWLPackage.OBJECT_PROPERTY__IS_REFLEXIVE:
				setIsReflexive((Boolean)newValue);
				return;
			case OWLPackage.OBJECT_PROPERTY__IS_IRREFLEXIVE:
				setIsIrreflexive((Boolean)newValue);
				return;
			case OWLPackage.OBJECT_PROPERTY__INVERSE_OF:
				getInverseOf().clear();
				getInverseOf().addAll((Collection<? extends ObjectProperty>)newValue);
				return;
			case OWLPackage.OBJECT_PROPERTY__RANGE:
				getRange().clear();
				getRange().addAll((Collection<? extends ClassExpression>)newValue);
				return;
			case OWLPackage.OBJECT_PROPERTY__EQUIVALENT_PROPERTIES:
				getEquivalentProperties().clear();
				getEquivalentProperties().addAll((Collection<? extends ObjectProperty>)newValue);
				return;
			case OWLPackage.OBJECT_PROPERTY__SUB_PROPERTY_OF:
				getSubPropertyOf().clear();
				getSubPropertyOf().addAll((Collection<? extends ObjectProperty>)newValue);
				return;
			case OWLPackage.OBJECT_PROPERTY__DISJOINT_PROPERTIES:
				getDisjointProperties().clear();
				getDisjointProperties().addAll((Collection<? extends ObjectProperty>)newValue);
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
			case OWLPackage.OBJECT_PROPERTY__IS_INVERSE_FUNCTIONAL:
				setIsInverseFunctional(IS_INVERSE_FUNCTIONAL_EDEFAULT);
				return;
			case OWLPackage.OBJECT_PROPERTY__IS_SYMMETRIC:
				setIsSymmetric(IS_SYMMETRIC_EDEFAULT);
				return;
			case OWLPackage.OBJECT_PROPERTY__IS_ASYMMETRIC:
				setIsAsymmetric(IS_ASYMMETRIC_EDEFAULT);
				return;
			case OWLPackage.OBJECT_PROPERTY__IS_TRANSITIVE:
				setIsTransitive(IS_TRANSITIVE_EDEFAULT);
				return;
			case OWLPackage.OBJECT_PROPERTY__IS_REFLEXIVE:
				setIsReflexive(IS_REFLEXIVE_EDEFAULT);
				return;
			case OWLPackage.OBJECT_PROPERTY__IS_IRREFLEXIVE:
				setIsIrreflexive(IS_IRREFLEXIVE_EDEFAULT);
				return;
			case OWLPackage.OBJECT_PROPERTY__INVERSE_OF:
				getInverseOf().clear();
				return;
			case OWLPackage.OBJECT_PROPERTY__RANGE:
				getRange().clear();
				return;
			case OWLPackage.OBJECT_PROPERTY__EQUIVALENT_PROPERTIES:
				getEquivalentProperties().clear();
				return;
			case OWLPackage.OBJECT_PROPERTY__SUB_PROPERTY_OF:
				getSubPropertyOf().clear();
				return;
			case OWLPackage.OBJECT_PROPERTY__DISJOINT_PROPERTIES:
				getDisjointProperties().clear();
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
			case OWLPackage.OBJECT_PROPERTY__IS_INVERSE_FUNCTIONAL:
				return IS_INVERSE_FUNCTIONAL_EDEFAULT == null ? isInverseFunctional != null : !IS_INVERSE_FUNCTIONAL_EDEFAULT.equals(isInverseFunctional);
			case OWLPackage.OBJECT_PROPERTY__IS_SYMMETRIC:
				return IS_SYMMETRIC_EDEFAULT == null ? isSymmetric != null : !IS_SYMMETRIC_EDEFAULT.equals(isSymmetric);
			case OWLPackage.OBJECT_PROPERTY__IS_ASYMMETRIC:
				return IS_ASYMMETRIC_EDEFAULT == null ? isAsymmetric != null : !IS_ASYMMETRIC_EDEFAULT.equals(isAsymmetric);
			case OWLPackage.OBJECT_PROPERTY__IS_TRANSITIVE:
				return IS_TRANSITIVE_EDEFAULT == null ? isTransitive != null : !IS_TRANSITIVE_EDEFAULT.equals(isTransitive);
			case OWLPackage.OBJECT_PROPERTY__IS_REFLEXIVE:
				return IS_REFLEXIVE_EDEFAULT == null ? isReflexive != null : !IS_REFLEXIVE_EDEFAULT.equals(isReflexive);
			case OWLPackage.OBJECT_PROPERTY__IS_IRREFLEXIVE:
				return IS_IRREFLEXIVE_EDEFAULT == null ? isIrreflexive != null : !IS_IRREFLEXIVE_EDEFAULT.equals(isIrreflexive);
			case OWLPackage.OBJECT_PROPERTY__INVERSE_OF:
				return inverseOf != null && !inverseOf.isEmpty();
			case OWLPackage.OBJECT_PROPERTY__RANGE:
				return range != null && !range.isEmpty();
			case OWLPackage.OBJECT_PROPERTY__EQUIVALENT_PROPERTIES:
				return equivalentProperties != null && !equivalentProperties.isEmpty();
			case OWLPackage.OBJECT_PROPERTY__SUB_PROPERTY_OF:
				return subPropertyOf != null && !subPropertyOf.isEmpty();
			case OWLPackage.OBJECT_PROPERTY__DISJOINT_PROPERTIES:
				return disjointProperties != null && !disjointProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
//		if (eIsProxy()) 
		return super.toString();

//		StringBuffer result = new StringBuffer(super.toString());
//		result.append(" (isInverseFunctional: ");
//		result.append(isInverseFunctional);
//		result.append(", isSymmetric: ");
//		result.append(isSymmetric);
//		result.append(", isAsymmetric: ");
//		result.append(isAsymmetric);
//		result.append(", isTransitive: ");
//		result.append(isTransitive);
//		result.append(", isReflexive: ");
//		result.append(isReflexive);
//		result.append(", isIrreflexive: ");
//		result.append(isIrreflexive);
//		result.append(')');
//		return result.toString();
	}

} //ObjectPropertyImpl
