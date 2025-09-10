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
 * A representation of the model object '<em><b>Route Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getRouteProperty <em>Route Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getErrorHandler <em>Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getInputType <em>Input Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getOutputType <em>Output Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getBean <em>Bean</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getDoCatch <em>Do Catch</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getCircuitBreaker <em>Circuit Breaker</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getClaimCheck <em>Claim Check</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getConvertBodyTo <em>Convert Body To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getConvertHeaderTo <em>Convert Header To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getConvertVariableTo <em>Convert Variable To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getDynamicRouter <em>Dynamic Router</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getEnrich <em>Enrich</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getDoFinally <em>Do Finally</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getIdempotentConsumer <em>Idempotent Consumer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getInterceptSendToEndpoint <em>Intercept Send To Endpoint</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getKamelet <em>Kamelet</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getLog <em>Log</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getMarshal <em>Marshal</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getPausable <em>Pausable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getPoll <em>Poll</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getPollEnrich <em>Poll Enrich</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getProcess <em>Process</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getRecipientList <em>Recipient List</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getRemoveHeader <em>Remove Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getRemoveHeaders <em>Remove Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getRemoveProperties <em>Remove Properties</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getRemoveProperty <em>Remove Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getRemoveVariable <em>Remove Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getResequence <em>Resequence</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getResumable <em>Resumable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getRoute <em>Route</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getRoutingSlip <em>Routing Slip</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getSaga <em>Saga</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getSample <em>Sample</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getScript <em>Script</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getSetBody <em>Set Body</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getSetExchangePattern <em>Set Exchange Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getSetHeaders <em>Set Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getSetProperty <em>Set Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getSetVariable <em>Set Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getSetVariables <em>Set Variables</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getSort <em>Sort</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getSplit <em>Split</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getStep <em>Step</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getStop <em>Stop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getThrottle <em>Throttle</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getToD <em>To D</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getTokenizer <em>Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getDoTry <em>Do Try</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getUnmarshal <em>Unmarshal</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getWireTap <em>Wire Tap</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getServiceCall <em>Service Call</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getAutoStartup <em>Auto Startup</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getDelayer <em>Delayer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getErrorHandlerRef <em>Error Handler Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#isKamelet1 <em>Kamelet1</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getLogMask <em>Log Mask</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getMessageHistory <em>Message History</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getNodePrefixId <em>Node Prefix Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#isRest <em>Rest</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getRouteConfigurationId <em>Route Configuration Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getRoutePolicyRef <em>Route Policy Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getShutdownRoute <em>Shutdown Route</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getShutdownRunningTask <em>Shutdown Running Task</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getStartupOrder <em>Startup Order</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getStreamCache <em>Stream Cache</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#isTemplate <em>Template</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getTrace <em>Trace</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition()
 * @model extendedMetaData="name='routeDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RouteDefinition extends Output {
	/**
	 * Returns the value of the '<em><b>Route Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.PropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Property</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_RouteProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='routeProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PropertyDefinition> getRouteProperty();

	/**
	 * Returns the value of the '<em><b>Error Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Camel error handling.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Handler</em>' containment reference.
	 * @see #isSetErrorHandler()
	 * @see #unsetErrorHandler()
	 * @see #setErrorHandler(EObject)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_ErrorHandler()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='errorHandler' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getErrorHandler();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getErrorHandler <em>Error Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Handler</em>' containment reference.
	 * @see #isSetErrorHandler()
	 * @see #unsetErrorHandler()
	 * @see #getErrorHandler()
	 * @generated
	 */
	void setErrorHandler(EObject value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getErrorHandler <em>Error Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetErrorHandler()
	 * @see #getErrorHandler()
	 * @see #setErrorHandler(EObject)
	 * @generated
	 */
	void unsetErrorHandler();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getErrorHandler <em>Error Handler</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Error Handler</em>' containment reference is set.
	 * @see #unsetErrorHandler()
	 * @see #getErrorHandler()
	 * @see #setErrorHandler(EObject)
	 * @generated
	 */
	boolean isSetErrorHandler();

	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Act as a message source as input to a route
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(FromDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_From()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='from' namespace='##targetNamespace'"
	 * @generated
	 */
	FromDefinition getFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(FromDefinition value);

	/**
	 * Returns the value of the '<em><b>Input Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Set the expected data type of the input message. If the actual message type is different at runtime, camel look for a
	 * required Transformer and apply if exists. If validate attribute is true then camel applies Validator as well. Type name
	 * consists of two parts, 'scheme' and 'name' connected with ':'. For Java type 'name' is a fully qualified class name. For
	 * example {code java:java.lang.String} , {code json:ABCOrder} . It's also possible to specify only scheme part, so that it
	 * works like a wildcard. If only 'xml' is specified, all the XML message matches. It's handy to add only one
	 * transformer/validator for all the transformation from/to XML.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Type</em>' containment reference.
	 * @see #setInputType(InputTypeDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_InputType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inputType' namespace='##targetNamespace'"
	 * @generated
	 */
	InputTypeDefinition getInputType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getInputType <em>Input Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Type</em>' containment reference.
	 * @see #getInputType()
	 * @generated
	 */
	void setInputType(InputTypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Output Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Set the expected data type of the output message. If the actual message type is different at runtime, camel look for a
	 * required Transformer and apply if exists. If validate attribute is true then camel applies Validator as well. Type name
	 * consists of two parts, 'scheme' and 'name' connected with ':'. For Java type 'name' is a fully qualified class name. For
	 * example {code java:java.lang.String} , {code json:ABCOrder} . It's also possible to specify only scheme part, so that it
	 * works like a wildcard. If only 'xml' is specified, all the XML message matches. It's handy to add only one
	 * transformer/validator for all the XML-Java transformation.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Type</em>' containment reference.
	 * @see #setOutputType(OutputTypeDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_OutputType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outputType' namespace='##targetNamespace'"
	 * @generated
	 */
	OutputTypeDefinition getOutputType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getOutputType <em>Output Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Type</em>' containment reference.
	 * @see #getOutputType()
	 * @generated
	 */
	void setOutputType(OutputTypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Group()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Aggregate()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Bean()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_DoCatch()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Choice()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_CircuitBreaker()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_ClaimCheck()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_ConvertBodyTo()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_ConvertHeaderTo()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_ConvertVariableTo()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Delay()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_DynamicRouter()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Enrich()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Filter()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_DoFinally()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_IdempotentConsumer()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Intercept()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_InterceptFrom()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_InterceptSendToEndpoint()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Kamelet()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_LoadBalance()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Log()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Loop()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Marshal()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Multicast()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_OnCompletion()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_OnException()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Pausable()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Pipeline()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Policy()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Poll()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_PollEnrich()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Process()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_RecipientList()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_RemoveHeader()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_RemoveHeaders()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_RemoveProperties()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_RemoveProperty()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_RemoveVariable()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Resequence()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Resumable()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Rollback()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Route()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_RoutingSlip()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Saga()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Sample()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Script()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_SetBody()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_SetExchangePattern()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_SetHeader()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_SetHeaders()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_SetProperty()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_SetVariable()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_SetVariables()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Sort()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Split()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Step()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Stop()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Threads()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Throttle()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_ThrowException()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_To()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_ToD()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Tokenizer()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Transacted()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Transform()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_DoTry()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Unmarshal()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Validate()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_WireTap()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_ServiceCall()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='serviceCall' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<ServiceCallDefinition> getServiceCall();

	/**
	 * Returns the value of the '<em><b>Auto Startup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to auto start this route. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Startup</em>' attribute.
	 * @see #setAutoStartup(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_AutoStartup()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='autoStartup'"
	 * @generated
	 */
	String getAutoStartup();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getAutoStartup <em>Auto Startup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Startup</em>' attribute.
	 * @see #getAutoStartup()
	 * @generated
	 */
	void setAutoStartup(String value);

	/**
	 * Returns the value of the '<em><b>Delayer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to slow down processing messages by a given delay in msec. Default value: advanced
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delayer</em>' attribute.
	 * @see #setDelayer(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Delayer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='delayer'"
	 * @generated
	 */
	String getDelayer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getDelayer <em>Delayer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delayer</em>' attribute.
	 * @see #getDelayer()
	 * @generated
	 */
	void setDelayer(String value);

	/**
	 * Returns the value of the '<em><b>Error Handler Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the bean ref name of the error handler builder to use on this route.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Handler Ref</em>' attribute.
	 * @see #setErrorHandlerRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_ErrorHandlerRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='errorHandlerRef'"
	 * @generated
	 */
	String getErrorHandlerRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getErrorHandlerRef <em>Error Handler Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Handler Ref</em>' attribute.
	 * @see #getErrorHandlerRef()
	 * @generated
	 */
	void setErrorHandlerRef(String value);

	/**
	 * Returns the value of the '<em><b>Group1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The group name for this route. Multiple routes can belong to the same group.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group1</em>' attribute.
	 * @see #setGroup1(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Group1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='group'"
	 * @generated
	 */
	String getGroup1();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getGroup1 <em>Group1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group1</em>' attribute.
	 * @see #getGroup1()
	 * @generated
	 */
	void setGroup1(String value);

	/**
	 * Returns the value of the '<em><b>Kamelet1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kamelet1</em>' attribute.
	 * @see #isSetKamelet1()
	 * @see #unsetKamelet1()
	 * @see #setKamelet1(boolean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Kamelet1()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='kamelet'"
	 * @generated
	 */
	boolean isKamelet1();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#isKamelet1 <em>Kamelet1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kamelet1</em>' attribute.
	 * @see #isSetKamelet1()
	 * @see #unsetKamelet1()
	 * @see #isKamelet1()
	 * @generated
	 */
	void setKamelet1(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#isKamelet1 <em>Kamelet1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKamelet1()
	 * @see #isKamelet1()
	 * @see #setKamelet1(boolean)
	 * @generated
	 */
	void unsetKamelet1();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#isKamelet1 <em>Kamelet1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kamelet1</em>' attribute is set.
	 * @see #unsetKamelet1()
	 * @see #isKamelet1()
	 * @see #setKamelet1(boolean)
	 * @generated
	 */
	boolean isSetKamelet1();

	/**
	 * Returns the value of the '<em><b>Log Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether security mask for Logging is enabled on this route. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Mask</em>' attribute.
	 * @see #setLogMask(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_LogMask()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logMask'"
	 * @generated
	 */
	String getLogMask();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getLogMask <em>Log Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Mask</em>' attribute.
	 * @see #getLogMask()
	 * @generated
	 */
	void setLogMask(String value);

	/**
	 * Returns the value of the '<em><b>Message History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether message history is enabled on this route.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message History</em>' attribute.
	 * @see #setMessageHistory(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_MessageHistory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='messageHistory'"
	 * @generated
	 */
	String getMessageHistory();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getMessageHistory <em>Message History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message History</em>' attribute.
	 * @see #getMessageHistory()
	 * @generated
	 */
	void setMessageHistory(String value);

	/**
	 * Returns the value of the '<em><b>Node Prefix Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets a prefix to use for all node ids (not route id).
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node Prefix Id</em>' attribute.
	 * @see #setNodePrefixId(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_NodePrefixId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='nodePrefixId'"
	 * @generated
	 */
	String getNodePrefixId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getNodePrefixId <em>Node Prefix Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Prefix Id</em>' attribute.
	 * @see #getNodePrefixId()
	 * @generated
	 */
	void setNodePrefixId(String value);

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The predicate of the precondition in simple language to evaluate in order to determine if this route should be included
	 * or not.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precondition</em>' attribute.
	 * @see #setPrecondition(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Precondition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='precondition'"
	 * @generated
	 */
	String getPrecondition();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getPrecondition <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' attribute.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(String value);

	/**
	 * Returns the value of the '<em><b>Rest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest</em>' attribute.
	 * @see #isSetRest()
	 * @see #unsetRest()
	 * @see #setRest(boolean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Rest()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='rest'"
	 * @generated
	 */
	boolean isRest();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#isRest <em>Rest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest</em>' attribute.
	 * @see #isSetRest()
	 * @see #unsetRest()
	 * @see #isRest()
	 * @generated
	 */
	void setRest(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#isRest <em>Rest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRest()
	 * @see #isRest()
	 * @see #setRest(boolean)
	 * @generated
	 */
	void unsetRest();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#isRest <em>Rest</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rest</em>' attribute is set.
	 * @see #unsetRest()
	 * @see #isRest()
	 * @see #setRest(boolean)
	 * @generated
	 */
	boolean isSetRest();

	/**
	 * Returns the value of the '<em><b>Route Configuration Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The route configuration id or pattern this route should use for configuration. Multiple id/pattern can be separated by
	 * comma.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Configuration Id</em>' attribute.
	 * @see #setRouteConfigurationId(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_RouteConfigurationId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='routeConfigurationId'"
	 * @generated
	 */
	String getRouteConfigurationId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getRouteConfigurationId <em>Route Configuration Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Configuration Id</em>' attribute.
	 * @see #getRouteConfigurationId()
	 * @generated
	 */
	void setRouteConfigurationId(String value);

	/**
	 * Returns the value of the '<em><b>Route Policy Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Reference to custom org.apache.camel.spi.RoutePolicy to use by the route. Multiple policies can be configured by
	 * separating values using comma.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Policy Ref</em>' attribute.
	 * @see #setRoutePolicyRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_RoutePolicyRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='routePolicyRef'"
	 * @generated
	 */
	String getRoutePolicyRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getRoutePolicyRef <em>Route Policy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Policy Ref</em>' attribute.
	 * @see #getRoutePolicyRef()
	 * @generated
	 */
	void setRoutePolicyRef(String value);

	/**
	 * Returns the value of the '<em><b>Shutdown Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To control how to shutdown the route.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shutdown Route</em>' attribute.
	 * @see #setShutdownRoute(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_ShutdownRoute()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='shutdownRoute'"
	 * @generated
	 */
	String getShutdownRoute();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getShutdownRoute <em>Shutdown Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shutdown Route</em>' attribute.
	 * @see #getShutdownRoute()
	 * @generated
	 */
	void setShutdownRoute(String value);

	/**
	 * Returns the value of the '<em><b>Shutdown Running Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To control how to shut down the route.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shutdown Running Task</em>' attribute.
	 * @see #setShutdownRunningTask(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_ShutdownRunningTask()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='shutdownRunningTask'"
	 * @generated
	 */
	String getShutdownRunningTask();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getShutdownRunningTask <em>Shutdown Running Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shutdown Running Task</em>' attribute.
	 * @see #getShutdownRunningTask()
	 * @generated
	 */
	void setShutdownRunningTask(String value);

	/**
	 * Returns the value of the '<em><b>Startup Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To configure the ordering of the routes being started.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Startup Order</em>' attribute.
	 * @see #isSetStartupOrder()
	 * @see #unsetStartupOrder()
	 * @see #setStartupOrder(int)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_StartupOrder()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='startupOrder'"
	 * @generated
	 */
	int getStartupOrder();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getStartupOrder <em>Startup Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Order</em>' attribute.
	 * @see #isSetStartupOrder()
	 * @see #unsetStartupOrder()
	 * @see #getStartupOrder()
	 * @generated
	 */
	void setStartupOrder(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getStartupOrder <em>Startup Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartupOrder()
	 * @see #getStartupOrder()
	 * @see #setStartupOrder(int)
	 * @generated
	 */
	void unsetStartupOrder();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getStartupOrder <em>Startup Order</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Startup Order</em>' attribute is set.
	 * @see #unsetStartupOrder()
	 * @see #getStartupOrder()
	 * @see #setStartupOrder(int)
	 * @generated
	 */
	boolean isSetStartupOrder();

	/**
	 * Returns the value of the '<em><b>Stream Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether stream caching is enabled on this route.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stream Cache</em>' attribute.
	 * @see #setStreamCache(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_StreamCache()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='streamCache'"
	 * @generated
	 */
	String getStreamCache();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getStreamCache <em>Stream Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stream Cache</em>' attribute.
	 * @see #getStreamCache()
	 * @generated
	 */
	void setStreamCache(String value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' attribute.
	 * @see #isSetTemplate()
	 * @see #unsetTemplate()
	 * @see #setTemplate(boolean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Template()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='template'"
	 * @generated
	 */
	boolean isTemplate();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#isTemplate <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' attribute.
	 * @see #isSetTemplate()
	 * @see #unsetTemplate()
	 * @see #isTemplate()
	 * @generated
	 */
	void setTemplate(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#isTemplate <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTemplate()
	 * @see #isTemplate()
	 * @see #setTemplate(boolean)
	 * @generated
	 */
	void unsetTemplate();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#isTemplate <em>Template</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Template</em>' attribute is set.
	 * @see #unsetTemplate()
	 * @see #isTemplate()
	 * @see #setTemplate(boolean)
	 * @generated
	 */
	boolean isSetTemplate();

	/**
	 * Returns the value of the '<em><b>Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether tracing is enabled on this route.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trace</em>' attribute.
	 * @see #setTrace(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteDefinition_Trace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='trace'"
	 * @generated
	 */
	String getTrace();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition#getTrace <em>Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace</em>' attribute.
	 * @see #getTrace()
	 * @generated
	 */
	void setTrace(String value);

} // RouteDefinition
