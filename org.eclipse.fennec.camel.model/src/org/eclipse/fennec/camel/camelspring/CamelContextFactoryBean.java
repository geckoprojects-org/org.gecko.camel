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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Context Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getGlobalOptions <em>Global Options</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getPropertyPlaceholder <em>Property Placeholder</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getPackageScan <em>Package Scan</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getContextScan <em>Context Scan</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getStreamCaching <em>Stream Caching</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getJmxAgent <em>Jmx Agent</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getRouteController <em>Route Controller</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getFluentTemplate <em>Fluent Template</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getConsumerTemplate <em>Consumer Template</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getErrorHandler <em>Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getDefaultServiceCallConfiguration <em>Default Service Call Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getServiceCallConfiguration <em>Service Call Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getDefaultResilience4jConfiguration <em>Default Resilience4j Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getResilience4jConfiguration <em>Resilience4j Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getDefaultFaultToleranceConfiguration <em>Default Fault Tolerance Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getFaultToleranceConfiguration <em>Fault Tolerance Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getRouteConfigurationContextRef <em>Route Configuration Context Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getRouteTemplateContextRef <em>Route Template Context Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getRouteBuilder <em>Route Builder</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getRouteContextRef <em>Route Context Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getRestContextRef <em>Rest Context Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getThreadPoolProfile <em>Thread Pool Profile</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getThreadPool <em>Thread Pool</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getDataFormats <em>Data Formats</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getTransformers <em>Transformers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getValidators <em>Validators</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getRedeliveryPolicyProfile <em>Redelivery Policy Profile</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getInterceptSendToEndpoint <em>Intercept Send To Endpoint</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getRestConfiguration <em>Rest Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getRest <em>Rest</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getRouteConfiguration <em>Route Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getRouteTemplate <em>Route Template</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getTemplatedRoute <em>Templated Route</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getRoute <em>Route</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getAllowUseOriginalMessage <em>Allow Use Original Message</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getAutoStartup <em>Auto Startup</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getAutowiredEnabled <em>Autowired Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getBacklogTrace <em>Backlog Trace</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getBeanPostProcessorEnabled <em>Bean Post Processor Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getCaseInsensitiveHeaders <em>Case Insensitive Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getDebug <em>Debug</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getDelayer <em>Delayer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getDumpRoutes <em>Dump Routes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getErrorHandlerRef <em>Error Handler Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getInflightRepositoryBrowseEnabled <em>Inflight Repository Browse Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getLoadHealthChecks <em>Load Health Checks</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getLoadTypeConverters <em>Load Type Converters</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getLogExhaustedMessageBody <em>Log Exhausted Message Body</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getLogMask <em>Log Mask</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getManagementNamePattern <em>Management Name Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getMdcLoggingKeysPattern <em>Mdc Logging Keys Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getMessageHistory <em>Message History</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getRuntimeEndpointRegistryEnabled <em>Runtime Endpoint Registry Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getShutdownEager <em>Shutdown Eager</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getShutdownRoute <em>Shutdown Route</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getShutdownRunningTask <em>Shutdown Running Task</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getSourceLocationEnabled <em>Source Location Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getStartupSummaryLevel <em>Startup Summary Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getStreamCache <em>Stream Cache</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getThreadNamePattern <em>Thread Name Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getTrace <em>Trace</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getTraceLoggingFormat <em>Trace Logging Format</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getTracePattern <em>Trace Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getTypeConverterExists <em>Type Converter Exists</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getTypeConverterExistsLoggingLevel <em>Type Converter Exists Logging Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getTypeConverterStatisticsEnabled <em>Type Converter Statistics Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getUseBreadcrumb <em>Use Breadcrumb</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getUseDataType <em>Use Data Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getUseMDCLogging <em>Use MDC Logging</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean()
 * @model extendedMetaData="name='camelContextFactoryBean' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CamelContextFactoryBean extends AbstractCamelContextFactoryBean {
	/**
	 * Returns the value of the '<em><b>Global Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Models a series of string key/value pairs for configuring some global options on a Camel context such as max debug log
	 * length.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Global Options</em>' containment reference.
	 * @see #setGlobalOptions(GlobalOptionsDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_GlobalOptions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='globalOptions' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalOptionsDefinition getGlobalOptions();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getGlobalOptions <em>Global Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Options</em>' containment reference.
	 * @see #getGlobalOptions()
	 * @generated
	 */
	void setGlobalOptions(GlobalOptionsDefinition value);

	/**
	 * Returns the value of the '<em><b>Property Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Properties placeholder
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property Placeholder</em>' containment reference.
	 * @see #setPropertyPlaceholder(CamelPropertyPlaceholderDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_PropertyPlaceholder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='propertyPlaceholder' namespace='##targetNamespace'"
	 * @generated
	 */
	CamelPropertyPlaceholderDefinition getPropertyPlaceholder();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getPropertyPlaceholder <em>Property Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Placeholder</em>' containment reference.
	 * @see #getPropertyPlaceholder()
	 * @generated
	 */
	void setPropertyPlaceholder(CamelPropertyPlaceholderDefinition value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the package names to be recursively searched for Java classes which extend org.apache.camel.builder.RouteBuilder to
	 * be auto-wired up to the CamelContext as a route. Note that classes are excluded if they are specifically configured in
	 * the spring.xml A more advanced configuration can be done using
	 * setPackageScan(org.apache.camel.model.PackageScanDefinition).
	 * 
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package</em>' attribute list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_Package()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='package' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getPackage();

	/**
	 * Returns the value of the '<em><b>Package Scan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Scans for Java org.apache.camel.builder.RouteBuilder classes in java packages
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Scan</em>' containment reference.
	 * @see #setPackageScan(PackageScanDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_PackageScan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='packageScan' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageScanDefinition getPackageScan();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getPackageScan <em>Package Scan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Scan</em>' containment reference.
	 * @see #getPackageScan()
	 * @generated
	 */
	void setPackageScan(PackageScanDefinition value);

	/**
	 * Returns the value of the '<em><b>Context Scan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Scans for Java org.apache.camel.builder.RouteBuilder instances in the context org.apache.camel.spi.Registry .
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Scan</em>' containment reference.
	 * @see #setContextScan(ContextScanDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_ContextScan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contextScan' namespace='##targetNamespace'"
	 * @generated
	 */
	ContextScanDefinition getContextScan();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getContextScan <em>Context Scan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Scan</em>' containment reference.
	 * @see #getContextScan()
	 * @generated
	 */
	void setContextScan(ContextScanDefinition value);

	/**
	 * Returns the value of the '<em><b>Stream Caching</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Stream caching configuration.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stream Caching</em>' containment reference.
	 * @see #setStreamCaching(CamelStreamCachingStrategyDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_StreamCaching()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='streamCaching' namespace='##targetNamespace'"
	 * @generated
	 */
	CamelStreamCachingStrategyDefinition getStreamCaching();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getStreamCaching <em>Stream Caching</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stream Caching</em>' containment reference.
	 * @see #getStreamCaching()
	 * @generated
	 */
	void setStreamCaching(CamelStreamCachingStrategyDefinition value);

	/**
	 * Returns the value of the '<em><b>Jmx Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * JMX configuration.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jmx Agent</em>' containment reference.
	 * @see #setJmxAgent(CamelJMXAgentDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_JmxAgent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jmxAgent' namespace='##targetNamespace'"
	 * @generated
	 */
	CamelJMXAgentDefinition getJmxAgent();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getJmxAgent <em>Jmx Agent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jmx Agent</em>' containment reference.
	 * @see #getJmxAgent()
	 * @generated
	 */
	void setJmxAgent(CamelJMXAgentDefinition value);

	/**
	 * Returns the value of the '<em><b>Route Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Route controller configuration.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Controller</em>' containment reference.
	 * @see #setRouteController(CamelRouteControllerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_RouteController()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='routeController' namespace='##targetNamespace'"
	 * @generated
	 */
	CamelRouteControllerDefinition getRouteController();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getRouteController <em>Route Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Controller</em>' containment reference.
	 * @see #getRouteController()
	 * @generated
	 */
	void setRouteController(CamelRouteControllerDefinition value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:9'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Template</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.CamelProducerTemplateFactoryBean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configures a ProducerTemplate
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_Template()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='template' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<CamelProducerTemplateFactoryBean> getTemplate();

	/**
	 * Returns the value of the '<em><b>Fluent Template</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.CamelFluentProducerTemplateFactoryBean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configures a org.apache.camel.FluentProducerTemplate
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fluent Template</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_FluentTemplate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fluentTemplate' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<CamelFluentProducerTemplateFactoryBean> getFluentTemplate();

	/**
	 * Returns the value of the '<em><b>Consumer Template</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.CamelConsumerTemplateFactoryBean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configures a ConsumerTemplate
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consumer Template</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_ConsumerTemplate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='consumerTemplate' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<CamelConsumerTemplateFactoryBean> getConsumerTemplate();

	/**
	 * Returns the value of the '<em><b>Error Handler</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Camel error handling.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Handler</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_ErrorHandler()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='errorHandler' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EObject> getErrorHandler();

	/**
	 * Returns the value of the '<em><b>Default Service Call Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * ServiceCall EIP default configuration.
	 * 
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Service Call Configuration</em>' containment reference.
	 * @see #setDefaultServiceCallConfiguration(ServiceCallConfigurationDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_DefaultServiceCallConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultServiceCallConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCallConfigurationDefinition getDefaultServiceCallConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getDefaultServiceCallConfiguration <em>Default Service Call Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Service Call Configuration</em>' containment reference.
	 * @see #getDefaultServiceCallConfiguration()
	 * @generated
	 */
	void setDefaultServiceCallConfiguration(ServiceCallConfigurationDefinition value);

	/**
	 * Returns the value of the '<em><b>Service Call Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: Remote service call configuration
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Call Configuration</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_ServiceCallConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='serviceCallConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ServiceCallConfigurationDefinition> getServiceCallConfiguration();

	/**
	 * Returns the value of the '<em><b>Default Resilience4j Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Resilience4j EIP default configuration.
	 * 
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Resilience4j Configuration</em>' containment reference.
	 * @see #setDefaultResilience4jConfiguration(Resilience4JConfigurationDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_DefaultResilience4jConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultResilience4jConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	Resilience4JConfigurationDefinition getDefaultResilience4jConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getDefaultResilience4jConfiguration <em>Default Resilience4j Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Resilience4j Configuration</em>' containment reference.
	 * @see #getDefaultResilience4jConfiguration()
	 * @generated
	 */
	void setDefaultResilience4jConfiguration(Resilience4JConfigurationDefinition value);

	/**
	 * Returns the value of the '<em><b>Resilience4j Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Resilience4j Circuit Breaker EIP configuration
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resilience4j Configuration</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_Resilience4jConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resilience4jConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Resilience4JConfigurationDefinition> getResilience4jConfiguration();

	/**
	 * Returns the value of the '<em><b>Default Fault Tolerance Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * MicroProfile Fault Tolerance EIP default configuration.
	 * 
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Fault Tolerance Configuration</em>' containment reference.
	 * @see #setDefaultFaultToleranceConfiguration(FaultToleranceConfigurationDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_DefaultFaultToleranceConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultFaultToleranceConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	FaultToleranceConfigurationDefinition getDefaultFaultToleranceConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getDefaultFaultToleranceConfiguration <em>Default Fault Tolerance Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Fault Tolerance Configuration</em>' containment reference.
	 * @see #getDefaultFaultToleranceConfiguration()
	 * @generated
	 */
	void setDefaultFaultToleranceConfiguration(FaultToleranceConfigurationDefinition value);

	/**
	 * Returns the value of the '<em><b>Fault Tolerance Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * MicroProfile Circuit Breaker EIP configurations.
	 * 
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fault Tolerance Configuration</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_FaultToleranceConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='faultToleranceConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Resilience4JConfigurationDefinition> getFaultToleranceConfiguration();

	/**
	 * Returns the value of the '<em><b>Route Configuration Context Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RouteConfigurationContextRefDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To refer to an XML file with route configuration defined using the xml-dsl
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Configuration Context Ref</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_RouteConfigurationContextRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='routeConfigurationContextRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RouteConfigurationContextRefDefinition> getRouteConfigurationContextRef();

	/**
	 * Returns the value of the '<em><b>Route Template Context Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RouteTemplateContextRefDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To refer to an XML file with route templates defined using the xml-dsl
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Template Context Ref</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_RouteTemplateContextRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='routeTemplateContextRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RouteTemplateContextRefDefinition> getRouteTemplateContextRef();

	/**
	 * Returns the value of the '<em><b>Route Builder</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RouteBuilderDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To refer to a Java org.apache.camel.builder.RouteBuilder instance to use.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Builder</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_RouteBuilder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='routeBuilder' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RouteBuilderDefinition> getRouteBuilder();

	/**
	 * Returns the value of the '<em><b>Route Context Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RouteContextRefDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To refer to an XML file with routes defined using the xml-dsl
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Context Ref</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_RouteContextRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='routeContextRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RouteContextRefDefinition> getRouteContextRef();

	/**
	 * Returns the value of the '<em><b>Rest Context Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RestContextRefDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To refer to an XML file with rest services defined using the rest-dsl
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rest Context Ref</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_RestContextRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='restContextRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RestContextRefDefinition> getRestContextRef();

	/**
	 * Returns the value of the '<em><b>Thread Pool Profile</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ThreadPoolProfileDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To configure thread pools
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thread Pool Profile</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_ThreadPoolProfile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='threadPoolProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ThreadPoolProfileDefinition> getThreadPoolProfile();

	/**
	 * Returns the value of the '<em><b>Thread Pool</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.CamelThreadPoolFactoryBean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configuration of thread pools
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thread Pool</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_ThreadPool()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='threadPool' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CamelThreadPoolFactoryBean> getThreadPool();

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.CamelEndpointFactoryBean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Camel endpoint configuration
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_Endpoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CamelEndpointFactoryBean> getEndpoint();

	/**
	 * Returns the value of the '<em><b>Data Formats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configure data formats.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Formats</em>' containment reference.
	 * @see #setDataFormats(DataFormatsDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_DataFormats()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataFormats' namespace='##targetNamespace'"
	 * @generated
	 */
	DataFormatsDefinition getDataFormats();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getDataFormats <em>Data Formats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Formats</em>' containment reference.
	 * @see #getDataFormats()
	 * @generated
	 */
	void setDataFormats(DataFormatsDefinition value);

	/**
	 * Returns the value of the '<em><b>Transformers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To configure transformers.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transformers</em>' containment reference.
	 * @see #setTransformers(TransformersDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_Transformers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transformers' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformersDefinition getTransformers();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getTransformers <em>Transformers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformers</em>' containment reference.
	 * @see #getTransformers()
	 * @generated
	 */
	void setTransformers(TransformersDefinition value);

	/**
	 * Returns the value of the '<em><b>Validators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To configure validators.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validators</em>' containment reference.
	 * @see #setValidators(ValidatorsDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_Validators()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validators' namespace='##targetNamespace'"
	 * @generated
	 */
	ValidatorsDefinition getValidators();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getValidators <em>Validators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validators</em>' containment reference.
	 * @see #getValidators()
	 * @generated
	 */
	void setValidators(ValidatorsDefinition value);

	/**
	 * Returns the value of the '<em><b>Redelivery Policy Profile</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.CamelRedeliveryPolicyFactoryBean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configuration of redelivery policy.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redelivery Policy Profile</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_RedeliveryPolicyProfile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='redeliveryPolicyProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CamelRedeliveryPolicyFactoryBean> getRedeliveryPolicyProfile();

	/**
	 * Returns the value of the '<em><b>On Exception</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.OnExceptionDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Route to be executed when an exception is thrown
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Exception</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_OnException()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onException' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OnExceptionDefinition> getOnException();

	/**
	 * Returns the value of the '<em><b>On Completion</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.OnCompletionDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Route to be executed when normal route processing completes
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Completion</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_OnCompletion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onCompletion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OnCompletionDefinition> getOnCompletion();

	/**
	 * Returns the value of the '<em><b>Intercept</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.InterceptDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Intercepts a message at each step in the route
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intercept</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_Intercept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='intercept' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InterceptDefinition> getIntercept();

	/**
	 * Returns the value of the '<em><b>Intercept From</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.InterceptFromDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Intercepts incoming messages
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intercept From</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_InterceptFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interceptFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InterceptFromDefinition> getInterceptFrom();

	/**
	 * Returns the value of the '<em><b>Intercept Send To Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.InterceptSendToEndpointDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Intercepts messages being sent to an endpoint
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intercept Send To Endpoint</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_InterceptSendToEndpoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interceptSendToEndpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InterceptSendToEndpointDefinition> getInterceptSendToEndpoint();

	/**
	 * Returns the value of the '<em><b>Rest Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To configure rest
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rest Configuration</em>' containment reference.
	 * @see #setRestConfiguration(RestConfigurationDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_RestConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='restConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	RestConfigurationDefinition getRestConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getRestConfiguration <em>Rest Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest Configuration</em>' containment reference.
	 * @see #getRestConfiguration()
	 * @generated
	 */
	void setRestConfiguration(RestConfigurationDefinition value);

	/**
	 * Returns the value of the '<em><b>Rest</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RestDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Defines a rest service using the rest-dsl
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rest</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_Rest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rest' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RestDefinition> getRest();

	/**
	 * Returns the value of the '<em><b>Route Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RouteConfigurationDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Reusable configuration for Camel route(s).
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Configuration</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_RouteConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='routeConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RouteConfigurationDefinition> getRouteConfiguration();

	/**
	 * Returns the value of the '<em><b>Route Template</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RouteTemplateDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Defines a route template (parameterized routes)
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Template</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_RouteTemplate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='routeTemplate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RouteTemplateDefinition> getRouteTemplate();

	/**
	 * Returns the value of the '<em><b>Templated Route</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.TemplatedRouteDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Defines a templated route (a route built from a route template)
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Templated Route</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_TemplatedRoute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='templatedRoute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TemplatedRouteDefinition> getTemplatedRoute();

	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RouteDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A Camel route
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_Route()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='route' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RouteDefinition> getRoute();

	/**
	 * Returns the value of the '<em><b>Allow Use Original Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether to allow access to the original message from Camel's error handler, or from
	 * org.apache.camel.spi.UnitOfWork#getOriginalInMessage() . Turning this off can optimize performance, as defensive copy of
	 * the original message is not needed.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Use Original Message</em>' attribute.
	 * @see #setAllowUseOriginalMessage(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_AllowUseOriginalMessage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowUseOriginalMessage'"
	 * @generated
	 */
	String getAllowUseOriginalMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getAllowUseOriginalMessage <em>Allow Use Original Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Use Original Message</em>' attribute.
	 * @see #getAllowUseOriginalMessage()
	 * @generated
	 */
	void setAllowUseOriginalMessage(String value);

	/**
	 * Returns the value of the '<em><b>Auto Startup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether the object should automatically start when Camel starts. Important: Currently only routes can be disabled,
	 * as CamelContext s are always started. Note: When setting auto startup false on CamelContext then that takes precedence
	 * and no routes is started. You would need to start CamelContext explicit using the org.apache.camel.CamelContext#start()
	 * method, to start the context, and then you would need to start the routes manually using
	 * org.apache.camel.spi.RouteController#startRoute(String) . Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Startup</em>' attribute.
	 * @see #setAutoStartup(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_AutoStartup()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='autoStartup'"
	 * @generated
	 */
	String getAutoStartup();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getAutoStartup <em>Auto Startup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Startup</em>' attribute.
	 * @see #getAutoStartup()
	 * @generated
	 */
	void setAutoStartup(String value);

	/**
	 * Returns the value of the '<em><b>Autowired Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by
	 * looking up in the registry to find if there is a single instance of matching type, which then gets configured on the
	 * component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.
	 * Default is true.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Autowired Enabled</em>' attribute.
	 * @see #setAutowiredEnabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_AutowiredEnabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='autowiredEnabled'"
	 * @generated
	 */
	String getAutowiredEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getAutowiredEnabled <em>Autowired Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autowired Enabled</em>' attribute.
	 * @see #getAutowiredEnabled()
	 * @generated
	 */
	void setAutowiredEnabled(String value);

	/**
	 * Returns the value of the '<em><b>Backlog Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether backlog tracing is enabled or not. To use backlog tracing then this must be enabled on startup to be
	 * installed in the CamelContext.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Backlog Trace</em>' attribute.
	 * @see #setBacklogTrace(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_BacklogTrace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='backlogTrace'"
	 * @generated
	 */
	String getBacklogTrace();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getBacklogTrace <em>Backlog Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backlog Trace</em>' attribute.
	 * @see #getBacklogTrace()
	 * @generated
	 */
	void setBacklogTrace(String value);

	/**
	 * Returns the value of the '<em><b>Bean Post Processor Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Can be used to turn off bean post processing. Be careful to turn this off, as this means that beans that use Camel
	 * annotations such as org.apache.camel.EndpointInject , org.apache.camel.ProducerTemplate , org.apache.camel.Produce ,
	 * org.apache.camel.Consume etc will not be injected and in use. Turning this off should only be done if you are sure you
	 * do not use any of these Camel features. Not all runtimes allow turning this off. The default value is true (enabled).
	 * Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bean Post Processor Enabled</em>' attribute.
	 * @see #setBeanPostProcessorEnabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_BeanPostProcessorEnabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='beanPostProcessorEnabled'"
	 * @generated
	 */
	String getBeanPostProcessorEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getBeanPostProcessorEnabled <em>Bean Post Processor Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bean Post Processor Enabled</em>' attribute.
	 * @see #getBeanPostProcessorEnabled()
	 * @generated
	 */
	void setBeanPostProcessorEnabled(String value);

	/**
	 * Returns the value of the '<em><b>Case Insensitive Headers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to use case sensitive or insensitive headers. Important: When using case sensitive (this is set to false). Then
	 * the map is case sensitive which means headers such as content-type and Content-Type are two different keys which can be
	 * a problem for some protocols such as HTTP based, which rely on case insensitive headers. However case sensitive
	 * implementations can yield faster performance. Therefore use case sensitive implementation with care. Default is true.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Insensitive Headers</em>' attribute.
	 * @see #setCaseInsensitiveHeaders(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_CaseInsensitiveHeaders()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='caseInsensitiveHeaders'"
	 * @generated
	 */
	String getCaseInsensitiveHeaders();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getCaseInsensitiveHeaders <em>Case Insensitive Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Insensitive Headers</em>' attribute.
	 * @see #getCaseInsensitiveHeaders()
	 * @generated
	 */
	void setCaseInsensitiveHeaders(String value);

	/**
	 * Returns the value of the '<em><b>Debug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether debugging is enabled or not. To use debugging then this must be enabled on startup to be installed in the
	 * CamelContext.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Debug</em>' attribute.
	 * @see #setDebug(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_Debug()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='debug'"
	 * @generated
	 */
	String getDebug();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getDebug <em>Debug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debug</em>' attribute.
	 * @see #getDebug()
	 * @generated
	 */
	void setDebug(String value);

	/**
	 * Returns the value of the '<em><b>Delayer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets a delay value in millis that a message is delayed at every step it takes in the route path, slowing the process
	 * down to better observe what is occurring.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delayer</em>' attribute.
	 * @see #setDelayer(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_Delayer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='delayer'"
	 * @generated
	 */
	String getDelayer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getDelayer <em>Delayer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delayer</em>' attribute.
	 * @see #getDelayer()
	 * @generated
	 */
	void setDelayer(String value);

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * List of other bean id's this CamelContext depends up. Multiple bean id's can be separated by comma.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depends On</em>' attribute.
	 * @see #setDependsOn(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_DependsOn()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='depends-on'"
	 * @generated
	 */
	String getDependsOn();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getDependsOn <em>Depends On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends On</em>' attribute.
	 * @see #getDependsOn()
	 * @generated
	 */
	void setDependsOn(String value);

	/**
	 * Returns the value of the '<em><b>Dump Routes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If dumping is enabled then Camel will during startup dump all loaded routes (incl rests and route templates) represented
	 * as XML DSL into the log. This is intended for trouble shooting or to assist during development. Sensitive information
	 * that may be configured in the route endpoints could potentially be included in the dump output and is therefore not
	 * recommended to be used for production usage. This requires to have camel-xml-jaxb on the classpath to be able to dump
	 * the routes as XML. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dump Routes</em>' attribute.
	 * @see #setDumpRoutes(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_DumpRoutes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='dumpRoutes'"
	 * @generated
	 */
	String getDumpRoutes();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getDumpRoutes <em>Dump Routes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dump Routes</em>' attribute.
	 * @see #getDumpRoutes()
	 * @generated
	 */
	void setDumpRoutes(String value);

	/**
	 * Returns the value of the '<em><b>Error Handler Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the name of the error handler object used to default the error handling strategy.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Handler Ref</em>' attribute.
	 * @see #setErrorHandlerRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_ErrorHandlerRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='errorHandlerRef'"
	 * @generated
	 */
	String getErrorHandlerRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getErrorHandlerRef <em>Error Handler Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Handler Ref</em>' attribute.
	 * @see #getErrorHandlerRef()
	 * @generated
	 */
	void setErrorHandlerRef(String value);

	/**
	 * Returns the value of the '<em><b>Inflight Repository Browse Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether the inflight repository should allow browsing each inflight exchange. This is by default disabled as there
	 * is a very slight performance overhead when enabled.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inflight Repository Browse Enabled</em>' attribute.
	 * @see #setInflightRepositoryBrowseEnabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_InflightRepositoryBrowseEnabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='inflightRepositoryBrowseEnabled'"
	 * @generated
	 */
	String getInflightRepositoryBrowseEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getInflightRepositoryBrowseEnabled <em>Inflight Repository Browse Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inflight Repository Browse Enabled</em>' attribute.
	 * @see #getInflightRepositoryBrowseEnabled()
	 * @generated
	 */
	void setInflightRepositoryBrowseEnabled(String value);

	/**
	 * Returns the value of the '<em><b>Load Health Checks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to load custom health checks by scanning classpath. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Health Checks</em>' attribute.
	 * @see #setLoadHealthChecks(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_LoadHealthChecks()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='loadHealthChecks'"
	 * @generated
	 */
	String getLoadHealthChecks();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getLoadHealthChecks <em>Load Health Checks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Health Checks</em>' attribute.
	 * @see #getLoadHealthChecks()
	 * @generated
	 */
	void setLoadHealthChecks(String value);

	/**
	 * Returns the value of the '<em><b>Load Type Converters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to load custom type converters by scanning classpath. This is used for backwards compatibility with Camel 2.x.
	 * Its recommended to migrate to use fast type converter loading by setting Converter(loader = true) on your custom type
	 * converter classes. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Type Converters</em>' attribute.
	 * @see #setLoadTypeConverters(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_LoadTypeConverters()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='loadTypeConverters'"
	 * @generated
	 */
	String getLoadTypeConverters();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getLoadTypeConverters <em>Load Type Converters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Type Converters</em>' attribute.
	 * @see #getLoadTypeConverters()
	 * @generated
	 */
	void setLoadTypeConverters(String value);

	/**
	 * Returns the value of the '<em><b>Log Exhausted Message Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether to log exhausted message body with message history.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Exhausted Message Body</em>' attribute.
	 * @see #setLogExhaustedMessageBody(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_LogExhaustedMessageBody()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logExhaustedMessageBody'"
	 * @generated
	 */
	String getLogExhaustedMessageBody();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getLogExhaustedMessageBody <em>Log Exhausted Message Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Exhausted Message Body</em>' attribute.
	 * @see #getLogExhaustedMessageBody()
	 * @generated
	 */
	void setLogExhaustedMessageBody(String value);

	/**
	 * Returns the value of the '<em><b>Log Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether security mask for Logging is enabled or not. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Mask</em>' attribute.
	 * @see #setLogMask(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_LogMask()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logMask'"
	 * @generated
	 */
	String getLogMask();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getLogMask <em>Log Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Mask</em>' attribute.
	 * @see #getLogMask()
	 * @generated
	 */
	void setLogMask(String value);

	/**
	 * Returns the value of the '<em><b>Management Name Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The naming pattern for creating the CamelContext management name. Default value: #name#
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Management Name Pattern</em>' attribute.
	 * @see #setManagementNamePattern(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_ManagementNamePattern()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='managementNamePattern'"
	 * @generated
	 */
	String getManagementNamePattern();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getManagementNamePattern <em>Management Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Management Name Pattern</em>' attribute.
	 * @see #getManagementNamePattern()
	 * @generated
	 */
	void setManagementNamePattern(String value);

	/**
	 * Returns the value of the '<em><b>Mdc Logging Keys Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the pattern used for determine which custom MDC keys to propagate during message routing when the routing engine
	 * continues routing asynchronously for the given message. Setting this pattern to will propagate all custom keys. Or
	 * setting the pattern to foo,bar will propagate any keys starting with either foo or bar. Notice that a set of standard
	 * Camel MDC keys are always propagated which starts with camel. as key name. The match rules are applied in this order
	 * (case insensitive): 1. exact match, returns true 2. wildcard match (pattern ends with a and the name starts with the
	 * pattern), returns true 3. regular expression match, returns true 4. otherwise returns false.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mdc Logging Keys Pattern</em>' attribute.
	 * @see #setMdcLoggingKeysPattern(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_MdcLoggingKeysPattern()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mdcLoggingKeysPattern'"
	 * @generated
	 */
	String getMdcLoggingKeysPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getMdcLoggingKeysPattern <em>Mdc Logging Keys Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdc Logging Keys Pattern</em>' attribute.
	 * @see #getMdcLoggingKeysPattern()
	 * @generated
	 */
	void setMdcLoggingKeysPattern(String value);

	/**
	 * Returns the value of the '<em><b>Message History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether message history is enabled or not. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message History</em>' attribute.
	 * @see #setMessageHistory(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_MessageHistory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='messageHistory'"
	 * @generated
	 */
	String getMessageHistory();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getMessageHistory <em>Message History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message History</em>' attribute.
	 * @see #getMessageHistory()
	 * @generated
	 */
	void setMessageHistory(String value);

	/**
	 * Returns the value of the '<em><b>Runtime Endpoint Registry Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether org.apache.camel.spi.RuntimeEndpointRegistry is enabled.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Runtime Endpoint Registry Enabled</em>' attribute.
	 * @see #setRuntimeEndpointRegistryEnabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_RuntimeEndpointRegistryEnabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='runtimeEndpointRegistryEnabled'"
	 * @generated
	 */
	String getRuntimeEndpointRegistryEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getRuntimeEndpointRegistryEnabled <em>Runtime Endpoint Registry Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Endpoint Registry Enabled</em>' attribute.
	 * @see #getRuntimeEndpointRegistryEnabled()
	 * @generated
	 */
	void setRuntimeEndpointRegistryEnabled(String value);

	/**
	 * Returns the value of the '<em><b>Shutdown Eager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to shutdown CamelContext eager when Spring is shutting down. This ensure a cleaner shutdown of Camel, as
	 * dependent bean's are not shutdown at this moment. The bean's will then be shutdown after camelContext. Default value:
	 * true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shutdown Eager</em>' attribute.
	 * @see #setShutdownEager(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_ShutdownEager()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='shutdownEager'"
	 * @generated
	 */
	String getShutdownEager();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getShutdownEager <em>Shutdown Eager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shutdown Eager</em>' attribute.
	 * @see #getShutdownEager()
	 * @generated
	 */
	void setShutdownEager(String value);

	/**
	 * Returns the value of the '<em><b>Shutdown Route</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.camel.camelspring.ShutdownRoute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the ShutdownRoute option for routes. Default value: Default
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shutdown Route</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.ShutdownRoute
	 * @see #isSetShutdownRoute()
	 * @see #unsetShutdownRoute()
	 * @see #setShutdownRoute(ShutdownRoute)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_ShutdownRoute()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='shutdownRoute'"
	 * @generated
	 */
	ShutdownRoute getShutdownRoute();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getShutdownRoute <em>Shutdown Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shutdown Route</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.ShutdownRoute
	 * @see #isSetShutdownRoute()
	 * @see #unsetShutdownRoute()
	 * @see #getShutdownRoute()
	 * @generated
	 */
	void setShutdownRoute(ShutdownRoute value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getShutdownRoute <em>Shutdown Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShutdownRoute()
	 * @see #getShutdownRoute()
	 * @see #setShutdownRoute(ShutdownRoute)
	 * @generated
	 */
	void unsetShutdownRoute();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getShutdownRoute <em>Shutdown Route</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shutdown Route</em>' attribute is set.
	 * @see #unsetShutdownRoute()
	 * @see #getShutdownRoute()
	 * @see #setShutdownRoute(ShutdownRoute)
	 * @generated
	 */
	boolean isSetShutdownRoute();

	/**
	 * Returns the value of the '<em><b>Shutdown Running Task</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.camel.camelspring.ShutdownRunningTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the ShutdownRunningTask option to use when shutting down a route. Default value: CompleteCurrentTaskOnly
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shutdown Running Task</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.ShutdownRunningTask
	 * @see #isSetShutdownRunningTask()
	 * @see #unsetShutdownRunningTask()
	 * @see #setShutdownRunningTask(ShutdownRunningTask)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_ShutdownRunningTask()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='shutdownRunningTask'"
	 * @generated
	 */
	ShutdownRunningTask getShutdownRunningTask();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getShutdownRunningTask <em>Shutdown Running Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shutdown Running Task</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.ShutdownRunningTask
	 * @see #isSetShutdownRunningTask()
	 * @see #unsetShutdownRunningTask()
	 * @see #getShutdownRunningTask()
	 * @generated
	 */
	void setShutdownRunningTask(ShutdownRunningTask value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getShutdownRunningTask <em>Shutdown Running Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShutdownRunningTask()
	 * @see #getShutdownRunningTask()
	 * @see #setShutdownRunningTask(ShutdownRunningTask)
	 * @generated
	 */
	void unsetShutdownRunningTask();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getShutdownRunningTask <em>Shutdown Running Task</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shutdown Running Task</em>' attribute is set.
	 * @see #unsetShutdownRunningTask()
	 * @see #getShutdownRunningTask()
	 * @see #setShutdownRunningTask(ShutdownRunningTask)
	 * @generated
	 */
	boolean isSetShutdownRunningTask();

	/**
	 * Returns the value of the '<em><b>Source Location Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to capture precise source location:line-number for all EIPs in Camel routes. Enabling this will impact parsing
	 * Java based routes (also Groovy, etc.) on startup as this uses JDK StackTraceElement to calculate the location from the
	 * Camel route, which comes with a performance cost. This only impact startup, not the performance of the routes at
	 * runtime. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Location Enabled</em>' attribute.
	 * @see #setSourceLocationEnabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_SourceLocationEnabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='sourceLocationEnabled'"
	 * @generated
	 */
	String getSourceLocationEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getSourceLocationEnabled <em>Source Location Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Location Enabled</em>' attribute.
	 * @see #getSourceLocationEnabled()
	 * @generated
	 */
	void setSourceLocationEnabled(String value);

	/**
	 * Returns the value of the '<em><b>Startup Summary Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.camel.camelspring.StartupSummaryLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Controls the level of information logged during startup (and shutdown) of CamelContext. Default value: Default
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Startup Summary Level</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.StartupSummaryLevel
	 * @see #isSetStartupSummaryLevel()
	 * @see #unsetStartupSummaryLevel()
	 * @see #setStartupSummaryLevel(StartupSummaryLevel)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_StartupSummaryLevel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='startupSummaryLevel'"
	 * @generated
	 */
	StartupSummaryLevel getStartupSummaryLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getStartupSummaryLevel <em>Startup Summary Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Summary Level</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.StartupSummaryLevel
	 * @see #isSetStartupSummaryLevel()
	 * @see #unsetStartupSummaryLevel()
	 * @see #getStartupSummaryLevel()
	 * @generated
	 */
	void setStartupSummaryLevel(StartupSummaryLevel value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getStartupSummaryLevel <em>Startup Summary Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartupSummaryLevel()
	 * @see #getStartupSummaryLevel()
	 * @see #setStartupSummaryLevel(StartupSummaryLevel)
	 * @generated
	 */
	void unsetStartupSummaryLevel();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getStartupSummaryLevel <em>Startup Summary Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Startup Summary Level</em>' attribute is set.
	 * @see #unsetStartupSummaryLevel()
	 * @see #getStartupSummaryLevel()
	 * @see #setStartupSummaryLevel(StartupSummaryLevel)
	 * @generated
	 */
	boolean isSetStartupSummaryLevel();

	/**
	 * Returns the value of the '<em><b>Stream Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether stream caching is enabled or not.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stream Cache</em>' attribute.
	 * @see #setStreamCache(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_StreamCache()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='streamCache'"
	 * @generated
	 */
	String getStreamCache();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getStreamCache <em>Stream Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stream Cache</em>' attribute.
	 * @see #getStreamCache()
	 * @generated
	 */
	void setStreamCache(String value);

	/**
	 * Returns the value of the '<em><b>Thread Name Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the thread name pattern used for creating the full thread name. The default pattern is: Camel (#camelId#) thread
	 * ##counter# - #name# Where #camelId# is the name of the org.apache.camel.CamelContext and #counter# is a unique
	 * incrementing counter. and #name# is the regular thread name. You can also use #longName# is the long thread name which
	 * can includes endpoint parameters etc. Default value: Camel (#camelId#) thread ##counter# - #name#
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thread Name Pattern</em>' attribute.
	 * @see #setThreadNamePattern(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_ThreadNamePattern()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='threadNamePattern'"
	 * @generated
	 */
	String getThreadNamePattern();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getThreadNamePattern <em>Thread Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Name Pattern</em>' attribute.
	 * @see #getThreadNamePattern()
	 * @generated
	 */
	void setThreadNamePattern(String value);

	/**
	 * Returns the value of the '<em><b>Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether tracing is enabled or not. To use tracing then this must be enabled on startup to be installed in the
	 * CamelContext.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trace</em>' attribute.
	 * @see #setTrace(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_Trace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='trace'"
	 * @generated
	 */
	String getTrace();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getTrace <em>Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace</em>' attribute.
	 * @see #getTrace()
	 * @generated
	 */
	void setTrace(String value);

	/**
	 * Returns the value of the '<em><b>Trace Logging Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a custom tracing logging format. The default format (arrow, routeId, label) is: %-4.4s %-12.12s %-33.33s.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trace Logging Format</em>' attribute.
	 * @see #setTraceLoggingFormat(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_TraceLoggingFormat()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='traceLoggingFormat'"
	 * @generated
	 */
	String getTraceLoggingFormat();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getTraceLoggingFormat <em>Trace Logging Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Logging Format</em>' attribute.
	 * @see #getTraceLoggingFormat()
	 * @generated
	 */
	void setTraceLoggingFormat(String value);

	/**
	 * Returns the value of the '<em><b>Trace Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Tracing pattern to match which node EIPs to trace. For example to match all To EIP nodes, use to. The pattern matches by
	 * node and route id's Multiple patterns can be separated by comma.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trace Pattern</em>' attribute.
	 * @see #setTracePattern(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_TracePattern()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='tracePattern'"
	 * @generated
	 */
	String getTracePattern();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getTracePattern <em>Trace Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Pattern</em>' attribute.
	 * @see #getTracePattern()
	 * @generated
	 */
	void setTracePattern(String value);

	/**
	 * Returns the value of the '<em><b>Type Converter Exists</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.camel.camelspring.TypeConverterExists}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * What should happen when attempting to add a duplicate type converter. The default behavior is to ignore the duplicate.
	 * Default value: Ignore
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Converter Exists</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.TypeConverterExists
	 * @see #isSetTypeConverterExists()
	 * @see #unsetTypeConverterExists()
	 * @see #setTypeConverterExists(TypeConverterExists)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_TypeConverterExists()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='typeConverterExists'"
	 * @generated
	 */
	TypeConverterExists getTypeConverterExists();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getTypeConverterExists <em>Type Converter Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Converter Exists</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.TypeConverterExists
	 * @see #isSetTypeConverterExists()
	 * @see #unsetTypeConverterExists()
	 * @see #getTypeConverterExists()
	 * @generated
	 */
	void setTypeConverterExists(TypeConverterExists value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getTypeConverterExists <em>Type Converter Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeConverterExists()
	 * @see #getTypeConverterExists()
	 * @see #setTypeConverterExists(TypeConverterExists)
	 * @generated
	 */
	void unsetTypeConverterExists();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getTypeConverterExists <em>Type Converter Exists</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Converter Exists</em>' attribute is set.
	 * @see #unsetTypeConverterExists()
	 * @see #getTypeConverterExists()
	 * @see #setTypeConverterExists(TypeConverterExists)
	 * @generated
	 */
	boolean isSetTypeConverterExists();

	/**
	 * Returns the value of the '<em><b>Type Converter Exists Logging Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.camel.camelspring.LoggingLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The logging level to use when logging that a type converter already exists when attempting to add a duplicate type
	 * converter. The default logging level is DEBUG. Default value: DEBUG
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Converter Exists Logging Level</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.LoggingLevel
	 * @see #isSetTypeConverterExistsLoggingLevel()
	 * @see #unsetTypeConverterExistsLoggingLevel()
	 * @see #setTypeConverterExistsLoggingLevel(LoggingLevel)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_TypeConverterExistsLoggingLevel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='typeConverterExistsLoggingLevel'"
	 * @generated
	 */
	LoggingLevel getTypeConverterExistsLoggingLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getTypeConverterExistsLoggingLevel <em>Type Converter Exists Logging Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Converter Exists Logging Level</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.LoggingLevel
	 * @see #isSetTypeConverterExistsLoggingLevel()
	 * @see #unsetTypeConverterExistsLoggingLevel()
	 * @see #getTypeConverterExistsLoggingLevel()
	 * @generated
	 */
	void setTypeConverterExistsLoggingLevel(LoggingLevel value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getTypeConverterExistsLoggingLevel <em>Type Converter Exists Logging Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeConverterExistsLoggingLevel()
	 * @see #getTypeConverterExistsLoggingLevel()
	 * @see #setTypeConverterExistsLoggingLevel(LoggingLevel)
	 * @generated
	 */
	void unsetTypeConverterExistsLoggingLevel();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getTypeConverterExistsLoggingLevel <em>Type Converter Exists Logging Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Converter Exists Logging Level</em>' attribute is set.
	 * @see #unsetTypeConverterExistsLoggingLevel()
	 * @see #getTypeConverterExistsLoggingLevel()
	 * @see #setTypeConverterExistsLoggingLevel(LoggingLevel)
	 * @generated
	 */
	boolean isSetTypeConverterExistsLoggingLevel();

	/**
	 * Returns the value of the '<em><b>Type Converter Statistics Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether or not type converter statistics is enabled. By default the type converter utilization statistics is
	 * disabled. Notice: If enabled then there is a slight performance impact under very heavy load.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Converter Statistics Enabled</em>' attribute.
	 * @see #setTypeConverterStatisticsEnabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_TypeConverterStatisticsEnabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='typeConverterStatisticsEnabled'"
	 * @generated
	 */
	String getTypeConverterStatisticsEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getTypeConverterStatisticsEnabled <em>Type Converter Statistics Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Converter Statistics Enabled</em>' attribute.
	 * @see #getTypeConverterStatisticsEnabled()
	 * @generated
	 */
	void setTypeConverterStatisticsEnabled(String value);

	/**
	 * Returns the value of the '<em><b>Use Breadcrumb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Set whether breadcrumb is enabled.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Breadcrumb</em>' attribute.
	 * @see #setUseBreadcrumb(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_UseBreadcrumb()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='useBreadcrumb'"
	 * @generated
	 */
	String getUseBreadcrumb();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getUseBreadcrumb <em>Use Breadcrumb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Breadcrumb</em>' attribute.
	 * @see #getUseBreadcrumb()
	 * @generated
	 */
	void setUseBreadcrumb(String value);

	/**
	 * Returns the value of the '<em><b>Use Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to enable using data type on Camel messages. Data type are automatic turned on if: one ore more routes has been
	 * explicit configured with input and output types when using rest-dsl with binding turned on Otherwise data type is
	 * default off.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Data Type</em>' attribute.
	 * @see #setUseDataType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_UseDataType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='useDataType'"
	 * @generated
	 */
	String getUseDataType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getUseDataType <em>Use Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Data Type</em>' attribute.
	 * @see #getUseDataType()
	 * @generated
	 */
	void setUseDataType(String value);

	/**
	 * Returns the value of the '<em><b>Use MDC Logging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Set whether MDC is enabled.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use MDC Logging</em>' attribute.
	 * @see #setUseMDCLogging(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelContextFactoryBean_UseMDCLogging()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='useMDCLogging'"
	 * @generated
	 */
	String getUseMDCLogging();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean#getUseMDCLogging <em>Use MDC Logging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use MDC Logging</em>' attribute.
	 * @see #getUseMDCLogging()
	 * @generated
	 */
	void setUseMDCLogging(String value);

} // CamelContextFactoryBean
