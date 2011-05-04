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
 * A representation of the model object '<em><b>Data Intersection Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.owl.DataIntersectionOf#getDataRanges <em>Data Ranges</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.owl.OWLPackage#getDataIntersectionOf()
 * @model
 * @generated
 */
public interface DataIntersectionOf extends DataRange {
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
	 * @see com.emf4sw.owl.OWLPackage#getDataIntersectionOf_DataRanges()
	 * @model
	 * @generated
	 */
	EList<DataRange> getDataRanges();

} // DataIntersectionOf
