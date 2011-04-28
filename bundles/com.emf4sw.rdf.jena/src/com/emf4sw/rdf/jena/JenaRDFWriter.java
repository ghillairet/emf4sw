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
package com.emf4sw.rdf.jena;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.emf4sw.rdf.DocumentGraph;
import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.resource.RDFResource;
import com.emf4sw.rdf.resource.RDFResource.RDFWriter;
import com.hp.hpl.jena.rdf.model.Model;

/**
 * {@link JenaRDFWriter}
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class JenaRDFWriter implements RDFWriter<Model> {

	public JenaRDFWriter() {
	}

	@Override
	public void write(RDFResource resource, Model target) {
		final RDFGraph graph;
		
		if (resource.getContents().size() == 1) 
		{
			EObject eObject = resource.getContents().get(0);
			if (eObject instanceof RDFGraph) 
			{
				graph = (RDFGraph) eObject;
			} 
			else 
			{
				throw new IllegalArgumentException();
			}
		} 
		else 
		{
			DocumentGraph aGraph = 
				(DocumentGraph) EcoreUtil.getObjectByType(resource.getContents(), 
						RDFPackage.eINSTANCE.getDocumentGraph());
			if (aGraph == null) 
			{
				aGraph = RDFFactory.eINSTANCE.createDocumentGraph();
			}
			for (EObject eObject: resource.getContents()) 
			{
				if (eObject instanceof NamedGraph) 
				{
					aGraph.add((NamedGraph) eObject);
				}
			}
			graph = aGraph;
		}
		
		RDFGraphExtractor.extract(graph, target);
	}

	

}
