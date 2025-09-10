/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.gecko.camel.example.emf;

import java.io.ByteArrayInputStream;
import java.util.UUID;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.osgi.annotation.require.RequireEMF;
import org.osgi.service.component.annotations.Component;

/**
 * 
 * @author mark
 * @since 29.08.2025
 */
@RequireEMF
@Component(property = "camel.processorName=EMFLoad")
public class EMFLoadProcessor implements Processor {

	/* 
	 * (non-Javadoc)
	 * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
	 */
	@Override
	public void process(Exchange exchange) throws Exception {
		// Get ResourceSet from CamelContext
		ResourceSet resourceSet = exchange.getContext().getRegistry().findSingleByType(ResourceSet.class);

		String xmlContent = exchange.getIn().getBody(String.class);

		Resource resource = resourceSet.createResource(URI.createURI(UUID.randomUUID().toString() + ".xmi"));
		synchronized (resource) {
			try {
				// Use ResourceSet to load EMF resource
				resource.load(new ByteArrayInputStream(xmlContent.getBytes()), null);

				EObject rootObject = resource.getContents().get(0);
				exchange.getIn().setBody(rootObject);
			} finally {
				resource.getContents().clear();
				synchronized (resourceSet) {
					resourceSet.getResources().remove(resource);
				}
			}
		}

	}

}
