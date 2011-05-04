/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.ObjectExactCardinality;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Exact Cardinality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.ObjectExactCardinalityImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectExactCardinalityImpl#getOnClass <em>On Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectExactCardinalityImpl extends ObjectPropertyRestrictionImpl implements ObjectExactCardinality {
	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final int CARDINALITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected int cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOnClass() <em>On Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnClass()
	 * @generated
	 * @ordered
	 */
	protected ClassExpression onClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectExactCardinalityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.OBJECT_EXACT_CARDINALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(int newCardinality) {
		int oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassExpression getOnClass() {
		if (onClass != null && onClass.eIsProxy()) {
			InternalEObject oldOnClass = (InternalEObject)onClass;
			onClass = (ClassExpression)eResolveProxy(oldOnClass);
			if (onClass != oldOnClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OWLPackage.OBJECT_EXACT_CARDINALITY__ON_CLASS, oldOnClass, onClass));
			}
		}
		return onClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassExpression basicGetOnClass() {
		return onClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnClass(ClassExpression newOnClass) {
		ClassExpression oldOnClass = onClass;
		onClass = newOnClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_EXACT_CARDINALITY__ON_CLASS, oldOnClass, onClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OWLPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY:
				return getCardinality();
			case OWLPackage.OBJECT_EXACT_CARDINALITY__ON_CLASS:
				if (resolve) return getOnClass();
				return basicGetOnClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OWLPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY:
				setCardinality((Integer)newValue);
				return;
			case OWLPackage.OBJECT_EXACT_CARDINALITY__ON_CLASS:
				setOnClass((ClassExpression)newValue);
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
			case OWLPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case OWLPackage.OBJECT_EXACT_CARDINALITY__ON_CLASS:
				setOnClass((ClassExpression)null);
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
			case OWLPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case OWLPackage.OBJECT_EXACT_CARDINALITY__ON_CLASS:
				return onClass != null;
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
//		result.append(" (cardinality: ");
//		result.append(cardinality);
//		result.append(')');
//		return result.toString();
	}

} //ObjectExactCardinalityImpl
