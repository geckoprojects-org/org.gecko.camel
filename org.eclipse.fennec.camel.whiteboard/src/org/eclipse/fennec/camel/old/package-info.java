/**
 * ARCHIVED PACKAGE - org.eclipse.fennec.camel.old
 * 
 * <p><strong>⚠️  ARCHIVED CODE - DO NOT MODIFY ⚠️</strong></p>
 * 
 * <p>This package contains archived versions of the fennec camel whiteboard 
 * implementation that are no longer actively maintained. The code has been 
 * moved here for reference purposes and should not be modified.</p>
 * 
 * <h2>Archived Components</h2>
 * <ul>
 * <li><strong>ConfigurationAgent</strong> - Original configuration agent interface</li>
 * <li><strong>ConfigurationManager</strong> - Pipeline configuration management</li>
 * <li><strong>DependencyTracker</strong> - Service dependency tracking</li>
 * <li><strong>PipelineInstance</strong> - Pipeline instance management</li>
 * <li><strong>PipelineMonitoringService</strong> - Pipeline monitoring and reporting</li>
 * <li><strong>PipelineStateReporter</strong> - State reporting interface</li>
 * </ul>
 * 
 * <h2>Archived Implementations</h2>
 * <ul>
 * <li><strong>CamelModelDependencyExtractor</strong> - EMF model dependency extraction</li>
 * <li><strong>CentralizedDependencyTracker</strong> - Centralized service tracking</li>
 * <li><strong>ConfigurationAgentImpl</strong> - Configuration agent implementation</li>
 * <li><strong>ConfigurationManagerImpl</strong> - Configuration manager implementation</li>
 * <li><strong>PipelineMonitoringServiceImpl</strong> - Monitoring service implementation</li>
 * <li><strong>PipelineWhiteboardInstance</strong> - Core pipeline whiteboard instance</li>
 * </ul>
 * 
 * <h2>Architecture Status</h2>
 * <p>This archived implementation represents the completed OSGi-native architecture 
 * with the following key features:</p>
 * <ul>
 * <li>Early activation with deferred Camel context creation</li>
 * <li>Dynamic dependency tracking using OSGi ServiceTrackers</li>
 * <li>PipelineInstance service registration for monitoring</li>
 * <li>OSGi Condition service for external readiness checks</li>
 * <li>State change notifications and error handling</li>
 * <li>Promise-based asynchronous readiness checking</li>
 * </ul>
 * 
 * <h2>Replacement</h2>
 * <p>For new implementations, refer to the examples in the 
 * <code>org.apache.camel</code> project, particularly:</p>
 * <ul>
 * <li><code>CamelPipelineInstance</code> - New pipeline instance with dependency tracking</li>
 * <li><code>CamelContextStarter</code> - Camel context configuration</li>
 * </ul>
 * 
 * <p>The active EMF pipeline models remain available in the generated 
 * <code>org.eclipse.fennec.camel.whiteboard.pipeline</code> package.</p>
 * 
 * <p><strong>Archive Date:</strong> 2025-09-12</p>
 * <p><strong>Archive Reason:</strong> Moved to reference-only status, no longer actively maintained</p>
 * 
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
@Deprecated(since = "2025-09-12", forRemoval = false)
@org.osgi.annotation.versioning.Version("1.0.0")
package org.eclipse.fennec.camel.old;