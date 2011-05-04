/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.ObjectProperty#getIsInverseFunctional <em>Is Inverse Functional</em>}</li>
 *   <li>{@link com.emf4sw.owl.ObjectProperty#getIsSymmetric <em>Is Symmetric</em>}</li>
 *   <li>{@link com.emf4sw.owl.ObjectProperty#getIsAsymmetric <em>Is Asymmetric</em>}</li>
 *   <li>{@link com.emf4sw.owl.ObjectProperty#getIsTransitive <em>Is Transitive</em>}</li>
 *   <li>{@link com.emf4sw.owl.ObjectProperty#getIsReflexive <em>Is Reflexive</em>}</li>
 *   <li>{@link com.emf4sw.owl.ObjectProperty#getIsIrreflexive <em>Is Irreflexive</em>}</li>
 *   <li>{@link com.emf4sw.owl.ObjectProperty#getInverseOf <em>Inverse Of</em>}</li>
 *   <li>{@link com.emf4sw.owl.ObjectProperty#getRange <em>Range</em>}</li>
 *   <li>{@link com.emf4sw.owl.ObjectProperty#getEquivalentProperties <em>Equivalent Properties</em>}</li>
 *   <li>{@link com.emf4sw.owl.ObjectProperty#getSubPropertyOf <em>Sub Property Of</em>}</li>
 *   <li>{@link com.emf4sw.owl.ObjectProperty#getDisjointProperties <em>Disjoint Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getObjectProperty()
 * @model annotation="emf4sw.OWLClass uri='http://www.w3.org/2002/07/owl#ObjectProperty'"
 * @generated
 */
public interface ObjectProperty extends ClassProperty {
	/**
	 * Returns the value of the '<em><b>Is Inverse Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Inverse Functional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Inverse Functional</em>' attribute.
	 * @see #setIsInverseFunctional(Boolean)
	 * @see com.emf4sw.owl.OWLPackage#getObjectProperty_IsInverseFunctional()
	 * @model
	 * @generated
	 */
	Boolean getIsInverseFunctional();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.ObjectProperty#getIsInverseFunctional <em>Is Inverse Functional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Inverse Functional</em>' attribute.
	 * @see #getIsInverseFunctional()
	 * @generated
	 */
	void setIsInverseFunctional(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Symmetric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Symmetric</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Symmetric</em>' attribute.
	 * @see #setIsSymmetric(Boolean)
	 * @see com.emf4sw.owl.OWLPackage#getObjectProperty_IsSymmetric()
	 * @model
	 * @generated
	 */
	Boolean getIsSymmetric();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.ObjectProperty#getIsSymmetric <em>Is Symmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Symmetric</em>' attribute.
	 * @see #getIsSymmetric()
	 * @generated
	 */
	void setIsSymmetric(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Asymmetric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Asymmetric</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Asymmetric</em>' attribute.
	 * @see #setIsAsymmetric(Boolean)
	 * @see com.emf4sw.owl.OWLPackage#getObjectProperty_IsAsymmetric()
	 * @model
	 * @generated
	 */
	Boolean getIsAsymmetric();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.ObjectProperty#getIsAsymmetric <em>Is Asymmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Asymmetric</em>' attribute.
	 * @see #getIsAsymmetric()
	 * @generated
	 */
	void setIsAsymmetric(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Transitive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Transitive</em>' attribute.
	 * @see #setIsTransitive(Boolean)
	 * @see com.emf4sw.owl.OWLPackage#getObjectProperty_IsTransitive()
	 * @model
	 * @generated
	 */
	Boolean getIsTransitive();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.ObjectProperty#getIsTransitive <em>Is Transitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Transitive</em>' attribute.
	 * @see #getIsTransitive()
	 * @generated
	 */
	void setIsTransitive(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Reflexive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Reflexive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Reflexive</em>' attribute.
	 * @see #setIsReflexive(Boolean)
	 * @see com.emf4sw.owl.OWLPackage#getObjectProperty_IsReflexive()
	 * @model
	 * @generated
	 */
	Boolean getIsReflexive();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.ObjectProperty#getIsReflexive <em>Is Reflexive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reflexive</em>' attribute.
	 * @see #getIsReflexive()
	 * @generated
	 */
	void setIsReflexive(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Irreflexive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Irreflexive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Irreflexive</em>' attribute.
	 * @see #setIsIrreflexive(Boolean)
	 * @see com.emf4sw.owl.OWLPackage#getObjectProperty_IsIrreflexive()
	 * @model
	 * @generated
	 */
	Boolean getIsIrreflexive();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.ObjectProperty#getIsIrreflexive <em>Is Irreflexive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Irreflexive</em>' attribute.
	 * @see #getIsIrreflexive()
	 * @generated
	 */
	void setIsIrreflexive(Boolean value);

	/**
	 * Returns the value of the '<em><b>Inverse Of</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.owl.ObjectProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverse Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse Of</em>' reference list.
	 * @see com.emf4sw.owl.OWLPackage#getObjectProperty_InverseOf()
	 * @model
	 * @generated
	 */
	EList<ObjectProperty> getInverseOf();

	/**
	 * Returns the value of the '<em><b>Range</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.owl.ClassExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' reference list.
	 * @see com.emf4sw.owl.OWLPackage#getObjectProperty_Range()
	 * @model annotation="emf4sw.OWLClass uri='http://www.w3.org/2000/01/rdf-schema#range'"
	 * @generated
	 */
	EList<ClassExpression> getRange();

	/**
	 * Returns the value of the '<em><b>Equivalent Properties</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.owl.ObjectProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent Properties</em>' reference list.
	 * @see com.emf4sw.owl.OWLPackage#getObjectProperty_EquivalentProperties()
	 * @model
	 * @generated
	 */
	EList<ObjectProperty> getEquivalentProperties();

	/**
	 * Returns the value of the '<em><b>Sub Property Of</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.owl.ObjectProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Property Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Property Of</em>' reference list.
	 * @see com.emf4sw.owl.OWLPackage#getObjectProperty_SubPropertyOf()
	 * @model
	 * @generated
	 */
	EList<ObjectProperty> getSubPropertyOf();

	/**
	 * Returns the value of the '<em><b>Disjoint Properties</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.owl.ObjectProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disjoint Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disjoint Properties</em>' reference list.
	 * @see com.emf4sw.owl.OWLPackage#getObjectProperty_DisjointProperties()
	 * @model
	 * @generated
	 */
	EList<ObjectProperty> getDisjointProperties();

} // ObjectProperty
