package com.emf4sw.rdf.sesame;

import org.openrdf.rio.helpers.StatementCollector;

import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.resource.RDFResource;
import com.emf4sw.rdf.resource.RDFResource.RDFReader;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.5
 */
public class RDFSesameReader implements RDFReader<StatementCollector> {

	@Override
	public void read(StatementCollector source, RDFResource resource) {
		RDFGraph aGraph = RDFFactory.eINSTANCE.createDocumentGraph();
		new SesameGraph2RDFGraph().to(source, aGraph);

		resource.getContents().add(aGraph);
	}

}
