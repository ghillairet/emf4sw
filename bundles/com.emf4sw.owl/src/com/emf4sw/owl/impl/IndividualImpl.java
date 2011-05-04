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

import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.DataProperty;
import com.emf4sw.owl.Individual;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.ObjectProperty;
import com.emf4sw.rdf.Literal;
import com.emf4sw.rdf.impl.ResourceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.IndividualImpl#getSameAs <em>Same As</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.IndividualImpl#getDifferentFrom <em>Different From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndividualImpl extends ResourceImpl implements Individual {
	/**
	 * The cached value of the '{@link #getSameAs() <em>Same As</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSameAs()
	 * @generated
	 * @ordered
	 */
	protected EList<Individual> sameAs;

	/**
	 * The cached value of the '{@link #getDifferentFrom() <em>Different From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifferentFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Individual> differentFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.INDIVIDUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Individual> getSameAs() {
		if (sameAs == null) {
			sameAs = new EObjectResolvingEList<Individual>(Individual.class, this, OWLPackage.INDIVIDUAL__SAME_AS);
		}
		return sameAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Individual> getDifferentFrom() {
		if (differentFrom == null) {
			differentFrom = new EObjectResolvingEList<Individual>(Individual.class, this, OWLPackage.INDIVIDUAL__DIFFERENT_FROM);
		}
		return differentFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassExpression> getClasses() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addObjectValue(ObjectProperty property, Individual value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addObjectValues(ObjectProperty property, EList<Individual> values) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addDataValue(DataProperty property, Literal value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addDataValues(DataProperty property, EList<Literal> values) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OWLPackage.INDIVIDUAL__SAME_AS:
				return getSameAs();
			case OWLPackage.INDIVIDUAL__DIFFERENT_FROM:
				return getDifferentFrom();
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
			case OWLPackage.INDIVIDUAL__SAME_AS:
				getSameAs().clear();
				getSameAs().addAll((Collection<? extends Individual>)newValue);
				return;
			case OWLPackage.INDIVIDUAL__DIFFERENT_FROM:
				getDifferentFrom().clear();
				getDifferentFrom().addAll((Collection<? extends Individual>)newValue);
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
			case OWLPackage.INDIVIDUAL__SAME_AS:
				getSameAs().clear();
				return;
			case OWLPackage.INDIVIDUAL__DIFFERENT_FROM:
				getDifferentFrom().clear();
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
			case OWLPackage.INDIVIDUAL__SAME_AS:
				return sameAs != null && !sameAs.isEmpty();
			case OWLPackage.INDIVIDUAL__DIFFERENT_FROM:
				return differentFrom != null && !differentFrom.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IndividualImpl
