/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;

import org.eclipse.emf.common.util.EList;

import com.emf4sw.rdf.Literal;
import com.emf4sw.rdf.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.Individual#getSameAs <em>Same As</em>}</li>
 *   <li>{@link com.emf4sw.owl.Individual#getDifferentFrom <em>Different From</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getIndividual()
 * @model
 * @generated
 */
public interface Individual extends Resource {
	/**
	 * Returns the value of the '<em><b>Same As</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.owl.Individual}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Same As</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Same As</em>' reference list.
	 * @see com.emf4sw.owl.OWLPackage#getIndividual_SameAs()
	 * @model
	 * @generated
	 */
	EList<Individual> getSameAs();

	/**
	 * Returns the value of the '<em><b>Different From</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.owl.Individual}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Different From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Different From</em>' reference list.
	 * @see com.emf4sw.owl.OWLPackage#getIndividual_DifferentFrom()
	 * @model
	 * @generated
	 */
	EList<Individual> getDifferentFrom();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ClassExpression> getClasses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addObjectValue(ObjectProperty property, Individual value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valuesMany="true"
	 * @generated
	 */
	void addObjectValues(ObjectProperty property, EList<Individual> values);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addDataValue(DataProperty property, Literal value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valuesMany="true"
	 * @generated
	 */
	void addDataValues(DataProperty property, EList<Literal> values);

} // Individual
