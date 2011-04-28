/*******************************************************************************
 * Copyright (c) 2011 Guillaume Hillairet.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Guillaume Hillairet - initial API and implementation
 *******************************************************************************/
package com.emf4sw.rdf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.Literal#getLexicalForm <em>Lexical Form</em>}</li>
 *   <li>{@link com.emf4sw.rdf.Literal#getLang <em>Lang</em>}</li>
 *   <li>{@link com.emf4sw.rdf.Literal#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link com.emf4sw.rdf.Literal#getGraph <em>Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emf4sw.rdf.RDFPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends Node {
	/**
	 * Returns the value of the '<em><b>Lexical Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lexical Form</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lexical Form</em>' attribute.
	 * @see #setLexicalForm(String)
	 * @see com.emf4sw.rdf.RDFPackage#getLiteral_LexicalForm()
	 * @model required="true"
	 * @generated
	 */
	String getLexicalForm();

	/**
	 * Sets the value of the '{@link com.emf4sw.rdf.Literal#getLexicalForm <em>Lexical Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lexical Form</em>' attribute.
	 * @see #getLexicalForm()
	 * @generated
	 */
	void setLexicalForm(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(String)
	 * @see com.emf4sw.rdf.RDFPackage#getLiteral_Lang()
	 * @model
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link com.emf4sw.rdf.Literal#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' reference.
	 * @see #setDatatype(Datatype)
	 * @see com.emf4sw.rdf.RDFPackage#getLiteral_Datatype()
	 * @model required="true"
	 * @generated
	 */
	Datatype getDatatype();

	/**
	 * Sets the value of the '{@link com.emf4sw.rdf.Literal#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(Datatype value);

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.emf4sw.rdf.RDFGraph#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' container reference.
	 * @see #setGraph(RDFGraph)
	 * @see com.emf4sw.rdf.RDFPackage#getLiteral_Graph()
	 * @see com.emf4sw.rdf.RDFGraph#getLiterals
	 * @model opposite="literals" transient="false"
	 * @generated
	 */
	RDFGraph getGraph();

	/**
	 * Sets the value of the '{@link com.emf4sw.rdf.Literal#getGraph <em>Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' container reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(RDFGraph value);

} // Literal
