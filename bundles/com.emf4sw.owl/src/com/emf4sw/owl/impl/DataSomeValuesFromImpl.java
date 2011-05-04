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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import com.emf4sw.owl.DataProperty;
import com.emf4sw.owl.DataRange;
import com.emf4sw.owl.DataSomeValuesFrom;
import com.emf4sw.owl.OWLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Some Values From</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.DataSomeValuesFromImpl#getSomeValuesFrom <em>Some Values From</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.DataSomeValuesFromImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataSomeValuesFromImpl extends DataPropertyRestrictionImpl implements DataSomeValuesFrom {
	/**
	 * The cached value of the '{@link #getSomeValuesFrom() <em>Some Values From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSomeValuesFrom()
	 * @generated
	 * @ordered
	 */
	protected DataRange someValuesFrom;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<DataProperty> properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSomeValuesFromImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.DATA_SOME_VALUES_FROM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRange getSomeValuesFrom() {
		if (someValuesFrom != null && someValuesFrom.eIsProxy()) {
			InternalEObject oldSomeValuesFrom = (InternalEObject)someValuesFrom;
			someValuesFrom = (DataRange)eResolveProxy(oldSomeValuesFrom);
			if (someValuesFrom != oldSomeValuesFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OWLPackage.DATA_SOME_VALUES_FROM__SOME_VALUES_FROM, oldSomeValuesFrom, someValuesFrom));
			}
		}
		return someValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRange basicGetSomeValuesFrom() {
		return someValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSomeValuesFrom(DataRange newSomeValuesFrom) {
		DataRange oldSomeValuesFrom = someValuesFrom;
		someValuesFrom = newSomeValuesFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.DATA_SOME_VALUES_FROM__SOME_VALUES_FROM, oldSomeValuesFrom, someValuesFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectResolvingEList<DataProperty>(DataProperty.class, this, OWLPackage.DATA_SOME_VALUES_FROM__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OWLPackage.DATA_SOME_VALUES_FROM__SOME_VALUES_FROM:
				if (resolve) return getSomeValuesFrom();
				return basicGetSomeValuesFrom();
			case OWLPackage.DATA_SOME_VALUES_FROM__PROPERTIES:
				return getProperties();
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
			case OWLPackage.DATA_SOME_VALUES_FROM__SOME_VALUES_FROM:
				setSomeValuesFrom((DataRange)newValue);
				return;
			case OWLPackage.DATA_SOME_VALUES_FROM__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends DataProperty>)newValue);
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
			case OWLPackage.DATA_SOME_VALUES_FROM__SOME_VALUES_FROM:
				setSomeValuesFrom((DataRange)null);
				return;
			case OWLPackage.DATA_SOME_VALUES_FROM__PROPERTIES:
				getProperties().clear();
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
			case OWLPackage.DATA_SOME_VALUES_FROM__SOME_VALUES_FROM:
				return someValuesFrom != null;
			case OWLPackage.DATA_SOME_VALUES_FROM__PROPERTIES:
				return properties != null && !properties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataSomeValuesFromImpl
