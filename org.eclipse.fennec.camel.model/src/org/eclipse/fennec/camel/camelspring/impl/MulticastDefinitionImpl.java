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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
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
import org.eclipse.fennec.camel.camelspring.IdempotentConsumerDefinition;
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
import org.eclipse.fennec.camel.camelspring.PausableDefinition;
import org.eclipse.fennec.camel.camelspring.PipelineDefinition;
import org.eclipse.fennec.camel.camelspring.PolicyDefinition;
import org.eclipse.fennec.camel.camelspring.PollDefinition;
import org.eclipse.fennec.camel.camelspring.PollEnrichDefinition;
import org.eclipse.fennec.camel.camelspring.ProcessDefinition;
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
 * An implementation of the model object '<em><b>Multicast Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getDoCatch <em>Do Catch</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getCircuitBreaker <em>Circuit Breaker</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getClaimCheck <em>Claim Check</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getConvertBodyTo <em>Convert Body To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getConvertHeaderTo <em>Convert Header To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getConvertVariableTo <em>Convert Variable To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getDynamicRouter <em>Dynamic Router</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getEnrich <em>Enrich</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getDoFinally <em>Do Finally</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getIdempotentConsumer <em>Idempotent Consumer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getInterceptSendToEndpoint <em>Intercept Send To Endpoint</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getKamelet <em>Kamelet</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getLog <em>Log</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getMarshal <em>Marshal</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getPausable <em>Pausable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getPoll <em>Poll</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getPollEnrich <em>Poll Enrich</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getRecipientList <em>Recipient List</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getRemoveHeader <em>Remove Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getRemoveHeaders <em>Remove Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getRemoveProperties <em>Remove Properties</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getRemoveProperty <em>Remove Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getRemoveVariable <em>Remove Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getResequence <em>Resequence</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getResumable <em>Resumable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getRoutingSlip <em>Routing Slip</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getSaga <em>Saga</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getSample <em>Sample</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getSetBody <em>Set Body</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getSetExchangePattern <em>Set Exchange Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getSetHeaders <em>Set Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getSetProperty <em>Set Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getSetVariable <em>Set Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getSetVariables <em>Set Variables</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getSplit <em>Split</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getThrottle <em>Throttle</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getToD <em>To D</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getTokenizer <em>Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getDoTry <em>Do Try</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getUnmarshal <em>Unmarshal</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getWireTap <em>Wire Tap</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getServiceCall <em>Service Call</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getAggregationStrategy <em>Aggregation Strategy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getAggregationStrategyMethodAllowNull <em>Aggregation Strategy Method Allow Null</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getAggregationStrategyMethodName <em>Aggregation Strategy Method Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getExecutorService <em>Executor Service</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getOnPrepare <em>On Prepare</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getParallelAggregate <em>Parallel Aggregate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getParallelProcessing <em>Parallel Processing</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getShareUnitOfWork <em>Share Unit Of Work</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getStopOnException <em>Stop On Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getStreaming <em>Streaming</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getSynchronous <em>Synchronous</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MulticastDefinitionImpl#getTimeout <em>Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MulticastDefinitionImpl extends OutputImpl implements MulticastDefinition {
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
	 * The default value of the '{@link #getAggregationStrategy() <em>Aggregation Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final String AGGREGATION_STRATEGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregationStrategy() <em>Aggregation Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationStrategy()
	 * @generated
	 * @ordered
	 */
	protected String aggregationStrategy = AGGREGATION_STRATEGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregationStrategyMethodAllowNull() <em>Aggregation Strategy Method Allow Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationStrategyMethodAllowNull()
	 * @generated
	 * @ordered
	 */
	protected static final String AGGREGATION_STRATEGY_METHOD_ALLOW_NULL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregationStrategyMethodAllowNull() <em>Aggregation Strategy Method Allow Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationStrategyMethodAllowNull()
	 * @generated
	 * @ordered
	 */
	protected String aggregationStrategyMethodAllowNull = AGGREGATION_STRATEGY_METHOD_ALLOW_NULL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregationStrategyMethodName() <em>Aggregation Strategy Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationStrategyMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String AGGREGATION_STRATEGY_METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregationStrategyMethodName() <em>Aggregation Strategy Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationStrategyMethodName()
	 * @generated
	 * @ordered
	 */
	protected String aggregationStrategyMethodName = AGGREGATION_STRATEGY_METHOD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutorService() <em>Executor Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutorService()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTOR_SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutorService() <em>Executor Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutorService()
	 * @generated
	 * @ordered
	 */
	protected String executorService = EXECUTOR_SERVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnPrepare() <em>On Prepare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnPrepare()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_PREPARE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnPrepare() <em>On Prepare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnPrepare()
	 * @generated
	 * @ordered
	 */
	protected String onPrepare = ON_PREPARE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParallelAggregate() <em>Parallel Aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelAggregate()
	 * @generated
	 * @ordered
	 */
	protected static final String PARALLEL_AGGREGATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParallelAggregate() <em>Parallel Aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelAggregate()
	 * @generated
	 * @ordered
	 */
	protected String parallelAggregate = PARALLEL_AGGREGATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParallelProcessing() <em>Parallel Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelProcessing()
	 * @generated
	 * @ordered
	 */
	protected static final String PARALLEL_PROCESSING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParallelProcessing() <em>Parallel Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelProcessing()
	 * @generated
	 * @ordered
	 */
	protected String parallelProcessing = PARALLEL_PROCESSING_EDEFAULT;

	/**
	 * The default value of the '{@link #getShareUnitOfWork() <em>Share Unit Of Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShareUnitOfWork()
	 * @generated
	 * @ordered
	 */
	protected static final String SHARE_UNIT_OF_WORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShareUnitOfWork() <em>Share Unit Of Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShareUnitOfWork()
	 * @generated
	 * @ordered
	 */
	protected String shareUnitOfWork = SHARE_UNIT_OF_WORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getStopOnException() <em>Stop On Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopOnException()
	 * @generated
	 * @ordered
	 */
	protected static final String STOP_ON_EXCEPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStopOnException() <em>Stop On Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopOnException()
	 * @generated
	 * @ordered
	 */
	protected String stopOnException = STOP_ON_EXCEPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStreaming() <em>Streaming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreaming()
	 * @generated
	 * @ordered
	 */
	protected static final String STREAMING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreaming() <em>Streaming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreaming()
	 * @generated
	 * @ordered
	 */
	protected String streaming = STREAMING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSynchronous() <em>Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronous()
	 * @generated
	 * @ordered
	 */
	protected static final String SYNCHRONOUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSynchronous() <em>Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronous()
	 * @generated
	 * @ordered
	 */
	protected String synchronous = SYNCHRONOUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected String timeout = TIMEOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MulticastDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getMulticastDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CamelSpringPackage.MULTICAST_DEFINITION__GROUP);
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
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Aggregate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BeanDefinition> getBean() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Bean());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CatchDefinition> getDoCatch() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_DoCatch());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChoiceDefinition> getChoice() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Choice());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CircuitBreakerDefinition> getCircuitBreaker() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_CircuitBreaker());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimCheckDefinition> getClaimCheck() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_ClaimCheck());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConvertBodyDefinition> getConvertBodyTo() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_ConvertBodyTo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConvertHeaderDefinition> getConvertHeaderTo() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_ConvertHeaderTo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConvertVariableDefinition> getConvertVariableTo() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_ConvertVariableTo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DelayDefinition> getDelay() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Delay());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DynamicRouterDefinition> getDynamicRouter() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_DynamicRouter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnrichDefinition> getEnrich() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Enrich());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FilterDefinition> getFilter() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Filter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinallyDefinition> getDoFinally() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_DoFinally());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IdempotentConsumerDefinition> getIdempotentConsumer() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_IdempotentConsumer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterceptDefinition> getIntercept() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Intercept());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterceptFromDefinition> getInterceptFrom() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_InterceptFrom());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterceptSendToEndpointDefinition> getInterceptSendToEndpoint() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_InterceptSendToEndpoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KameletDefinition> getKamelet() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Kamelet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LoadBalanceDefinition> getLoadBalance() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_LoadBalance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogDefinition> getLog() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Log());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LoopDefinition> getLoop() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Loop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarshalDefinition> getMarshal() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Marshal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MulticastDefinition> getMulticast() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Multicast());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OnCompletionDefinition> getOnCompletion() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_OnCompletion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OnExceptionDefinition> getOnException() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_OnException());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PausableDefinition> getPausable() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Pausable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PipelineDefinition> getPipeline() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Pipeline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PolicyDefinition> getPolicy() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Policy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PollDefinition> getPoll() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Poll());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PollEnrichDefinition> getPollEnrich() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_PollEnrich());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessDefinition> getProcess() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Process());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RecipientListDefinition> getRecipientList() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_RecipientList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemoveHeaderDefinition> getRemoveHeader() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_RemoveHeader());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemoveHeadersDefinition> getRemoveHeaders() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_RemoveHeaders());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemovePropertiesDefinition> getRemoveProperties() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_RemoveProperties());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemovePropertyDefinition> getRemoveProperty() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_RemoveProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemoveVariableDefinition> getRemoveVariable() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_RemoveVariable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResequenceDefinition> getResequence() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Resequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResumableDefinition> getResumable() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Resumable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RollbackDefinition> getRollback() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Rollback());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RouteDefinition> getRoute() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Route());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RoutingSlipDefinition> getRoutingSlip() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_RoutingSlip());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SagaDefinition> getSaga() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Saga());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SamplingDefinition> getSample() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Sample());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScriptDefinition> getScript() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Script());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetBodyDefinition> getSetBody() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_SetBody());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetExchangePatternDefinition> getSetExchangePattern() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_SetExchangePattern());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetHeaderDefinition> getSetHeader() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_SetHeader());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetHeadersDefinition> getSetHeaders() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_SetHeaders());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetPropertyDefinition> getSetProperty() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_SetProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetVariableDefinition> getSetVariable() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_SetVariable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetVariablesDefinition> getSetVariables() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_SetVariables());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SortDefinition> getSort() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Sort());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SplitDefinition> getSplit() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Split());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StepDefinition> getStep() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Step());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StopDefinition> getStop() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Stop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThreadsDefinition> getThreads() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Threads());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThrottleDefinition> getThrottle() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Throttle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThrowExceptionDefinition> getThrowException() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_ThrowException());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ToDefinition> getTo() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_To());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ToDynamicDefinition> getToD() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_ToD());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TokenizerDefinition> getTokenizer() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Tokenizer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransactedDefinition> getTransacted() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Transacted());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransformDefinition> getTransform() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Transform());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TryDefinition> getDoTry() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_DoTry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnmarshalDefinition> getUnmarshal() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Unmarshal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValidateDefinition> getValidate() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_Validate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WireTapDefinition> getWireTap() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_WireTap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceCallDefinition> getServiceCall() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getMulticastDefinition_ServiceCall());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAggregationStrategy() {
		return aggregationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregationStrategy(String newAggregationStrategy) {
		String oldAggregationStrategy = aggregationStrategy;
		aggregationStrategy = newAggregationStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.MULTICAST_DEFINITION__AGGREGATION_STRATEGY, oldAggregationStrategy, aggregationStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAggregationStrategyMethodAllowNull() {
		return aggregationStrategyMethodAllowNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregationStrategyMethodAllowNull(String newAggregationStrategyMethodAllowNull) {
		String oldAggregationStrategyMethodAllowNull = aggregationStrategyMethodAllowNull;
		aggregationStrategyMethodAllowNull = newAggregationStrategyMethodAllowNull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.MULTICAST_DEFINITION__AGGREGATION_STRATEGY_METHOD_ALLOW_NULL, oldAggregationStrategyMethodAllowNull, aggregationStrategyMethodAllowNull));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAggregationStrategyMethodName() {
		return aggregationStrategyMethodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregationStrategyMethodName(String newAggregationStrategyMethodName) {
		String oldAggregationStrategyMethodName = aggregationStrategyMethodName;
		aggregationStrategyMethodName = newAggregationStrategyMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.MULTICAST_DEFINITION__AGGREGATION_STRATEGY_METHOD_NAME, oldAggregationStrategyMethodName, aggregationStrategyMethodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExecutorService() {
		return executorService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutorService(String newExecutorService) {
		String oldExecutorService = executorService;
		executorService = newExecutorService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.MULTICAST_DEFINITION__EXECUTOR_SERVICE, oldExecutorService, executorService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOnPrepare() {
		return onPrepare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnPrepare(String newOnPrepare) {
		String oldOnPrepare = onPrepare;
		onPrepare = newOnPrepare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.MULTICAST_DEFINITION__ON_PREPARE, oldOnPrepare, onPrepare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParallelAggregate() {
		return parallelAggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParallelAggregate(String newParallelAggregate) {
		String oldParallelAggregate = parallelAggregate;
		parallelAggregate = newParallelAggregate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.MULTICAST_DEFINITION__PARALLEL_AGGREGATE, oldParallelAggregate, parallelAggregate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParallelProcessing() {
		return parallelProcessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParallelProcessing(String newParallelProcessing) {
		String oldParallelProcessing = parallelProcessing;
		parallelProcessing = newParallelProcessing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.MULTICAST_DEFINITION__PARALLEL_PROCESSING, oldParallelProcessing, parallelProcessing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShareUnitOfWork() {
		return shareUnitOfWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShareUnitOfWork(String newShareUnitOfWork) {
		String oldShareUnitOfWork = shareUnitOfWork;
		shareUnitOfWork = newShareUnitOfWork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.MULTICAST_DEFINITION__SHARE_UNIT_OF_WORK, oldShareUnitOfWork, shareUnitOfWork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStopOnException() {
		return stopOnException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStopOnException(String newStopOnException) {
		String oldStopOnException = stopOnException;
		stopOnException = newStopOnException;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.MULTICAST_DEFINITION__STOP_ON_EXCEPTION, oldStopOnException, stopOnException));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStreaming() {
		return streaming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStreaming(String newStreaming) {
		String oldStreaming = streaming;
		streaming = newStreaming;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.MULTICAST_DEFINITION__STREAMING, oldStreaming, streaming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSynchronous() {
		return synchronous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSynchronous(String newSynchronous) {
		String oldSynchronous = synchronous;
		synchronous = newSynchronous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.MULTICAST_DEFINITION__SYNCHRONOUS, oldSynchronous, synchronous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeout(String newTimeout) {
		String oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.MULTICAST_DEFINITION__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.MULTICAST_DEFINITION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__AGGREGATE:
				return ((InternalEList<?>)getAggregate()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__BEAN:
				return ((InternalEList<?>)getBean()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__DO_CATCH:
				return ((InternalEList<?>)getDoCatch()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__CHOICE:
				return ((InternalEList<?>)getChoice()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__CIRCUIT_BREAKER:
				return ((InternalEList<?>)getCircuitBreaker()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__CLAIM_CHECK:
				return ((InternalEList<?>)getClaimCheck()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__CONVERT_BODY_TO:
				return ((InternalEList<?>)getConvertBodyTo()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__CONVERT_HEADER_TO:
				return ((InternalEList<?>)getConvertHeaderTo()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__CONVERT_VARIABLE_TO:
				return ((InternalEList<?>)getConvertVariableTo()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__DELAY:
				return ((InternalEList<?>)getDelay()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__DYNAMIC_ROUTER:
				return ((InternalEList<?>)getDynamicRouter()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__ENRICH:
				return ((InternalEList<?>)getEnrich()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__FILTER:
				return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__DO_FINALLY:
				return ((InternalEList<?>)getDoFinally()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__IDEMPOTENT_CONSUMER:
				return ((InternalEList<?>)getIdempotentConsumer()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__INTERCEPT:
				return ((InternalEList<?>)getIntercept()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__INTERCEPT_FROM:
				return ((InternalEList<?>)getInterceptFrom()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				return ((InternalEList<?>)getInterceptSendToEndpoint()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__KAMELET:
				return ((InternalEList<?>)getKamelet()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__LOAD_BALANCE:
				return ((InternalEList<?>)getLoadBalance()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__LOG:
				return ((InternalEList<?>)getLog()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__LOOP:
				return ((InternalEList<?>)getLoop()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__MARSHAL:
				return ((InternalEList<?>)getMarshal()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__MULTICAST:
				return ((InternalEList<?>)getMulticast()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__ON_COMPLETION:
				return ((InternalEList<?>)getOnCompletion()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__ON_EXCEPTION:
				return ((InternalEList<?>)getOnException()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__PAUSABLE:
				return ((InternalEList<?>)getPausable()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__PIPELINE:
				return ((InternalEList<?>)getPipeline()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__POLICY:
				return ((InternalEList<?>)getPolicy()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__POLL:
				return ((InternalEList<?>)getPoll()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__POLL_ENRICH:
				return ((InternalEList<?>)getPollEnrich()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__PROCESS:
				return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__RECIPIENT_LIST:
				return ((InternalEList<?>)getRecipientList()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__REMOVE_HEADER:
				return ((InternalEList<?>)getRemoveHeader()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__REMOVE_HEADERS:
				return ((InternalEList<?>)getRemoveHeaders()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__REMOVE_PROPERTIES:
				return ((InternalEList<?>)getRemoveProperties()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__REMOVE_PROPERTY:
				return ((InternalEList<?>)getRemoveProperty()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__REMOVE_VARIABLE:
				return ((InternalEList<?>)getRemoveVariable()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__RESEQUENCE:
				return ((InternalEList<?>)getResequence()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__RESUMABLE:
				return ((InternalEList<?>)getResumable()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__ROLLBACK:
				return ((InternalEList<?>)getRollback()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__ROUTE:
				return ((InternalEList<?>)getRoute()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__ROUTING_SLIP:
				return ((InternalEList<?>)getRoutingSlip()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__SAGA:
				return ((InternalEList<?>)getSaga()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__SAMPLE:
				return ((InternalEList<?>)getSample()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__SCRIPT:
				return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_BODY:
				return ((InternalEList<?>)getSetBody()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_EXCHANGE_PATTERN:
				return ((InternalEList<?>)getSetExchangePattern()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_HEADER:
				return ((InternalEList<?>)getSetHeader()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_HEADERS:
				return ((InternalEList<?>)getSetHeaders()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_PROPERTY:
				return ((InternalEList<?>)getSetProperty()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_VARIABLE:
				return ((InternalEList<?>)getSetVariable()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_VARIABLES:
				return ((InternalEList<?>)getSetVariables()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__SORT:
				return ((InternalEList<?>)getSort()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__SPLIT:
				return ((InternalEList<?>)getSplit()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__STEP:
				return ((InternalEList<?>)getStep()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__STOP:
				return ((InternalEList<?>)getStop()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__THREADS:
				return ((InternalEList<?>)getThreads()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__THROTTLE:
				return ((InternalEList<?>)getThrottle()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__THROW_EXCEPTION:
				return ((InternalEList<?>)getThrowException()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__TO:
				return ((InternalEList<?>)getTo()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__TO_D:
				return ((InternalEList<?>)getToD()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__TOKENIZER:
				return ((InternalEList<?>)getTokenizer()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__TRANSACTED:
				return ((InternalEList<?>)getTransacted()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__TRANSFORM:
				return ((InternalEList<?>)getTransform()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__DO_TRY:
				return ((InternalEList<?>)getDoTry()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__UNMARSHAL:
				return ((InternalEList<?>)getUnmarshal()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__VALIDATE:
				return ((InternalEList<?>)getValidate()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__WIRE_TAP:
				return ((InternalEList<?>)getWireTap()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.MULTICAST_DEFINITION__SERVICE_CALL:
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
			case CamelSpringPackage.MULTICAST_DEFINITION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CamelSpringPackage.MULTICAST_DEFINITION__AGGREGATE:
				return getAggregate();
			case CamelSpringPackage.MULTICAST_DEFINITION__BEAN:
				return getBean();
			case CamelSpringPackage.MULTICAST_DEFINITION__DO_CATCH:
				return getDoCatch();
			case CamelSpringPackage.MULTICAST_DEFINITION__CHOICE:
				return getChoice();
			case CamelSpringPackage.MULTICAST_DEFINITION__CIRCUIT_BREAKER:
				return getCircuitBreaker();
			case CamelSpringPackage.MULTICAST_DEFINITION__CLAIM_CHECK:
				return getClaimCheck();
			case CamelSpringPackage.MULTICAST_DEFINITION__CONVERT_BODY_TO:
				return getConvertBodyTo();
			case CamelSpringPackage.MULTICAST_DEFINITION__CONVERT_HEADER_TO:
				return getConvertHeaderTo();
			case CamelSpringPackage.MULTICAST_DEFINITION__CONVERT_VARIABLE_TO:
				return getConvertVariableTo();
			case CamelSpringPackage.MULTICAST_DEFINITION__DELAY:
				return getDelay();
			case CamelSpringPackage.MULTICAST_DEFINITION__DYNAMIC_ROUTER:
				return getDynamicRouter();
			case CamelSpringPackage.MULTICAST_DEFINITION__ENRICH:
				return getEnrich();
			case CamelSpringPackage.MULTICAST_DEFINITION__FILTER:
				return getFilter();
			case CamelSpringPackage.MULTICAST_DEFINITION__DO_FINALLY:
				return getDoFinally();
			case CamelSpringPackage.MULTICAST_DEFINITION__IDEMPOTENT_CONSUMER:
				return getIdempotentConsumer();
			case CamelSpringPackage.MULTICAST_DEFINITION__INTERCEPT:
				return getIntercept();
			case CamelSpringPackage.MULTICAST_DEFINITION__INTERCEPT_FROM:
				return getInterceptFrom();
			case CamelSpringPackage.MULTICAST_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				return getInterceptSendToEndpoint();
			case CamelSpringPackage.MULTICAST_DEFINITION__KAMELET:
				return getKamelet();
			case CamelSpringPackage.MULTICAST_DEFINITION__LOAD_BALANCE:
				return getLoadBalance();
			case CamelSpringPackage.MULTICAST_DEFINITION__LOG:
				return getLog();
			case CamelSpringPackage.MULTICAST_DEFINITION__LOOP:
				return getLoop();
			case CamelSpringPackage.MULTICAST_DEFINITION__MARSHAL:
				return getMarshal();
			case CamelSpringPackage.MULTICAST_DEFINITION__MULTICAST:
				return getMulticast();
			case CamelSpringPackage.MULTICAST_DEFINITION__ON_COMPLETION:
				return getOnCompletion();
			case CamelSpringPackage.MULTICAST_DEFINITION__ON_EXCEPTION:
				return getOnException();
			case CamelSpringPackage.MULTICAST_DEFINITION__PAUSABLE:
				return getPausable();
			case CamelSpringPackage.MULTICAST_DEFINITION__PIPELINE:
				return getPipeline();
			case CamelSpringPackage.MULTICAST_DEFINITION__POLICY:
				return getPolicy();
			case CamelSpringPackage.MULTICAST_DEFINITION__POLL:
				return getPoll();
			case CamelSpringPackage.MULTICAST_DEFINITION__POLL_ENRICH:
				return getPollEnrich();
			case CamelSpringPackage.MULTICAST_DEFINITION__PROCESS:
				return getProcess();
			case CamelSpringPackage.MULTICAST_DEFINITION__RECIPIENT_LIST:
				return getRecipientList();
			case CamelSpringPackage.MULTICAST_DEFINITION__REMOVE_HEADER:
				return getRemoveHeader();
			case CamelSpringPackage.MULTICAST_DEFINITION__REMOVE_HEADERS:
				return getRemoveHeaders();
			case CamelSpringPackage.MULTICAST_DEFINITION__REMOVE_PROPERTIES:
				return getRemoveProperties();
			case CamelSpringPackage.MULTICAST_DEFINITION__REMOVE_PROPERTY:
				return getRemoveProperty();
			case CamelSpringPackage.MULTICAST_DEFINITION__REMOVE_VARIABLE:
				return getRemoveVariable();
			case CamelSpringPackage.MULTICAST_DEFINITION__RESEQUENCE:
				return getResequence();
			case CamelSpringPackage.MULTICAST_DEFINITION__RESUMABLE:
				return getResumable();
			case CamelSpringPackage.MULTICAST_DEFINITION__ROLLBACK:
				return getRollback();
			case CamelSpringPackage.MULTICAST_DEFINITION__ROUTE:
				return getRoute();
			case CamelSpringPackage.MULTICAST_DEFINITION__ROUTING_SLIP:
				return getRoutingSlip();
			case CamelSpringPackage.MULTICAST_DEFINITION__SAGA:
				return getSaga();
			case CamelSpringPackage.MULTICAST_DEFINITION__SAMPLE:
				return getSample();
			case CamelSpringPackage.MULTICAST_DEFINITION__SCRIPT:
				return getScript();
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_BODY:
				return getSetBody();
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_EXCHANGE_PATTERN:
				return getSetExchangePattern();
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_HEADER:
				return getSetHeader();
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_HEADERS:
				return getSetHeaders();
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_PROPERTY:
				return getSetProperty();
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_VARIABLE:
				return getSetVariable();
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_VARIABLES:
				return getSetVariables();
			case CamelSpringPackage.MULTICAST_DEFINITION__SORT:
				return getSort();
			case CamelSpringPackage.MULTICAST_DEFINITION__SPLIT:
				return getSplit();
			case CamelSpringPackage.MULTICAST_DEFINITION__STEP:
				return getStep();
			case CamelSpringPackage.MULTICAST_DEFINITION__STOP:
				return getStop();
			case CamelSpringPackage.MULTICAST_DEFINITION__THREADS:
				return getThreads();
			case CamelSpringPackage.MULTICAST_DEFINITION__THROTTLE:
				return getThrottle();
			case CamelSpringPackage.MULTICAST_DEFINITION__THROW_EXCEPTION:
				return getThrowException();
			case CamelSpringPackage.MULTICAST_DEFINITION__TO:
				return getTo();
			case CamelSpringPackage.MULTICAST_DEFINITION__TO_D:
				return getToD();
			case CamelSpringPackage.MULTICAST_DEFINITION__TOKENIZER:
				return getTokenizer();
			case CamelSpringPackage.MULTICAST_DEFINITION__TRANSACTED:
				return getTransacted();
			case CamelSpringPackage.MULTICAST_DEFINITION__TRANSFORM:
				return getTransform();
			case CamelSpringPackage.MULTICAST_DEFINITION__DO_TRY:
				return getDoTry();
			case CamelSpringPackage.MULTICAST_DEFINITION__UNMARSHAL:
				return getUnmarshal();
			case CamelSpringPackage.MULTICAST_DEFINITION__VALIDATE:
				return getValidate();
			case CamelSpringPackage.MULTICAST_DEFINITION__WIRE_TAP:
				return getWireTap();
			case CamelSpringPackage.MULTICAST_DEFINITION__SERVICE_CALL:
				return getServiceCall();
			case CamelSpringPackage.MULTICAST_DEFINITION__AGGREGATION_STRATEGY:
				return getAggregationStrategy();
			case CamelSpringPackage.MULTICAST_DEFINITION__AGGREGATION_STRATEGY_METHOD_ALLOW_NULL:
				return getAggregationStrategyMethodAllowNull();
			case CamelSpringPackage.MULTICAST_DEFINITION__AGGREGATION_STRATEGY_METHOD_NAME:
				return getAggregationStrategyMethodName();
			case CamelSpringPackage.MULTICAST_DEFINITION__EXECUTOR_SERVICE:
				return getExecutorService();
			case CamelSpringPackage.MULTICAST_DEFINITION__ON_PREPARE:
				return getOnPrepare();
			case CamelSpringPackage.MULTICAST_DEFINITION__PARALLEL_AGGREGATE:
				return getParallelAggregate();
			case CamelSpringPackage.MULTICAST_DEFINITION__PARALLEL_PROCESSING:
				return getParallelProcessing();
			case CamelSpringPackage.MULTICAST_DEFINITION__SHARE_UNIT_OF_WORK:
				return getShareUnitOfWork();
			case CamelSpringPackage.MULTICAST_DEFINITION__STOP_ON_EXCEPTION:
				return getStopOnException();
			case CamelSpringPackage.MULTICAST_DEFINITION__STREAMING:
				return getStreaming();
			case CamelSpringPackage.MULTICAST_DEFINITION__SYNCHRONOUS:
				return getSynchronous();
			case CamelSpringPackage.MULTICAST_DEFINITION__TIMEOUT:
				return getTimeout();
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
			case CamelSpringPackage.MULTICAST_DEFINITION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__AGGREGATE:
				getAggregate().clear();
				getAggregate().addAll((Collection<? extends AggregateDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__BEAN:
				getBean().clear();
				getBean().addAll((Collection<? extends BeanDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__DO_CATCH:
				getDoCatch().clear();
				getDoCatch().addAll((Collection<? extends CatchDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__CHOICE:
				getChoice().clear();
				getChoice().addAll((Collection<? extends ChoiceDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__CIRCUIT_BREAKER:
				getCircuitBreaker().clear();
				getCircuitBreaker().addAll((Collection<? extends CircuitBreakerDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__CLAIM_CHECK:
				getClaimCheck().clear();
				getClaimCheck().addAll((Collection<? extends ClaimCheckDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__CONVERT_BODY_TO:
				getConvertBodyTo().clear();
				getConvertBodyTo().addAll((Collection<? extends ConvertBodyDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__CONVERT_HEADER_TO:
				getConvertHeaderTo().clear();
				getConvertHeaderTo().addAll((Collection<? extends ConvertHeaderDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__CONVERT_VARIABLE_TO:
				getConvertVariableTo().clear();
				getConvertVariableTo().addAll((Collection<? extends ConvertVariableDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__DELAY:
				getDelay().clear();
				getDelay().addAll((Collection<? extends DelayDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__DYNAMIC_ROUTER:
				getDynamicRouter().clear();
				getDynamicRouter().addAll((Collection<? extends DynamicRouterDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__ENRICH:
				getEnrich().clear();
				getEnrich().addAll((Collection<? extends EnrichDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends FilterDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__DO_FINALLY:
				getDoFinally().clear();
				getDoFinally().addAll((Collection<? extends FinallyDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__IDEMPOTENT_CONSUMER:
				getIdempotentConsumer().clear();
				getIdempotentConsumer().addAll((Collection<? extends IdempotentConsumerDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__INTERCEPT:
				getIntercept().clear();
				getIntercept().addAll((Collection<? extends InterceptDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__INTERCEPT_FROM:
				getInterceptFrom().clear();
				getInterceptFrom().addAll((Collection<? extends InterceptFromDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				getInterceptSendToEndpoint().clear();
				getInterceptSendToEndpoint().addAll((Collection<? extends InterceptSendToEndpointDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__KAMELET:
				getKamelet().clear();
				getKamelet().addAll((Collection<? extends KameletDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__LOAD_BALANCE:
				getLoadBalance().clear();
				getLoadBalance().addAll((Collection<? extends LoadBalanceDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__LOG:
				getLog().clear();
				getLog().addAll((Collection<? extends LogDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__LOOP:
				getLoop().clear();
				getLoop().addAll((Collection<? extends LoopDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__MARSHAL:
				getMarshal().clear();
				getMarshal().addAll((Collection<? extends MarshalDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__MULTICAST:
				getMulticast().clear();
				getMulticast().addAll((Collection<? extends MulticastDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__ON_COMPLETION:
				getOnCompletion().clear();
				getOnCompletion().addAll((Collection<? extends OnCompletionDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__ON_EXCEPTION:
				getOnException().clear();
				getOnException().addAll((Collection<? extends OnExceptionDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__PAUSABLE:
				getPausable().clear();
				getPausable().addAll((Collection<? extends PausableDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__PIPELINE:
				getPipeline().clear();
				getPipeline().addAll((Collection<? extends PipelineDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__POLICY:
				getPolicy().clear();
				getPolicy().addAll((Collection<? extends PolicyDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__POLL:
				getPoll().clear();
				getPoll().addAll((Collection<? extends PollDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__POLL_ENRICH:
				getPollEnrich().clear();
				getPollEnrich().addAll((Collection<? extends PollEnrichDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__PROCESS:
				getProcess().clear();
				getProcess().addAll((Collection<? extends ProcessDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__RECIPIENT_LIST:
				getRecipientList().clear();
				getRecipientList().addAll((Collection<? extends RecipientListDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__REMOVE_HEADER:
				getRemoveHeader().clear();
				getRemoveHeader().addAll((Collection<? extends RemoveHeaderDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__REMOVE_HEADERS:
				getRemoveHeaders().clear();
				getRemoveHeaders().addAll((Collection<? extends RemoveHeadersDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__REMOVE_PROPERTIES:
				getRemoveProperties().clear();
				getRemoveProperties().addAll((Collection<? extends RemovePropertiesDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__REMOVE_PROPERTY:
				getRemoveProperty().clear();
				getRemoveProperty().addAll((Collection<? extends RemovePropertyDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__REMOVE_VARIABLE:
				getRemoveVariable().clear();
				getRemoveVariable().addAll((Collection<? extends RemoveVariableDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__RESEQUENCE:
				getResequence().clear();
				getResequence().addAll((Collection<? extends ResequenceDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__RESUMABLE:
				getResumable().clear();
				getResumable().addAll((Collection<? extends ResumableDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__ROLLBACK:
				getRollback().clear();
				getRollback().addAll((Collection<? extends RollbackDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__ROUTE:
				getRoute().clear();
				getRoute().addAll((Collection<? extends RouteDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__ROUTING_SLIP:
				getRoutingSlip().clear();
				getRoutingSlip().addAll((Collection<? extends RoutingSlipDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SAGA:
				getSaga().clear();
				getSaga().addAll((Collection<? extends SagaDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SAMPLE:
				getSample().clear();
				getSample().addAll((Collection<? extends SamplingDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends ScriptDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_BODY:
				getSetBody().clear();
				getSetBody().addAll((Collection<? extends SetBodyDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_EXCHANGE_PATTERN:
				getSetExchangePattern().clear();
				getSetExchangePattern().addAll((Collection<? extends SetExchangePatternDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_HEADER:
				getSetHeader().clear();
				getSetHeader().addAll((Collection<? extends SetHeaderDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_HEADERS:
				getSetHeaders().clear();
				getSetHeaders().addAll((Collection<? extends SetHeadersDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_PROPERTY:
				getSetProperty().clear();
				getSetProperty().addAll((Collection<? extends SetPropertyDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_VARIABLE:
				getSetVariable().clear();
				getSetVariable().addAll((Collection<? extends SetVariableDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_VARIABLES:
				getSetVariables().clear();
				getSetVariables().addAll((Collection<? extends SetVariablesDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SORT:
				getSort().clear();
				getSort().addAll((Collection<? extends SortDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SPLIT:
				getSplit().clear();
				getSplit().addAll((Collection<? extends SplitDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends StepDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__STOP:
				getStop().clear();
				getStop().addAll((Collection<? extends StopDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__THREADS:
				getThreads().clear();
				getThreads().addAll((Collection<? extends ThreadsDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__THROTTLE:
				getThrottle().clear();
				getThrottle().addAll((Collection<? extends ThrottleDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__THROW_EXCEPTION:
				getThrowException().clear();
				getThrowException().addAll((Collection<? extends ThrowExceptionDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__TO:
				getTo().clear();
				getTo().addAll((Collection<? extends ToDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__TO_D:
				getToD().clear();
				getToD().addAll((Collection<? extends ToDynamicDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__TOKENIZER:
				getTokenizer().clear();
				getTokenizer().addAll((Collection<? extends TokenizerDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__TRANSACTED:
				getTransacted().clear();
				getTransacted().addAll((Collection<? extends TransactedDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__TRANSFORM:
				getTransform().clear();
				getTransform().addAll((Collection<? extends TransformDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__DO_TRY:
				getDoTry().clear();
				getDoTry().addAll((Collection<? extends TryDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__UNMARSHAL:
				getUnmarshal().clear();
				getUnmarshal().addAll((Collection<? extends UnmarshalDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__VALIDATE:
				getValidate().clear();
				getValidate().addAll((Collection<? extends ValidateDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__WIRE_TAP:
				getWireTap().clear();
				getWireTap().addAll((Collection<? extends WireTapDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SERVICE_CALL:
				getServiceCall().clear();
				getServiceCall().addAll((Collection<? extends ServiceCallDefinition>)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__AGGREGATION_STRATEGY:
				setAggregationStrategy((String)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__AGGREGATION_STRATEGY_METHOD_ALLOW_NULL:
				setAggregationStrategyMethodAllowNull((String)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__AGGREGATION_STRATEGY_METHOD_NAME:
				setAggregationStrategyMethodName((String)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__EXECUTOR_SERVICE:
				setExecutorService((String)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__ON_PREPARE:
				setOnPrepare((String)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__PARALLEL_AGGREGATE:
				setParallelAggregate((String)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__PARALLEL_PROCESSING:
				setParallelProcessing((String)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SHARE_UNIT_OF_WORK:
				setShareUnitOfWork((String)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__STOP_ON_EXCEPTION:
				setStopOnException((String)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__STREAMING:
				setStreaming((String)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SYNCHRONOUS:
				setSynchronous((String)newValue);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__TIMEOUT:
				setTimeout((String)newValue);
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
			case CamelSpringPackage.MULTICAST_DEFINITION__GROUP:
				getGroup().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__AGGREGATE:
				getAggregate().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__BEAN:
				getBean().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__DO_CATCH:
				getDoCatch().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__CHOICE:
				getChoice().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__CIRCUIT_BREAKER:
				getCircuitBreaker().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__CLAIM_CHECK:
				getClaimCheck().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__CONVERT_BODY_TO:
				getConvertBodyTo().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__CONVERT_HEADER_TO:
				getConvertHeaderTo().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__CONVERT_VARIABLE_TO:
				getConvertVariableTo().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__DELAY:
				getDelay().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__DYNAMIC_ROUTER:
				getDynamicRouter().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__ENRICH:
				getEnrich().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__FILTER:
				getFilter().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__DO_FINALLY:
				getDoFinally().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__IDEMPOTENT_CONSUMER:
				getIdempotentConsumer().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__INTERCEPT:
				getIntercept().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__INTERCEPT_FROM:
				getInterceptFrom().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				getInterceptSendToEndpoint().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__KAMELET:
				getKamelet().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__LOAD_BALANCE:
				getLoadBalance().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__LOG:
				getLog().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__LOOP:
				getLoop().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__MARSHAL:
				getMarshal().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__MULTICAST:
				getMulticast().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__ON_COMPLETION:
				getOnCompletion().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__ON_EXCEPTION:
				getOnException().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__PAUSABLE:
				getPausable().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__PIPELINE:
				getPipeline().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__POLICY:
				getPolicy().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__POLL:
				getPoll().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__POLL_ENRICH:
				getPollEnrich().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__PROCESS:
				getProcess().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__RECIPIENT_LIST:
				getRecipientList().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__REMOVE_HEADER:
				getRemoveHeader().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__REMOVE_HEADERS:
				getRemoveHeaders().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__REMOVE_PROPERTIES:
				getRemoveProperties().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__REMOVE_PROPERTY:
				getRemoveProperty().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__REMOVE_VARIABLE:
				getRemoveVariable().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__RESEQUENCE:
				getResequence().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__RESUMABLE:
				getResumable().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__ROLLBACK:
				getRollback().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__ROUTE:
				getRoute().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__ROUTING_SLIP:
				getRoutingSlip().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SAGA:
				getSaga().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SAMPLE:
				getSample().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SCRIPT:
				getScript().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_BODY:
				getSetBody().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_EXCHANGE_PATTERN:
				getSetExchangePattern().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_HEADER:
				getSetHeader().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_HEADERS:
				getSetHeaders().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_PROPERTY:
				getSetProperty().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_VARIABLE:
				getSetVariable().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_VARIABLES:
				getSetVariables().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SORT:
				getSort().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SPLIT:
				getSplit().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__STEP:
				getStep().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__STOP:
				getStop().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__THREADS:
				getThreads().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__THROTTLE:
				getThrottle().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__THROW_EXCEPTION:
				getThrowException().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__TO:
				getTo().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__TO_D:
				getToD().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__TOKENIZER:
				getTokenizer().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__TRANSACTED:
				getTransacted().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__TRANSFORM:
				getTransform().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__DO_TRY:
				getDoTry().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__UNMARSHAL:
				getUnmarshal().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__VALIDATE:
				getValidate().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__WIRE_TAP:
				getWireTap().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SERVICE_CALL:
				getServiceCall().clear();
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__AGGREGATION_STRATEGY:
				setAggregationStrategy(AGGREGATION_STRATEGY_EDEFAULT);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__AGGREGATION_STRATEGY_METHOD_ALLOW_NULL:
				setAggregationStrategyMethodAllowNull(AGGREGATION_STRATEGY_METHOD_ALLOW_NULL_EDEFAULT);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__AGGREGATION_STRATEGY_METHOD_NAME:
				setAggregationStrategyMethodName(AGGREGATION_STRATEGY_METHOD_NAME_EDEFAULT);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__EXECUTOR_SERVICE:
				setExecutorService(EXECUTOR_SERVICE_EDEFAULT);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__ON_PREPARE:
				setOnPrepare(ON_PREPARE_EDEFAULT);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__PARALLEL_AGGREGATE:
				setParallelAggregate(PARALLEL_AGGREGATE_EDEFAULT);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__PARALLEL_PROCESSING:
				setParallelProcessing(PARALLEL_PROCESSING_EDEFAULT);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SHARE_UNIT_OF_WORK:
				setShareUnitOfWork(SHARE_UNIT_OF_WORK_EDEFAULT);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__STOP_ON_EXCEPTION:
				setStopOnException(STOP_ON_EXCEPTION_EDEFAULT);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__STREAMING:
				setStreaming(STREAMING_EDEFAULT);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__SYNCHRONOUS:
				setSynchronous(SYNCHRONOUS_EDEFAULT);
				return;
			case CamelSpringPackage.MULTICAST_DEFINITION__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
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
			case CamelSpringPackage.MULTICAST_DEFINITION__GROUP:
				return group != null && !group.isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__AGGREGATE:
				return !getAggregate().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__BEAN:
				return !getBean().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__DO_CATCH:
				return !getDoCatch().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__CHOICE:
				return !getChoice().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__CIRCUIT_BREAKER:
				return !getCircuitBreaker().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__CLAIM_CHECK:
				return !getClaimCheck().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__CONVERT_BODY_TO:
				return !getConvertBodyTo().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__CONVERT_HEADER_TO:
				return !getConvertHeaderTo().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__CONVERT_VARIABLE_TO:
				return !getConvertVariableTo().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__DELAY:
				return !getDelay().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__DYNAMIC_ROUTER:
				return !getDynamicRouter().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__ENRICH:
				return !getEnrich().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__FILTER:
				return !getFilter().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__DO_FINALLY:
				return !getDoFinally().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__IDEMPOTENT_CONSUMER:
				return !getIdempotentConsumer().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__INTERCEPT:
				return !getIntercept().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__INTERCEPT_FROM:
				return !getInterceptFrom().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				return !getInterceptSendToEndpoint().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__KAMELET:
				return !getKamelet().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__LOAD_BALANCE:
				return !getLoadBalance().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__LOG:
				return !getLog().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__LOOP:
				return !getLoop().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__MARSHAL:
				return !getMarshal().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__MULTICAST:
				return !getMulticast().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__ON_COMPLETION:
				return !getOnCompletion().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__ON_EXCEPTION:
				return !getOnException().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__PAUSABLE:
				return !getPausable().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__PIPELINE:
				return !getPipeline().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__POLICY:
				return !getPolicy().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__POLL:
				return !getPoll().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__POLL_ENRICH:
				return !getPollEnrich().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__PROCESS:
				return !getProcess().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__RECIPIENT_LIST:
				return !getRecipientList().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__REMOVE_HEADER:
				return !getRemoveHeader().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__REMOVE_HEADERS:
				return !getRemoveHeaders().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__REMOVE_PROPERTIES:
				return !getRemoveProperties().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__REMOVE_PROPERTY:
				return !getRemoveProperty().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__REMOVE_VARIABLE:
				return !getRemoveVariable().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__RESEQUENCE:
				return !getResequence().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__RESUMABLE:
				return !getResumable().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__ROLLBACK:
				return !getRollback().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__ROUTE:
				return !getRoute().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__ROUTING_SLIP:
				return !getRoutingSlip().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__SAGA:
				return !getSaga().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__SAMPLE:
				return !getSample().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__SCRIPT:
				return !getScript().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_BODY:
				return !getSetBody().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_EXCHANGE_PATTERN:
				return !getSetExchangePattern().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_HEADER:
				return !getSetHeader().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_HEADERS:
				return !getSetHeaders().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_PROPERTY:
				return !getSetProperty().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_VARIABLE:
				return !getSetVariable().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__SET_VARIABLES:
				return !getSetVariables().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__SORT:
				return !getSort().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__SPLIT:
				return !getSplit().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__STEP:
				return !getStep().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__STOP:
				return !getStop().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__THREADS:
				return !getThreads().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__THROTTLE:
				return !getThrottle().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__THROW_EXCEPTION:
				return !getThrowException().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__TO:
				return !getTo().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__TO_D:
				return !getToD().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__TOKENIZER:
				return !getTokenizer().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__TRANSACTED:
				return !getTransacted().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__TRANSFORM:
				return !getTransform().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__DO_TRY:
				return !getDoTry().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__UNMARSHAL:
				return !getUnmarshal().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__VALIDATE:
				return !getValidate().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__WIRE_TAP:
				return !getWireTap().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__SERVICE_CALL:
				return !getServiceCall().isEmpty();
			case CamelSpringPackage.MULTICAST_DEFINITION__AGGREGATION_STRATEGY:
				return AGGREGATION_STRATEGY_EDEFAULT == null ? aggregationStrategy != null : !AGGREGATION_STRATEGY_EDEFAULT.equals(aggregationStrategy);
			case CamelSpringPackage.MULTICAST_DEFINITION__AGGREGATION_STRATEGY_METHOD_ALLOW_NULL:
				return AGGREGATION_STRATEGY_METHOD_ALLOW_NULL_EDEFAULT == null ? aggregationStrategyMethodAllowNull != null : !AGGREGATION_STRATEGY_METHOD_ALLOW_NULL_EDEFAULT.equals(aggregationStrategyMethodAllowNull);
			case CamelSpringPackage.MULTICAST_DEFINITION__AGGREGATION_STRATEGY_METHOD_NAME:
				return AGGREGATION_STRATEGY_METHOD_NAME_EDEFAULT == null ? aggregationStrategyMethodName != null : !AGGREGATION_STRATEGY_METHOD_NAME_EDEFAULT.equals(aggregationStrategyMethodName);
			case CamelSpringPackage.MULTICAST_DEFINITION__EXECUTOR_SERVICE:
				return EXECUTOR_SERVICE_EDEFAULT == null ? executorService != null : !EXECUTOR_SERVICE_EDEFAULT.equals(executorService);
			case CamelSpringPackage.MULTICAST_DEFINITION__ON_PREPARE:
				return ON_PREPARE_EDEFAULT == null ? onPrepare != null : !ON_PREPARE_EDEFAULT.equals(onPrepare);
			case CamelSpringPackage.MULTICAST_DEFINITION__PARALLEL_AGGREGATE:
				return PARALLEL_AGGREGATE_EDEFAULT == null ? parallelAggregate != null : !PARALLEL_AGGREGATE_EDEFAULT.equals(parallelAggregate);
			case CamelSpringPackage.MULTICAST_DEFINITION__PARALLEL_PROCESSING:
				return PARALLEL_PROCESSING_EDEFAULT == null ? parallelProcessing != null : !PARALLEL_PROCESSING_EDEFAULT.equals(parallelProcessing);
			case CamelSpringPackage.MULTICAST_DEFINITION__SHARE_UNIT_OF_WORK:
				return SHARE_UNIT_OF_WORK_EDEFAULT == null ? shareUnitOfWork != null : !SHARE_UNIT_OF_WORK_EDEFAULT.equals(shareUnitOfWork);
			case CamelSpringPackage.MULTICAST_DEFINITION__STOP_ON_EXCEPTION:
				return STOP_ON_EXCEPTION_EDEFAULT == null ? stopOnException != null : !STOP_ON_EXCEPTION_EDEFAULT.equals(stopOnException);
			case CamelSpringPackage.MULTICAST_DEFINITION__STREAMING:
				return STREAMING_EDEFAULT == null ? streaming != null : !STREAMING_EDEFAULT.equals(streaming);
			case CamelSpringPackage.MULTICAST_DEFINITION__SYNCHRONOUS:
				return SYNCHRONOUS_EDEFAULT == null ? synchronous != null : !SYNCHRONOUS_EDEFAULT.equals(synchronous);
			case CamelSpringPackage.MULTICAST_DEFINITION__TIMEOUT:
				return TIMEOUT_EDEFAULT == null ? timeout != null : !TIMEOUT_EDEFAULT.equals(timeout);
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
		result.append(", aggregationStrategy: ");
		result.append(aggregationStrategy);
		result.append(", aggregationStrategyMethodAllowNull: ");
		result.append(aggregationStrategyMethodAllowNull);
		result.append(", aggregationStrategyMethodName: ");
		result.append(aggregationStrategyMethodName);
		result.append(", executorService: ");
		result.append(executorService);
		result.append(", onPrepare: ");
		result.append(onPrepare);
		result.append(", parallelAggregate: ");
		result.append(parallelAggregate);
		result.append(", parallelProcessing: ");
		result.append(parallelProcessing);
		result.append(", shareUnitOfWork: ");
		result.append(shareUnitOfWork);
		result.append(", stopOnException: ");
		result.append(stopOnException);
		result.append(", streaming: ");
		result.append(streaming);
		result.append(", synchronous: ");
		result.append(synchronous);
		result.append(", timeout: ");
		result.append(timeout);
		result.append(')');
		return result.toString();
	}

} //MulticastDefinitionImpl
