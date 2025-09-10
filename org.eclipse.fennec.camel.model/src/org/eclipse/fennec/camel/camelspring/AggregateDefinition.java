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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getCorrelationExpression <em>Correlation Expression</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getCompletionPredicate <em>Completion Predicate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getCompletionTimeoutExpression <em>Completion Timeout Expression</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getCompletionSizeExpression <em>Completion Size Expression</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getOptimisticLockRetryPolicy <em>Optimistic Lock Retry Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getBean <em>Bean</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getDoCatch <em>Do Catch</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getCircuitBreaker <em>Circuit Breaker</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getClaimCheck <em>Claim Check</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getConvertBodyTo <em>Convert Body To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getConvertHeaderTo <em>Convert Header To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getConvertVariableTo <em>Convert Variable To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getDynamicRouter <em>Dynamic Router</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getEnrich <em>Enrich</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getDoFinally <em>Do Finally</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getIdempotentConsumer <em>Idempotent Consumer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getInterceptSendToEndpoint <em>Intercept Send To Endpoint</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getKamelet <em>Kamelet</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getLog <em>Log</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getMarshal <em>Marshal</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getPausable <em>Pausable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getPoll <em>Poll</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getPollEnrich <em>Poll Enrich</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getProcess <em>Process</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getRecipientList <em>Recipient List</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getRemoveHeader <em>Remove Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getRemoveHeaders <em>Remove Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getRemoveProperties <em>Remove Properties</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getRemoveProperty <em>Remove Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getRemoveVariable <em>Remove Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getResequence <em>Resequence</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getResumable <em>Resumable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getRoute <em>Route</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getRoutingSlip <em>Routing Slip</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getSaga <em>Saga</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getSample <em>Sample</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getScript <em>Script</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getSetBody <em>Set Body</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getSetExchangePattern <em>Set Exchange Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getSetHeaders <em>Set Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getSetProperty <em>Set Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getSetVariable <em>Set Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getSetVariables <em>Set Variables</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getSort <em>Sort</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getSplit <em>Split</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getStep <em>Step</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getStop <em>Stop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getThrottle <em>Throttle</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getToD <em>To D</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getTokenizer <em>Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getDoTry <em>Do Try</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getUnmarshal <em>Unmarshal</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getWireTap <em>Wire Tap</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getServiceCall <em>Service Call</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getAggregateController <em>Aggregate Controller</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getAggregationRepository <em>Aggregation Repository</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getAggregationStrategy <em>Aggregation Strategy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getAggregationStrategyMethodAllowNull <em>Aggregation Strategy Method Allow Null</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getAggregationStrategyMethodName <em>Aggregation Strategy Method Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getCloseCorrelationKeyOnCompletion <em>Close Correlation Key On Completion</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getCompleteAllOnStop <em>Complete All On Stop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getCompletionFromBatchConsumer <em>Completion From Batch Consumer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getCompletionInterval <em>Completion Interval</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getCompletionOnNewCorrelationGroup <em>Completion On New Correlation Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getCompletionSize <em>Completion Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getCompletionTimeout <em>Completion Timeout</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getCompletionTimeoutCheckerInterval <em>Completion Timeout Checker Interval</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getDiscardOnAggregationFailure <em>Discard On Aggregation Failure</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getDiscardOnCompletionTimeout <em>Discard On Completion Timeout</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getEagerCheckCompletion <em>Eager Check Completion</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getExecutorService <em>Executor Service</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getForceCompletionOnStop <em>Force Completion On Stop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getIgnoreInvalidCorrelationKeys <em>Ignore Invalid Correlation Keys</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getOptimisticLocking <em>Optimistic Locking</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getParallelProcessing <em>Parallel Processing</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getTimeoutCheckerExecutorService <em>Timeout Checker Executor Service</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition()
 * @model extendedMetaData="name='aggregateDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AggregateDefinition extends Output {
	/**
	 * Returns the value of the '<em><b>Correlation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The expression used to calculate the correlation key to use for aggregation. The Exchange which has the same correlation
	 * key is aggregated together. If the correlation key could not be evaluated an Exception is thrown. You can disable this
	 * by using the ignoreBadCorrelationKeys option.
	 * 
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Correlation Expression</em>' containment reference.
	 * @see #setCorrelationExpression(ExpressionSubElementDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_CorrelationExpression()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='correlationExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpressionSubElementDefinition getCorrelationExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getCorrelationExpression <em>Correlation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Expression</em>' containment reference.
	 * @see #getCorrelationExpression()
	 * @generated
	 */
	void setCorrelationExpression(ExpressionSubElementDefinition value);

	/**
	 * Returns the value of the '<em><b>Completion Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A Predicate to indicate when an aggregated exchange is complete. If this is not specified and the AggregationStrategy
	 * object implements Predicate, the aggregationStrategy object will be used as the completionPredicate.
	 * 
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Completion Predicate</em>' containment reference.
	 * @see #setCompletionPredicate(ExpressionSubElementDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_CompletionPredicate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='completionPredicate' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpressionSubElementDefinition getCompletionPredicate();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getCompletionPredicate <em>Completion Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Predicate</em>' containment reference.
	 * @see #getCompletionPredicate()
	 * @generated
	 */
	void setCompletionPredicate(ExpressionSubElementDefinition value);

	/**
	 * Returns the value of the '<em><b>Completion Timeout Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Time in millis that an aggregated exchange should be inactive before its complete (timeout). This option can be set as
	 * either a fixed value or using an Expression which allows you to evaluate a timeout dynamically - will use Long as
	 * result. If both are set Camel will fallback to use the fixed value if the Expression result was null or 0. You cannot
	 * use this option together with completionInterval, only one of the two can be used. By default the timeout checker runs
	 * every second, you can use the completionTimeoutCheckerInterval option to configure how frequently to run the checker.
	 * The timeout is an approximation and there is no guarantee that the a timeout is triggered exactly after the timeout
	 * value. It is not recommended to use very low timeout values or checker intervals.
	 * 
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Completion Timeout Expression</em>' containment reference.
	 * @see #setCompletionTimeoutExpression(ExpressionSubElementDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_CompletionTimeoutExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='completionTimeoutExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpressionSubElementDefinition getCompletionTimeoutExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getCompletionTimeoutExpression <em>Completion Timeout Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Timeout Expression</em>' containment reference.
	 * @see #getCompletionTimeoutExpression()
	 * @generated
	 */
	void setCompletionTimeoutExpression(ExpressionSubElementDefinition value);

	/**
	 * Returns the value of the '<em><b>Completion Size Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Number of messages aggregated before the aggregation is complete. This option can be set as either a fixed value or
	 * using an Expression which allows you to evaluate a size dynamically - will use Integer as result. If both are set Camel
	 * will fallback to use the fixed value if the Expression result was null or 0.
	 * 
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Completion Size Expression</em>' containment reference.
	 * @see #setCompletionSizeExpression(ExpressionSubElementDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_CompletionSizeExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='completionSizeExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpressionSubElementDefinition getCompletionSizeExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getCompletionSizeExpression <em>Completion Size Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Size Expression</em>' containment reference.
	 * @see #getCompletionSizeExpression()
	 * @generated
	 */
	void setCompletionSizeExpression(ExpressionSubElementDefinition value);

	/**
	 * Returns the value of the '<em><b>Optimistic Lock Retry Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To configure optimistic locking
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Optimistic Lock Retry Policy</em>' containment reference.
	 * @see #setOptimisticLockRetryPolicy(OptimisticLockRetryPolicyDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_OptimisticLockRetryPolicy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='optimisticLockRetryPolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	OptimisticLockRetryPolicyDefinition getOptimisticLockRetryPolicy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getOptimisticLockRetryPolicy <em>Optimistic Lock Retry Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimistic Lock Retry Policy</em>' containment reference.
	 * @see #getOptimisticLockRetryPolicy()
	 * @generated
	 */
	void setOptimisticLockRetryPolicy(OptimisticLockRetryPolicyDefinition value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:9'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Aggregate</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.AggregateDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Aggregates many messages into a single message
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregate</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Aggregate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='aggregate' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<AggregateDefinition> getAggregate();

	/**
	 * Returns the value of the '<em><b>Bean</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.BeanDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Calls a Java bean
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bean</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Bean()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bean' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<BeanDefinition> getBean();

	/**
	 * Returns the value of the '<em><b>Do Catch</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.CatchDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Catches exceptions as part of a try, catch, finally block
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Do Catch</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_DoCatch()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doCatch' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<CatchDefinition> getDoCatch();

	/**
	 * Returns the value of the '<em><b>Choice</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ChoiceDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Route messages based on a series of predicates
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Choice</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Choice()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='choice' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<ChoiceDefinition> getChoice();

	/**
	 * Returns the value of the '<em><b>Circuit Breaker</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.CircuitBreakerDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Route messages in a fault tolerance way using Circuit Breaker
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Circuit Breaker</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_CircuitBreaker()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='circuitBreaker' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<CircuitBreakerDefinition> getCircuitBreaker();

	/**
	 * Returns the value of the '<em><b>Claim Check</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ClaimCheckDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The Claim Check EIP allows you to replace message content with a claim check (a unique key), which can be used to
	 * retrieve the message content at a later time.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim Check</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_ClaimCheck()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='claimCheck' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<ClaimCheckDefinition> getClaimCheck();

	/**
	 * Returns the value of the '<em><b>Convert Body To</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ConvertBodyDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Converts the message body to another type
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Convert Body To</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_ConvertBodyTo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='convertBodyTo' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<ConvertBodyDefinition> getConvertBodyTo();

	/**
	 * Returns the value of the '<em><b>Convert Header To</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ConvertHeaderDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Converts the message header to another type
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Convert Header To</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_ConvertHeaderTo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='convertHeaderTo' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<ConvertHeaderDefinition> getConvertHeaderTo();

	/**
	 * Returns the value of the '<em><b>Convert Variable To</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ConvertVariableDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Converts the variable to another type
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Convert Variable To</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_ConvertVariableTo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='convertVariableTo' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<ConvertVariableDefinition> getConvertVariableTo();

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.DelayDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Delays processing for a specified length of time
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delay</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Delay()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='delay' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<DelayDefinition> getDelay();

	/**
	 * Returns the value of the '<em><b>Dynamic Router</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.DynamicRouterDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Route messages based on dynamic rules
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamic Router</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_DynamicRouter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dynamicRouter' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<DynamicRouterDefinition> getDynamicRouter();

	/**
	 * Returns the value of the '<em><b>Enrich</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.EnrichDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Enriches a message with data from a secondary resource
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enrich</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Enrich()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='enrich' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<EnrichDefinition> getEnrich();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.FilterDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Filter out messages based using a predicate
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Filter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<FilterDefinition> getFilter();

	/**
	 * Returns the value of the '<em><b>Do Finally</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.FinallyDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Path traversed when a try, catch, finally block exits
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Do Finally</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_DoFinally()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doFinally' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<FinallyDefinition> getDoFinally();

	/**
	 * Returns the value of the '<em><b>Idempotent Consumer</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.IdempotentConsumerDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Filters out duplicate messages
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Idempotent Consumer</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_IdempotentConsumer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='idempotentConsumer' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<IdempotentConsumerDefinition> getIdempotentConsumer();

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Intercept()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='intercept' namespace='##targetNamespace' group='#group:9'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_InterceptFrom()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interceptFrom' namespace='##targetNamespace' group='#group:9'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_InterceptSendToEndpoint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interceptSendToEndpoint' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<InterceptSendToEndpointDefinition> getInterceptSendToEndpoint();

	/**
	 * Returns the value of the '<em><b>Kamelet</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.KameletDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To call Kamelets in special situations
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kamelet</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Kamelet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='kamelet' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<KameletDefinition> getKamelet();

	/**
	 * Returns the value of the '<em><b>Load Balance</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.LoadBalanceDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Balances message processing among a number of nodes
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Balance</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_LoadBalance()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='loadBalance' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<LoadBalanceDefinition> getLoadBalance();

	/**
	 * Returns the value of the '<em><b>Log</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.LogDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Used for printing custom messages to the logger.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Log()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='log' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<LogDefinition> getLog();

	/**
	 * Returns the value of the '<em><b>Loop</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.LoopDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Processes a message multiple times
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loop</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Loop()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='loop' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<LoopDefinition> getLoop();

	/**
	 * Returns the value of the '<em><b>Marshal</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.MarshalDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshals data into a specified format for transmission over a transport or component
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Marshal</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Marshal()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='marshal' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<MarshalDefinition> getMarshal();

	/**
	 * Returns the value of the '<em><b>Multicast</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.MulticastDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Routes the same message to multiple paths either sequentially or in parallel.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multicast</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Multicast()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='multicast' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<MulticastDefinition> getMulticast();

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_OnCompletion()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='onCompletion' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<OnCompletionDefinition> getOnCompletion();

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_OnException()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='onException' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<OnExceptionDefinition> getOnException();

	/**
	 * Returns the value of the '<em><b>Pausable</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.PausableDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Pausable EIP to support resuming processing from last known offset.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pausable</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Pausable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pausable' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<PausableDefinition> getPausable();

	/**
	 * Returns the value of the '<em><b>Pipeline</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.PipelineDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Routes the message to a sequence of processors.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pipeline</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Pipeline()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pipeline' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<PipelineDefinition> getPipeline();

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.PolicyDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Defines a policy the route will use
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Policy()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='policy' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<PolicyDefinition> getPolicy();

	/**
	 * Returns the value of the '<em><b>Poll</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.PollDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Polls a message from a static endpoint
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Poll</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Poll()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='poll' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<PollDefinition> getPoll();

	/**
	 * Returns the value of the '<em><b>Poll Enrich</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.PollEnrichDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Enriches messages with data polled from a secondary resource
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Poll Enrich</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_PollEnrich()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pollEnrich' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<PollEnrichDefinition> getPollEnrich();

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ProcessDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Calls a Camel processor
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Process()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='process' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<ProcessDefinition> getProcess();

	/**
	 * Returns the value of the '<em><b>Recipient List</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Route messages to a number of dynamically specified recipients
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recipient List</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_RecipientList()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='recipientList' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<RecipientListDefinition> getRecipientList();

	/**
	 * Returns the value of the '<em><b>Remove Header</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RemoveHeaderDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Removes a named header from the message
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remove Header</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_RemoveHeader()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeHeader' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<RemoveHeaderDefinition> getRemoveHeader();

	/**
	 * Returns the value of the '<em><b>Remove Headers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RemoveHeadersDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Removes message headers whose name matches a specified pattern
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remove Headers</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_RemoveHeaders()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeHeaders' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<RemoveHeadersDefinition> getRemoveHeaders();

	/**
	 * Returns the value of the '<em><b>Remove Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RemovePropertiesDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Removes message exchange properties whose name matches a specified pattern
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remove Properties</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_RemoveProperties()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeProperties' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<RemovePropertiesDefinition> getRemoveProperties();

	/**
	 * Returns the value of the '<em><b>Remove Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RemovePropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Removes a named property from the message exchange
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remove Property</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_RemoveProperty()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeProperty' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<RemovePropertyDefinition> getRemoveProperty();

	/**
	 * Returns the value of the '<em><b>Remove Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RemoveVariableDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Removes a named variable
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remove Variable</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_RemoveVariable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeVariable' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<RemoveVariableDefinition> getRemoveVariable();

	/**
	 * Returns the value of the '<em><b>Resequence</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ResequenceDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Resequences (re-order) messages based on an expression
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resequence</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Resequence()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resequence' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<ResequenceDefinition> getResequence();

	/**
	 * Returns the value of the '<em><b>Resumable</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ResumableDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Resume EIP to support resuming processing from last known offset.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resumable</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Resumable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resumable' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<ResumableDefinition> getResumable();

	/**
	 * Returns the value of the '<em><b>Rollback</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RollbackDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Forces a rollback by stopping routing the message
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rollback</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Rollback()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rollback' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<RollbackDefinition> getRollback();

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Route()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='route' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<RouteDefinition> getRoute();

	/**
	 * Returns the value of the '<em><b>Routing Slip</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RoutingSlipDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Routes a message through a series of steps that are pre-determined (the slip)
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Routing Slip</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_RoutingSlip()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='routingSlip' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<RoutingSlipDefinition> getRoutingSlip();

	/**
	 * Returns the value of the '<em><b>Saga</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.SagaDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Enables Sagas on the route
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Saga</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Saga()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='saga' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<SagaDefinition> getSaga();

	/**
	 * Returns the value of the '<em><b>Sample</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.SamplingDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Extract a sample of the messages passing through a route
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sample</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Sample()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sample' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<SamplingDefinition> getSample();

	/**
	 * Returns the value of the '<em><b>Script</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ScriptDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Executes a script from a language which does not change the message body.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Script</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Script()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='script' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<ScriptDefinition> getScript();

	/**
	 * Returns the value of the '<em><b>Set Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.SetBodyDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the contents of the message body
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set Body</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_SetBody()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setBody' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<SetBodyDefinition> getSetBody();

	/**
	 * Returns the value of the '<em><b>Set Exchange Pattern</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.SetExchangePatternDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the exchange pattern on the message exchange
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set Exchange Pattern</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_SetExchangePattern()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setExchangePattern' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<SetExchangePatternDefinition> getSetExchangePattern();

	/**
	 * Returns the value of the '<em><b>Set Header</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.SetHeaderDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the value of a message header
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set Header</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_SetHeader()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setHeader' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<SetHeaderDefinition> getSetHeader();

	/**
	 * Returns the value of the '<em><b>Set Headers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.SetHeadersDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Allows setting multiple headers on the message at the same time.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set Headers</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_SetHeaders()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setHeaders' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<SetHeadersDefinition> getSetHeaders();

	/**
	 * Returns the value of the '<em><b>Set Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.SetPropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets a named property on the message exchange
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set Property</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_SetProperty()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setProperty' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<SetPropertyDefinition> getSetProperty();

	/**
	 * Returns the value of the '<em><b>Set Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.SetVariableDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the value of a variable
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set Variable</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_SetVariable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setVariable' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<SetVariableDefinition> getSetVariable();

	/**
	 * Returns the value of the '<em><b>Set Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.SetVariablesDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Allows setting multiple variables at the same time.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set Variables</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_SetVariables()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setVariables' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<SetVariablesDefinition> getSetVariables();

	/**
	 * Returns the value of the '<em><b>Sort</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.SortDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sorts the contents of the message
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sort</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Sort()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sort' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<SortDefinition> getSort();

	/**
	 * Returns the value of the '<em><b>Split</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.SplitDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Splits a single message into many sub-messages.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Split</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Split()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='split' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<SplitDefinition> getSplit();

	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.StepDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Routes the message to a sequence of processors which is grouped together as one logical name
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Step()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='step' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<StepDefinition> getStep();

	/**
	 * Returns the value of the '<em><b>Stop</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.StopDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Stops the processing of the current message
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stop</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Stop()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stop' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<StopDefinition> getStop();

	/**
	 * Returns the value of the '<em><b>Threads</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ThreadsDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Specifies that all steps after this node are processed asynchronously
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Threads</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Threads()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='threads' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<ThreadsDefinition> getThreads();

	/**
	 * Returns the value of the '<em><b>Throttle</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ThrottleDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Controls the rate at which messages are passed to the next node in the route
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Throttle</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Throttle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='throttle' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<ThrottleDefinition> getThrottle();

	/**
	 * Returns the value of the '<em><b>Throw Exception</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ThrowExceptionDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Throws an exception
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Throw Exception</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_ThrowException()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='throwException' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<ThrowExceptionDefinition> getThrowException();

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ToDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sends the message to a static endpoint
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_To()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='to' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<ToDefinition> getTo();

	/**
	 * Returns the value of the '<em><b>To D</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ToDynamicDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sends the message to a dynamic endpoint
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To D</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_ToD()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='toD' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<ToDynamicDefinition> getToD();

	/**
	 * Returns the value of the '<em><b>Tokenizer</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.TokenizerDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Represents a Camel tokenizer for AI.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tokenizer</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Tokenizer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tokenizer' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<TokenizerDefinition> getTokenizer();

	/**
	 * Returns the value of the '<em><b>Transacted</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.TransactedDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Enables transaction on the route
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transacted</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Transacted()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transacted' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<TransactedDefinition> getTransacted();

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.TransformDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Transforms the message body based on an expression
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transform</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Transform()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transform' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<TransformDefinition> getTransform();

	/**
	 * Returns the value of the '<em><b>Do Try</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.TryDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marks the beginning of a try, catch, finally block
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Do Try</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_DoTry()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doTry' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<TryDefinition> getDoTry();

	/**
	 * Returns the value of the '<em><b>Unmarshal</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.UnmarshalDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Converts the message data received from the wire into a format that Apache Camel processors can consume
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unmarshal</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Unmarshal()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unmarshal' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<UnmarshalDefinition> getUnmarshal();

	/**
	 * Returns the value of the '<em><b>Validate</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ValidateDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Validates a message based on an expression
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validate</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_Validate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='validate' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<ValidateDefinition> getValidate();

	/**
	 * Returns the value of the '<em><b>Wire Tap</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.WireTapDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Routes a copy of a message (or creates a new message) to a secondary destination while continue routing the original
	 * message.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wire Tap</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_WireTap()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='wireTap' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<WireTapDefinition> getWireTap();

	/**
	 * Returns the value of the '<em><b>Service Call</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ServiceCallDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: To call remote services
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Call</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_ServiceCall()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='serviceCall' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<ServiceCallDefinition> getServiceCall();

	/**
	 * Returns the value of the '<em><b>Aggregate Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a org.apache.camel.processor.aggregate.AggregateController to allow external sources to control this aggregator.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregate Controller</em>' attribute.
	 * @see #setAggregateController(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_AggregateController()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='aggregateController'"
	 * @generated
	 */
	String getAggregateController();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getAggregateController <em>Aggregate Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Controller</em>' attribute.
	 * @see #getAggregateController()
	 * @generated
	 */
	void setAggregateController(String value);

	/**
	 * Returns the value of the '<em><b>Aggregation Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The AggregationRepository to use. Sets the custom aggregate repository to use. Will by default use
	 * org.apache.camel.processor.aggregate.MemoryAggregationRepository.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregation Repository</em>' attribute.
	 * @see #setAggregationRepository(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_AggregationRepository()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='aggregationRepository'"
	 * @generated
	 */
	String getAggregationRepository();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getAggregationRepository <em>Aggregation Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Repository</em>' attribute.
	 * @see #getAggregationRepository()
	 * @generated
	 */
	void setAggregationRepository(String value);

	/**
	 * Returns the value of the '<em><b>Aggregation Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The AggregationStrategy to use. For example to lookup a bean with the name foo, the value is simply just #bean:foo.
	 * Configuring an AggregationStrategy is required, and is used to merge the incoming Exchange with the existing already
	 * merged exchanges. At first call the oldExchange parameter is null. On subsequent invocations the oldExchange contains
	 * the merged exchanges and newExchange is of course the new incoming Exchange.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregation Strategy</em>' attribute.
	 * @see #setAggregationStrategy(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_AggregationStrategy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='aggregationStrategy'"
	 * @generated
	 */
	String getAggregationStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getAggregationStrategy <em>Aggregation Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Strategy</em>' attribute.
	 * @see #getAggregationStrategy()
	 * @generated
	 */
	void setAggregationStrategy(String value);

	/**
	 * Returns the value of the '<em><b>Aggregation Strategy Method Allow Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If this option is false then the aggregate method is not used for the very first aggregation. If this option is true
	 * then null values is used as the oldExchange (at the very first aggregation), when using beans as the
	 * AggregationStrategy. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregation Strategy Method Allow Null</em>' attribute.
	 * @see #setAggregationStrategyMethodAllowNull(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_AggregationStrategyMethodAllowNull()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='aggregationStrategyMethodAllowNull'"
	 * @generated
	 */
	String getAggregationStrategyMethodAllowNull();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getAggregationStrategyMethodAllowNull <em>Aggregation Strategy Method Allow Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Strategy Method Allow Null</em>' attribute.
	 * @see #getAggregationStrategyMethodAllowNull()
	 * @generated
	 */
	void setAggregationStrategyMethodAllowNull(String value);

	/**
	 * Returns the value of the '<em><b>Aggregation Strategy Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * This option can be used to explicit declare the method name to use, when using beans as the AggregationStrategy.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregation Strategy Method Name</em>' attribute.
	 * @see #setAggregationStrategyMethodName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_AggregationStrategyMethodName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='aggregationStrategyMethodName'"
	 * @generated
	 */
	String getAggregationStrategyMethodName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getAggregationStrategyMethodName <em>Aggregation Strategy Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Strategy Method Name</em>' attribute.
	 * @see #getAggregationStrategyMethodName()
	 * @generated
	 */
	void setAggregationStrategyMethodName(String value);

	/**
	 * Returns the value of the '<em><b>Close Correlation Key On Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Closes a correlation key when its complete. Any late received exchanges which has a correlation key that has been
	 * closed, it will be defined and a ClosedCorrelationKeyException is thrown.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Close Correlation Key On Completion</em>' attribute.
	 * @see #setCloseCorrelationKeyOnCompletion(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_CloseCorrelationKeyOnCompletion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='closeCorrelationKeyOnCompletion'"
	 * @generated
	 */
	String getCloseCorrelationKeyOnCompletion();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getCloseCorrelationKeyOnCompletion <em>Close Correlation Key On Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Close Correlation Key On Completion</em>' attribute.
	 * @see #getCloseCorrelationKeyOnCompletion()
	 * @generated
	 */
	void setCloseCorrelationKeyOnCompletion(String value);

	/**
	 * Returns the value of the '<em><b>Complete All On Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Indicates to wait to complete all current and partial (pending) aggregated exchanges when the context is stopped. This
	 * also means that we will wait for all pending exchanges which are stored in the aggregation repository to complete so the
	 * repository is empty before we can stop. You may want to enable this when using the memory based aggregation repository
	 * that is memory based only, and do not store data on disk. When this option is enabled, then the aggregator is waiting to
	 * complete all those exchanges before its stopped, when stopping CamelContext or the route using it. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Complete All On Stop</em>' attribute.
	 * @see #setCompleteAllOnStop(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_CompleteAllOnStop()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='completeAllOnStop'"
	 * @generated
	 */
	String getCompleteAllOnStop();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getCompleteAllOnStop <em>Complete All On Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complete All On Stop</em>' attribute.
	 * @see #getCompleteAllOnStop()
	 * @generated
	 */
	void setCompleteAllOnStop(String value);

	/**
	 * Returns the value of the '<em><b>Completion From Batch Consumer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Enables the batch completion mode where we aggregate from a org.apache.camel.BatchConsumer and aggregate the total
	 * number of exchanges the org.apache.camel.BatchConsumer has reported as total by checking the exchange property
	 * org.apache.camel.Exchange#BATCH_COMPLETE when its complete. This option cannot be used together with
	 * discardOnAggregationFailure. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Completion From Batch Consumer</em>' attribute.
	 * @see #setCompletionFromBatchConsumer(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_CompletionFromBatchConsumer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='completionFromBatchConsumer'"
	 * @generated
	 */
	String getCompletionFromBatchConsumer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getCompletionFromBatchConsumer <em>Completion From Batch Consumer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion From Batch Consumer</em>' attribute.
	 * @see #getCompletionFromBatchConsumer()
	 * @generated
	 */
	void setCompletionFromBatchConsumer(String value);

	/**
	 * Returns the value of the '<em><b>Completion Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A repeating period in millis by which the aggregator will complete all current aggregated exchanges. Camel has a
	 * background task which is triggered every period. You cannot use this option together with completionTimeout, only one of
	 * them can be used.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Completion Interval</em>' attribute.
	 * @see #setCompletionInterval(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_CompletionInterval()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='completionInterval'"
	 * @generated
	 */
	String getCompletionInterval();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getCompletionInterval <em>Completion Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Interval</em>' attribute.
	 * @see #getCompletionInterval()
	 * @generated
	 */
	void setCompletionInterval(String value);

	/**
	 * Returns the value of the '<em><b>Completion On New Correlation Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Enables completion on all previous groups when a new incoming correlation group. This can for example be used to
	 * complete groups with same correlation keys when they are in consecutive order. Notice when this is enabled then only 1
	 * correlation group can be in progress as when a new correlation group starts, then the previous groups is forced
	 * completed. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Completion On New Correlation Group</em>' attribute.
	 * @see #setCompletionOnNewCorrelationGroup(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_CompletionOnNewCorrelationGroup()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='completionOnNewCorrelationGroup'"
	 * @generated
	 */
	String getCompletionOnNewCorrelationGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getCompletionOnNewCorrelationGroup <em>Completion On New Correlation Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion On New Correlation Group</em>' attribute.
	 * @see #getCompletionOnNewCorrelationGroup()
	 * @generated
	 */
	void setCompletionOnNewCorrelationGroup(String value);

	/**
	 * Returns the value of the '<em><b>Completion Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Number of messages aggregated before the aggregation is complete. This option can be set as either a fixed value or
	 * using an Expression which allows you to evaluate a size dynamically - will use Integer as result. If both are set Camel
	 * will fallback to use the fixed value if the Expression result was null or 0.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Completion Size</em>' attribute.
	 * @see #setCompletionSize(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_CompletionSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='completionSize'"
	 * @generated
	 */
	String getCompletionSize();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getCompletionSize <em>Completion Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Size</em>' attribute.
	 * @see #getCompletionSize()
	 * @generated
	 */
	void setCompletionSize(String value);

	/**
	 * Returns the value of the '<em><b>Completion Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Time in millis that an aggregated exchange should be inactive before its complete (timeout). This option can be set as
	 * either a fixed value or using an Expression which allows you to evaluate a timeout dynamically - will use Long as
	 * result. If both are set Camel will fallback to use the fixed value if the Expression result was null or 0. You cannot
	 * use this option together with completionInterval, only one of the two can be used. By default the timeout checker runs
	 * every second, you can use the completionTimeoutCheckerInterval option to configure how frequently to run the checker.
	 * The timeout is an approximation and there is no guarantee that the a timeout is triggered exactly after the timeout
	 * value. It is not recommended to use very low timeout values or checker intervals.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Completion Timeout</em>' attribute.
	 * @see #setCompletionTimeout(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_CompletionTimeout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='completionTimeout'"
	 * @generated
	 */
	String getCompletionTimeout();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getCompletionTimeout <em>Completion Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Timeout</em>' attribute.
	 * @see #getCompletionTimeout()
	 * @generated
	 */
	void setCompletionTimeout(String value);

	/**
	 * Returns the value of the '<em><b>Completion Timeout Checker Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Interval in millis that is used by the background task that checks for timeouts ( org.apache.camel.TimeoutMap ). By
	 * default the timeout checker runs every second. The timeout is an approximation and there is no guarantee that the a
	 * timeout is triggered exactly after the timeout value. It is not recommended to use very low timeout values or checker
	 * intervals. Default value: 1000
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Completion Timeout Checker Interval</em>' attribute.
	 * @see #setCompletionTimeoutCheckerInterval(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_CompletionTimeoutCheckerInterval()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='completionTimeoutCheckerInterval'"
	 * @generated
	 */
	String getCompletionTimeoutCheckerInterval();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getCompletionTimeoutCheckerInterval <em>Completion Timeout Checker Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Timeout Checker Interval</em>' attribute.
	 * @see #getCompletionTimeoutCheckerInterval()
	 * @generated
	 */
	void setCompletionTimeoutCheckerInterval(String value);

	/**
	 * Returns the value of the '<em><b>Discard On Aggregation Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Discards the aggregated message when aggregation failed (an exception was thrown from AggregationStrategy . This means
	 * the partly aggregated message is dropped and not sent out of the aggregator. This option cannot be used together with
	 * completionFromBatchConsumer. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Discard On Aggregation Failure</em>' attribute.
	 * @see #setDiscardOnAggregationFailure(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_DiscardOnAggregationFailure()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='discardOnAggregationFailure'"
	 * @generated
	 */
	String getDiscardOnAggregationFailure();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getDiscardOnAggregationFailure <em>Discard On Aggregation Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discard On Aggregation Failure</em>' attribute.
	 * @see #getDiscardOnAggregationFailure()
	 * @generated
	 */
	void setDiscardOnAggregationFailure(String value);

	/**
	 * Returns the value of the '<em><b>Discard On Completion Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Discards the aggregated message on completion timeout. This means on timeout the aggregated message is dropped and not
	 * sent out of the aggregator. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Discard On Completion Timeout</em>' attribute.
	 * @see #setDiscardOnCompletionTimeout(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_DiscardOnCompletionTimeout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='discardOnCompletionTimeout'"
	 * @generated
	 */
	String getDiscardOnCompletionTimeout();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getDiscardOnCompletionTimeout <em>Discard On Completion Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discard On Completion Timeout</em>' attribute.
	 * @see #getDiscardOnCompletionTimeout()
	 * @generated
	 */
	void setDiscardOnCompletionTimeout(String value);

	/**
	 * Returns the value of the '<em><b>Eager Check Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Use eager completion checking which means that the completionPredicate will use the incoming Exchange. As opposed to
	 * without eager completion checking the completionPredicate will use the aggregated Exchange. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eager Check Completion</em>' attribute.
	 * @see #setEagerCheckCompletion(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_EagerCheckCompletion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='eagerCheckCompletion'"
	 * @generated
	 */
	String getEagerCheckCompletion();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getEagerCheckCompletion <em>Eager Check Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eager Check Completion</em>' attribute.
	 * @see #getEagerCheckCompletion()
	 * @generated
	 */
	void setEagerCheckCompletion(String value);

	/**
	 * Returns the value of the '<em><b>Executor Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If using parallelProcessing you can specify a custom thread pool to be used. In fact also if you are not using
	 * parallelProcessing this custom thread pool is used to send out aggregated exchanges as well.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Executor Service</em>' attribute.
	 * @see #setExecutorService(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_ExecutorService()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='executorService'"
	 * @generated
	 */
	String getExecutorService();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getExecutorService <em>Executor Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor Service</em>' attribute.
	 * @see #getExecutorService()
	 * @generated
	 */
	void setExecutorService(String value);

	/**
	 * Returns the value of the '<em><b>Force Completion On Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Indicates to complete all current aggregated exchanges when the context is stopped. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Force Completion On Stop</em>' attribute.
	 * @see #setForceCompletionOnStop(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_ForceCompletionOnStop()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='forceCompletionOnStop'"
	 * @generated
	 */
	String getForceCompletionOnStop();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getForceCompletionOnStop <em>Force Completion On Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force Completion On Stop</em>' attribute.
	 * @see #getForceCompletionOnStop()
	 * @generated
	 */
	void setForceCompletionOnStop(String value);

	/**
	 * Returns the value of the '<em><b>Ignore Invalid Correlation Keys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If a correlation key cannot be successfully evaluated it will be ignored by logging a DEBUG and then just ignore the
	 * incoming Exchange. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ignore Invalid Correlation Keys</em>' attribute.
	 * @see #setIgnoreInvalidCorrelationKeys(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_IgnoreInvalidCorrelationKeys()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ignoreInvalidCorrelationKeys'"
	 * @generated
	 */
	String getIgnoreInvalidCorrelationKeys();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getIgnoreInvalidCorrelationKeys <em>Ignore Invalid Correlation Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Invalid Correlation Keys</em>' attribute.
	 * @see #getIgnoreInvalidCorrelationKeys()
	 * @generated
	 */
	void setIgnoreInvalidCorrelationKeys(String value);

	/**
	 * Returns the value of the '<em><b>Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Turns on using optimistic locking, which requires the aggregationRepository being used, is supporting this by
	 * implementing org.apache.camel.spi.OptimisticLockingAggregationRepository . Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Optimistic Locking</em>' attribute.
	 * @see #setOptimisticLocking(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_OptimisticLocking()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='optimisticLocking'"
	 * @generated
	 */
	String getOptimisticLocking();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getOptimisticLocking <em>Optimistic Locking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimistic Locking</em>' attribute.
	 * @see #getOptimisticLocking()
	 * @generated
	 */
	void setOptimisticLocking(String value);

	/**
	 * Returns the value of the '<em><b>Parallel Processing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * When aggregated are completed they are being send out of the aggregator. This option indicates whether or not Camel
	 * should use a thread pool with multiple threads for concurrency. If no custom thread pool has been specified then Camel
	 * creates a default pool with 10 concurrent threads. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parallel Processing</em>' attribute.
	 * @see #setParallelProcessing(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_ParallelProcessing()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='parallelProcessing'"
	 * @generated
	 */
	String getParallelProcessing();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getParallelProcessing <em>Parallel Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallel Processing</em>' attribute.
	 * @see #getParallelProcessing()
	 * @generated
	 */
	void setParallelProcessing(String value);

	/**
	 * Returns the value of the '<em><b>Timeout Checker Executor Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If using either of the completionTimeout, completionTimeoutExpression, or completionInterval options a background thread
	 * is created to check for the completion for every aggregator. Set this option to provide a custom thread pool to be used
	 * rather than creating a new thread for every aggregator.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeout Checker Executor Service</em>' attribute.
	 * @see #setTimeoutCheckerExecutorService(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAggregateDefinition_TimeoutCheckerExecutorService()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='timeoutCheckerExecutorService'"
	 * @generated
	 */
	String getTimeoutCheckerExecutorService();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition#getTimeoutCheckerExecutorService <em>Timeout Checker Executor Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout Checker Executor Service</em>' attribute.
	 * @see #getTimeoutCheckerExecutorService()
	 * @generated
	 */
	void setTimeoutCheckerExecutorService(String value);

} // AggregateDefinition
