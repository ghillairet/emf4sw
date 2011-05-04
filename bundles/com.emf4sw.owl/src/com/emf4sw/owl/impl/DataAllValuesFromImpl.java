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

import com.emf4sw.owl.DataAllValuesFrom;
import com.emf4sw.owl.DataProperty;
import com.emf4sw.owl.DataRange;
import com.emf4sw.owl.OWLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data All Values From</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.DataAllValuesFromImpl#getAllValuesFrom <em>All Values From</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.DataAllValuesFromImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataAllValuesFromImpl extends DataPropertyRestrictionImpl implements DataAllValuesFrom {
	/**
	 * The cached value of the '{@link #getAllValuesFrom() <em>All Values From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllValuesFrom()
	 * @generated
	 * @ordered
	 */
	protected DataRange allValuesFrom;

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
	protected DataAllValuesFromImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.DATA_ALL_VALUES_FROM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRange getAllValuesFrom() {
		if (allValuesFrom != null && allValuesFrom.eIsProxy()) {
			InternalEObject oldAllValuesFrom = (InternalEObject)allValuesFrom;
			allValuesFrom = (DataRange)eResolveProxy(oldAllValuesFrom);
			if (allValuesFrom != oldAllValuesFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OWLPackage.DATA_ALL_VALUES_FROM__ALL_VALUES_FROM, oldAllValuesFrom, allValuesFrom));
			}
		}
		return allValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRange basicGetAllValuesFrom() {
		return allValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllValuesFrom(DataRange newAllValuesFrom) {
		DataRange oldAllValuesFrom = allValuesFrom;
		allValuesFrom = newAllValuesFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.DATA_ALL_VALUES_FROM__ALL_VALUES_FROM, oldAllValuesFrom, allValuesFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectResolvingEList<DataProperty>(DataProperty.class, this, OWLPackage.DATA_ALL_VALUES_FROM__PROPERTIES);
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
			case OWLPackage.DATA_ALL_VALUES_FROM__ALL_VALUES_FROM:
				if (resolve) return getAllValuesFrom();
				return basicGetAllValuesFrom();
			case OWLPackage.DATA_ALL_VALUES_FROM__PROPERTIES:
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
			case OWLPackage.DATA_ALL_VALUES_FROM__ALL_VALUES_FROM:
				setAllValuesFrom((DataRange)newValue);
				return;
			case OWLPackage.DATA_ALL_VALUES_FROM__PROPERTIES:
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
			case OWLPackage.DATA_ALL_VALUES_FROM__ALL_VALUES_FROM:
				setAllValuesFrom((DataRange)null);
				return;
			case OWLPackage.DATA_ALL_VALUES_FROM__PROPERTIES:
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
			case OWLPackage.DATA_ALL_VALUES_FROM__ALL_VALUES_FROM:
				return allValuesFrom != null;
			case OWLPackage.DATA_ALL_VALUES_FROM__PROPERTIES:
				return properties != null && !properties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataAllValuesFromImpl
