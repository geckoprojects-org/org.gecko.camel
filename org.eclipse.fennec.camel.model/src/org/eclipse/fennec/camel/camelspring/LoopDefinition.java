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
 * A representation of the model object '<em><b>Loop Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getExpressionDefinition <em>Expression Definition</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getCsimple <em>Csimple</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getDatasonnet <em>Datasonnet</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getExchangeProperty <em>Exchange Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getGroovy <em>Groovy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getHeader <em>Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getHl7terser <em>Hl7terser</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getJava <em>Java</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getJs <em>Js</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getJoor <em>Joor</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getJq <em>Jq</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getJsonpath <em>Jsonpath</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getMvel <em>Mvel</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getOgnl <em>Ognl</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getPython <em>Python</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getRef <em>Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getSpel <em>Spel</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getTokenize <em>Tokenize</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getWasm <em>Wasm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getXtokenize <em>Xtokenize</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getXpath <em>Xpath</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getXquery <em>Xquery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getBean <em>Bean</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getDoCatch <em>Do Catch</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getCircuitBreaker <em>Circuit Breaker</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getClaimCheck <em>Claim Check</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getConvertBodyTo <em>Convert Body To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getConvertHeaderTo <em>Convert Header To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getConvertVariableTo <em>Convert Variable To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getDynamicRouter <em>Dynamic Router</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getEnrich <em>Enrich</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getDoFinally <em>Do Finally</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getIdempotentConsumer <em>Idempotent Consumer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getInterceptSendToEndpoint <em>Intercept Send To Endpoint</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getKamelet <em>Kamelet</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getLog <em>Log</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getMarshal <em>Marshal</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getPausable <em>Pausable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getPoll <em>Poll</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getPollEnrich <em>Poll Enrich</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getProcess <em>Process</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getRecipientList <em>Recipient List</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getRemoveHeader <em>Remove Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getRemoveHeaders <em>Remove Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getRemoveProperties <em>Remove Properties</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getRemoveProperty <em>Remove Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getRemoveVariable <em>Remove Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getResequence <em>Resequence</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getResumable <em>Resumable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getRoute <em>Route</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getRoutingSlip <em>Routing Slip</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getSaga <em>Saga</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getSample <em>Sample</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getScript <em>Script</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getSetBody <em>Set Body</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getSetExchangePattern <em>Set Exchange Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getSetHeaders <em>Set Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getSetProperty <em>Set Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getSetVariable <em>Set Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getSetVariables <em>Set Variables</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getSort <em>Sort</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getSplit <em>Split</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getStep <em>Step</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getStop <em>Stop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getThrottle <em>Throttle</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getToD <em>To D</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getTokenizer <em>Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getDoTry <em>Do Try</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getUnmarshal <em>Unmarshal</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getWireTap <em>Wire Tap</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getServiceCall <em>Service Call</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getBreakOnShutdown <em>Break On Shutdown</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getCopy <em>Copy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getDoWhile <em>Do While</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getOnPrepare <em>On Prepare</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition()
 * @model extendedMetaData="name='loopDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LoopDefinition extends ProcessorDefinition {
	/**
	 * Returns the value of the '<em><b>Expression Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Definition</em>' containment reference.
	 * @see #setExpressionDefinition(Expression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_ExpressionDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expressionDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getExpressionDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getExpressionDefinition <em>Expression Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Definition</em>' containment reference.
	 * @see #getExpressionDefinition()
	 * @generated
	 */
	void setExpressionDefinition(Expression value);

	/**
	 * Returns the value of the '<em><b>Csimple</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluate a compiled simple expression.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Csimple</em>' containment reference.
	 * @see #setCsimple(CSimpleExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Csimple()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='csimple' namespace='##targetNamespace'"
	 * @generated
	 */
	CSimpleExpression getCsimple();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getCsimple <em>Csimple</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Csimple</em>' containment reference.
	 * @see #getCsimple()
	 * @generated
	 */
	void setCsimple(CSimpleExpression value);

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A fixed value set only once during the route startup.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constant</em>' containment reference.
	 * @see #setConstant(ConstantExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Constant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='constant' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstantExpression getConstant();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getConstant <em>Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' containment reference.
	 * @see #getConstant()
	 * @generated
	 */
	void setConstant(ConstantExpression value);

	/**
	 * Returns the value of the '<em><b>Datasonnet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use DataSonnet scripts for message transformations.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datasonnet</em>' containment reference.
	 * @see #setDatasonnet(DatasonnetExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Datasonnet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='datasonnet' namespace='##targetNamespace'"
	 * @generated
	 */
	DatasonnetExpression getDatasonnet();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getDatasonnet <em>Datasonnet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datasonnet</em>' containment reference.
	 * @see #getDatasonnet()
	 * @generated
	 */
	void setDatasonnet(DatasonnetExpression value);

	/**
	 * Returns the value of the '<em><b>Exchange Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Gets a property from the Exchange.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exchange Property</em>' containment reference.
	 * @see #setExchangeProperty(ExchangePropertyExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_ExchangeProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exchangeProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	ExchangePropertyExpression getExchangeProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getExchangeProperty <em>Exchange Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Property</em>' containment reference.
	 * @see #getExchangeProperty()
	 * @generated
	 */
	void setExchangeProperty(ExchangePropertyExpression value);

	/**
	 * Returns the value of the '<em><b>Groovy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluates a Groovy script.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Groovy</em>' containment reference.
	 * @see #setGroovy(GroovyExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Groovy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groovy' namespace='##targetNamespace'"
	 * @generated
	 */
	GroovyExpression getGroovy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getGroovy <em>Groovy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groovy</em>' containment reference.
	 * @see #getGroovy()
	 * @generated
	 */
	void setGroovy(GroovyExpression value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Gets a header from the Exchange.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(HeaderExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Header()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='header' namespace='##targetNamespace'"
	 * @generated
	 */
	HeaderExpression getHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(HeaderExpression value);

	/**
	 * Returns the value of the '<em><b>Hl7terser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Get the value of a HL7 message field specified by terse location specification syntax.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hl7terser</em>' containment reference.
	 * @see #setHl7terser(Hl7TerserExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Hl7terser()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hl7terser' namespace='##targetNamespace'"
	 * @generated
	 */
	Hl7TerserExpression getHl7terser();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getHl7terser <em>Hl7terser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hl7terser</em>' containment reference.
	 * @see #getHl7terser()
	 * @generated
	 */
	void setHl7terser(Hl7TerserExpression value);

	/**
	 * Returns the value of the '<em><b>Java</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluates a Java (Java compiled once at runtime) expression.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Java</em>' containment reference.
	 * @see #setJava(JavaExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Java()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='java' namespace='##targetNamespace'"
	 * @generated
	 */
	JavaExpression getJava();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getJava <em>Java</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java</em>' containment reference.
	 * @see #getJava()
	 * @generated
	 */
	void setJava(JavaExpression value);

	/**
	 * Returns the value of the '<em><b>Js</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluates a JavaScript expression.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Js</em>' containment reference.
	 * @see #setJs(JavaScriptExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Js()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='js' namespace='##targetNamespace'"
	 * @generated
	 */
	JavaScriptExpression getJs();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getJs <em>Js</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Js</em>' containment reference.
	 * @see #getJs()
	 * @generated
	 */
	void setJs(JavaScriptExpression value);

	/**
	 * Returns the value of the '<em><b>Joor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: Evaluates a jOOR (Java compiled once at runtime) expression.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Joor</em>' containment reference.
	 * @see #setJoor(JoorExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Joor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='joor' namespace='##targetNamespace'"
	 * @generated
	 */
	JoorExpression getJoor();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getJoor <em>Joor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Joor</em>' containment reference.
	 * @see #getJoor()
	 * @generated
	 */
	void setJoor(JoorExpression value);

	/**
	 * Returns the value of the '<em><b>Jq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluates a JQ expression against a JSON message body.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jq</em>' containment reference.
	 * @see #setJq(JqExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Jq()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jq' namespace='##targetNamespace'"
	 * @generated
	 */
	JqExpression getJq();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getJq <em>Jq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jq</em>' containment reference.
	 * @see #getJq()
	 * @generated
	 */
	void setJq(JqExpression value);

	/**
	 * Returns the value of the '<em><b>Jsonpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluates a JSONPath expression against a JSON message body.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jsonpath</em>' containment reference.
	 * @see #setJsonpath(JsonPathExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Jsonpath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jsonpath' namespace='##targetNamespace'"
	 * @generated
	 */
	JsonPathExpression getJsonpath();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getJsonpath <em>Jsonpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsonpath</em>' containment reference.
	 * @see #getJsonpath()
	 * @generated
	 */
	void setJsonpath(JsonPathExpression value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluates a custom language.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(LanguageExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Language()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	LanguageExpression getLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(LanguageExpression value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Calls a Java bean method.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(MethodCallExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Method()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	MethodCallExpression getMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(MethodCallExpression value);

	/**
	 * Returns the value of the '<em><b>Mvel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluates a MVEL template.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mvel</em>' containment reference.
	 * @see #setMvel(MvelExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Mvel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mvel' namespace='##targetNamespace'"
	 * @generated
	 */
	MvelExpression getMvel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getMvel <em>Mvel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mvel</em>' containment reference.
	 * @see #getMvel()
	 * @generated
	 */
	void setMvel(MvelExpression value);

	/**
	 * Returns the value of the '<em><b>Ognl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluates an OGNL expression (Apache Commons OGNL).
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ognl</em>' containment reference.
	 * @see #setOgnl(OgnlExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Ognl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ognl' namespace='##targetNamespace'"
	 * @generated
	 */
	OgnlExpression getOgnl();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getOgnl <em>Ognl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ognl</em>' containment reference.
	 * @see #getOgnl()
	 * @generated
	 */
	void setOgnl(OgnlExpression value);

	/**
	 * Returns the value of the '<em><b>Python</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluates a Python expression.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Python</em>' containment reference.
	 * @see #setPython(PythonExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Python()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='python' namespace='##targetNamespace'"
	 * @generated
	 */
	PythonExpression getPython();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getPython <em>Python</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Python</em>' containment reference.
	 * @see #getPython()
	 * @generated
	 */
	void setPython(PythonExpression value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Uses an existing expression from the registry.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' containment reference.
	 * @see #setRef(RefExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Ref()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ref' namespace='##targetNamespace'"
	 * @generated
	 */
	RefExpression getRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getRef <em>Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' containment reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(RefExpression value);

	/**
	 * Returns the value of the '<em><b>Simple</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluates a Camel simple expression.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Simple</em>' containment reference.
	 * @see #setSimple(SimpleExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Simple()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='simple' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleExpression getSimple();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getSimple <em>Simple</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple</em>' containment reference.
	 * @see #getSimple()
	 * @generated
	 */
	void setSimple(SimpleExpression value);

	/**
	 * Returns the value of the '<em><b>Spel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluates a Spring expression (SpEL).
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spel</em>' containment reference.
	 * @see #setSpel(SpELExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Spel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='spel' namespace='##targetNamespace'"
	 * @generated
	 */
	SpELExpression getSpel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getSpel <em>Spel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spel</em>' containment reference.
	 * @see #getSpel()
	 * @generated
	 */
	void setSpel(SpELExpression value);

	/**
	 * Returns the value of the '<em><b>Tokenize</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Tokenize text payloads using delimiter patterns.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tokenize</em>' containment reference.
	 * @see #setTokenize(TokenizerExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Tokenize()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tokenize' namespace='##targetNamespace'"
	 * @generated
	 */
	TokenizerExpression getTokenize();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getTokenize <em>Tokenize</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tokenize</em>' containment reference.
	 * @see #getTokenize()
	 * @generated
	 */
	void setTokenize(TokenizerExpression value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Gets a variable
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(VariableExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Variable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variable' namespace='##targetNamespace'"
	 * @generated
	 */
	VariableExpression getVariable();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(VariableExpression value);

	/**
	 * Returns the value of the '<em><b>Wasm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Call a wasm (web assembly) function.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wasm</em>' containment reference.
	 * @see #setWasm(WasmExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Wasm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wasm' namespace='##targetNamespace'"
	 * @generated
	 */
	WasmExpression getWasm();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getWasm <em>Wasm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wasm</em>' containment reference.
	 * @see #getWasm()
	 * @generated
	 */
	void setWasm(WasmExpression value);

	/**
	 * Returns the value of the '<em><b>Xtokenize</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Tokenize XML payloads.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xtokenize</em>' containment reference.
	 * @see #setXtokenize(XmlTokenizerExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Xtokenize()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xtokenize' namespace='##targetNamespace'"
	 * @generated
	 */
	XmlTokenizerExpression getXtokenize();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getXtokenize <em>Xtokenize</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xtokenize</em>' containment reference.
	 * @see #getXtokenize()
	 * @generated
	 */
	void setXtokenize(XmlTokenizerExpression value);

	/**
	 * Returns the value of the '<em><b>Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluates an XPath expression against an XML payload.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xpath</em>' containment reference.
	 * @see #setXpath(XPathExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Xpath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xpath' namespace='##targetNamespace'"
	 * @generated
	 */
	XPathExpression getXpath();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getXpath <em>Xpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xpath</em>' containment reference.
	 * @see #getXpath()
	 * @generated
	 */
	void setXpath(XPathExpression value);

	/**
	 * Returns the value of the '<em><b>Xquery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluates an XQuery expressions against an XML payload.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xquery</em>' containment reference.
	 * @see #setXquery(XQueryExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Xquery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xquery' namespace='##targetNamespace'"
	 * @generated
	 */
	XQueryExpression getXquery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getXquery <em>Xquery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xquery</em>' containment reference.
	 * @see #getXquery()
	 * @generated
	 */
	void setXquery(XQueryExpression value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Aggregate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='aggregate' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Bean()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bean' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_DoCatch()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doCatch' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Choice()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='choice' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_CircuitBreaker()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='circuitBreaker' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_ClaimCheck()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='claimCheck' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_ConvertBodyTo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='convertBodyTo' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_ConvertHeaderTo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='convertHeaderTo' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_ConvertVariableTo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='convertVariableTo' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Delay()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='delay' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_DynamicRouter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dynamicRouter' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Enrich()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='enrich' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Filter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_DoFinally()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doFinally' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_IdempotentConsumer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='idempotentConsumer' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Intercept()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='intercept' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_InterceptFrom()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interceptFrom' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_InterceptSendToEndpoint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interceptSendToEndpoint' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Kamelet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='kamelet' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_LoadBalance()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='loadBalance' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Log()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='log' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Loop()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='loop' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Marshal()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='marshal' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Multicast()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='multicast' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_OnCompletion()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='onCompletion' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_OnException()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='onException' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Pausable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pausable' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Pipeline()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pipeline' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Policy()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='policy' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Poll()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='poll' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_PollEnrich()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pollEnrich' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Process()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='process' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_RecipientList()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='recipientList' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_RemoveHeader()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeHeader' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_RemoveHeaders()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeHeaders' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_RemoveProperties()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeProperties' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_RemoveProperty()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeProperty' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_RemoveVariable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeVariable' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Resequence()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resequence' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Resumable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resumable' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Rollback()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rollback' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Route()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='route' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_RoutingSlip()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='routingSlip' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Saga()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='saga' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Sample()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sample' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Script()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='script' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_SetBody()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setBody' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_SetExchangePattern()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setExchangePattern' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_SetHeader()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setHeader' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_SetHeaders()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setHeaders' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_SetProperty()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setProperty' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_SetVariable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setVariable' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_SetVariables()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setVariables' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Sort()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sort' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Split()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='split' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Step()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='step' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Stop()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stop' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Threads()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='threads' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Throttle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='throttle' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_ThrowException()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='throwException' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_To()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='to' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_ToD()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='toD' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Tokenizer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tokenizer' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Transacted()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transacted' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Transform()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transform' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_DoTry()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doTry' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Unmarshal()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unmarshal' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Validate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='validate' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_WireTap()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='wireTap' namespace='##targetNamespace' group='#group:31'"
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_ServiceCall()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='serviceCall' namespace='##targetNamespace' group='#group:31'"
	 * @generated
	 */
	EList<ServiceCallDefinition> getServiceCall();

	/**
	 * Returns the value of the '<em><b>Break On Shutdown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If the breakOnShutdown attribute is true, then the loop will not iterate until it reaches the end when Camel is shut
	 * down. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Break On Shutdown</em>' attribute.
	 * @see #setBreakOnShutdown(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_BreakOnShutdown()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='breakOnShutdown'"
	 * @generated
	 */
	String getBreakOnShutdown();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getBreakOnShutdown <em>Break On Shutdown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Break On Shutdown</em>' attribute.
	 * @see #getBreakOnShutdown()
	 * @generated
	 */
	void setBreakOnShutdown(String value);

	/**
	 * Returns the value of the '<em><b>Copy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If the copy attribute is true, a copy of the input Exchange is used for each iteration. That means each iteration will
	 * start from a copy of the same message. By default loop will loop the same exchange all over, so each iteration may have
	 * different message content. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copy</em>' attribute.
	 * @see #setCopy(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_Copy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='copy'"
	 * @generated
	 */
	String getCopy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getCopy <em>Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy</em>' attribute.
	 * @see #getCopy()
	 * @generated
	 */
	void setCopy(String value);

	/**
	 * Returns the value of the '<em><b>Do While</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Enables the while loop that loops until the predicate evaluates to false or null. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Do While</em>' attribute.
	 * @see #setDoWhile(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_DoWhile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='doWhile'"
	 * @generated
	 */
	String getDoWhile();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getDoWhile <em>Do While</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do While</em>' attribute.
	 * @see #getDoWhile()
	 * @generated
	 */
	void setDoWhile(String value);

	/**
	 * Returns the value of the '<em><b>On Prepare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Uses the Processor when preparing the org.apache.camel.Exchange for each loop iteration. This can be used to deep-clone
	 * messages, or any custom logic needed before the looping executes.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Prepare</em>' attribute.
	 * @see #setOnPrepare(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoopDefinition_OnPrepare()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='onPrepare'"
	 * @generated
	 */
	String getOnPrepare();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition#getOnPrepare <em>On Prepare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Prepare</em>' attribute.
	 * @see #getOnPrepare()
	 * @generated
	 */
	void setOnPrepare(String value);

} // LoopDefinition
