/*
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
 *      Mark Hoffmann - initial API and implementation
 */
package org.eclipse.fennec.camel.camelspring;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Route Controller Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition#getBackOffDelay <em>Back Off Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition#getBackOffMaxAttempts <em>Back Off Max Attempts</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition#getBackOffMaxDelay <em>Back Off Max Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition#getBackOffMaxElapsedTime <em>Back Off Max Elapsed Time</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition#getBackOffMultiplier <em>Back Off Multiplier</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition#getExcludeRoutes <em>Exclude Routes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition#getIncludeRoutes <em>Include Routes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition#getInitialDelay <em>Initial Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition#getLoggingLevel <em>Logging Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition#getSupervising <em>Supervising</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition#getThreadPoolSize <em>Thread Pool Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition#getUnhealthyOnExhausted <em>Unhealthy On Exhausted</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition#getUnhealthyOnRestarting <em>Unhealthy On Restarting</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelRouteControllerDefinition()
 * @model extendedMetaData="name='camelRouteControllerDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface CamelRouteControllerDefinition extends IdentifiedType {
	/**
	 * Returns the value of the '<em><b>Back Off Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Backoff delay in millis when restarting a route that failed to startup. Default value: 2000
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Back Off Delay</em>' attribute.
	 * @see #setBackOffDelay(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelRouteControllerDefinition_BackOffDelay()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='backOffDelay'"
	 * @generated
	 */
	String getBackOffDelay();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition#getBackOffDelay <em>Back Off Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Back Off Delay</em>' attribute.
	 * @see #getBackOffDelay()
	 * @generated
	 */
	void setBackOffDelay(String value);

	/**
	 * Returns the value of the '<em><b>Back Off Max Attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Backoff maximum number of attempts to restart a route that failed to startup. When this threshold has been exceeded then
	 * the controller will give up attempting to restart the route, and the route will remain as stopped.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Back Off Max Attempts</em>' attribute.
	 * @see #setBackOffMaxAttempts(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelRouteControllerDefinition_BackOffMaxAttempts()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='backOffMaxAttempts'"
	 * @generated
	 */
	String getBackOffMaxAttempts();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition#getBackOffMaxAttempts <em>Back Off Max Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Back Off Max Attempts</em>' attribute.
	 * @see #getBackOffMaxAttempts()
	 * @generated
	 */
	void setBackOffMaxAttempts(String value);

	/**
	 * Returns the value of the '<em><b>Back Off Max Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Backoff maximum delay in millis when restarting a route that failed to startup.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Back Off Max Delay</em>' attribute.
	 * @see #setBackOffMaxDelay(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelRouteControllerDefinition_BackOffMaxDelay()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='backOffMaxDelay'"
	 * @generated
	 */
	String getBackOffMaxDelay();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition#getBackOffMaxDelay <em>Back Off Max Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Back Off Max Delay</em>' attribute.
	 * @see #getBackOffMaxDelay()
	 * @generated
	 */
	void setBackOffMaxDelay(String value);

	/**
	 * Returns the value of the '<em><b>Back Off Max Elapsed Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Backoff maximum elapsed time in millis, after which the backoff should be considered exhausted and no more attempts
	 * should be made.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Back Off Max Elapsed Time</em>' attribute.
	 * @see #setBackOffMaxElapsedTime(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelRouteControllerDefinition_BackOffMaxElapsedTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='backOffMaxElapsedTime'"
	 * @generated
	 */
	String getBackOffMaxElapsedTime();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition#getBackOffMaxElapsedTime <em>Back Off Max Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Back Off Max Elapsed Time</em>' attribute.
	 * @see #getBackOffMaxElapsedTime()
	 * @generated
	 */
	void setBackOffMaxElapsedTime(String value);

	/**
	 * Returns the value of the '<em><b>Back Off Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Backoff multiplier to use for exponential backoff. This is used to extend the delay between restart attempts. Default
	 * value: 1.0
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Back Off Multiplier</em>' attribute.
	 * @see #setBackOffMultiplier(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelRouteControllerDefinition_BackOffMultiplier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='backOffMultiplier'"
	 * @generated
	 */
	String getBackOffMultiplier();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition#getBackOffMultiplier <em>Back Off Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Back Off Multiplier</em>' attribute.
	 * @see #getBackOffMultiplier()
	 * @generated
	 */
	void setBackOffMultiplier(String value);

	/**
	 * Returns the value of the '<em><b>Exclude Routes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Pattern for filtering routes to be excluded as supervised. The pattern is matching on route id, and endpoint uri for the
	 * route. Multiple patterns can be separated by comma. For example to exclude all JMS routes, you can say jms:. And to
	 * exclude routes with specific route ids mySpecialRoute,myOtherSpecialRoute. The pattern supports wildcards and uses the
	 * matcher from org.apache.camel.support.PatternHelper#matchPattern.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude Routes</em>' attribute.
	 * @see #setExcludeRoutes(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelRouteControllerDefinition_ExcludeRoutes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='excludeRoutes'"
	 * @generated
	 */
	String getExcludeRoutes();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition#getExcludeRoutes <em>Exclude Routes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Routes</em>' attribute.
	 * @see #getExcludeRoutes()
	 * @generated
	 */
	void setExcludeRoutes(String value);

	/**
	 * Returns the value of the '<em><b>Include Routes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Pattern for filtering routes to be included as supervised. The pattern is matching on route id, and endpoint uri for the
	 * route. Multiple patterns can be separated by comma. For example to include all kafka routes, you can say kafka:. And to
	 * include routes with specific route ids myRoute,myOtherRoute. The pattern supports wildcards and uses the matcher from
	 * org.apache.camel.support.PatternHelper#matchPattern.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Routes</em>' attribute.
	 * @see #setIncludeRoutes(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelRouteControllerDefinition_IncludeRoutes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='includeRoutes'"
	 * @generated
	 */
	String getIncludeRoutes();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition#getIncludeRoutes <em>Include Routes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Routes</em>' attribute.
	 * @see #getIncludeRoutes()
	 * @generated
	 */
	void setIncludeRoutes(String value);

	/**
	 * Returns the value of the '<em><b>Initial Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Initial delay in milli seconds before the route controller starts, after CamelContext has been started.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Delay</em>' attribute.
	 * @see #setInitialDelay(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelRouteControllerDefinition_InitialDelay()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='initialDelay'"
	 * @generated
	 */
	String getInitialDelay();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition#getInitialDelay <em>Initial Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Delay</em>' attribute.
	 * @see #getInitialDelay()
	 * @generated
	 */
	void setInitialDelay(String value);

	/**
	 * Returns the value of the '<em><b>Logging Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the logging level used for logging route activity (such as starting and stopping routes). The default logging level
	 * is DEBUG. Default value: DEBUG
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logging Level</em>' attribute.
	 * @see #setLoggingLevel(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelRouteControllerDefinition_LoggingLevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='loggingLevel'"
	 * @generated
	 */
	String getLoggingLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition#getLoggingLevel <em>Logging Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logging Level</em>' attribute.
	 * @see #getLoggingLevel()
	 * @generated
	 */
	void setLoggingLevel(String value);

	/**
	 * Returns the value of the '<em><b>Supervising</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To enable using supervising route controller which allows Camel to start up and then, the controller takes care of
	 * starting the routes in a safe manner. This can be used when you want to start up Camel despite a route may otherwise
	 * fail fast during startup and cause Camel to fail to start up as well. By delegating the route startup to the supervising
	 * route controller then its manages the startup using a background thread. The controller allows to be configured with
	 * various settings to attempt to restart failing routes. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supervising</em>' attribute.
	 * @see #setSupervising(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelRouteControllerDefinition_Supervising()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='supervising'"
	 * @generated
	 */
	String getSupervising();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition#getSupervising <em>Supervising</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supervising</em>' attribute.
	 * @see #getSupervising()
	 * @generated
	 */
	void setSupervising(String value);

	/**
	 * Returns the value of the '<em><b>Thread Pool Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The number of threads used by the scheduled thread pool that are used for restarting routes. The pool uses 1 thread by
	 * default, but you can increase this to allow the controller to concurrently attempt to restart multiple routes in case
	 * more than one route has problems starting. Default value: 1
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thread Pool Size</em>' attribute.
	 * @see #setThreadPoolSize(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelRouteControllerDefinition_ThreadPoolSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='threadPoolSize'"
	 * @generated
	 */
	String getThreadPoolSize();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition#getThreadPoolSize <em>Thread Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Pool Size</em>' attribute.
	 * @see #getThreadPoolSize()
	 * @generated
	 */
	void setThreadPoolSize(String value);

	/**
	 * Returns the value of the '<em><b>Unhealthy On Exhausted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to mark the route as unhealthy (down) when all restarting attempts (backoff) have failed and the route is not
	 * successfully started and the route manager is giving up. Setting this to true allows health checks to know about this
	 * and can report the Camel application as DOWN. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unhealthy On Exhausted</em>' attribute.
	 * @see #setUnhealthyOnExhausted(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelRouteControllerDefinition_UnhealthyOnExhausted()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='unhealthyOnExhausted'"
	 * @generated
	 */
	String getUnhealthyOnExhausted();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition#getUnhealthyOnExhausted <em>Unhealthy On Exhausted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unhealthy On Exhausted</em>' attribute.
	 * @see #getUnhealthyOnExhausted()
	 * @generated
	 */
	void setUnhealthyOnExhausted(String value);

	/**
	 * Returns the value of the '<em><b>Unhealthy On Restarting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to mark the route as unhealthy (down) when the route failed to initially start, and is being controlled for
	 * restarting (backoff). Setting this to true allows health checks to know about this and can report the Camel application
	 * as DOWN. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unhealthy On Restarting</em>' attribute.
	 * @see #setUnhealthyOnRestarting(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelRouteControllerDefinition_UnhealthyOnRestarting()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='unhealthyOnRestarting'"
	 * @generated
	 */
	String getUnhealthyOnRestarting();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition#getUnhealthyOnRestarting <em>Unhealthy On Restarting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unhealthy On Restarting</em>' attribute.
	 * @see #getUnhealthyOnRestarting()
	 * @generated
	 */
	void setUnhealthyOnRestarting(String value);

} // CamelRouteControllerDefinition
