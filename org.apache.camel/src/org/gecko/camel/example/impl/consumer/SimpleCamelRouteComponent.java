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
package org.gecko.camel.example.impl.consumer;

import org.apache.camel.CamelContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Use for
 * - KafkaRouteProvider
 * - MyRouteProvider
 * @author mark
 * @since 13.09.2025
 */
@Component
public class SimpleCamelRouteComponent {

	private static final Logger logger = LoggerFactory.getLogger(SimpleCamelRouteComponent.class);
	
	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private CamelContext camelContext;
	
	@Activate
	public void activate() {
		logger.info("SimpleCamelRouteComponent activated with CamelContext: {}", camelContext.getName());
	}

	@Deactivate
	public void deactivate() {
		logger.info("SimpleCamelRouteComponent deactivated");
	}

}
