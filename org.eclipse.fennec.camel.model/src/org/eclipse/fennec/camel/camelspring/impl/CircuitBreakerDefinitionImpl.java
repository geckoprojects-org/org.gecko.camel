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
import org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationDefinition;
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
import org.eclipse.fennec.camel.camelspring.OnFallbackDefinition;
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
import org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationDefinition;
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
 * An implementation of the model object '<em><b>Circuit Breaker Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getResilience4jConfiguration <em>Resilience4j Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getFaultToleranceConfiguration <em>Fault Tolerance Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getDoCatch <em>Do Catch</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getCircuitBreaker <em>Circuit Breaker</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getClaimCheck <em>Claim Check</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getConvertBodyTo <em>Convert Body To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getConvertHeaderTo <em>Convert Header To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getConvertVariableTo <em>Convert Variable To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getDynamicRouter <em>Dynamic Router</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getEnrich <em>Enrich</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getDoFinally <em>Do Finally</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getIdempotentConsumer <em>Idempotent Consumer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getInterceptSendToEndpoint <em>Intercept Send To Endpoint</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getKamelet <em>Kamelet</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getLog <em>Log</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getMarshal <em>Marshal</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getPausable <em>Pausable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getPoll <em>Poll</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getPollEnrich <em>Poll Enrich</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getRecipientList <em>Recipient List</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getRemoveHeader <em>Remove Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getRemoveHeaders <em>Remove Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getRemoveProperties <em>Remove Properties</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getRemoveProperty <em>Remove Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getRemoveVariable <em>Remove Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getResequence <em>Resequence</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getResumable <em>Resumable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getRoutingSlip <em>Routing Slip</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getSaga <em>Saga</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getSample <em>Sample</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getSetBody <em>Set Body</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getSetExchangePattern <em>Set Exchange Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getSetHeaders <em>Set Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getSetProperty <em>Set Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getSetVariable <em>Set Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getSetVariables <em>Set Variables</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getSplit <em>Split</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getThrottle <em>Throttle</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getToD <em>To D</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getTokenizer <em>Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getDoTry <em>Do Try</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getUnmarshal <em>Unmarshal</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getWireTap <em>Wire Tap</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getServiceCall <em>Service Call</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getOnFallback <em>On Fallback</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CircuitBreakerDefinitionImpl#isInheritErrorHandler <em>Inherit Error Handler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CircuitBreakerDefinitionImpl extends OutputImpl implements CircuitBreakerDefinition {
	/**
	 * The cached value of the '{@link #getResilience4jConfiguration() <em>Resilience4j Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResilience4jConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Resilience4JConfigurationDefinition resilience4jConfiguration;

	/**
	 * The cached value of the '{@link #getFaultToleranceConfiguration() <em>Fault Tolerance Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultToleranceConfiguration()
	 * @generated
	 * @ordered
	 */
	protected FaultToleranceConfigurationDefinition faultToleranceConfiguration;

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
	 * The cached value of the '{@link #getOnFallback() <em>On Fallback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnFallback()
	 * @generated
	 * @ordered
	 */
	protected OnFallbackDefinition onFallback;

	/**
	 * The default value of the '{@link #getConfiguration() <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected String configuration = CONFIGURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isInheritErrorHandler() <em>Inherit Error Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInheritErrorHandler()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INHERIT_ERROR_HANDLER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInheritErrorHandler() <em>Inherit Error Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInheritErrorHandler()
	 * @generated
	 * @ordered
	 */
	protected boolean inheritErrorHandler = INHERIT_ERROR_HANDLER_EDEFAULT;

	/**
	 * This is true if the Inherit Error Handler attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inheritErrorHandlerESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircuitBreakerDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resilience4JConfigurationDefinition getResilience4jConfiguration() {
		return resilience4jConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResilience4jConfiguration(Resilience4JConfigurationDefinition newResilience4jConfiguration, NotificationChain msgs) {
		Resilience4JConfigurationDefinition oldResilience4jConfiguration = resilience4jConfiguration;
		resilience4jConfiguration = newResilience4jConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__RESILIENCE4J_CONFIGURATION, oldResilience4jConfiguration, newResilience4jConfiguration);
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
	public void setResilience4jConfiguration(Resilience4JConfigurationDefinition newResilience4jConfiguration) {
		if (newResilience4jConfiguration != resilience4jConfiguration) {
			NotificationChain msgs = null;
			if (resilience4jConfiguration != null)
				msgs = ((InternalEObject)resilience4jConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__RESILIENCE4J_CONFIGURATION, null, msgs);
			if (newResilience4jConfiguration != null)
				msgs = ((InternalEObject)newResilience4jConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__RESILIENCE4J_CONFIGURATION, null, msgs);
			msgs = basicSetResilience4jConfiguration(newResilience4jConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__RESILIENCE4J_CONFIGURATION, newResilience4jConfiguration, newResilience4jConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FaultToleranceConfigurationDefinition getFaultToleranceConfiguration() {
		return faultToleranceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFaultToleranceConfiguration(FaultToleranceConfigurationDefinition newFaultToleranceConfiguration, NotificationChain msgs) {
		FaultToleranceConfigurationDefinition oldFaultToleranceConfiguration = faultToleranceConfiguration;
		faultToleranceConfiguration = newFaultToleranceConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__FAULT_TOLERANCE_CONFIGURATION, oldFaultToleranceConfiguration, newFaultToleranceConfiguration);
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
	public void setFaultToleranceConfiguration(FaultToleranceConfigurationDefinition newFaultToleranceConfiguration) {
		if (newFaultToleranceConfiguration != faultToleranceConfiguration) {
			NotificationChain msgs = null;
			if (faultToleranceConfiguration != null)
				msgs = ((InternalEObject)faultToleranceConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__FAULT_TOLERANCE_CONFIGURATION, null, msgs);
			if (newFaultToleranceConfiguration != null)
				msgs = ((InternalEObject)newFaultToleranceConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__FAULT_TOLERANCE_CONFIGURATION, null, msgs);
			msgs = basicSetFaultToleranceConfiguration(newFaultToleranceConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__FAULT_TOLERANCE_CONFIGURATION, newFaultToleranceConfiguration, newFaultToleranceConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__GROUP);
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
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Aggregate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BeanDefinition> getBean() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Bean());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CatchDefinition> getDoCatch() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_DoCatch());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChoiceDefinition> getChoice() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Choice());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CircuitBreakerDefinition> getCircuitBreaker() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_CircuitBreaker());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimCheckDefinition> getClaimCheck() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_ClaimCheck());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConvertBodyDefinition> getConvertBodyTo() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_ConvertBodyTo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConvertHeaderDefinition> getConvertHeaderTo() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_ConvertHeaderTo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConvertVariableDefinition> getConvertVariableTo() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_ConvertVariableTo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DelayDefinition> getDelay() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Delay());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DynamicRouterDefinition> getDynamicRouter() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_DynamicRouter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnrichDefinition> getEnrich() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Enrich());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FilterDefinition> getFilter() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Filter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinallyDefinition> getDoFinally() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_DoFinally());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IdempotentConsumerDefinition> getIdempotentConsumer() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_IdempotentConsumer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterceptDefinition> getIntercept() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Intercept());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterceptFromDefinition> getInterceptFrom() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_InterceptFrom());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterceptSendToEndpointDefinition> getInterceptSendToEndpoint() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_InterceptSendToEndpoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KameletDefinition> getKamelet() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Kamelet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LoadBalanceDefinition> getLoadBalance() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_LoadBalance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogDefinition> getLog() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Log());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LoopDefinition> getLoop() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Loop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarshalDefinition> getMarshal() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Marshal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MulticastDefinition> getMulticast() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Multicast());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OnCompletionDefinition> getOnCompletion() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_OnCompletion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OnExceptionDefinition> getOnException() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_OnException());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PausableDefinition> getPausable() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Pausable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PipelineDefinition> getPipeline() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Pipeline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PolicyDefinition> getPolicy() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Policy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PollDefinition> getPoll() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Poll());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PollEnrichDefinition> getPollEnrich() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_PollEnrich());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessDefinition> getProcess() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Process());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RecipientListDefinition> getRecipientList() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_RecipientList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemoveHeaderDefinition> getRemoveHeader() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_RemoveHeader());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemoveHeadersDefinition> getRemoveHeaders() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_RemoveHeaders());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemovePropertiesDefinition> getRemoveProperties() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_RemoveProperties());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemovePropertyDefinition> getRemoveProperty() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_RemoveProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemoveVariableDefinition> getRemoveVariable() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_RemoveVariable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResequenceDefinition> getResequence() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Resequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResumableDefinition> getResumable() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Resumable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RollbackDefinition> getRollback() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Rollback());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RouteDefinition> getRoute() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Route());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RoutingSlipDefinition> getRoutingSlip() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_RoutingSlip());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SagaDefinition> getSaga() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Saga());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SamplingDefinition> getSample() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Sample());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScriptDefinition> getScript() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Script());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetBodyDefinition> getSetBody() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_SetBody());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetExchangePatternDefinition> getSetExchangePattern() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_SetExchangePattern());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetHeaderDefinition> getSetHeader() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_SetHeader());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetHeadersDefinition> getSetHeaders() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_SetHeaders());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetPropertyDefinition> getSetProperty() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_SetProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetVariableDefinition> getSetVariable() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_SetVariable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetVariablesDefinition> getSetVariables() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_SetVariables());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SortDefinition> getSort() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Sort());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SplitDefinition> getSplit() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Split());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StepDefinition> getStep() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Step());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StopDefinition> getStop() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Stop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThreadsDefinition> getThreads() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Threads());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThrottleDefinition> getThrottle() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Throttle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThrowExceptionDefinition> getThrowException() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_ThrowException());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ToDefinition> getTo() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_To());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ToDynamicDefinition> getToD() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_ToD());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TokenizerDefinition> getTokenizer() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Tokenizer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransactedDefinition> getTransacted() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Transacted());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransformDefinition> getTransform() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Transform());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TryDefinition> getDoTry() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_DoTry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnmarshalDefinition> getUnmarshal() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Unmarshal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValidateDefinition> getValidate() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_Validate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WireTapDefinition> getWireTap() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_WireTap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceCallDefinition> getServiceCall() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCircuitBreakerDefinition_ServiceCall());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnFallbackDefinition getOnFallback() {
		return onFallback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnFallback(OnFallbackDefinition newOnFallback, NotificationChain msgs) {
		OnFallbackDefinition oldOnFallback = onFallback;
		onFallback = newOnFallback;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ON_FALLBACK, oldOnFallback, newOnFallback);
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
	public void setOnFallback(OnFallbackDefinition newOnFallback) {
		if (newOnFallback != onFallback) {
			NotificationChain msgs = null;
			if (onFallback != null)
				msgs = ((InternalEObject)onFallback).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ON_FALLBACK, null, msgs);
			if (newOnFallback != null)
				msgs = ((InternalEObject)newOnFallback).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ON_FALLBACK, null, msgs);
			msgs = basicSetOnFallback(newOnFallback, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ON_FALLBACK, newOnFallback, newOnFallback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfiguration(String newConfiguration) {
		String oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CONFIGURATION, oldConfiguration, configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInheritErrorHandler() {
		return inheritErrorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInheritErrorHandler(boolean newInheritErrorHandler) {
		boolean oldInheritErrorHandler = inheritErrorHandler;
		inheritErrorHandler = newInheritErrorHandler;
		boolean oldInheritErrorHandlerESet = inheritErrorHandlerESet;
		inheritErrorHandlerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__INHERIT_ERROR_HANDLER, oldInheritErrorHandler, inheritErrorHandler, !oldInheritErrorHandlerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetInheritErrorHandler() {
		boolean oldInheritErrorHandler = inheritErrorHandler;
		boolean oldInheritErrorHandlerESet = inheritErrorHandlerESet;
		inheritErrorHandler = INHERIT_ERROR_HANDLER_EDEFAULT;
		inheritErrorHandlerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__INHERIT_ERROR_HANDLER, oldInheritErrorHandler, INHERIT_ERROR_HANDLER_EDEFAULT, oldInheritErrorHandlerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInheritErrorHandler() {
		return inheritErrorHandlerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__RESILIENCE4J_CONFIGURATION:
				return basicSetResilience4jConfiguration(null, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__FAULT_TOLERANCE_CONFIGURATION:
				return basicSetFaultToleranceConfiguration(null, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__AGGREGATE:
				return ((InternalEList<?>)getAggregate()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__BEAN:
				return ((InternalEList<?>)getBean()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__DO_CATCH:
				return ((InternalEList<?>)getDoCatch()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CHOICE:
				return ((InternalEList<?>)getChoice()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CIRCUIT_BREAKER:
				return ((InternalEList<?>)getCircuitBreaker()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CLAIM_CHECK:
				return ((InternalEList<?>)getClaimCheck()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CONVERT_BODY_TO:
				return ((InternalEList<?>)getConvertBodyTo()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CONVERT_HEADER_TO:
				return ((InternalEList<?>)getConvertHeaderTo()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CONVERT_VARIABLE_TO:
				return ((InternalEList<?>)getConvertVariableTo()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__DELAY:
				return ((InternalEList<?>)getDelay()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__DYNAMIC_ROUTER:
				return ((InternalEList<?>)getDynamicRouter()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ENRICH:
				return ((InternalEList<?>)getEnrich()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__FILTER:
				return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__DO_FINALLY:
				return ((InternalEList<?>)getDoFinally()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__IDEMPOTENT_CONSUMER:
				return ((InternalEList<?>)getIdempotentConsumer()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__INTERCEPT:
				return ((InternalEList<?>)getIntercept()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__INTERCEPT_FROM:
				return ((InternalEList<?>)getInterceptFrom()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				return ((InternalEList<?>)getInterceptSendToEndpoint()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__KAMELET:
				return ((InternalEList<?>)getKamelet()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__LOAD_BALANCE:
				return ((InternalEList<?>)getLoadBalance()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__LOG:
				return ((InternalEList<?>)getLog()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__LOOP:
				return ((InternalEList<?>)getLoop()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__MARSHAL:
				return ((InternalEList<?>)getMarshal()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__MULTICAST:
				return ((InternalEList<?>)getMulticast()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ON_COMPLETION:
				return ((InternalEList<?>)getOnCompletion()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ON_EXCEPTION:
				return ((InternalEList<?>)getOnException()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__PAUSABLE:
				return ((InternalEList<?>)getPausable()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__PIPELINE:
				return ((InternalEList<?>)getPipeline()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__POLICY:
				return ((InternalEList<?>)getPolicy()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__POLL:
				return ((InternalEList<?>)getPoll()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__POLL_ENRICH:
				return ((InternalEList<?>)getPollEnrich()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__PROCESS:
				return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__RECIPIENT_LIST:
				return ((InternalEList<?>)getRecipientList()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__REMOVE_HEADER:
				return ((InternalEList<?>)getRemoveHeader()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__REMOVE_HEADERS:
				return ((InternalEList<?>)getRemoveHeaders()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__REMOVE_PROPERTIES:
				return ((InternalEList<?>)getRemoveProperties()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__REMOVE_PROPERTY:
				return ((InternalEList<?>)getRemoveProperty()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__REMOVE_VARIABLE:
				return ((InternalEList<?>)getRemoveVariable()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__RESEQUENCE:
				return ((InternalEList<?>)getResequence()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__RESUMABLE:
				return ((InternalEList<?>)getResumable()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ROLLBACK:
				return ((InternalEList<?>)getRollback()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ROUTE:
				return ((InternalEList<?>)getRoute()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ROUTING_SLIP:
				return ((InternalEList<?>)getRoutingSlip()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SAGA:
				return ((InternalEList<?>)getSaga()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SAMPLE:
				return ((InternalEList<?>)getSample()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SCRIPT:
				return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_BODY:
				return ((InternalEList<?>)getSetBody()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_EXCHANGE_PATTERN:
				return ((InternalEList<?>)getSetExchangePattern()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_HEADER:
				return ((InternalEList<?>)getSetHeader()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_HEADERS:
				return ((InternalEList<?>)getSetHeaders()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_PROPERTY:
				return ((InternalEList<?>)getSetProperty()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_VARIABLE:
				return ((InternalEList<?>)getSetVariable()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_VARIABLES:
				return ((InternalEList<?>)getSetVariables()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SORT:
				return ((InternalEList<?>)getSort()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SPLIT:
				return ((InternalEList<?>)getSplit()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__STEP:
				return ((InternalEList<?>)getStep()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__STOP:
				return ((InternalEList<?>)getStop()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__THREADS:
				return ((InternalEList<?>)getThreads()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__THROTTLE:
				return ((InternalEList<?>)getThrottle()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__THROW_EXCEPTION:
				return ((InternalEList<?>)getThrowException()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__TO:
				return ((InternalEList<?>)getTo()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__TO_D:
				return ((InternalEList<?>)getToD()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__TOKENIZER:
				return ((InternalEList<?>)getTokenizer()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__TRANSACTED:
				return ((InternalEList<?>)getTransacted()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__TRANSFORM:
				return ((InternalEList<?>)getTransform()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__DO_TRY:
				return ((InternalEList<?>)getDoTry()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__UNMARSHAL:
				return ((InternalEList<?>)getUnmarshal()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__VALIDATE:
				return ((InternalEList<?>)getValidate()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__WIRE_TAP:
				return ((InternalEList<?>)getWireTap()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SERVICE_CALL:
				return ((InternalEList<?>)getServiceCall()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ON_FALLBACK:
				return basicSetOnFallback(null, msgs);
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
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__RESILIENCE4J_CONFIGURATION:
				return getResilience4jConfiguration();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__FAULT_TOLERANCE_CONFIGURATION:
				return getFaultToleranceConfiguration();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__AGGREGATE:
				return getAggregate();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__BEAN:
				return getBean();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__DO_CATCH:
				return getDoCatch();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CHOICE:
				return getChoice();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CIRCUIT_BREAKER:
				return getCircuitBreaker();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CLAIM_CHECK:
				return getClaimCheck();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CONVERT_BODY_TO:
				return getConvertBodyTo();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CONVERT_HEADER_TO:
				return getConvertHeaderTo();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CONVERT_VARIABLE_TO:
				return getConvertVariableTo();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__DELAY:
				return getDelay();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__DYNAMIC_ROUTER:
				return getDynamicRouter();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ENRICH:
				return getEnrich();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__FILTER:
				return getFilter();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__DO_FINALLY:
				return getDoFinally();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__IDEMPOTENT_CONSUMER:
				return getIdempotentConsumer();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__INTERCEPT:
				return getIntercept();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__INTERCEPT_FROM:
				return getInterceptFrom();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				return getInterceptSendToEndpoint();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__KAMELET:
				return getKamelet();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__LOAD_BALANCE:
				return getLoadBalance();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__LOG:
				return getLog();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__LOOP:
				return getLoop();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__MARSHAL:
				return getMarshal();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__MULTICAST:
				return getMulticast();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ON_COMPLETION:
				return getOnCompletion();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ON_EXCEPTION:
				return getOnException();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__PAUSABLE:
				return getPausable();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__PIPELINE:
				return getPipeline();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__POLICY:
				return getPolicy();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__POLL:
				return getPoll();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__POLL_ENRICH:
				return getPollEnrich();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__PROCESS:
				return getProcess();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__RECIPIENT_LIST:
				return getRecipientList();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__REMOVE_HEADER:
				return getRemoveHeader();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__REMOVE_HEADERS:
				return getRemoveHeaders();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__REMOVE_PROPERTIES:
				return getRemoveProperties();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__REMOVE_PROPERTY:
				return getRemoveProperty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__REMOVE_VARIABLE:
				return getRemoveVariable();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__RESEQUENCE:
				return getResequence();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__RESUMABLE:
				return getResumable();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ROLLBACK:
				return getRollback();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ROUTE:
				return getRoute();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ROUTING_SLIP:
				return getRoutingSlip();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SAGA:
				return getSaga();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SAMPLE:
				return getSample();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SCRIPT:
				return getScript();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_BODY:
				return getSetBody();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_EXCHANGE_PATTERN:
				return getSetExchangePattern();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_HEADER:
				return getSetHeader();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_HEADERS:
				return getSetHeaders();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_PROPERTY:
				return getSetProperty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_VARIABLE:
				return getSetVariable();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_VARIABLES:
				return getSetVariables();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SORT:
				return getSort();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SPLIT:
				return getSplit();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__STEP:
				return getStep();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__STOP:
				return getStop();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__THREADS:
				return getThreads();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__THROTTLE:
				return getThrottle();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__THROW_EXCEPTION:
				return getThrowException();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__TO:
				return getTo();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__TO_D:
				return getToD();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__TOKENIZER:
				return getTokenizer();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__TRANSACTED:
				return getTransacted();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__TRANSFORM:
				return getTransform();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__DO_TRY:
				return getDoTry();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__UNMARSHAL:
				return getUnmarshal();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__VALIDATE:
				return getValidate();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__WIRE_TAP:
				return getWireTap();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SERVICE_CALL:
				return getServiceCall();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ON_FALLBACK:
				return getOnFallback();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CONFIGURATION:
				return getConfiguration();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__INHERIT_ERROR_HANDLER:
				return isInheritErrorHandler();
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
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__RESILIENCE4J_CONFIGURATION:
				setResilience4jConfiguration((Resilience4JConfigurationDefinition)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__FAULT_TOLERANCE_CONFIGURATION:
				setFaultToleranceConfiguration((FaultToleranceConfigurationDefinition)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__AGGREGATE:
				getAggregate().clear();
				getAggregate().addAll((Collection<? extends AggregateDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__BEAN:
				getBean().clear();
				getBean().addAll((Collection<? extends BeanDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__DO_CATCH:
				getDoCatch().clear();
				getDoCatch().addAll((Collection<? extends CatchDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CHOICE:
				getChoice().clear();
				getChoice().addAll((Collection<? extends ChoiceDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CIRCUIT_BREAKER:
				getCircuitBreaker().clear();
				getCircuitBreaker().addAll((Collection<? extends CircuitBreakerDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CLAIM_CHECK:
				getClaimCheck().clear();
				getClaimCheck().addAll((Collection<? extends ClaimCheckDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CONVERT_BODY_TO:
				getConvertBodyTo().clear();
				getConvertBodyTo().addAll((Collection<? extends ConvertBodyDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CONVERT_HEADER_TO:
				getConvertHeaderTo().clear();
				getConvertHeaderTo().addAll((Collection<? extends ConvertHeaderDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CONVERT_VARIABLE_TO:
				getConvertVariableTo().clear();
				getConvertVariableTo().addAll((Collection<? extends ConvertVariableDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__DELAY:
				getDelay().clear();
				getDelay().addAll((Collection<? extends DelayDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__DYNAMIC_ROUTER:
				getDynamicRouter().clear();
				getDynamicRouter().addAll((Collection<? extends DynamicRouterDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ENRICH:
				getEnrich().clear();
				getEnrich().addAll((Collection<? extends EnrichDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends FilterDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__DO_FINALLY:
				getDoFinally().clear();
				getDoFinally().addAll((Collection<? extends FinallyDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__IDEMPOTENT_CONSUMER:
				getIdempotentConsumer().clear();
				getIdempotentConsumer().addAll((Collection<? extends IdempotentConsumerDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__INTERCEPT:
				getIntercept().clear();
				getIntercept().addAll((Collection<? extends InterceptDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__INTERCEPT_FROM:
				getInterceptFrom().clear();
				getInterceptFrom().addAll((Collection<? extends InterceptFromDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				getInterceptSendToEndpoint().clear();
				getInterceptSendToEndpoint().addAll((Collection<? extends InterceptSendToEndpointDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__KAMELET:
				getKamelet().clear();
				getKamelet().addAll((Collection<? extends KameletDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__LOAD_BALANCE:
				getLoadBalance().clear();
				getLoadBalance().addAll((Collection<? extends LoadBalanceDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__LOG:
				getLog().clear();
				getLog().addAll((Collection<? extends LogDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__LOOP:
				getLoop().clear();
				getLoop().addAll((Collection<? extends LoopDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__MARSHAL:
				getMarshal().clear();
				getMarshal().addAll((Collection<? extends MarshalDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__MULTICAST:
				getMulticast().clear();
				getMulticast().addAll((Collection<? extends MulticastDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ON_COMPLETION:
				getOnCompletion().clear();
				getOnCompletion().addAll((Collection<? extends OnCompletionDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ON_EXCEPTION:
				getOnException().clear();
				getOnException().addAll((Collection<? extends OnExceptionDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__PAUSABLE:
				getPausable().clear();
				getPausable().addAll((Collection<? extends PausableDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__PIPELINE:
				getPipeline().clear();
				getPipeline().addAll((Collection<? extends PipelineDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__POLICY:
				getPolicy().clear();
				getPolicy().addAll((Collection<? extends PolicyDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__POLL:
				getPoll().clear();
				getPoll().addAll((Collection<? extends PollDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__POLL_ENRICH:
				getPollEnrich().clear();
				getPollEnrich().addAll((Collection<? extends PollEnrichDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__PROCESS:
				getProcess().clear();
				getProcess().addAll((Collection<? extends ProcessDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__RECIPIENT_LIST:
				getRecipientList().clear();
				getRecipientList().addAll((Collection<? extends RecipientListDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__REMOVE_HEADER:
				getRemoveHeader().clear();
				getRemoveHeader().addAll((Collection<? extends RemoveHeaderDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__REMOVE_HEADERS:
				getRemoveHeaders().clear();
				getRemoveHeaders().addAll((Collection<? extends RemoveHeadersDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__REMOVE_PROPERTIES:
				getRemoveProperties().clear();
				getRemoveProperties().addAll((Collection<? extends RemovePropertiesDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__REMOVE_PROPERTY:
				getRemoveProperty().clear();
				getRemoveProperty().addAll((Collection<? extends RemovePropertyDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__REMOVE_VARIABLE:
				getRemoveVariable().clear();
				getRemoveVariable().addAll((Collection<? extends RemoveVariableDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__RESEQUENCE:
				getResequence().clear();
				getResequence().addAll((Collection<? extends ResequenceDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__RESUMABLE:
				getResumable().clear();
				getResumable().addAll((Collection<? extends ResumableDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ROLLBACK:
				getRollback().clear();
				getRollback().addAll((Collection<? extends RollbackDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ROUTE:
				getRoute().clear();
				getRoute().addAll((Collection<? extends RouteDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ROUTING_SLIP:
				getRoutingSlip().clear();
				getRoutingSlip().addAll((Collection<? extends RoutingSlipDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SAGA:
				getSaga().clear();
				getSaga().addAll((Collection<? extends SagaDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SAMPLE:
				getSample().clear();
				getSample().addAll((Collection<? extends SamplingDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends ScriptDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_BODY:
				getSetBody().clear();
				getSetBody().addAll((Collection<? extends SetBodyDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_EXCHANGE_PATTERN:
				getSetExchangePattern().clear();
				getSetExchangePattern().addAll((Collection<? extends SetExchangePatternDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_HEADER:
				getSetHeader().clear();
				getSetHeader().addAll((Collection<? extends SetHeaderDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_HEADERS:
				getSetHeaders().clear();
				getSetHeaders().addAll((Collection<? extends SetHeadersDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_PROPERTY:
				getSetProperty().clear();
				getSetProperty().addAll((Collection<? extends SetPropertyDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_VARIABLE:
				getSetVariable().clear();
				getSetVariable().addAll((Collection<? extends SetVariableDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_VARIABLES:
				getSetVariables().clear();
				getSetVariables().addAll((Collection<? extends SetVariablesDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SORT:
				getSort().clear();
				getSort().addAll((Collection<? extends SortDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SPLIT:
				getSplit().clear();
				getSplit().addAll((Collection<? extends SplitDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends StepDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__STOP:
				getStop().clear();
				getStop().addAll((Collection<? extends StopDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__THREADS:
				getThreads().clear();
				getThreads().addAll((Collection<? extends ThreadsDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__THROTTLE:
				getThrottle().clear();
				getThrottle().addAll((Collection<? extends ThrottleDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__THROW_EXCEPTION:
				getThrowException().clear();
				getThrowException().addAll((Collection<? extends ThrowExceptionDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__TO:
				getTo().clear();
				getTo().addAll((Collection<? extends ToDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__TO_D:
				getToD().clear();
				getToD().addAll((Collection<? extends ToDynamicDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__TOKENIZER:
				getTokenizer().clear();
				getTokenizer().addAll((Collection<? extends TokenizerDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__TRANSACTED:
				getTransacted().clear();
				getTransacted().addAll((Collection<? extends TransactedDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__TRANSFORM:
				getTransform().clear();
				getTransform().addAll((Collection<? extends TransformDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__DO_TRY:
				getDoTry().clear();
				getDoTry().addAll((Collection<? extends TryDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__UNMARSHAL:
				getUnmarshal().clear();
				getUnmarshal().addAll((Collection<? extends UnmarshalDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__VALIDATE:
				getValidate().clear();
				getValidate().addAll((Collection<? extends ValidateDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__WIRE_TAP:
				getWireTap().clear();
				getWireTap().addAll((Collection<? extends WireTapDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SERVICE_CALL:
				getServiceCall().clear();
				getServiceCall().addAll((Collection<? extends ServiceCallDefinition>)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ON_FALLBACK:
				setOnFallback((OnFallbackDefinition)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CONFIGURATION:
				setConfiguration((String)newValue);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__INHERIT_ERROR_HANDLER:
				setInheritErrorHandler((Boolean)newValue);
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
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__RESILIENCE4J_CONFIGURATION:
				setResilience4jConfiguration((Resilience4JConfigurationDefinition)null);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__FAULT_TOLERANCE_CONFIGURATION:
				setFaultToleranceConfiguration((FaultToleranceConfigurationDefinition)null);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__GROUP:
				getGroup().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__AGGREGATE:
				getAggregate().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__BEAN:
				getBean().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__DO_CATCH:
				getDoCatch().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CHOICE:
				getChoice().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CIRCUIT_BREAKER:
				getCircuitBreaker().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CLAIM_CHECK:
				getClaimCheck().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CONVERT_BODY_TO:
				getConvertBodyTo().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CONVERT_HEADER_TO:
				getConvertHeaderTo().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CONVERT_VARIABLE_TO:
				getConvertVariableTo().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__DELAY:
				getDelay().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__DYNAMIC_ROUTER:
				getDynamicRouter().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ENRICH:
				getEnrich().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__FILTER:
				getFilter().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__DO_FINALLY:
				getDoFinally().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__IDEMPOTENT_CONSUMER:
				getIdempotentConsumer().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__INTERCEPT:
				getIntercept().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__INTERCEPT_FROM:
				getInterceptFrom().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				getInterceptSendToEndpoint().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__KAMELET:
				getKamelet().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__LOAD_BALANCE:
				getLoadBalance().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__LOG:
				getLog().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__LOOP:
				getLoop().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__MARSHAL:
				getMarshal().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__MULTICAST:
				getMulticast().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ON_COMPLETION:
				getOnCompletion().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ON_EXCEPTION:
				getOnException().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__PAUSABLE:
				getPausable().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__PIPELINE:
				getPipeline().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__POLICY:
				getPolicy().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__POLL:
				getPoll().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__POLL_ENRICH:
				getPollEnrich().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__PROCESS:
				getProcess().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__RECIPIENT_LIST:
				getRecipientList().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__REMOVE_HEADER:
				getRemoveHeader().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__REMOVE_HEADERS:
				getRemoveHeaders().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__REMOVE_PROPERTIES:
				getRemoveProperties().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__REMOVE_PROPERTY:
				getRemoveProperty().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__REMOVE_VARIABLE:
				getRemoveVariable().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__RESEQUENCE:
				getResequence().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__RESUMABLE:
				getResumable().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ROLLBACK:
				getRollback().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ROUTE:
				getRoute().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ROUTING_SLIP:
				getRoutingSlip().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SAGA:
				getSaga().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SAMPLE:
				getSample().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SCRIPT:
				getScript().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_BODY:
				getSetBody().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_EXCHANGE_PATTERN:
				getSetExchangePattern().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_HEADER:
				getSetHeader().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_HEADERS:
				getSetHeaders().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_PROPERTY:
				getSetProperty().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_VARIABLE:
				getSetVariable().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_VARIABLES:
				getSetVariables().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SORT:
				getSort().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SPLIT:
				getSplit().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__STEP:
				getStep().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__STOP:
				getStop().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__THREADS:
				getThreads().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__THROTTLE:
				getThrottle().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__THROW_EXCEPTION:
				getThrowException().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__TO:
				getTo().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__TO_D:
				getToD().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__TOKENIZER:
				getTokenizer().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__TRANSACTED:
				getTransacted().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__TRANSFORM:
				getTransform().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__DO_TRY:
				getDoTry().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__UNMARSHAL:
				getUnmarshal().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__VALIDATE:
				getValidate().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__WIRE_TAP:
				getWireTap().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SERVICE_CALL:
				getServiceCall().clear();
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ON_FALLBACK:
				setOnFallback((OnFallbackDefinition)null);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CONFIGURATION:
				setConfiguration(CONFIGURATION_EDEFAULT);
				return;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__INHERIT_ERROR_HANDLER:
				unsetInheritErrorHandler();
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
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__RESILIENCE4J_CONFIGURATION:
				return resilience4jConfiguration != null;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__FAULT_TOLERANCE_CONFIGURATION:
				return faultToleranceConfiguration != null;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__GROUP:
				return group != null && !group.isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__AGGREGATE:
				return !getAggregate().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__BEAN:
				return !getBean().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__DO_CATCH:
				return !getDoCatch().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CHOICE:
				return !getChoice().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CIRCUIT_BREAKER:
				return !getCircuitBreaker().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CLAIM_CHECK:
				return !getClaimCheck().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CONVERT_BODY_TO:
				return !getConvertBodyTo().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CONVERT_HEADER_TO:
				return !getConvertHeaderTo().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CONVERT_VARIABLE_TO:
				return !getConvertVariableTo().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__DELAY:
				return !getDelay().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__DYNAMIC_ROUTER:
				return !getDynamicRouter().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ENRICH:
				return !getEnrich().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__FILTER:
				return !getFilter().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__DO_FINALLY:
				return !getDoFinally().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__IDEMPOTENT_CONSUMER:
				return !getIdempotentConsumer().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__INTERCEPT:
				return !getIntercept().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__INTERCEPT_FROM:
				return !getInterceptFrom().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				return !getInterceptSendToEndpoint().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__KAMELET:
				return !getKamelet().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__LOAD_BALANCE:
				return !getLoadBalance().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__LOG:
				return !getLog().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__LOOP:
				return !getLoop().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__MARSHAL:
				return !getMarshal().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__MULTICAST:
				return !getMulticast().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ON_COMPLETION:
				return !getOnCompletion().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ON_EXCEPTION:
				return !getOnException().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__PAUSABLE:
				return !getPausable().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__PIPELINE:
				return !getPipeline().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__POLICY:
				return !getPolicy().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__POLL:
				return !getPoll().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__POLL_ENRICH:
				return !getPollEnrich().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__PROCESS:
				return !getProcess().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__RECIPIENT_LIST:
				return !getRecipientList().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__REMOVE_HEADER:
				return !getRemoveHeader().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__REMOVE_HEADERS:
				return !getRemoveHeaders().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__REMOVE_PROPERTIES:
				return !getRemoveProperties().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__REMOVE_PROPERTY:
				return !getRemoveProperty().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__REMOVE_VARIABLE:
				return !getRemoveVariable().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__RESEQUENCE:
				return !getResequence().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__RESUMABLE:
				return !getResumable().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ROLLBACK:
				return !getRollback().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ROUTE:
				return !getRoute().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ROUTING_SLIP:
				return !getRoutingSlip().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SAGA:
				return !getSaga().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SAMPLE:
				return !getSample().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SCRIPT:
				return !getScript().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_BODY:
				return !getSetBody().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_EXCHANGE_PATTERN:
				return !getSetExchangePattern().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_HEADER:
				return !getSetHeader().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_HEADERS:
				return !getSetHeaders().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_PROPERTY:
				return !getSetProperty().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_VARIABLE:
				return !getSetVariable().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SET_VARIABLES:
				return !getSetVariables().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SORT:
				return !getSort().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SPLIT:
				return !getSplit().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__STEP:
				return !getStep().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__STOP:
				return !getStop().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__THREADS:
				return !getThreads().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__THROTTLE:
				return !getThrottle().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__THROW_EXCEPTION:
				return !getThrowException().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__TO:
				return !getTo().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__TO_D:
				return !getToD().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__TOKENIZER:
				return !getTokenizer().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__TRANSACTED:
				return !getTransacted().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__TRANSFORM:
				return !getTransform().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__DO_TRY:
				return !getDoTry().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__UNMARSHAL:
				return !getUnmarshal().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__VALIDATE:
				return !getValidate().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__WIRE_TAP:
				return !getWireTap().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__SERVICE_CALL:
				return !getServiceCall().isEmpty();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__ON_FALLBACK:
				return onFallback != null;
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__CONFIGURATION:
				return CONFIGURATION_EDEFAULT == null ? configuration != null : !CONFIGURATION_EDEFAULT.equals(configuration);
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION__INHERIT_ERROR_HANDLER:
				return isSetInheritErrorHandler();
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
		result.append(", configuration: ");
		result.append(configuration);
		result.append(", inheritErrorHandler: ");
		if (inheritErrorHandlerESet) result.append(inheritErrorHandler); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CircuitBreakerDefinitionImpl
