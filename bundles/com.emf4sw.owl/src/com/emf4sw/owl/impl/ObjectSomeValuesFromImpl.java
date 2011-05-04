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
import com.emf4sw.owl.ObjectSomeValuesFrom;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Some Values From</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.ObjectSomeValuesFromImpl#getSomeValuesFrom <em>Some Values From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectSomeValuesFromImpl extends ObjectPropertyRestrictionImpl implements ObjectSomeValuesFrom {
	/**
	 * The cached value of the '{@link #getSomeValuesFrom() <em>Some Values From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSomeValuesFrom()
	 * @generated
	 * @ordered
	 */
	protected ClassExpression someValuesFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectSomeValuesFromImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.OBJECT_SOME_VALUES_FROM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassExpression getSomeValuesFrom() {
		if (someValuesFrom != null && someValuesFrom.eIsProxy()) {
			InternalEObject oldSomeValuesFrom = (InternalEObject)someValuesFrom;
			someValuesFrom = (ClassExpression)eResolveProxy(oldSomeValuesFrom);
			if (someValuesFrom != oldSomeValuesFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OWLPackage.OBJECT_SOME_VALUES_FROM__SOME_VALUES_FROM, oldSomeValuesFrom, someValuesFrom));
			}
		}
		return someValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassExpression basicGetSomeValuesFrom() {
		return someValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSomeValuesFrom(ClassExpression newSomeValuesFrom) {
		ClassExpression oldSomeValuesFrom = someValuesFrom;
		someValuesFrom = newSomeValuesFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_SOME_VALUES_FROM__SOME_VALUES_FROM, oldSomeValuesFrom, someValuesFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OWLPackage.OBJECT_SOME_VALUES_FROM__SOME_VALUES_FROM:
				if (resolve) return getSomeValuesFrom();
				return basicGetSomeValuesFrom();
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
			case OWLPackage.OBJECT_SOME_VALUES_FROM__SOME_VALUES_FROM:
				setSomeValuesFrom((ClassExpression)newValue);
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
			case OWLPackage.OBJECT_SOME_VALUES_FROM__SOME_VALUES_FROM:
				setSomeValuesFrom((ClassExpression)null);
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
			case OWLPackage.OBJECT_SOME_VALUES_FROM__SOME_VALUES_FROM:
				return someValuesFrom != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectSomeValuesFromImpl
