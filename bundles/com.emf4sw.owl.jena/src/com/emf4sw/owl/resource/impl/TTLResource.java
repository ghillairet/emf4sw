package com.emf4sw.owl.resource.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;

import com.emf4sw.owl.Ontology;
import com.emf4sw.owl.resource.OWLFormats;
import com.emf4sw.owl.resource.OWLResource;
import com.emf4sw.owl.resource.OWLResourceImpl;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.RDFWriter;

/**
 * 
 * A persistent ontology document for Turtle (TTL) format.
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.5
 */
public class TTLResource extends OWLResourceImpl implements OWLResource {

	public TTLResource() {
		super();
		reader = new OWLJenaReader();
		writer = new OWLJenaWriter();
	}

	public TTLResource(URI uri) {
		super(uri);
		reader = new OWLJenaReader();
		writer = new OWLJenaWriter();
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		Notification notification = setLoaded(true);
		try {
			reader.read(inputStream, this, OWLFormats.TURTLE);
		} finally {
			if (notification != null) {
				eNotify(notification);
			}

			setModified(false);
		}
	}

	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
		final OntModel aModel = (OntModel) this.writer.write(this, OWLFormats.OWL);

		final RDFWriter writer = aModel.getWriter("TTL");
		writer.setProperty("usePropertySymbols", "false");
		writer.setProperty("useTripleQuotedStrings", "false");
		writer.setProperty("useDoubles", "false");
		writer.setProperty("xmlbase", getOntology().getURI());
		writer.write(aModel, outputStream, "");
	}

	@Override
	public Ontology getOntology() {
		return (!getContents().isEmpty()) ? (Ontology)getContents().get(0) : null;
	}
}
