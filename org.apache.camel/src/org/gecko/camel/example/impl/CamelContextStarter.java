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
package org.gecko.camel.example.impl;

import org.apache.camel.CamelContext;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.camel.example.CamelContextConfigurer;
import org.gecko.camel.example.RouteProvider;
import org.gecko.camel.example.emf.EMFTypeConverter;
import org.osgi.framework.Bundle;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.condition.Condition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dragino.DraginoPackage;

@Component(immediate = true)
public class CamelContextStarter implements CamelContextConfigurer {

	private static final Logger LOG = LoggerFactory.getLogger(CamelContextStarter.class);
	@Reference
	private DraginoPackage dragino;
	@Reference
	private ResourceSet resourceSet;
	@Reference(target = "(camel.processorName=EMFLoad)")
	private Processor loadProcessor;
	@Reference(target = "(camel.processorName=EMFSave)")
	private Processor saveProcessor;
	
//  for kafka:
	@Reference(target = "(camel.route=myK)")
//	for simple or emf
//	@Reference(target = "(camel.route=my)")
	private RouteProvider route;

	@Override
	public void configure(CamelContext camelContext, Bundle bundle) throws Exception {
		LOG.info("Attempting to start CamelContext {} for bundle {}", camelContext.getName(), bundle.getSymbolicName());
		// Bind ResourceSet to the Camel registry so processors can access it
		camelContext.getRegistry().bind("resourceSet", ResourceSet.class, resourceSet);
		camelContext.getRegistry().bind("EMFLoad", Processor.class, loadProcessor);
		camelContext.getRegistry().bind("EMFSave", Processor.class, saveProcessor);
		camelContext.getTypeConverterRegistry().addTypeConverters(EMFTypeConverter.class);


		// Set bundle-specific properties
		camelContext.getGlobalOptions().put("emf.bundle.name", bundle.getSymbolicName());
		camelContext.getGlobalOptions().put("emf.bundle.version", getBundleVersion(bundle));

		// Configure EMF-specific error handling
		camelContext.getRegistry().bind("emfErrorHandler", createErrorHandler());
		// Ensure the context is not already started
		if (!camelContext.isStarted() && !camelContext.isStarting()) {
			try {
				camelContext.start();
				LOG.info("CamelContext {} started successfully for bundle {}", camelContext.getName(), bundle.getSymbolicName());
			} catch (Exception e) {
				LOG.error("Error starting CamelContext {} for bundle {}", camelContext.getName(), bundle.getSymbolicName(), e);
				throw e;
			}
		} else {
			LOG.info("CamelContext {} for bundle {} is already started or starting. Skipping start.", camelContext.getName(), bundle.getSymbolicName());
		}

		try {
			camelContext.addRoutes(new RouteBuilder() {
				@Override
				public void configure() throws Exception {
					route.configureRoutes(this);
				}
			});
			LOG.debug("Added routes from provider: {}", route.getClass().getName());
		} catch (Exception e) {
			LOG.warn("Error adding routes from provider: {}", route.getClass().getName(), e);
		}
	}

	/**
	 * Creates an error handler for EMF-specific errors.
	 * 
	 * @return error handler instance
	 */
	private Object createErrorHandler() {
		// Return a custom error handler for EMF processing errors
		return new Object(); // Placeholder - implement actual error handler
	}

	/**
	 * Gets the version of the given bundle.
	 * 
	 * @param bundle the bundle
	 * @return bundle version as string
	 */
	private String getBundleVersion(Bundle bundle) {
		return bundle.getVersion() != null ? bundle.getVersion().toString() : "unknown";
	}

}
