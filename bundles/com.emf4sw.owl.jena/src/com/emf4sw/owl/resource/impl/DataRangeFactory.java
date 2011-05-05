package com.emf4sw.owl.resource.impl;

import com.emf4sw.owl.DataComplementOf;
import com.emf4sw.owl.DataIntersectionOf;
import com.emf4sw.owl.DataOneOf;
import com.emf4sw.owl.DataRange;
import com.emf4sw.owl.DataUnionOf;
import com.emf4sw.owl.DatatypeRestriction;
import com.emf4sw.owl.FacetRestriction;
import com.emf4sw.owl.OWLDatatype;
import com.emf4sw.owl.util.OWLSwitch;
import com.emf4sw.owl.vocabulary.OWL;
import com.emf4sw.rdf.vocabulary.RDF;
import com.emf4sw.rdf.vocabulary.RDFS;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.RDFList;
import com.hp.hpl.jena.rdf.model.Resource;

class DataRangeFactory {
	static Resource createDataRange(DataRange range, OntModel model) {
		return range != null ? new DataRangeVisitorExtractor(model).doSwitch(range) : null;
	}

//	static Resource createDatatypeDefinition(DatatypeDefinition axiom, OntModel model) {
//		final Resource aDatatype = model.createResource( getURI(axiom.getDatatype()) );
//		final Resource aRestriction = createDatatypeRestriction(axiom.getRestriction(), model);
//
//		model.createStatement(aDatatype, 
//				model.createProperty(OWL.equivalentClass), aRestriction);
//		
//		return aDatatype;
//	}

	static Resource createDatatype(DataRange datatype, OntModel model) {
		return (datatype != null  && getURI(datatype) != null) ?  model.createResource(getURI(datatype)) : model.createResource();
	}

	static Resource createDatatypeRestriction(DatatypeRestriction restriction, OntModel model) {
//		_:x rdf:type rdfs:Datatype .
//		_:x owl:onDatatype T(DT) .
//		_:x owl:withRestrictions T(SEQ _:y1 ... _:yn) .
//		_:y1 F1 lt1 .
//		...
//		_:yn Fn ltn
		final Resource aDatatype = model.createResource();
		model.add(aDatatype, model.createProperty(RDF.type), model.createResource(RDFS.Datatype));
		model.add(aDatatype, model.createProperty(OWL.onDatatype), createDatatype(restriction.getDatatype(), model));
		
		RDFList list = model.createList();
		for (FacetRestriction facet: restriction.getRestrictions()) {
			com.hp.hpl.jena.rdf.model.Literal literal = model.createLiteral(facet.getValue().getLexicalForm());
			Resource aResource = model.createResource();
			model.add(aResource, 
					model.createProperty( 
							facet.getDatatype() == null ? RDFS.Literal : getURI( facet.getDatatype() ) 
					), literal);
			list = list.cons(aResource);
		}
		model.add(aDatatype, model.createProperty(OWL.withRestrictions), list);

		return aDatatype;
	}

	private static String getURI(DataRange dataRange) {
		if (dataRange instanceof OWLDatatype) {
			return ((OWLDatatype) dataRange).getURI();
		} 
		return RDFS.Literal;
	}
	
	static class DataRangeVisitorExtractor extends OWLSwitch<Resource> {

		private OntModel model;

		DataRangeVisitorExtractor(OntModel model) {
			this.model = model;
		}
		@Override
		public Resource caseDataComplementOf(DataComplementOf range) {
			final Resource aResource = model.createResource();
			model.createStatement(aResource, 
					model.createProperty(RDF.type), 
					model.createResource(RDFS.Datatype));

			final Resource dataRange = createDataRange(range.getDataRange(), model);
			model.createStatement(aResource, 
					model.createProperty(OWL.datatypeComplementOf), 
					dataRange);

			return aResource;
		}
		@Override
		public Resource caseDataIntersectionOf(DataIntersectionOf range) {
			final Resource aResource = model.createResource();
			model.createStatement(aResource, 
					model.createProperty(RDF.type), 
					model.createResource(RDFS.Datatype));

			RDFList list = model.createList();
			for (DataRange value: range.getDataRanges()) {
				Resource dataRange = createDataRange(value, model);
				if (dataRange != null) {
					list = list.cons( dataRange );
				}
			}
			model.createStatement(aResource, 
					model.createProperty(OWL.intersectionOf), 
					list);
			
			return aResource;
		}
		@Override
		public Resource caseDataOneOf(DataOneOf range) {
			RDFList list = model.createList();
			for (com.emf4sw.rdf.Literal value: range.getOneOf()) {
				com.hp.hpl.jena.rdf.model.Literal literal = model.createLiteral(value.getLexicalForm());
				if (literal != null) {
					list = list.cons( literal );
				}
			}
			return model.createDataRange(list);
		}
		@Override
		public Resource caseDataUnionOf(DataUnionOf range) {
			final Resource aResource = model.createResource();
			model.createStatement(aResource, 
					model.createProperty(RDF.type), 
					model.createResource(RDFS.Datatype));

			RDFList list = model.createList();
			for (DataRange value: range.getDataRanges()) {
				Resource dataRange = createDataRange(value, model);
				if (dataRange != null) {
					list = list.cons( dataRange );
				}
			}
			model.createStatement(aResource, 
					model.createProperty(OWL.unionOf), 
					list);

			return aResource;
		}
		@Override
		public Resource caseOWLDatatype(OWLDatatype range) {
			return (range != null  && getURI(range) != null) ?  
					model.createResource(getURI(range)) : model.createResource();
		}
		@Override
		public Resource caseDatatypeRestriction(DatatypeRestriction range) {
			return createDatatypeRestriction(range, model);
		}
	}
}
