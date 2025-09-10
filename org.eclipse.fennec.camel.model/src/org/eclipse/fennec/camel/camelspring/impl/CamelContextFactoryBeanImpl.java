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
package org.eclipse.fennec.camel.camelspring.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.camel.camelspring.CamelConsumerTemplateFactoryBean;
import org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean;
import org.eclipse.fennec.camel.camelspring.CamelEndpointFactoryBean;
import org.eclipse.fennec.camel.camelspring.CamelFluentProducerTemplateFactoryBean;
import org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition;
import org.eclipse.fennec.camel.camelspring.CamelProducerTemplateFactoryBean;
import org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderDefinition;
import org.eclipse.fennec.camel.camelspring.CamelRedeliveryPolicyFactoryBean;
import org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition;
import org.eclipse.fennec.camel.camelspring.CamelThreadPoolFactoryBean;
import org.eclipse.fennec.camel.camelspring.ContextScanDefinition;
import org.eclipse.fennec.camel.camelspring.DataFormatsDefinition;
import org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationDefinition;
import org.eclipse.fennec.camel.camelspring.GlobalOptionsDefinition;
import org.eclipse.fennec.camel.camelspring.InterceptDefinition;
import org.eclipse.fennec.camel.camelspring.InterceptFromDefinition;
import org.eclipse.fennec.camel.camelspring.InterceptSendToEndpointDefinition;
import org.eclipse.fennec.camel.camelspring.LoggingLevel;
import org.eclipse.fennec.camel.camelspring.OnCompletionDefinition;
import org.eclipse.fennec.camel.camelspring.OnExceptionDefinition;
import org.eclipse.fennec.camel.camelspring.PackageScanDefinition;
import org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationDefinition;
import org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition;
import org.eclipse.fennec.camel.camelspring.RestContextRefDefinition;
import org.eclipse.fennec.camel.camelspring.RestDefinition;
import org.eclipse.fennec.camel.camelspring.RouteBuilderDefinition;
import org.eclipse.fennec.camel.camelspring.RouteConfigurationContextRefDefinition;
import org.eclipse.fennec.camel.camelspring.RouteConfigurationDefinition;
import org.eclipse.fennec.camel.camelspring.RouteContextRefDefinition;
import org.eclipse.fennec.camel.camelspring.RouteDefinition;
import org.eclipse.fennec.camel.camelspring.RouteTemplateContextRefDefinition;
import org.eclipse.fennec.camel.camelspring.RouteTemplateDefinition;
import org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition;
import org.eclipse.fennec.camel.camelspring.ShutdownRoute;
import org.eclipse.fennec.camel.camelspring.ShutdownRunningTask;
import org.eclipse.fennec.camel.camelspring.StartupSummaryLevel;
import org.eclipse.fennec.camel.camelspring.TemplatedRouteDefinition;
import org.eclipse.fennec.camel.camelspring.ThreadPoolProfileDefinition;
import org.eclipse.fennec.camel.camelspring.TransformersDefinition;
import org.eclipse.fennec.camel.camelspring.TypeConverterExists;
import org.eclipse.fennec.camel.camelspring.ValidatorsDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Context Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getGlobalOptions <em>Global Options</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getPropertyPlaceholder <em>Property Placeholder</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getPackageScan <em>Package Scan</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getContextScan <em>Context Scan</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getStreamCaching <em>Stream Caching</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getJmxAgent <em>Jmx Agent</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getRouteController <em>Route Controller</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getFluentTemplate <em>Fluent Template</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getConsumerTemplate <em>Consumer Template</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getErrorHandler <em>Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getDefaultServiceCallConfiguration <em>Default Service Call Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getServiceCallConfiguration <em>Service Call Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getDefaultResilience4jConfiguration <em>Default Resilience4j Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getResilience4jConfiguration <em>Resilience4j Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getDefaultFaultToleranceConfiguration <em>Default Fault Tolerance Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getFaultToleranceConfiguration <em>Fault Tolerance Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getRouteConfigurationContextRef <em>Route Configuration Context Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getRouteTemplateContextRef <em>Route Template Context Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getRouteBuilder <em>Route Builder</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getRouteContextRef <em>Route Context Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getRestContextRef <em>Rest Context Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getThreadPoolProfile <em>Thread Pool Profile</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getThreadPool <em>Thread Pool</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getDataFormats <em>Data Formats</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getTransformers <em>Transformers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getValidators <em>Validators</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getRedeliveryPolicyProfile <em>Redelivery Policy Profile</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getInterceptSendToEndpoint <em>Intercept Send To Endpoint</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getRestConfiguration <em>Rest Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getRest <em>Rest</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getRouteConfiguration <em>Route Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getRouteTemplate <em>Route Template</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getTemplatedRoute <em>Templated Route</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getAllowUseOriginalMessage <em>Allow Use Original Message</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getAutoStartup <em>Auto Startup</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getAutowiredEnabled <em>Autowired Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getBacklogTrace <em>Backlog Trace</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getBeanPostProcessorEnabled <em>Bean Post Processor Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getCaseInsensitiveHeaders <em>Case Insensitive Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getDebug <em>Debug</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getDelayer <em>Delayer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getDumpRoutes <em>Dump Routes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getErrorHandlerRef <em>Error Handler Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getInflightRepositoryBrowseEnabled <em>Inflight Repository Browse Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getLoadHealthChecks <em>Load Health Checks</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getLoadTypeConverters <em>Load Type Converters</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getLogExhaustedMessageBody <em>Log Exhausted Message Body</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getLogMask <em>Log Mask</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getManagementNamePattern <em>Management Name Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getMdcLoggingKeysPattern <em>Mdc Logging Keys Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getMessageHistory <em>Message History</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getRuntimeEndpointRegistryEnabled <em>Runtime Endpoint Registry Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getShutdownEager <em>Shutdown Eager</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getShutdownRoute <em>Shutdown Route</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getShutdownRunningTask <em>Shutdown Running Task</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getSourceLocationEnabled <em>Source Location Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getStartupSummaryLevel <em>Startup Summary Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getStreamCache <em>Stream Cache</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getThreadNamePattern <em>Thread Name Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getTrace <em>Trace</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getTraceLoggingFormat <em>Trace Logging Format</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getTracePattern <em>Trace Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getTypeConverterExists <em>Type Converter Exists</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getTypeConverterExistsLoggingLevel <em>Type Converter Exists Logging Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getTypeConverterStatisticsEnabled <em>Type Converter Statistics Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getUseBreadcrumb <em>Use Breadcrumb</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getUseDataType <em>Use Data Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelContextFactoryBeanImpl#getUseMDCLogging <em>Use MDC Logging</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CamelContextFactoryBeanImpl extends AbstractCamelContextFactoryBeanImpl implements CamelContextFactoryBean {
	/**
	 * The cached value of the '{@link #getGlobalOptions() <em>Global Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalOptions()
	 * @generated
	 * @ordered
	 */
	protected GlobalOptionsDefinition globalOptions;

	/**
	 * The cached value of the '{@link #getPropertyPlaceholder() <em>Property Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected CamelPropertyPlaceholderDefinition propertyPlaceholder;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> package_;

	/**
	 * The cached value of the '{@link #getPackageScan() <em>Package Scan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageScan()
	 * @generated
	 * @ordered
	 */
	protected PackageScanDefinition packageScan;

	/**
	 * The cached value of the '{@link #getContextScan() <em>Context Scan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextScan()
	 * @generated
	 * @ordered
	 */
	protected ContextScanDefinition contextScan;

	/**
	 * The cached value of the '{@link #getStreamCaching() <em>Stream Caching</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamCaching()
	 * @generated
	 * @ordered
	 */
	protected CamelStreamCachingStrategyDefinition streamCaching;

	/**
	 * The cached value of the '{@link #getJmxAgent() <em>Jmx Agent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJmxAgent()
	 * @generated
	 * @ordered
	 */
	protected CamelJMXAgentDefinition jmxAgent;

	/**
	 * The cached value of the '{@link #getRouteController() <em>Route Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteController()
	 * @generated
	 * @ordered
	 */
	protected CamelRouteControllerDefinition routeController;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getErrorHandler() <em>Error Handler</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorHandler()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> errorHandler;

	/**
	 * The cached value of the '{@link #getDefaultServiceCallConfiguration() <em>Default Service Call Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultServiceCallConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ServiceCallConfigurationDefinition defaultServiceCallConfiguration;

	/**
	 * The cached value of the '{@link #getServiceCallConfiguration() <em>Service Call Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCallConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceCallConfigurationDefinition> serviceCallConfiguration;

	/**
	 * The cached value of the '{@link #getDefaultResilience4jConfiguration() <em>Default Resilience4j Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultResilience4jConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Resilience4JConfigurationDefinition defaultResilience4jConfiguration;

	/**
	 * The cached value of the '{@link #getResilience4jConfiguration() <em>Resilience4j Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResilience4jConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<Resilience4JConfigurationDefinition> resilience4jConfiguration;

	/**
	 * The cached value of the '{@link #getDefaultFaultToleranceConfiguration() <em>Default Fault Tolerance Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFaultToleranceConfiguration()
	 * @generated
	 * @ordered
	 */
	protected FaultToleranceConfigurationDefinition defaultFaultToleranceConfiguration;

	/**
	 * The cached value of the '{@link #getFaultToleranceConfiguration() <em>Fault Tolerance Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultToleranceConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<Resilience4JConfigurationDefinition> faultToleranceConfiguration;

	/**
	 * The cached value of the '{@link #getRouteConfigurationContextRef() <em>Route Configuration Context Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteConfigurationContextRef()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteConfigurationContextRefDefinition> routeConfigurationContextRef;

	/**
	 * The cached value of the '{@link #getRouteTemplateContextRef() <em>Route Template Context Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteTemplateContextRef()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteTemplateContextRefDefinition> routeTemplateContextRef;

	/**
	 * The cached value of the '{@link #getRouteBuilder() <em>Route Builder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteBuilder()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteBuilderDefinition> routeBuilder;

	/**
	 * The cached value of the '{@link #getRouteContextRef() <em>Route Context Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteContextRef()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteContextRefDefinition> routeContextRef;

	/**
	 * The cached value of the '{@link #getRestContextRef() <em>Rest Context Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestContextRef()
	 * @generated
	 * @ordered
	 */
	protected EList<RestContextRefDefinition> restContextRef;

	/**
	 * The cached value of the '{@link #getThreadPoolProfile() <em>Thread Pool Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadPoolProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<ThreadPoolProfileDefinition> threadPoolProfile;

	/**
	 * The cached value of the '{@link #getThreadPool() <em>Thread Pool</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadPool()
	 * @generated
	 * @ordered
	 */
	protected EList<CamelThreadPoolFactoryBean> threadPool;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<CamelEndpointFactoryBean> endpoint;

	/**
	 * The cached value of the '{@link #getDataFormats() <em>Data Formats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormats()
	 * @generated
	 * @ordered
	 */
	protected DataFormatsDefinition dataFormats;

	/**
	 * The cached value of the '{@link #getTransformers() <em>Transformers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformers()
	 * @generated
	 * @ordered
	 */
	protected TransformersDefinition transformers;

	/**
	 * The cached value of the '{@link #getValidators() <em>Validators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidators()
	 * @generated
	 * @ordered
	 */
	protected ValidatorsDefinition validators;

	/**
	 * The cached value of the '{@link #getRedeliveryPolicyProfile() <em>Redelivery Policy Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedeliveryPolicyProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<CamelRedeliveryPolicyFactoryBean> redeliveryPolicyProfile;

	/**
	 * The cached value of the '{@link #getOnException() <em>On Exception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnException()
	 * @generated
	 * @ordered
	 */
	protected EList<OnExceptionDefinition> onException;

	/**
	 * The cached value of the '{@link #getOnCompletion() <em>On Completion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnCompletion()
	 * @generated
	 * @ordered
	 */
	protected EList<OnCompletionDefinition> onCompletion;

	/**
	 * The cached value of the '{@link #getIntercept() <em>Intercept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntercept()
	 * @generated
	 * @ordered
	 */
	protected EList<InterceptDefinition> intercept;

	/**
	 * The cached value of the '{@link #getInterceptFrom() <em>Intercept From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterceptFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<InterceptFromDefinition> interceptFrom;

	/**
	 * The cached value of the '{@link #getInterceptSendToEndpoint() <em>Intercept Send To Endpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterceptSendToEndpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<InterceptSendToEndpointDefinition> interceptSendToEndpoint;

	/**
	 * The cached value of the '{@link #getRestConfiguration() <em>Rest Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestConfiguration()
	 * @generated
	 * @ordered
	 */
	protected RestConfigurationDefinition restConfiguration;

	/**
	 * The cached value of the '{@link #getRest() <em>Rest</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRest()
	 * @generated
	 * @ordered
	 */
	protected EList<RestDefinition> rest;

	/**
	 * The cached value of the '{@link #getRouteConfiguration() <em>Route Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteConfigurationDefinition> routeConfiguration;

	/**
	 * The cached value of the '{@link #getRouteTemplate() <em>Route Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteTemplateDefinition> routeTemplate;

	/**
	 * The cached value of the '{@link #getTemplatedRoute() <em>Templated Route</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplatedRoute()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplatedRouteDefinition> templatedRoute;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteDefinition> route;

	/**
	 * The default value of the '{@link #getAllowUseOriginalMessage() <em>Allow Use Original Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowUseOriginalMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_USE_ORIGINAL_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowUseOriginalMessage() <em>Allow Use Original Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowUseOriginalMessage()
	 * @generated
	 * @ordered
	 */
	protected String allowUseOriginalMessage = ALLOW_USE_ORIGINAL_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoStartup() <em>Auto Startup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoStartup()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTO_STARTUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoStartup() <em>Auto Startup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoStartup()
	 * @generated
	 * @ordered
	 */
	protected String autoStartup = AUTO_STARTUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutowiredEnabled() <em>Autowired Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutowiredEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTOWIRED_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutowiredEnabled() <em>Autowired Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutowiredEnabled()
	 * @generated
	 * @ordered
	 */
	protected String autowiredEnabled = AUTOWIRED_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBacklogTrace() <em>Backlog Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBacklogTrace()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKLOG_TRACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBacklogTrace() <em>Backlog Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBacklogTrace()
	 * @generated
	 * @ordered
	 */
	protected String backlogTrace = BACKLOG_TRACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeanPostProcessorEnabled() <em>Bean Post Processor Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeanPostProcessorEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final String BEAN_POST_PROCESSOR_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeanPostProcessorEnabled() <em>Bean Post Processor Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeanPostProcessorEnabled()
	 * @generated
	 * @ordered
	 */
	protected String beanPostProcessorEnabled = BEAN_POST_PROCESSOR_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaseInsensitiveHeaders() <em>Case Insensitive Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseInsensitiveHeaders()
	 * @generated
	 * @ordered
	 */
	protected static final String CASE_INSENSITIVE_HEADERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaseInsensitiveHeaders() <em>Case Insensitive Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseInsensitiveHeaders()
	 * @generated
	 * @ordered
	 */
	protected String caseInsensitiveHeaders = CASE_INSENSITIVE_HEADERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDebug() <em>Debug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebug()
	 * @generated
	 * @ordered
	 */
	protected static final String DEBUG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebug() <em>Debug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebug()
	 * @generated
	 * @ordered
	 */
	protected String debug = DEBUG_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelayer() <em>Delayer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayer()
	 * @generated
	 * @ordered
	 */
	protected static final String DELAYER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelayer() <em>Delayer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayer()
	 * @generated
	 * @ordered
	 */
	protected String delayer = DELAYER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDependsOn() <em>Depends On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPENDS_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected String dependsOn = DEPENDS_ON_EDEFAULT;

	/**
	 * The default value of the '{@link #getDumpRoutes() <em>Dump Routes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDumpRoutes()
	 * @generated
	 * @ordered
	 */
	protected static final String DUMP_ROUTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDumpRoutes() <em>Dump Routes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDumpRoutes()
	 * @generated
	 * @ordered
	 */
	protected String dumpRoutes = DUMP_ROUTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorHandlerRef() <em>Error Handler Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorHandlerRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_HANDLER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorHandlerRef() <em>Error Handler Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorHandlerRef()
	 * @generated
	 * @ordered
	 */
	protected String errorHandlerRef = ERROR_HANDLER_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getInflightRepositoryBrowseEnabled() <em>Inflight Repository Browse Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInflightRepositoryBrowseEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final String INFLIGHT_REPOSITORY_BROWSE_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInflightRepositoryBrowseEnabled() <em>Inflight Repository Browse Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInflightRepositoryBrowseEnabled()
	 * @generated
	 * @ordered
	 */
	protected String inflightRepositoryBrowseEnabled = INFLIGHT_REPOSITORY_BROWSE_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadHealthChecks() <em>Load Health Checks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadHealthChecks()
	 * @generated
	 * @ordered
	 */
	protected static final String LOAD_HEALTH_CHECKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoadHealthChecks() <em>Load Health Checks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadHealthChecks()
	 * @generated
	 * @ordered
	 */
	protected String loadHealthChecks = LOAD_HEALTH_CHECKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadTypeConverters() <em>Load Type Converters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadTypeConverters()
	 * @generated
	 * @ordered
	 */
	protected static final String LOAD_TYPE_CONVERTERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoadTypeConverters() <em>Load Type Converters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadTypeConverters()
	 * @generated
	 * @ordered
	 */
	protected String loadTypeConverters = LOAD_TYPE_CONVERTERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogExhaustedMessageBody() <em>Log Exhausted Message Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogExhaustedMessageBody()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_EXHAUSTED_MESSAGE_BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogExhaustedMessageBody() <em>Log Exhausted Message Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogExhaustedMessageBody()
	 * @generated
	 * @ordered
	 */
	protected String logExhaustedMessageBody = LOG_EXHAUSTED_MESSAGE_BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogMask() <em>Log Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogMask()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogMask() <em>Log Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogMask()
	 * @generated
	 * @ordered
	 */
	protected String logMask = LOG_MASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getManagementNamePattern() <em>Management Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagementNamePattern()
	 * @generated
	 * @ordered
	 */
	protected static final String MANAGEMENT_NAME_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManagementNamePattern() <em>Management Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagementNamePattern()
	 * @generated
	 * @ordered
	 */
	protected String managementNamePattern = MANAGEMENT_NAME_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMdcLoggingKeysPattern() <em>Mdc Logging Keys Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdcLoggingKeysPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String MDC_LOGGING_KEYS_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMdcLoggingKeysPattern() <em>Mdc Logging Keys Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdcLoggingKeysPattern()
	 * @generated
	 * @ordered
	 */
	protected String mdcLoggingKeysPattern = MDC_LOGGING_KEYS_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageHistory() <em>Message History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageHistory()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_HISTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageHistory() <em>Message History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageHistory()
	 * @generated
	 * @ordered
	 */
	protected String messageHistory = MESSAGE_HISTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuntimeEndpointRegistryEnabled() <em>Runtime Endpoint Registry Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeEndpointRegistryEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final String RUNTIME_ENDPOINT_REGISTRY_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuntimeEndpointRegistryEnabled() <em>Runtime Endpoint Registry Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeEndpointRegistryEnabled()
	 * @generated
	 * @ordered
	 */
	protected String runtimeEndpointRegistryEnabled = RUNTIME_ENDPOINT_REGISTRY_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getShutdownEager() <em>Shutdown Eager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShutdownEager()
	 * @generated
	 * @ordered
	 */
	protected static final String SHUTDOWN_EAGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShutdownEager() <em>Shutdown Eager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShutdownEager()
	 * @generated
	 * @ordered
	 */
	protected String shutdownEager = SHUTDOWN_EAGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getShutdownRoute() <em>Shutdown Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShutdownRoute()
	 * @generated
	 * @ordered
	 */
	protected static final ShutdownRoute SHUTDOWN_ROUTE_EDEFAULT = ShutdownRoute.DEFAULT;

	/**
	 * The cached value of the '{@link #getShutdownRoute() <em>Shutdown Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShutdownRoute()
	 * @generated
	 * @ordered
	 */
	protected ShutdownRoute shutdownRoute = SHUTDOWN_ROUTE_EDEFAULT;

	/**
	 * This is true if the Shutdown Route attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shutdownRouteESet;

	/**
	 * The default value of the '{@link #getShutdownRunningTask() <em>Shutdown Running Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShutdownRunningTask()
	 * @generated
	 * @ordered
	 */
	protected static final ShutdownRunningTask SHUTDOWN_RUNNING_TASK_EDEFAULT = ShutdownRunningTask.COMPLETE_CURRENT_TASK_ONLY;

	/**
	 * The cached value of the '{@link #getShutdownRunningTask() <em>Shutdown Running Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShutdownRunningTask()
	 * @generated
	 * @ordered
	 */
	protected ShutdownRunningTask shutdownRunningTask = SHUTDOWN_RUNNING_TASK_EDEFAULT;

	/**
	 * This is true if the Shutdown Running Task attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shutdownRunningTaskESet;

	/**
	 * The default value of the '{@link #getSourceLocationEnabled() <em>Source Location Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLocationEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_LOCATION_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceLocationEnabled() <em>Source Location Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLocationEnabled()
	 * @generated
	 * @ordered
	 */
	protected String sourceLocationEnabled = SOURCE_LOCATION_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartupSummaryLevel() <em>Startup Summary Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupSummaryLevel()
	 * @generated
	 * @ordered
	 */
	protected static final StartupSummaryLevel STARTUP_SUMMARY_LEVEL_EDEFAULT = StartupSummaryLevel.VERBOSE;

	/**
	 * The cached value of the '{@link #getStartupSummaryLevel() <em>Startup Summary Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupSummaryLevel()
	 * @generated
	 * @ordered
	 */
	protected StartupSummaryLevel startupSummaryLevel = STARTUP_SUMMARY_LEVEL_EDEFAULT;

	/**
	 * This is true if the Startup Summary Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startupSummaryLevelESet;

	/**
	 * The default value of the '{@link #getStreamCache() <em>Stream Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamCache()
	 * @generated
	 * @ordered
	 */
	protected static final String STREAM_CACHE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreamCache() <em>Stream Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamCache()
	 * @generated
	 * @ordered
	 */
	protected String streamCache = STREAM_CACHE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreadNamePattern() <em>Thread Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadNamePattern()
	 * @generated
	 * @ordered
	 */
	protected static final String THREAD_NAME_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThreadNamePattern() <em>Thread Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadNamePattern()
	 * @generated
	 * @ordered
	 */
	protected String threadNamePattern = THREAD_NAME_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrace() <em>Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrace()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrace() <em>Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrace()
	 * @generated
	 * @ordered
	 */
	protected String trace = TRACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTraceLoggingFormat() <em>Trace Logging Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLoggingFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACE_LOGGING_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTraceLoggingFormat() <em>Trace Logging Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLoggingFormat()
	 * @generated
	 * @ordered
	 */
	protected String traceLoggingFormat = TRACE_LOGGING_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTracePattern() <em>Trace Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracePattern()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACE_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTracePattern() <em>Trace Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracePattern()
	 * @generated
	 * @ordered
	 */
	protected String tracePattern = TRACE_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeConverterExists() <em>Type Converter Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeConverterExists()
	 * @generated
	 * @ordered
	 */
	protected static final TypeConverterExists TYPE_CONVERTER_EXISTS_EDEFAULT = TypeConverterExists.OVERRIDE;

	/**
	 * The cached value of the '{@link #getTypeConverterExists() <em>Type Converter Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeConverterExists()
	 * @generated
	 * @ordered
	 */
	protected TypeConverterExists typeConverterExists = TYPE_CONVERTER_EXISTS_EDEFAULT;

	/**
	 * This is true if the Type Converter Exists attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeConverterExistsESet;

	/**
	 * The default value of the '{@link #getTypeConverterExistsLoggingLevel() <em>Type Converter Exists Logging Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeConverterExistsLoggingLevel()
	 * @generated
	 * @ordered
	 */
	protected static final LoggingLevel TYPE_CONVERTER_EXISTS_LOGGING_LEVEL_EDEFAULT = LoggingLevel.TRACE;

	/**
	 * The cached value of the '{@link #getTypeConverterExistsLoggingLevel() <em>Type Converter Exists Logging Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeConverterExistsLoggingLevel()
	 * @generated
	 * @ordered
	 */
	protected LoggingLevel typeConverterExistsLoggingLevel = TYPE_CONVERTER_EXISTS_LOGGING_LEVEL_EDEFAULT;

	/**
	 * This is true if the Type Converter Exists Logging Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeConverterExistsLoggingLevelESet;

	/**
	 * The default value of the '{@link #getTypeConverterStatisticsEnabled() <em>Type Converter Statistics Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeConverterStatisticsEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_CONVERTER_STATISTICS_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeConverterStatisticsEnabled() <em>Type Converter Statistics Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeConverterStatisticsEnabled()
	 * @generated
	 * @ordered
	 */
	protected String typeConverterStatisticsEnabled = TYPE_CONVERTER_STATISTICS_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseBreadcrumb() <em>Use Breadcrumb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseBreadcrumb()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_BREADCRUMB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseBreadcrumb() <em>Use Breadcrumb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseBreadcrumb()
	 * @generated
	 * @ordered
	 */
	protected String useBreadcrumb = USE_BREADCRUMB_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseDataType() <em>Use Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseDataType()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseDataType() <em>Use Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseDataType()
	 * @generated
	 * @ordered
	 */
	protected String useDataType = USE_DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseMDCLogging() <em>Use MDC Logging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseMDCLogging()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_MDC_LOGGING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseMDCLogging() <em>Use MDC Logging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseMDCLogging()
	 * @generated
	 * @ordered
	 */
	protected String useMDCLogging = USE_MDC_LOGGING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CamelContextFactoryBeanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getCamelContextFactoryBean();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlobalOptionsDefinition getGlobalOptions() {
		return globalOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalOptions(GlobalOptionsDefinition newGlobalOptions, NotificationChain msgs) {
		GlobalOptionsDefinition oldGlobalOptions = globalOptions;
		globalOptions = newGlobalOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__GLOBAL_OPTIONS, oldGlobalOptions, newGlobalOptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlobalOptions(GlobalOptionsDefinition newGlobalOptions) {
		if (newGlobalOptions != globalOptions) {
			NotificationChain msgs = null;
			if (globalOptions != null)
				msgs = ((InternalEObject)globalOptions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__GLOBAL_OPTIONS, null, msgs);
			if (newGlobalOptions != null)
				msgs = ((InternalEObject)newGlobalOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__GLOBAL_OPTIONS, null, msgs);
			msgs = basicSetGlobalOptions(newGlobalOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__GLOBAL_OPTIONS, newGlobalOptions, newGlobalOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelPropertyPlaceholderDefinition getPropertyPlaceholder() {
		return propertyPlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyPlaceholder(CamelPropertyPlaceholderDefinition newPropertyPlaceholder, NotificationChain msgs) {
		CamelPropertyPlaceholderDefinition oldPropertyPlaceholder = propertyPlaceholder;
		propertyPlaceholder = newPropertyPlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTY_PLACEHOLDER, oldPropertyPlaceholder, newPropertyPlaceholder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyPlaceholder(CamelPropertyPlaceholderDefinition newPropertyPlaceholder) {
		if (newPropertyPlaceholder != propertyPlaceholder) {
			NotificationChain msgs = null;
			if (propertyPlaceholder != null)
				msgs = ((InternalEObject)propertyPlaceholder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTY_PLACEHOLDER, null, msgs);
			if (newPropertyPlaceholder != null)
				msgs = ((InternalEObject)newPropertyPlaceholder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTY_PLACEHOLDER, null, msgs);
			msgs = basicSetPropertyPlaceholder(newPropertyPlaceholder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTY_PLACEHOLDER, newPropertyPlaceholder, newPropertyPlaceholder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPackage() {
		if (package_ == null) {
			package_ = new EDataTypeEList<String>(String.class, this, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE);
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageScanDefinition getPackageScan() {
		return packageScan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackageScan(PackageScanDefinition newPackageScan, NotificationChain msgs) {
		PackageScanDefinition oldPackageScan = packageScan;
		packageScan = newPackageScan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE_SCAN, oldPackageScan, newPackageScan);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackageScan(PackageScanDefinition newPackageScan) {
		if (newPackageScan != packageScan) {
			NotificationChain msgs = null;
			if (packageScan != null)
				msgs = ((InternalEObject)packageScan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE_SCAN, null, msgs);
			if (newPackageScan != null)
				msgs = ((InternalEObject)newPackageScan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE_SCAN, null, msgs);
			msgs = basicSetPackageScan(newPackageScan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE_SCAN, newPackageScan, newPackageScan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextScanDefinition getContextScan() {
		return contextScan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextScan(ContextScanDefinition newContextScan, NotificationChain msgs) {
		ContextScanDefinition oldContextScan = contextScan;
		contextScan = newContextScan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONTEXT_SCAN, oldContextScan, newContextScan);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContextScan(ContextScanDefinition newContextScan) {
		if (newContextScan != contextScan) {
			NotificationChain msgs = null;
			if (contextScan != null)
				msgs = ((InternalEObject)contextScan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONTEXT_SCAN, null, msgs);
			if (newContextScan != null)
				msgs = ((InternalEObject)newContextScan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONTEXT_SCAN, null, msgs);
			msgs = basicSetContextScan(newContextScan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONTEXT_SCAN, newContextScan, newContextScan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelStreamCachingStrategyDefinition getStreamCaching() {
		return streamCaching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStreamCaching(CamelStreamCachingStrategyDefinition newStreamCaching, NotificationChain msgs) {
		CamelStreamCachingStrategyDefinition oldStreamCaching = streamCaching;
		streamCaching = newStreamCaching;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__STREAM_CACHING, oldStreamCaching, newStreamCaching);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStreamCaching(CamelStreamCachingStrategyDefinition newStreamCaching) {
		if (newStreamCaching != streamCaching) {
			NotificationChain msgs = null;
			if (streamCaching != null)
				msgs = ((InternalEObject)streamCaching).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__STREAM_CACHING, null, msgs);
			if (newStreamCaching != null)
				msgs = ((InternalEObject)newStreamCaching).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__STREAM_CACHING, null, msgs);
			msgs = basicSetStreamCaching(newStreamCaching, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__STREAM_CACHING, newStreamCaching, newStreamCaching));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelJMXAgentDefinition getJmxAgent() {
		return jmxAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJmxAgent(CamelJMXAgentDefinition newJmxAgent, NotificationChain msgs) {
		CamelJMXAgentDefinition oldJmxAgent = jmxAgent;
		jmxAgent = newJmxAgent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__JMX_AGENT, oldJmxAgent, newJmxAgent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJmxAgent(CamelJMXAgentDefinition newJmxAgent) {
		if (newJmxAgent != jmxAgent) {
			NotificationChain msgs = null;
			if (jmxAgent != null)
				msgs = ((InternalEObject)jmxAgent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__JMX_AGENT, null, msgs);
			if (newJmxAgent != null)
				msgs = ((InternalEObject)newJmxAgent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__JMX_AGENT, null, msgs);
			msgs = basicSetJmxAgent(newJmxAgent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__JMX_AGENT, newJmxAgent, newJmxAgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelRouteControllerDefinition getRouteController() {
		return routeController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouteController(CamelRouteControllerDefinition newRouteController, NotificationChain msgs) {
		CamelRouteControllerDefinition oldRouteController = routeController;
		routeController = newRouteController;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONTROLLER, oldRouteController, newRouteController);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteController(CamelRouteControllerDefinition newRouteController) {
		if (newRouteController != routeController) {
			NotificationChain msgs = null;
			if (routeController != null)
				msgs = ((InternalEObject)routeController).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONTROLLER, null, msgs);
			if (newRouteController != null)
				msgs = ((InternalEObject)newRouteController).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONTROLLER, null, msgs);
			msgs = basicSetRouteController(newRouteController, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONTROLLER, newRouteController, newRouteController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CamelProducerTemplateFactoryBean> getTemplate() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCamelContextFactoryBean_Template());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CamelFluentProducerTemplateFactoryBean> getFluentTemplate() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCamelContextFactoryBean_FluentTemplate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CamelConsumerTemplateFactoryBean> getConsumerTemplate() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCamelContextFactoryBean_ConsumerTemplate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getErrorHandler() {
		if (errorHandler == null) {
			errorHandler = new EObjectContainmentEList<EObject>(EObject.class, this, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ERROR_HANDLER);
		}
		return errorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceCallConfigurationDefinition getDefaultServiceCallConfiguration() {
		return defaultServiceCallConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultServiceCallConfiguration(ServiceCallConfigurationDefinition newDefaultServiceCallConfiguration, NotificationChain msgs) {
		ServiceCallConfigurationDefinition oldDefaultServiceCallConfiguration = defaultServiceCallConfiguration;
		defaultServiceCallConfiguration = newDefaultServiceCallConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_SERVICE_CALL_CONFIGURATION, oldDefaultServiceCallConfiguration, newDefaultServiceCallConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultServiceCallConfiguration(ServiceCallConfigurationDefinition newDefaultServiceCallConfiguration) {
		if (newDefaultServiceCallConfiguration != defaultServiceCallConfiguration) {
			NotificationChain msgs = null;
			if (defaultServiceCallConfiguration != null)
				msgs = ((InternalEObject)defaultServiceCallConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_SERVICE_CALL_CONFIGURATION, null, msgs);
			if (newDefaultServiceCallConfiguration != null)
				msgs = ((InternalEObject)newDefaultServiceCallConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_SERVICE_CALL_CONFIGURATION, null, msgs);
			msgs = basicSetDefaultServiceCallConfiguration(newDefaultServiceCallConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_SERVICE_CALL_CONFIGURATION, newDefaultServiceCallConfiguration, newDefaultServiceCallConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceCallConfigurationDefinition> getServiceCallConfiguration() {
		if (serviceCallConfiguration == null) {
			serviceCallConfiguration = new EObjectContainmentEList<ServiceCallConfigurationDefinition>(ServiceCallConfigurationDefinition.class, this, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SERVICE_CALL_CONFIGURATION);
		}
		return serviceCallConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resilience4JConfigurationDefinition getDefaultResilience4jConfiguration() {
		return defaultResilience4jConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultResilience4jConfiguration(Resilience4JConfigurationDefinition newDefaultResilience4jConfiguration, NotificationChain msgs) {
		Resilience4JConfigurationDefinition oldDefaultResilience4jConfiguration = defaultResilience4jConfiguration;
		defaultResilience4jConfiguration = newDefaultResilience4jConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_RESILIENCE4J_CONFIGURATION, oldDefaultResilience4jConfiguration, newDefaultResilience4jConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultResilience4jConfiguration(Resilience4JConfigurationDefinition newDefaultResilience4jConfiguration) {
		if (newDefaultResilience4jConfiguration != defaultResilience4jConfiguration) {
			NotificationChain msgs = null;
			if (defaultResilience4jConfiguration != null)
				msgs = ((InternalEObject)defaultResilience4jConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_RESILIENCE4J_CONFIGURATION, null, msgs);
			if (newDefaultResilience4jConfiguration != null)
				msgs = ((InternalEObject)newDefaultResilience4jConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_RESILIENCE4J_CONFIGURATION, null, msgs);
			msgs = basicSetDefaultResilience4jConfiguration(newDefaultResilience4jConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_RESILIENCE4J_CONFIGURATION, newDefaultResilience4jConfiguration, newDefaultResilience4jConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resilience4JConfigurationDefinition> getResilience4jConfiguration() {
		if (resilience4jConfiguration == null) {
			resilience4jConfiguration = new EObjectContainmentEList<Resilience4JConfigurationDefinition>(Resilience4JConfigurationDefinition.class, this, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__RESILIENCE4J_CONFIGURATION);
		}
		return resilience4jConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FaultToleranceConfigurationDefinition getDefaultFaultToleranceConfiguration() {
		return defaultFaultToleranceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultFaultToleranceConfiguration(FaultToleranceConfigurationDefinition newDefaultFaultToleranceConfiguration, NotificationChain msgs) {
		FaultToleranceConfigurationDefinition oldDefaultFaultToleranceConfiguration = defaultFaultToleranceConfiguration;
		defaultFaultToleranceConfiguration = newDefaultFaultToleranceConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_FAULT_TOLERANCE_CONFIGURATION, oldDefaultFaultToleranceConfiguration, newDefaultFaultToleranceConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultFaultToleranceConfiguration(FaultToleranceConfigurationDefinition newDefaultFaultToleranceConfiguration) {
		if (newDefaultFaultToleranceConfiguration != defaultFaultToleranceConfiguration) {
			NotificationChain msgs = null;
			if (defaultFaultToleranceConfiguration != null)
				msgs = ((InternalEObject)defaultFaultToleranceConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_FAULT_TOLERANCE_CONFIGURATION, null, msgs);
			if (newDefaultFaultToleranceConfiguration != null)
				msgs = ((InternalEObject)newDefaultFaultToleranceConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_FAULT_TOLERANCE_CONFIGURATION, null, msgs);
			msgs = basicSetDefaultFaultToleranceConfiguration(newDefaultFaultToleranceConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_FAULT_TOLERANCE_CONFIGURATION, newDefaultFaultToleranceConfiguration, newDefaultFaultToleranceConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resilience4JConfigurationDefinition> getFaultToleranceConfiguration() {
		if (faultToleranceConfiguration == null) {
			faultToleranceConfiguration = new EObjectContainmentEList<Resilience4JConfigurationDefinition>(Resilience4JConfigurationDefinition.class, this, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__FAULT_TOLERANCE_CONFIGURATION);
		}
		return faultToleranceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RouteConfigurationContextRefDefinition> getRouteConfigurationContextRef() {
		if (routeConfigurationContextRef == null) {
			routeConfigurationContextRef = new EObjectContainmentEList<RouteConfigurationContextRefDefinition>(RouteConfigurationContextRefDefinition.class, this, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONFIGURATION_CONTEXT_REF);
		}
		return routeConfigurationContextRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RouteTemplateContextRefDefinition> getRouteTemplateContextRef() {
		if (routeTemplateContextRef == null) {
			routeTemplateContextRef = new EObjectContainmentEList<RouteTemplateContextRefDefinition>(RouteTemplateContextRefDefinition.class, this, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_TEMPLATE_CONTEXT_REF);
		}
		return routeTemplateContextRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RouteBuilderDefinition> getRouteBuilder() {
		if (routeBuilder == null) {
			routeBuilder = new EObjectContainmentEList<RouteBuilderDefinition>(RouteBuilderDefinition.class, this, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_BUILDER);
		}
		return routeBuilder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RouteContextRefDefinition> getRouteContextRef() {
		if (routeContextRef == null) {
			routeContextRef = new EObjectContainmentEList<RouteContextRefDefinition>(RouteContextRefDefinition.class, this, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONTEXT_REF);
		}
		return routeContextRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RestContextRefDefinition> getRestContextRef() {
		if (restContextRef == null) {
			restContextRef = new EObjectContainmentEList<RestContextRefDefinition>(RestContextRefDefinition.class, this, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REST_CONTEXT_REF);
		}
		return restContextRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThreadPoolProfileDefinition> getThreadPoolProfile() {
		if (threadPoolProfile == null) {
			threadPoolProfile = new EObjectContainmentEList<ThreadPoolProfileDefinition>(ThreadPoolProfileDefinition.class, this, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_POOL_PROFILE);
		}
		return threadPoolProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CamelThreadPoolFactoryBean> getThreadPool() {
		if (threadPool == null) {
			threadPool = new EObjectContainmentEList<CamelThreadPoolFactoryBean>(CamelThreadPoolFactoryBean.class, this, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_POOL);
		}
		return threadPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CamelEndpointFactoryBean> getEndpoint() {
		if (endpoint == null) {
			endpoint = new EObjectContainmentEList<CamelEndpointFactoryBean>(CamelEndpointFactoryBean.class, this, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ENDPOINT);
		}
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFormatsDefinition getDataFormats() {
		return dataFormats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataFormats(DataFormatsDefinition newDataFormats, NotificationChain msgs) {
		DataFormatsDefinition oldDataFormats = dataFormats;
		dataFormats = newDataFormats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DATA_FORMATS, oldDataFormats, newDataFormats);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataFormats(DataFormatsDefinition newDataFormats) {
		if (newDataFormats != dataFormats) {
			NotificationChain msgs = null;
			if (dataFormats != null)
				msgs = ((InternalEObject)dataFormats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DATA_FORMATS, null, msgs);
			if (newDataFormats != null)
				msgs = ((InternalEObject)newDataFormats).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DATA_FORMATS, null, msgs);
			msgs = basicSetDataFormats(newDataFormats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DATA_FORMATS, newDataFormats, newDataFormats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformersDefinition getTransformers() {
		return transformers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformers(TransformersDefinition newTransformers, NotificationChain msgs) {
		TransformersDefinition oldTransformers = transformers;
		transformers = newTransformers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRANSFORMERS, oldTransformers, newTransformers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransformers(TransformersDefinition newTransformers) {
		if (newTransformers != transformers) {
			NotificationChain msgs = null;
			if (transformers != null)
				msgs = ((InternalEObject)transformers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRANSFORMERS, null, msgs);
			if (newTransformers != null)
				msgs = ((InternalEObject)newTransformers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRANSFORMERS, null, msgs);
			msgs = basicSetTransformers(newTransformers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRANSFORMERS, newTransformers, newTransformers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidatorsDefinition getValidators() {
		return validators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidators(ValidatorsDefinition newValidators, NotificationChain msgs) {
		ValidatorsDefinition oldValidators = validators;
		validators = newValidators;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__VALIDATORS, oldValidators, newValidators);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidators(ValidatorsDefinition newValidators) {
		if (newValidators != validators) {
			NotificationChain msgs = null;
			if (validators != null)
				msgs = ((InternalEObject)validators).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__VALIDATORS, null, msgs);
			if (newValidators != null)
				msgs = ((InternalEObject)newValidators).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__VALIDATORS, null, msgs);
			msgs = basicSetValidators(newValidators, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__VALIDATORS, newValidators, newValidators));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CamelRedeliveryPolicyFactoryBean> getRedeliveryPolicyProfile() {
		if (redeliveryPolicyProfile == null) {
			redeliveryPolicyProfile = new EObjectContainmentEList<CamelRedeliveryPolicyFactoryBean>(CamelRedeliveryPolicyFactoryBean.class, this, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REDELIVERY_POLICY_PROFILE);
		}
		return redeliveryPolicyProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OnExceptionDefinition> getOnException() {
		if (onException == null) {
			onException = new EObjectContainmentEList<OnExceptionDefinition>(OnExceptionDefinition.class, this, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ON_EXCEPTION);
		}
		return onException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OnCompletionDefinition> getOnCompletion() {
		if (onCompletion == null) {
			onCompletion = new EObjectContainmentEList<OnCompletionDefinition>(OnCompletionDefinition.class, this, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ON_COMPLETION);
		}
		return onCompletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterceptDefinition> getIntercept() {
		if (intercept == null) {
			intercept = new EObjectContainmentEList<InterceptDefinition>(InterceptDefinition.class, this, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT);
		}
		return intercept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterceptFromDefinition> getInterceptFrom() {
		if (interceptFrom == null) {
			interceptFrom = new EObjectContainmentEList<InterceptFromDefinition>(InterceptFromDefinition.class, this, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT_FROM);
		}
		return interceptFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterceptSendToEndpointDefinition> getInterceptSendToEndpoint() {
		if (interceptSendToEndpoint == null) {
			interceptSendToEndpoint = new EObjectContainmentEList<InterceptSendToEndpointDefinition>(InterceptSendToEndpointDefinition.class, this, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT_SEND_TO_ENDPOINT);
		}
		return interceptSendToEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestConfigurationDefinition getRestConfiguration() {
		return restConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestConfiguration(RestConfigurationDefinition newRestConfiguration, NotificationChain msgs) {
		RestConfigurationDefinition oldRestConfiguration = restConfiguration;
		restConfiguration = newRestConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REST_CONFIGURATION, oldRestConfiguration, newRestConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestConfiguration(RestConfigurationDefinition newRestConfiguration) {
		if (newRestConfiguration != restConfiguration) {
			NotificationChain msgs = null;
			if (restConfiguration != null)
				msgs = ((InternalEObject)restConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REST_CONFIGURATION, null, msgs);
			if (newRestConfiguration != null)
				msgs = ((InternalEObject)newRestConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REST_CONFIGURATION, null, msgs);
			msgs = basicSetRestConfiguration(newRestConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REST_CONFIGURATION, newRestConfiguration, newRestConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RestDefinition> getRest() {
		if (rest == null) {
			rest = new EObjectContainmentEList<RestDefinition>(RestDefinition.class, this, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REST);
		}
		return rest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RouteConfigurationDefinition> getRouteConfiguration() {
		if (routeConfiguration == null) {
			routeConfiguration = new EObjectContainmentEList<RouteConfigurationDefinition>(RouteConfigurationDefinition.class, this, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONFIGURATION);
		}
		return routeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RouteTemplateDefinition> getRouteTemplate() {
		if (routeTemplate == null) {
			routeTemplate = new EObjectContainmentEList<RouteTemplateDefinition>(RouteTemplateDefinition.class, this, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_TEMPLATE);
		}
		return routeTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemplatedRouteDefinition> getTemplatedRoute() {
		if (templatedRoute == null) {
			templatedRoute = new EObjectContainmentEList<TemplatedRouteDefinition>(TemplatedRouteDefinition.class, this, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TEMPLATED_ROUTE);
		}
		return templatedRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RouteDefinition> getRoute() {
		if (route == null) {
			route = new EObjectContainmentEList<RouteDefinition>(RouteDefinition.class, this, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE);
		}
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowUseOriginalMessage() {
		return allowUseOriginalMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowUseOriginalMessage(String newAllowUseOriginalMessage) {
		String oldAllowUseOriginalMessage = allowUseOriginalMessage;
		allowUseOriginalMessage = newAllowUseOriginalMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ALLOW_USE_ORIGINAL_MESSAGE, oldAllowUseOriginalMessage, allowUseOriginalMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAutoStartup() {
		return autoStartup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoStartup(String newAutoStartup) {
		String oldAutoStartup = autoStartup;
		autoStartup = newAutoStartup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__AUTO_STARTUP, oldAutoStartup, autoStartup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAutowiredEnabled() {
		return autowiredEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutowiredEnabled(String newAutowiredEnabled) {
		String oldAutowiredEnabled = autowiredEnabled;
		autowiredEnabled = newAutowiredEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__AUTOWIRED_ENABLED, oldAutowiredEnabled, autowiredEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBacklogTrace() {
		return backlogTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBacklogTrace(String newBacklogTrace) {
		String oldBacklogTrace = backlogTrace;
		backlogTrace = newBacklogTrace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__BACKLOG_TRACE, oldBacklogTrace, backlogTrace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeanPostProcessorEnabled() {
		return beanPostProcessorEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeanPostProcessorEnabled(String newBeanPostProcessorEnabled) {
		String oldBeanPostProcessorEnabled = beanPostProcessorEnabled;
		beanPostProcessorEnabled = newBeanPostProcessorEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__BEAN_POST_PROCESSOR_ENABLED, oldBeanPostProcessorEnabled, beanPostProcessorEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCaseInsensitiveHeaders() {
		return caseInsensitiveHeaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseInsensitiveHeaders(String newCaseInsensitiveHeaders) {
		String oldCaseInsensitiveHeaders = caseInsensitiveHeaders;
		caseInsensitiveHeaders = newCaseInsensitiveHeaders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CASE_INSENSITIVE_HEADERS, oldCaseInsensitiveHeaders, caseInsensitiveHeaders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDebug() {
		return debug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDebug(String newDebug) {
		String oldDebug = debug;
		debug = newDebug;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEBUG, oldDebug, debug));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDelayer() {
		return delayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelayer(String newDelayer) {
		String oldDelayer = delayer;
		delayer = newDelayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DELAYER, oldDelayer, delayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDependsOn() {
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDependsOn(String newDependsOn) {
		String oldDependsOn = dependsOn;
		dependsOn = newDependsOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEPENDS_ON, oldDependsOn, dependsOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDumpRoutes() {
		return dumpRoutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDumpRoutes(String newDumpRoutes) {
		String oldDumpRoutes = dumpRoutes;
		dumpRoutes = newDumpRoutes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DUMP_ROUTES, oldDumpRoutes, dumpRoutes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getErrorHandlerRef() {
		return errorHandlerRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorHandlerRef(String newErrorHandlerRef) {
		String oldErrorHandlerRef = errorHandlerRef;
		errorHandlerRef = newErrorHandlerRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ERROR_HANDLER_REF, oldErrorHandlerRef, errorHandlerRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInflightRepositoryBrowseEnabled() {
		return inflightRepositoryBrowseEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInflightRepositoryBrowseEnabled(String newInflightRepositoryBrowseEnabled) {
		String oldInflightRepositoryBrowseEnabled = inflightRepositoryBrowseEnabled;
		inflightRepositoryBrowseEnabled = newInflightRepositoryBrowseEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INFLIGHT_REPOSITORY_BROWSE_ENABLED, oldInflightRepositoryBrowseEnabled, inflightRepositoryBrowseEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLoadHealthChecks() {
		return loadHealthChecks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoadHealthChecks(String newLoadHealthChecks) {
		String oldLoadHealthChecks = loadHealthChecks;
		loadHealthChecks = newLoadHealthChecks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LOAD_HEALTH_CHECKS, oldLoadHealthChecks, loadHealthChecks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLoadTypeConverters() {
		return loadTypeConverters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoadTypeConverters(String newLoadTypeConverters) {
		String oldLoadTypeConverters = loadTypeConverters;
		loadTypeConverters = newLoadTypeConverters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LOAD_TYPE_CONVERTERS, oldLoadTypeConverters, loadTypeConverters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogExhaustedMessageBody() {
		return logExhaustedMessageBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogExhaustedMessageBody(String newLogExhaustedMessageBody) {
		String oldLogExhaustedMessageBody = logExhaustedMessageBody;
		logExhaustedMessageBody = newLogExhaustedMessageBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LOG_EXHAUSTED_MESSAGE_BODY, oldLogExhaustedMessageBody, logExhaustedMessageBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogMask() {
		return logMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogMask(String newLogMask) {
		String oldLogMask = logMask;
		logMask = newLogMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LOG_MASK, oldLogMask, logMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManagementNamePattern() {
		return managementNamePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManagementNamePattern(String newManagementNamePattern) {
		String oldManagementNamePattern = managementNamePattern;
		managementNamePattern = newManagementNamePattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__MANAGEMENT_NAME_PATTERN, oldManagementNamePattern, managementNamePattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMdcLoggingKeysPattern() {
		return mdcLoggingKeysPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMdcLoggingKeysPattern(String newMdcLoggingKeysPattern) {
		String oldMdcLoggingKeysPattern = mdcLoggingKeysPattern;
		mdcLoggingKeysPattern = newMdcLoggingKeysPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__MDC_LOGGING_KEYS_PATTERN, oldMdcLoggingKeysPattern, mdcLoggingKeysPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessageHistory() {
		return messageHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageHistory(String newMessageHistory) {
		String oldMessageHistory = messageHistory;
		messageHistory = newMessageHistory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__MESSAGE_HISTORY, oldMessageHistory, messageHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRuntimeEndpointRegistryEnabled() {
		return runtimeEndpointRegistryEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuntimeEndpointRegistryEnabled(String newRuntimeEndpointRegistryEnabled) {
		String oldRuntimeEndpointRegistryEnabled = runtimeEndpointRegistryEnabled;
		runtimeEndpointRegistryEnabled = newRuntimeEndpointRegistryEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__RUNTIME_ENDPOINT_REGISTRY_ENABLED, oldRuntimeEndpointRegistryEnabled, runtimeEndpointRegistryEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShutdownEager() {
		return shutdownEager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShutdownEager(String newShutdownEager) {
		String oldShutdownEager = shutdownEager;
		shutdownEager = newShutdownEager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_EAGER, oldShutdownEager, shutdownEager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShutdownRoute getShutdownRoute() {
		return shutdownRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShutdownRoute(ShutdownRoute newShutdownRoute) {
		ShutdownRoute oldShutdownRoute = shutdownRoute;
		shutdownRoute = newShutdownRoute == null ? SHUTDOWN_ROUTE_EDEFAULT : newShutdownRoute;
		boolean oldShutdownRouteESet = shutdownRouteESet;
		shutdownRouteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_ROUTE, oldShutdownRoute, shutdownRoute, !oldShutdownRouteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetShutdownRoute() {
		ShutdownRoute oldShutdownRoute = shutdownRoute;
		boolean oldShutdownRouteESet = shutdownRouteESet;
		shutdownRoute = SHUTDOWN_ROUTE_EDEFAULT;
		shutdownRouteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_ROUTE, oldShutdownRoute, SHUTDOWN_ROUTE_EDEFAULT, oldShutdownRouteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetShutdownRoute() {
		return shutdownRouteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShutdownRunningTask getShutdownRunningTask() {
		return shutdownRunningTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShutdownRunningTask(ShutdownRunningTask newShutdownRunningTask) {
		ShutdownRunningTask oldShutdownRunningTask = shutdownRunningTask;
		shutdownRunningTask = newShutdownRunningTask == null ? SHUTDOWN_RUNNING_TASK_EDEFAULT : newShutdownRunningTask;
		boolean oldShutdownRunningTaskESet = shutdownRunningTaskESet;
		shutdownRunningTaskESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_RUNNING_TASK, oldShutdownRunningTask, shutdownRunningTask, !oldShutdownRunningTaskESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetShutdownRunningTask() {
		ShutdownRunningTask oldShutdownRunningTask = shutdownRunningTask;
		boolean oldShutdownRunningTaskESet = shutdownRunningTaskESet;
		shutdownRunningTask = SHUTDOWN_RUNNING_TASK_EDEFAULT;
		shutdownRunningTaskESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_RUNNING_TASK, oldShutdownRunningTask, SHUTDOWN_RUNNING_TASK_EDEFAULT, oldShutdownRunningTaskESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetShutdownRunningTask() {
		return shutdownRunningTaskESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceLocationEnabled() {
		return sourceLocationEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceLocationEnabled(String newSourceLocationEnabled) {
		String oldSourceLocationEnabled = sourceLocationEnabled;
		sourceLocationEnabled = newSourceLocationEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SOURCE_LOCATION_ENABLED, oldSourceLocationEnabled, sourceLocationEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartupSummaryLevel getStartupSummaryLevel() {
		return startupSummaryLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartupSummaryLevel(StartupSummaryLevel newStartupSummaryLevel) {
		StartupSummaryLevel oldStartupSummaryLevel = startupSummaryLevel;
		startupSummaryLevel = newStartupSummaryLevel == null ? STARTUP_SUMMARY_LEVEL_EDEFAULT : newStartupSummaryLevel;
		boolean oldStartupSummaryLevelESet = startupSummaryLevelESet;
		startupSummaryLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__STARTUP_SUMMARY_LEVEL, oldStartupSummaryLevel, startupSummaryLevel, !oldStartupSummaryLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStartupSummaryLevel() {
		StartupSummaryLevel oldStartupSummaryLevel = startupSummaryLevel;
		boolean oldStartupSummaryLevelESet = startupSummaryLevelESet;
		startupSummaryLevel = STARTUP_SUMMARY_LEVEL_EDEFAULT;
		startupSummaryLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__STARTUP_SUMMARY_LEVEL, oldStartupSummaryLevel, STARTUP_SUMMARY_LEVEL_EDEFAULT, oldStartupSummaryLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStartupSummaryLevel() {
		return startupSummaryLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStreamCache() {
		return streamCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStreamCache(String newStreamCache) {
		String oldStreamCache = streamCache;
		streamCache = newStreamCache;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__STREAM_CACHE, oldStreamCache, streamCache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThreadNamePattern() {
		return threadNamePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreadNamePattern(String newThreadNamePattern) {
		String oldThreadNamePattern = threadNamePattern;
		threadNamePattern = newThreadNamePattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_NAME_PATTERN, oldThreadNamePattern, threadNamePattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrace() {
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrace(String newTrace) {
		String oldTrace = trace;
		trace = newTrace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRACE, oldTrace, trace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTraceLoggingFormat() {
		return traceLoggingFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTraceLoggingFormat(String newTraceLoggingFormat) {
		String oldTraceLoggingFormat = traceLoggingFormat;
		traceLoggingFormat = newTraceLoggingFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRACE_LOGGING_FORMAT, oldTraceLoggingFormat, traceLoggingFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTracePattern() {
		return tracePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTracePattern(String newTracePattern) {
		String oldTracePattern = tracePattern;
		tracePattern = newTracePattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRACE_PATTERN, oldTracePattern, tracePattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeConverterExists getTypeConverterExists() {
		return typeConverterExists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeConverterExists(TypeConverterExists newTypeConverterExists) {
		TypeConverterExists oldTypeConverterExists = typeConverterExists;
		typeConverterExists = newTypeConverterExists == null ? TYPE_CONVERTER_EXISTS_EDEFAULT : newTypeConverterExists;
		boolean oldTypeConverterExistsESet = typeConverterExistsESet;
		typeConverterExistsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TYPE_CONVERTER_EXISTS, oldTypeConverterExists, typeConverterExists, !oldTypeConverterExistsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTypeConverterExists() {
		TypeConverterExists oldTypeConverterExists = typeConverterExists;
		boolean oldTypeConverterExistsESet = typeConverterExistsESet;
		typeConverterExists = TYPE_CONVERTER_EXISTS_EDEFAULT;
		typeConverterExistsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TYPE_CONVERTER_EXISTS, oldTypeConverterExists, TYPE_CONVERTER_EXISTS_EDEFAULT, oldTypeConverterExistsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTypeConverterExists() {
		return typeConverterExistsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoggingLevel getTypeConverterExistsLoggingLevel() {
		return typeConverterExistsLoggingLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeConverterExistsLoggingLevel(LoggingLevel newTypeConverterExistsLoggingLevel) {
		LoggingLevel oldTypeConverterExistsLoggingLevel = typeConverterExistsLoggingLevel;
		typeConverterExistsLoggingLevel = newTypeConverterExistsLoggingLevel == null ? TYPE_CONVERTER_EXISTS_LOGGING_LEVEL_EDEFAULT : newTypeConverterExistsLoggingLevel;
		boolean oldTypeConverterExistsLoggingLevelESet = typeConverterExistsLoggingLevelESet;
		typeConverterExistsLoggingLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TYPE_CONVERTER_EXISTS_LOGGING_LEVEL, oldTypeConverterExistsLoggingLevel, typeConverterExistsLoggingLevel, !oldTypeConverterExistsLoggingLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTypeConverterExistsLoggingLevel() {
		LoggingLevel oldTypeConverterExistsLoggingLevel = typeConverterExistsLoggingLevel;
		boolean oldTypeConverterExistsLoggingLevelESet = typeConverterExistsLoggingLevelESet;
		typeConverterExistsLoggingLevel = TYPE_CONVERTER_EXISTS_LOGGING_LEVEL_EDEFAULT;
		typeConverterExistsLoggingLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TYPE_CONVERTER_EXISTS_LOGGING_LEVEL, oldTypeConverterExistsLoggingLevel, TYPE_CONVERTER_EXISTS_LOGGING_LEVEL_EDEFAULT, oldTypeConverterExistsLoggingLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTypeConverterExistsLoggingLevel() {
		return typeConverterExistsLoggingLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTypeConverterStatisticsEnabled() {
		return typeConverterStatisticsEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeConverterStatisticsEnabled(String newTypeConverterStatisticsEnabled) {
		String oldTypeConverterStatisticsEnabled = typeConverterStatisticsEnabled;
		typeConverterStatisticsEnabled = newTypeConverterStatisticsEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TYPE_CONVERTER_STATISTICS_ENABLED, oldTypeConverterStatisticsEnabled, typeConverterStatisticsEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUseBreadcrumb() {
		return useBreadcrumb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseBreadcrumb(String newUseBreadcrumb) {
		String oldUseBreadcrumb = useBreadcrumb;
		useBreadcrumb = newUseBreadcrumb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_BREADCRUMB, oldUseBreadcrumb, useBreadcrumb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUseDataType() {
		return useDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseDataType(String newUseDataType) {
		String oldUseDataType = useDataType;
		useDataType = newUseDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_DATA_TYPE, oldUseDataType, useDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUseMDCLogging() {
		return useMDCLogging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseMDCLogging(String newUseMDCLogging) {
		String oldUseMDCLogging = useMDCLogging;
		useMDCLogging = newUseMDCLogging;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_MDC_LOGGING, oldUseMDCLogging, useMDCLogging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__GLOBAL_OPTIONS:
				return basicSetGlobalOptions(null, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTY_PLACEHOLDER:
				return basicSetPropertyPlaceholder(null, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE_SCAN:
				return basicSetPackageScan(null, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONTEXT_SCAN:
				return basicSetContextScan(null, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__STREAM_CACHING:
				return basicSetStreamCaching(null, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__JMX_AGENT:
				return basicSetJmxAgent(null, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONTROLLER:
				return basicSetRouteController(null, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TEMPLATE:
				return ((InternalEList<?>)getTemplate()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__FLUENT_TEMPLATE:
				return ((InternalEList<?>)getFluentTemplate()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONSUMER_TEMPLATE:
				return ((InternalEList<?>)getConsumerTemplate()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ERROR_HANDLER:
				return ((InternalEList<?>)getErrorHandler()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_SERVICE_CALL_CONFIGURATION:
				return basicSetDefaultServiceCallConfiguration(null, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SERVICE_CALL_CONFIGURATION:
				return ((InternalEList<?>)getServiceCallConfiguration()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_RESILIENCE4J_CONFIGURATION:
				return basicSetDefaultResilience4jConfiguration(null, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__RESILIENCE4J_CONFIGURATION:
				return ((InternalEList<?>)getResilience4jConfiguration()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_FAULT_TOLERANCE_CONFIGURATION:
				return basicSetDefaultFaultToleranceConfiguration(null, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__FAULT_TOLERANCE_CONFIGURATION:
				return ((InternalEList<?>)getFaultToleranceConfiguration()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONFIGURATION_CONTEXT_REF:
				return ((InternalEList<?>)getRouteConfigurationContextRef()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_TEMPLATE_CONTEXT_REF:
				return ((InternalEList<?>)getRouteTemplateContextRef()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_BUILDER:
				return ((InternalEList<?>)getRouteBuilder()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONTEXT_REF:
				return ((InternalEList<?>)getRouteContextRef()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REST_CONTEXT_REF:
				return ((InternalEList<?>)getRestContextRef()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_POOL_PROFILE:
				return ((InternalEList<?>)getThreadPoolProfile()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_POOL:
				return ((InternalEList<?>)getThreadPool()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ENDPOINT:
				return ((InternalEList<?>)getEndpoint()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DATA_FORMATS:
				return basicSetDataFormats(null, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRANSFORMERS:
				return basicSetTransformers(null, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__VALIDATORS:
				return basicSetValidators(null, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REDELIVERY_POLICY_PROFILE:
				return ((InternalEList<?>)getRedeliveryPolicyProfile()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ON_EXCEPTION:
				return ((InternalEList<?>)getOnException()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ON_COMPLETION:
				return ((InternalEList<?>)getOnCompletion()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT:
				return ((InternalEList<?>)getIntercept()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT_FROM:
				return ((InternalEList<?>)getInterceptFrom()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT_SEND_TO_ENDPOINT:
				return ((InternalEList<?>)getInterceptSendToEndpoint()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REST_CONFIGURATION:
				return basicSetRestConfiguration(null, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REST:
				return ((InternalEList<?>)getRest()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONFIGURATION:
				return ((InternalEList<?>)getRouteConfiguration()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_TEMPLATE:
				return ((InternalEList<?>)getRouteTemplate()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TEMPLATED_ROUTE:
				return ((InternalEList<?>)getTemplatedRoute()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE:
				return ((InternalEList<?>)getRoute()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__GLOBAL_OPTIONS:
				return getGlobalOptions();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTY_PLACEHOLDER:
				return getPropertyPlaceholder();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE:
				return getPackage();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE_SCAN:
				return getPackageScan();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONTEXT_SCAN:
				return getContextScan();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__STREAM_CACHING:
				return getStreamCaching();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__JMX_AGENT:
				return getJmxAgent();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONTROLLER:
				return getRouteController();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TEMPLATE:
				return getTemplate();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__FLUENT_TEMPLATE:
				return getFluentTemplate();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONSUMER_TEMPLATE:
				return getConsumerTemplate();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ERROR_HANDLER:
				return getErrorHandler();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_SERVICE_CALL_CONFIGURATION:
				return getDefaultServiceCallConfiguration();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SERVICE_CALL_CONFIGURATION:
				return getServiceCallConfiguration();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_RESILIENCE4J_CONFIGURATION:
				return getDefaultResilience4jConfiguration();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__RESILIENCE4J_CONFIGURATION:
				return getResilience4jConfiguration();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_FAULT_TOLERANCE_CONFIGURATION:
				return getDefaultFaultToleranceConfiguration();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__FAULT_TOLERANCE_CONFIGURATION:
				return getFaultToleranceConfiguration();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONFIGURATION_CONTEXT_REF:
				return getRouteConfigurationContextRef();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_TEMPLATE_CONTEXT_REF:
				return getRouteTemplateContextRef();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_BUILDER:
				return getRouteBuilder();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONTEXT_REF:
				return getRouteContextRef();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REST_CONTEXT_REF:
				return getRestContextRef();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_POOL_PROFILE:
				return getThreadPoolProfile();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_POOL:
				return getThreadPool();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ENDPOINT:
				return getEndpoint();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DATA_FORMATS:
				return getDataFormats();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRANSFORMERS:
				return getTransformers();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__VALIDATORS:
				return getValidators();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REDELIVERY_POLICY_PROFILE:
				return getRedeliveryPolicyProfile();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ON_EXCEPTION:
				return getOnException();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ON_COMPLETION:
				return getOnCompletion();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT:
				return getIntercept();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT_FROM:
				return getInterceptFrom();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT_SEND_TO_ENDPOINT:
				return getInterceptSendToEndpoint();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REST_CONFIGURATION:
				return getRestConfiguration();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REST:
				return getRest();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONFIGURATION:
				return getRouteConfiguration();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_TEMPLATE:
				return getRouteTemplate();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TEMPLATED_ROUTE:
				return getTemplatedRoute();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE:
				return getRoute();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ALLOW_USE_ORIGINAL_MESSAGE:
				return getAllowUseOriginalMessage();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__AUTO_STARTUP:
				return getAutoStartup();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__AUTOWIRED_ENABLED:
				return getAutowiredEnabled();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__BACKLOG_TRACE:
				return getBacklogTrace();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__BEAN_POST_PROCESSOR_ENABLED:
				return getBeanPostProcessorEnabled();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CASE_INSENSITIVE_HEADERS:
				return getCaseInsensitiveHeaders();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEBUG:
				return getDebug();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DELAYER:
				return getDelayer();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEPENDS_ON:
				return getDependsOn();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DUMP_ROUTES:
				return getDumpRoutes();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ERROR_HANDLER_REF:
				return getErrorHandlerRef();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INFLIGHT_REPOSITORY_BROWSE_ENABLED:
				return getInflightRepositoryBrowseEnabled();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LOAD_HEALTH_CHECKS:
				return getLoadHealthChecks();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LOAD_TYPE_CONVERTERS:
				return getLoadTypeConverters();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LOG_EXHAUSTED_MESSAGE_BODY:
				return getLogExhaustedMessageBody();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LOG_MASK:
				return getLogMask();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__MANAGEMENT_NAME_PATTERN:
				return getManagementNamePattern();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__MDC_LOGGING_KEYS_PATTERN:
				return getMdcLoggingKeysPattern();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__MESSAGE_HISTORY:
				return getMessageHistory();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__RUNTIME_ENDPOINT_REGISTRY_ENABLED:
				return getRuntimeEndpointRegistryEnabled();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_EAGER:
				return getShutdownEager();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_ROUTE:
				return getShutdownRoute();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_RUNNING_TASK:
				return getShutdownRunningTask();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SOURCE_LOCATION_ENABLED:
				return getSourceLocationEnabled();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__STARTUP_SUMMARY_LEVEL:
				return getStartupSummaryLevel();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__STREAM_CACHE:
				return getStreamCache();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_NAME_PATTERN:
				return getThreadNamePattern();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRACE:
				return getTrace();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRACE_LOGGING_FORMAT:
				return getTraceLoggingFormat();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRACE_PATTERN:
				return getTracePattern();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TYPE_CONVERTER_EXISTS:
				return getTypeConverterExists();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TYPE_CONVERTER_EXISTS_LOGGING_LEVEL:
				return getTypeConverterExistsLoggingLevel();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TYPE_CONVERTER_STATISTICS_ENABLED:
				return getTypeConverterStatisticsEnabled();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_BREADCRUMB:
				return getUseBreadcrumb();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_DATA_TYPE:
				return getUseDataType();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_MDC_LOGGING:
				return getUseMDCLogging();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__GLOBAL_OPTIONS:
				setGlobalOptions((GlobalOptionsDefinition)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTY_PLACEHOLDER:
				setPropertyPlaceholder((CamelPropertyPlaceholderDefinition)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends String>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE_SCAN:
				setPackageScan((PackageScanDefinition)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONTEXT_SCAN:
				setContextScan((ContextScanDefinition)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__STREAM_CACHING:
				setStreamCaching((CamelStreamCachingStrategyDefinition)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__JMX_AGENT:
				setJmxAgent((CamelJMXAgentDefinition)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONTROLLER:
				setRouteController((CamelRouteControllerDefinition)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TEMPLATE:
				getTemplate().clear();
				getTemplate().addAll((Collection<? extends CamelProducerTemplateFactoryBean>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__FLUENT_TEMPLATE:
				getFluentTemplate().clear();
				getFluentTemplate().addAll((Collection<? extends CamelFluentProducerTemplateFactoryBean>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONSUMER_TEMPLATE:
				getConsumerTemplate().clear();
				getConsumerTemplate().addAll((Collection<? extends CamelConsumerTemplateFactoryBean>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ERROR_HANDLER:
				getErrorHandler().clear();
				getErrorHandler().addAll((Collection<? extends EObject>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_SERVICE_CALL_CONFIGURATION:
				setDefaultServiceCallConfiguration((ServiceCallConfigurationDefinition)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SERVICE_CALL_CONFIGURATION:
				getServiceCallConfiguration().clear();
				getServiceCallConfiguration().addAll((Collection<? extends ServiceCallConfigurationDefinition>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_RESILIENCE4J_CONFIGURATION:
				setDefaultResilience4jConfiguration((Resilience4JConfigurationDefinition)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__RESILIENCE4J_CONFIGURATION:
				getResilience4jConfiguration().clear();
				getResilience4jConfiguration().addAll((Collection<? extends Resilience4JConfigurationDefinition>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_FAULT_TOLERANCE_CONFIGURATION:
				setDefaultFaultToleranceConfiguration((FaultToleranceConfigurationDefinition)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__FAULT_TOLERANCE_CONFIGURATION:
				getFaultToleranceConfiguration().clear();
				getFaultToleranceConfiguration().addAll((Collection<? extends Resilience4JConfigurationDefinition>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONFIGURATION_CONTEXT_REF:
				getRouteConfigurationContextRef().clear();
				getRouteConfigurationContextRef().addAll((Collection<? extends RouteConfigurationContextRefDefinition>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_TEMPLATE_CONTEXT_REF:
				getRouteTemplateContextRef().clear();
				getRouteTemplateContextRef().addAll((Collection<? extends RouteTemplateContextRefDefinition>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_BUILDER:
				getRouteBuilder().clear();
				getRouteBuilder().addAll((Collection<? extends RouteBuilderDefinition>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONTEXT_REF:
				getRouteContextRef().clear();
				getRouteContextRef().addAll((Collection<? extends RouteContextRefDefinition>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REST_CONTEXT_REF:
				getRestContextRef().clear();
				getRestContextRef().addAll((Collection<? extends RestContextRefDefinition>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_POOL_PROFILE:
				getThreadPoolProfile().clear();
				getThreadPoolProfile().addAll((Collection<? extends ThreadPoolProfileDefinition>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_POOL:
				getThreadPool().clear();
				getThreadPool().addAll((Collection<? extends CamelThreadPoolFactoryBean>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ENDPOINT:
				getEndpoint().clear();
				getEndpoint().addAll((Collection<? extends CamelEndpointFactoryBean>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DATA_FORMATS:
				setDataFormats((DataFormatsDefinition)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRANSFORMERS:
				setTransformers((TransformersDefinition)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__VALIDATORS:
				setValidators((ValidatorsDefinition)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REDELIVERY_POLICY_PROFILE:
				getRedeliveryPolicyProfile().clear();
				getRedeliveryPolicyProfile().addAll((Collection<? extends CamelRedeliveryPolicyFactoryBean>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ON_EXCEPTION:
				getOnException().clear();
				getOnException().addAll((Collection<? extends OnExceptionDefinition>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ON_COMPLETION:
				getOnCompletion().clear();
				getOnCompletion().addAll((Collection<? extends OnCompletionDefinition>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT:
				getIntercept().clear();
				getIntercept().addAll((Collection<? extends InterceptDefinition>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT_FROM:
				getInterceptFrom().clear();
				getInterceptFrom().addAll((Collection<? extends InterceptFromDefinition>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT_SEND_TO_ENDPOINT:
				getInterceptSendToEndpoint().clear();
				getInterceptSendToEndpoint().addAll((Collection<? extends InterceptSendToEndpointDefinition>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REST_CONFIGURATION:
				setRestConfiguration((RestConfigurationDefinition)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REST:
				getRest().clear();
				getRest().addAll((Collection<? extends RestDefinition>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONFIGURATION:
				getRouteConfiguration().clear();
				getRouteConfiguration().addAll((Collection<? extends RouteConfigurationDefinition>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_TEMPLATE:
				getRouteTemplate().clear();
				getRouteTemplate().addAll((Collection<? extends RouteTemplateDefinition>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TEMPLATED_ROUTE:
				getTemplatedRoute().clear();
				getTemplatedRoute().addAll((Collection<? extends TemplatedRouteDefinition>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE:
				getRoute().clear();
				getRoute().addAll((Collection<? extends RouteDefinition>)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ALLOW_USE_ORIGINAL_MESSAGE:
				setAllowUseOriginalMessage((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__AUTO_STARTUP:
				setAutoStartup((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__AUTOWIRED_ENABLED:
				setAutowiredEnabled((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__BACKLOG_TRACE:
				setBacklogTrace((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__BEAN_POST_PROCESSOR_ENABLED:
				setBeanPostProcessorEnabled((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CASE_INSENSITIVE_HEADERS:
				setCaseInsensitiveHeaders((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEBUG:
				setDebug((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DELAYER:
				setDelayer((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEPENDS_ON:
				setDependsOn((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DUMP_ROUTES:
				setDumpRoutes((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ERROR_HANDLER_REF:
				setErrorHandlerRef((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INFLIGHT_REPOSITORY_BROWSE_ENABLED:
				setInflightRepositoryBrowseEnabled((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LOAD_HEALTH_CHECKS:
				setLoadHealthChecks((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LOAD_TYPE_CONVERTERS:
				setLoadTypeConverters((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LOG_EXHAUSTED_MESSAGE_BODY:
				setLogExhaustedMessageBody((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LOG_MASK:
				setLogMask((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__MANAGEMENT_NAME_PATTERN:
				setManagementNamePattern((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__MDC_LOGGING_KEYS_PATTERN:
				setMdcLoggingKeysPattern((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__MESSAGE_HISTORY:
				setMessageHistory((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__RUNTIME_ENDPOINT_REGISTRY_ENABLED:
				setRuntimeEndpointRegistryEnabled((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_EAGER:
				setShutdownEager((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_ROUTE:
				setShutdownRoute((ShutdownRoute)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_RUNNING_TASK:
				setShutdownRunningTask((ShutdownRunningTask)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SOURCE_LOCATION_ENABLED:
				setSourceLocationEnabled((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__STARTUP_SUMMARY_LEVEL:
				setStartupSummaryLevel((StartupSummaryLevel)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__STREAM_CACHE:
				setStreamCache((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_NAME_PATTERN:
				setThreadNamePattern((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRACE:
				setTrace((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRACE_LOGGING_FORMAT:
				setTraceLoggingFormat((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRACE_PATTERN:
				setTracePattern((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TYPE_CONVERTER_EXISTS:
				setTypeConverterExists((TypeConverterExists)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TYPE_CONVERTER_EXISTS_LOGGING_LEVEL:
				setTypeConverterExistsLoggingLevel((LoggingLevel)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TYPE_CONVERTER_STATISTICS_ENABLED:
				setTypeConverterStatisticsEnabled((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_BREADCRUMB:
				setUseBreadcrumb((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_DATA_TYPE:
				setUseDataType((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_MDC_LOGGING:
				setUseMDCLogging((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__GLOBAL_OPTIONS:
				setGlobalOptions((GlobalOptionsDefinition)null);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTY_PLACEHOLDER:
				setPropertyPlaceholder((CamelPropertyPlaceholderDefinition)null);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE:
				getPackage().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE_SCAN:
				setPackageScan((PackageScanDefinition)null);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONTEXT_SCAN:
				setContextScan((ContextScanDefinition)null);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__STREAM_CACHING:
				setStreamCaching((CamelStreamCachingStrategyDefinition)null);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__JMX_AGENT:
				setJmxAgent((CamelJMXAgentDefinition)null);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONTROLLER:
				setRouteController((CamelRouteControllerDefinition)null);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__GROUP:
				getGroup().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TEMPLATE:
				getTemplate().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__FLUENT_TEMPLATE:
				getFluentTemplate().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONSUMER_TEMPLATE:
				getConsumerTemplate().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ERROR_HANDLER:
				getErrorHandler().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_SERVICE_CALL_CONFIGURATION:
				setDefaultServiceCallConfiguration((ServiceCallConfigurationDefinition)null);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SERVICE_CALL_CONFIGURATION:
				getServiceCallConfiguration().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_RESILIENCE4J_CONFIGURATION:
				setDefaultResilience4jConfiguration((Resilience4JConfigurationDefinition)null);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__RESILIENCE4J_CONFIGURATION:
				getResilience4jConfiguration().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_FAULT_TOLERANCE_CONFIGURATION:
				setDefaultFaultToleranceConfiguration((FaultToleranceConfigurationDefinition)null);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__FAULT_TOLERANCE_CONFIGURATION:
				getFaultToleranceConfiguration().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONFIGURATION_CONTEXT_REF:
				getRouteConfigurationContextRef().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_TEMPLATE_CONTEXT_REF:
				getRouteTemplateContextRef().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_BUILDER:
				getRouteBuilder().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONTEXT_REF:
				getRouteContextRef().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REST_CONTEXT_REF:
				getRestContextRef().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_POOL_PROFILE:
				getThreadPoolProfile().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_POOL:
				getThreadPool().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ENDPOINT:
				getEndpoint().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DATA_FORMATS:
				setDataFormats((DataFormatsDefinition)null);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRANSFORMERS:
				setTransformers((TransformersDefinition)null);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__VALIDATORS:
				setValidators((ValidatorsDefinition)null);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REDELIVERY_POLICY_PROFILE:
				getRedeliveryPolicyProfile().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ON_EXCEPTION:
				getOnException().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ON_COMPLETION:
				getOnCompletion().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT:
				getIntercept().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT_FROM:
				getInterceptFrom().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT_SEND_TO_ENDPOINT:
				getInterceptSendToEndpoint().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REST_CONFIGURATION:
				setRestConfiguration((RestConfigurationDefinition)null);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REST:
				getRest().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONFIGURATION:
				getRouteConfiguration().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_TEMPLATE:
				getRouteTemplate().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TEMPLATED_ROUTE:
				getTemplatedRoute().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE:
				getRoute().clear();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ALLOW_USE_ORIGINAL_MESSAGE:
				setAllowUseOriginalMessage(ALLOW_USE_ORIGINAL_MESSAGE_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__AUTO_STARTUP:
				setAutoStartup(AUTO_STARTUP_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__AUTOWIRED_ENABLED:
				setAutowiredEnabled(AUTOWIRED_ENABLED_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__BACKLOG_TRACE:
				setBacklogTrace(BACKLOG_TRACE_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__BEAN_POST_PROCESSOR_ENABLED:
				setBeanPostProcessorEnabled(BEAN_POST_PROCESSOR_ENABLED_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CASE_INSENSITIVE_HEADERS:
				setCaseInsensitiveHeaders(CASE_INSENSITIVE_HEADERS_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEBUG:
				setDebug(DEBUG_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DELAYER:
				setDelayer(DELAYER_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEPENDS_ON:
				setDependsOn(DEPENDS_ON_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DUMP_ROUTES:
				setDumpRoutes(DUMP_ROUTES_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ERROR_HANDLER_REF:
				setErrorHandlerRef(ERROR_HANDLER_REF_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INFLIGHT_REPOSITORY_BROWSE_ENABLED:
				setInflightRepositoryBrowseEnabled(INFLIGHT_REPOSITORY_BROWSE_ENABLED_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LOAD_HEALTH_CHECKS:
				setLoadHealthChecks(LOAD_HEALTH_CHECKS_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LOAD_TYPE_CONVERTERS:
				setLoadTypeConverters(LOAD_TYPE_CONVERTERS_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LOG_EXHAUSTED_MESSAGE_BODY:
				setLogExhaustedMessageBody(LOG_EXHAUSTED_MESSAGE_BODY_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LOG_MASK:
				setLogMask(LOG_MASK_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__MANAGEMENT_NAME_PATTERN:
				setManagementNamePattern(MANAGEMENT_NAME_PATTERN_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__MDC_LOGGING_KEYS_PATTERN:
				setMdcLoggingKeysPattern(MDC_LOGGING_KEYS_PATTERN_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__MESSAGE_HISTORY:
				setMessageHistory(MESSAGE_HISTORY_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__RUNTIME_ENDPOINT_REGISTRY_ENABLED:
				setRuntimeEndpointRegistryEnabled(RUNTIME_ENDPOINT_REGISTRY_ENABLED_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_EAGER:
				setShutdownEager(SHUTDOWN_EAGER_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_ROUTE:
				unsetShutdownRoute();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_RUNNING_TASK:
				unsetShutdownRunningTask();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SOURCE_LOCATION_ENABLED:
				setSourceLocationEnabled(SOURCE_LOCATION_ENABLED_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__STARTUP_SUMMARY_LEVEL:
				unsetStartupSummaryLevel();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__STREAM_CACHE:
				setStreamCache(STREAM_CACHE_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_NAME_PATTERN:
				setThreadNamePattern(THREAD_NAME_PATTERN_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRACE:
				setTrace(TRACE_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRACE_LOGGING_FORMAT:
				setTraceLoggingFormat(TRACE_LOGGING_FORMAT_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRACE_PATTERN:
				setTracePattern(TRACE_PATTERN_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TYPE_CONVERTER_EXISTS:
				unsetTypeConverterExists();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TYPE_CONVERTER_EXISTS_LOGGING_LEVEL:
				unsetTypeConverterExistsLoggingLevel();
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TYPE_CONVERTER_STATISTICS_ENABLED:
				setTypeConverterStatisticsEnabled(TYPE_CONVERTER_STATISTICS_ENABLED_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_BREADCRUMB:
				setUseBreadcrumb(USE_BREADCRUMB_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_DATA_TYPE:
				setUseDataType(USE_DATA_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_MDC_LOGGING:
				setUseMDCLogging(USE_MDC_LOGGING_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__GLOBAL_OPTIONS:
				return globalOptions != null;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTY_PLACEHOLDER:
				return propertyPlaceholder != null;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE:
				return package_ != null && !package_.isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE_SCAN:
				return packageScan != null;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONTEXT_SCAN:
				return contextScan != null;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__STREAM_CACHING:
				return streamCaching != null;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__JMX_AGENT:
				return jmxAgent != null;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONTROLLER:
				return routeController != null;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__GROUP:
				return group != null && !group.isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TEMPLATE:
				return !getTemplate().isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__FLUENT_TEMPLATE:
				return !getFluentTemplate().isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONSUMER_TEMPLATE:
				return !getConsumerTemplate().isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ERROR_HANDLER:
				return errorHandler != null && !errorHandler.isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_SERVICE_CALL_CONFIGURATION:
				return defaultServiceCallConfiguration != null;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SERVICE_CALL_CONFIGURATION:
				return serviceCallConfiguration != null && !serviceCallConfiguration.isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_RESILIENCE4J_CONFIGURATION:
				return defaultResilience4jConfiguration != null;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__RESILIENCE4J_CONFIGURATION:
				return resilience4jConfiguration != null && !resilience4jConfiguration.isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEFAULT_FAULT_TOLERANCE_CONFIGURATION:
				return defaultFaultToleranceConfiguration != null;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__FAULT_TOLERANCE_CONFIGURATION:
				return faultToleranceConfiguration != null && !faultToleranceConfiguration.isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONFIGURATION_CONTEXT_REF:
				return routeConfigurationContextRef != null && !routeConfigurationContextRef.isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_TEMPLATE_CONTEXT_REF:
				return routeTemplateContextRef != null && !routeTemplateContextRef.isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_BUILDER:
				return routeBuilder != null && !routeBuilder.isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONTEXT_REF:
				return routeContextRef != null && !routeContextRef.isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REST_CONTEXT_REF:
				return restContextRef != null && !restContextRef.isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_POOL_PROFILE:
				return threadPoolProfile != null && !threadPoolProfile.isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_POOL:
				return threadPool != null && !threadPool.isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ENDPOINT:
				return endpoint != null && !endpoint.isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DATA_FORMATS:
				return dataFormats != null;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRANSFORMERS:
				return transformers != null;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__VALIDATORS:
				return validators != null;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REDELIVERY_POLICY_PROFILE:
				return redeliveryPolicyProfile != null && !redeliveryPolicyProfile.isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ON_EXCEPTION:
				return onException != null && !onException.isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ON_COMPLETION:
				return onCompletion != null && !onCompletion.isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT:
				return intercept != null && !intercept.isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT_FROM:
				return interceptFrom != null && !interceptFrom.isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT_SEND_TO_ENDPOINT:
				return interceptSendToEndpoint != null && !interceptSendToEndpoint.isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REST_CONFIGURATION:
				return restConfiguration != null;
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REST:
				return rest != null && !rest.isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONFIGURATION:
				return routeConfiguration != null && !routeConfiguration.isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_TEMPLATE:
				return routeTemplate != null && !routeTemplate.isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TEMPLATED_ROUTE:
				return templatedRoute != null && !templatedRoute.isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE:
				return route != null && !route.isEmpty();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ALLOW_USE_ORIGINAL_MESSAGE:
				return ALLOW_USE_ORIGINAL_MESSAGE_EDEFAULT == null ? allowUseOriginalMessage != null : !ALLOW_USE_ORIGINAL_MESSAGE_EDEFAULT.equals(allowUseOriginalMessage);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__AUTO_STARTUP:
				return AUTO_STARTUP_EDEFAULT == null ? autoStartup != null : !AUTO_STARTUP_EDEFAULT.equals(autoStartup);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__AUTOWIRED_ENABLED:
				return AUTOWIRED_ENABLED_EDEFAULT == null ? autowiredEnabled != null : !AUTOWIRED_ENABLED_EDEFAULT.equals(autowiredEnabled);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__BACKLOG_TRACE:
				return BACKLOG_TRACE_EDEFAULT == null ? backlogTrace != null : !BACKLOG_TRACE_EDEFAULT.equals(backlogTrace);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__BEAN_POST_PROCESSOR_ENABLED:
				return BEAN_POST_PROCESSOR_ENABLED_EDEFAULT == null ? beanPostProcessorEnabled != null : !BEAN_POST_PROCESSOR_ENABLED_EDEFAULT.equals(beanPostProcessorEnabled);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CASE_INSENSITIVE_HEADERS:
				return CASE_INSENSITIVE_HEADERS_EDEFAULT == null ? caseInsensitiveHeaders != null : !CASE_INSENSITIVE_HEADERS_EDEFAULT.equals(caseInsensitiveHeaders);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEBUG:
				return DEBUG_EDEFAULT == null ? debug != null : !DEBUG_EDEFAULT.equals(debug);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DELAYER:
				return DELAYER_EDEFAULT == null ? delayer != null : !DELAYER_EDEFAULT.equals(delayer);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEPENDS_ON:
				return DEPENDS_ON_EDEFAULT == null ? dependsOn != null : !DEPENDS_ON_EDEFAULT.equals(dependsOn);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DUMP_ROUTES:
				return DUMP_ROUTES_EDEFAULT == null ? dumpRoutes != null : !DUMP_ROUTES_EDEFAULT.equals(dumpRoutes);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ERROR_HANDLER_REF:
				return ERROR_HANDLER_REF_EDEFAULT == null ? errorHandlerRef != null : !ERROR_HANDLER_REF_EDEFAULT.equals(errorHandlerRef);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INFLIGHT_REPOSITORY_BROWSE_ENABLED:
				return INFLIGHT_REPOSITORY_BROWSE_ENABLED_EDEFAULT == null ? inflightRepositoryBrowseEnabled != null : !INFLIGHT_REPOSITORY_BROWSE_ENABLED_EDEFAULT.equals(inflightRepositoryBrowseEnabled);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LOAD_HEALTH_CHECKS:
				return LOAD_HEALTH_CHECKS_EDEFAULT == null ? loadHealthChecks != null : !LOAD_HEALTH_CHECKS_EDEFAULT.equals(loadHealthChecks);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LOAD_TYPE_CONVERTERS:
				return LOAD_TYPE_CONVERTERS_EDEFAULT == null ? loadTypeConverters != null : !LOAD_TYPE_CONVERTERS_EDEFAULT.equals(loadTypeConverters);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LOG_EXHAUSTED_MESSAGE_BODY:
				return LOG_EXHAUSTED_MESSAGE_BODY_EDEFAULT == null ? logExhaustedMessageBody != null : !LOG_EXHAUSTED_MESSAGE_BODY_EDEFAULT.equals(logExhaustedMessageBody);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LOG_MASK:
				return LOG_MASK_EDEFAULT == null ? logMask != null : !LOG_MASK_EDEFAULT.equals(logMask);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__MANAGEMENT_NAME_PATTERN:
				return MANAGEMENT_NAME_PATTERN_EDEFAULT == null ? managementNamePattern != null : !MANAGEMENT_NAME_PATTERN_EDEFAULT.equals(managementNamePattern);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__MDC_LOGGING_KEYS_PATTERN:
				return MDC_LOGGING_KEYS_PATTERN_EDEFAULT == null ? mdcLoggingKeysPattern != null : !MDC_LOGGING_KEYS_PATTERN_EDEFAULT.equals(mdcLoggingKeysPattern);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__MESSAGE_HISTORY:
				return MESSAGE_HISTORY_EDEFAULT == null ? messageHistory != null : !MESSAGE_HISTORY_EDEFAULT.equals(messageHistory);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__RUNTIME_ENDPOINT_REGISTRY_ENABLED:
				return RUNTIME_ENDPOINT_REGISTRY_ENABLED_EDEFAULT == null ? runtimeEndpointRegistryEnabled != null : !RUNTIME_ENDPOINT_REGISTRY_ENABLED_EDEFAULT.equals(runtimeEndpointRegistryEnabled);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_EAGER:
				return SHUTDOWN_EAGER_EDEFAULT == null ? shutdownEager != null : !SHUTDOWN_EAGER_EDEFAULT.equals(shutdownEager);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_ROUTE:
				return isSetShutdownRoute();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_RUNNING_TASK:
				return isSetShutdownRunningTask();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SOURCE_LOCATION_ENABLED:
				return SOURCE_LOCATION_ENABLED_EDEFAULT == null ? sourceLocationEnabled != null : !SOURCE_LOCATION_ENABLED_EDEFAULT.equals(sourceLocationEnabled);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__STARTUP_SUMMARY_LEVEL:
				return isSetStartupSummaryLevel();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__STREAM_CACHE:
				return STREAM_CACHE_EDEFAULT == null ? streamCache != null : !STREAM_CACHE_EDEFAULT.equals(streamCache);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_NAME_PATTERN:
				return THREAD_NAME_PATTERN_EDEFAULT == null ? threadNamePattern != null : !THREAD_NAME_PATTERN_EDEFAULT.equals(threadNamePattern);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRACE:
				return TRACE_EDEFAULT == null ? trace != null : !TRACE_EDEFAULT.equals(trace);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRACE_LOGGING_FORMAT:
				return TRACE_LOGGING_FORMAT_EDEFAULT == null ? traceLoggingFormat != null : !TRACE_LOGGING_FORMAT_EDEFAULT.equals(traceLoggingFormat);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRACE_PATTERN:
				return TRACE_PATTERN_EDEFAULT == null ? tracePattern != null : !TRACE_PATTERN_EDEFAULT.equals(tracePattern);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TYPE_CONVERTER_EXISTS:
				return isSetTypeConverterExists();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TYPE_CONVERTER_EXISTS_LOGGING_LEVEL:
				return isSetTypeConverterExistsLoggingLevel();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TYPE_CONVERTER_STATISTICS_ENABLED:
				return TYPE_CONVERTER_STATISTICS_ENABLED_EDEFAULT == null ? typeConverterStatisticsEnabled != null : !TYPE_CONVERTER_STATISTICS_ENABLED_EDEFAULT.equals(typeConverterStatisticsEnabled);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_BREADCRUMB:
				return USE_BREADCRUMB_EDEFAULT == null ? useBreadcrumb != null : !USE_BREADCRUMB_EDEFAULT.equals(useBreadcrumb);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_DATA_TYPE:
				return USE_DATA_TYPE_EDEFAULT == null ? useDataType != null : !USE_DATA_TYPE_EDEFAULT.equals(useDataType);
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_MDC_LOGGING:
				return USE_MDC_LOGGING_EDEFAULT == null ? useMDCLogging != null : !USE_MDC_LOGGING_EDEFAULT.equals(useMDCLogging);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (package: ");
		result.append(package_);
		result.append(", group: ");
		result.append(group);
		result.append(", allowUseOriginalMessage: ");
		result.append(allowUseOriginalMessage);
		result.append(", autoStartup: ");
		result.append(autoStartup);
		result.append(", autowiredEnabled: ");
		result.append(autowiredEnabled);
		result.append(", backlogTrace: ");
		result.append(backlogTrace);
		result.append(", beanPostProcessorEnabled: ");
		result.append(beanPostProcessorEnabled);
		result.append(", caseInsensitiveHeaders: ");
		result.append(caseInsensitiveHeaders);
		result.append(", debug: ");
		result.append(debug);
		result.append(", delayer: ");
		result.append(delayer);
		result.append(", dependsOn: ");
		result.append(dependsOn);
		result.append(", dumpRoutes: ");
		result.append(dumpRoutes);
		result.append(", errorHandlerRef: ");
		result.append(errorHandlerRef);
		result.append(", inflightRepositoryBrowseEnabled: ");
		result.append(inflightRepositoryBrowseEnabled);
		result.append(", loadHealthChecks: ");
		result.append(loadHealthChecks);
		result.append(", loadTypeConverters: ");
		result.append(loadTypeConverters);
		result.append(", logExhaustedMessageBody: ");
		result.append(logExhaustedMessageBody);
		result.append(", logMask: ");
		result.append(logMask);
		result.append(", managementNamePattern: ");
		result.append(managementNamePattern);
		result.append(", mdcLoggingKeysPattern: ");
		result.append(mdcLoggingKeysPattern);
		result.append(", messageHistory: ");
		result.append(messageHistory);
		result.append(", runtimeEndpointRegistryEnabled: ");
		result.append(runtimeEndpointRegistryEnabled);
		result.append(", shutdownEager: ");
		result.append(shutdownEager);
		result.append(", shutdownRoute: ");
		if (shutdownRouteESet) result.append(shutdownRoute); else result.append("<unset>");
		result.append(", shutdownRunningTask: ");
		if (shutdownRunningTaskESet) result.append(shutdownRunningTask); else result.append("<unset>");
		result.append(", sourceLocationEnabled: ");
		result.append(sourceLocationEnabled);
		result.append(", startupSummaryLevel: ");
		if (startupSummaryLevelESet) result.append(startupSummaryLevel); else result.append("<unset>");
		result.append(", streamCache: ");
		result.append(streamCache);
		result.append(", threadNamePattern: ");
		result.append(threadNamePattern);
		result.append(", trace: ");
		result.append(trace);
		result.append(", traceLoggingFormat: ");
		result.append(traceLoggingFormat);
		result.append(", tracePattern: ");
		result.append(tracePattern);
		result.append(", typeConverterExists: ");
		if (typeConverterExistsESet) result.append(typeConverterExists); else result.append("<unset>");
		result.append(", typeConverterExistsLoggingLevel: ");
		if (typeConverterExistsLoggingLevelESet) result.append(typeConverterExistsLoggingLevel); else result.append("<unset>");
		result.append(", typeConverterStatisticsEnabled: ");
		result.append(typeConverterStatisticsEnabled);
		result.append(", useBreadcrumb: ");
		result.append(useBreadcrumb);
		result.append(", useDataType: ");
		result.append(useDataType);
		result.append(", useMDCLogging: ");
		result.append(useMDCLogging);
		result.append(')');
		return result.toString();
	}

} //CamelContextFactoryBeanImpl
