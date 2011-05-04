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
 * A representation of the model object '<em><b>Data Union Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.DataUnionOf#getDataRanges <em>Data Ranges</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getDataUnionOf()
 * @model
 * @generated
 */
public interface DataUnionOf extends DataRange {
	/**
	 * Returns the value of the '<em><b>Data Ranges</b></em>' reference list.
	 * The list contents are of type {@link com.emf4sw.owl.DataRange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Ranges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Ranges</em>' reference list.
	 * @see com.emf4sw.owl.OWLPackage#getDataUnionOf_DataRanges()
	 * @model
	 * @generated
	 */
	EList<DataRange> getDataRanges();

} // DataUnionOf
