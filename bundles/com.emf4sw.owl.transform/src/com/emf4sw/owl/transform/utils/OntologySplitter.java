package com.emf4sw.owl.transform.utils;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;

import com.emf4sw.owl.Ontology;
import com.emf4sw.owl.resource.OWLFormats;
import com.emf4sw.owl.resource.OWLResource;

/**
 * {@link OntologySplitter}
 * 
 * Split a {@link OWLResource} containing two or more {@link Ontology} into a {@link List} of 
 * {@link OWLResource}, each containing a single {@link Ontology}. Internal references between ontologies elements 
 * are recreated as cross references between {@link OWLResource}.
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class OntologySplitter {

	public List<Resource> split(Resource aResource, OWLFormats format) {
//		Factory factory = getFactory(format);
//		
//		final List<Resource> resources = new LinkedList<Resource>();
//		final Map<Ontology, Set<Entry<EObject, EObject>>> keys = new HashMap<Ontology, Set<Entry<EObject,EObject>>>();
//
//		for (EObject eObject: aResource.getContents()) {
//			if (eObject instanceof Ontology) {
//				final Copier copier = new EcoreUtil.Copier(true, true);
//				copier.copyReferences();
//				final EObject copy = copier.copy(eObject);
//				keys.put((Ontology) eObject, copier.entrySet());
//
//				final String ontologyURI = ((Ontology) eObject).getURI() + format.extension();
//				final Resource copyResource = factory.createResource( URI.createURI( ontologyURI ) );
//				copyResource.getContents().add(copy);
//				resources.add( copyResource );
//			}
//		}
//		for (Ontology o: keys.keySet()) {
//			final Set<Entry<EObject, EObject>> entries = keys.get(o);
//			for (Entry<EObject, EObject> entry: entries) {
//				checkOntology(entry, keys);
//				checkEntityExpression(entry, keys);
//				checkEntity(entry, keys);
//			}
//		}

		return null;
	}
	
}
