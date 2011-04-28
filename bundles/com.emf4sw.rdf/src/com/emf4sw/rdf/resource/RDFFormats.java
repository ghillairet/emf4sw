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
package com.emf4sw.rdf.resource;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.0
 */ 
public enum RDFFormats {

	RDF_XML_FORMAT { 
		public String value() {return "RDF/XML"; }
		public String extension() {return ".rdf"; }
	},
	RDF_XML_ABBREV_FORMAT { 
		public String value() {return "RDF/XML-ABBREV"; }
		public String extension() {return ".rdf"; }
	},
	TRIPLE_FORMAT { 
		public String value() {return "N-TRIPLES"; }
		public String extension() {return ".nt"; }
	},
	N3_FORMAT {
		public String value() {return "N3"; }
		public String extension() {return ".n3"; }
	},
	TURTLE_FORMAT {
		public String value() {return "TTL"; }
		public String extension() {return ".ttl"; }		
	},
	XMI_FORMAT {
		public String value() {return "XMI"; }
		public String extension() {return ".xmi"; }
	};
	
	public abstract String value();	
	public abstract String extension();
	public static Resource.Factory factory(RDFFormats format) {
		return (Factory) Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(format.extension().substring(1));
	}
}
