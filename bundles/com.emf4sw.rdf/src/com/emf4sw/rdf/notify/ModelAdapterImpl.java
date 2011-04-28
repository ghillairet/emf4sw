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
package com.emf4sw.rdf.notify;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.resource.RDFResource;
import com.emf4sw.rdf.resource.RDFResourceImpl;

public class ModelAdapterImpl extends AdapterImpl {
	@Override
	public void notifyChanged(Notification msg) {
		if (msg.getFeatureID(RDFGraph.class) == RDFPackage.RDF_GRAPH__TRIPLES) {
			RDFGraph notifier;
			if (msg.getNotifier() instanceof RDFResource) {
				notifier = ((RDFResource) msg.getNotifier()).getGraph();
			} else {
				notifier = (RDFGraph) msg.getNotifier();
			}
			if (msg.getNewValue() instanceof Triple) {
				Triple obj = (Triple) msg.getNewValue();

				if (notifier.eResource() != null)
					if (notifier.eResource() instanceof RDFResource)
						((RDFResourceImpl) notifier.eResource()).addDelegate(obj);
			}
		}

		super.notifyChanged(msg);
	}
}
