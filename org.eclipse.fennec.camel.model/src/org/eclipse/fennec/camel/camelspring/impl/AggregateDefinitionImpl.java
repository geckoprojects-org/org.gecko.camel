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
import org.eclipse.fennec.camel.camelspring.ExpressionSubElementDefinition;
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
import org.eclipse.fennec.camel.camelspring.OptimisticLockRetryPolicyDefinition;
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
 * An implementation of the model object '<em><b>Aggregate Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getCorrelationExpression <em>Correlation Expression</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getCompletionPredicate <em>Completion Predicate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getCompletionTimeoutExpression <em>Completion Timeout Expression</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getCompletionSizeExpression <em>Completion Size Expression</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getOptimisticLockRetryPolicy <em>Optimistic Lock Retry Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getDoCatch <em>Do Catch</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getCircuitBreaker <em>Circuit Breaker</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getClaimCheck <em>Claim Check</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getConvertBodyTo <em>Convert Body To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getConvertHeaderTo <em>Convert Header To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getConvertVariableTo <em>Convert Variable To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getDynamicRouter <em>Dynamic Router</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getEnrich <em>Enrich</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getDoFinally <em>Do Finally</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getIdempotentConsumer <em>Idempotent Consumer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getInterceptSendToEndpoint <em>Intercept Send To Endpoint</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getKamelet <em>Kamelet</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getLog <em>Log</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getMarshal <em>Marshal</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getPausable <em>Pausable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getPoll <em>Poll</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getPollEnrich <em>Poll Enrich</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getRecipientList <em>Recipient List</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getRemoveHeader <em>Remove Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getRemoveHeaders <em>Remove Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getRemoveProperties <em>Remove Properties</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getRemoveProperty <em>Remove Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getRemoveVariable <em>Remove Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getResequence <em>Resequence</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getResumable <em>Resumable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getRoutingSlip <em>Routing Slip</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getSaga <em>Saga</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getSample <em>Sample</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getSetBody <em>Set Body</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getSetExchangePattern <em>Set Exchange Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getSetHeaders <em>Set Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getSetProperty <em>Set Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getSetVariable <em>Set Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getSetVariables <em>Set Variables</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getSplit <em>Split</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getThrottle <em>Throttle</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getToD <em>To D</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getTokenizer <em>Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getDoTry <em>Do Try</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getUnmarshal <em>Unmarshal</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getWireTap <em>Wire Tap</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getServiceCall <em>Service Call</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getAggregateController <em>Aggregate Controller</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getAggregationRepository <em>Aggregation Repository</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getAggregationStrategy <em>Aggregation Strategy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getAggregationStrategyMethodAllowNull <em>Aggregation Strategy Method Allow Null</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getAggregationStrategyMethodName <em>Aggregation Strategy Method Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getCloseCorrelationKeyOnCompletion <em>Close Correlation Key On Completion</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getCompleteAllOnStop <em>Complete All On Stop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getCompletionFromBatchConsumer <em>Completion From Batch Consumer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getCompletionInterval <em>Completion Interval</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getCompletionOnNewCorrelationGroup <em>Completion On New Correlation Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getCompletionSize <em>Completion Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getCompletionTimeout <em>Completion Timeout</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getCompletionTimeoutCheckerInterval <em>Completion Timeout Checker Interval</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getDiscardOnAggregationFailure <em>Discard On Aggregation Failure</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getDiscardOnCompletionTimeout <em>Discard On Completion Timeout</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getEagerCheckCompletion <em>Eager Check Completion</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getExecutorService <em>Executor Service</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getForceCompletionOnStop <em>Force Completion On Stop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getIgnoreInvalidCorrelationKeys <em>Ignore Invalid Correlation Keys</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getOptimisticLocking <em>Optimistic Locking</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getParallelProcessing <em>Parallel Processing</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AggregateDefinitionImpl#getTimeoutCheckerExecutorService <em>Timeout Checker Executor Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregateDefinitionImpl extends OutputImpl implements AggregateDefinition {
	/**
	 * The cached value of the '{@link #getCorrelationExpression() <em>Correlation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationExpression()
	 * @generated
	 * @ordered
	 */
	protected ExpressionSubElementDefinition correlationExpression;

	/**
	 * The cached value of the '{@link #getCompletionPredicate() <em>Completion Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionPredicate()
	 * @generated
	 * @ordered
	 */
	protected ExpressionSubElementDefinition completionPredicate;

	/**
	 * The cached value of the '{@link #getCompletionTimeoutExpression() <em>Completion Timeout Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionTimeoutExpression()
	 * @generated
	 * @ordered
	 */
	protected ExpressionSubElementDefinition completionTimeoutExpression;

	/**
	 * The cached value of the '{@link #getCompletionSizeExpression() <em>Completion Size Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionSizeExpression()
	 * @generated
	 * @ordered
	 */
	protected ExpressionSubElementDefinition completionSizeExpression;

	/**
	 * The cached value of the '{@link #getOptimisticLockRetryPolicy() <em>Optimistic Lock Retry Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimisticLockRetryPolicy()
	 * @generated
	 * @ordered
	 */
	protected OptimisticLockRetryPolicyDefinition optimisticLockRetryPolicy;

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
	 * The default value of the '{@link #getAggregateController() <em>Aggregate Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregateController()
	 * @generated
	 * @ordered
	 */
	protected static final String AGGREGATE_CONTROLLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregateController() <em>Aggregate Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregateController()
	 * @generated
	 * @ordered
	 */
	protected String aggregateController = AGGREGATE_CONTROLLER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregationRepository() <em>Aggregation Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationRepository()
	 * @generated
	 * @ordered
	 */
	protected static final String AGGREGATION_REPOSITORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregationRepository() <em>Aggregation Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationRepository()
	 * @generated
	 * @ordered
	 */
	protected String aggregationRepository = AGGREGATION_REPOSITORY_EDEFAULT;

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
	 * The default value of the '{@link #getCloseCorrelationKeyOnCompletion() <em>Close Correlation Key On Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloseCorrelationKeyOnCompletion()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOSE_CORRELATION_KEY_ON_COMPLETION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloseCorrelationKeyOnCompletion() <em>Close Correlation Key On Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloseCorrelationKeyOnCompletion()
	 * @generated
	 * @ordered
	 */
	protected String closeCorrelationKeyOnCompletion = CLOSE_CORRELATION_KEY_ON_COMPLETION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompleteAllOnStop() <em>Complete All On Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteAllOnStop()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLETE_ALL_ON_STOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompleteAllOnStop() <em>Complete All On Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteAllOnStop()
	 * @generated
	 * @ordered
	 */
	protected String completeAllOnStop = COMPLETE_ALL_ON_STOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompletionFromBatchConsumer() <em>Completion From Batch Consumer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionFromBatchConsumer()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLETION_FROM_BATCH_CONSUMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompletionFromBatchConsumer() <em>Completion From Batch Consumer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionFromBatchConsumer()
	 * @generated
	 * @ordered
	 */
	protected String completionFromBatchConsumer = COMPLETION_FROM_BATCH_CONSUMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompletionInterval() <em>Completion Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLETION_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompletionInterval() <em>Completion Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionInterval()
	 * @generated
	 * @ordered
	 */
	protected String completionInterval = COMPLETION_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompletionOnNewCorrelationGroup() <em>Completion On New Correlation Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionOnNewCorrelationGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLETION_ON_NEW_CORRELATION_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompletionOnNewCorrelationGroup() <em>Completion On New Correlation Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionOnNewCorrelationGroup()
	 * @generated
	 * @ordered
	 */
	protected String completionOnNewCorrelationGroup = COMPLETION_ON_NEW_CORRELATION_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompletionSize() <em>Completion Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionSize()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLETION_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompletionSize() <em>Completion Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionSize()
	 * @generated
	 * @ordered
	 */
	protected String completionSize = COMPLETION_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompletionTimeout() <em>Completion Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLETION_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompletionTimeout() <em>Completion Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionTimeout()
	 * @generated
	 * @ordered
	 */
	protected String completionTimeout = COMPLETION_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompletionTimeoutCheckerInterval() <em>Completion Timeout Checker Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionTimeoutCheckerInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLETION_TIMEOUT_CHECKER_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompletionTimeoutCheckerInterval() <em>Completion Timeout Checker Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionTimeoutCheckerInterval()
	 * @generated
	 * @ordered
	 */
	protected String completionTimeoutCheckerInterval = COMPLETION_TIMEOUT_CHECKER_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscardOnAggregationFailure() <em>Discard On Aggregation Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscardOnAggregationFailure()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCARD_ON_AGGREGATION_FAILURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscardOnAggregationFailure() <em>Discard On Aggregation Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscardOnAggregationFailure()
	 * @generated
	 * @ordered
	 */
	protected String discardOnAggregationFailure = DISCARD_ON_AGGREGATION_FAILURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscardOnCompletionTimeout() <em>Discard On Completion Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscardOnCompletionTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCARD_ON_COMPLETION_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscardOnCompletionTimeout() <em>Discard On Completion Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscardOnCompletionTimeout()
	 * @generated
	 * @ordered
	 */
	protected String discardOnCompletionTimeout = DISCARD_ON_COMPLETION_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEagerCheckCompletion() <em>Eager Check Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEagerCheckCompletion()
	 * @generated
	 * @ordered
	 */
	protected static final String EAGER_CHECK_COMPLETION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEagerCheckCompletion() <em>Eager Check Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEagerCheckCompletion()
	 * @generated
	 * @ordered
	 */
	protected String eagerCheckCompletion = EAGER_CHECK_COMPLETION_EDEFAULT;

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
	 * The default value of the '{@link #getForceCompletionOnStop() <em>Force Completion On Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceCompletionOnStop()
	 * @generated
	 * @ordered
	 */
	protected static final String FORCE_COMPLETION_ON_STOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForceCompletionOnStop() <em>Force Completion On Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceCompletionOnStop()
	 * @generated
	 * @ordered
	 */
	protected String forceCompletionOnStop = FORCE_COMPLETION_ON_STOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getIgnoreInvalidCorrelationKeys() <em>Ignore Invalid Correlation Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreInvalidCorrelationKeys()
	 * @generated
	 * @ordered
	 */
	protected static final String IGNORE_INVALID_CORRELATION_KEYS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIgnoreInvalidCorrelationKeys() <em>Ignore Invalid Correlation Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreInvalidCorrelationKeys()
	 * @generated
	 * @ordered
	 */
	protected String ignoreInvalidCorrelationKeys = IGNORE_INVALID_CORRELATION_KEYS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOptimisticLocking() <em>Optimistic Locking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimisticLocking()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTIMISTIC_LOCKING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptimisticLocking() <em>Optimistic Locking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimisticLocking()
	 * @generated
	 * @ordered
	 */
	protected String optimisticLocking = OPTIMISTIC_LOCKING_EDEFAULT;

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
	 * The default value of the '{@link #getTimeoutCheckerExecutorService() <em>Timeout Checker Executor Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutCheckerExecutorService()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUT_CHECKER_EXECUTOR_SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeoutCheckerExecutorService() <em>Timeout Checker Executor Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutCheckerExecutorService()
	 * @generated
	 * @ordered
	 */
	protected String timeoutCheckerExecutorService = TIMEOUT_CHECKER_EXECUTOR_SERVICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregateDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getAggregateDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionSubElementDefinition getCorrelationExpression() {
		return correlationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelationExpression(ExpressionSubElementDefinition newCorrelationExpression, NotificationChain msgs) {
		ExpressionSubElementDefinition oldCorrelationExpression = correlationExpression;
		correlationExpression = newCorrelationExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__CORRELATION_EXPRESSION, oldCorrelationExpression, newCorrelationExpression);
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
	public void setCorrelationExpression(ExpressionSubElementDefinition newCorrelationExpression) {
		if (newCorrelationExpression != correlationExpression) {
			NotificationChain msgs = null;
			if (correlationExpression != null)
				msgs = ((InternalEObject)correlationExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.AGGREGATE_DEFINITION__CORRELATION_EXPRESSION, null, msgs);
			if (newCorrelationExpression != null)
				msgs = ((InternalEObject)newCorrelationExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.AGGREGATE_DEFINITION__CORRELATION_EXPRESSION, null, msgs);
			msgs = basicSetCorrelationExpression(newCorrelationExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__CORRELATION_EXPRESSION, newCorrelationExpression, newCorrelationExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionSubElementDefinition getCompletionPredicate() {
		return completionPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompletionPredicate(ExpressionSubElementDefinition newCompletionPredicate, NotificationChain msgs) {
		ExpressionSubElementDefinition oldCompletionPredicate = completionPredicate;
		completionPredicate = newCompletionPredicate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_PREDICATE, oldCompletionPredicate, newCompletionPredicate);
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
	public void setCompletionPredicate(ExpressionSubElementDefinition newCompletionPredicate) {
		if (newCompletionPredicate != completionPredicate) {
			NotificationChain msgs = null;
			if (completionPredicate != null)
				msgs = ((InternalEObject)completionPredicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_PREDICATE, null, msgs);
			if (newCompletionPredicate != null)
				msgs = ((InternalEObject)newCompletionPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_PREDICATE, null, msgs);
			msgs = basicSetCompletionPredicate(newCompletionPredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_PREDICATE, newCompletionPredicate, newCompletionPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionSubElementDefinition getCompletionTimeoutExpression() {
		return completionTimeoutExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompletionTimeoutExpression(ExpressionSubElementDefinition newCompletionTimeoutExpression, NotificationChain msgs) {
		ExpressionSubElementDefinition oldCompletionTimeoutExpression = completionTimeoutExpression;
		completionTimeoutExpression = newCompletionTimeoutExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT_EXPRESSION, oldCompletionTimeoutExpression, newCompletionTimeoutExpression);
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
	public void setCompletionTimeoutExpression(ExpressionSubElementDefinition newCompletionTimeoutExpression) {
		if (newCompletionTimeoutExpression != completionTimeoutExpression) {
			NotificationChain msgs = null;
			if (completionTimeoutExpression != null)
				msgs = ((InternalEObject)completionTimeoutExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT_EXPRESSION, null, msgs);
			if (newCompletionTimeoutExpression != null)
				msgs = ((InternalEObject)newCompletionTimeoutExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT_EXPRESSION, null, msgs);
			msgs = basicSetCompletionTimeoutExpression(newCompletionTimeoutExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT_EXPRESSION, newCompletionTimeoutExpression, newCompletionTimeoutExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionSubElementDefinition getCompletionSizeExpression() {
		return completionSizeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompletionSizeExpression(ExpressionSubElementDefinition newCompletionSizeExpression, NotificationChain msgs) {
		ExpressionSubElementDefinition oldCompletionSizeExpression = completionSizeExpression;
		completionSizeExpression = newCompletionSizeExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE_EXPRESSION, oldCompletionSizeExpression, newCompletionSizeExpression);
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
	public void setCompletionSizeExpression(ExpressionSubElementDefinition newCompletionSizeExpression) {
		if (newCompletionSizeExpression != completionSizeExpression) {
			NotificationChain msgs = null;
			if (completionSizeExpression != null)
				msgs = ((InternalEObject)completionSizeExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE_EXPRESSION, null, msgs);
			if (newCompletionSizeExpression != null)
				msgs = ((InternalEObject)newCompletionSizeExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE_EXPRESSION, null, msgs);
			msgs = basicSetCompletionSizeExpression(newCompletionSizeExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE_EXPRESSION, newCompletionSizeExpression, newCompletionSizeExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptimisticLockRetryPolicyDefinition getOptimisticLockRetryPolicy() {
		return optimisticLockRetryPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptimisticLockRetryPolicy(OptimisticLockRetryPolicyDefinition newOptimisticLockRetryPolicy, NotificationChain msgs) {
		OptimisticLockRetryPolicyDefinition oldOptimisticLockRetryPolicy = optimisticLockRetryPolicy;
		optimisticLockRetryPolicy = newOptimisticLockRetryPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__OPTIMISTIC_LOCK_RETRY_POLICY, oldOptimisticLockRetryPolicy, newOptimisticLockRetryPolicy);
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
	public void setOptimisticLockRetryPolicy(OptimisticLockRetryPolicyDefinition newOptimisticLockRetryPolicy) {
		if (newOptimisticLockRetryPolicy != optimisticLockRetryPolicy) {
			NotificationChain msgs = null;
			if (optimisticLockRetryPolicy != null)
				msgs = ((InternalEObject)optimisticLockRetryPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.AGGREGATE_DEFINITION__OPTIMISTIC_LOCK_RETRY_POLICY, null, msgs);
			if (newOptimisticLockRetryPolicy != null)
				msgs = ((InternalEObject)newOptimisticLockRetryPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.AGGREGATE_DEFINITION__OPTIMISTIC_LOCK_RETRY_POLICY, null, msgs);
			msgs = basicSetOptimisticLockRetryPolicy(newOptimisticLockRetryPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__OPTIMISTIC_LOCK_RETRY_POLICY, newOptimisticLockRetryPolicy, newOptimisticLockRetryPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CamelSpringPackage.AGGREGATE_DEFINITION__GROUP);
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
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Aggregate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BeanDefinition> getBean() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Bean());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CatchDefinition> getDoCatch() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_DoCatch());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChoiceDefinition> getChoice() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Choice());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CircuitBreakerDefinition> getCircuitBreaker() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_CircuitBreaker());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimCheckDefinition> getClaimCheck() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_ClaimCheck());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConvertBodyDefinition> getConvertBodyTo() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_ConvertBodyTo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConvertHeaderDefinition> getConvertHeaderTo() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_ConvertHeaderTo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConvertVariableDefinition> getConvertVariableTo() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_ConvertVariableTo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DelayDefinition> getDelay() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Delay());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DynamicRouterDefinition> getDynamicRouter() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_DynamicRouter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnrichDefinition> getEnrich() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Enrich());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FilterDefinition> getFilter() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Filter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinallyDefinition> getDoFinally() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_DoFinally());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IdempotentConsumerDefinition> getIdempotentConsumer() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_IdempotentConsumer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterceptDefinition> getIntercept() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Intercept());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterceptFromDefinition> getInterceptFrom() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_InterceptFrom());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterceptSendToEndpointDefinition> getInterceptSendToEndpoint() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_InterceptSendToEndpoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KameletDefinition> getKamelet() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Kamelet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LoadBalanceDefinition> getLoadBalance() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_LoadBalance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogDefinition> getLog() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Log());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LoopDefinition> getLoop() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Loop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarshalDefinition> getMarshal() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Marshal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MulticastDefinition> getMulticast() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Multicast());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OnCompletionDefinition> getOnCompletion() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_OnCompletion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OnExceptionDefinition> getOnException() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_OnException());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PausableDefinition> getPausable() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Pausable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PipelineDefinition> getPipeline() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Pipeline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PolicyDefinition> getPolicy() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Policy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PollDefinition> getPoll() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Poll());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PollEnrichDefinition> getPollEnrich() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_PollEnrich());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessDefinition> getProcess() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Process());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RecipientListDefinition> getRecipientList() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_RecipientList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemoveHeaderDefinition> getRemoveHeader() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_RemoveHeader());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemoveHeadersDefinition> getRemoveHeaders() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_RemoveHeaders());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemovePropertiesDefinition> getRemoveProperties() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_RemoveProperties());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemovePropertyDefinition> getRemoveProperty() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_RemoveProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemoveVariableDefinition> getRemoveVariable() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_RemoveVariable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResequenceDefinition> getResequence() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Resequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResumableDefinition> getResumable() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Resumable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RollbackDefinition> getRollback() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Rollback());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RouteDefinition> getRoute() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Route());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RoutingSlipDefinition> getRoutingSlip() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_RoutingSlip());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SagaDefinition> getSaga() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Saga());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SamplingDefinition> getSample() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Sample());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScriptDefinition> getScript() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Script());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetBodyDefinition> getSetBody() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_SetBody());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetExchangePatternDefinition> getSetExchangePattern() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_SetExchangePattern());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetHeaderDefinition> getSetHeader() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_SetHeader());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetHeadersDefinition> getSetHeaders() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_SetHeaders());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetPropertyDefinition> getSetProperty() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_SetProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetVariableDefinition> getSetVariable() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_SetVariable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetVariablesDefinition> getSetVariables() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_SetVariables());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SortDefinition> getSort() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Sort());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SplitDefinition> getSplit() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Split());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StepDefinition> getStep() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Step());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StopDefinition> getStop() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Stop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThreadsDefinition> getThreads() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Threads());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThrottleDefinition> getThrottle() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Throttle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThrowExceptionDefinition> getThrowException() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_ThrowException());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ToDefinition> getTo() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_To());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ToDynamicDefinition> getToD() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_ToD());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TokenizerDefinition> getTokenizer() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Tokenizer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransactedDefinition> getTransacted() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Transacted());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransformDefinition> getTransform() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Transform());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TryDefinition> getDoTry() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_DoTry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnmarshalDefinition> getUnmarshal() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Unmarshal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValidateDefinition> getValidate() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_Validate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WireTapDefinition> getWireTap() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_WireTap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceCallDefinition> getServiceCall() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getAggregateDefinition_ServiceCall());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAggregateController() {
		return aggregateController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregateController(String newAggregateController) {
		String oldAggregateController = aggregateController;
		aggregateController = newAggregateController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATE_CONTROLLER, oldAggregateController, aggregateController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAggregationRepository() {
		return aggregationRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregationRepository(String newAggregationRepository) {
		String oldAggregationRepository = aggregationRepository;
		aggregationRepository = newAggregationRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATION_REPOSITORY, oldAggregationRepository, aggregationRepository));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATION_STRATEGY, oldAggregationStrategy, aggregationStrategy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATION_STRATEGY_METHOD_ALLOW_NULL, oldAggregationStrategyMethodAllowNull, aggregationStrategyMethodAllowNull));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATION_STRATEGY_METHOD_NAME, oldAggregationStrategyMethodName, aggregationStrategyMethodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCloseCorrelationKeyOnCompletion() {
		return closeCorrelationKeyOnCompletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCloseCorrelationKeyOnCompletion(String newCloseCorrelationKeyOnCompletion) {
		String oldCloseCorrelationKeyOnCompletion = closeCorrelationKeyOnCompletion;
		closeCorrelationKeyOnCompletion = newCloseCorrelationKeyOnCompletion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__CLOSE_CORRELATION_KEY_ON_COMPLETION, oldCloseCorrelationKeyOnCompletion, closeCorrelationKeyOnCompletion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompleteAllOnStop() {
		return completeAllOnStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompleteAllOnStop(String newCompleteAllOnStop) {
		String oldCompleteAllOnStop = completeAllOnStop;
		completeAllOnStop = newCompleteAllOnStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETE_ALL_ON_STOP, oldCompleteAllOnStop, completeAllOnStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompletionFromBatchConsumer() {
		return completionFromBatchConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompletionFromBatchConsumer(String newCompletionFromBatchConsumer) {
		String oldCompletionFromBatchConsumer = completionFromBatchConsumer;
		completionFromBatchConsumer = newCompletionFromBatchConsumer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_FROM_BATCH_CONSUMER, oldCompletionFromBatchConsumer, completionFromBatchConsumer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompletionInterval() {
		return completionInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompletionInterval(String newCompletionInterval) {
		String oldCompletionInterval = completionInterval;
		completionInterval = newCompletionInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_INTERVAL, oldCompletionInterval, completionInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompletionOnNewCorrelationGroup() {
		return completionOnNewCorrelationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompletionOnNewCorrelationGroup(String newCompletionOnNewCorrelationGroup) {
		String oldCompletionOnNewCorrelationGroup = completionOnNewCorrelationGroup;
		completionOnNewCorrelationGroup = newCompletionOnNewCorrelationGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_ON_NEW_CORRELATION_GROUP, oldCompletionOnNewCorrelationGroup, completionOnNewCorrelationGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompletionSize() {
		return completionSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompletionSize(String newCompletionSize) {
		String oldCompletionSize = completionSize;
		completionSize = newCompletionSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE, oldCompletionSize, completionSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompletionTimeout() {
		return completionTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompletionTimeout(String newCompletionTimeout) {
		String oldCompletionTimeout = completionTimeout;
		completionTimeout = newCompletionTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT, oldCompletionTimeout, completionTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompletionTimeoutCheckerInterval() {
		return completionTimeoutCheckerInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompletionTimeoutCheckerInterval(String newCompletionTimeoutCheckerInterval) {
		String oldCompletionTimeoutCheckerInterval = completionTimeoutCheckerInterval;
		completionTimeoutCheckerInterval = newCompletionTimeoutCheckerInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT_CHECKER_INTERVAL, oldCompletionTimeoutCheckerInterval, completionTimeoutCheckerInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDiscardOnAggregationFailure() {
		return discardOnAggregationFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscardOnAggregationFailure(String newDiscardOnAggregationFailure) {
		String oldDiscardOnAggregationFailure = discardOnAggregationFailure;
		discardOnAggregationFailure = newDiscardOnAggregationFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__DISCARD_ON_AGGREGATION_FAILURE, oldDiscardOnAggregationFailure, discardOnAggregationFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDiscardOnCompletionTimeout() {
		return discardOnCompletionTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscardOnCompletionTimeout(String newDiscardOnCompletionTimeout) {
		String oldDiscardOnCompletionTimeout = discardOnCompletionTimeout;
		discardOnCompletionTimeout = newDiscardOnCompletionTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__DISCARD_ON_COMPLETION_TIMEOUT, oldDiscardOnCompletionTimeout, discardOnCompletionTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEagerCheckCompletion() {
		return eagerCheckCompletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEagerCheckCompletion(String newEagerCheckCompletion) {
		String oldEagerCheckCompletion = eagerCheckCompletion;
		eagerCheckCompletion = newEagerCheckCompletion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__EAGER_CHECK_COMPLETION, oldEagerCheckCompletion, eagerCheckCompletion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__EXECUTOR_SERVICE, oldExecutorService, executorService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getForceCompletionOnStop() {
		return forceCompletionOnStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForceCompletionOnStop(String newForceCompletionOnStop) {
		String oldForceCompletionOnStop = forceCompletionOnStop;
		forceCompletionOnStop = newForceCompletionOnStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__FORCE_COMPLETION_ON_STOP, oldForceCompletionOnStop, forceCompletionOnStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIgnoreInvalidCorrelationKeys() {
		return ignoreInvalidCorrelationKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreInvalidCorrelationKeys(String newIgnoreInvalidCorrelationKeys) {
		String oldIgnoreInvalidCorrelationKeys = ignoreInvalidCorrelationKeys;
		ignoreInvalidCorrelationKeys = newIgnoreInvalidCorrelationKeys;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__IGNORE_INVALID_CORRELATION_KEYS, oldIgnoreInvalidCorrelationKeys, ignoreInvalidCorrelationKeys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOptimisticLocking() {
		return optimisticLocking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptimisticLocking(String newOptimisticLocking) {
		String oldOptimisticLocking = optimisticLocking;
		optimisticLocking = newOptimisticLocking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__OPTIMISTIC_LOCKING, oldOptimisticLocking, optimisticLocking));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__PARALLEL_PROCESSING, oldParallelProcessing, parallelProcessing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeoutCheckerExecutorService() {
		return timeoutCheckerExecutorService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeoutCheckerExecutorService(String newTimeoutCheckerExecutorService) {
		String oldTimeoutCheckerExecutorService = timeoutCheckerExecutorService;
		timeoutCheckerExecutorService = newTimeoutCheckerExecutorService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.AGGREGATE_DEFINITION__TIMEOUT_CHECKER_EXECUTOR_SERVICE, oldTimeoutCheckerExecutorService, timeoutCheckerExecutorService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.AGGREGATE_DEFINITION__CORRELATION_EXPRESSION:
				return basicSetCorrelationExpression(null, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_PREDICATE:
				return basicSetCompletionPredicate(null, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT_EXPRESSION:
				return basicSetCompletionTimeoutExpression(null, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE_EXPRESSION:
				return basicSetCompletionSizeExpression(null, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__OPTIMISTIC_LOCK_RETRY_POLICY:
				return basicSetOptimisticLockRetryPolicy(null, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATE:
				return ((InternalEList<?>)getAggregate()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__BEAN:
				return ((InternalEList<?>)getBean()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__DO_CATCH:
				return ((InternalEList<?>)getDoCatch()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__CHOICE:
				return ((InternalEList<?>)getChoice()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__CIRCUIT_BREAKER:
				return ((InternalEList<?>)getCircuitBreaker()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__CLAIM_CHECK:
				return ((InternalEList<?>)getClaimCheck()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__CONVERT_BODY_TO:
				return ((InternalEList<?>)getConvertBodyTo()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__CONVERT_HEADER_TO:
				return ((InternalEList<?>)getConvertHeaderTo()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__CONVERT_VARIABLE_TO:
				return ((InternalEList<?>)getConvertVariableTo()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__DELAY:
				return ((InternalEList<?>)getDelay()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__DYNAMIC_ROUTER:
				return ((InternalEList<?>)getDynamicRouter()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__ENRICH:
				return ((InternalEList<?>)getEnrich()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__FILTER:
				return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__DO_FINALLY:
				return ((InternalEList<?>)getDoFinally()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__IDEMPOTENT_CONSUMER:
				return ((InternalEList<?>)getIdempotentConsumer()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__INTERCEPT:
				return ((InternalEList<?>)getIntercept()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__INTERCEPT_FROM:
				return ((InternalEList<?>)getInterceptFrom()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				return ((InternalEList<?>)getInterceptSendToEndpoint()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__KAMELET:
				return ((InternalEList<?>)getKamelet()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__LOAD_BALANCE:
				return ((InternalEList<?>)getLoadBalance()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__LOG:
				return ((InternalEList<?>)getLog()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__LOOP:
				return ((InternalEList<?>)getLoop()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__MARSHAL:
				return ((InternalEList<?>)getMarshal()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__MULTICAST:
				return ((InternalEList<?>)getMulticast()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__ON_COMPLETION:
				return ((InternalEList<?>)getOnCompletion()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__ON_EXCEPTION:
				return ((InternalEList<?>)getOnException()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__PAUSABLE:
				return ((InternalEList<?>)getPausable()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__PIPELINE:
				return ((InternalEList<?>)getPipeline()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__POLICY:
				return ((InternalEList<?>)getPolicy()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__POLL:
				return ((InternalEList<?>)getPoll()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__POLL_ENRICH:
				return ((InternalEList<?>)getPollEnrich()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__PROCESS:
				return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__RECIPIENT_LIST:
				return ((InternalEList<?>)getRecipientList()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__REMOVE_HEADER:
				return ((InternalEList<?>)getRemoveHeader()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__REMOVE_HEADERS:
				return ((InternalEList<?>)getRemoveHeaders()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__REMOVE_PROPERTIES:
				return ((InternalEList<?>)getRemoveProperties()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__REMOVE_PROPERTY:
				return ((InternalEList<?>)getRemoveProperty()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__REMOVE_VARIABLE:
				return ((InternalEList<?>)getRemoveVariable()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__RESEQUENCE:
				return ((InternalEList<?>)getResequence()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__RESUMABLE:
				return ((InternalEList<?>)getResumable()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__ROLLBACK:
				return ((InternalEList<?>)getRollback()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__ROUTE:
				return ((InternalEList<?>)getRoute()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__ROUTING_SLIP:
				return ((InternalEList<?>)getRoutingSlip()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__SAGA:
				return ((InternalEList<?>)getSaga()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__SAMPLE:
				return ((InternalEList<?>)getSample()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__SCRIPT:
				return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_BODY:
				return ((InternalEList<?>)getSetBody()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_EXCHANGE_PATTERN:
				return ((InternalEList<?>)getSetExchangePattern()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_HEADER:
				return ((InternalEList<?>)getSetHeader()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_HEADERS:
				return ((InternalEList<?>)getSetHeaders()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_PROPERTY:
				return ((InternalEList<?>)getSetProperty()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_VARIABLE:
				return ((InternalEList<?>)getSetVariable()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_VARIABLES:
				return ((InternalEList<?>)getSetVariables()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__SORT:
				return ((InternalEList<?>)getSort()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__SPLIT:
				return ((InternalEList<?>)getSplit()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__STEP:
				return ((InternalEList<?>)getStep()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__STOP:
				return ((InternalEList<?>)getStop()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__THREADS:
				return ((InternalEList<?>)getThreads()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__THROTTLE:
				return ((InternalEList<?>)getThrottle()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__THROW_EXCEPTION:
				return ((InternalEList<?>)getThrowException()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__TO:
				return ((InternalEList<?>)getTo()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__TO_D:
				return ((InternalEList<?>)getToD()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__TOKENIZER:
				return ((InternalEList<?>)getTokenizer()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__TRANSACTED:
				return ((InternalEList<?>)getTransacted()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__TRANSFORM:
				return ((InternalEList<?>)getTransform()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__DO_TRY:
				return ((InternalEList<?>)getDoTry()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__UNMARSHAL:
				return ((InternalEList<?>)getUnmarshal()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__VALIDATE:
				return ((InternalEList<?>)getValidate()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__WIRE_TAP:
				return ((InternalEList<?>)getWireTap()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.AGGREGATE_DEFINITION__SERVICE_CALL:
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
			case CamelSpringPackage.AGGREGATE_DEFINITION__CORRELATION_EXPRESSION:
				return getCorrelationExpression();
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_PREDICATE:
				return getCompletionPredicate();
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT_EXPRESSION:
				return getCompletionTimeoutExpression();
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE_EXPRESSION:
				return getCompletionSizeExpression();
			case CamelSpringPackage.AGGREGATE_DEFINITION__OPTIMISTIC_LOCK_RETRY_POLICY:
				return getOptimisticLockRetryPolicy();
			case CamelSpringPackage.AGGREGATE_DEFINITION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATE:
				return getAggregate();
			case CamelSpringPackage.AGGREGATE_DEFINITION__BEAN:
				return getBean();
			case CamelSpringPackage.AGGREGATE_DEFINITION__DO_CATCH:
				return getDoCatch();
			case CamelSpringPackage.AGGREGATE_DEFINITION__CHOICE:
				return getChoice();
			case CamelSpringPackage.AGGREGATE_DEFINITION__CIRCUIT_BREAKER:
				return getCircuitBreaker();
			case CamelSpringPackage.AGGREGATE_DEFINITION__CLAIM_CHECK:
				return getClaimCheck();
			case CamelSpringPackage.AGGREGATE_DEFINITION__CONVERT_BODY_TO:
				return getConvertBodyTo();
			case CamelSpringPackage.AGGREGATE_DEFINITION__CONVERT_HEADER_TO:
				return getConvertHeaderTo();
			case CamelSpringPackage.AGGREGATE_DEFINITION__CONVERT_VARIABLE_TO:
				return getConvertVariableTo();
			case CamelSpringPackage.AGGREGATE_DEFINITION__DELAY:
				return getDelay();
			case CamelSpringPackage.AGGREGATE_DEFINITION__DYNAMIC_ROUTER:
				return getDynamicRouter();
			case CamelSpringPackage.AGGREGATE_DEFINITION__ENRICH:
				return getEnrich();
			case CamelSpringPackage.AGGREGATE_DEFINITION__FILTER:
				return getFilter();
			case CamelSpringPackage.AGGREGATE_DEFINITION__DO_FINALLY:
				return getDoFinally();
			case CamelSpringPackage.AGGREGATE_DEFINITION__IDEMPOTENT_CONSUMER:
				return getIdempotentConsumer();
			case CamelSpringPackage.AGGREGATE_DEFINITION__INTERCEPT:
				return getIntercept();
			case CamelSpringPackage.AGGREGATE_DEFINITION__INTERCEPT_FROM:
				return getInterceptFrom();
			case CamelSpringPackage.AGGREGATE_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				return getInterceptSendToEndpoint();
			case CamelSpringPackage.AGGREGATE_DEFINITION__KAMELET:
				return getKamelet();
			case CamelSpringPackage.AGGREGATE_DEFINITION__LOAD_BALANCE:
				return getLoadBalance();
			case CamelSpringPackage.AGGREGATE_DEFINITION__LOG:
				return getLog();
			case CamelSpringPackage.AGGREGATE_DEFINITION__LOOP:
				return getLoop();
			case CamelSpringPackage.AGGREGATE_DEFINITION__MARSHAL:
				return getMarshal();
			case CamelSpringPackage.AGGREGATE_DEFINITION__MULTICAST:
				return getMulticast();
			case CamelSpringPackage.AGGREGATE_DEFINITION__ON_COMPLETION:
				return getOnCompletion();
			case CamelSpringPackage.AGGREGATE_DEFINITION__ON_EXCEPTION:
				return getOnException();
			case CamelSpringPackage.AGGREGATE_DEFINITION__PAUSABLE:
				return getPausable();
			case CamelSpringPackage.AGGREGATE_DEFINITION__PIPELINE:
				return getPipeline();
			case CamelSpringPackage.AGGREGATE_DEFINITION__POLICY:
				return getPolicy();
			case CamelSpringPackage.AGGREGATE_DEFINITION__POLL:
				return getPoll();
			case CamelSpringPackage.AGGREGATE_DEFINITION__POLL_ENRICH:
				return getPollEnrich();
			case CamelSpringPackage.AGGREGATE_DEFINITION__PROCESS:
				return getProcess();
			case CamelSpringPackage.AGGREGATE_DEFINITION__RECIPIENT_LIST:
				return getRecipientList();
			case CamelSpringPackage.AGGREGATE_DEFINITION__REMOVE_HEADER:
				return getRemoveHeader();
			case CamelSpringPackage.AGGREGATE_DEFINITION__REMOVE_HEADERS:
				return getRemoveHeaders();
			case CamelSpringPackage.AGGREGATE_DEFINITION__REMOVE_PROPERTIES:
				return getRemoveProperties();
			case CamelSpringPackage.AGGREGATE_DEFINITION__REMOVE_PROPERTY:
				return getRemoveProperty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__REMOVE_VARIABLE:
				return getRemoveVariable();
			case CamelSpringPackage.AGGREGATE_DEFINITION__RESEQUENCE:
				return getResequence();
			case CamelSpringPackage.AGGREGATE_DEFINITION__RESUMABLE:
				return getResumable();
			case CamelSpringPackage.AGGREGATE_DEFINITION__ROLLBACK:
				return getRollback();
			case CamelSpringPackage.AGGREGATE_DEFINITION__ROUTE:
				return getRoute();
			case CamelSpringPackage.AGGREGATE_DEFINITION__ROUTING_SLIP:
				return getRoutingSlip();
			case CamelSpringPackage.AGGREGATE_DEFINITION__SAGA:
				return getSaga();
			case CamelSpringPackage.AGGREGATE_DEFINITION__SAMPLE:
				return getSample();
			case CamelSpringPackage.AGGREGATE_DEFINITION__SCRIPT:
				return getScript();
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_BODY:
				return getSetBody();
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_EXCHANGE_PATTERN:
				return getSetExchangePattern();
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_HEADER:
				return getSetHeader();
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_HEADERS:
				return getSetHeaders();
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_PROPERTY:
				return getSetProperty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_VARIABLE:
				return getSetVariable();
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_VARIABLES:
				return getSetVariables();
			case CamelSpringPackage.AGGREGATE_DEFINITION__SORT:
				return getSort();
			case CamelSpringPackage.AGGREGATE_DEFINITION__SPLIT:
				return getSplit();
			case CamelSpringPackage.AGGREGATE_DEFINITION__STEP:
				return getStep();
			case CamelSpringPackage.AGGREGATE_DEFINITION__STOP:
				return getStop();
			case CamelSpringPackage.AGGREGATE_DEFINITION__THREADS:
				return getThreads();
			case CamelSpringPackage.AGGREGATE_DEFINITION__THROTTLE:
				return getThrottle();
			case CamelSpringPackage.AGGREGATE_DEFINITION__THROW_EXCEPTION:
				return getThrowException();
			case CamelSpringPackage.AGGREGATE_DEFINITION__TO:
				return getTo();
			case CamelSpringPackage.AGGREGATE_DEFINITION__TO_D:
				return getToD();
			case CamelSpringPackage.AGGREGATE_DEFINITION__TOKENIZER:
				return getTokenizer();
			case CamelSpringPackage.AGGREGATE_DEFINITION__TRANSACTED:
				return getTransacted();
			case CamelSpringPackage.AGGREGATE_DEFINITION__TRANSFORM:
				return getTransform();
			case CamelSpringPackage.AGGREGATE_DEFINITION__DO_TRY:
				return getDoTry();
			case CamelSpringPackage.AGGREGATE_DEFINITION__UNMARSHAL:
				return getUnmarshal();
			case CamelSpringPackage.AGGREGATE_DEFINITION__VALIDATE:
				return getValidate();
			case CamelSpringPackage.AGGREGATE_DEFINITION__WIRE_TAP:
				return getWireTap();
			case CamelSpringPackage.AGGREGATE_DEFINITION__SERVICE_CALL:
				return getServiceCall();
			case CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATE_CONTROLLER:
				return getAggregateController();
			case CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATION_REPOSITORY:
				return getAggregationRepository();
			case CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATION_STRATEGY:
				return getAggregationStrategy();
			case CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATION_STRATEGY_METHOD_ALLOW_NULL:
				return getAggregationStrategyMethodAllowNull();
			case CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATION_STRATEGY_METHOD_NAME:
				return getAggregationStrategyMethodName();
			case CamelSpringPackage.AGGREGATE_DEFINITION__CLOSE_CORRELATION_KEY_ON_COMPLETION:
				return getCloseCorrelationKeyOnCompletion();
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETE_ALL_ON_STOP:
				return getCompleteAllOnStop();
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_FROM_BATCH_CONSUMER:
				return getCompletionFromBatchConsumer();
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_INTERVAL:
				return getCompletionInterval();
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_ON_NEW_CORRELATION_GROUP:
				return getCompletionOnNewCorrelationGroup();
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE:
				return getCompletionSize();
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT:
				return getCompletionTimeout();
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT_CHECKER_INTERVAL:
				return getCompletionTimeoutCheckerInterval();
			case CamelSpringPackage.AGGREGATE_DEFINITION__DISCARD_ON_AGGREGATION_FAILURE:
				return getDiscardOnAggregationFailure();
			case CamelSpringPackage.AGGREGATE_DEFINITION__DISCARD_ON_COMPLETION_TIMEOUT:
				return getDiscardOnCompletionTimeout();
			case CamelSpringPackage.AGGREGATE_DEFINITION__EAGER_CHECK_COMPLETION:
				return getEagerCheckCompletion();
			case CamelSpringPackage.AGGREGATE_DEFINITION__EXECUTOR_SERVICE:
				return getExecutorService();
			case CamelSpringPackage.AGGREGATE_DEFINITION__FORCE_COMPLETION_ON_STOP:
				return getForceCompletionOnStop();
			case CamelSpringPackage.AGGREGATE_DEFINITION__IGNORE_INVALID_CORRELATION_KEYS:
				return getIgnoreInvalidCorrelationKeys();
			case CamelSpringPackage.AGGREGATE_DEFINITION__OPTIMISTIC_LOCKING:
				return getOptimisticLocking();
			case CamelSpringPackage.AGGREGATE_DEFINITION__PARALLEL_PROCESSING:
				return getParallelProcessing();
			case CamelSpringPackage.AGGREGATE_DEFINITION__TIMEOUT_CHECKER_EXECUTOR_SERVICE:
				return getTimeoutCheckerExecutorService();
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
			case CamelSpringPackage.AGGREGATE_DEFINITION__CORRELATION_EXPRESSION:
				setCorrelationExpression((ExpressionSubElementDefinition)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_PREDICATE:
				setCompletionPredicate((ExpressionSubElementDefinition)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT_EXPRESSION:
				setCompletionTimeoutExpression((ExpressionSubElementDefinition)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE_EXPRESSION:
				setCompletionSizeExpression((ExpressionSubElementDefinition)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__OPTIMISTIC_LOCK_RETRY_POLICY:
				setOptimisticLockRetryPolicy((OptimisticLockRetryPolicyDefinition)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATE:
				getAggregate().clear();
				getAggregate().addAll((Collection<? extends AggregateDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__BEAN:
				getBean().clear();
				getBean().addAll((Collection<? extends BeanDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__DO_CATCH:
				getDoCatch().clear();
				getDoCatch().addAll((Collection<? extends CatchDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__CHOICE:
				getChoice().clear();
				getChoice().addAll((Collection<? extends ChoiceDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__CIRCUIT_BREAKER:
				getCircuitBreaker().clear();
				getCircuitBreaker().addAll((Collection<? extends CircuitBreakerDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__CLAIM_CHECK:
				getClaimCheck().clear();
				getClaimCheck().addAll((Collection<? extends ClaimCheckDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__CONVERT_BODY_TO:
				getConvertBodyTo().clear();
				getConvertBodyTo().addAll((Collection<? extends ConvertBodyDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__CONVERT_HEADER_TO:
				getConvertHeaderTo().clear();
				getConvertHeaderTo().addAll((Collection<? extends ConvertHeaderDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__CONVERT_VARIABLE_TO:
				getConvertVariableTo().clear();
				getConvertVariableTo().addAll((Collection<? extends ConvertVariableDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__DELAY:
				getDelay().clear();
				getDelay().addAll((Collection<? extends DelayDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__DYNAMIC_ROUTER:
				getDynamicRouter().clear();
				getDynamicRouter().addAll((Collection<? extends DynamicRouterDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__ENRICH:
				getEnrich().clear();
				getEnrich().addAll((Collection<? extends EnrichDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends FilterDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__DO_FINALLY:
				getDoFinally().clear();
				getDoFinally().addAll((Collection<? extends FinallyDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__IDEMPOTENT_CONSUMER:
				getIdempotentConsumer().clear();
				getIdempotentConsumer().addAll((Collection<? extends IdempotentConsumerDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__INTERCEPT:
				getIntercept().clear();
				getIntercept().addAll((Collection<? extends InterceptDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__INTERCEPT_FROM:
				getInterceptFrom().clear();
				getInterceptFrom().addAll((Collection<? extends InterceptFromDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				getInterceptSendToEndpoint().clear();
				getInterceptSendToEndpoint().addAll((Collection<? extends InterceptSendToEndpointDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__KAMELET:
				getKamelet().clear();
				getKamelet().addAll((Collection<? extends KameletDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__LOAD_BALANCE:
				getLoadBalance().clear();
				getLoadBalance().addAll((Collection<? extends LoadBalanceDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__LOG:
				getLog().clear();
				getLog().addAll((Collection<? extends LogDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__LOOP:
				getLoop().clear();
				getLoop().addAll((Collection<? extends LoopDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__MARSHAL:
				getMarshal().clear();
				getMarshal().addAll((Collection<? extends MarshalDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__MULTICAST:
				getMulticast().clear();
				getMulticast().addAll((Collection<? extends MulticastDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__ON_COMPLETION:
				getOnCompletion().clear();
				getOnCompletion().addAll((Collection<? extends OnCompletionDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__ON_EXCEPTION:
				getOnException().clear();
				getOnException().addAll((Collection<? extends OnExceptionDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__PAUSABLE:
				getPausable().clear();
				getPausable().addAll((Collection<? extends PausableDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__PIPELINE:
				getPipeline().clear();
				getPipeline().addAll((Collection<? extends PipelineDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__POLICY:
				getPolicy().clear();
				getPolicy().addAll((Collection<? extends PolicyDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__POLL:
				getPoll().clear();
				getPoll().addAll((Collection<? extends PollDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__POLL_ENRICH:
				getPollEnrich().clear();
				getPollEnrich().addAll((Collection<? extends PollEnrichDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__PROCESS:
				getProcess().clear();
				getProcess().addAll((Collection<? extends ProcessDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__RECIPIENT_LIST:
				getRecipientList().clear();
				getRecipientList().addAll((Collection<? extends RecipientListDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__REMOVE_HEADER:
				getRemoveHeader().clear();
				getRemoveHeader().addAll((Collection<? extends RemoveHeaderDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__REMOVE_HEADERS:
				getRemoveHeaders().clear();
				getRemoveHeaders().addAll((Collection<? extends RemoveHeadersDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__REMOVE_PROPERTIES:
				getRemoveProperties().clear();
				getRemoveProperties().addAll((Collection<? extends RemovePropertiesDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__REMOVE_PROPERTY:
				getRemoveProperty().clear();
				getRemoveProperty().addAll((Collection<? extends RemovePropertyDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__REMOVE_VARIABLE:
				getRemoveVariable().clear();
				getRemoveVariable().addAll((Collection<? extends RemoveVariableDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__RESEQUENCE:
				getResequence().clear();
				getResequence().addAll((Collection<? extends ResequenceDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__RESUMABLE:
				getResumable().clear();
				getResumable().addAll((Collection<? extends ResumableDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__ROLLBACK:
				getRollback().clear();
				getRollback().addAll((Collection<? extends RollbackDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__ROUTE:
				getRoute().clear();
				getRoute().addAll((Collection<? extends RouteDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__ROUTING_SLIP:
				getRoutingSlip().clear();
				getRoutingSlip().addAll((Collection<? extends RoutingSlipDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__SAGA:
				getSaga().clear();
				getSaga().addAll((Collection<? extends SagaDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__SAMPLE:
				getSample().clear();
				getSample().addAll((Collection<? extends SamplingDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends ScriptDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_BODY:
				getSetBody().clear();
				getSetBody().addAll((Collection<? extends SetBodyDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_EXCHANGE_PATTERN:
				getSetExchangePattern().clear();
				getSetExchangePattern().addAll((Collection<? extends SetExchangePatternDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_HEADER:
				getSetHeader().clear();
				getSetHeader().addAll((Collection<? extends SetHeaderDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_HEADERS:
				getSetHeaders().clear();
				getSetHeaders().addAll((Collection<? extends SetHeadersDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_PROPERTY:
				getSetProperty().clear();
				getSetProperty().addAll((Collection<? extends SetPropertyDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_VARIABLE:
				getSetVariable().clear();
				getSetVariable().addAll((Collection<? extends SetVariableDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_VARIABLES:
				getSetVariables().clear();
				getSetVariables().addAll((Collection<? extends SetVariablesDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__SORT:
				getSort().clear();
				getSort().addAll((Collection<? extends SortDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__SPLIT:
				getSplit().clear();
				getSplit().addAll((Collection<? extends SplitDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends StepDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__STOP:
				getStop().clear();
				getStop().addAll((Collection<? extends StopDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__THREADS:
				getThreads().clear();
				getThreads().addAll((Collection<? extends ThreadsDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__THROTTLE:
				getThrottle().clear();
				getThrottle().addAll((Collection<? extends ThrottleDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__THROW_EXCEPTION:
				getThrowException().clear();
				getThrowException().addAll((Collection<? extends ThrowExceptionDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__TO:
				getTo().clear();
				getTo().addAll((Collection<? extends ToDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__TO_D:
				getToD().clear();
				getToD().addAll((Collection<? extends ToDynamicDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__TOKENIZER:
				getTokenizer().clear();
				getTokenizer().addAll((Collection<? extends TokenizerDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__TRANSACTED:
				getTransacted().clear();
				getTransacted().addAll((Collection<? extends TransactedDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__TRANSFORM:
				getTransform().clear();
				getTransform().addAll((Collection<? extends TransformDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__DO_TRY:
				getDoTry().clear();
				getDoTry().addAll((Collection<? extends TryDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__UNMARSHAL:
				getUnmarshal().clear();
				getUnmarshal().addAll((Collection<? extends UnmarshalDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__VALIDATE:
				getValidate().clear();
				getValidate().addAll((Collection<? extends ValidateDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__WIRE_TAP:
				getWireTap().clear();
				getWireTap().addAll((Collection<? extends WireTapDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__SERVICE_CALL:
				getServiceCall().clear();
				getServiceCall().addAll((Collection<? extends ServiceCallDefinition>)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATE_CONTROLLER:
				setAggregateController((String)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATION_REPOSITORY:
				setAggregationRepository((String)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATION_STRATEGY:
				setAggregationStrategy((String)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATION_STRATEGY_METHOD_ALLOW_NULL:
				setAggregationStrategyMethodAllowNull((String)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATION_STRATEGY_METHOD_NAME:
				setAggregationStrategyMethodName((String)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__CLOSE_CORRELATION_KEY_ON_COMPLETION:
				setCloseCorrelationKeyOnCompletion((String)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETE_ALL_ON_STOP:
				setCompleteAllOnStop((String)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_FROM_BATCH_CONSUMER:
				setCompletionFromBatchConsumer((String)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_INTERVAL:
				setCompletionInterval((String)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_ON_NEW_CORRELATION_GROUP:
				setCompletionOnNewCorrelationGroup((String)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE:
				setCompletionSize((String)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT:
				setCompletionTimeout((String)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT_CHECKER_INTERVAL:
				setCompletionTimeoutCheckerInterval((String)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__DISCARD_ON_AGGREGATION_FAILURE:
				setDiscardOnAggregationFailure((String)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__DISCARD_ON_COMPLETION_TIMEOUT:
				setDiscardOnCompletionTimeout((String)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__EAGER_CHECK_COMPLETION:
				setEagerCheckCompletion((String)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__EXECUTOR_SERVICE:
				setExecutorService((String)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__FORCE_COMPLETION_ON_STOP:
				setForceCompletionOnStop((String)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__IGNORE_INVALID_CORRELATION_KEYS:
				setIgnoreInvalidCorrelationKeys((String)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__OPTIMISTIC_LOCKING:
				setOptimisticLocking((String)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__PARALLEL_PROCESSING:
				setParallelProcessing((String)newValue);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__TIMEOUT_CHECKER_EXECUTOR_SERVICE:
				setTimeoutCheckerExecutorService((String)newValue);
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
			case CamelSpringPackage.AGGREGATE_DEFINITION__CORRELATION_EXPRESSION:
				setCorrelationExpression((ExpressionSubElementDefinition)null);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_PREDICATE:
				setCompletionPredicate((ExpressionSubElementDefinition)null);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT_EXPRESSION:
				setCompletionTimeoutExpression((ExpressionSubElementDefinition)null);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE_EXPRESSION:
				setCompletionSizeExpression((ExpressionSubElementDefinition)null);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__OPTIMISTIC_LOCK_RETRY_POLICY:
				setOptimisticLockRetryPolicy((OptimisticLockRetryPolicyDefinition)null);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__GROUP:
				getGroup().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATE:
				getAggregate().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__BEAN:
				getBean().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__DO_CATCH:
				getDoCatch().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__CHOICE:
				getChoice().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__CIRCUIT_BREAKER:
				getCircuitBreaker().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__CLAIM_CHECK:
				getClaimCheck().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__CONVERT_BODY_TO:
				getConvertBodyTo().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__CONVERT_HEADER_TO:
				getConvertHeaderTo().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__CONVERT_VARIABLE_TO:
				getConvertVariableTo().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__DELAY:
				getDelay().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__DYNAMIC_ROUTER:
				getDynamicRouter().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__ENRICH:
				getEnrich().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__FILTER:
				getFilter().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__DO_FINALLY:
				getDoFinally().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__IDEMPOTENT_CONSUMER:
				getIdempotentConsumer().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__INTERCEPT:
				getIntercept().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__INTERCEPT_FROM:
				getInterceptFrom().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				getInterceptSendToEndpoint().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__KAMELET:
				getKamelet().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__LOAD_BALANCE:
				getLoadBalance().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__LOG:
				getLog().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__LOOP:
				getLoop().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__MARSHAL:
				getMarshal().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__MULTICAST:
				getMulticast().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__ON_COMPLETION:
				getOnCompletion().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__ON_EXCEPTION:
				getOnException().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__PAUSABLE:
				getPausable().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__PIPELINE:
				getPipeline().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__POLICY:
				getPolicy().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__POLL:
				getPoll().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__POLL_ENRICH:
				getPollEnrich().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__PROCESS:
				getProcess().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__RECIPIENT_LIST:
				getRecipientList().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__REMOVE_HEADER:
				getRemoveHeader().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__REMOVE_HEADERS:
				getRemoveHeaders().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__REMOVE_PROPERTIES:
				getRemoveProperties().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__REMOVE_PROPERTY:
				getRemoveProperty().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__REMOVE_VARIABLE:
				getRemoveVariable().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__RESEQUENCE:
				getResequence().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__RESUMABLE:
				getResumable().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__ROLLBACK:
				getRollback().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__ROUTE:
				getRoute().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__ROUTING_SLIP:
				getRoutingSlip().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__SAGA:
				getSaga().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__SAMPLE:
				getSample().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__SCRIPT:
				getScript().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_BODY:
				getSetBody().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_EXCHANGE_PATTERN:
				getSetExchangePattern().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_HEADER:
				getSetHeader().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_HEADERS:
				getSetHeaders().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_PROPERTY:
				getSetProperty().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_VARIABLE:
				getSetVariable().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_VARIABLES:
				getSetVariables().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__SORT:
				getSort().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__SPLIT:
				getSplit().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__STEP:
				getStep().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__STOP:
				getStop().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__THREADS:
				getThreads().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__THROTTLE:
				getThrottle().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__THROW_EXCEPTION:
				getThrowException().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__TO:
				getTo().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__TO_D:
				getToD().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__TOKENIZER:
				getTokenizer().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__TRANSACTED:
				getTransacted().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__TRANSFORM:
				getTransform().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__DO_TRY:
				getDoTry().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__UNMARSHAL:
				getUnmarshal().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__VALIDATE:
				getValidate().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__WIRE_TAP:
				getWireTap().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__SERVICE_CALL:
				getServiceCall().clear();
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATE_CONTROLLER:
				setAggregateController(AGGREGATE_CONTROLLER_EDEFAULT);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATION_REPOSITORY:
				setAggregationRepository(AGGREGATION_REPOSITORY_EDEFAULT);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATION_STRATEGY:
				setAggregationStrategy(AGGREGATION_STRATEGY_EDEFAULT);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATION_STRATEGY_METHOD_ALLOW_NULL:
				setAggregationStrategyMethodAllowNull(AGGREGATION_STRATEGY_METHOD_ALLOW_NULL_EDEFAULT);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATION_STRATEGY_METHOD_NAME:
				setAggregationStrategyMethodName(AGGREGATION_STRATEGY_METHOD_NAME_EDEFAULT);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__CLOSE_CORRELATION_KEY_ON_COMPLETION:
				setCloseCorrelationKeyOnCompletion(CLOSE_CORRELATION_KEY_ON_COMPLETION_EDEFAULT);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETE_ALL_ON_STOP:
				setCompleteAllOnStop(COMPLETE_ALL_ON_STOP_EDEFAULT);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_FROM_BATCH_CONSUMER:
				setCompletionFromBatchConsumer(COMPLETION_FROM_BATCH_CONSUMER_EDEFAULT);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_INTERVAL:
				setCompletionInterval(COMPLETION_INTERVAL_EDEFAULT);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_ON_NEW_CORRELATION_GROUP:
				setCompletionOnNewCorrelationGroup(COMPLETION_ON_NEW_CORRELATION_GROUP_EDEFAULT);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE:
				setCompletionSize(COMPLETION_SIZE_EDEFAULT);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT:
				setCompletionTimeout(COMPLETION_TIMEOUT_EDEFAULT);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT_CHECKER_INTERVAL:
				setCompletionTimeoutCheckerInterval(COMPLETION_TIMEOUT_CHECKER_INTERVAL_EDEFAULT);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__DISCARD_ON_AGGREGATION_FAILURE:
				setDiscardOnAggregationFailure(DISCARD_ON_AGGREGATION_FAILURE_EDEFAULT);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__DISCARD_ON_COMPLETION_TIMEOUT:
				setDiscardOnCompletionTimeout(DISCARD_ON_COMPLETION_TIMEOUT_EDEFAULT);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__EAGER_CHECK_COMPLETION:
				setEagerCheckCompletion(EAGER_CHECK_COMPLETION_EDEFAULT);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__EXECUTOR_SERVICE:
				setExecutorService(EXECUTOR_SERVICE_EDEFAULT);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__FORCE_COMPLETION_ON_STOP:
				setForceCompletionOnStop(FORCE_COMPLETION_ON_STOP_EDEFAULT);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__IGNORE_INVALID_CORRELATION_KEYS:
				setIgnoreInvalidCorrelationKeys(IGNORE_INVALID_CORRELATION_KEYS_EDEFAULT);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__OPTIMISTIC_LOCKING:
				setOptimisticLocking(OPTIMISTIC_LOCKING_EDEFAULT);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__PARALLEL_PROCESSING:
				setParallelProcessing(PARALLEL_PROCESSING_EDEFAULT);
				return;
			case CamelSpringPackage.AGGREGATE_DEFINITION__TIMEOUT_CHECKER_EXECUTOR_SERVICE:
				setTimeoutCheckerExecutorService(TIMEOUT_CHECKER_EXECUTOR_SERVICE_EDEFAULT);
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
			case CamelSpringPackage.AGGREGATE_DEFINITION__CORRELATION_EXPRESSION:
				return correlationExpression != null;
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_PREDICATE:
				return completionPredicate != null;
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT_EXPRESSION:
				return completionTimeoutExpression != null;
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE_EXPRESSION:
				return completionSizeExpression != null;
			case CamelSpringPackage.AGGREGATE_DEFINITION__OPTIMISTIC_LOCK_RETRY_POLICY:
				return optimisticLockRetryPolicy != null;
			case CamelSpringPackage.AGGREGATE_DEFINITION__GROUP:
				return group != null && !group.isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATE:
				return !getAggregate().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__BEAN:
				return !getBean().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__DO_CATCH:
				return !getDoCatch().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__CHOICE:
				return !getChoice().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__CIRCUIT_BREAKER:
				return !getCircuitBreaker().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__CLAIM_CHECK:
				return !getClaimCheck().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__CONVERT_BODY_TO:
				return !getConvertBodyTo().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__CONVERT_HEADER_TO:
				return !getConvertHeaderTo().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__CONVERT_VARIABLE_TO:
				return !getConvertVariableTo().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__DELAY:
				return !getDelay().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__DYNAMIC_ROUTER:
				return !getDynamicRouter().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__ENRICH:
				return !getEnrich().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__FILTER:
				return !getFilter().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__DO_FINALLY:
				return !getDoFinally().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__IDEMPOTENT_CONSUMER:
				return !getIdempotentConsumer().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__INTERCEPT:
				return !getIntercept().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__INTERCEPT_FROM:
				return !getInterceptFrom().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				return !getInterceptSendToEndpoint().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__KAMELET:
				return !getKamelet().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__LOAD_BALANCE:
				return !getLoadBalance().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__LOG:
				return !getLog().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__LOOP:
				return !getLoop().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__MARSHAL:
				return !getMarshal().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__MULTICAST:
				return !getMulticast().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__ON_COMPLETION:
				return !getOnCompletion().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__ON_EXCEPTION:
				return !getOnException().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__PAUSABLE:
				return !getPausable().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__PIPELINE:
				return !getPipeline().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__POLICY:
				return !getPolicy().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__POLL:
				return !getPoll().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__POLL_ENRICH:
				return !getPollEnrich().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__PROCESS:
				return !getProcess().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__RECIPIENT_LIST:
				return !getRecipientList().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__REMOVE_HEADER:
				return !getRemoveHeader().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__REMOVE_HEADERS:
				return !getRemoveHeaders().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__REMOVE_PROPERTIES:
				return !getRemoveProperties().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__REMOVE_PROPERTY:
				return !getRemoveProperty().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__REMOVE_VARIABLE:
				return !getRemoveVariable().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__RESEQUENCE:
				return !getResequence().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__RESUMABLE:
				return !getResumable().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__ROLLBACK:
				return !getRollback().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__ROUTE:
				return !getRoute().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__ROUTING_SLIP:
				return !getRoutingSlip().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__SAGA:
				return !getSaga().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__SAMPLE:
				return !getSample().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__SCRIPT:
				return !getScript().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_BODY:
				return !getSetBody().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_EXCHANGE_PATTERN:
				return !getSetExchangePattern().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_HEADER:
				return !getSetHeader().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_HEADERS:
				return !getSetHeaders().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_PROPERTY:
				return !getSetProperty().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_VARIABLE:
				return !getSetVariable().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__SET_VARIABLES:
				return !getSetVariables().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__SORT:
				return !getSort().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__SPLIT:
				return !getSplit().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__STEP:
				return !getStep().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__STOP:
				return !getStop().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__THREADS:
				return !getThreads().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__THROTTLE:
				return !getThrottle().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__THROW_EXCEPTION:
				return !getThrowException().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__TO:
				return !getTo().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__TO_D:
				return !getToD().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__TOKENIZER:
				return !getTokenizer().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__TRANSACTED:
				return !getTransacted().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__TRANSFORM:
				return !getTransform().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__DO_TRY:
				return !getDoTry().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__UNMARSHAL:
				return !getUnmarshal().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__VALIDATE:
				return !getValidate().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__WIRE_TAP:
				return !getWireTap().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__SERVICE_CALL:
				return !getServiceCall().isEmpty();
			case CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATE_CONTROLLER:
				return AGGREGATE_CONTROLLER_EDEFAULT == null ? aggregateController != null : !AGGREGATE_CONTROLLER_EDEFAULT.equals(aggregateController);
			case CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATION_REPOSITORY:
				return AGGREGATION_REPOSITORY_EDEFAULT == null ? aggregationRepository != null : !AGGREGATION_REPOSITORY_EDEFAULT.equals(aggregationRepository);
			case CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATION_STRATEGY:
				return AGGREGATION_STRATEGY_EDEFAULT == null ? aggregationStrategy != null : !AGGREGATION_STRATEGY_EDEFAULT.equals(aggregationStrategy);
			case CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATION_STRATEGY_METHOD_ALLOW_NULL:
				return AGGREGATION_STRATEGY_METHOD_ALLOW_NULL_EDEFAULT == null ? aggregationStrategyMethodAllowNull != null : !AGGREGATION_STRATEGY_METHOD_ALLOW_NULL_EDEFAULT.equals(aggregationStrategyMethodAllowNull);
			case CamelSpringPackage.AGGREGATE_DEFINITION__AGGREGATION_STRATEGY_METHOD_NAME:
				return AGGREGATION_STRATEGY_METHOD_NAME_EDEFAULT == null ? aggregationStrategyMethodName != null : !AGGREGATION_STRATEGY_METHOD_NAME_EDEFAULT.equals(aggregationStrategyMethodName);
			case CamelSpringPackage.AGGREGATE_DEFINITION__CLOSE_CORRELATION_KEY_ON_COMPLETION:
				return CLOSE_CORRELATION_KEY_ON_COMPLETION_EDEFAULT == null ? closeCorrelationKeyOnCompletion != null : !CLOSE_CORRELATION_KEY_ON_COMPLETION_EDEFAULT.equals(closeCorrelationKeyOnCompletion);
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETE_ALL_ON_STOP:
				return COMPLETE_ALL_ON_STOP_EDEFAULT == null ? completeAllOnStop != null : !COMPLETE_ALL_ON_STOP_EDEFAULT.equals(completeAllOnStop);
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_FROM_BATCH_CONSUMER:
				return COMPLETION_FROM_BATCH_CONSUMER_EDEFAULT == null ? completionFromBatchConsumer != null : !COMPLETION_FROM_BATCH_CONSUMER_EDEFAULT.equals(completionFromBatchConsumer);
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_INTERVAL:
				return COMPLETION_INTERVAL_EDEFAULT == null ? completionInterval != null : !COMPLETION_INTERVAL_EDEFAULT.equals(completionInterval);
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_ON_NEW_CORRELATION_GROUP:
				return COMPLETION_ON_NEW_CORRELATION_GROUP_EDEFAULT == null ? completionOnNewCorrelationGroup != null : !COMPLETION_ON_NEW_CORRELATION_GROUP_EDEFAULT.equals(completionOnNewCorrelationGroup);
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE:
				return COMPLETION_SIZE_EDEFAULT == null ? completionSize != null : !COMPLETION_SIZE_EDEFAULT.equals(completionSize);
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT:
				return COMPLETION_TIMEOUT_EDEFAULT == null ? completionTimeout != null : !COMPLETION_TIMEOUT_EDEFAULT.equals(completionTimeout);
			case CamelSpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT_CHECKER_INTERVAL:
				return COMPLETION_TIMEOUT_CHECKER_INTERVAL_EDEFAULT == null ? completionTimeoutCheckerInterval != null : !COMPLETION_TIMEOUT_CHECKER_INTERVAL_EDEFAULT.equals(completionTimeoutCheckerInterval);
			case CamelSpringPackage.AGGREGATE_DEFINITION__DISCARD_ON_AGGREGATION_FAILURE:
				return DISCARD_ON_AGGREGATION_FAILURE_EDEFAULT == null ? discardOnAggregationFailure != null : !DISCARD_ON_AGGREGATION_FAILURE_EDEFAULT.equals(discardOnAggregationFailure);
			case CamelSpringPackage.AGGREGATE_DEFINITION__DISCARD_ON_COMPLETION_TIMEOUT:
				return DISCARD_ON_COMPLETION_TIMEOUT_EDEFAULT == null ? discardOnCompletionTimeout != null : !DISCARD_ON_COMPLETION_TIMEOUT_EDEFAULT.equals(discardOnCompletionTimeout);
			case CamelSpringPackage.AGGREGATE_DEFINITION__EAGER_CHECK_COMPLETION:
				return EAGER_CHECK_COMPLETION_EDEFAULT == null ? eagerCheckCompletion != null : !EAGER_CHECK_COMPLETION_EDEFAULT.equals(eagerCheckCompletion);
			case CamelSpringPackage.AGGREGATE_DEFINITION__EXECUTOR_SERVICE:
				return EXECUTOR_SERVICE_EDEFAULT == null ? executorService != null : !EXECUTOR_SERVICE_EDEFAULT.equals(executorService);
			case CamelSpringPackage.AGGREGATE_DEFINITION__FORCE_COMPLETION_ON_STOP:
				return FORCE_COMPLETION_ON_STOP_EDEFAULT == null ? forceCompletionOnStop != null : !FORCE_COMPLETION_ON_STOP_EDEFAULT.equals(forceCompletionOnStop);
			case CamelSpringPackage.AGGREGATE_DEFINITION__IGNORE_INVALID_CORRELATION_KEYS:
				return IGNORE_INVALID_CORRELATION_KEYS_EDEFAULT == null ? ignoreInvalidCorrelationKeys != null : !IGNORE_INVALID_CORRELATION_KEYS_EDEFAULT.equals(ignoreInvalidCorrelationKeys);
			case CamelSpringPackage.AGGREGATE_DEFINITION__OPTIMISTIC_LOCKING:
				return OPTIMISTIC_LOCKING_EDEFAULT == null ? optimisticLocking != null : !OPTIMISTIC_LOCKING_EDEFAULT.equals(optimisticLocking);
			case CamelSpringPackage.AGGREGATE_DEFINITION__PARALLEL_PROCESSING:
				return PARALLEL_PROCESSING_EDEFAULT == null ? parallelProcessing != null : !PARALLEL_PROCESSING_EDEFAULT.equals(parallelProcessing);
			case CamelSpringPackage.AGGREGATE_DEFINITION__TIMEOUT_CHECKER_EXECUTOR_SERVICE:
				return TIMEOUT_CHECKER_EXECUTOR_SERVICE_EDEFAULT == null ? timeoutCheckerExecutorService != null : !TIMEOUT_CHECKER_EXECUTOR_SERVICE_EDEFAULT.equals(timeoutCheckerExecutorService);
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
		result.append(", aggregateController: ");
		result.append(aggregateController);
		result.append(", aggregationRepository: ");
		result.append(aggregationRepository);
		result.append(", aggregationStrategy: ");
		result.append(aggregationStrategy);
		result.append(", aggregationStrategyMethodAllowNull: ");
		result.append(aggregationStrategyMethodAllowNull);
		result.append(", aggregationStrategyMethodName: ");
		result.append(aggregationStrategyMethodName);
		result.append(", closeCorrelationKeyOnCompletion: ");
		result.append(closeCorrelationKeyOnCompletion);
		result.append(", completeAllOnStop: ");
		result.append(completeAllOnStop);
		result.append(", completionFromBatchConsumer: ");
		result.append(completionFromBatchConsumer);
		result.append(", completionInterval: ");
		result.append(completionInterval);
		result.append(", completionOnNewCorrelationGroup: ");
		result.append(completionOnNewCorrelationGroup);
		result.append(", completionSize: ");
		result.append(completionSize);
		result.append(", completionTimeout: ");
		result.append(completionTimeout);
		result.append(", completionTimeoutCheckerInterval: ");
		result.append(completionTimeoutCheckerInterval);
		result.append(", discardOnAggregationFailure: ");
		result.append(discardOnAggregationFailure);
		result.append(", discardOnCompletionTimeout: ");
		result.append(discardOnCompletionTimeout);
		result.append(", eagerCheckCompletion: ");
		result.append(eagerCheckCompletion);
		result.append(", executorService: ");
		result.append(executorService);
		result.append(", forceCompletionOnStop: ");
		result.append(forceCompletionOnStop);
		result.append(", ignoreInvalidCorrelationKeys: ");
		result.append(ignoreInvalidCorrelationKeys);
		result.append(", optimisticLocking: ");
		result.append(optimisticLocking);
		result.append(", parallelProcessing: ");
		result.append(parallelProcessing);
		result.append(", timeoutCheckerExecutorService: ");
		result.append(timeoutCheckerExecutorService);
		result.append(')');
		return result.toString();
	}

} //AggregateDefinitionImpl
