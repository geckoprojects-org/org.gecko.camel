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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.camel.camelspring.AggregateDefinition;
import org.eclipse.fennec.camel.camelspring.BeanDefinition;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.CatchDefinition;
import org.eclipse.fennec.camel.camelspring.ChoiceDefinition;
import org.eclipse.fennec.camel.camelspring.CircuitBreakerDefinition;
import org.eclipse.fennec.camel.camelspring.ClaimCheckDefinition;
import org.eclipse.fennec.camel.camelspring.ConvertBodyDefinition;
import org.eclipse.fennec.camel.camelspring.ConvertHeaderDefinition;
import org.eclipse.fennec.camel.camelspring.ConvertVariableDefinition;
import org.eclipse.fennec.camel.camelspring.DelayDefinition;
import org.eclipse.fennec.camel.camelspring.DynamicRouterDefinition;
import org.eclipse.fennec.camel.camelspring.EnrichDefinition;
import org.eclipse.fennec.camel.camelspring.FilterDefinition;
import org.eclipse.fennec.camel.camelspring.FinallyDefinition;
import org.eclipse.fennec.camel.camelspring.FromDefinition;
import org.eclipse.fennec.camel.camelspring.IdempotentConsumerDefinition;
import org.eclipse.fennec.camel.camelspring.InputTypeDefinition;
import org.eclipse.fennec.camel.camelspring.InterceptDefinition;
import org.eclipse.fennec.camel.camelspring.InterceptFromDefinition;
import org.eclipse.fennec.camel.camelspring.InterceptSendToEndpointDefinition;
import org.eclipse.fennec.camel.camelspring.KameletDefinition;
import org.eclipse.fennec.camel.camelspring.LoadBalanceDefinition;
import org.eclipse.fennec.camel.camelspring.LogDefinition;
import org.eclipse.fennec.camel.camelspring.LoopDefinition;
import org.eclipse.fennec.camel.camelspring.MarshalDefinition;
import org.eclipse.fennec.camel.camelspring.MulticastDefinition;
import org.eclipse.fennec.camel.camelspring.OnCompletionDefinition;
import org.eclipse.fennec.camel.camelspring.OnExceptionDefinition;
import org.eclipse.fennec.camel.camelspring.OutputTypeDefinition;
import org.eclipse.fennec.camel.camelspring.PausableDefinition;
import org.eclipse.fennec.camel.camelspring.PipelineDefinition;
import org.eclipse.fennec.camel.camelspring.PolicyDefinition;
import org.eclipse.fennec.camel.camelspring.PollDefinition;
import org.eclipse.fennec.camel.camelspring.PollEnrichDefinition;
import org.eclipse.fennec.camel.camelspring.ProcessDefinition;
import org.eclipse.fennec.camel.camelspring.PropertyDefinition;
import org.eclipse.fennec.camel.camelspring.RecipientListDefinition;
import org.eclipse.fennec.camel.camelspring.RemoveHeaderDefinition;
import org.eclipse.fennec.camel.camelspring.RemoveHeadersDefinition;
import org.eclipse.fennec.camel.camelspring.RemovePropertiesDefinition;
import org.eclipse.fennec.camel.camelspring.RemovePropertyDefinition;
import org.eclipse.fennec.camel.camelspring.RemoveVariableDefinition;
import org.eclipse.fennec.camel.camelspring.ResequenceDefinition;
import org.eclipse.fennec.camel.camelspring.ResumableDefinition;
import org.eclipse.fennec.camel.camelspring.RollbackDefinition;
import org.eclipse.fennec.camel.camelspring.RouteDefinition;
import org.eclipse.fennec.camel.camelspring.RoutingSlipDefinition;
import org.eclipse.fennec.camel.camelspring.SagaDefinition;
import org.eclipse.fennec.camel.camelspring.SamplingDefinition;
import org.eclipse.fennec.camel.camelspring.ScriptDefinition;
import org.eclipse.fennec.camel.camelspring.ServiceCallDefinition;
import org.eclipse.fennec.camel.camelspring.SetBodyDefinition;
import org.eclipse.fennec.camel.camelspring.SetExchangePatternDefinition;
import org.eclipse.fennec.camel.camelspring.SetHeaderDefinition;
import org.eclipse.fennec.camel.camelspring.SetHeadersDefinition;
import org.eclipse.fennec.camel.camelspring.SetPropertyDefinition;
import org.eclipse.fennec.camel.camelspring.SetVariableDefinition;
import org.eclipse.fennec.camel.camelspring.SetVariablesDefinition;
import org.eclipse.fennec.camel.camelspring.SortDefinition;
import org.eclipse.fennec.camel.camelspring.SplitDefinition;
import org.eclipse.fennec.camel.camelspring.StepDefinition;
import org.eclipse.fennec.camel.camelspring.StopDefinition;
import org.eclipse.fennec.camel.camelspring.ThreadsDefinition;
import org.eclipse.fennec.camel.camelspring.ThrottleDefinition;
import org.eclipse.fennec.camel.camelspring.ThrowExceptionDefinition;
import org.eclipse.fennec.camel.camelspring.ToDefinition;
import org.eclipse.fennec.camel.camelspring.ToDynamicDefinition;
import org.eclipse.fennec.camel.camelspring.TokenizerDefinition;
import org.eclipse.fennec.camel.camelspring.TransactedDefinition;
import org.eclipse.fennec.camel.camelspring.TransformDefinition;
import org.eclipse.fennec.camel.camelspring.TryDefinition;
import org.eclipse.fennec.camel.camelspring.UnmarshalDefinition;
import org.eclipse.fennec.camel.camelspring.ValidateDefinition;
import org.eclipse.fennec.camel.camelspring.WireTapDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getRouteProperty <em>Route Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getErrorHandler <em>Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getInputType <em>Input Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getOutputType <em>Output Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getDoCatch <em>Do Catch</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getCircuitBreaker <em>Circuit Breaker</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getClaimCheck <em>Claim Check</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getConvertBodyTo <em>Convert Body To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getConvertHeaderTo <em>Convert Header To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getConvertVariableTo <em>Convert Variable To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getDynamicRouter <em>Dynamic Router</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getEnrich <em>Enrich</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getDoFinally <em>Do Finally</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getIdempotentConsumer <em>Idempotent Consumer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getInterceptSendToEndpoint <em>Intercept Send To Endpoint</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getKamelet <em>Kamelet</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getLog <em>Log</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getMarshal <em>Marshal</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getPausable <em>Pausable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getPoll <em>Poll</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getPollEnrich <em>Poll Enrich</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getRecipientList <em>Recipient List</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getRemoveHeader <em>Remove Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getRemoveHeaders <em>Remove Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getRemoveProperties <em>Remove Properties</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getRemoveProperty <em>Remove Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getRemoveVariable <em>Remove Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getResequence <em>Resequence</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getResumable <em>Resumable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getRoutingSlip <em>Routing Slip</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getSaga <em>Saga</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getSample <em>Sample</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getSetBody <em>Set Body</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getSetExchangePattern <em>Set Exchange Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getSetHeaders <em>Set Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getSetProperty <em>Set Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getSetVariable <em>Set Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getSetVariables <em>Set Variables</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getSplit <em>Split</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getThrottle <em>Throttle</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getToD <em>To D</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getTokenizer <em>Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getDoTry <em>Do Try</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getUnmarshal <em>Unmarshal</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getWireTap <em>Wire Tap</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getServiceCall <em>Service Call</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getAutoStartup <em>Auto Startup</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getDelayer <em>Delayer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getErrorHandlerRef <em>Error Handler Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#isKamelet1 <em>Kamelet1</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getLogMask <em>Log Mask</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getMessageHistory <em>Message History</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getNodePrefixId <em>Node Prefix Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#isRest <em>Rest</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getRouteConfigurationId <em>Route Configuration Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getRoutePolicyRef <em>Route Policy Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getShutdownRoute <em>Shutdown Route</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getShutdownRunningTask <em>Shutdown Running Task</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getStartupOrder <em>Startup Order</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getStreamCache <em>Stream Cache</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#isTemplate <em>Template</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteDefinitionImpl#getTrace <em>Trace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouteDefinitionImpl extends OutputImpl implements RouteDefinition {
	/**
	 * The cached value of the '{@link #getRouteProperty() <em>Route Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyDefinition> routeProperty;

	/**
	 * The cached value of the '{@link #getErrorHandler() <em>Error Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorHandler()
	 * @generated
	 * @ordered
	 */
	protected EObject errorHandler;

	/**
	 * This is true if the Error Handler containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean errorHandlerESet;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected FromDefinition from;

	/**
	 * The cached value of the '{@link #getInputType() <em>Input Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputType()
	 * @generated
	 * @ordered
	 */
	protected InputTypeDefinition inputType;

	/**
	 * The cached value of the '{@link #getOutputType() <em>Output Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputType()
	 * @generated
	 * @ordered
	 */
	protected OutputTypeDefinition outputType;

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
	 * The default value of the '{@link #getGroup1() <em>Group1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup1()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup1() <em>Group1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup1()
	 * @generated
	 * @ordered
	 */
	protected String group1 = GROUP1_EDEFAULT;

	/**
	 * The default value of the '{@link #isKamelet1() <em>Kamelet1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKamelet1()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KAMELET1_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKamelet1() <em>Kamelet1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKamelet1()
	 * @generated
	 * @ordered
	 */
	protected boolean kamelet1 = KAMELET1_EDEFAULT;

	/**
	 * This is true if the Kamelet1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kamelet1ESet;

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
	 * The default value of the '{@link #getNodePrefixId() <em>Node Prefix Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodePrefixId()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_PREFIX_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodePrefixId() <em>Node Prefix Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodePrefixId()
	 * @generated
	 * @ordered
	 */
	protected String nodePrefixId = NODE_PREFIX_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecondition() <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected String precondition = PRECONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isRest() <em>Rest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRest()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRest() <em>Rest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRest()
	 * @generated
	 * @ordered
	 */
	protected boolean rest = REST_EDEFAULT;

	/**
	 * This is true if the Rest attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean restESet;

	/**
	 * The default value of the '{@link #getRouteConfigurationId() <em>Route Configuration Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteConfigurationId()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTE_CONFIGURATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRouteConfigurationId() <em>Route Configuration Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteConfigurationId()
	 * @generated
	 * @ordered
	 */
	protected String routeConfigurationId = ROUTE_CONFIGURATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoutePolicyRef() <em>Route Policy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutePolicyRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTE_POLICY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoutePolicyRef() <em>Route Policy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutePolicyRef()
	 * @generated
	 * @ordered
	 */
	protected String routePolicyRef = ROUTE_POLICY_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getShutdownRoute() <em>Shutdown Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShutdownRoute()
	 * @generated
	 * @ordered
	 */
	protected static final String SHUTDOWN_ROUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShutdownRoute() <em>Shutdown Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShutdownRoute()
	 * @generated
	 * @ordered
	 */
	protected String shutdownRoute = SHUTDOWN_ROUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShutdownRunningTask() <em>Shutdown Running Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShutdownRunningTask()
	 * @generated
	 * @ordered
	 */
	protected static final String SHUTDOWN_RUNNING_TASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShutdownRunningTask() <em>Shutdown Running Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShutdownRunningTask()
	 * @generated
	 * @ordered
	 */
	protected String shutdownRunningTask = SHUTDOWN_RUNNING_TASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartupOrder() <em>Startup Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int STARTUP_ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartupOrder() <em>Startup Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupOrder()
	 * @generated
	 * @ordered
	 */
	protected int startupOrder = STARTUP_ORDER_EDEFAULT;

	/**
	 * This is true if the Startup Order attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startupOrderESet;

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
	 * The default value of the '{@link #isTemplate() <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEMPLATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTemplate() <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTemplate()
	 * @generated
	 * @ordered
	 */
	protected boolean template = TEMPLATE_EDEFAULT;

	/**
	 * This is true if the Template attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean templateESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getRouteDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyDefinition> getRouteProperty() {
		if (routeProperty == null) {
			routeProperty = new EObjectContainmentEList<PropertyDefinition>(PropertyDefinition.class, this, CamelSpringPackage.ROUTE_DEFINITION__ROUTE_PROPERTY);
		}
		return routeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getErrorHandler() {
		return errorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorHandler(EObject newErrorHandler, NotificationChain msgs) {
		EObject oldErrorHandler = errorHandler;
		errorHandler = newErrorHandler;
		boolean oldErrorHandlerESet = errorHandlerESet;
		errorHandlerESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_DEFINITION__ERROR_HANDLER, oldErrorHandler, newErrorHandler, !oldErrorHandlerESet);
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
	public void setErrorHandler(EObject newErrorHandler) {
		if (newErrorHandler != errorHandler) {
			NotificationChain msgs = null;
			if (errorHandler != null)
				msgs = ((InternalEObject)errorHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.ROUTE_DEFINITION__ERROR_HANDLER, null, msgs);
			if (newErrorHandler != null)
				msgs = ((InternalEObject)newErrorHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.ROUTE_DEFINITION__ERROR_HANDLER, null, msgs);
			msgs = basicSetErrorHandler(newErrorHandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldErrorHandlerESet = errorHandlerESet;
			errorHandlerESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_DEFINITION__ERROR_HANDLER, newErrorHandler, newErrorHandler, !oldErrorHandlerESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetErrorHandler(NotificationChain msgs) {
		EObject oldErrorHandler = errorHandler;
		errorHandler = null;
		boolean oldErrorHandlerESet = errorHandlerESet;
		errorHandlerESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.ROUTE_DEFINITION__ERROR_HANDLER, oldErrorHandler, null, oldErrorHandlerESet);
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
	public void unsetErrorHandler() {
		if (errorHandler != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)errorHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.ROUTE_DEFINITION__ERROR_HANDLER, null, msgs);
			msgs = basicUnsetErrorHandler(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldErrorHandlerESet = errorHandlerESet;
			errorHandlerESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.ROUTE_DEFINITION__ERROR_HANDLER, null, null, oldErrorHandlerESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetErrorHandler() {
		return errorHandlerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FromDefinition getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(FromDefinition newFrom, NotificationChain msgs) {
		FromDefinition oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_DEFINITION__FROM, oldFrom, newFrom);
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
	public void setFrom(FromDefinition newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.ROUTE_DEFINITION__FROM, null, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.ROUTE_DEFINITION__FROM, null, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_DEFINITION__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputTypeDefinition getInputType() {
		return inputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputType(InputTypeDefinition newInputType, NotificationChain msgs) {
		InputTypeDefinition oldInputType = inputType;
		inputType = newInputType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_DEFINITION__INPUT_TYPE, oldInputType, newInputType);
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
	public void setInputType(InputTypeDefinition newInputType) {
		if (newInputType != inputType) {
			NotificationChain msgs = null;
			if (inputType != null)
				msgs = ((InternalEObject)inputType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.ROUTE_DEFINITION__INPUT_TYPE, null, msgs);
			if (newInputType != null)
				msgs = ((InternalEObject)newInputType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.ROUTE_DEFINITION__INPUT_TYPE, null, msgs);
			msgs = basicSetInputType(newInputType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_DEFINITION__INPUT_TYPE, newInputType, newInputType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputTypeDefinition getOutputType() {
		return outputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputType(OutputTypeDefinition newOutputType, NotificationChain msgs) {
		OutputTypeDefinition oldOutputType = outputType;
		outputType = newOutputType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_DEFINITION__OUTPUT_TYPE, oldOutputType, newOutputType);
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
	public void setOutputType(OutputTypeDefinition newOutputType) {
		if (newOutputType != outputType) {
			NotificationChain msgs = null;
			if (outputType != null)
				msgs = ((InternalEObject)outputType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.ROUTE_DEFINITION__OUTPUT_TYPE, null, msgs);
			if (newOutputType != null)
				msgs = ((InternalEObject)newOutputType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.ROUTE_DEFINITION__OUTPUT_TYPE, null, msgs);
			msgs = basicSetOutputType(newOutputType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_DEFINITION__OUTPUT_TYPE, newOutputType, newOutputType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CamelSpringPackage.ROUTE_DEFINITION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AggregateDefinition> getAggregate() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Aggregate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BeanDefinition> getBean() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Bean());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CatchDefinition> getDoCatch() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_DoCatch());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChoiceDefinition> getChoice() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Choice());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CircuitBreakerDefinition> getCircuitBreaker() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_CircuitBreaker());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimCheckDefinition> getClaimCheck() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_ClaimCheck());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConvertBodyDefinition> getConvertBodyTo() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_ConvertBodyTo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConvertHeaderDefinition> getConvertHeaderTo() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_ConvertHeaderTo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConvertVariableDefinition> getConvertVariableTo() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_ConvertVariableTo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DelayDefinition> getDelay() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Delay());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DynamicRouterDefinition> getDynamicRouter() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_DynamicRouter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnrichDefinition> getEnrich() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Enrich());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FilterDefinition> getFilter() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Filter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinallyDefinition> getDoFinally() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_DoFinally());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IdempotentConsumerDefinition> getIdempotentConsumer() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_IdempotentConsumer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterceptDefinition> getIntercept() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Intercept());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterceptFromDefinition> getInterceptFrom() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_InterceptFrom());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterceptSendToEndpointDefinition> getInterceptSendToEndpoint() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_InterceptSendToEndpoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KameletDefinition> getKamelet() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Kamelet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LoadBalanceDefinition> getLoadBalance() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_LoadBalance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogDefinition> getLog() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Log());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LoopDefinition> getLoop() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Loop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarshalDefinition> getMarshal() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Marshal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MulticastDefinition> getMulticast() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Multicast());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OnCompletionDefinition> getOnCompletion() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_OnCompletion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OnExceptionDefinition> getOnException() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_OnException());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PausableDefinition> getPausable() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Pausable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PipelineDefinition> getPipeline() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Pipeline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PolicyDefinition> getPolicy() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Policy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PollDefinition> getPoll() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Poll());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PollEnrichDefinition> getPollEnrich() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_PollEnrich());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessDefinition> getProcess() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Process());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RecipientListDefinition> getRecipientList() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_RecipientList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemoveHeaderDefinition> getRemoveHeader() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_RemoveHeader());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemoveHeadersDefinition> getRemoveHeaders() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_RemoveHeaders());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemovePropertiesDefinition> getRemoveProperties() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_RemoveProperties());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemovePropertyDefinition> getRemoveProperty() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_RemoveProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemoveVariableDefinition> getRemoveVariable() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_RemoveVariable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResequenceDefinition> getResequence() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Resequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResumableDefinition> getResumable() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Resumable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RollbackDefinition> getRollback() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Rollback());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RouteDefinition> getRoute() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Route());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RoutingSlipDefinition> getRoutingSlip() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_RoutingSlip());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SagaDefinition> getSaga() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Saga());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SamplingDefinition> getSample() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Sample());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScriptDefinition> getScript() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Script());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetBodyDefinition> getSetBody() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_SetBody());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetExchangePatternDefinition> getSetExchangePattern() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_SetExchangePattern());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetHeaderDefinition> getSetHeader() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_SetHeader());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetHeadersDefinition> getSetHeaders() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_SetHeaders());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetPropertyDefinition> getSetProperty() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_SetProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetVariableDefinition> getSetVariable() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_SetVariable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetVariablesDefinition> getSetVariables() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_SetVariables());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SortDefinition> getSort() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Sort());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SplitDefinition> getSplit() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Split());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StepDefinition> getStep() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Step());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StopDefinition> getStop() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Stop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThreadsDefinition> getThreads() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Threads());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThrottleDefinition> getThrottle() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Throttle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThrowExceptionDefinition> getThrowException() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_ThrowException());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ToDefinition> getTo() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_To());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ToDynamicDefinition> getToD() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_ToD());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TokenizerDefinition> getTokenizer() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Tokenizer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransactedDefinition> getTransacted() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Transacted());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransformDefinition> getTransform() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Transform());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TryDefinition> getDoTry() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_DoTry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnmarshalDefinition> getUnmarshal() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Unmarshal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValidateDefinition> getValidate() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_Validate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WireTapDefinition> getWireTap() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_WireTap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceCallDefinition> getServiceCall() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRouteDefinition_ServiceCall());
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_DEFINITION__AUTO_STARTUP, oldAutoStartup, autoStartup));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_DEFINITION__DELAYER, oldDelayer, delayer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_DEFINITION__ERROR_HANDLER_REF, oldErrorHandlerRef, errorHandlerRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroup1() {
		return group1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup1(String newGroup1) {
		String oldGroup1 = group1;
		group1 = newGroup1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_DEFINITION__GROUP1, oldGroup1, group1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isKamelet1() {
		return kamelet1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKamelet1(boolean newKamelet1) {
		boolean oldKamelet1 = kamelet1;
		kamelet1 = newKamelet1;
		boolean oldKamelet1ESet = kamelet1ESet;
		kamelet1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_DEFINITION__KAMELET1, oldKamelet1, kamelet1, !oldKamelet1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetKamelet1() {
		boolean oldKamelet1 = kamelet1;
		boolean oldKamelet1ESet = kamelet1ESet;
		kamelet1 = KAMELET1_EDEFAULT;
		kamelet1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.ROUTE_DEFINITION__KAMELET1, oldKamelet1, KAMELET1_EDEFAULT, oldKamelet1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetKamelet1() {
		return kamelet1ESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_DEFINITION__LOG_MASK, oldLogMask, logMask));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_DEFINITION__MESSAGE_HISTORY, oldMessageHistory, messageHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNodePrefixId() {
		return nodePrefixId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNodePrefixId(String newNodePrefixId) {
		String oldNodePrefixId = nodePrefixId;
		nodePrefixId = newNodePrefixId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_DEFINITION__NODE_PREFIX_ID, oldNodePrefixId, nodePrefixId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrecondition() {
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecondition(String newPrecondition) {
		String oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_DEFINITION__PRECONDITION, oldPrecondition, precondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRest() {
		return rest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRest(boolean newRest) {
		boolean oldRest = rest;
		rest = newRest;
		boolean oldRestESet = restESet;
		restESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_DEFINITION__REST, oldRest, rest, !oldRestESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRest() {
		boolean oldRest = rest;
		boolean oldRestESet = restESet;
		rest = REST_EDEFAULT;
		restESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.ROUTE_DEFINITION__REST, oldRest, REST_EDEFAULT, oldRestESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRest() {
		return restESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRouteConfigurationId() {
		return routeConfigurationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteConfigurationId(String newRouteConfigurationId) {
		String oldRouteConfigurationId = routeConfigurationId;
		routeConfigurationId = newRouteConfigurationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_DEFINITION__ROUTE_CONFIGURATION_ID, oldRouteConfigurationId, routeConfigurationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoutePolicyRef() {
		return routePolicyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoutePolicyRef(String newRoutePolicyRef) {
		String oldRoutePolicyRef = routePolicyRef;
		routePolicyRef = newRoutePolicyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_DEFINITION__ROUTE_POLICY_REF, oldRoutePolicyRef, routePolicyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShutdownRoute() {
		return shutdownRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShutdownRoute(String newShutdownRoute) {
		String oldShutdownRoute = shutdownRoute;
		shutdownRoute = newShutdownRoute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_DEFINITION__SHUTDOWN_ROUTE, oldShutdownRoute, shutdownRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShutdownRunningTask() {
		return shutdownRunningTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShutdownRunningTask(String newShutdownRunningTask) {
		String oldShutdownRunningTask = shutdownRunningTask;
		shutdownRunningTask = newShutdownRunningTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_DEFINITION__SHUTDOWN_RUNNING_TASK, oldShutdownRunningTask, shutdownRunningTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStartupOrder() {
		return startupOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartupOrder(int newStartupOrder) {
		int oldStartupOrder = startupOrder;
		startupOrder = newStartupOrder;
		boolean oldStartupOrderESet = startupOrderESet;
		startupOrderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_DEFINITION__STARTUP_ORDER, oldStartupOrder, startupOrder, !oldStartupOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStartupOrder() {
		int oldStartupOrder = startupOrder;
		boolean oldStartupOrderESet = startupOrderESet;
		startupOrder = STARTUP_ORDER_EDEFAULT;
		startupOrderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.ROUTE_DEFINITION__STARTUP_ORDER, oldStartupOrder, STARTUP_ORDER_EDEFAULT, oldStartupOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStartupOrder() {
		return startupOrderESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_DEFINITION__STREAM_CACHE, oldStreamCache, streamCache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplate(boolean newTemplate) {
		boolean oldTemplate = template;
		template = newTemplate;
		boolean oldTemplateESet = templateESet;
		templateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_DEFINITION__TEMPLATE, oldTemplate, template, !oldTemplateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTemplate() {
		boolean oldTemplate = template;
		boolean oldTemplateESet = templateESet;
		template = TEMPLATE_EDEFAULT;
		templateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.ROUTE_DEFINITION__TEMPLATE, oldTemplate, TEMPLATE_EDEFAULT, oldTemplateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTemplate() {
		return templateESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_DEFINITION__TRACE, oldTrace, trace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.ROUTE_DEFINITION__ROUTE_PROPERTY:
				return ((InternalEList<?>)getRouteProperty()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__ERROR_HANDLER:
				return basicUnsetErrorHandler(msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__FROM:
				return basicSetFrom(null, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__INPUT_TYPE:
				return basicSetInputType(null, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__OUTPUT_TYPE:
				return basicSetOutputType(null, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__AGGREGATE:
				return ((InternalEList<?>)getAggregate()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__BEAN:
				return ((InternalEList<?>)getBean()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__DO_CATCH:
				return ((InternalEList<?>)getDoCatch()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__CHOICE:
				return ((InternalEList<?>)getChoice()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__CIRCUIT_BREAKER:
				return ((InternalEList<?>)getCircuitBreaker()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__CLAIM_CHECK:
				return ((InternalEList<?>)getClaimCheck()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__CONVERT_BODY_TO:
				return ((InternalEList<?>)getConvertBodyTo()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__CONVERT_HEADER_TO:
				return ((InternalEList<?>)getConvertHeaderTo()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__CONVERT_VARIABLE_TO:
				return ((InternalEList<?>)getConvertVariableTo()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__DELAY:
				return ((InternalEList<?>)getDelay()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__DYNAMIC_ROUTER:
				return ((InternalEList<?>)getDynamicRouter()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__ENRICH:
				return ((InternalEList<?>)getEnrich()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__FILTER:
				return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__DO_FINALLY:
				return ((InternalEList<?>)getDoFinally()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__IDEMPOTENT_CONSUMER:
				return ((InternalEList<?>)getIdempotentConsumer()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__INTERCEPT:
				return ((InternalEList<?>)getIntercept()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__INTERCEPT_FROM:
				return ((InternalEList<?>)getInterceptFrom()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				return ((InternalEList<?>)getInterceptSendToEndpoint()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__KAMELET:
				return ((InternalEList<?>)getKamelet()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__LOAD_BALANCE:
				return ((InternalEList<?>)getLoadBalance()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__LOG:
				return ((InternalEList<?>)getLog()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__LOOP:
				return ((InternalEList<?>)getLoop()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__MARSHAL:
				return ((InternalEList<?>)getMarshal()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__MULTICAST:
				return ((InternalEList<?>)getMulticast()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__ON_COMPLETION:
				return ((InternalEList<?>)getOnCompletion()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__ON_EXCEPTION:
				return ((InternalEList<?>)getOnException()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__PAUSABLE:
				return ((InternalEList<?>)getPausable()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__PIPELINE:
				return ((InternalEList<?>)getPipeline()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__POLICY:
				return ((InternalEList<?>)getPolicy()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__POLL:
				return ((InternalEList<?>)getPoll()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__POLL_ENRICH:
				return ((InternalEList<?>)getPollEnrich()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__PROCESS:
				return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__RECIPIENT_LIST:
				return ((InternalEList<?>)getRecipientList()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__REMOVE_HEADER:
				return ((InternalEList<?>)getRemoveHeader()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__REMOVE_HEADERS:
				return ((InternalEList<?>)getRemoveHeaders()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__REMOVE_PROPERTIES:
				return ((InternalEList<?>)getRemoveProperties()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__REMOVE_PROPERTY:
				return ((InternalEList<?>)getRemoveProperty()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__REMOVE_VARIABLE:
				return ((InternalEList<?>)getRemoveVariable()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__RESEQUENCE:
				return ((InternalEList<?>)getResequence()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__RESUMABLE:
				return ((InternalEList<?>)getResumable()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__ROLLBACK:
				return ((InternalEList<?>)getRollback()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__ROUTE:
				return ((InternalEList<?>)getRoute()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__ROUTING_SLIP:
				return ((InternalEList<?>)getRoutingSlip()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__SAGA:
				return ((InternalEList<?>)getSaga()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__SAMPLE:
				return ((InternalEList<?>)getSample()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__SCRIPT:
				return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__SET_BODY:
				return ((InternalEList<?>)getSetBody()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__SET_EXCHANGE_PATTERN:
				return ((InternalEList<?>)getSetExchangePattern()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__SET_HEADER:
				return ((InternalEList<?>)getSetHeader()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__SET_HEADERS:
				return ((InternalEList<?>)getSetHeaders()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__SET_PROPERTY:
				return ((InternalEList<?>)getSetProperty()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__SET_VARIABLE:
				return ((InternalEList<?>)getSetVariable()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__SET_VARIABLES:
				return ((InternalEList<?>)getSetVariables()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__SORT:
				return ((InternalEList<?>)getSort()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__SPLIT:
				return ((InternalEList<?>)getSplit()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__STEP:
				return ((InternalEList<?>)getStep()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__STOP:
				return ((InternalEList<?>)getStop()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__THREADS:
				return ((InternalEList<?>)getThreads()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__THROTTLE:
				return ((InternalEList<?>)getThrottle()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__THROW_EXCEPTION:
				return ((InternalEList<?>)getThrowException()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__TO:
				return ((InternalEList<?>)getTo()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__TO_D:
				return ((InternalEList<?>)getToD()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__TOKENIZER:
				return ((InternalEList<?>)getTokenizer()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__TRANSACTED:
				return ((InternalEList<?>)getTransacted()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__TRANSFORM:
				return ((InternalEList<?>)getTransform()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__DO_TRY:
				return ((InternalEList<?>)getDoTry()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__UNMARSHAL:
				return ((InternalEList<?>)getUnmarshal()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__VALIDATE:
				return ((InternalEList<?>)getValidate()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__WIRE_TAP:
				return ((InternalEList<?>)getWireTap()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_DEFINITION__SERVICE_CALL:
				return ((InternalEList<?>)getServiceCall()).basicRemove(otherEnd, msgs);
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
			case CamelSpringPackage.ROUTE_DEFINITION__ROUTE_PROPERTY:
				return getRouteProperty();
			case CamelSpringPackage.ROUTE_DEFINITION__ERROR_HANDLER:
				return getErrorHandler();
			case CamelSpringPackage.ROUTE_DEFINITION__FROM:
				return getFrom();
			case CamelSpringPackage.ROUTE_DEFINITION__INPUT_TYPE:
				return getInputType();
			case CamelSpringPackage.ROUTE_DEFINITION__OUTPUT_TYPE:
				return getOutputType();
			case CamelSpringPackage.ROUTE_DEFINITION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CamelSpringPackage.ROUTE_DEFINITION__AGGREGATE:
				return getAggregate();
			case CamelSpringPackage.ROUTE_DEFINITION__BEAN:
				return getBean();
			case CamelSpringPackage.ROUTE_DEFINITION__DO_CATCH:
				return getDoCatch();
			case CamelSpringPackage.ROUTE_DEFINITION__CHOICE:
				return getChoice();
			case CamelSpringPackage.ROUTE_DEFINITION__CIRCUIT_BREAKER:
				return getCircuitBreaker();
			case CamelSpringPackage.ROUTE_DEFINITION__CLAIM_CHECK:
				return getClaimCheck();
			case CamelSpringPackage.ROUTE_DEFINITION__CONVERT_BODY_TO:
				return getConvertBodyTo();
			case CamelSpringPackage.ROUTE_DEFINITION__CONVERT_HEADER_TO:
				return getConvertHeaderTo();
			case CamelSpringPackage.ROUTE_DEFINITION__CONVERT_VARIABLE_TO:
				return getConvertVariableTo();
			case CamelSpringPackage.ROUTE_DEFINITION__DELAY:
				return getDelay();
			case CamelSpringPackage.ROUTE_DEFINITION__DYNAMIC_ROUTER:
				return getDynamicRouter();
			case CamelSpringPackage.ROUTE_DEFINITION__ENRICH:
				return getEnrich();
			case CamelSpringPackage.ROUTE_DEFINITION__FILTER:
				return getFilter();
			case CamelSpringPackage.ROUTE_DEFINITION__DO_FINALLY:
				return getDoFinally();
			case CamelSpringPackage.ROUTE_DEFINITION__IDEMPOTENT_CONSUMER:
				return getIdempotentConsumer();
			case CamelSpringPackage.ROUTE_DEFINITION__INTERCEPT:
				return getIntercept();
			case CamelSpringPackage.ROUTE_DEFINITION__INTERCEPT_FROM:
				return getInterceptFrom();
			case CamelSpringPackage.ROUTE_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				return getInterceptSendToEndpoint();
			case CamelSpringPackage.ROUTE_DEFINITION__KAMELET:
				return getKamelet();
			case CamelSpringPackage.ROUTE_DEFINITION__LOAD_BALANCE:
				return getLoadBalance();
			case CamelSpringPackage.ROUTE_DEFINITION__LOG:
				return getLog();
			case CamelSpringPackage.ROUTE_DEFINITION__LOOP:
				return getLoop();
			case CamelSpringPackage.ROUTE_DEFINITION__MARSHAL:
				return getMarshal();
			case CamelSpringPackage.ROUTE_DEFINITION__MULTICAST:
				return getMulticast();
			case CamelSpringPackage.ROUTE_DEFINITION__ON_COMPLETION:
				return getOnCompletion();
			case CamelSpringPackage.ROUTE_DEFINITION__ON_EXCEPTION:
				return getOnException();
			case CamelSpringPackage.ROUTE_DEFINITION__PAUSABLE:
				return getPausable();
			case CamelSpringPackage.ROUTE_DEFINITION__PIPELINE:
				return getPipeline();
			case CamelSpringPackage.ROUTE_DEFINITION__POLICY:
				return getPolicy();
			case CamelSpringPackage.ROUTE_DEFINITION__POLL:
				return getPoll();
			case CamelSpringPackage.ROUTE_DEFINITION__POLL_ENRICH:
				return getPollEnrich();
			case CamelSpringPackage.ROUTE_DEFINITION__PROCESS:
				return getProcess();
			case CamelSpringPackage.ROUTE_DEFINITION__RECIPIENT_LIST:
				return getRecipientList();
			case CamelSpringPackage.ROUTE_DEFINITION__REMOVE_HEADER:
				return getRemoveHeader();
			case CamelSpringPackage.ROUTE_DEFINITION__REMOVE_HEADERS:
				return getRemoveHeaders();
			case CamelSpringPackage.ROUTE_DEFINITION__REMOVE_PROPERTIES:
				return getRemoveProperties();
			case CamelSpringPackage.ROUTE_DEFINITION__REMOVE_PROPERTY:
				return getRemoveProperty();
			case CamelSpringPackage.ROUTE_DEFINITION__REMOVE_VARIABLE:
				return getRemoveVariable();
			case CamelSpringPackage.ROUTE_DEFINITION__RESEQUENCE:
				return getResequence();
			case CamelSpringPackage.ROUTE_DEFINITION__RESUMABLE:
				return getResumable();
			case CamelSpringPackage.ROUTE_DEFINITION__ROLLBACK:
				return getRollback();
			case CamelSpringPackage.ROUTE_DEFINITION__ROUTE:
				return getRoute();
			case CamelSpringPackage.ROUTE_DEFINITION__ROUTING_SLIP:
				return getRoutingSlip();
			case CamelSpringPackage.ROUTE_DEFINITION__SAGA:
				return getSaga();
			case CamelSpringPackage.ROUTE_DEFINITION__SAMPLE:
				return getSample();
			case CamelSpringPackage.ROUTE_DEFINITION__SCRIPT:
				return getScript();
			case CamelSpringPackage.ROUTE_DEFINITION__SET_BODY:
				return getSetBody();
			case CamelSpringPackage.ROUTE_DEFINITION__SET_EXCHANGE_PATTERN:
				return getSetExchangePattern();
			case CamelSpringPackage.ROUTE_DEFINITION__SET_HEADER:
				return getSetHeader();
			case CamelSpringPackage.ROUTE_DEFINITION__SET_HEADERS:
				return getSetHeaders();
			case CamelSpringPackage.ROUTE_DEFINITION__SET_PROPERTY:
				return getSetProperty();
			case CamelSpringPackage.ROUTE_DEFINITION__SET_VARIABLE:
				return getSetVariable();
			case CamelSpringPackage.ROUTE_DEFINITION__SET_VARIABLES:
				return getSetVariables();
			case CamelSpringPackage.ROUTE_DEFINITION__SORT:
				return getSort();
			case CamelSpringPackage.ROUTE_DEFINITION__SPLIT:
				return getSplit();
			case CamelSpringPackage.ROUTE_DEFINITION__STEP:
				return getStep();
			case CamelSpringPackage.ROUTE_DEFINITION__STOP:
				return getStop();
			case CamelSpringPackage.ROUTE_DEFINITION__THREADS:
				return getThreads();
			case CamelSpringPackage.ROUTE_DEFINITION__THROTTLE:
				return getThrottle();
			case CamelSpringPackage.ROUTE_DEFINITION__THROW_EXCEPTION:
				return getThrowException();
			case CamelSpringPackage.ROUTE_DEFINITION__TO:
				return getTo();
			case CamelSpringPackage.ROUTE_DEFINITION__TO_D:
				return getToD();
			case CamelSpringPackage.ROUTE_DEFINITION__TOKENIZER:
				return getTokenizer();
			case CamelSpringPackage.ROUTE_DEFINITION__TRANSACTED:
				return getTransacted();
			case CamelSpringPackage.ROUTE_DEFINITION__TRANSFORM:
				return getTransform();
			case CamelSpringPackage.ROUTE_DEFINITION__DO_TRY:
				return getDoTry();
			case CamelSpringPackage.ROUTE_DEFINITION__UNMARSHAL:
				return getUnmarshal();
			case CamelSpringPackage.ROUTE_DEFINITION__VALIDATE:
				return getValidate();
			case CamelSpringPackage.ROUTE_DEFINITION__WIRE_TAP:
				return getWireTap();
			case CamelSpringPackage.ROUTE_DEFINITION__SERVICE_CALL:
				return getServiceCall();
			case CamelSpringPackage.ROUTE_DEFINITION__AUTO_STARTUP:
				return getAutoStartup();
			case CamelSpringPackage.ROUTE_DEFINITION__DELAYER:
				return getDelayer();
			case CamelSpringPackage.ROUTE_DEFINITION__ERROR_HANDLER_REF:
				return getErrorHandlerRef();
			case CamelSpringPackage.ROUTE_DEFINITION__GROUP1:
				return getGroup1();
			case CamelSpringPackage.ROUTE_DEFINITION__KAMELET1:
				return isKamelet1();
			case CamelSpringPackage.ROUTE_DEFINITION__LOG_MASK:
				return getLogMask();
			case CamelSpringPackage.ROUTE_DEFINITION__MESSAGE_HISTORY:
				return getMessageHistory();
			case CamelSpringPackage.ROUTE_DEFINITION__NODE_PREFIX_ID:
				return getNodePrefixId();
			case CamelSpringPackage.ROUTE_DEFINITION__PRECONDITION:
				return getPrecondition();
			case CamelSpringPackage.ROUTE_DEFINITION__REST:
				return isRest();
			case CamelSpringPackage.ROUTE_DEFINITION__ROUTE_CONFIGURATION_ID:
				return getRouteConfigurationId();
			case CamelSpringPackage.ROUTE_DEFINITION__ROUTE_POLICY_REF:
				return getRoutePolicyRef();
			case CamelSpringPackage.ROUTE_DEFINITION__SHUTDOWN_ROUTE:
				return getShutdownRoute();
			case CamelSpringPackage.ROUTE_DEFINITION__SHUTDOWN_RUNNING_TASK:
				return getShutdownRunningTask();
			case CamelSpringPackage.ROUTE_DEFINITION__STARTUP_ORDER:
				return getStartupOrder();
			case CamelSpringPackage.ROUTE_DEFINITION__STREAM_CACHE:
				return getStreamCache();
			case CamelSpringPackage.ROUTE_DEFINITION__TEMPLATE:
				return isTemplate();
			case CamelSpringPackage.ROUTE_DEFINITION__TRACE:
				return getTrace();
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
			case CamelSpringPackage.ROUTE_DEFINITION__ROUTE_PROPERTY:
				getRouteProperty().clear();
				getRouteProperty().addAll((Collection<? extends PropertyDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__ERROR_HANDLER:
				setErrorHandler((EObject)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__FROM:
				setFrom((FromDefinition)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__INPUT_TYPE:
				setInputType((InputTypeDefinition)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__OUTPUT_TYPE:
				setOutputType((OutputTypeDefinition)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__AGGREGATE:
				getAggregate().clear();
				getAggregate().addAll((Collection<? extends AggregateDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__BEAN:
				getBean().clear();
				getBean().addAll((Collection<? extends BeanDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__DO_CATCH:
				getDoCatch().clear();
				getDoCatch().addAll((Collection<? extends CatchDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__CHOICE:
				getChoice().clear();
				getChoice().addAll((Collection<? extends ChoiceDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__CIRCUIT_BREAKER:
				getCircuitBreaker().clear();
				getCircuitBreaker().addAll((Collection<? extends CircuitBreakerDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__CLAIM_CHECK:
				getClaimCheck().clear();
				getClaimCheck().addAll((Collection<? extends ClaimCheckDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__CONVERT_BODY_TO:
				getConvertBodyTo().clear();
				getConvertBodyTo().addAll((Collection<? extends ConvertBodyDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__CONVERT_HEADER_TO:
				getConvertHeaderTo().clear();
				getConvertHeaderTo().addAll((Collection<? extends ConvertHeaderDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__CONVERT_VARIABLE_TO:
				getConvertVariableTo().clear();
				getConvertVariableTo().addAll((Collection<? extends ConvertVariableDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__DELAY:
				getDelay().clear();
				getDelay().addAll((Collection<? extends DelayDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__DYNAMIC_ROUTER:
				getDynamicRouter().clear();
				getDynamicRouter().addAll((Collection<? extends DynamicRouterDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__ENRICH:
				getEnrich().clear();
				getEnrich().addAll((Collection<? extends EnrichDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends FilterDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__DO_FINALLY:
				getDoFinally().clear();
				getDoFinally().addAll((Collection<? extends FinallyDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__IDEMPOTENT_CONSUMER:
				getIdempotentConsumer().clear();
				getIdempotentConsumer().addAll((Collection<? extends IdempotentConsumerDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__INTERCEPT:
				getIntercept().clear();
				getIntercept().addAll((Collection<? extends InterceptDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__INTERCEPT_FROM:
				getInterceptFrom().clear();
				getInterceptFrom().addAll((Collection<? extends InterceptFromDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				getInterceptSendToEndpoint().clear();
				getInterceptSendToEndpoint().addAll((Collection<? extends InterceptSendToEndpointDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__KAMELET:
				getKamelet().clear();
				getKamelet().addAll((Collection<? extends KameletDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__LOAD_BALANCE:
				getLoadBalance().clear();
				getLoadBalance().addAll((Collection<? extends LoadBalanceDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__LOG:
				getLog().clear();
				getLog().addAll((Collection<? extends LogDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__LOOP:
				getLoop().clear();
				getLoop().addAll((Collection<? extends LoopDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__MARSHAL:
				getMarshal().clear();
				getMarshal().addAll((Collection<? extends MarshalDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__MULTICAST:
				getMulticast().clear();
				getMulticast().addAll((Collection<? extends MulticastDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__ON_COMPLETION:
				getOnCompletion().clear();
				getOnCompletion().addAll((Collection<? extends OnCompletionDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__ON_EXCEPTION:
				getOnException().clear();
				getOnException().addAll((Collection<? extends OnExceptionDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__PAUSABLE:
				getPausable().clear();
				getPausable().addAll((Collection<? extends PausableDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__PIPELINE:
				getPipeline().clear();
				getPipeline().addAll((Collection<? extends PipelineDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__POLICY:
				getPolicy().clear();
				getPolicy().addAll((Collection<? extends PolicyDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__POLL:
				getPoll().clear();
				getPoll().addAll((Collection<? extends PollDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__POLL_ENRICH:
				getPollEnrich().clear();
				getPollEnrich().addAll((Collection<? extends PollEnrichDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__PROCESS:
				getProcess().clear();
				getProcess().addAll((Collection<? extends ProcessDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__RECIPIENT_LIST:
				getRecipientList().clear();
				getRecipientList().addAll((Collection<? extends RecipientListDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__REMOVE_HEADER:
				getRemoveHeader().clear();
				getRemoveHeader().addAll((Collection<? extends RemoveHeaderDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__REMOVE_HEADERS:
				getRemoveHeaders().clear();
				getRemoveHeaders().addAll((Collection<? extends RemoveHeadersDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__REMOVE_PROPERTIES:
				getRemoveProperties().clear();
				getRemoveProperties().addAll((Collection<? extends RemovePropertiesDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__REMOVE_PROPERTY:
				getRemoveProperty().clear();
				getRemoveProperty().addAll((Collection<? extends RemovePropertyDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__REMOVE_VARIABLE:
				getRemoveVariable().clear();
				getRemoveVariable().addAll((Collection<? extends RemoveVariableDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__RESEQUENCE:
				getResequence().clear();
				getResequence().addAll((Collection<? extends ResequenceDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__RESUMABLE:
				getResumable().clear();
				getResumable().addAll((Collection<? extends ResumableDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__ROLLBACK:
				getRollback().clear();
				getRollback().addAll((Collection<? extends RollbackDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__ROUTE:
				getRoute().clear();
				getRoute().addAll((Collection<? extends RouteDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__ROUTING_SLIP:
				getRoutingSlip().clear();
				getRoutingSlip().addAll((Collection<? extends RoutingSlipDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SAGA:
				getSaga().clear();
				getSaga().addAll((Collection<? extends SagaDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SAMPLE:
				getSample().clear();
				getSample().addAll((Collection<? extends SamplingDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends ScriptDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SET_BODY:
				getSetBody().clear();
				getSetBody().addAll((Collection<? extends SetBodyDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SET_EXCHANGE_PATTERN:
				getSetExchangePattern().clear();
				getSetExchangePattern().addAll((Collection<? extends SetExchangePatternDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SET_HEADER:
				getSetHeader().clear();
				getSetHeader().addAll((Collection<? extends SetHeaderDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SET_HEADERS:
				getSetHeaders().clear();
				getSetHeaders().addAll((Collection<? extends SetHeadersDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SET_PROPERTY:
				getSetProperty().clear();
				getSetProperty().addAll((Collection<? extends SetPropertyDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SET_VARIABLE:
				getSetVariable().clear();
				getSetVariable().addAll((Collection<? extends SetVariableDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SET_VARIABLES:
				getSetVariables().clear();
				getSetVariables().addAll((Collection<? extends SetVariablesDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SORT:
				getSort().clear();
				getSort().addAll((Collection<? extends SortDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SPLIT:
				getSplit().clear();
				getSplit().addAll((Collection<? extends SplitDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends StepDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__STOP:
				getStop().clear();
				getStop().addAll((Collection<? extends StopDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__THREADS:
				getThreads().clear();
				getThreads().addAll((Collection<? extends ThreadsDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__THROTTLE:
				getThrottle().clear();
				getThrottle().addAll((Collection<? extends ThrottleDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__THROW_EXCEPTION:
				getThrowException().clear();
				getThrowException().addAll((Collection<? extends ThrowExceptionDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__TO:
				getTo().clear();
				getTo().addAll((Collection<? extends ToDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__TO_D:
				getToD().clear();
				getToD().addAll((Collection<? extends ToDynamicDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__TOKENIZER:
				getTokenizer().clear();
				getTokenizer().addAll((Collection<? extends TokenizerDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__TRANSACTED:
				getTransacted().clear();
				getTransacted().addAll((Collection<? extends TransactedDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__TRANSFORM:
				getTransform().clear();
				getTransform().addAll((Collection<? extends TransformDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__DO_TRY:
				getDoTry().clear();
				getDoTry().addAll((Collection<? extends TryDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__UNMARSHAL:
				getUnmarshal().clear();
				getUnmarshal().addAll((Collection<? extends UnmarshalDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__VALIDATE:
				getValidate().clear();
				getValidate().addAll((Collection<? extends ValidateDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__WIRE_TAP:
				getWireTap().clear();
				getWireTap().addAll((Collection<? extends WireTapDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SERVICE_CALL:
				getServiceCall().clear();
				getServiceCall().addAll((Collection<? extends ServiceCallDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__AUTO_STARTUP:
				setAutoStartup((String)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__DELAYER:
				setDelayer((String)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__ERROR_HANDLER_REF:
				setErrorHandlerRef((String)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__GROUP1:
				setGroup1((String)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__KAMELET1:
				setKamelet1((Boolean)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__LOG_MASK:
				setLogMask((String)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__MESSAGE_HISTORY:
				setMessageHistory((String)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__NODE_PREFIX_ID:
				setNodePrefixId((String)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__PRECONDITION:
				setPrecondition((String)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__REST:
				setRest((Boolean)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__ROUTE_CONFIGURATION_ID:
				setRouteConfigurationId((String)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__ROUTE_POLICY_REF:
				setRoutePolicyRef((String)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SHUTDOWN_ROUTE:
				setShutdownRoute((String)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SHUTDOWN_RUNNING_TASK:
				setShutdownRunningTask((String)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__STARTUP_ORDER:
				setStartupOrder((Integer)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__STREAM_CACHE:
				setStreamCache((String)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__TEMPLATE:
				setTemplate((Boolean)newValue);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__TRACE:
				setTrace((String)newValue);
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
			case CamelSpringPackage.ROUTE_DEFINITION__ROUTE_PROPERTY:
				getRouteProperty().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__ERROR_HANDLER:
				unsetErrorHandler();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__FROM:
				setFrom((FromDefinition)null);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__INPUT_TYPE:
				setInputType((InputTypeDefinition)null);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__OUTPUT_TYPE:
				setOutputType((OutputTypeDefinition)null);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__GROUP:
				getGroup().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__AGGREGATE:
				getAggregate().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__BEAN:
				getBean().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__DO_CATCH:
				getDoCatch().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__CHOICE:
				getChoice().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__CIRCUIT_BREAKER:
				getCircuitBreaker().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__CLAIM_CHECK:
				getClaimCheck().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__CONVERT_BODY_TO:
				getConvertBodyTo().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__CONVERT_HEADER_TO:
				getConvertHeaderTo().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__CONVERT_VARIABLE_TO:
				getConvertVariableTo().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__DELAY:
				getDelay().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__DYNAMIC_ROUTER:
				getDynamicRouter().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__ENRICH:
				getEnrich().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__FILTER:
				getFilter().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__DO_FINALLY:
				getDoFinally().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__IDEMPOTENT_CONSUMER:
				getIdempotentConsumer().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__INTERCEPT:
				getIntercept().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__INTERCEPT_FROM:
				getInterceptFrom().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				getInterceptSendToEndpoint().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__KAMELET:
				getKamelet().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__LOAD_BALANCE:
				getLoadBalance().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__LOG:
				getLog().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__LOOP:
				getLoop().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__MARSHAL:
				getMarshal().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__MULTICAST:
				getMulticast().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__ON_COMPLETION:
				getOnCompletion().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__ON_EXCEPTION:
				getOnException().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__PAUSABLE:
				getPausable().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__PIPELINE:
				getPipeline().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__POLICY:
				getPolicy().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__POLL:
				getPoll().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__POLL_ENRICH:
				getPollEnrich().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__PROCESS:
				getProcess().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__RECIPIENT_LIST:
				getRecipientList().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__REMOVE_HEADER:
				getRemoveHeader().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__REMOVE_HEADERS:
				getRemoveHeaders().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__REMOVE_PROPERTIES:
				getRemoveProperties().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__REMOVE_PROPERTY:
				getRemoveProperty().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__REMOVE_VARIABLE:
				getRemoveVariable().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__RESEQUENCE:
				getResequence().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__RESUMABLE:
				getResumable().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__ROLLBACK:
				getRollback().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__ROUTE:
				getRoute().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__ROUTING_SLIP:
				getRoutingSlip().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SAGA:
				getSaga().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SAMPLE:
				getSample().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SCRIPT:
				getScript().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SET_BODY:
				getSetBody().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SET_EXCHANGE_PATTERN:
				getSetExchangePattern().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SET_HEADER:
				getSetHeader().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SET_HEADERS:
				getSetHeaders().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SET_PROPERTY:
				getSetProperty().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SET_VARIABLE:
				getSetVariable().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SET_VARIABLES:
				getSetVariables().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SORT:
				getSort().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SPLIT:
				getSplit().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__STEP:
				getStep().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__STOP:
				getStop().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__THREADS:
				getThreads().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__THROTTLE:
				getThrottle().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__THROW_EXCEPTION:
				getThrowException().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__TO:
				getTo().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__TO_D:
				getToD().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__TOKENIZER:
				getTokenizer().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__TRANSACTED:
				getTransacted().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__TRANSFORM:
				getTransform().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__DO_TRY:
				getDoTry().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__UNMARSHAL:
				getUnmarshal().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__VALIDATE:
				getValidate().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__WIRE_TAP:
				getWireTap().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SERVICE_CALL:
				getServiceCall().clear();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__AUTO_STARTUP:
				setAutoStartup(AUTO_STARTUP_EDEFAULT);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__DELAYER:
				setDelayer(DELAYER_EDEFAULT);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__ERROR_HANDLER_REF:
				setErrorHandlerRef(ERROR_HANDLER_REF_EDEFAULT);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__GROUP1:
				setGroup1(GROUP1_EDEFAULT);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__KAMELET1:
				unsetKamelet1();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__LOG_MASK:
				setLogMask(LOG_MASK_EDEFAULT);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__MESSAGE_HISTORY:
				setMessageHistory(MESSAGE_HISTORY_EDEFAULT);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__NODE_PREFIX_ID:
				setNodePrefixId(NODE_PREFIX_ID_EDEFAULT);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__PRECONDITION:
				setPrecondition(PRECONDITION_EDEFAULT);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__REST:
				unsetRest();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__ROUTE_CONFIGURATION_ID:
				setRouteConfigurationId(ROUTE_CONFIGURATION_ID_EDEFAULT);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__ROUTE_POLICY_REF:
				setRoutePolicyRef(ROUTE_POLICY_REF_EDEFAULT);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SHUTDOWN_ROUTE:
				setShutdownRoute(SHUTDOWN_ROUTE_EDEFAULT);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__SHUTDOWN_RUNNING_TASK:
				setShutdownRunningTask(SHUTDOWN_RUNNING_TASK_EDEFAULT);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__STARTUP_ORDER:
				unsetStartupOrder();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__STREAM_CACHE:
				setStreamCache(STREAM_CACHE_EDEFAULT);
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__TEMPLATE:
				unsetTemplate();
				return;
			case CamelSpringPackage.ROUTE_DEFINITION__TRACE:
				setTrace(TRACE_EDEFAULT);
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
			case CamelSpringPackage.ROUTE_DEFINITION__ROUTE_PROPERTY:
				return routeProperty != null && !routeProperty.isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__ERROR_HANDLER:
				return isSetErrorHandler();
			case CamelSpringPackage.ROUTE_DEFINITION__FROM:
				return from != null;
			case CamelSpringPackage.ROUTE_DEFINITION__INPUT_TYPE:
				return inputType != null;
			case CamelSpringPackage.ROUTE_DEFINITION__OUTPUT_TYPE:
				return outputType != null;
			case CamelSpringPackage.ROUTE_DEFINITION__GROUP:
				return group != null && !group.isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__AGGREGATE:
				return !getAggregate().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__BEAN:
				return !getBean().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__DO_CATCH:
				return !getDoCatch().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__CHOICE:
				return !getChoice().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__CIRCUIT_BREAKER:
				return !getCircuitBreaker().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__CLAIM_CHECK:
				return !getClaimCheck().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__CONVERT_BODY_TO:
				return !getConvertBodyTo().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__CONVERT_HEADER_TO:
				return !getConvertHeaderTo().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__CONVERT_VARIABLE_TO:
				return !getConvertVariableTo().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__DELAY:
				return !getDelay().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__DYNAMIC_ROUTER:
				return !getDynamicRouter().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__ENRICH:
				return !getEnrich().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__FILTER:
				return !getFilter().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__DO_FINALLY:
				return !getDoFinally().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__IDEMPOTENT_CONSUMER:
				return !getIdempotentConsumer().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__INTERCEPT:
				return !getIntercept().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__INTERCEPT_FROM:
				return !getInterceptFrom().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				return !getInterceptSendToEndpoint().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__KAMELET:
				return !getKamelet().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__LOAD_BALANCE:
				return !getLoadBalance().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__LOG:
				return !getLog().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__LOOP:
				return !getLoop().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__MARSHAL:
				return !getMarshal().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__MULTICAST:
				return !getMulticast().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__ON_COMPLETION:
				return !getOnCompletion().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__ON_EXCEPTION:
				return !getOnException().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__PAUSABLE:
				return !getPausable().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__PIPELINE:
				return !getPipeline().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__POLICY:
				return !getPolicy().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__POLL:
				return !getPoll().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__POLL_ENRICH:
				return !getPollEnrich().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__PROCESS:
				return !getProcess().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__RECIPIENT_LIST:
				return !getRecipientList().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__REMOVE_HEADER:
				return !getRemoveHeader().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__REMOVE_HEADERS:
				return !getRemoveHeaders().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__REMOVE_PROPERTIES:
				return !getRemoveProperties().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__REMOVE_PROPERTY:
				return !getRemoveProperty().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__REMOVE_VARIABLE:
				return !getRemoveVariable().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__RESEQUENCE:
				return !getResequence().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__RESUMABLE:
				return !getResumable().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__ROLLBACK:
				return !getRollback().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__ROUTE:
				return !getRoute().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__ROUTING_SLIP:
				return !getRoutingSlip().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__SAGA:
				return !getSaga().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__SAMPLE:
				return !getSample().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__SCRIPT:
				return !getScript().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__SET_BODY:
				return !getSetBody().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__SET_EXCHANGE_PATTERN:
				return !getSetExchangePattern().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__SET_HEADER:
				return !getSetHeader().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__SET_HEADERS:
				return !getSetHeaders().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__SET_PROPERTY:
				return !getSetProperty().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__SET_VARIABLE:
				return !getSetVariable().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__SET_VARIABLES:
				return !getSetVariables().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__SORT:
				return !getSort().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__SPLIT:
				return !getSplit().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__STEP:
				return !getStep().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__STOP:
				return !getStop().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__THREADS:
				return !getThreads().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__THROTTLE:
				return !getThrottle().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__THROW_EXCEPTION:
				return !getThrowException().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__TO:
				return !getTo().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__TO_D:
				return !getToD().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__TOKENIZER:
				return !getTokenizer().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__TRANSACTED:
				return !getTransacted().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__TRANSFORM:
				return !getTransform().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__DO_TRY:
				return !getDoTry().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__UNMARSHAL:
				return !getUnmarshal().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__VALIDATE:
				return !getValidate().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__WIRE_TAP:
				return !getWireTap().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__SERVICE_CALL:
				return !getServiceCall().isEmpty();
			case CamelSpringPackage.ROUTE_DEFINITION__AUTO_STARTUP:
				return AUTO_STARTUP_EDEFAULT == null ? autoStartup != null : !AUTO_STARTUP_EDEFAULT.equals(autoStartup);
			case CamelSpringPackage.ROUTE_DEFINITION__DELAYER:
				return DELAYER_EDEFAULT == null ? delayer != null : !DELAYER_EDEFAULT.equals(delayer);
			case CamelSpringPackage.ROUTE_DEFINITION__ERROR_HANDLER_REF:
				return ERROR_HANDLER_REF_EDEFAULT == null ? errorHandlerRef != null : !ERROR_HANDLER_REF_EDEFAULT.equals(errorHandlerRef);
			case CamelSpringPackage.ROUTE_DEFINITION__GROUP1:
				return GROUP1_EDEFAULT == null ? group1 != null : !GROUP1_EDEFAULT.equals(group1);
			case CamelSpringPackage.ROUTE_DEFINITION__KAMELET1:
				return isSetKamelet1();
			case CamelSpringPackage.ROUTE_DEFINITION__LOG_MASK:
				return LOG_MASK_EDEFAULT == null ? logMask != null : !LOG_MASK_EDEFAULT.equals(logMask);
			case CamelSpringPackage.ROUTE_DEFINITION__MESSAGE_HISTORY:
				return MESSAGE_HISTORY_EDEFAULT == null ? messageHistory != null : !MESSAGE_HISTORY_EDEFAULT.equals(messageHistory);
			case CamelSpringPackage.ROUTE_DEFINITION__NODE_PREFIX_ID:
				return NODE_PREFIX_ID_EDEFAULT == null ? nodePrefixId != null : !NODE_PREFIX_ID_EDEFAULT.equals(nodePrefixId);
			case CamelSpringPackage.ROUTE_DEFINITION__PRECONDITION:
				return PRECONDITION_EDEFAULT == null ? precondition != null : !PRECONDITION_EDEFAULT.equals(precondition);
			case CamelSpringPackage.ROUTE_DEFINITION__REST:
				return isSetRest();
			case CamelSpringPackage.ROUTE_DEFINITION__ROUTE_CONFIGURATION_ID:
				return ROUTE_CONFIGURATION_ID_EDEFAULT == null ? routeConfigurationId != null : !ROUTE_CONFIGURATION_ID_EDEFAULT.equals(routeConfigurationId);
			case CamelSpringPackage.ROUTE_DEFINITION__ROUTE_POLICY_REF:
				return ROUTE_POLICY_REF_EDEFAULT == null ? routePolicyRef != null : !ROUTE_POLICY_REF_EDEFAULT.equals(routePolicyRef);
			case CamelSpringPackage.ROUTE_DEFINITION__SHUTDOWN_ROUTE:
				return SHUTDOWN_ROUTE_EDEFAULT == null ? shutdownRoute != null : !SHUTDOWN_ROUTE_EDEFAULT.equals(shutdownRoute);
			case CamelSpringPackage.ROUTE_DEFINITION__SHUTDOWN_RUNNING_TASK:
				return SHUTDOWN_RUNNING_TASK_EDEFAULT == null ? shutdownRunningTask != null : !SHUTDOWN_RUNNING_TASK_EDEFAULT.equals(shutdownRunningTask);
			case CamelSpringPackage.ROUTE_DEFINITION__STARTUP_ORDER:
				return isSetStartupOrder();
			case CamelSpringPackage.ROUTE_DEFINITION__STREAM_CACHE:
				return STREAM_CACHE_EDEFAULT == null ? streamCache != null : !STREAM_CACHE_EDEFAULT.equals(streamCache);
			case CamelSpringPackage.ROUTE_DEFINITION__TEMPLATE:
				return isSetTemplate();
			case CamelSpringPackage.ROUTE_DEFINITION__TRACE:
				return TRACE_EDEFAULT == null ? trace != null : !TRACE_EDEFAULT.equals(trace);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", autoStartup: ");
		result.append(autoStartup);
		result.append(", delayer: ");
		result.append(delayer);
		result.append(", errorHandlerRef: ");
		result.append(errorHandlerRef);
		result.append(", group1: ");
		result.append(group1);
		result.append(", kamelet1: ");
		if (kamelet1ESet) result.append(kamelet1); else result.append("<unset>");
		result.append(", logMask: ");
		result.append(logMask);
		result.append(", messageHistory: ");
		result.append(messageHistory);
		result.append(", nodePrefixId: ");
		result.append(nodePrefixId);
		result.append(", precondition: ");
		result.append(precondition);
		result.append(", rest: ");
		if (restESet) result.append(rest); else result.append("<unset>");
		result.append(", routeConfigurationId: ");
		result.append(routeConfigurationId);
		result.append(", routePolicyRef: ");
		result.append(routePolicyRef);
		result.append(", shutdownRoute: ");
		result.append(shutdownRoute);
		result.append(", shutdownRunningTask: ");
		result.append(shutdownRunningTask);
		result.append(", startupOrder: ");
		if (startupOrderESet) result.append(startupOrder); else result.append("<unset>");
		result.append(", streamCache: ");
		result.append(streamCache);
		result.append(", template: ");
		if (templateESet) result.append(template); else result.append("<unset>");
		result.append(", trace: ");
		result.append(trace);
		result.append(')');
		return result.toString();
	}

} //RouteDefinitionImpl
