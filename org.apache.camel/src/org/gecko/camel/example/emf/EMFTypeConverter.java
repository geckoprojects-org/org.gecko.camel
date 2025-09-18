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
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

import org.apache.camel.Converter;
import org.apache.camel.Exchange;
import org.apache.camel.RuntimeCamelException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

@Converter
public class EMFTypeConverter {

	@Converter
	public static EObject xmlToEObject(String xml, Exchange exchange) {
		// Access ResourceSet from exchange context
		ResourceSet resourceSet = exchange.getContext().getRegistry().findSingleByType(ResourceSet.class);

		Resource resource = resourceSet.createResource(URI.createURI(UUID.randomUUID().toString() + ".xmi"));
		synchronized (resource) {
			try {
				// Use ResourceSet to load EMF resource
				resource.load(new ByteArrayInputStream(xml.getBytes()), null);
				System.out.println("CONVERT LOAD");
				return resource.getContents().get(0);
			} catch (IOException e) {
				throw new RuntimeCamelException("Failed to load EMF resource", e);
			} finally {
				resource.getContents().clear();
				synchronized (resourceSet) {
					resourceSet.getResources().remove(resource);
				}
			}
		}
	}

	@Converter
	public static String eObjectToXml(EObject eObject, Exchange exchange) {
		// Get ResourceSet from CamelContext
		ResourceSet resourceSet = exchange.getContext().getRegistry().findSingleByType(ResourceSet.class);

		Resource resource = resourceSet.createResource(URI.createURI(UUID.randomUUID().toString() + ".xmi"));
		resource.getContents().add(eObject);
		synchronized (resource) {
			try {
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				// Use ResourceSet to load EMF resource
				resource.save(baos, null);
				System.out.println("CONVERT SAVE");
				return baos.toString(StandardCharsets.UTF_8);
			} catch (IOException e) {
				throw new RuntimeCamelException("Failed to save EMF resource", e);
			} finally {
				resource.getContents().clear();
				synchronized (resourceSet) {
					resourceSet.getResources().remove(resource);
				}
			}
		}
	}
}
