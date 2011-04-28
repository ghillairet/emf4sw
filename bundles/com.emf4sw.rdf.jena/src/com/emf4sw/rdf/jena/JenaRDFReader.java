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

import com.emf4sw.rdf.resource.RDFResource;
import com.emf4sw.rdf.resource.RDFResource.RDFReader;
import com.hp.hpl.jena.rdf.model.Model;

/**
 * {@link JenaRDFReader}
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class JenaRDFReader implements RDFReader<Model> {
	
	public JenaRDFReader() { 
	}
	
	public void read(Model model, final RDFResource resource) {
		DocumentGraphInjector.inject(model,resource);
	}

}
