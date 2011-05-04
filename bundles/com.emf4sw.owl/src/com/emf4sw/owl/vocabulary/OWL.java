/**
 * 
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 */
package com.emf4sw.owl.vocabulary;

import com.emf4sw.rdf.vocabulary.XSD;

/**
 * OWL vocabulary.
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.0
 */
public class OWL {

	final public static String NS = "http://www.w3.org/2002/07/owl#";


	final public static String Ontology = NS + "Ontology";

	final public static String Class = NS + "Class";

	final public static String DeprecatedClass = NS + "DeprecatedClass";

	final public static String Restriction = NS + "Restriction";

	final public static String DataRange = NS + "DataRange";

	final public static String AllDifferent = NS + "AllDifferent";

	final public static String DatatypeProperty = NS + "DatatypeProperty";

	final public static String ObjectProperty = NS + "ObjectProperty";

	final public static String SymmetricProperty = NS + "SymmetricProperty";

	final public static String TransitiveProperty = NS + "TransitiveProperty";

	final public static String FunctionalProperty = NS + "FunctionalProperty";

	final public static String InverseFunctionalProperty = NS + "InverseFunctionalProperty";

	final public static String AnnotationProperty = NS + "AnnotationProperty";

	final public static String Thing = NS + "Thing";

	final public static String Nothing = NS + "Nothing";


	final public static String imports = NS + "imports";

	final public static String versionInfo = NS + "versionInfo";

	final public static String priorVersion = NS + "priorVersion";

	final public static String distinctMembers = NS + "distinctMembers";

	final public static String incompatibleWith = NS + "incompatibleWith";

	final public static String backwardCompatibleWith = NS + "backwardCompatibleWith";

	final public static String complementOf = NS + "complementOf";

	final public static String differentFrom = NS + "differentFrom";

	final public static String unionOf = NS + "unionOf";

	final public static String intersectionOf = NS + "intersectionOf";

	final public static String equivalentProperty = NS + "equivalentProperty";

	final public static String inverseOf = NS + "inverseOf";

	final public static String allValuesFrom = NS + "allValuesFrom";

	final public static String someValuesFrom = NS + "someValuesFrom";

	final public static String hasValue = NS + "hasValue";

	final public static String onProperty = NS + "onProperty";

	final public static String minCardinality = NS + "minCardinality";

	final public static String maxCardinality = NS + "maxCardinality";

	final public static String cardinality = NS + "cardinality";

	final public static String equivalentClass = NS + "equivalentClass";

	final public static String sameAs = NS + "sameAs";

	final public static String oneOf = NS + "oneOf";

	final public static String disjointWith = NS + "disjointWith";

	final public static String AllDisjointClasses = NS + "AllDisjointClasses";

	final public static String AllDisjointProperties = NS + "AllDisjointProperties";

	final public static String ReflexiveProperty = NS + "ReflexiveProperty";

	final public static String IrreflexiveProperty = NS + "IrreflexiveProperty";

	final public static String AsymmetricProperty = NS + "AsymmetricProperty";

	final public static String NegativePropertyAssertion = NS + "NegativePropertyAssertion";

	final public static String NamedIndividual = NS + "NamedIndividual";


	final public static String versionIRI = NS + "versionIRI";

	final public static String datatypeComplementOf = NS + "datatypeComplementOf";

	final public static String onClass  = NS + "onClass";

	final public static String onDataRange = NS + "onDatarange";

	final public static String onDatatype = NS + "onDatatype";

	final public static String withRestrictions = NS + "withRestrictions";

	final public static String disjointDataProperties = NS + "disjointDataProperties";

	final public static String minQualifiedCardinality = NS + "minQualifiedCardinality";

	final public static String maxQualifiedCardinality = NS + "maxQualifiedCardinality";

	final public static String qualifiedCardinality = NS + "qualifiedCardinality";

	final public static String disjointUnionOf = NS + "disjointUnionOf";

	final public static String propertyDisjointWith = NS + "propertyDisjointWith";

	final public static String propertyChainAxiom = NS + "propertyChainAxiom";

	final public static String members = NS + "members";

	final public static String hasKey = NS + "hasKey";

	final public static String hasSelf = NS + "hasSelf";

	final public static String sourceIndividual = NS + "sourceIndividual";

	final public static String assertionProperty = NS + "assertionProperty";

	final public static String targetIndividual = NS + "targetIndividual";

	final public static String targetValue = NS + "targetValue";


	final public static String length = XSD.NS + "length";

	final public static String maxLength = XSD.NS + "maxLength";

	final public static String minLength = XSD.NS + "minLength";

	final public static String totalDigits = XSD.NS + "totalDigits";

	final public static String fractionDigits = XSD.NS + "fractionDigits";

	final public static String minInclusive = XSD.NS + "minInclusive";

	final public static String minExclusive = XSD.NS + "minExclusive";

	final public static String maxInclusive = XSD.NS + "maxInclusive";

	final public static String maxExclusive = XSD.NS + "maxExclusive";

	final public static String pattern = XSD.NS + "pattern";

}
