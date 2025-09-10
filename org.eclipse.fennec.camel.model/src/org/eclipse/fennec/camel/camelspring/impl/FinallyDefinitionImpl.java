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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 * An implementation of the model object '<em><b>Finally Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getDoCatch <em>Do Catch</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getCircuitBreaker <em>Circuit Breaker</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getClaimCheck <em>Claim Check</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getConvertBodyTo <em>Convert Body To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getConvertHeaderTo <em>Convert Header To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getConvertVariableTo <em>Convert Variable To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getDynamicRouter <em>Dynamic Router</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getEnrich <em>Enrich</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getDoFinally <em>Do Finally</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getIdempotentConsumer <em>Idempotent Consumer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getInterceptSendToEndpoint <em>Intercept Send To Endpoint</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getKamelet <em>Kamelet</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getLog <em>Log</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getMarshal <em>Marshal</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getPausable <em>Pausable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getPoll <em>Poll</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getPollEnrich <em>Poll Enrich</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getRecipientList <em>Recipient List</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getRemoveHeader <em>Remove Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getRemoveHeaders <em>Remove Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getRemoveProperties <em>Remove Properties</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getRemoveProperty <em>Remove Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getRemoveVariable <em>Remove Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getResequence <em>Resequence</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getResumable <em>Resumable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getRoutingSlip <em>Routing Slip</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getSaga <em>Saga</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getSample <em>Sample</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getSetBody <em>Set Body</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getSetExchangePattern <em>Set Exchange Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getSetHeaders <em>Set Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getSetProperty <em>Set Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getSetVariable <em>Set Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getSetVariables <em>Set Variables</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getSplit <em>Split</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getThrottle <em>Throttle</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getToD <em>To D</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getTokenizer <em>Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getDoTry <em>Do Try</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getUnmarshal <em>Unmarshal</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getWireTap <em>Wire Tap</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FinallyDefinitionImpl#getServiceCall <em>Service Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinallyDefinitionImpl extends OutputImpl implements FinallyDefinition {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinallyDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getFinallyDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CamelSpringPackage.FINALLY_DEFINITION__GROUP);
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
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Aggregate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BeanDefinition> getBean() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Bean());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CatchDefinition> getDoCatch() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_DoCatch());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChoiceDefinition> getChoice() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Choice());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CircuitBreakerDefinition> getCircuitBreaker() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_CircuitBreaker());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimCheckDefinition> getClaimCheck() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_ClaimCheck());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConvertBodyDefinition> getConvertBodyTo() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_ConvertBodyTo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConvertHeaderDefinition> getConvertHeaderTo() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_ConvertHeaderTo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConvertVariableDefinition> getConvertVariableTo() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_ConvertVariableTo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DelayDefinition> getDelay() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Delay());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DynamicRouterDefinition> getDynamicRouter() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_DynamicRouter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnrichDefinition> getEnrich() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Enrich());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FilterDefinition> getFilter() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Filter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinallyDefinition> getDoFinally() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_DoFinally());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IdempotentConsumerDefinition> getIdempotentConsumer() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_IdempotentConsumer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterceptDefinition> getIntercept() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Intercept());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterceptFromDefinition> getInterceptFrom() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_InterceptFrom());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterceptSendToEndpointDefinition> getInterceptSendToEndpoint() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_InterceptSendToEndpoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KameletDefinition> getKamelet() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Kamelet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LoadBalanceDefinition> getLoadBalance() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_LoadBalance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogDefinition> getLog() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Log());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LoopDefinition> getLoop() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Loop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarshalDefinition> getMarshal() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Marshal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MulticastDefinition> getMulticast() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Multicast());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OnCompletionDefinition> getOnCompletion() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_OnCompletion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OnExceptionDefinition> getOnException() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_OnException());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PausableDefinition> getPausable() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Pausable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PipelineDefinition> getPipeline() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Pipeline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PolicyDefinition> getPolicy() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Policy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PollDefinition> getPoll() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Poll());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PollEnrichDefinition> getPollEnrich() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_PollEnrich());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessDefinition> getProcess() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Process());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RecipientListDefinition> getRecipientList() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_RecipientList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemoveHeaderDefinition> getRemoveHeader() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_RemoveHeader());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemoveHeadersDefinition> getRemoveHeaders() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_RemoveHeaders());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemovePropertiesDefinition> getRemoveProperties() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_RemoveProperties());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemovePropertyDefinition> getRemoveProperty() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_RemoveProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemoveVariableDefinition> getRemoveVariable() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_RemoveVariable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResequenceDefinition> getResequence() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Resequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResumableDefinition> getResumable() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Resumable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RollbackDefinition> getRollback() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Rollback());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RouteDefinition> getRoute() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Route());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RoutingSlipDefinition> getRoutingSlip() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_RoutingSlip());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SagaDefinition> getSaga() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Saga());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SamplingDefinition> getSample() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Sample());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScriptDefinition> getScript() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Script());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetBodyDefinition> getSetBody() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_SetBody());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetExchangePatternDefinition> getSetExchangePattern() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_SetExchangePattern());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetHeaderDefinition> getSetHeader() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_SetHeader());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetHeadersDefinition> getSetHeaders() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_SetHeaders());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetPropertyDefinition> getSetProperty() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_SetProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetVariableDefinition> getSetVariable() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_SetVariable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetVariablesDefinition> getSetVariables() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_SetVariables());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SortDefinition> getSort() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Sort());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SplitDefinition> getSplit() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Split());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StepDefinition> getStep() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Step());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StopDefinition> getStop() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Stop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThreadsDefinition> getThreads() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Threads());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThrottleDefinition> getThrottle() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Throttle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThrowExceptionDefinition> getThrowException() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_ThrowException());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ToDefinition> getTo() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_To());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ToDynamicDefinition> getToD() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_ToD());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TokenizerDefinition> getTokenizer() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Tokenizer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransactedDefinition> getTransacted() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Transacted());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransformDefinition> getTransform() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Transform());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TryDefinition> getDoTry() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_DoTry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnmarshalDefinition> getUnmarshal() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Unmarshal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValidateDefinition> getValidate() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_Validate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WireTapDefinition> getWireTap() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_WireTap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceCallDefinition> getServiceCall() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getFinallyDefinition_ServiceCall());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.FINALLY_DEFINITION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__AGGREGATE:
				return ((InternalEList<?>)getAggregate()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__BEAN:
				return ((InternalEList<?>)getBean()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__DO_CATCH:
				return ((InternalEList<?>)getDoCatch()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__CHOICE:
				return ((InternalEList<?>)getChoice()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__CIRCUIT_BREAKER:
				return ((InternalEList<?>)getCircuitBreaker()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__CLAIM_CHECK:
				return ((InternalEList<?>)getClaimCheck()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__CONVERT_BODY_TO:
				return ((InternalEList<?>)getConvertBodyTo()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__CONVERT_HEADER_TO:
				return ((InternalEList<?>)getConvertHeaderTo()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__CONVERT_VARIABLE_TO:
				return ((InternalEList<?>)getConvertVariableTo()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__DELAY:
				return ((InternalEList<?>)getDelay()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__DYNAMIC_ROUTER:
				return ((InternalEList<?>)getDynamicRouter()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__ENRICH:
				return ((InternalEList<?>)getEnrich()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__FILTER:
				return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__DO_FINALLY:
				return ((InternalEList<?>)getDoFinally()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__IDEMPOTENT_CONSUMER:
				return ((InternalEList<?>)getIdempotentConsumer()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__INTERCEPT:
				return ((InternalEList<?>)getIntercept()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__INTERCEPT_FROM:
				return ((InternalEList<?>)getInterceptFrom()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				return ((InternalEList<?>)getInterceptSendToEndpoint()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__KAMELET:
				return ((InternalEList<?>)getKamelet()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__LOAD_BALANCE:
				return ((InternalEList<?>)getLoadBalance()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__LOG:
				return ((InternalEList<?>)getLog()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__LOOP:
				return ((InternalEList<?>)getLoop()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__MARSHAL:
				return ((InternalEList<?>)getMarshal()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__MULTICAST:
				return ((InternalEList<?>)getMulticast()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__ON_COMPLETION:
				return ((InternalEList<?>)getOnCompletion()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__ON_EXCEPTION:
				return ((InternalEList<?>)getOnException()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__PAUSABLE:
				return ((InternalEList<?>)getPausable()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__PIPELINE:
				return ((InternalEList<?>)getPipeline()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__POLICY:
				return ((InternalEList<?>)getPolicy()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__POLL:
				return ((InternalEList<?>)getPoll()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__POLL_ENRICH:
				return ((InternalEList<?>)getPollEnrich()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__PROCESS:
				return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__RECIPIENT_LIST:
				return ((InternalEList<?>)getRecipientList()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__REMOVE_HEADER:
				return ((InternalEList<?>)getRemoveHeader()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__REMOVE_HEADERS:
				return ((InternalEList<?>)getRemoveHeaders()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__REMOVE_PROPERTIES:
				return ((InternalEList<?>)getRemoveProperties()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__REMOVE_PROPERTY:
				return ((InternalEList<?>)getRemoveProperty()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__REMOVE_VARIABLE:
				return ((InternalEList<?>)getRemoveVariable()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__RESEQUENCE:
				return ((InternalEList<?>)getResequence()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__RESUMABLE:
				return ((InternalEList<?>)getResumable()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__ROLLBACK:
				return ((InternalEList<?>)getRollback()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__ROUTE:
				return ((InternalEList<?>)getRoute()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__ROUTING_SLIP:
				return ((InternalEList<?>)getRoutingSlip()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__SAGA:
				return ((InternalEList<?>)getSaga()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__SAMPLE:
				return ((InternalEList<?>)getSample()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__SCRIPT:
				return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__SET_BODY:
				return ((InternalEList<?>)getSetBody()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__SET_EXCHANGE_PATTERN:
				return ((InternalEList<?>)getSetExchangePattern()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__SET_HEADER:
				return ((InternalEList<?>)getSetHeader()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__SET_HEADERS:
				return ((InternalEList<?>)getSetHeaders()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__SET_PROPERTY:
				return ((InternalEList<?>)getSetProperty()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__SET_VARIABLE:
				return ((InternalEList<?>)getSetVariable()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__SET_VARIABLES:
				return ((InternalEList<?>)getSetVariables()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__SORT:
				return ((InternalEList<?>)getSort()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__SPLIT:
				return ((InternalEList<?>)getSplit()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__STEP:
				return ((InternalEList<?>)getStep()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__STOP:
				return ((InternalEList<?>)getStop()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__THREADS:
				return ((InternalEList<?>)getThreads()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__THROTTLE:
				return ((InternalEList<?>)getThrottle()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__THROW_EXCEPTION:
				return ((InternalEList<?>)getThrowException()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__TO:
				return ((InternalEList<?>)getTo()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__TO_D:
				return ((InternalEList<?>)getToD()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__TOKENIZER:
				return ((InternalEList<?>)getTokenizer()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__TRANSACTED:
				return ((InternalEList<?>)getTransacted()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__TRANSFORM:
				return ((InternalEList<?>)getTransform()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__DO_TRY:
				return ((InternalEList<?>)getDoTry()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__UNMARSHAL:
				return ((InternalEList<?>)getUnmarshal()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__VALIDATE:
				return ((InternalEList<?>)getValidate()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__WIRE_TAP:
				return ((InternalEList<?>)getWireTap()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.FINALLY_DEFINITION__SERVICE_CALL:
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
			case CamelSpringPackage.FINALLY_DEFINITION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CamelSpringPackage.FINALLY_DEFINITION__AGGREGATE:
				return getAggregate();
			case CamelSpringPackage.FINALLY_DEFINITION__BEAN:
				return getBean();
			case CamelSpringPackage.FINALLY_DEFINITION__DO_CATCH:
				return getDoCatch();
			case CamelSpringPackage.FINALLY_DEFINITION__CHOICE:
				return getChoice();
			case CamelSpringPackage.FINALLY_DEFINITION__CIRCUIT_BREAKER:
				return getCircuitBreaker();
			case CamelSpringPackage.FINALLY_DEFINITION__CLAIM_CHECK:
				return getClaimCheck();
			case CamelSpringPackage.FINALLY_DEFINITION__CONVERT_BODY_TO:
				return getConvertBodyTo();
			case CamelSpringPackage.FINALLY_DEFINITION__CONVERT_HEADER_TO:
				return getConvertHeaderTo();
			case CamelSpringPackage.FINALLY_DEFINITION__CONVERT_VARIABLE_TO:
				return getConvertVariableTo();
			case CamelSpringPackage.FINALLY_DEFINITION__DELAY:
				return getDelay();
			case CamelSpringPackage.FINALLY_DEFINITION__DYNAMIC_ROUTER:
				return getDynamicRouter();
			case CamelSpringPackage.FINALLY_DEFINITION__ENRICH:
				return getEnrich();
			case CamelSpringPackage.FINALLY_DEFINITION__FILTER:
				return getFilter();
			case CamelSpringPackage.FINALLY_DEFINITION__DO_FINALLY:
				return getDoFinally();
			case CamelSpringPackage.FINALLY_DEFINITION__IDEMPOTENT_CONSUMER:
				return getIdempotentConsumer();
			case CamelSpringPackage.FINALLY_DEFINITION__INTERCEPT:
				return getIntercept();
			case CamelSpringPackage.FINALLY_DEFINITION__INTERCEPT_FROM:
				return getInterceptFrom();
			case CamelSpringPackage.FINALLY_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				return getInterceptSendToEndpoint();
			case CamelSpringPackage.FINALLY_DEFINITION__KAMELET:
				return getKamelet();
			case CamelSpringPackage.FINALLY_DEFINITION__LOAD_BALANCE:
				return getLoadBalance();
			case CamelSpringPackage.FINALLY_DEFINITION__LOG:
				return getLog();
			case CamelSpringPackage.FINALLY_DEFINITION__LOOP:
				return getLoop();
			case CamelSpringPackage.FINALLY_DEFINITION__MARSHAL:
				return getMarshal();
			case CamelSpringPackage.FINALLY_DEFINITION__MULTICAST:
				return getMulticast();
			case CamelSpringPackage.FINALLY_DEFINITION__ON_COMPLETION:
				return getOnCompletion();
			case CamelSpringPackage.FINALLY_DEFINITION__ON_EXCEPTION:
				return getOnException();
			case CamelSpringPackage.FINALLY_DEFINITION__PAUSABLE:
				return getPausable();
			case CamelSpringPackage.FINALLY_DEFINITION__PIPELINE:
				return getPipeline();
			case CamelSpringPackage.FINALLY_DEFINITION__POLICY:
				return getPolicy();
			case CamelSpringPackage.FINALLY_DEFINITION__POLL:
				return getPoll();
			case CamelSpringPackage.FINALLY_DEFINITION__POLL_ENRICH:
				return getPollEnrich();
			case CamelSpringPackage.FINALLY_DEFINITION__PROCESS:
				return getProcess();
			case CamelSpringPackage.FINALLY_DEFINITION__RECIPIENT_LIST:
				return getRecipientList();
			case CamelSpringPackage.FINALLY_DEFINITION__REMOVE_HEADER:
				return getRemoveHeader();
			case CamelSpringPackage.FINALLY_DEFINITION__REMOVE_HEADERS:
				return getRemoveHeaders();
			case CamelSpringPackage.FINALLY_DEFINITION__REMOVE_PROPERTIES:
				return getRemoveProperties();
			case CamelSpringPackage.FINALLY_DEFINITION__REMOVE_PROPERTY:
				return getRemoveProperty();
			case CamelSpringPackage.FINALLY_DEFINITION__REMOVE_VARIABLE:
				return getRemoveVariable();
			case CamelSpringPackage.FINALLY_DEFINITION__RESEQUENCE:
				return getResequence();
			case CamelSpringPackage.FINALLY_DEFINITION__RESUMABLE:
				return getResumable();
			case CamelSpringPackage.FINALLY_DEFINITION__ROLLBACK:
				return getRollback();
			case CamelSpringPackage.FINALLY_DEFINITION__ROUTE:
				return getRoute();
			case CamelSpringPackage.FINALLY_DEFINITION__ROUTING_SLIP:
				return getRoutingSlip();
			case CamelSpringPackage.FINALLY_DEFINITION__SAGA:
				return getSaga();
			case CamelSpringPackage.FINALLY_DEFINITION__SAMPLE:
				return getSample();
			case CamelSpringPackage.FINALLY_DEFINITION__SCRIPT:
				return getScript();
			case CamelSpringPackage.FINALLY_DEFINITION__SET_BODY:
				return getSetBody();
			case CamelSpringPackage.FINALLY_DEFINITION__SET_EXCHANGE_PATTERN:
				return getSetExchangePattern();
			case CamelSpringPackage.FINALLY_DEFINITION__SET_HEADER:
				return getSetHeader();
			case CamelSpringPackage.FINALLY_DEFINITION__SET_HEADERS:
				return getSetHeaders();
			case CamelSpringPackage.FINALLY_DEFINITION__SET_PROPERTY:
				return getSetProperty();
			case CamelSpringPackage.FINALLY_DEFINITION__SET_VARIABLE:
				return getSetVariable();
			case CamelSpringPackage.FINALLY_DEFINITION__SET_VARIABLES:
				return getSetVariables();
			case CamelSpringPackage.FINALLY_DEFINITION__SORT:
				return getSort();
			case CamelSpringPackage.FINALLY_DEFINITION__SPLIT:
				return getSplit();
			case CamelSpringPackage.FINALLY_DEFINITION__STEP:
				return getStep();
			case CamelSpringPackage.FINALLY_DEFINITION__STOP:
				return getStop();
			case CamelSpringPackage.FINALLY_DEFINITION__THREADS:
				return getThreads();
			case CamelSpringPackage.FINALLY_DEFINITION__THROTTLE:
				return getThrottle();
			case CamelSpringPackage.FINALLY_DEFINITION__THROW_EXCEPTION:
				return getThrowException();
			case CamelSpringPackage.FINALLY_DEFINITION__TO:
				return getTo();
			case CamelSpringPackage.FINALLY_DEFINITION__TO_D:
				return getToD();
			case CamelSpringPackage.FINALLY_DEFINITION__TOKENIZER:
				return getTokenizer();
			case CamelSpringPackage.FINALLY_DEFINITION__TRANSACTED:
				return getTransacted();
			case CamelSpringPackage.FINALLY_DEFINITION__TRANSFORM:
				return getTransform();
			case CamelSpringPackage.FINALLY_DEFINITION__DO_TRY:
				return getDoTry();
			case CamelSpringPackage.FINALLY_DEFINITION__UNMARSHAL:
				return getUnmarshal();
			case CamelSpringPackage.FINALLY_DEFINITION__VALIDATE:
				return getValidate();
			case CamelSpringPackage.FINALLY_DEFINITION__WIRE_TAP:
				return getWireTap();
			case CamelSpringPackage.FINALLY_DEFINITION__SERVICE_CALL:
				return getServiceCall();
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
			case CamelSpringPackage.FINALLY_DEFINITION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__AGGREGATE:
				getAggregate().clear();
				getAggregate().addAll((Collection<? extends AggregateDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__BEAN:
				getBean().clear();
				getBean().addAll((Collection<? extends BeanDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__DO_CATCH:
				getDoCatch().clear();
				getDoCatch().addAll((Collection<? extends CatchDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__CHOICE:
				getChoice().clear();
				getChoice().addAll((Collection<? extends ChoiceDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__CIRCUIT_BREAKER:
				getCircuitBreaker().clear();
				getCircuitBreaker().addAll((Collection<? extends CircuitBreakerDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__CLAIM_CHECK:
				getClaimCheck().clear();
				getClaimCheck().addAll((Collection<? extends ClaimCheckDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__CONVERT_BODY_TO:
				getConvertBodyTo().clear();
				getConvertBodyTo().addAll((Collection<? extends ConvertBodyDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__CONVERT_HEADER_TO:
				getConvertHeaderTo().clear();
				getConvertHeaderTo().addAll((Collection<? extends ConvertHeaderDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__CONVERT_VARIABLE_TO:
				getConvertVariableTo().clear();
				getConvertVariableTo().addAll((Collection<? extends ConvertVariableDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__DELAY:
				getDelay().clear();
				getDelay().addAll((Collection<? extends DelayDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__DYNAMIC_ROUTER:
				getDynamicRouter().clear();
				getDynamicRouter().addAll((Collection<? extends DynamicRouterDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__ENRICH:
				getEnrich().clear();
				getEnrich().addAll((Collection<? extends EnrichDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends FilterDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__DO_FINALLY:
				getDoFinally().clear();
				getDoFinally().addAll((Collection<? extends FinallyDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__IDEMPOTENT_CONSUMER:
				getIdempotentConsumer().clear();
				getIdempotentConsumer().addAll((Collection<? extends IdempotentConsumerDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__INTERCEPT:
				getIntercept().clear();
				getIntercept().addAll((Collection<? extends InterceptDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__INTERCEPT_FROM:
				getInterceptFrom().clear();
				getInterceptFrom().addAll((Collection<? extends InterceptFromDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				getInterceptSendToEndpoint().clear();
				getInterceptSendToEndpoint().addAll((Collection<? extends InterceptSendToEndpointDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__KAMELET:
				getKamelet().clear();
				getKamelet().addAll((Collection<? extends KameletDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__LOAD_BALANCE:
				getLoadBalance().clear();
				getLoadBalance().addAll((Collection<? extends LoadBalanceDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__LOG:
				getLog().clear();
				getLog().addAll((Collection<? extends LogDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__LOOP:
				getLoop().clear();
				getLoop().addAll((Collection<? extends LoopDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__MARSHAL:
				getMarshal().clear();
				getMarshal().addAll((Collection<? extends MarshalDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__MULTICAST:
				getMulticast().clear();
				getMulticast().addAll((Collection<? extends MulticastDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__ON_COMPLETION:
				getOnCompletion().clear();
				getOnCompletion().addAll((Collection<? extends OnCompletionDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__ON_EXCEPTION:
				getOnException().clear();
				getOnException().addAll((Collection<? extends OnExceptionDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__PAUSABLE:
				getPausable().clear();
				getPausable().addAll((Collection<? extends PausableDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__PIPELINE:
				getPipeline().clear();
				getPipeline().addAll((Collection<? extends PipelineDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__POLICY:
				getPolicy().clear();
				getPolicy().addAll((Collection<? extends PolicyDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__POLL:
				getPoll().clear();
				getPoll().addAll((Collection<? extends PollDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__POLL_ENRICH:
				getPollEnrich().clear();
				getPollEnrich().addAll((Collection<? extends PollEnrichDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__PROCESS:
				getProcess().clear();
				getProcess().addAll((Collection<? extends ProcessDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__RECIPIENT_LIST:
				getRecipientList().clear();
				getRecipientList().addAll((Collection<? extends RecipientListDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__REMOVE_HEADER:
				getRemoveHeader().clear();
				getRemoveHeader().addAll((Collection<? extends RemoveHeaderDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__REMOVE_HEADERS:
				getRemoveHeaders().clear();
				getRemoveHeaders().addAll((Collection<? extends RemoveHeadersDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__REMOVE_PROPERTIES:
				getRemoveProperties().clear();
				getRemoveProperties().addAll((Collection<? extends RemovePropertiesDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__REMOVE_PROPERTY:
				getRemoveProperty().clear();
				getRemoveProperty().addAll((Collection<? extends RemovePropertyDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__REMOVE_VARIABLE:
				getRemoveVariable().clear();
				getRemoveVariable().addAll((Collection<? extends RemoveVariableDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__RESEQUENCE:
				getResequence().clear();
				getResequence().addAll((Collection<? extends ResequenceDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__RESUMABLE:
				getResumable().clear();
				getResumable().addAll((Collection<? extends ResumableDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__ROLLBACK:
				getRollback().clear();
				getRollback().addAll((Collection<? extends RollbackDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__ROUTE:
				getRoute().clear();
				getRoute().addAll((Collection<? extends RouteDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__ROUTING_SLIP:
				getRoutingSlip().clear();
				getRoutingSlip().addAll((Collection<? extends RoutingSlipDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__SAGA:
				getSaga().clear();
				getSaga().addAll((Collection<? extends SagaDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__SAMPLE:
				getSample().clear();
				getSample().addAll((Collection<? extends SamplingDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends ScriptDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__SET_BODY:
				getSetBody().clear();
				getSetBody().addAll((Collection<? extends SetBodyDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__SET_EXCHANGE_PATTERN:
				getSetExchangePattern().clear();
				getSetExchangePattern().addAll((Collection<? extends SetExchangePatternDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__SET_HEADER:
				getSetHeader().clear();
				getSetHeader().addAll((Collection<? extends SetHeaderDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__SET_HEADERS:
				getSetHeaders().clear();
				getSetHeaders().addAll((Collection<? extends SetHeadersDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__SET_PROPERTY:
				getSetProperty().clear();
				getSetProperty().addAll((Collection<? extends SetPropertyDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__SET_VARIABLE:
				getSetVariable().clear();
				getSetVariable().addAll((Collection<? extends SetVariableDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__SET_VARIABLES:
				getSetVariables().clear();
				getSetVariables().addAll((Collection<? extends SetVariablesDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__SORT:
				getSort().clear();
				getSort().addAll((Collection<? extends SortDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__SPLIT:
				getSplit().clear();
				getSplit().addAll((Collection<? extends SplitDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends StepDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__STOP:
				getStop().clear();
				getStop().addAll((Collection<? extends StopDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__THREADS:
				getThreads().clear();
				getThreads().addAll((Collection<? extends ThreadsDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__THROTTLE:
				getThrottle().clear();
				getThrottle().addAll((Collection<? extends ThrottleDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__THROW_EXCEPTION:
				getThrowException().clear();
				getThrowException().addAll((Collection<? extends ThrowExceptionDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__TO:
				getTo().clear();
				getTo().addAll((Collection<? extends ToDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__TO_D:
				getToD().clear();
				getToD().addAll((Collection<? extends ToDynamicDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__TOKENIZER:
				getTokenizer().clear();
				getTokenizer().addAll((Collection<? extends TokenizerDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__TRANSACTED:
				getTransacted().clear();
				getTransacted().addAll((Collection<? extends TransactedDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__TRANSFORM:
				getTransform().clear();
				getTransform().addAll((Collection<? extends TransformDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__DO_TRY:
				getDoTry().clear();
				getDoTry().addAll((Collection<? extends TryDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__UNMARSHAL:
				getUnmarshal().clear();
				getUnmarshal().addAll((Collection<? extends UnmarshalDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__VALIDATE:
				getValidate().clear();
				getValidate().addAll((Collection<? extends ValidateDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__WIRE_TAP:
				getWireTap().clear();
				getWireTap().addAll((Collection<? extends WireTapDefinition>)newValue);
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__SERVICE_CALL:
				getServiceCall().clear();
				getServiceCall().addAll((Collection<? extends ServiceCallDefinition>)newValue);
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
			case CamelSpringPackage.FINALLY_DEFINITION__GROUP:
				getGroup().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__AGGREGATE:
				getAggregate().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__BEAN:
				getBean().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__DO_CATCH:
				getDoCatch().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__CHOICE:
				getChoice().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__CIRCUIT_BREAKER:
				getCircuitBreaker().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__CLAIM_CHECK:
				getClaimCheck().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__CONVERT_BODY_TO:
				getConvertBodyTo().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__CONVERT_HEADER_TO:
				getConvertHeaderTo().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__CONVERT_VARIABLE_TO:
				getConvertVariableTo().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__DELAY:
				getDelay().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__DYNAMIC_ROUTER:
				getDynamicRouter().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__ENRICH:
				getEnrich().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__FILTER:
				getFilter().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__DO_FINALLY:
				getDoFinally().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__IDEMPOTENT_CONSUMER:
				getIdempotentConsumer().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__INTERCEPT:
				getIntercept().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__INTERCEPT_FROM:
				getInterceptFrom().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				getInterceptSendToEndpoint().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__KAMELET:
				getKamelet().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__LOAD_BALANCE:
				getLoadBalance().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__LOG:
				getLog().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__LOOP:
				getLoop().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__MARSHAL:
				getMarshal().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__MULTICAST:
				getMulticast().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__ON_COMPLETION:
				getOnCompletion().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__ON_EXCEPTION:
				getOnException().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__PAUSABLE:
				getPausable().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__PIPELINE:
				getPipeline().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__POLICY:
				getPolicy().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__POLL:
				getPoll().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__POLL_ENRICH:
				getPollEnrich().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__PROCESS:
				getProcess().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__RECIPIENT_LIST:
				getRecipientList().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__REMOVE_HEADER:
				getRemoveHeader().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__REMOVE_HEADERS:
				getRemoveHeaders().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__REMOVE_PROPERTIES:
				getRemoveProperties().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__REMOVE_PROPERTY:
				getRemoveProperty().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__REMOVE_VARIABLE:
				getRemoveVariable().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__RESEQUENCE:
				getResequence().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__RESUMABLE:
				getResumable().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__ROLLBACK:
				getRollback().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__ROUTE:
				getRoute().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__ROUTING_SLIP:
				getRoutingSlip().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__SAGA:
				getSaga().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__SAMPLE:
				getSample().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__SCRIPT:
				getScript().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__SET_BODY:
				getSetBody().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__SET_EXCHANGE_PATTERN:
				getSetExchangePattern().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__SET_HEADER:
				getSetHeader().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__SET_HEADERS:
				getSetHeaders().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__SET_PROPERTY:
				getSetProperty().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__SET_VARIABLE:
				getSetVariable().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__SET_VARIABLES:
				getSetVariables().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__SORT:
				getSort().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__SPLIT:
				getSplit().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__STEP:
				getStep().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__STOP:
				getStop().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__THREADS:
				getThreads().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__THROTTLE:
				getThrottle().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__THROW_EXCEPTION:
				getThrowException().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__TO:
				getTo().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__TO_D:
				getToD().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__TOKENIZER:
				getTokenizer().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__TRANSACTED:
				getTransacted().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__TRANSFORM:
				getTransform().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__DO_TRY:
				getDoTry().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__UNMARSHAL:
				getUnmarshal().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__VALIDATE:
				getValidate().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__WIRE_TAP:
				getWireTap().clear();
				return;
			case CamelSpringPackage.FINALLY_DEFINITION__SERVICE_CALL:
				getServiceCall().clear();
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
			case CamelSpringPackage.FINALLY_DEFINITION__GROUP:
				return group != null && !group.isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__AGGREGATE:
				return !getAggregate().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__BEAN:
				return !getBean().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__DO_CATCH:
				return !getDoCatch().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__CHOICE:
				return !getChoice().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__CIRCUIT_BREAKER:
				return !getCircuitBreaker().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__CLAIM_CHECK:
				return !getClaimCheck().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__CONVERT_BODY_TO:
				return !getConvertBodyTo().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__CONVERT_HEADER_TO:
				return !getConvertHeaderTo().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__CONVERT_VARIABLE_TO:
				return !getConvertVariableTo().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__DELAY:
				return !getDelay().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__DYNAMIC_ROUTER:
				return !getDynamicRouter().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__ENRICH:
				return !getEnrich().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__FILTER:
				return !getFilter().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__DO_FINALLY:
				return !getDoFinally().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__IDEMPOTENT_CONSUMER:
				return !getIdempotentConsumer().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__INTERCEPT:
				return !getIntercept().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__INTERCEPT_FROM:
				return !getInterceptFrom().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				return !getInterceptSendToEndpoint().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__KAMELET:
				return !getKamelet().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__LOAD_BALANCE:
				return !getLoadBalance().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__LOG:
				return !getLog().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__LOOP:
				return !getLoop().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__MARSHAL:
				return !getMarshal().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__MULTICAST:
				return !getMulticast().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__ON_COMPLETION:
				return !getOnCompletion().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__ON_EXCEPTION:
				return !getOnException().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__PAUSABLE:
				return !getPausable().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__PIPELINE:
				return !getPipeline().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__POLICY:
				return !getPolicy().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__POLL:
				return !getPoll().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__POLL_ENRICH:
				return !getPollEnrich().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__PROCESS:
				return !getProcess().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__RECIPIENT_LIST:
				return !getRecipientList().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__REMOVE_HEADER:
				return !getRemoveHeader().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__REMOVE_HEADERS:
				return !getRemoveHeaders().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__REMOVE_PROPERTIES:
				return !getRemoveProperties().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__REMOVE_PROPERTY:
				return !getRemoveProperty().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__REMOVE_VARIABLE:
				return !getRemoveVariable().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__RESEQUENCE:
				return !getResequence().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__RESUMABLE:
				return !getResumable().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__ROLLBACK:
				return !getRollback().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__ROUTE:
				return !getRoute().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__ROUTING_SLIP:
				return !getRoutingSlip().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__SAGA:
				return !getSaga().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__SAMPLE:
				return !getSample().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__SCRIPT:
				return !getScript().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__SET_BODY:
				return !getSetBody().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__SET_EXCHANGE_PATTERN:
				return !getSetExchangePattern().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__SET_HEADER:
				return !getSetHeader().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__SET_HEADERS:
				return !getSetHeaders().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__SET_PROPERTY:
				return !getSetProperty().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__SET_VARIABLE:
				return !getSetVariable().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__SET_VARIABLES:
				return !getSetVariables().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__SORT:
				return !getSort().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__SPLIT:
				return !getSplit().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__STEP:
				return !getStep().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__STOP:
				return !getStop().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__THREADS:
				return !getThreads().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__THROTTLE:
				return !getThrottle().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__THROW_EXCEPTION:
				return !getThrowException().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__TO:
				return !getTo().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__TO_D:
				return !getToD().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__TOKENIZER:
				return !getTokenizer().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__TRANSACTED:
				return !getTransacted().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__TRANSFORM:
				return !getTransform().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__DO_TRY:
				return !getDoTry().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__UNMARSHAL:
				return !getUnmarshal().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__VALIDATE:
				return !getValidate().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__WIRE_TAP:
				return !getWireTap().isEmpty();
			case CamelSpringPackage.FINALLY_DEFINITION__SERVICE_CALL:
				return !getServiceCall().isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //FinallyDefinitionImpl
