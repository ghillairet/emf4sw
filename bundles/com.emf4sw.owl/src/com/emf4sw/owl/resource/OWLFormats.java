/**
 * 
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 */
package com.emf4sw.owl.resource;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;


/**
 * {@link OWLFormats}
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.0
 */
public enum OWLFormats {
	
	OWL { 
		@Override public String value() {return "RDF/XML-ABBREV";}
		@Override public String extension() {return ".owl";}
	},
	RDF { 
		@Override public String value() {return "RDF/XML-ABBREV";}
		@Override public String extension() {return ".rdf";}
	},
	N3 {
		@Override public String value() {return "N3";}
		@Override public String extension() {return ".n3";}
	},
	TURTLE {
		@Override public String value() {return "TTL";}
		@Override public String extension() {return ".ttl";}
	},
	TRIPLES {
		@Override public String value() {return "TRIPLES";}
		@Override public String extension() {return ".nt";}
	},
	XMI {
		@Override public String value() {return "XMI";}
		@Override public String extension() {return ".xmi";}
	};
	
	public abstract String value();
	public abstract String extension();
	
	public static Resource.Factory factory(OWLFormats format) {
		return (Factory) Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(
				format.extension().substring(1));
	}
}
