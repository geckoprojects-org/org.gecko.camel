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
 * A representation of the model object '<em><b>Enrich Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getExpressionDefinition <em>Expression Definition</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getCsimple <em>Csimple</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getDatasonnet <em>Datasonnet</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getExchangeProperty <em>Exchange Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getGroovy <em>Groovy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getHeader <em>Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getHl7terser <em>Hl7terser</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getJava <em>Java</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getJs <em>Js</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getJoor <em>Joor</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getJq <em>Jq</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getJsonpath <em>Jsonpath</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getMvel <em>Mvel</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getOgnl <em>Ognl</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getPython <em>Python</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getRef <em>Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getSpel <em>Spel</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getTokenize <em>Tokenize</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getWasm <em>Wasm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getXtokenize <em>Xtokenize</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getXpath <em>Xpath</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getXquery <em>Xquery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getAggregateOnException <em>Aggregate On Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getAggregationStrategy <em>Aggregation Strategy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getAggregationStrategyMethodAllowNull <em>Aggregation Strategy Method Allow Null</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getAggregationStrategyMethodName <em>Aggregation Strategy Method Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getAllowOptimisedComponents <em>Allow Optimised Components</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getAutoStartComponents <em>Auto Start Components</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getCacheSize <em>Cache Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getIgnoreInvalidEndpoint <em>Ignore Invalid Endpoint</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getShareUnitOfWork <em>Share Unit Of Work</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getVariableReceive <em>Variable Receive</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getVariableSend <em>Variable Send</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition()
 * @model extendedMetaData="name='enrichDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EnrichDefinition extends ProcessorDefinition {
	/**
	 * Returns the value of the '<em><b>Expression Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Definition</em>' containment reference.
	 * @see #setExpressionDefinition(Expression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_ExpressionDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expressionDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getExpressionDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getExpressionDefinition <em>Expression Definition</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_Csimple()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='csimple' namespace='##targetNamespace'"
	 * @generated
	 */
	CSimpleExpression getCsimple();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getCsimple <em>Csimple</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_Constant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='constant' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstantExpression getConstant();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getConstant <em>Constant</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_Datasonnet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='datasonnet' namespace='##targetNamespace'"
	 * @generated
	 */
	DatasonnetExpression getDatasonnet();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getDatasonnet <em>Datasonnet</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_ExchangeProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exchangeProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	ExchangePropertyExpression getExchangeProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getExchangeProperty <em>Exchange Property</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_Groovy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groovy' namespace='##targetNamespace'"
	 * @generated
	 */
	GroovyExpression getGroovy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getGroovy <em>Groovy</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_Header()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='header' namespace='##targetNamespace'"
	 * @generated
	 */
	HeaderExpression getHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getHeader <em>Header</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_Hl7terser()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hl7terser' namespace='##targetNamespace'"
	 * @generated
	 */
	Hl7TerserExpression getHl7terser();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getHl7terser <em>Hl7terser</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_Java()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='java' namespace='##targetNamespace'"
	 * @generated
	 */
	JavaExpression getJava();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getJava <em>Java</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_Js()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='js' namespace='##targetNamespace'"
	 * @generated
	 */
	JavaScriptExpression getJs();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getJs <em>Js</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_Joor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='joor' namespace='##targetNamespace'"
	 * @generated
	 */
	JoorExpression getJoor();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getJoor <em>Joor</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_Jq()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jq' namespace='##targetNamespace'"
	 * @generated
	 */
	JqExpression getJq();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getJq <em>Jq</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_Jsonpath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jsonpath' namespace='##targetNamespace'"
	 * @generated
	 */
	JsonPathExpression getJsonpath();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getJsonpath <em>Jsonpath</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_Language()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	LanguageExpression getLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getLanguage <em>Language</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_Method()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	MethodCallExpression getMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getMethod <em>Method</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_Mvel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mvel' namespace='##targetNamespace'"
	 * @generated
	 */
	MvelExpression getMvel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getMvel <em>Mvel</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_Ognl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ognl' namespace='##targetNamespace'"
	 * @generated
	 */
	OgnlExpression getOgnl();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getOgnl <em>Ognl</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_Python()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='python' namespace='##targetNamespace'"
	 * @generated
	 */
	PythonExpression getPython();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getPython <em>Python</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_Ref()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ref' namespace='##targetNamespace'"
	 * @generated
	 */
	RefExpression getRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getRef <em>Ref</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_Simple()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='simple' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleExpression getSimple();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getSimple <em>Simple</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_Spel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='spel' namespace='##targetNamespace'"
	 * @generated
	 */
	SpELExpression getSpel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getSpel <em>Spel</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_Tokenize()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tokenize' namespace='##targetNamespace'"
	 * @generated
	 */
	TokenizerExpression getTokenize();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getTokenize <em>Tokenize</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_Variable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variable' namespace='##targetNamespace'"
	 * @generated
	 */
	VariableExpression getVariable();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getVariable <em>Variable</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_Wasm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wasm' namespace='##targetNamespace'"
	 * @generated
	 */
	WasmExpression getWasm();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getWasm <em>Wasm</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_Xtokenize()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xtokenize' namespace='##targetNamespace'"
	 * @generated
	 */
	XmlTokenizerExpression getXtokenize();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getXtokenize <em>Xtokenize</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_Xpath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xpath' namespace='##targetNamespace'"
	 * @generated
	 */
	XPathExpression getXpath();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getXpath <em>Xpath</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_Xquery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xquery' namespace='##targetNamespace'"
	 * @generated
	 */
	XQueryExpression getXquery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getXquery <em>Xquery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xquery</em>' containment reference.
	 * @see #getXquery()
	 * @generated
	 */
	void setXquery(XQueryExpression value);

	/**
	 * Returns the value of the '<em><b>Aggregate On Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If this option is false then the aggregate method is not used if there was an exception thrown while trying to retrieve
	 * the data to enrich from the resource. Setting this option to true allows end users to control what to do if there was an
	 * exception in the aggregate method. For example to suppress the exception or set a custom message body etc. Default
	 * value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregate On Exception</em>' attribute.
	 * @see #setAggregateOnException(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_AggregateOnException()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='aggregateOnException'"
	 * @generated
	 */
	String getAggregateOnException();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getAggregateOnException <em>Aggregate On Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate On Exception</em>' attribute.
	 * @see #getAggregateOnException()
	 * @generated
	 */
	void setAggregateOnException(String value);

	/**
	 * Returns the value of the '<em><b>Aggregation Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the AggregationStrategy to be used to merge the reply from the external service, into a single outgoing message. By
	 * default Camel will use the reply from the external service as outgoing message.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregation Strategy</em>' attribute.
	 * @see #setAggregationStrategy(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_AggregationStrategy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='aggregationStrategy'"
	 * @generated
	 */
	String getAggregationStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getAggregationStrategy <em>Aggregation Strategy</em>}' attribute.
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
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregation Strategy Method Allow Null</em>' attribute.
	 * @see #setAggregationStrategyMethodAllowNull(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_AggregationStrategyMethodAllowNull()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='aggregationStrategyMethodAllowNull'"
	 * @generated
	 */
	String getAggregationStrategyMethodAllowNull();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getAggregationStrategyMethodAllowNull <em>Aggregation Strategy Method Allow Null</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_AggregationStrategyMethodName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='aggregationStrategyMethodName'"
	 * @generated
	 */
	String getAggregationStrategyMethodName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getAggregationStrategyMethodName <em>Aggregation Strategy Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Strategy Method Name</em>' attribute.
	 * @see #getAggregationStrategyMethodName()
	 * @generated
	 */
	void setAggregationStrategyMethodName(String value);

	/**
	 * Returns the value of the '<em><b>Allow Optimised Components</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to allow components to optimise enricher if they are org.apache.camel.spi.SendDynamicAware. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Optimised Components</em>' attribute.
	 * @see #setAllowOptimisedComponents(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_AllowOptimisedComponents()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowOptimisedComponents'"
	 * @generated
	 */
	String getAllowOptimisedComponents();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getAllowOptimisedComponents <em>Allow Optimised Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Optimised Components</em>' attribute.
	 * @see #getAllowOptimisedComponents()
	 * @generated
	 */
	void setAllowOptimisedComponents(String value);

	/**
	 * Returns the value of the '<em><b>Auto Start Components</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to auto startup components when enricher is starting up. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Start Components</em>' attribute.
	 * @see #setAutoStartComponents(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_AutoStartComponents()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='autoStartComponents'"
	 * @generated
	 */
	String getAutoStartComponents();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getAutoStartComponents <em>Auto Start Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Start Components</em>' attribute.
	 * @see #getAutoStartComponents()
	 * @generated
	 */
	void setAutoStartComponents(String value);

	/**
	 * Returns the value of the '<em><b>Cache Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the maximum size used by the org.apache.camel.spi.ProducerCache which is used to cache and reuse producer when uris
	 * are reused. Beware that when using dynamic endpoints then it affects how well the cache can be utilized. If each dynamic
	 * endpoint is unique then its best to turn off caching by setting this to -1, which allows Camel to not cache both the
	 * producers and endpoints; they are regarded as prototype scoped and will be stopped and discarded after use. This reduces
	 * memory usage as otherwise producers/endpoints are stored in memory in the caches. However if there are a high degree of
	 * dynamic endpoints that have been used before, then it can benefit to use the cache to reuse both producers and endpoints
	 * and therefore the cache size can be set accordingly or rely on the default size (1000). If there is a mix of unique and
	 * used before dynamic endpoints, then setting a reasonable cache size can help reduce memory usage to avoid storing too
	 * many non frequent used producers.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cache Size</em>' attribute.
	 * @see #setCacheSize(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_CacheSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='cacheSize'"
	 * @generated
	 */
	String getCacheSize();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getCacheSize <em>Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Size</em>' attribute.
	 * @see #getCacheSize()
	 * @generated
	 */
	void setCacheSize(String value);

	/**
	 * Returns the value of the '<em><b>Ignore Invalid Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Ignore the invalidate endpoint exception when try to create a producer with that endpoint. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ignore Invalid Endpoint</em>' attribute.
	 * @see #setIgnoreInvalidEndpoint(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_IgnoreInvalidEndpoint()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ignoreInvalidEndpoint'"
	 * @generated
	 */
	String getIgnoreInvalidEndpoint();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getIgnoreInvalidEndpoint <em>Ignore Invalid Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Invalid Endpoint</em>' attribute.
	 * @see #getIgnoreInvalidEndpoint()
	 * @generated
	 */
	void setIgnoreInvalidEndpoint(String value);

	/**
	 * Returns the value of the '<em><b>Share Unit Of Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Shares the org.apache.camel.spi.UnitOfWork with the parent and the resource exchange. Enrich will by default not share
	 * unit of work between the parent exchange and the resource exchange. This means the resource exchange has its own
	 * individual unit of work. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Share Unit Of Work</em>' attribute.
	 * @see #setShareUnitOfWork(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_ShareUnitOfWork()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='shareUnitOfWork'"
	 * @generated
	 */
	String getShareUnitOfWork();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getShareUnitOfWork <em>Share Unit Of Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Share Unit Of Work</em>' attribute.
	 * @see #getShareUnitOfWork()
	 * @generated
	 */
	void setShareUnitOfWork(String value);

	/**
	 * Returns the value of the '<em><b>Variable Receive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a variable as the source for the message body to send. This makes it handy to use variables for user data and to
	 * easily control what data to use for sending and receiving. Important: When using send variable then the message body is
	 * taken from this variable instead of the current message, however the headers from the message will still be used as
	 * well. In other words, the variable is used instead of the message body, but everything else is as usual.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable Receive</em>' attribute.
	 * @see #setVariableReceive(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_VariableReceive()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='variableReceive'"
	 * @generated
	 */
	String getVariableReceive();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getVariableReceive <em>Variable Receive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Receive</em>' attribute.
	 * @see #getVariableReceive()
	 * @generated
	 */
	void setVariableReceive(String value);

	/**
	 * Returns the value of the '<em><b>Variable Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a variable to store the received message body (only body, not headers). This makes it handy to use variables for
	 * user data and to easily control what data to use for sending and receiving. Important: When using receive variable then
	 * the received body is stored only in this variable and not on the current message.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable Send</em>' attribute.
	 * @see #setVariableSend(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getEnrichDefinition_VariableSend()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='variableSend'"
	 * @generated
	 */
	String getVariableSend();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition#getVariableSend <em>Variable Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Send</em>' attribute.
	 * @see #getVariableSend()
	 * @generated
	 */
	void setVariableSend(String value);

} // EnrichDefinition
