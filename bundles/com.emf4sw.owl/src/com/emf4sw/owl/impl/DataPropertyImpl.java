/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import com.emf4sw.owl.DataProperty;
import com.emf4sw.owl.DataRange;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.impl.notify.ClassPropertyTripleAdapter.DataPropertyTripleAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.DataPropertyImpl#getRange <em>Range</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.DataPropertyImpl#getEquivalentProperties <em>Equivalent Properties</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.DataPropertyImpl#getSubPropertyOf <em>Sub Property Of</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.DataPropertyImpl#getDisjointProperties <em>Disjoint Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPropertyImpl extends ClassPropertyImpl implements DataProperty {
	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRange> range;

	/**
	 * The cached value of the '{@link #getEquivalentProperties() <em>Equivalent Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<DataProperty> equivalentProperties;

	/**
	 * The cached value of the '{@link #getSubPropertyOf() <em>Sub Property Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPropertyOf()
	 * @generated
	 * @ordered
	 */
	protected EList<DataProperty> subPropertyOf;

	/**
	 * The cached value of the '{@link #getDisjointProperties() <em>Disjoint Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjointProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<DataProperty> disjointProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected DataPropertyImpl() {
		super();
		eAdapters().add(new DataPropertyTripleAdapter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.DATA_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataRange> getRange() {
		if (range == null) {
			range = new EObjectResolvingEList<DataRange>(DataRange.class, this, OWLPackage.DATA_PROPERTY__RANGE);
		}
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataProperty> getEquivalentProperties() {
		if (equivalentProperties == null) {
			equivalentProperties = new EObjectResolvingEList<DataProperty>(DataProperty.class, this, OWLPackage.DATA_PROPERTY__EQUIVALENT_PROPERTIES);
		}
		return equivalentProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataProperty> getSubPropertyOf() {
		if (subPropertyOf == null) {
			subPropertyOf = new EObjectResolvingEList<DataProperty>(DataProperty.class, this, OWLPackage.DATA_PROPERTY__SUB_PROPERTY_OF);
		}
		return subPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataProperty> getDisjointProperties() {
		if (disjointProperties == null) {
			disjointProperties = new EObjectResolvingEList<DataProperty>(DataProperty.class, this, OWLPackage.DATA_PROPERTY__DISJOINT_PROPERTIES);
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
			case OWLPackage.DATA_PROPERTY__RANGE:
				return getRange();
			case OWLPackage.DATA_PROPERTY__EQUIVALENT_PROPERTIES:
				return getEquivalentProperties();
			case OWLPackage.DATA_PROPERTY__SUB_PROPERTY_OF:
				return getSubPropertyOf();
			case OWLPackage.DATA_PROPERTY__DISJOINT_PROPERTIES:
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
			case OWLPackage.DATA_PROPERTY__RANGE:
				getRange().clear();
				getRange().addAll((Collection<? extends DataRange>)newValue);
				return;
			case OWLPackage.DATA_PROPERTY__EQUIVALENT_PROPERTIES:
				getEquivalentProperties().clear();
				getEquivalentProperties().addAll((Collection<? extends DataProperty>)newValue);
				return;
			case OWLPackage.DATA_PROPERTY__SUB_PROPERTY_OF:
				getSubPropertyOf().clear();
				getSubPropertyOf().addAll((Collection<? extends DataProperty>)newValue);
				return;
			case OWLPackage.DATA_PROPERTY__DISJOINT_PROPERTIES:
				getDisjointProperties().clear();
				getDisjointProperties().addAll((Collection<? extends DataProperty>)newValue);
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
			case OWLPackage.DATA_PROPERTY__RANGE:
				getRange().clear();
				return;
			case OWLPackage.DATA_PROPERTY__EQUIVALENT_PROPERTIES:
				getEquivalentProperties().clear();
				return;
			case OWLPackage.DATA_PROPERTY__SUB_PROPERTY_OF:
				getSubPropertyOf().clear();
				return;
			case OWLPackage.DATA_PROPERTY__DISJOINT_PROPERTIES:
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
			case OWLPackage.DATA_PROPERTY__RANGE:
				return range != null && !range.isEmpty();
			case OWLPackage.DATA_PROPERTY__EQUIVALENT_PROPERTIES:
				return equivalentProperties != null && !equivalentProperties.isEmpty();
			case OWLPackage.DATA_PROPERTY__SUB_PROPERTY_OF:
				return subPropertyOf != null && !subPropertyOf.isEmpty();
			case OWLPackage.DATA_PROPERTY__DISJOINT_PROPERTIES:
				return disjointProperties != null && !disjointProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataPropertyImpl
