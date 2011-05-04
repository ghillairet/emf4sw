/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Max Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.DataMaxCardinality#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link com.emf4sw.owl.DataMaxCardinality#getDataRange <em>Data Range</em>}</li>
 *   <li>{@link com.emf4sw.owl.DataMaxCardinality#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getDataMaxCardinality()
 * @model
 * @generated
 */
public interface DataMaxCardinality extends DataPropertyRestriction {
	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(int)
	 * @see com.emf4sw.owl.OWLPackage#getDataMaxCardinality_Cardinality()
	 * @model annotation="emf4sw.OWLClass uri='http://www.w3.org/2002/07/owl#maxCardinality'"
	 * @generated
	 */
	int getCardinality();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DataMaxCardinality#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(int value);

	/**
	 * Returns the value of the '<em><b>Data Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Range</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Range</em>' reference.
	 * @see #setDataRange(DataRange)
	 * @see com.emf4sw.owl.OWLPackage#getDataMaxCardinality_DataRange()
	 * @model annotation="emf4sw.OWLClass uri='http://www.w3.org/2002/07/owl#onDataRange'"
	 * @generated
	 */
	DataRange getDataRange();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DataMaxCardinality#getDataRange <em>Data Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Range</em>' reference.
	 * @see #getDataRange()
	 * @generated
	 */
	void setDataRange(DataRange value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(DataProperty)
	 * @see com.emf4sw.owl.OWLPackage#getDataMaxCardinality_Property()
	 * @model annotation="emf4sw.OWLClass uri='http://www.w3.org/2002/07/owl#onProperty'"
	 * @generated
	 */
	DataProperty getProperty();

	/**
	 * Sets the value of the '{@link com.emf4sw.owl.DataMaxCardinality#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(DataProperty value);

} // DataMaxCardinality
