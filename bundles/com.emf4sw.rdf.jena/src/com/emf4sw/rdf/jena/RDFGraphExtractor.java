package com.emf4sw.rdf.jena;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import com.emf4sw.rdf.BlankNode;
import com.emf4sw.rdf.Datatype;
import com.emf4sw.rdf.DocumentGraph;
import com.emf4sw.rdf.Literal;
import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.Namespace;
import com.emf4sw.rdf.Property;
import com.emf4sw.rdf.RDFBag;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.RDFSeq;
import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.TripleNode;
import com.emf4sw.rdf.util.RDFSwitch;
import com.emf4sw.rdf.vocabulary.RDF;
import com.emf4sw.rdf.vocabulary.RDFS;
import com.emf4sw.rdf.vocabulary.XSD;
import com.hp.hpl.jena.datatypes.RDFDatatype;
import com.hp.hpl.jena.datatypes.TypeMapper;
import com.hp.hpl.jena.graph.NodeVisitor;
import com.hp.hpl.jena.rdf.model.AnonId;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.RDFList;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.vocabulary.OWL;

public class RDFGraphExtractor {
	
	private static final Map<String, RDFNode> b = new HashMap<String, RDFNode>();
	
	public Model extract(RDFGraph graph) {
		return extract(graph, ModelFactory.createDefaultModel());
	}
	
	public Model extract(RDFGraph graph, Model model) {
		if (graph instanceof DocumentGraph) {
			return doExtractDocument((DocumentGraph)graph, model);
		} else {
			return doExtractGraph((NamedGraph)graph, model);
		}
	}

	private Model doExtractGraph(NamedGraph graph, Model model) {
		for(com.emf4sw.rdf.Triple triple : graph.getTriples()) 
		{
			Statement stmt = extract( triple, model );
			if (stmt != null) 
			{
				model.add(stmt);
			}
		}
		return model;
	}

	private Model doExtractDocument(DocumentGraph graph, Model model)
	{
		for(Namespace namespace: graph.getNamespaces()) {
			model.setNsPrefix(namespace.getPrefix(), namespace.getURI());
		}
		model.setNsPrefix("rdf", RDF.NS);
		model.setNsPrefix("rdfs", RDFS.NS);
		model.setNsPrefix("owl", OWL.NS);
		model.setNsPrefix("xsd", XSD.NS);
		for(com.emf4sw.rdf.Triple triple : graph.listAllTriples()) {
			if (!(triple.getSubject() instanceof NamedGraph)) {
				Statement stmt = extract( triple, model );
				if (stmt != null) {
					model.add(stmt);
				}
			}
		}
		return model;
	}

	public static com.hp.hpl.jena.rdf.model.Statement extract(Triple triple, Model model) {
		if ( triple.getSubject() == null || 
				triple.getPredicate() == null || 
				triple.getObject() == null ) {
			return null;
		}
		
		NodeSwitchExtractor visitor = new NodeSwitchExtractor(model);
		
		final com.hp.hpl.jena.rdf.model.RDFNode subject = 
			visitor.doSwitch(triple.getSubject());
		final com.hp.hpl.jena.rdf.model.Property predicate = 
			(com.hp.hpl.jena.rdf.model.Property) visitor.doSwitch(triple.getPredicate());
		final com.hp.hpl.jena.rdf.model.RDFNode object = 
			visitor.doSwitch(triple.getObject());

		if (subject == null || predicate == null || object == null) {
			return null;
		}

		return model.createStatement((com.hp.hpl.jena.rdf.model.Resource) subject, predicate, object);
	}

	/**
	 * Implements the {@link NodeVisitor} interface.
	 * 
	 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
	 *
	 */
	public static class NodeSwitchExtractor extends RDFSwitch<RDFNode> {

		private final Model model;

		public NodeSwitchExtractor(Model model) {
			this.model = model;
		}

		@Override
		public RDFNode caseBlankNode(BlankNode object) {
			if (!b.containsKey(object.getNodeID())) {
				b.put(object.getNodeID(), model.createResource(
					object.getNodeID() != null ?
							AnonId.create(object.getNodeID()) :
								AnonId.create()));
			}
			return b.get(object.getNodeID());
		}
		
		@Override
		public RDFNode caseResource(com.emf4sw.rdf.Resource object) {
			RDFNode resultinNode = null;
			if (object.getURI() != null) {
				final String uri = object.getURI().replaceAll("[\\s]+", "_");
				resultinNode = model.getResource( uri );
				if (resultinNode == null) 
				{
					resultinNode = model.createResource( uri );
				}
			} else {
				resultinNode = model.createResource(AnonId.create());
			}
			if (object.getLabel() != null)
			{
				model.add(resultinNode.asResource(), model.getProperty(RDFS.label), model.createLiteral(object.getLabel()));
			}
			if (object.getComment() != null)
			{
				model.add(resultinNode.asResource(), model.getProperty(RDFS.comment), model.createLiteral(object.getComment()));
			}
			return resultinNode;
		}

		@Override
		public RDFNode caseProperty(Property object) {
			RDFNode resultinNode = null;
			if (object.getURI() != null) {
				final String uri = object.getURI().replaceAll("[\\s]+", "_");
				resultinNode = model.getProperty( uri );
				if (resultinNode == null) 
				{
					resultinNode = model.createProperty( uri );
				}
			}
			if (object.getLabel() != null)
			{
				model.add(resultinNode.asResource(), model.getProperty(RDFS.label), model.createLiteral(object.getLabel()));
			}
			if (object.getComment() != null)
			{
				model.add(resultinNode.asResource(), model.getProperty(RDFS.comment), model.createLiteral(object.getComment()));
			}
			return resultinNode;
		}

		@Override
		public RDFNode caseNamedGraph(NamedGraph object) {
			RDFNode resultinNode = null;
			if (object.getURI() != null) {
				final String uri = object.getURI().replaceAll("[\\s]+", "_");
				resultinNode = model.getResource( uri );
				if (resultinNode == null) 
				{
					resultinNode = model.createResource( uri );
				}
			}	
			if (object.getLabel() != null)
			{
				model.add(resultinNode.asResource(), model.getProperty(RDFS.label), model.createLiteral(object.getLabel()));
			}
			if (object.getComment() != null)
			{
				model.add(resultinNode.asResource(), model.getProperty(RDFS.comment), model.createLiteral(object.getComment()));
			}
			return resultinNode;
		}
		
		@Override
		public RDFNode caseTripleNode(TripleNode object) {
			RDFNode resultinNode = null;
			if (object.getURI() != null) {
				final String uri = object.getURI().replaceAll("[\\s]+", "_");
				resultinNode = model.getResource( uri );
				if (resultinNode == null) 
				{
					resultinNode = model.createResource( uri );
				}
			}
			if (object.getLabel() != null)
			{
				model.add(resultinNode.asResource(), model.getProperty(RDFS.label), model.createLiteral(object.getLabel()));
			}
			if (object.getComment() != null)
			{
				model.add(resultinNode.asResource(), model.getProperty(RDFS.comment), model.createLiteral(object.getComment()));
			}
			return resultinNode;
		}

		@Override
		public RDFNode caseDatatype(Datatype object) {
			RDFNode resultinNode = null;
			if (object.getURI() != null) {
				final String uri = object.getURI().replaceAll("[\\s]+", "_");
				resultinNode = model.getResource( uri );
				if (resultinNode == null) 
				{
					resultinNode = model.createResource( uri );
				}
			}		
			if (object.getLabel() != null)
			{
				model.add(resultinNode.asResource(), model.getProperty(RDFS.label), model.createLiteral(object.getLabel()));
			}
			if (object.getComment() != null)
			{
				model.add(resultinNode.asResource(), model.getProperty(RDFS.comment), model.createLiteral(object.getComment()));
			}
			return resultinNode;
		}

		@Override
		public RDFNode caseLiteral(Literal object) {
			RDFNode resultinNode = null;
			if (object.getLang() != null && !object.getLang().trim().isEmpty()) {
				resultinNode = model.createLiteral( object.getLexicalForm(), object.getLang() );
			} else {
				final RDFDatatype dType = object.getDatatype() == null ? null :
					TypeMapper.getInstance().getSafeTypeByName( object.getDatatype().getURI() );

				resultinNode = dType != null ?
						model.createTypedLiteral( object.getLexicalForm(), dType ) :
							model.createTypedLiteral( object.getLexicalForm(), 
									TypeMapper.getInstance().getSafeTypeByName( RDFS.Literal ) );
			}

			return resultinNode;
		}
		
		@Override
		public RDFNode caseRDFList(com.emf4sw.rdf.RDFList object) {
			RDFList list = model.createList();
			for (EObject obj: object.getElements()) {
				RDFNode node = doSwitch(obj);
				list = list.cons(node);
			}
			
			return list;
		}
		
		@Override
		public RDFNode caseRDFSeq(RDFSeq object) {
			com.hp.hpl.jena.rdf.model.Seq seq = model.createSeq();
			for (EObject obj: object.getElements()) {
				seq.add(doSwitch(obj));
			}
			
			return seq;
		}

		@Override
		public RDFNode caseRDFBag(RDFBag object) {
			com.hp.hpl.jena.rdf.model.Bag bag = model.createBag();
			for (EObject obj: object.getElements()) {
				bag.add(doSwitch(obj));
			}
			
			return bag;
		}
	}
}
