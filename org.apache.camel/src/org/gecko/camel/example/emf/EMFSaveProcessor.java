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

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.service.component.annotations.Component;

/**
 * 
 * @author mark
 * @since 29.08.2025
 */
@Component(property = "camel.processorName=EMFSave")
public class EMFSaveProcessor implements Processor {

	/* 
	 * (non-Javadoc)
	 * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
	 */
	@Override
	public void process(Exchange exchange) throws Exception {
		// Get ResourceSet from CamelContext
		ResourceSet resourceSet = exchange.getContext().getRegistry().findSingleByType(ResourceSet.class);

		EObject eo = exchange.getIn().getBody(EObject.class);

		Resource resource = resourceSet.createResource(URI.createURI(UUID.randomUUID().toString() + ".xmi"));
		resource.getContents().add(eo);
		synchronized (resource) {
			try {
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				// Use ResourceSet to load EMF resource
				resource.save(baos, null);

				exchange.getIn().setBody(new String(baos.toByteArray(), StandardCharsets.UTF_8));
			} finally {
				resource.getContents().clear();
				synchronized (resourceSet) {
					resourceSet.getResources().remove(resource);
				}
			}
		}

	}

}
