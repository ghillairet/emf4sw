/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;

import org.eclipse.emf.common.util.EList;

import com.emf4sw.rdf.SubjectNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.ClassExpression#getKeys <em>Keys</em>}</li>
 *   <li>{@link com.emf4sw.owl.ClassExpression#getSubClassOf <em>Sub Class Of</em>}</li>
 *   <li>{@link com.emf4sw.owl.ClassExpression#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link com.emf4sw.owl.ClassExpression#getDisjointClasses <em>Disjoint Classes</em>}</li>
 *   <li>{@link com.emf4sw.owl.ClassExpression#getEquivalentClasses <em>Equivalent Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getClassExpression()
 * @model abstract="true"
 * @generated
 */
public interface ClassExpression extends SubjectNode, AnnotatedElement {
	/**
	 * Returns the value of the '<em><b>Keys</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.owl.OWLProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' reference list.
	 * @see com.emf4sw.owl.OWLPackage#getClassExpression_Keys()
	 * @model
	 * @generated
	 */
	EList<OWLProperty> getKeys();

	/**
	 * Returns the value of the '<em><b>Sub Class Of</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.owl.ClassExpression}.
	 * It is bidirectional and its opposite is '{@link com.emf4sw.owl.ClassExpression#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Class Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Class Of</em>' reference list.
	 * @see com.emf4sw.owl.OWLPackage#getClassExpression_SubClassOf()
	 * @see com.emf4sw.owl.ClassExpression#getSuperClass
	 * @model opposite="superClass"
	 * @generated
	 */
	EList<ClassExpression> getSubClassOf();

	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.owl.ClassExpression}.
	 * It is bidirectional and its opposite is '{@link com.emf4sw.owl.ClassExpression#getSubClassOf <em>Sub Class Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' reference list.
	 * @see com.emf4sw.owl.OWLPackage#getClassExpression_SuperClass()
	 * @see com.emf4sw.owl.ClassExpression#getSubClassOf
	 * @model opposite="subClassOf"
	 * @generated
	 */
	EList<ClassExpression> getSuperClass();

	/**
	 * Returns the value of the '<em><b>Disjoint Classes</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.owl.ClassExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disjoint Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disjoint Classes</em>' reference list.
	 * @see com.emf4sw.owl.OWLPackage#getClassExpression_DisjointClasses()
	 * @model
	 * @generated
	 */
	EList<ClassExpression> getDisjointClasses();

	/**
	 * Returns the value of the '<em><b>Equivalent Classes</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.owl.ClassExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent Classes</em>' reference list.
	 * @see com.emf4sw.owl.OWLPackage#getClassExpression_EquivalentClasses()
	 * @model
	 * @generated
	 */
	EList<ClassExpression> getEquivalentClasses();

} // ClassExpression
