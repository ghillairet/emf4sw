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
