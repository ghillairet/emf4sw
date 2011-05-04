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
import com.emf4sw.owl.ClassProperty;
import com.emf4sw.owl.OWLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.ClassPropertyImpl#getIsFunctional <em>Is Functional</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ClassPropertyImpl#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ClassPropertyImpl extends OWLPropertyImpl implements ClassProperty {
	/**
	 * The default value of the '{@link #getIsFunctional() <em>Is Functional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFunctional()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_FUNCTIONAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsFunctional() <em>Is Functional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFunctional()
	 * @generated
	 * @ordered
	 */
	protected Boolean isFunctional = IS_FUNCTIONAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassExpression> domain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.CLASS_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsFunctional() {
		return isFunctional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFunctional(Boolean newIsFunctional) {
		Boolean oldIsFunctional = isFunctional;
		isFunctional = newIsFunctional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.CLASS_PROPERTY__IS_FUNCTIONAL, oldIsFunctional, isFunctional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassExpression> getDomain() {
		if (domain == null) {
			domain = new EObjectResolvingEList<ClassExpression>(ClassExpression.class, this, OWLPackage.CLASS_PROPERTY__DOMAIN);
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OWLPackage.CLASS_PROPERTY__IS_FUNCTIONAL:
				return getIsFunctional();
			case OWLPackage.CLASS_PROPERTY__DOMAIN:
				return getDomain();
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
			case OWLPackage.CLASS_PROPERTY__IS_FUNCTIONAL:
				setIsFunctional((Boolean)newValue);
				return;
			case OWLPackage.CLASS_PROPERTY__DOMAIN:
				getDomain().clear();
				getDomain().addAll((Collection<? extends ClassExpression>)newValue);
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
			case OWLPackage.CLASS_PROPERTY__IS_FUNCTIONAL:
				setIsFunctional(IS_FUNCTIONAL_EDEFAULT);
				return;
			case OWLPackage.CLASS_PROPERTY__DOMAIN:
				getDomain().clear();
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
			case OWLPackage.CLASS_PROPERTY__IS_FUNCTIONAL:
				return IS_FUNCTIONAL_EDEFAULT == null ? isFunctional != null : !IS_FUNCTIONAL_EDEFAULT.equals(isFunctional);
			case OWLPackage.CLASS_PROPERTY__DOMAIN:
				return domain != null && !domain.isEmpty();
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
//		result.append(" (isFunctional: ");
//		result.append(isFunctional);
//		result.append(')');
//		return result.toString();
	}

} //ClassPropertyImpl
