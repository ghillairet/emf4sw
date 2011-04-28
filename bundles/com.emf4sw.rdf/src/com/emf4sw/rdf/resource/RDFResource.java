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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import com.emf4sw.rdf.DocumentGraph;
import com.emf4sw.rdf.NamedGraph;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.0
 */
public interface RDFResource extends Resource {
	
	/**
	 * Create and Add a DocumentGraph as root element.
	 * 
	 * @throws IllegalStateException if the resource already contains a root graph.
	 * @return the created graph.
	 */
	DocumentGraph createGraph() throws IllegalStateException;

	/**
	 * Create and Add a NamedGraph as root element.
	 * 
	 * @param uri for the named graph;
	 * @throws IllegalStateException if the resource already contains a root graph.
	 * @return the created graph.
	 */
	NamedGraph createNamedGraph(URI uri) throws IllegalStateException;
	
	/**
	 * Returns the root graph is the root element is a DocumentGraph.
	 * 
	 * @return the graph
	 */
	DocumentGraph getGraph();
	
	/**
	 * Returns the NamedGraph identified by the uri.
	 * 
	 * @param uri
	 * @return the graph
	 */
	NamedGraph getNamedGraph(URI uri);
	
	
	Object getDelegate();
	
	/**
	 * 
	 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
	 * @since 0.7
	 */
	public interface RDFResourceFactory extends Resource.Factory {
		
	}
	
	/**
	 * 
	 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
	 * @since 0.7
	 */
	public interface RDFReader<T> {
		
		void read(T source, RDFResource resource);
		
	}
	
	/**
	 * 
	 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
	 * @since 0.7
	 */
	public interface RDFWriter<T> {
		
		void write(RDFResource resource, T target);
		
	}

}
