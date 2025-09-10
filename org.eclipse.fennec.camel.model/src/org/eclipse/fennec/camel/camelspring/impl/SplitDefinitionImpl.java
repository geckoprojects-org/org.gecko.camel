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
import org.eclipse.fennec.camel.camelspring.CSimpleExpression;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.CatchDefinition;
import org.eclipse.fennec.camel.camelspring.ChoiceDefinition;
import org.eclipse.fennec.camel.camelspring.CircuitBreakerDefinition;
import org.eclipse.fennec.camel.camelspring.ClaimCheckDefinition;
import org.eclipse.fennec.camel.camelspring.ConstantExpression;
import org.eclipse.fennec.camel.camelspring.ConvertBodyDefinition;
import org.eclipse.fennec.camel.camelspring.ConvertHeaderDefinition;
import org.eclipse.fennec.camel.camelspring.ConvertVariableDefinition;
import org.eclipse.fennec.camel.camelspring.DatasonnetExpression;
import org.eclipse.fennec.camel.camelspring.DelayDefinition;
import org.eclipse.fennec.camel.camelspring.DynamicRouterDefinition;
import org.eclipse.fennec.camel.camelspring.EnrichDefinition;
import org.eclipse.fennec.camel.camelspring.ExchangePropertyExpression;
import org.eclipse.fennec.camel.camelspring.Expression;
import org.eclipse.fennec.camel.camelspring.FilterDefinition;
import org.eclipse.fennec.camel.camelspring.FinallyDefinition;
import org.eclipse.fennec.camel.camelspring.GroovyExpression;
import org.eclipse.fennec.camel.camelspring.HeaderExpression;
import org.eclipse.fennec.camel.camelspring.Hl7TerserExpression;
import org.eclipse.fennec.camel.camelspring.IdempotentConsumerDefinition;
import org.eclipse.fennec.camel.camelspring.InterceptDefinition;
import org.eclipse.fennec.camel.camelspring.InterceptFromDefinition;
import org.eclipse.fennec.camel.camelspring.InterceptSendToEndpointDefinition;
import org.eclipse.fennec.camel.camelspring.JavaExpression;
import org.eclipse.fennec.camel.camelspring.JavaScriptExpression;
import org.eclipse.fennec.camel.camelspring.JoorExpression;
import org.eclipse.fennec.camel.camelspring.JqExpression;
import org.eclipse.fennec.camel.camelspring.JsonPathExpression;
import org.eclipse.fennec.camel.camelspring.KameletDefinition;
import org.eclipse.fennec.camel.camelspring.LanguageExpression;
import org.eclipse.fennec.camel.camelspring.LoadBalanceDefinition;
import org.eclipse.fennec.camel.camelspring.LogDefinition;
import org.eclipse.fennec.camel.camelspring.LoopDefinition;
import org.eclipse.fennec.camel.camelspring.MarshalDefinition;
import org.eclipse.fennec.camel.camelspring.MethodCallExpression;
import org.eclipse.fennec.camel.camelspring.MulticastDefinition;
import org.eclipse.fennec.camel.camelspring.MvelExpression;
import org.eclipse.fennec.camel.camelspring.OgnlExpression;
import org.eclipse.fennec.camel.camelspring.OnCompletionDefinition;
import org.eclipse.fennec.camel.camelspring.OnExceptionDefinition;
import org.eclipse.fennec.camel.camelspring.PausableDefinition;
import org.eclipse.fennec.camel.camelspring.PipelineDefinition;
import org.eclipse.fennec.camel.camelspring.PolicyDefinition;
import org.eclipse.fennec.camel.camelspring.PollDefinition;
import org.eclipse.fennec.camel.camelspring.PollEnrichDefinition;
import org.eclipse.fennec.camel.camelspring.ProcessDefinition;
import org.eclipse.fennec.camel.camelspring.PythonExpression;
import org.eclipse.fennec.camel.camelspring.RecipientListDefinition;
import org.eclipse.fennec.camel.camelspring.RefExpression;
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
import org.eclipse.fennec.camel.camelspring.SimpleExpression;
import org.eclipse.fennec.camel.camelspring.SortDefinition;
import org.eclipse.fennec.camel.camelspring.SpELExpression;
import org.eclipse.fennec.camel.camelspring.SplitDefinition;
import org.eclipse.fennec.camel.camelspring.StepDefinition;
import org.eclipse.fennec.camel.camelspring.StopDefinition;
import org.eclipse.fennec.camel.camelspring.ThreadsDefinition;
import org.eclipse.fennec.camel.camelspring.ThrottleDefinition;
import org.eclipse.fennec.camel.camelspring.ThrowExceptionDefinition;
import org.eclipse.fennec.camel.camelspring.ToDefinition;
import org.eclipse.fennec.camel.camelspring.ToDynamicDefinition;
import org.eclipse.fennec.camel.camelspring.TokenizerDefinition;
import org.eclipse.fennec.camel.camelspring.TokenizerExpression;
import org.eclipse.fennec.camel.camelspring.TransactedDefinition;
import org.eclipse.fennec.camel.camelspring.TransformDefinition;
import org.eclipse.fennec.camel.camelspring.TryDefinition;
import org.eclipse.fennec.camel.camelspring.UnmarshalDefinition;
import org.eclipse.fennec.camel.camelspring.ValidateDefinition;
import org.eclipse.fennec.camel.camelspring.VariableExpression;
import org.eclipse.fennec.camel.camelspring.WasmExpression;
import org.eclipse.fennec.camel.camelspring.WireTapDefinition;
import org.eclipse.fennec.camel.camelspring.XPathExpression;
import org.eclipse.fennec.camel.camelspring.XQueryExpression;
import org.eclipse.fennec.camel.camelspring.XmlTokenizerExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Split Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getExpressionDefinition <em>Expression Definition</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getCsimple <em>Csimple</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getDatasonnet <em>Datasonnet</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getExchangeProperty <em>Exchange Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getGroovy <em>Groovy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getHl7terser <em>Hl7terser</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getJava <em>Java</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getJs <em>Js</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getJoor <em>Joor</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getJq <em>Jq</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getJsonpath <em>Jsonpath</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getMvel <em>Mvel</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getOgnl <em>Ognl</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getPython <em>Python</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getSpel <em>Spel</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getTokenize <em>Tokenize</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getWasm <em>Wasm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getXtokenize <em>Xtokenize</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getXpath <em>Xpath</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getXquery <em>Xquery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getDoCatch <em>Do Catch</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getCircuitBreaker <em>Circuit Breaker</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getClaimCheck <em>Claim Check</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getConvertBodyTo <em>Convert Body To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getConvertHeaderTo <em>Convert Header To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getConvertVariableTo <em>Convert Variable To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getDynamicRouter <em>Dynamic Router</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getEnrich <em>Enrich</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getDoFinally <em>Do Finally</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getIdempotentConsumer <em>Idempotent Consumer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getInterceptSendToEndpoint <em>Intercept Send To Endpoint</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getKamelet <em>Kamelet</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getLog <em>Log</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getMarshal <em>Marshal</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getPausable <em>Pausable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getPoll <em>Poll</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getPollEnrich <em>Poll Enrich</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getRecipientList <em>Recipient List</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getRemoveHeader <em>Remove Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getRemoveHeaders <em>Remove Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getRemoveProperties <em>Remove Properties</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getRemoveProperty <em>Remove Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getRemoveVariable <em>Remove Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getResequence <em>Resequence</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getResumable <em>Resumable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getRoutingSlip <em>Routing Slip</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getSaga <em>Saga</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getSample <em>Sample</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getSetBody <em>Set Body</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getSetExchangePattern <em>Set Exchange Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getSetHeaders <em>Set Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getSetProperty <em>Set Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getSetVariable <em>Set Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getSetVariables <em>Set Variables</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getSplit <em>Split</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getThrottle <em>Throttle</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getToD <em>To D</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getTokenizer <em>Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getDoTry <em>Do Try</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getUnmarshal <em>Unmarshal</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getWireTap <em>Wire Tap</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getServiceCall <em>Service Call</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getAggregationStrategy <em>Aggregation Strategy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getAggregationStrategyMethodAllowNull <em>Aggregation Strategy Method Allow Null</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getAggregationStrategyMethodName <em>Aggregation Strategy Method Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getExecutorService <em>Executor Service</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getOnPrepare <em>On Prepare</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getParallelAggregate <em>Parallel Aggregate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getParallelProcessing <em>Parallel Processing</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getShareUnitOfWork <em>Share Unit Of Work</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getStopOnException <em>Stop On Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getStreaming <em>Streaming</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getSynchronous <em>Synchronous</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SplitDefinitionImpl#getTimeout <em>Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SplitDefinitionImpl extends ProcessorDefinitionImpl implements SplitDefinition {
	/**
	 * The cached value of the '{@link #getExpressionDefinition() <em>Expression Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionDefinition()
	 * @generated
	 * @ordered
	 */
	protected Expression expressionDefinition;

	/**
	 * The cached value of the '{@link #getCsimple() <em>Csimple</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsimple()
	 * @generated
	 * @ordered
	 */
	protected CSimpleExpression csimple;

	/**
	 * The cached value of the '{@link #getConstant() <em>Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant()
	 * @generated
	 * @ordered
	 */
	protected ConstantExpression constant;

	/**
	 * The cached value of the '{@link #getDatasonnet() <em>Datasonnet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasonnet()
	 * @generated
	 * @ordered
	 */
	protected DatasonnetExpression datasonnet;

	/**
	 * The cached value of the '{@link #getExchangeProperty() <em>Exchange Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeProperty()
	 * @generated
	 * @ordered
	 */
	protected ExchangePropertyExpression exchangeProperty;

	/**
	 * The cached value of the '{@link #getGroovy() <em>Groovy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroovy()
	 * @generated
	 * @ordered
	 */
	protected GroovyExpression groovy;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected HeaderExpression header;

	/**
	 * The cached value of the '{@link #getHl7terser() <em>Hl7terser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHl7terser()
	 * @generated
	 * @ordered
	 */
	protected Hl7TerserExpression hl7terser;

	/**
	 * The cached value of the '{@link #getJava() <em>Java</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJava()
	 * @generated
	 * @ordered
	 */
	protected JavaExpression java;

	/**
	 * The cached value of the '{@link #getJs() <em>Js</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJs()
	 * @generated
	 * @ordered
	 */
	protected JavaScriptExpression js;

	/**
	 * The cached value of the '{@link #getJoor() <em>Joor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoor()
	 * @generated
	 * @ordered
	 */
	protected JoorExpression joor;

	/**
	 * The cached value of the '{@link #getJq() <em>Jq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJq()
	 * @generated
	 * @ordered
	 */
	protected JqExpression jq;

	/**
	 * The cached value of the '{@link #getJsonpath() <em>Jsonpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonpath()
	 * @generated
	 * @ordered
	 */
	protected JsonPathExpression jsonpath;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected LanguageExpression language;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected MethodCallExpression method;

	/**
	 * The cached value of the '{@link #getMvel() <em>Mvel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMvel()
	 * @generated
	 * @ordered
	 */
	protected MvelExpression mvel;

	/**
	 * The cached value of the '{@link #getOgnl() <em>Ognl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOgnl()
	 * @generated
	 * @ordered
	 */
	protected OgnlExpression ognl;

	/**
	 * The cached value of the '{@link #getPython() <em>Python</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPython()
	 * @generated
	 * @ordered
	 */
	protected PythonExpression python;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected RefExpression ref;

	/**
	 * The cached value of the '{@link #getSimple() <em>Simple</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimple()
	 * @generated
	 * @ordered
	 */
	protected SimpleExpression simple;

	/**
	 * The cached value of the '{@link #getSpel() <em>Spel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpel()
	 * @generated
	 * @ordered
	 */
	protected SpELExpression spel;

	/**
	 * The cached value of the '{@link #getTokenize() <em>Tokenize</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenize()
	 * @generated
	 * @ordered
	 */
	protected TokenizerExpression tokenize;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected VariableExpression variable;

	/**
	 * The cached value of the '{@link #getWasm() <em>Wasm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWasm()
	 * @generated
	 * @ordered
	 */
	protected WasmExpression wasm;

	/**
	 * The cached value of the '{@link #getXtokenize() <em>Xtokenize</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXtokenize()
	 * @generated
	 * @ordered
	 */
	protected XmlTokenizerExpression xtokenize;

	/**
	 * The cached value of the '{@link #getXpath() <em>Xpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpath()
	 * @generated
	 * @ordered
	 */
	protected XPathExpression xpath;

	/**
	 * The cached value of the '{@link #getXquery() <em>Xquery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXquery()
	 * @generated
	 * @ordered
	 */
	protected XQueryExpression xquery;

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
	 * The default value of the '{@link #getDelimiter() <em>Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiter()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIMITER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelimiter() <em>Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiter()
	 * @generated
	 * @ordered
	 */
	protected String delimiter = DELIMITER_EDEFAULT;

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
	protected SplitDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getSplitDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getExpressionDefinition() {
		return expressionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressionDefinition(Expression newExpressionDefinition, NotificationChain msgs) {
		Expression oldExpressionDefinition = expressionDefinition;
		expressionDefinition = newExpressionDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__EXPRESSION_DEFINITION, oldExpressionDefinition, newExpressionDefinition);
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
	public void setExpressionDefinition(Expression newExpressionDefinition) {
		if (newExpressionDefinition != expressionDefinition) {
			NotificationChain msgs = null;
			if (expressionDefinition != null)
				msgs = ((InternalEObject)expressionDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__EXPRESSION_DEFINITION, null, msgs);
			if (newExpressionDefinition != null)
				msgs = ((InternalEObject)newExpressionDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__EXPRESSION_DEFINITION, null, msgs);
			msgs = basicSetExpressionDefinition(newExpressionDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__EXPRESSION_DEFINITION, newExpressionDefinition, newExpressionDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CSimpleExpression getCsimple() {
		return csimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCsimple(CSimpleExpression newCsimple, NotificationChain msgs) {
		CSimpleExpression oldCsimple = csimple;
		csimple = newCsimple;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__CSIMPLE, oldCsimple, newCsimple);
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
	public void setCsimple(CSimpleExpression newCsimple) {
		if (newCsimple != csimple) {
			NotificationChain msgs = null;
			if (csimple != null)
				msgs = ((InternalEObject)csimple).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__CSIMPLE, null, msgs);
			if (newCsimple != null)
				msgs = ((InternalEObject)newCsimple).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__CSIMPLE, null, msgs);
			msgs = basicSetCsimple(newCsimple, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__CSIMPLE, newCsimple, newCsimple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantExpression getConstant() {
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstant(ConstantExpression newConstant, NotificationChain msgs) {
		ConstantExpression oldConstant = constant;
		constant = newConstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__CONSTANT, oldConstant, newConstant);
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
	public void setConstant(ConstantExpression newConstant) {
		if (newConstant != constant) {
			NotificationChain msgs = null;
			if (constant != null)
				msgs = ((InternalEObject)constant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__CONSTANT, null, msgs);
			if (newConstant != null)
				msgs = ((InternalEObject)newConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__CONSTANT, null, msgs);
			msgs = basicSetConstant(newConstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__CONSTANT, newConstant, newConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatasonnetExpression getDatasonnet() {
		return datasonnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatasonnet(DatasonnetExpression newDatasonnet, NotificationChain msgs) {
		DatasonnetExpression oldDatasonnet = datasonnet;
		datasonnet = newDatasonnet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__DATASONNET, oldDatasonnet, newDatasonnet);
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
	public void setDatasonnet(DatasonnetExpression newDatasonnet) {
		if (newDatasonnet != datasonnet) {
			NotificationChain msgs = null;
			if (datasonnet != null)
				msgs = ((InternalEObject)datasonnet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__DATASONNET, null, msgs);
			if (newDatasonnet != null)
				msgs = ((InternalEObject)newDatasonnet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__DATASONNET, null, msgs);
			msgs = basicSetDatasonnet(newDatasonnet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__DATASONNET, newDatasonnet, newDatasonnet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExchangePropertyExpression getExchangeProperty() {
		return exchangeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExchangeProperty(ExchangePropertyExpression newExchangeProperty, NotificationChain msgs) {
		ExchangePropertyExpression oldExchangeProperty = exchangeProperty;
		exchangeProperty = newExchangeProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__EXCHANGE_PROPERTY, oldExchangeProperty, newExchangeProperty);
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
	public void setExchangeProperty(ExchangePropertyExpression newExchangeProperty) {
		if (newExchangeProperty != exchangeProperty) {
			NotificationChain msgs = null;
			if (exchangeProperty != null)
				msgs = ((InternalEObject)exchangeProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__EXCHANGE_PROPERTY, null, msgs);
			if (newExchangeProperty != null)
				msgs = ((InternalEObject)newExchangeProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__EXCHANGE_PROPERTY, null, msgs);
			msgs = basicSetExchangeProperty(newExchangeProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__EXCHANGE_PROPERTY, newExchangeProperty, newExchangeProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroovyExpression getGroovy() {
		return groovy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroovy(GroovyExpression newGroovy, NotificationChain msgs) {
		GroovyExpression oldGroovy = groovy;
		groovy = newGroovy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__GROOVY, oldGroovy, newGroovy);
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
	public void setGroovy(GroovyExpression newGroovy) {
		if (newGroovy != groovy) {
			NotificationChain msgs = null;
			if (groovy != null)
				msgs = ((InternalEObject)groovy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__GROOVY, null, msgs);
			if (newGroovy != null)
				msgs = ((InternalEObject)newGroovy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__GROOVY, null, msgs);
			msgs = basicSetGroovy(newGroovy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__GROOVY, newGroovy, newGroovy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HeaderExpression getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(HeaderExpression newHeader, NotificationChain msgs) {
		HeaderExpression oldHeader = header;
		header = newHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__HEADER, oldHeader, newHeader);
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
	public void setHeader(HeaderExpression newHeader) {
		if (newHeader != header) {
			NotificationChain msgs = null;
			if (header != null)
				msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__HEADER, null, msgs);
			if (newHeader != null)
				msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__HEADER, null, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__HEADER, newHeader, newHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hl7TerserExpression getHl7terser() {
		return hl7terser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHl7terser(Hl7TerserExpression newHl7terser, NotificationChain msgs) {
		Hl7TerserExpression oldHl7terser = hl7terser;
		hl7terser = newHl7terser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__HL7TERSER, oldHl7terser, newHl7terser);
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
	public void setHl7terser(Hl7TerserExpression newHl7terser) {
		if (newHl7terser != hl7terser) {
			NotificationChain msgs = null;
			if (hl7terser != null)
				msgs = ((InternalEObject)hl7terser).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__HL7TERSER, null, msgs);
			if (newHl7terser != null)
				msgs = ((InternalEObject)newHl7terser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__HL7TERSER, null, msgs);
			msgs = basicSetHl7terser(newHl7terser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__HL7TERSER, newHl7terser, newHl7terser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaExpression getJava() {
		return java;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJava(JavaExpression newJava, NotificationChain msgs) {
		JavaExpression oldJava = java;
		java = newJava;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__JAVA, oldJava, newJava);
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
	public void setJava(JavaExpression newJava) {
		if (newJava != java) {
			NotificationChain msgs = null;
			if (java != null)
				msgs = ((InternalEObject)java).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__JAVA, null, msgs);
			if (newJava != null)
				msgs = ((InternalEObject)newJava).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__JAVA, null, msgs);
			msgs = basicSetJava(newJava, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__JAVA, newJava, newJava));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaScriptExpression getJs() {
		return js;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJs(JavaScriptExpression newJs, NotificationChain msgs) {
		JavaScriptExpression oldJs = js;
		js = newJs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__JS, oldJs, newJs);
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
	public void setJs(JavaScriptExpression newJs) {
		if (newJs != js) {
			NotificationChain msgs = null;
			if (js != null)
				msgs = ((InternalEObject)js).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__JS, null, msgs);
			if (newJs != null)
				msgs = ((InternalEObject)newJs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__JS, null, msgs);
			msgs = basicSetJs(newJs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__JS, newJs, newJs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JoorExpression getJoor() {
		return joor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJoor(JoorExpression newJoor, NotificationChain msgs) {
		JoorExpression oldJoor = joor;
		joor = newJoor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__JOOR, oldJoor, newJoor);
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
	public void setJoor(JoorExpression newJoor) {
		if (newJoor != joor) {
			NotificationChain msgs = null;
			if (joor != null)
				msgs = ((InternalEObject)joor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__JOOR, null, msgs);
			if (newJoor != null)
				msgs = ((InternalEObject)newJoor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__JOOR, null, msgs);
			msgs = basicSetJoor(newJoor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__JOOR, newJoor, newJoor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JqExpression getJq() {
		return jq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJq(JqExpression newJq, NotificationChain msgs) {
		JqExpression oldJq = jq;
		jq = newJq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__JQ, oldJq, newJq);
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
	public void setJq(JqExpression newJq) {
		if (newJq != jq) {
			NotificationChain msgs = null;
			if (jq != null)
				msgs = ((InternalEObject)jq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__JQ, null, msgs);
			if (newJq != null)
				msgs = ((InternalEObject)newJq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__JQ, null, msgs);
			msgs = basicSetJq(newJq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__JQ, newJq, newJq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonPathExpression getJsonpath() {
		return jsonpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJsonpath(JsonPathExpression newJsonpath, NotificationChain msgs) {
		JsonPathExpression oldJsonpath = jsonpath;
		jsonpath = newJsonpath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__JSONPATH, oldJsonpath, newJsonpath);
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
	public void setJsonpath(JsonPathExpression newJsonpath) {
		if (newJsonpath != jsonpath) {
			NotificationChain msgs = null;
			if (jsonpath != null)
				msgs = ((InternalEObject)jsonpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__JSONPATH, null, msgs);
			if (newJsonpath != null)
				msgs = ((InternalEObject)newJsonpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__JSONPATH, null, msgs);
			msgs = basicSetJsonpath(newJsonpath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__JSONPATH, newJsonpath, newJsonpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LanguageExpression getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(LanguageExpression newLanguage, NotificationChain msgs) {
		LanguageExpression oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__LANGUAGE, oldLanguage, newLanguage);
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
	public void setLanguage(LanguageExpression newLanguage) {
		if (newLanguage != language) {
			NotificationChain msgs = null;
			if (language != null)
				msgs = ((InternalEObject)language).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__LANGUAGE, null, msgs);
			if (newLanguage != null)
				msgs = ((InternalEObject)newLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__LANGUAGE, null, msgs);
			msgs = basicSetLanguage(newLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__LANGUAGE, newLanguage, newLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodCallExpression getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(MethodCallExpression newMethod, NotificationChain msgs) {
		MethodCallExpression oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__METHOD, oldMethod, newMethod);
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
	public void setMethod(MethodCallExpression newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MvelExpression getMvel() {
		return mvel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMvel(MvelExpression newMvel, NotificationChain msgs) {
		MvelExpression oldMvel = mvel;
		mvel = newMvel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__MVEL, oldMvel, newMvel);
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
	public void setMvel(MvelExpression newMvel) {
		if (newMvel != mvel) {
			NotificationChain msgs = null;
			if (mvel != null)
				msgs = ((InternalEObject)mvel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__MVEL, null, msgs);
			if (newMvel != null)
				msgs = ((InternalEObject)newMvel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__MVEL, null, msgs);
			msgs = basicSetMvel(newMvel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__MVEL, newMvel, newMvel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OgnlExpression getOgnl() {
		return ognl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOgnl(OgnlExpression newOgnl, NotificationChain msgs) {
		OgnlExpression oldOgnl = ognl;
		ognl = newOgnl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__OGNL, oldOgnl, newOgnl);
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
	public void setOgnl(OgnlExpression newOgnl) {
		if (newOgnl != ognl) {
			NotificationChain msgs = null;
			if (ognl != null)
				msgs = ((InternalEObject)ognl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__OGNL, null, msgs);
			if (newOgnl != null)
				msgs = ((InternalEObject)newOgnl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__OGNL, null, msgs);
			msgs = basicSetOgnl(newOgnl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__OGNL, newOgnl, newOgnl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PythonExpression getPython() {
		return python;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPython(PythonExpression newPython, NotificationChain msgs) {
		PythonExpression oldPython = python;
		python = newPython;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__PYTHON, oldPython, newPython);
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
	public void setPython(PythonExpression newPython) {
		if (newPython != python) {
			NotificationChain msgs = null;
			if (python != null)
				msgs = ((InternalEObject)python).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__PYTHON, null, msgs);
			if (newPython != null)
				msgs = ((InternalEObject)newPython).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__PYTHON, null, msgs);
			msgs = basicSetPython(newPython, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__PYTHON, newPython, newPython));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefExpression getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRef(RefExpression newRef, NotificationChain msgs) {
		RefExpression oldRef = ref;
		ref = newRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__REF, oldRef, newRef);
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
	public void setRef(RefExpression newRef) {
		if (newRef != ref) {
			NotificationChain msgs = null;
			if (ref != null)
				msgs = ((InternalEObject)ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__REF, null, msgs);
			if (newRef != null)
				msgs = ((InternalEObject)newRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__REF, null, msgs);
			msgs = basicSetRef(newRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__REF, newRef, newRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleExpression getSimple() {
		return simple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimple(SimpleExpression newSimple, NotificationChain msgs) {
		SimpleExpression oldSimple = simple;
		simple = newSimple;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__SIMPLE, oldSimple, newSimple);
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
	public void setSimple(SimpleExpression newSimple) {
		if (newSimple != simple) {
			NotificationChain msgs = null;
			if (simple != null)
				msgs = ((InternalEObject)simple).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__SIMPLE, null, msgs);
			if (newSimple != null)
				msgs = ((InternalEObject)newSimple).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__SIMPLE, null, msgs);
			msgs = basicSetSimple(newSimple, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__SIMPLE, newSimple, newSimple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpELExpression getSpel() {
		return spel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpel(SpELExpression newSpel, NotificationChain msgs) {
		SpELExpression oldSpel = spel;
		spel = newSpel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__SPEL, oldSpel, newSpel);
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
	public void setSpel(SpELExpression newSpel) {
		if (newSpel != spel) {
			NotificationChain msgs = null;
			if (spel != null)
				msgs = ((InternalEObject)spel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__SPEL, null, msgs);
			if (newSpel != null)
				msgs = ((InternalEObject)newSpel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__SPEL, null, msgs);
			msgs = basicSetSpel(newSpel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__SPEL, newSpel, newSpel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TokenizerExpression getTokenize() {
		return tokenize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTokenize(TokenizerExpression newTokenize, NotificationChain msgs) {
		TokenizerExpression oldTokenize = tokenize;
		tokenize = newTokenize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__TOKENIZE, oldTokenize, newTokenize);
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
	public void setTokenize(TokenizerExpression newTokenize) {
		if (newTokenize != tokenize) {
			NotificationChain msgs = null;
			if (tokenize != null)
				msgs = ((InternalEObject)tokenize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__TOKENIZE, null, msgs);
			if (newTokenize != null)
				msgs = ((InternalEObject)newTokenize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__TOKENIZE, null, msgs);
			msgs = basicSetTokenize(newTokenize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__TOKENIZE, newTokenize, newTokenize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableExpression getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(VariableExpression newVariable, NotificationChain msgs) {
		VariableExpression oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__VARIABLE, oldVariable, newVariable);
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
	public void setVariable(VariableExpression newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WasmExpression getWasm() {
		return wasm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWasm(WasmExpression newWasm, NotificationChain msgs) {
		WasmExpression oldWasm = wasm;
		wasm = newWasm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__WASM, oldWasm, newWasm);
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
	public void setWasm(WasmExpression newWasm) {
		if (newWasm != wasm) {
			NotificationChain msgs = null;
			if (wasm != null)
				msgs = ((InternalEObject)wasm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__WASM, null, msgs);
			if (newWasm != null)
				msgs = ((InternalEObject)newWasm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__WASM, null, msgs);
			msgs = basicSetWasm(newWasm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__WASM, newWasm, newWasm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlTokenizerExpression getXtokenize() {
		return xtokenize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXtokenize(XmlTokenizerExpression newXtokenize, NotificationChain msgs) {
		XmlTokenizerExpression oldXtokenize = xtokenize;
		xtokenize = newXtokenize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__XTOKENIZE, oldXtokenize, newXtokenize);
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
	public void setXtokenize(XmlTokenizerExpression newXtokenize) {
		if (newXtokenize != xtokenize) {
			NotificationChain msgs = null;
			if (xtokenize != null)
				msgs = ((InternalEObject)xtokenize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__XTOKENIZE, null, msgs);
			if (newXtokenize != null)
				msgs = ((InternalEObject)newXtokenize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__XTOKENIZE, null, msgs);
			msgs = basicSetXtokenize(newXtokenize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__XTOKENIZE, newXtokenize, newXtokenize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XPathExpression getXpath() {
		return xpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXpath(XPathExpression newXpath, NotificationChain msgs) {
		XPathExpression oldXpath = xpath;
		xpath = newXpath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__XPATH, oldXpath, newXpath);
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
	public void setXpath(XPathExpression newXpath) {
		if (newXpath != xpath) {
			NotificationChain msgs = null;
			if (xpath != null)
				msgs = ((InternalEObject)xpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__XPATH, null, msgs);
			if (newXpath != null)
				msgs = ((InternalEObject)newXpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__XPATH, null, msgs);
			msgs = basicSetXpath(newXpath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__XPATH, newXpath, newXpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XQueryExpression getXquery() {
		return xquery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXquery(XQueryExpression newXquery, NotificationChain msgs) {
		XQueryExpression oldXquery = xquery;
		xquery = newXquery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__XQUERY, oldXquery, newXquery);
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
	public void setXquery(XQueryExpression newXquery) {
		if (newXquery != xquery) {
			NotificationChain msgs = null;
			if (xquery != null)
				msgs = ((InternalEObject)xquery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__XQUERY, null, msgs);
			if (newXquery != null)
				msgs = ((InternalEObject)newXquery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPLIT_DEFINITION__XQUERY, null, msgs);
			msgs = basicSetXquery(newXquery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__XQUERY, newXquery, newXquery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CamelSpringPackage.SPLIT_DEFINITION__GROUP);
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
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Aggregate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BeanDefinition> getBean() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Bean());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CatchDefinition> getDoCatch() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_DoCatch());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChoiceDefinition> getChoice() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Choice());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CircuitBreakerDefinition> getCircuitBreaker() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_CircuitBreaker());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimCheckDefinition> getClaimCheck() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_ClaimCheck());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConvertBodyDefinition> getConvertBodyTo() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_ConvertBodyTo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConvertHeaderDefinition> getConvertHeaderTo() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_ConvertHeaderTo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConvertVariableDefinition> getConvertVariableTo() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_ConvertVariableTo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DelayDefinition> getDelay() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Delay());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DynamicRouterDefinition> getDynamicRouter() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_DynamicRouter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnrichDefinition> getEnrich() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Enrich());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FilterDefinition> getFilter() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Filter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinallyDefinition> getDoFinally() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_DoFinally());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IdempotentConsumerDefinition> getIdempotentConsumer() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_IdempotentConsumer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterceptDefinition> getIntercept() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Intercept());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterceptFromDefinition> getInterceptFrom() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_InterceptFrom());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterceptSendToEndpointDefinition> getInterceptSendToEndpoint() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_InterceptSendToEndpoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KameletDefinition> getKamelet() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Kamelet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LoadBalanceDefinition> getLoadBalance() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_LoadBalance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogDefinition> getLog() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Log());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LoopDefinition> getLoop() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Loop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarshalDefinition> getMarshal() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Marshal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MulticastDefinition> getMulticast() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Multicast());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OnCompletionDefinition> getOnCompletion() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_OnCompletion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OnExceptionDefinition> getOnException() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_OnException());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PausableDefinition> getPausable() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Pausable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PipelineDefinition> getPipeline() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Pipeline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PolicyDefinition> getPolicy() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Policy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PollDefinition> getPoll() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Poll());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PollEnrichDefinition> getPollEnrich() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_PollEnrich());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessDefinition> getProcess() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Process());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RecipientListDefinition> getRecipientList() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_RecipientList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemoveHeaderDefinition> getRemoveHeader() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_RemoveHeader());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemoveHeadersDefinition> getRemoveHeaders() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_RemoveHeaders());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemovePropertiesDefinition> getRemoveProperties() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_RemoveProperties());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemovePropertyDefinition> getRemoveProperty() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_RemoveProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemoveVariableDefinition> getRemoveVariable() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_RemoveVariable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResequenceDefinition> getResequence() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Resequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResumableDefinition> getResumable() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Resumable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RollbackDefinition> getRollback() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Rollback());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RouteDefinition> getRoute() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Route());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RoutingSlipDefinition> getRoutingSlip() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_RoutingSlip());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SagaDefinition> getSaga() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Saga());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SamplingDefinition> getSample() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Sample());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScriptDefinition> getScript() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Script());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetBodyDefinition> getSetBody() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_SetBody());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetExchangePatternDefinition> getSetExchangePattern() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_SetExchangePattern());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetHeaderDefinition> getSetHeader() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_SetHeader());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetHeadersDefinition> getSetHeaders() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_SetHeaders());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetPropertyDefinition> getSetProperty() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_SetProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetVariableDefinition> getSetVariable() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_SetVariable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetVariablesDefinition> getSetVariables() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_SetVariables());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SortDefinition> getSort() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Sort());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SplitDefinition> getSplit() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Split());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StepDefinition> getStep() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Step());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StopDefinition> getStop() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Stop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThreadsDefinition> getThreads() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Threads());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThrottleDefinition> getThrottle() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Throttle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThrowExceptionDefinition> getThrowException() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_ThrowException());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ToDefinition> getTo() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_To());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ToDynamicDefinition> getToD() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_ToD());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TokenizerDefinition> getTokenizer() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Tokenizer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransactedDefinition> getTransacted() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Transacted());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransformDefinition> getTransform() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Transform());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TryDefinition> getDoTry() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_DoTry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnmarshalDefinition> getUnmarshal() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Unmarshal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValidateDefinition> getValidate() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_Validate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WireTapDefinition> getWireTap() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_WireTap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceCallDefinition> getServiceCall() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getSplitDefinition_ServiceCall());
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__AGGREGATION_STRATEGY, oldAggregationStrategy, aggregationStrategy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__AGGREGATION_STRATEGY_METHOD_ALLOW_NULL, oldAggregationStrategyMethodAllowNull, aggregationStrategyMethodAllowNull));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__AGGREGATION_STRATEGY_METHOD_NAME, oldAggregationStrategyMethodName, aggregationStrategyMethodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDelimiter() {
		return delimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelimiter(String newDelimiter) {
		String oldDelimiter = delimiter;
		delimiter = newDelimiter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__DELIMITER, oldDelimiter, delimiter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__EXECUTOR_SERVICE, oldExecutorService, executorService));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__ON_PREPARE, oldOnPrepare, onPrepare));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__PARALLEL_AGGREGATE, oldParallelAggregate, parallelAggregate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__PARALLEL_PROCESSING, oldParallelProcessing, parallelProcessing));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__SHARE_UNIT_OF_WORK, oldShareUnitOfWork, shareUnitOfWork));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__STOP_ON_EXCEPTION, oldStopOnException, stopOnException));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__STREAMING, oldStreaming, streaming));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__SYNCHRONOUS, oldSynchronous, synchronous));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPLIT_DEFINITION__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.SPLIT_DEFINITION__EXPRESSION_DEFINITION:
				return basicSetExpressionDefinition(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__CSIMPLE:
				return basicSetCsimple(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__CONSTANT:
				return basicSetConstant(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__DATASONNET:
				return basicSetDatasonnet(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__EXCHANGE_PROPERTY:
				return basicSetExchangeProperty(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__GROOVY:
				return basicSetGroovy(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__HEADER:
				return basicSetHeader(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__HL7TERSER:
				return basicSetHl7terser(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__JAVA:
				return basicSetJava(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__JS:
				return basicSetJs(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__JOOR:
				return basicSetJoor(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__JQ:
				return basicSetJq(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__JSONPATH:
				return basicSetJsonpath(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__LANGUAGE:
				return basicSetLanguage(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__METHOD:
				return basicSetMethod(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__MVEL:
				return basicSetMvel(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__OGNL:
				return basicSetOgnl(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__PYTHON:
				return basicSetPython(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__REF:
				return basicSetRef(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__SIMPLE:
				return basicSetSimple(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__SPEL:
				return basicSetSpel(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__TOKENIZE:
				return basicSetTokenize(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__VARIABLE:
				return basicSetVariable(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__WASM:
				return basicSetWasm(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__XTOKENIZE:
				return basicSetXtokenize(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__XPATH:
				return basicSetXpath(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__XQUERY:
				return basicSetXquery(null, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__AGGREGATE:
				return ((InternalEList<?>)getAggregate()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__BEAN:
				return ((InternalEList<?>)getBean()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__DO_CATCH:
				return ((InternalEList<?>)getDoCatch()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__CHOICE:
				return ((InternalEList<?>)getChoice()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__CIRCUIT_BREAKER:
				return ((InternalEList<?>)getCircuitBreaker()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__CLAIM_CHECK:
				return ((InternalEList<?>)getClaimCheck()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__CONVERT_BODY_TO:
				return ((InternalEList<?>)getConvertBodyTo()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__CONVERT_HEADER_TO:
				return ((InternalEList<?>)getConvertHeaderTo()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__CONVERT_VARIABLE_TO:
				return ((InternalEList<?>)getConvertVariableTo()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__DELAY:
				return ((InternalEList<?>)getDelay()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__DYNAMIC_ROUTER:
				return ((InternalEList<?>)getDynamicRouter()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__ENRICH:
				return ((InternalEList<?>)getEnrich()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__FILTER:
				return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__DO_FINALLY:
				return ((InternalEList<?>)getDoFinally()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__IDEMPOTENT_CONSUMER:
				return ((InternalEList<?>)getIdempotentConsumer()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__INTERCEPT:
				return ((InternalEList<?>)getIntercept()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__INTERCEPT_FROM:
				return ((InternalEList<?>)getInterceptFrom()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				return ((InternalEList<?>)getInterceptSendToEndpoint()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__KAMELET:
				return ((InternalEList<?>)getKamelet()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__LOAD_BALANCE:
				return ((InternalEList<?>)getLoadBalance()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__LOG:
				return ((InternalEList<?>)getLog()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__LOOP:
				return ((InternalEList<?>)getLoop()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__MARSHAL:
				return ((InternalEList<?>)getMarshal()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__MULTICAST:
				return ((InternalEList<?>)getMulticast()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__ON_COMPLETION:
				return ((InternalEList<?>)getOnCompletion()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__ON_EXCEPTION:
				return ((InternalEList<?>)getOnException()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__PAUSABLE:
				return ((InternalEList<?>)getPausable()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__PIPELINE:
				return ((InternalEList<?>)getPipeline()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__POLICY:
				return ((InternalEList<?>)getPolicy()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__POLL:
				return ((InternalEList<?>)getPoll()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__POLL_ENRICH:
				return ((InternalEList<?>)getPollEnrich()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__PROCESS:
				return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__RECIPIENT_LIST:
				return ((InternalEList<?>)getRecipientList()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__REMOVE_HEADER:
				return ((InternalEList<?>)getRemoveHeader()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__REMOVE_HEADERS:
				return ((InternalEList<?>)getRemoveHeaders()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__REMOVE_PROPERTIES:
				return ((InternalEList<?>)getRemoveProperties()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__REMOVE_PROPERTY:
				return ((InternalEList<?>)getRemoveProperty()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__REMOVE_VARIABLE:
				return ((InternalEList<?>)getRemoveVariable()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__RESEQUENCE:
				return ((InternalEList<?>)getResequence()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__RESUMABLE:
				return ((InternalEList<?>)getResumable()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__ROLLBACK:
				return ((InternalEList<?>)getRollback()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__ROUTE:
				return ((InternalEList<?>)getRoute()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__ROUTING_SLIP:
				return ((InternalEList<?>)getRoutingSlip()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__SAGA:
				return ((InternalEList<?>)getSaga()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__SAMPLE:
				return ((InternalEList<?>)getSample()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__SCRIPT:
				return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__SET_BODY:
				return ((InternalEList<?>)getSetBody()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__SET_EXCHANGE_PATTERN:
				return ((InternalEList<?>)getSetExchangePattern()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__SET_HEADER:
				return ((InternalEList<?>)getSetHeader()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__SET_HEADERS:
				return ((InternalEList<?>)getSetHeaders()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__SET_PROPERTY:
				return ((InternalEList<?>)getSetProperty()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__SET_VARIABLE:
				return ((InternalEList<?>)getSetVariable()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__SET_VARIABLES:
				return ((InternalEList<?>)getSetVariables()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__SORT:
				return ((InternalEList<?>)getSort()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__SPLIT:
				return ((InternalEList<?>)getSplit()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__STEP:
				return ((InternalEList<?>)getStep()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__STOP:
				return ((InternalEList<?>)getStop()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__THREADS:
				return ((InternalEList<?>)getThreads()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__THROTTLE:
				return ((InternalEList<?>)getThrottle()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__THROW_EXCEPTION:
				return ((InternalEList<?>)getThrowException()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__TO:
				return ((InternalEList<?>)getTo()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__TO_D:
				return ((InternalEList<?>)getToD()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__TOKENIZER:
				return ((InternalEList<?>)getTokenizer()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__TRANSACTED:
				return ((InternalEList<?>)getTransacted()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__TRANSFORM:
				return ((InternalEList<?>)getTransform()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__DO_TRY:
				return ((InternalEList<?>)getDoTry()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__UNMARSHAL:
				return ((InternalEList<?>)getUnmarshal()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__VALIDATE:
				return ((InternalEList<?>)getValidate()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__WIRE_TAP:
				return ((InternalEList<?>)getWireTap()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.SPLIT_DEFINITION__SERVICE_CALL:
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
			case CamelSpringPackage.SPLIT_DEFINITION__EXPRESSION_DEFINITION:
				return getExpressionDefinition();
			case CamelSpringPackage.SPLIT_DEFINITION__CSIMPLE:
				return getCsimple();
			case CamelSpringPackage.SPLIT_DEFINITION__CONSTANT:
				return getConstant();
			case CamelSpringPackage.SPLIT_DEFINITION__DATASONNET:
				return getDatasonnet();
			case CamelSpringPackage.SPLIT_DEFINITION__EXCHANGE_PROPERTY:
				return getExchangeProperty();
			case CamelSpringPackage.SPLIT_DEFINITION__GROOVY:
				return getGroovy();
			case CamelSpringPackage.SPLIT_DEFINITION__HEADER:
				return getHeader();
			case CamelSpringPackage.SPLIT_DEFINITION__HL7TERSER:
				return getHl7terser();
			case CamelSpringPackage.SPLIT_DEFINITION__JAVA:
				return getJava();
			case CamelSpringPackage.SPLIT_DEFINITION__JS:
				return getJs();
			case CamelSpringPackage.SPLIT_DEFINITION__JOOR:
				return getJoor();
			case CamelSpringPackage.SPLIT_DEFINITION__JQ:
				return getJq();
			case CamelSpringPackage.SPLIT_DEFINITION__JSONPATH:
				return getJsonpath();
			case CamelSpringPackage.SPLIT_DEFINITION__LANGUAGE:
				return getLanguage();
			case CamelSpringPackage.SPLIT_DEFINITION__METHOD:
				return getMethod();
			case CamelSpringPackage.SPLIT_DEFINITION__MVEL:
				return getMvel();
			case CamelSpringPackage.SPLIT_DEFINITION__OGNL:
				return getOgnl();
			case CamelSpringPackage.SPLIT_DEFINITION__PYTHON:
				return getPython();
			case CamelSpringPackage.SPLIT_DEFINITION__REF:
				return getRef();
			case CamelSpringPackage.SPLIT_DEFINITION__SIMPLE:
				return getSimple();
			case CamelSpringPackage.SPLIT_DEFINITION__SPEL:
				return getSpel();
			case CamelSpringPackage.SPLIT_DEFINITION__TOKENIZE:
				return getTokenize();
			case CamelSpringPackage.SPLIT_DEFINITION__VARIABLE:
				return getVariable();
			case CamelSpringPackage.SPLIT_DEFINITION__WASM:
				return getWasm();
			case CamelSpringPackage.SPLIT_DEFINITION__XTOKENIZE:
				return getXtokenize();
			case CamelSpringPackage.SPLIT_DEFINITION__XPATH:
				return getXpath();
			case CamelSpringPackage.SPLIT_DEFINITION__XQUERY:
				return getXquery();
			case CamelSpringPackage.SPLIT_DEFINITION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CamelSpringPackage.SPLIT_DEFINITION__AGGREGATE:
				return getAggregate();
			case CamelSpringPackage.SPLIT_DEFINITION__BEAN:
				return getBean();
			case CamelSpringPackage.SPLIT_DEFINITION__DO_CATCH:
				return getDoCatch();
			case CamelSpringPackage.SPLIT_DEFINITION__CHOICE:
				return getChoice();
			case CamelSpringPackage.SPLIT_DEFINITION__CIRCUIT_BREAKER:
				return getCircuitBreaker();
			case CamelSpringPackage.SPLIT_DEFINITION__CLAIM_CHECK:
				return getClaimCheck();
			case CamelSpringPackage.SPLIT_DEFINITION__CONVERT_BODY_TO:
				return getConvertBodyTo();
			case CamelSpringPackage.SPLIT_DEFINITION__CONVERT_HEADER_TO:
				return getConvertHeaderTo();
			case CamelSpringPackage.SPLIT_DEFINITION__CONVERT_VARIABLE_TO:
				return getConvertVariableTo();
			case CamelSpringPackage.SPLIT_DEFINITION__DELAY:
				return getDelay();
			case CamelSpringPackage.SPLIT_DEFINITION__DYNAMIC_ROUTER:
				return getDynamicRouter();
			case CamelSpringPackage.SPLIT_DEFINITION__ENRICH:
				return getEnrich();
			case CamelSpringPackage.SPLIT_DEFINITION__FILTER:
				return getFilter();
			case CamelSpringPackage.SPLIT_DEFINITION__DO_FINALLY:
				return getDoFinally();
			case CamelSpringPackage.SPLIT_DEFINITION__IDEMPOTENT_CONSUMER:
				return getIdempotentConsumer();
			case CamelSpringPackage.SPLIT_DEFINITION__INTERCEPT:
				return getIntercept();
			case CamelSpringPackage.SPLIT_DEFINITION__INTERCEPT_FROM:
				return getInterceptFrom();
			case CamelSpringPackage.SPLIT_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				return getInterceptSendToEndpoint();
			case CamelSpringPackage.SPLIT_DEFINITION__KAMELET:
				return getKamelet();
			case CamelSpringPackage.SPLIT_DEFINITION__LOAD_BALANCE:
				return getLoadBalance();
			case CamelSpringPackage.SPLIT_DEFINITION__LOG:
				return getLog();
			case CamelSpringPackage.SPLIT_DEFINITION__LOOP:
				return getLoop();
			case CamelSpringPackage.SPLIT_DEFINITION__MARSHAL:
				return getMarshal();
			case CamelSpringPackage.SPLIT_DEFINITION__MULTICAST:
				return getMulticast();
			case CamelSpringPackage.SPLIT_DEFINITION__ON_COMPLETION:
				return getOnCompletion();
			case CamelSpringPackage.SPLIT_DEFINITION__ON_EXCEPTION:
				return getOnException();
			case CamelSpringPackage.SPLIT_DEFINITION__PAUSABLE:
				return getPausable();
			case CamelSpringPackage.SPLIT_DEFINITION__PIPELINE:
				return getPipeline();
			case CamelSpringPackage.SPLIT_DEFINITION__POLICY:
				return getPolicy();
			case CamelSpringPackage.SPLIT_DEFINITION__POLL:
				return getPoll();
			case CamelSpringPackage.SPLIT_DEFINITION__POLL_ENRICH:
				return getPollEnrich();
			case CamelSpringPackage.SPLIT_DEFINITION__PROCESS:
				return getProcess();
			case CamelSpringPackage.SPLIT_DEFINITION__RECIPIENT_LIST:
				return getRecipientList();
			case CamelSpringPackage.SPLIT_DEFINITION__REMOVE_HEADER:
				return getRemoveHeader();
			case CamelSpringPackage.SPLIT_DEFINITION__REMOVE_HEADERS:
				return getRemoveHeaders();
			case CamelSpringPackage.SPLIT_DEFINITION__REMOVE_PROPERTIES:
				return getRemoveProperties();
			case CamelSpringPackage.SPLIT_DEFINITION__REMOVE_PROPERTY:
				return getRemoveProperty();
			case CamelSpringPackage.SPLIT_DEFINITION__REMOVE_VARIABLE:
				return getRemoveVariable();
			case CamelSpringPackage.SPLIT_DEFINITION__RESEQUENCE:
				return getResequence();
			case CamelSpringPackage.SPLIT_DEFINITION__RESUMABLE:
				return getResumable();
			case CamelSpringPackage.SPLIT_DEFINITION__ROLLBACK:
				return getRollback();
			case CamelSpringPackage.SPLIT_DEFINITION__ROUTE:
				return getRoute();
			case CamelSpringPackage.SPLIT_DEFINITION__ROUTING_SLIP:
				return getRoutingSlip();
			case CamelSpringPackage.SPLIT_DEFINITION__SAGA:
				return getSaga();
			case CamelSpringPackage.SPLIT_DEFINITION__SAMPLE:
				return getSample();
			case CamelSpringPackage.SPLIT_DEFINITION__SCRIPT:
				return getScript();
			case CamelSpringPackage.SPLIT_DEFINITION__SET_BODY:
				return getSetBody();
			case CamelSpringPackage.SPLIT_DEFINITION__SET_EXCHANGE_PATTERN:
				return getSetExchangePattern();
			case CamelSpringPackage.SPLIT_DEFINITION__SET_HEADER:
				return getSetHeader();
			case CamelSpringPackage.SPLIT_DEFINITION__SET_HEADERS:
				return getSetHeaders();
			case CamelSpringPackage.SPLIT_DEFINITION__SET_PROPERTY:
				return getSetProperty();
			case CamelSpringPackage.SPLIT_DEFINITION__SET_VARIABLE:
				return getSetVariable();
			case CamelSpringPackage.SPLIT_DEFINITION__SET_VARIABLES:
				return getSetVariables();
			case CamelSpringPackage.SPLIT_DEFINITION__SORT:
				return getSort();
			case CamelSpringPackage.SPLIT_DEFINITION__SPLIT:
				return getSplit();
			case CamelSpringPackage.SPLIT_DEFINITION__STEP:
				return getStep();
			case CamelSpringPackage.SPLIT_DEFINITION__STOP:
				return getStop();
			case CamelSpringPackage.SPLIT_DEFINITION__THREADS:
				return getThreads();
			case CamelSpringPackage.SPLIT_DEFINITION__THROTTLE:
				return getThrottle();
			case CamelSpringPackage.SPLIT_DEFINITION__THROW_EXCEPTION:
				return getThrowException();
			case CamelSpringPackage.SPLIT_DEFINITION__TO:
				return getTo();
			case CamelSpringPackage.SPLIT_DEFINITION__TO_D:
				return getToD();
			case CamelSpringPackage.SPLIT_DEFINITION__TOKENIZER:
				return getTokenizer();
			case CamelSpringPackage.SPLIT_DEFINITION__TRANSACTED:
				return getTransacted();
			case CamelSpringPackage.SPLIT_DEFINITION__TRANSFORM:
				return getTransform();
			case CamelSpringPackage.SPLIT_DEFINITION__DO_TRY:
				return getDoTry();
			case CamelSpringPackage.SPLIT_DEFINITION__UNMARSHAL:
				return getUnmarshal();
			case CamelSpringPackage.SPLIT_DEFINITION__VALIDATE:
				return getValidate();
			case CamelSpringPackage.SPLIT_DEFINITION__WIRE_TAP:
				return getWireTap();
			case CamelSpringPackage.SPLIT_DEFINITION__SERVICE_CALL:
				return getServiceCall();
			case CamelSpringPackage.SPLIT_DEFINITION__AGGREGATION_STRATEGY:
				return getAggregationStrategy();
			case CamelSpringPackage.SPLIT_DEFINITION__AGGREGATION_STRATEGY_METHOD_ALLOW_NULL:
				return getAggregationStrategyMethodAllowNull();
			case CamelSpringPackage.SPLIT_DEFINITION__AGGREGATION_STRATEGY_METHOD_NAME:
				return getAggregationStrategyMethodName();
			case CamelSpringPackage.SPLIT_DEFINITION__DELIMITER:
				return getDelimiter();
			case CamelSpringPackage.SPLIT_DEFINITION__EXECUTOR_SERVICE:
				return getExecutorService();
			case CamelSpringPackage.SPLIT_DEFINITION__ON_PREPARE:
				return getOnPrepare();
			case CamelSpringPackage.SPLIT_DEFINITION__PARALLEL_AGGREGATE:
				return getParallelAggregate();
			case CamelSpringPackage.SPLIT_DEFINITION__PARALLEL_PROCESSING:
				return getParallelProcessing();
			case CamelSpringPackage.SPLIT_DEFINITION__SHARE_UNIT_OF_WORK:
				return getShareUnitOfWork();
			case CamelSpringPackage.SPLIT_DEFINITION__STOP_ON_EXCEPTION:
				return getStopOnException();
			case CamelSpringPackage.SPLIT_DEFINITION__STREAMING:
				return getStreaming();
			case CamelSpringPackage.SPLIT_DEFINITION__SYNCHRONOUS:
				return getSynchronous();
			case CamelSpringPackage.SPLIT_DEFINITION__TIMEOUT:
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
			case CamelSpringPackage.SPLIT_DEFINITION__EXPRESSION_DEFINITION:
				setExpressionDefinition((Expression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__CSIMPLE:
				setCsimple((CSimpleExpression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__CONSTANT:
				setConstant((ConstantExpression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__DATASONNET:
				setDatasonnet((DatasonnetExpression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__EXCHANGE_PROPERTY:
				setExchangeProperty((ExchangePropertyExpression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__GROOVY:
				setGroovy((GroovyExpression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__HEADER:
				setHeader((HeaderExpression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__HL7TERSER:
				setHl7terser((Hl7TerserExpression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__JAVA:
				setJava((JavaExpression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__JS:
				setJs((JavaScriptExpression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__JOOR:
				setJoor((JoorExpression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__JQ:
				setJq((JqExpression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__JSONPATH:
				setJsonpath((JsonPathExpression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__LANGUAGE:
				setLanguage((LanguageExpression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__METHOD:
				setMethod((MethodCallExpression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__MVEL:
				setMvel((MvelExpression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__OGNL:
				setOgnl((OgnlExpression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__PYTHON:
				setPython((PythonExpression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__REF:
				setRef((RefExpression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SIMPLE:
				setSimple((SimpleExpression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SPEL:
				setSpel((SpELExpression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__TOKENIZE:
				setTokenize((TokenizerExpression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__VARIABLE:
				setVariable((VariableExpression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__WASM:
				setWasm((WasmExpression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__XTOKENIZE:
				setXtokenize((XmlTokenizerExpression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__XPATH:
				setXpath((XPathExpression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__XQUERY:
				setXquery((XQueryExpression)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__AGGREGATE:
				getAggregate().clear();
				getAggregate().addAll((Collection<? extends AggregateDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__BEAN:
				getBean().clear();
				getBean().addAll((Collection<? extends BeanDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__DO_CATCH:
				getDoCatch().clear();
				getDoCatch().addAll((Collection<? extends CatchDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__CHOICE:
				getChoice().clear();
				getChoice().addAll((Collection<? extends ChoiceDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__CIRCUIT_BREAKER:
				getCircuitBreaker().clear();
				getCircuitBreaker().addAll((Collection<? extends CircuitBreakerDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__CLAIM_CHECK:
				getClaimCheck().clear();
				getClaimCheck().addAll((Collection<? extends ClaimCheckDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__CONVERT_BODY_TO:
				getConvertBodyTo().clear();
				getConvertBodyTo().addAll((Collection<? extends ConvertBodyDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__CONVERT_HEADER_TO:
				getConvertHeaderTo().clear();
				getConvertHeaderTo().addAll((Collection<? extends ConvertHeaderDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__CONVERT_VARIABLE_TO:
				getConvertVariableTo().clear();
				getConvertVariableTo().addAll((Collection<? extends ConvertVariableDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__DELAY:
				getDelay().clear();
				getDelay().addAll((Collection<? extends DelayDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__DYNAMIC_ROUTER:
				getDynamicRouter().clear();
				getDynamicRouter().addAll((Collection<? extends DynamicRouterDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__ENRICH:
				getEnrich().clear();
				getEnrich().addAll((Collection<? extends EnrichDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends FilterDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__DO_FINALLY:
				getDoFinally().clear();
				getDoFinally().addAll((Collection<? extends FinallyDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__IDEMPOTENT_CONSUMER:
				getIdempotentConsumer().clear();
				getIdempotentConsumer().addAll((Collection<? extends IdempotentConsumerDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__INTERCEPT:
				getIntercept().clear();
				getIntercept().addAll((Collection<? extends InterceptDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__INTERCEPT_FROM:
				getInterceptFrom().clear();
				getInterceptFrom().addAll((Collection<? extends InterceptFromDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				getInterceptSendToEndpoint().clear();
				getInterceptSendToEndpoint().addAll((Collection<? extends InterceptSendToEndpointDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__KAMELET:
				getKamelet().clear();
				getKamelet().addAll((Collection<? extends KameletDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__LOAD_BALANCE:
				getLoadBalance().clear();
				getLoadBalance().addAll((Collection<? extends LoadBalanceDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__LOG:
				getLog().clear();
				getLog().addAll((Collection<? extends LogDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__LOOP:
				getLoop().clear();
				getLoop().addAll((Collection<? extends LoopDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__MARSHAL:
				getMarshal().clear();
				getMarshal().addAll((Collection<? extends MarshalDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__MULTICAST:
				getMulticast().clear();
				getMulticast().addAll((Collection<? extends MulticastDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__ON_COMPLETION:
				getOnCompletion().clear();
				getOnCompletion().addAll((Collection<? extends OnCompletionDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__ON_EXCEPTION:
				getOnException().clear();
				getOnException().addAll((Collection<? extends OnExceptionDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__PAUSABLE:
				getPausable().clear();
				getPausable().addAll((Collection<? extends PausableDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__PIPELINE:
				getPipeline().clear();
				getPipeline().addAll((Collection<? extends PipelineDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__POLICY:
				getPolicy().clear();
				getPolicy().addAll((Collection<? extends PolicyDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__POLL:
				getPoll().clear();
				getPoll().addAll((Collection<? extends PollDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__POLL_ENRICH:
				getPollEnrich().clear();
				getPollEnrich().addAll((Collection<? extends PollEnrichDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__PROCESS:
				getProcess().clear();
				getProcess().addAll((Collection<? extends ProcessDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__RECIPIENT_LIST:
				getRecipientList().clear();
				getRecipientList().addAll((Collection<? extends RecipientListDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__REMOVE_HEADER:
				getRemoveHeader().clear();
				getRemoveHeader().addAll((Collection<? extends RemoveHeaderDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__REMOVE_HEADERS:
				getRemoveHeaders().clear();
				getRemoveHeaders().addAll((Collection<? extends RemoveHeadersDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__REMOVE_PROPERTIES:
				getRemoveProperties().clear();
				getRemoveProperties().addAll((Collection<? extends RemovePropertiesDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__REMOVE_PROPERTY:
				getRemoveProperty().clear();
				getRemoveProperty().addAll((Collection<? extends RemovePropertyDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__REMOVE_VARIABLE:
				getRemoveVariable().clear();
				getRemoveVariable().addAll((Collection<? extends RemoveVariableDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__RESEQUENCE:
				getResequence().clear();
				getResequence().addAll((Collection<? extends ResequenceDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__RESUMABLE:
				getResumable().clear();
				getResumable().addAll((Collection<? extends ResumableDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__ROLLBACK:
				getRollback().clear();
				getRollback().addAll((Collection<? extends RollbackDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__ROUTE:
				getRoute().clear();
				getRoute().addAll((Collection<? extends RouteDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__ROUTING_SLIP:
				getRoutingSlip().clear();
				getRoutingSlip().addAll((Collection<? extends RoutingSlipDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SAGA:
				getSaga().clear();
				getSaga().addAll((Collection<? extends SagaDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SAMPLE:
				getSample().clear();
				getSample().addAll((Collection<? extends SamplingDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends ScriptDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SET_BODY:
				getSetBody().clear();
				getSetBody().addAll((Collection<? extends SetBodyDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SET_EXCHANGE_PATTERN:
				getSetExchangePattern().clear();
				getSetExchangePattern().addAll((Collection<? extends SetExchangePatternDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SET_HEADER:
				getSetHeader().clear();
				getSetHeader().addAll((Collection<? extends SetHeaderDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SET_HEADERS:
				getSetHeaders().clear();
				getSetHeaders().addAll((Collection<? extends SetHeadersDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SET_PROPERTY:
				getSetProperty().clear();
				getSetProperty().addAll((Collection<? extends SetPropertyDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SET_VARIABLE:
				getSetVariable().clear();
				getSetVariable().addAll((Collection<? extends SetVariableDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SET_VARIABLES:
				getSetVariables().clear();
				getSetVariables().addAll((Collection<? extends SetVariablesDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SORT:
				getSort().clear();
				getSort().addAll((Collection<? extends SortDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SPLIT:
				getSplit().clear();
				getSplit().addAll((Collection<? extends SplitDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends StepDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__STOP:
				getStop().clear();
				getStop().addAll((Collection<? extends StopDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__THREADS:
				getThreads().clear();
				getThreads().addAll((Collection<? extends ThreadsDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__THROTTLE:
				getThrottle().clear();
				getThrottle().addAll((Collection<? extends ThrottleDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__THROW_EXCEPTION:
				getThrowException().clear();
				getThrowException().addAll((Collection<? extends ThrowExceptionDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__TO:
				getTo().clear();
				getTo().addAll((Collection<? extends ToDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__TO_D:
				getToD().clear();
				getToD().addAll((Collection<? extends ToDynamicDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__TOKENIZER:
				getTokenizer().clear();
				getTokenizer().addAll((Collection<? extends TokenizerDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__TRANSACTED:
				getTransacted().clear();
				getTransacted().addAll((Collection<? extends TransactedDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__TRANSFORM:
				getTransform().clear();
				getTransform().addAll((Collection<? extends TransformDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__DO_TRY:
				getDoTry().clear();
				getDoTry().addAll((Collection<? extends TryDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__UNMARSHAL:
				getUnmarshal().clear();
				getUnmarshal().addAll((Collection<? extends UnmarshalDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__VALIDATE:
				getValidate().clear();
				getValidate().addAll((Collection<? extends ValidateDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__WIRE_TAP:
				getWireTap().clear();
				getWireTap().addAll((Collection<? extends WireTapDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SERVICE_CALL:
				getServiceCall().clear();
				getServiceCall().addAll((Collection<? extends ServiceCallDefinition>)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__AGGREGATION_STRATEGY:
				setAggregationStrategy((String)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__AGGREGATION_STRATEGY_METHOD_ALLOW_NULL:
				setAggregationStrategyMethodAllowNull((String)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__AGGREGATION_STRATEGY_METHOD_NAME:
				setAggregationStrategyMethodName((String)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__DELIMITER:
				setDelimiter((String)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__EXECUTOR_SERVICE:
				setExecutorService((String)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__ON_PREPARE:
				setOnPrepare((String)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__PARALLEL_AGGREGATE:
				setParallelAggregate((String)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__PARALLEL_PROCESSING:
				setParallelProcessing((String)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SHARE_UNIT_OF_WORK:
				setShareUnitOfWork((String)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__STOP_ON_EXCEPTION:
				setStopOnException((String)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__STREAMING:
				setStreaming((String)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SYNCHRONOUS:
				setSynchronous((String)newValue);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__TIMEOUT:
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
			case CamelSpringPackage.SPLIT_DEFINITION__EXPRESSION_DEFINITION:
				setExpressionDefinition((Expression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__CSIMPLE:
				setCsimple((CSimpleExpression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__CONSTANT:
				setConstant((ConstantExpression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__DATASONNET:
				setDatasonnet((DatasonnetExpression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__EXCHANGE_PROPERTY:
				setExchangeProperty((ExchangePropertyExpression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__GROOVY:
				setGroovy((GroovyExpression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__HEADER:
				setHeader((HeaderExpression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__HL7TERSER:
				setHl7terser((Hl7TerserExpression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__JAVA:
				setJava((JavaExpression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__JS:
				setJs((JavaScriptExpression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__JOOR:
				setJoor((JoorExpression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__JQ:
				setJq((JqExpression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__JSONPATH:
				setJsonpath((JsonPathExpression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__LANGUAGE:
				setLanguage((LanguageExpression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__METHOD:
				setMethod((MethodCallExpression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__MVEL:
				setMvel((MvelExpression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__OGNL:
				setOgnl((OgnlExpression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__PYTHON:
				setPython((PythonExpression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__REF:
				setRef((RefExpression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SIMPLE:
				setSimple((SimpleExpression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SPEL:
				setSpel((SpELExpression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__TOKENIZE:
				setTokenize((TokenizerExpression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__VARIABLE:
				setVariable((VariableExpression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__WASM:
				setWasm((WasmExpression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__XTOKENIZE:
				setXtokenize((XmlTokenizerExpression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__XPATH:
				setXpath((XPathExpression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__XQUERY:
				setXquery((XQueryExpression)null);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__GROUP:
				getGroup().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__AGGREGATE:
				getAggregate().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__BEAN:
				getBean().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__DO_CATCH:
				getDoCatch().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__CHOICE:
				getChoice().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__CIRCUIT_BREAKER:
				getCircuitBreaker().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__CLAIM_CHECK:
				getClaimCheck().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__CONVERT_BODY_TO:
				getConvertBodyTo().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__CONVERT_HEADER_TO:
				getConvertHeaderTo().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__CONVERT_VARIABLE_TO:
				getConvertVariableTo().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__DELAY:
				getDelay().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__DYNAMIC_ROUTER:
				getDynamicRouter().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__ENRICH:
				getEnrich().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__FILTER:
				getFilter().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__DO_FINALLY:
				getDoFinally().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__IDEMPOTENT_CONSUMER:
				getIdempotentConsumer().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__INTERCEPT:
				getIntercept().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__INTERCEPT_FROM:
				getInterceptFrom().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				getInterceptSendToEndpoint().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__KAMELET:
				getKamelet().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__LOAD_BALANCE:
				getLoadBalance().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__LOG:
				getLog().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__LOOP:
				getLoop().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__MARSHAL:
				getMarshal().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__MULTICAST:
				getMulticast().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__ON_COMPLETION:
				getOnCompletion().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__ON_EXCEPTION:
				getOnException().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__PAUSABLE:
				getPausable().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__PIPELINE:
				getPipeline().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__POLICY:
				getPolicy().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__POLL:
				getPoll().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__POLL_ENRICH:
				getPollEnrich().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__PROCESS:
				getProcess().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__RECIPIENT_LIST:
				getRecipientList().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__REMOVE_HEADER:
				getRemoveHeader().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__REMOVE_HEADERS:
				getRemoveHeaders().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__REMOVE_PROPERTIES:
				getRemoveProperties().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__REMOVE_PROPERTY:
				getRemoveProperty().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__REMOVE_VARIABLE:
				getRemoveVariable().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__RESEQUENCE:
				getResequence().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__RESUMABLE:
				getResumable().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__ROLLBACK:
				getRollback().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__ROUTE:
				getRoute().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__ROUTING_SLIP:
				getRoutingSlip().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SAGA:
				getSaga().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SAMPLE:
				getSample().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SCRIPT:
				getScript().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SET_BODY:
				getSetBody().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SET_EXCHANGE_PATTERN:
				getSetExchangePattern().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SET_HEADER:
				getSetHeader().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SET_HEADERS:
				getSetHeaders().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SET_PROPERTY:
				getSetProperty().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SET_VARIABLE:
				getSetVariable().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SET_VARIABLES:
				getSetVariables().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SORT:
				getSort().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SPLIT:
				getSplit().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__STEP:
				getStep().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__STOP:
				getStop().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__THREADS:
				getThreads().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__THROTTLE:
				getThrottle().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__THROW_EXCEPTION:
				getThrowException().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__TO:
				getTo().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__TO_D:
				getToD().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__TOKENIZER:
				getTokenizer().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__TRANSACTED:
				getTransacted().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__TRANSFORM:
				getTransform().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__DO_TRY:
				getDoTry().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__UNMARSHAL:
				getUnmarshal().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__VALIDATE:
				getValidate().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__WIRE_TAP:
				getWireTap().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SERVICE_CALL:
				getServiceCall().clear();
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__AGGREGATION_STRATEGY:
				setAggregationStrategy(AGGREGATION_STRATEGY_EDEFAULT);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__AGGREGATION_STRATEGY_METHOD_ALLOW_NULL:
				setAggregationStrategyMethodAllowNull(AGGREGATION_STRATEGY_METHOD_ALLOW_NULL_EDEFAULT);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__AGGREGATION_STRATEGY_METHOD_NAME:
				setAggregationStrategyMethodName(AGGREGATION_STRATEGY_METHOD_NAME_EDEFAULT);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__DELIMITER:
				setDelimiter(DELIMITER_EDEFAULT);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__EXECUTOR_SERVICE:
				setExecutorService(EXECUTOR_SERVICE_EDEFAULT);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__ON_PREPARE:
				setOnPrepare(ON_PREPARE_EDEFAULT);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__PARALLEL_AGGREGATE:
				setParallelAggregate(PARALLEL_AGGREGATE_EDEFAULT);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__PARALLEL_PROCESSING:
				setParallelProcessing(PARALLEL_PROCESSING_EDEFAULT);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SHARE_UNIT_OF_WORK:
				setShareUnitOfWork(SHARE_UNIT_OF_WORK_EDEFAULT);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__STOP_ON_EXCEPTION:
				setStopOnException(STOP_ON_EXCEPTION_EDEFAULT);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__STREAMING:
				setStreaming(STREAMING_EDEFAULT);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__SYNCHRONOUS:
				setSynchronous(SYNCHRONOUS_EDEFAULT);
				return;
			case CamelSpringPackage.SPLIT_DEFINITION__TIMEOUT:
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
			case CamelSpringPackage.SPLIT_DEFINITION__EXPRESSION_DEFINITION:
				return expressionDefinition != null;
			case CamelSpringPackage.SPLIT_DEFINITION__CSIMPLE:
				return csimple != null;
			case CamelSpringPackage.SPLIT_DEFINITION__CONSTANT:
				return constant != null;
			case CamelSpringPackage.SPLIT_DEFINITION__DATASONNET:
				return datasonnet != null;
			case CamelSpringPackage.SPLIT_DEFINITION__EXCHANGE_PROPERTY:
				return exchangeProperty != null;
			case CamelSpringPackage.SPLIT_DEFINITION__GROOVY:
				return groovy != null;
			case CamelSpringPackage.SPLIT_DEFINITION__HEADER:
				return header != null;
			case CamelSpringPackage.SPLIT_DEFINITION__HL7TERSER:
				return hl7terser != null;
			case CamelSpringPackage.SPLIT_DEFINITION__JAVA:
				return java != null;
			case CamelSpringPackage.SPLIT_DEFINITION__JS:
				return js != null;
			case CamelSpringPackage.SPLIT_DEFINITION__JOOR:
				return joor != null;
			case CamelSpringPackage.SPLIT_DEFINITION__JQ:
				return jq != null;
			case CamelSpringPackage.SPLIT_DEFINITION__JSONPATH:
				return jsonpath != null;
			case CamelSpringPackage.SPLIT_DEFINITION__LANGUAGE:
				return language != null;
			case CamelSpringPackage.SPLIT_DEFINITION__METHOD:
				return method != null;
			case CamelSpringPackage.SPLIT_DEFINITION__MVEL:
				return mvel != null;
			case CamelSpringPackage.SPLIT_DEFINITION__OGNL:
				return ognl != null;
			case CamelSpringPackage.SPLIT_DEFINITION__PYTHON:
				return python != null;
			case CamelSpringPackage.SPLIT_DEFINITION__REF:
				return ref != null;
			case CamelSpringPackage.SPLIT_DEFINITION__SIMPLE:
				return simple != null;
			case CamelSpringPackage.SPLIT_DEFINITION__SPEL:
				return spel != null;
			case CamelSpringPackage.SPLIT_DEFINITION__TOKENIZE:
				return tokenize != null;
			case CamelSpringPackage.SPLIT_DEFINITION__VARIABLE:
				return variable != null;
			case CamelSpringPackage.SPLIT_DEFINITION__WASM:
				return wasm != null;
			case CamelSpringPackage.SPLIT_DEFINITION__XTOKENIZE:
				return xtokenize != null;
			case CamelSpringPackage.SPLIT_DEFINITION__XPATH:
				return xpath != null;
			case CamelSpringPackage.SPLIT_DEFINITION__XQUERY:
				return xquery != null;
			case CamelSpringPackage.SPLIT_DEFINITION__GROUP:
				return group != null && !group.isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__AGGREGATE:
				return !getAggregate().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__BEAN:
				return !getBean().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__DO_CATCH:
				return !getDoCatch().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__CHOICE:
				return !getChoice().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__CIRCUIT_BREAKER:
				return !getCircuitBreaker().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__CLAIM_CHECK:
				return !getClaimCheck().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__CONVERT_BODY_TO:
				return !getConvertBodyTo().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__CONVERT_HEADER_TO:
				return !getConvertHeaderTo().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__CONVERT_VARIABLE_TO:
				return !getConvertVariableTo().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__DELAY:
				return !getDelay().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__DYNAMIC_ROUTER:
				return !getDynamicRouter().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__ENRICH:
				return !getEnrich().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__FILTER:
				return !getFilter().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__DO_FINALLY:
				return !getDoFinally().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__IDEMPOTENT_CONSUMER:
				return !getIdempotentConsumer().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__INTERCEPT:
				return !getIntercept().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__INTERCEPT_FROM:
				return !getInterceptFrom().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				return !getInterceptSendToEndpoint().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__KAMELET:
				return !getKamelet().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__LOAD_BALANCE:
				return !getLoadBalance().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__LOG:
				return !getLog().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__LOOP:
				return !getLoop().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__MARSHAL:
				return !getMarshal().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__MULTICAST:
				return !getMulticast().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__ON_COMPLETION:
				return !getOnCompletion().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__ON_EXCEPTION:
				return !getOnException().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__PAUSABLE:
				return !getPausable().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__PIPELINE:
				return !getPipeline().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__POLICY:
				return !getPolicy().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__POLL:
				return !getPoll().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__POLL_ENRICH:
				return !getPollEnrich().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__PROCESS:
				return !getProcess().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__RECIPIENT_LIST:
				return !getRecipientList().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__REMOVE_HEADER:
				return !getRemoveHeader().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__REMOVE_HEADERS:
				return !getRemoveHeaders().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__REMOVE_PROPERTIES:
				return !getRemoveProperties().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__REMOVE_PROPERTY:
				return !getRemoveProperty().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__REMOVE_VARIABLE:
				return !getRemoveVariable().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__RESEQUENCE:
				return !getResequence().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__RESUMABLE:
				return !getResumable().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__ROLLBACK:
				return !getRollback().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__ROUTE:
				return !getRoute().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__ROUTING_SLIP:
				return !getRoutingSlip().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__SAGA:
				return !getSaga().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__SAMPLE:
				return !getSample().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__SCRIPT:
				return !getScript().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__SET_BODY:
				return !getSetBody().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__SET_EXCHANGE_PATTERN:
				return !getSetExchangePattern().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__SET_HEADER:
				return !getSetHeader().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__SET_HEADERS:
				return !getSetHeaders().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__SET_PROPERTY:
				return !getSetProperty().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__SET_VARIABLE:
				return !getSetVariable().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__SET_VARIABLES:
				return !getSetVariables().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__SORT:
				return !getSort().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__SPLIT:
				return !getSplit().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__STEP:
				return !getStep().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__STOP:
				return !getStop().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__THREADS:
				return !getThreads().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__THROTTLE:
				return !getThrottle().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__THROW_EXCEPTION:
				return !getThrowException().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__TO:
				return !getTo().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__TO_D:
				return !getToD().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__TOKENIZER:
				return !getTokenizer().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__TRANSACTED:
				return !getTransacted().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__TRANSFORM:
				return !getTransform().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__DO_TRY:
				return !getDoTry().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__UNMARSHAL:
				return !getUnmarshal().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__VALIDATE:
				return !getValidate().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__WIRE_TAP:
				return !getWireTap().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__SERVICE_CALL:
				return !getServiceCall().isEmpty();
			case CamelSpringPackage.SPLIT_DEFINITION__AGGREGATION_STRATEGY:
				return AGGREGATION_STRATEGY_EDEFAULT == null ? aggregationStrategy != null : !AGGREGATION_STRATEGY_EDEFAULT.equals(aggregationStrategy);
			case CamelSpringPackage.SPLIT_DEFINITION__AGGREGATION_STRATEGY_METHOD_ALLOW_NULL:
				return AGGREGATION_STRATEGY_METHOD_ALLOW_NULL_EDEFAULT == null ? aggregationStrategyMethodAllowNull != null : !AGGREGATION_STRATEGY_METHOD_ALLOW_NULL_EDEFAULT.equals(aggregationStrategyMethodAllowNull);
			case CamelSpringPackage.SPLIT_DEFINITION__AGGREGATION_STRATEGY_METHOD_NAME:
				return AGGREGATION_STRATEGY_METHOD_NAME_EDEFAULT == null ? aggregationStrategyMethodName != null : !AGGREGATION_STRATEGY_METHOD_NAME_EDEFAULT.equals(aggregationStrategyMethodName);
			case CamelSpringPackage.SPLIT_DEFINITION__DELIMITER:
				return DELIMITER_EDEFAULT == null ? delimiter != null : !DELIMITER_EDEFAULT.equals(delimiter);
			case CamelSpringPackage.SPLIT_DEFINITION__EXECUTOR_SERVICE:
				return EXECUTOR_SERVICE_EDEFAULT == null ? executorService != null : !EXECUTOR_SERVICE_EDEFAULT.equals(executorService);
			case CamelSpringPackage.SPLIT_DEFINITION__ON_PREPARE:
				return ON_PREPARE_EDEFAULT == null ? onPrepare != null : !ON_PREPARE_EDEFAULT.equals(onPrepare);
			case CamelSpringPackage.SPLIT_DEFINITION__PARALLEL_AGGREGATE:
				return PARALLEL_AGGREGATE_EDEFAULT == null ? parallelAggregate != null : !PARALLEL_AGGREGATE_EDEFAULT.equals(parallelAggregate);
			case CamelSpringPackage.SPLIT_DEFINITION__PARALLEL_PROCESSING:
				return PARALLEL_PROCESSING_EDEFAULT == null ? parallelProcessing != null : !PARALLEL_PROCESSING_EDEFAULT.equals(parallelProcessing);
			case CamelSpringPackage.SPLIT_DEFINITION__SHARE_UNIT_OF_WORK:
				return SHARE_UNIT_OF_WORK_EDEFAULT == null ? shareUnitOfWork != null : !SHARE_UNIT_OF_WORK_EDEFAULT.equals(shareUnitOfWork);
			case CamelSpringPackage.SPLIT_DEFINITION__STOP_ON_EXCEPTION:
				return STOP_ON_EXCEPTION_EDEFAULT == null ? stopOnException != null : !STOP_ON_EXCEPTION_EDEFAULT.equals(stopOnException);
			case CamelSpringPackage.SPLIT_DEFINITION__STREAMING:
				return STREAMING_EDEFAULT == null ? streaming != null : !STREAMING_EDEFAULT.equals(streaming);
			case CamelSpringPackage.SPLIT_DEFINITION__SYNCHRONOUS:
				return SYNCHRONOUS_EDEFAULT == null ? synchronous != null : !SYNCHRONOUS_EDEFAULT.equals(synchronous);
			case CamelSpringPackage.SPLIT_DEFINITION__TIMEOUT:
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
		result.append(", delimiter: ");
		result.append(delimiter);
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

} //SplitDefinitionImpl
