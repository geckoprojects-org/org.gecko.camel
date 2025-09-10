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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipient List Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getExpressionDefinition <em>Expression Definition</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getCsimple <em>Csimple</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getDatasonnet <em>Datasonnet</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getExchangeProperty <em>Exchange Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getGroovy <em>Groovy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getHeader <em>Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getHl7terser <em>Hl7terser</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getJava <em>Java</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getJs <em>Js</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getJoor <em>Joor</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getJq <em>Jq</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getJsonpath <em>Jsonpath</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getMvel <em>Mvel</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getOgnl <em>Ognl</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getPython <em>Python</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getRef <em>Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getSpel <em>Spel</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getTokenize <em>Tokenize</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getWasm <em>Wasm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getXtokenize <em>Xtokenize</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getXpath <em>Xpath</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getXquery <em>Xquery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getAggregationStrategy <em>Aggregation Strategy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getAggregationStrategyMethodAllowNull <em>Aggregation Strategy Method Allow Null</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getAggregationStrategyMethodName <em>Aggregation Strategy Method Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getCacheSize <em>Cache Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getExecutorService <em>Executor Service</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getIgnoreInvalidEndpoints <em>Ignore Invalid Endpoints</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getOnPrepare <em>On Prepare</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getParallelAggregate <em>Parallel Aggregate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getParallelProcessing <em>Parallel Processing</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getShareUnitOfWork <em>Share Unit Of Work</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getStopOnException <em>Stop On Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getStreaming <em>Streaming</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getSynchronous <em>Synchronous</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getTimeout <em>Timeout</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition()
 * @model extendedMetaData="name='recipientListDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RecipientListDefinition extends ProcessorDefinition {
	/**
	 * Returns the value of the '<em><b>Expression Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Definition</em>' containment reference.
	 * @see #setExpressionDefinition(Expression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_ExpressionDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expressionDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getExpressionDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getExpressionDefinition <em>Expression Definition</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Csimple()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='csimple' namespace='##targetNamespace'"
	 * @generated
	 */
	CSimpleExpression getCsimple();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getCsimple <em>Csimple</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Constant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='constant' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstantExpression getConstant();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getConstant <em>Constant</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Datasonnet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='datasonnet' namespace='##targetNamespace'"
	 * @generated
	 */
	DatasonnetExpression getDatasonnet();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getDatasonnet <em>Datasonnet</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_ExchangeProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exchangeProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	ExchangePropertyExpression getExchangeProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getExchangeProperty <em>Exchange Property</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Groovy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groovy' namespace='##targetNamespace'"
	 * @generated
	 */
	GroovyExpression getGroovy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getGroovy <em>Groovy</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Header()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='header' namespace='##targetNamespace'"
	 * @generated
	 */
	HeaderExpression getHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getHeader <em>Header</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Hl7terser()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hl7terser' namespace='##targetNamespace'"
	 * @generated
	 */
	Hl7TerserExpression getHl7terser();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getHl7terser <em>Hl7terser</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Java()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='java' namespace='##targetNamespace'"
	 * @generated
	 */
	JavaExpression getJava();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getJava <em>Java</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Js()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='js' namespace='##targetNamespace'"
	 * @generated
	 */
	JavaScriptExpression getJs();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getJs <em>Js</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Joor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='joor' namespace='##targetNamespace'"
	 * @generated
	 */
	JoorExpression getJoor();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getJoor <em>Joor</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Jq()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jq' namespace='##targetNamespace'"
	 * @generated
	 */
	JqExpression getJq();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getJq <em>Jq</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Jsonpath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jsonpath' namespace='##targetNamespace'"
	 * @generated
	 */
	JsonPathExpression getJsonpath();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getJsonpath <em>Jsonpath</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Language()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	LanguageExpression getLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getLanguage <em>Language</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Method()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	MethodCallExpression getMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getMethod <em>Method</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Mvel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mvel' namespace='##targetNamespace'"
	 * @generated
	 */
	MvelExpression getMvel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getMvel <em>Mvel</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Ognl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ognl' namespace='##targetNamespace'"
	 * @generated
	 */
	OgnlExpression getOgnl();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getOgnl <em>Ognl</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Python()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='python' namespace='##targetNamespace'"
	 * @generated
	 */
	PythonExpression getPython();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getPython <em>Python</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Ref()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ref' namespace='##targetNamespace'"
	 * @generated
	 */
	RefExpression getRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getRef <em>Ref</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Simple()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='simple' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleExpression getSimple();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getSimple <em>Simple</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Spel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='spel' namespace='##targetNamespace'"
	 * @generated
	 */
	SpELExpression getSpel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getSpel <em>Spel</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Tokenize()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tokenize' namespace='##targetNamespace'"
	 * @generated
	 */
	TokenizerExpression getTokenize();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getTokenize <em>Tokenize</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Variable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variable' namespace='##targetNamespace'"
	 * @generated
	 */
	VariableExpression getVariable();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getVariable <em>Variable</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Wasm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wasm' namespace='##targetNamespace'"
	 * @generated
	 */
	WasmExpression getWasm();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getWasm <em>Wasm</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Xtokenize()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xtokenize' namespace='##targetNamespace'"
	 * @generated
	 */
	XmlTokenizerExpression getXtokenize();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getXtokenize <em>Xtokenize</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Xpath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xpath' namespace='##targetNamespace'"
	 * @generated
	 */
	XPathExpression getXpath();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getXpath <em>Xpath</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Xquery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xquery' namespace='##targetNamespace'"
	 * @generated
	 */
	XQueryExpression getXquery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getXquery <em>Xquery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xquery</em>' containment reference.
	 * @see #getXquery()
	 * @generated
	 */
	void setXquery(XQueryExpression value);

	/**
	 * Returns the value of the '<em><b>Aggregation Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the AggregationStrategy to be used to assemble the replies from the recipients, into a single outgoing message from
	 * the RecipientList. By default Camel will use the last reply as the outgoing message. You can also use a POJO as the
	 * AggregationStrategy.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregation Strategy</em>' attribute.
	 * @see #setAggregationStrategy(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_AggregationStrategy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='aggregationStrategy'"
	 * @generated
	 */
	String getAggregationStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getAggregationStrategy <em>Aggregation Strategy</em>}' attribute.
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
	 * If this option is false then the aggregate method is not used if there was no data to enrich. If this option is true
	 * then null values is used as the oldExchange (when no data to enrich), when using POJOs as the AggregationStrategy.
	 * Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregation Strategy Method Allow Null</em>' attribute.
	 * @see #setAggregationStrategyMethodAllowNull(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_AggregationStrategyMethodAllowNull()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='aggregationStrategyMethodAllowNull'"
	 * @generated
	 */
	String getAggregationStrategyMethodAllowNull();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getAggregationStrategyMethodAllowNull <em>Aggregation Strategy Method Allow Null</em>}' attribute.
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
	 * This option can be used to explicit declare the method name to use, when using POJOs as the AggregationStrategy.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregation Strategy Method Name</em>' attribute.
	 * @see #setAggregationStrategyMethodName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_AggregationStrategyMethodName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='aggregationStrategyMethodName'"
	 * @generated
	 */
	String getAggregationStrategyMethodName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getAggregationStrategyMethodName <em>Aggregation Strategy Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Strategy Method Name</em>' attribute.
	 * @see #getAggregationStrategyMethodName()
	 * @generated
	 */
	void setAggregationStrategyMethodName(String value);

	/**
	 * Returns the value of the '<em><b>Cache Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the maximum size used by the org.apache.camel.spi.ProducerCache which is used to cache and reuse producers when
	 * using this recipient list, when uris are reused. Beware that when using dynamic endpoints then it affects how well the
	 * cache can be utilized. If each dynamic endpoint is unique then its best to turn off caching by setting this to -1, which
	 * allows Camel to not cache both the producers and endpoints; they are regarded as prototype scoped and will be stopped
	 * and discarded after use. This reduces memory usage as otherwise producers/endpoints are stored in memory in the caches.
	 * However if there are a high degree of dynamic endpoints that have been used before, then it can benefit to use the cache
	 * to reuse both producers and endpoints and therefore the cache size can be set accordingly or rely on the default size
	 * (1000). If there is a mix of unique and used before dynamic endpoints, then setting a reasonable cache size can help
	 * reduce memory usage to avoid storing too many non frequent used producers.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cache Size</em>' attribute.
	 * @see #setCacheSize(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_CacheSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='cacheSize'"
	 * @generated
	 */
	String getCacheSize();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getCacheSize <em>Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Size</em>' attribute.
	 * @see #getCacheSize()
	 * @generated
	 */
	void setCacheSize(String value);

	/**
	 * Returns the value of the '<em><b>Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Delimiter used if the Expression returned multiple endpoints. Can be turned off using the value false. The default value
	 * is ,. Default value: ,
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delimiter</em>' attribute.
	 * @see #setDelimiter(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Delimiter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='delimiter'"
	 * @generated
	 */
	String getDelimiter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getDelimiter <em>Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimiter</em>' attribute.
	 * @see #getDelimiter()
	 * @generated
	 */
	void setDelimiter(String value);

	/**
	 * Returns the value of the '<em><b>Executor Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a custom Thread Pool to be used for parallel processing. Notice if you set this option, then parallel processing
	 * is automatic implied, and you do not have to enable that option as well.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Executor Service</em>' attribute.
	 * @see #setExecutorService(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_ExecutorService()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='executorService'"
	 * @generated
	 */
	String getExecutorService();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getExecutorService <em>Executor Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor Service</em>' attribute.
	 * @see #getExecutorService()
	 * @generated
	 */
	void setExecutorService(String value);

	/**
	 * Returns the value of the '<em><b>Ignore Invalid Endpoints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Ignore the invalidate endpoint exception when try to create a producer with that endpoint. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ignore Invalid Endpoints</em>' attribute.
	 * @see #setIgnoreInvalidEndpoints(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_IgnoreInvalidEndpoints()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ignoreInvalidEndpoints'"
	 * @generated
	 */
	String getIgnoreInvalidEndpoints();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getIgnoreInvalidEndpoints <em>Ignore Invalid Endpoints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Invalid Endpoints</em>' attribute.
	 * @see #getIgnoreInvalidEndpoints()
	 * @generated
	 */
	void setIgnoreInvalidEndpoints(String value);

	/**
	 * Returns the value of the '<em><b>On Prepare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Uses the Processor when preparing the org.apache.camel.Exchange to be used send. This can be used to deep-clone messages
	 * that should be send, or any custom logic needed before the exchange is send.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Prepare</em>' attribute.
	 * @see #setOnPrepare(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_OnPrepare()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='onPrepare'"
	 * @generated
	 */
	String getOnPrepare();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getOnPrepare <em>On Prepare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Prepare</em>' attribute.
	 * @see #getOnPrepare()
	 * @generated
	 */
	void setOnPrepare(String value);

	/**
	 * Returns the value of the '<em><b>Parallel Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: If enabled then the aggregate method on AggregationStrategy can be called concurrently. Notice that this
	 * would require the implementation of AggregationStrategy to be implemented as thread-safe. By default this is false
	 * meaning that Camel synchronizes the call to the aggregate method. Though in some use-cases this can be used to archive
	 * higher performance when the AggregationStrategy is implemented as thread-safe. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parallel Aggregate</em>' attribute.
	 * @see #setParallelAggregate(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_ParallelAggregate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='parallelAggregate'"
	 * @generated
	 */
	String getParallelAggregate();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getParallelAggregate <em>Parallel Aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallel Aggregate</em>' attribute.
	 * @see #getParallelAggregate()
	 * @generated
	 */
	void setParallelAggregate(String value);

	/**
	 * Returns the value of the '<em><b>Parallel Processing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If enabled then sending messages to the recipients occurs concurrently. Note the caller thread will still wait until all
	 * messages has been fully processed, before it continues. Its only the sending and processing the replies from the
	 * recipients which happens concurrently. When parallel processing is enabled, then the Camel routing engin will continue
	 * processing using last used thread from the parallel thread pool. However, if you want to use the original thread that
	 * called the recipient list, then make sure to enable the synchronous option as well. In parallel processing mode, you may
	 * want to also synchronous = true to force this EIP to process the sub-tasks using the upper bounds of the thread-pool. If
	 * using synchronous = false then Camel will allow its reactive routing engine to use as many threads as possible, which
	 * may be available due to sub-tasks using other thread-pools such as CompletableFuture.runAsync or others. Default value:
	 * false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parallel Processing</em>' attribute.
	 * @see #setParallelProcessing(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_ParallelProcessing()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='parallelProcessing'"
	 * @generated
	 */
	String getParallelProcessing();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getParallelProcessing <em>Parallel Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallel Processing</em>' attribute.
	 * @see #getParallelProcessing()
	 * @generated
	 */
	void setParallelProcessing(String value);

	/**
	 * Returns the value of the '<em><b>Share Unit Of Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Shares the org.apache.camel.spi.UnitOfWork with the parent and each of the sub messages. Recipient List will by default
	 * not share unit of work between the parent exchange and each recipient exchange. This means each sub exchange has its own
	 * individual unit of work. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Share Unit Of Work</em>' attribute.
	 * @see #setShareUnitOfWork(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_ShareUnitOfWork()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='shareUnitOfWork'"
	 * @generated
	 */
	String getShareUnitOfWork();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getShareUnitOfWork <em>Share Unit Of Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Share Unit Of Work</em>' attribute.
	 * @see #getShareUnitOfWork()
	 * @generated
	 */
	void setShareUnitOfWork(String value);

	/**
	 * Returns the value of the '<em><b>Stop On Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Will now stop further processing if an exception or failure occurred during processing of an org.apache.camel.Exchange
	 * and the caused exception will be thrown. Will also stop if processing the exchange failed (has a fault message) or an
	 * exception was thrown and handled by the error handler (such as using onException). In all situations the recipient list
	 * will stop further processing. This is the same behavior as in pipeline, which is used by the routing engine. The default
	 * behavior is to not stop but continue processing till the end. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stop On Exception</em>' attribute.
	 * @see #setStopOnException(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_StopOnException()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='stopOnException'"
	 * @generated
	 */
	String getStopOnException();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getStopOnException <em>Stop On Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop On Exception</em>' attribute.
	 * @see #getStopOnException()
	 * @generated
	 */
	void setStopOnException(String value);

	/**
	 * Returns the value of the '<em><b>Streaming</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If enabled then Camel will process replies out-of-order, eg in the order they come back. If disabled, Camel will process
	 * replies in the same order as defined by the recipient list. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Streaming</em>' attribute.
	 * @see #setStreaming(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Streaming()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='streaming'"
	 * @generated
	 */
	String getStreaming();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getStreaming <em>Streaming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Streaming</em>' attribute.
	 * @see #getStreaming()
	 * @generated
	 */
	void setStreaming(String value);

	/**
	 * Returns the value of the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether synchronous processing should be strictly used. When enabled then the same thread is used to continue
	 * routing after the recipient list is complete, even if parallel processing is enabled. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Synchronous</em>' attribute.
	 * @see #setSynchronous(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Synchronous()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='synchronous'"
	 * @generated
	 */
	String getSynchronous();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getSynchronous <em>Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronous</em>' attribute.
	 * @see #getSynchronous()
	 * @generated
	 */
	void setSynchronous(String value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets a total timeout specified in millis, when using parallel processing. If the Recipient List hasn't been able to send
	 * and process all replies within the given timeframe, then the timeout triggers and the Recipient List breaks out and
	 * continues. Notice if you provide a TimeoutAwareAggregationStrategy then the timeout method is invoked before breaking
	 * out. If the timeout is reached with running tasks still remaining, certain tasks for which it is difficult for Camel to
	 * shut down in a graceful manner may continue to run. So use this option with a bit of care. Default value: 0
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRecipientListDefinition_Timeout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='timeout'"
	 * @generated
	 */
	String getTimeout();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(String value);

} // RecipientListDefinition
