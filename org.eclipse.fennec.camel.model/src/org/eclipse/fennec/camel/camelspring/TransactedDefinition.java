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
 * A representation of the model object '<em><b>Transacted Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getBean <em>Bean</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getDoCatch <em>Do Catch</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getCircuitBreaker <em>Circuit Breaker</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getClaimCheck <em>Claim Check</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getConvertBodyTo <em>Convert Body To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getConvertHeaderTo <em>Convert Header To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getConvertVariableTo <em>Convert Variable To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getDynamicRouter <em>Dynamic Router</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getEnrich <em>Enrich</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getDoFinally <em>Do Finally</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getIdempotentConsumer <em>Idempotent Consumer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getInterceptSendToEndpoint <em>Intercept Send To Endpoint</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getKamelet <em>Kamelet</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getLog <em>Log</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getMarshal <em>Marshal</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getPausable <em>Pausable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getPoll <em>Poll</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getPollEnrich <em>Poll Enrich</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getProcess <em>Process</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getRecipientList <em>Recipient List</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getRemoveHeader <em>Remove Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getRemoveHeaders <em>Remove Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getRemoveProperties <em>Remove Properties</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getRemoveProperty <em>Remove Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getRemoveVariable <em>Remove Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getResequence <em>Resequence</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getResumable <em>Resumable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getRoute <em>Route</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getRoutingSlip <em>Routing Slip</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getSaga <em>Saga</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getSample <em>Sample</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getScript <em>Script</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getSetBody <em>Set Body</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getSetExchangePattern <em>Set Exchange Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getSetHeaders <em>Set Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getSetProperty <em>Set Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getSetVariable <em>Set Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getSetVariables <em>Set Variables</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getSort <em>Sort</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getSplit <em>Split</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getStep <em>Step</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getStop <em>Stop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getThrottle <em>Throttle</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getToD <em>To D</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getTokenizer <em>Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getDoTry <em>Do Try</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getUnmarshal <em>Unmarshal</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getWireTap <em>Wire Tap</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getServiceCall <em>Service Call</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition()
 * @model extendedMetaData="name='transactedDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TransactedDefinition extends Output {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Aggregate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='aggregate' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Bean()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bean' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_DoCatch()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doCatch' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Choice()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='choice' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_CircuitBreaker()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='circuitBreaker' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_ClaimCheck()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='claimCheck' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_ConvertBodyTo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='convertBodyTo' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_ConvertHeaderTo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='convertHeaderTo' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_ConvertVariableTo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='convertVariableTo' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Delay()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='delay' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_DynamicRouter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dynamicRouter' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Enrich()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='enrich' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Filter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_DoFinally()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doFinally' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_IdempotentConsumer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='idempotentConsumer' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Intercept()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='intercept' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_InterceptFrom()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interceptFrom' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_InterceptSendToEndpoint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interceptSendToEndpoint' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Kamelet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='kamelet' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_LoadBalance()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='loadBalance' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Log()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='log' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Loop()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='loop' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Marshal()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='marshal' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Multicast()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='multicast' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_OnCompletion()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='onCompletion' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_OnException()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='onException' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Pausable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pausable' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Pipeline()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pipeline' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Policy()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='policy' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Poll()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='poll' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_PollEnrich()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pollEnrich' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Process()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='process' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_RecipientList()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='recipientList' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_RemoveHeader()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeHeader' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_RemoveHeaders()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeHeaders' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_RemoveProperties()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeProperties' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_RemoveProperty()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeProperty' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_RemoveVariable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeVariable' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Resequence()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resequence' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Resumable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resumable' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Rollback()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rollback' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Route()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='route' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_RoutingSlip()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='routingSlip' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Saga()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='saga' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Sample()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sample' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Script()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='script' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_SetBody()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setBody' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_SetExchangePattern()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setExchangePattern' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_SetHeader()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setHeader' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_SetHeaders()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setHeaders' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_SetProperty()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setProperty' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_SetVariable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setVariable' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_SetVariables()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setVariables' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Sort()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sort' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Split()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='split' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Step()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='step' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Stop()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stop' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Threads()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='threads' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Throttle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='throttle' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_ThrowException()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='throwException' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_To()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='to' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_ToD()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='toD' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Tokenizer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tokenizer' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Transacted()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transacted' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Transform()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transform' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_DoTry()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doTry' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Unmarshal()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unmarshal' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Validate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='validate' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_WireTap()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='wireTap' namespace='##targetNamespace' group='#group:4'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_ServiceCall()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='serviceCall' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<ServiceCallDefinition> getServiceCall();

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets a reference to use for lookup the policy in the registry.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactedDefinition_Ref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ref'"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

} // TransactedDefinition
