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
import com.emf4sw.owl.ObjectAllValuesFrom;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object All Values From</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.ObjectAllValuesFromImpl#getAllValuesFrom <em>All Values From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectAllValuesFromImpl extends ObjectPropertyRestrictionImpl implements ObjectAllValuesFrom {
	/**
	 * The cached value of the '{@link #getAllValuesFrom() <em>All Values From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllValuesFrom()
	 * @generated
	 * @ordered
	 */
	protected ClassExpression allValuesFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectAllValuesFromImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.OBJECT_ALL_VALUES_FROM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassExpression getAllValuesFrom() {
		if (allValuesFrom != null && allValuesFrom.eIsProxy()) {
			InternalEObject oldAllValuesFrom = (InternalEObject)allValuesFrom;
			allValuesFrom = (ClassExpression)eResolveProxy(oldAllValuesFrom);
			if (allValuesFrom != oldAllValuesFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OWLPackage.OBJECT_ALL_VALUES_FROM__ALL_VALUES_FROM, oldAllValuesFrom, allValuesFrom));
			}
		}
		return allValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassExpression basicGetAllValuesFrom() {
		return allValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllValuesFrom(ClassExpression newAllValuesFrom) {
		ClassExpression oldAllValuesFrom = allValuesFrom;
		allValuesFrom = newAllValuesFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_ALL_VALUES_FROM__ALL_VALUES_FROM, oldAllValuesFrom, allValuesFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OWLPackage.OBJECT_ALL_VALUES_FROM__ALL_VALUES_FROM:
				if (resolve) return getAllValuesFrom();
				return basicGetAllValuesFrom();
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
			case OWLPackage.OBJECT_ALL_VALUES_FROM__ALL_VALUES_FROM:
				setAllValuesFrom((ClassExpression)newValue);
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
			case OWLPackage.OBJECT_ALL_VALUES_FROM__ALL_VALUES_FROM:
				setAllValuesFrom((ClassExpression)null);
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
			case OWLPackage.OBJECT_ALL_VALUES_FROM__ALL_VALUES_FROM:
				return allValuesFrom != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectAllValuesFromImpl
