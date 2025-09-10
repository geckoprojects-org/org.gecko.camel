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
 * A representation of the model object '<em><b>Validate Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getExpressionDefinition <em>Expression Definition</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getCsimple <em>Csimple</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getDatasonnet <em>Datasonnet</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getExchangeProperty <em>Exchange Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getGroovy <em>Groovy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getHeader <em>Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getHl7terser <em>Hl7terser</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getJava <em>Java</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getJs <em>Js</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getJoor <em>Joor</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getJq <em>Jq</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getJsonpath <em>Jsonpath</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getMvel <em>Mvel</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getOgnl <em>Ognl</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getPython <em>Python</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getRef <em>Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getSpel <em>Spel</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getTokenize <em>Tokenize</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getWasm <em>Wasm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getXtokenize <em>Xtokenize</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getXpath <em>Xpath</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getXquery <em>Xquery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getPredicateExceptionFactory <em>Predicate Exception Factory</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition()
 * @model extendedMetaData="name='validateDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ValidateDefinition extends ProcessorDefinition {
	/**
	 * Returns the value of the '<em><b>Expression Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Definition</em>' containment reference.
	 * @see #setExpressionDefinition(Expression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_ExpressionDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expressionDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getExpressionDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getExpressionDefinition <em>Expression Definition</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_Csimple()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='csimple' namespace='##targetNamespace'"
	 * @generated
	 */
	CSimpleExpression getCsimple();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getCsimple <em>Csimple</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_Constant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='constant' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstantExpression getConstant();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getConstant <em>Constant</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_Datasonnet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='datasonnet' namespace='##targetNamespace'"
	 * @generated
	 */
	DatasonnetExpression getDatasonnet();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getDatasonnet <em>Datasonnet</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_ExchangeProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exchangeProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	ExchangePropertyExpression getExchangeProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getExchangeProperty <em>Exchange Property</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_Groovy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groovy' namespace='##targetNamespace'"
	 * @generated
	 */
	GroovyExpression getGroovy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getGroovy <em>Groovy</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_Header()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='header' namespace='##targetNamespace'"
	 * @generated
	 */
	HeaderExpression getHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getHeader <em>Header</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_Hl7terser()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hl7terser' namespace='##targetNamespace'"
	 * @generated
	 */
	Hl7TerserExpression getHl7terser();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getHl7terser <em>Hl7terser</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_Java()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='java' namespace='##targetNamespace'"
	 * @generated
	 */
	JavaExpression getJava();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getJava <em>Java</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_Js()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='js' namespace='##targetNamespace'"
	 * @generated
	 */
	JavaScriptExpression getJs();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getJs <em>Js</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_Joor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='joor' namespace='##targetNamespace'"
	 * @generated
	 */
	JoorExpression getJoor();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getJoor <em>Joor</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_Jq()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jq' namespace='##targetNamespace'"
	 * @generated
	 */
	JqExpression getJq();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getJq <em>Jq</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_Jsonpath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jsonpath' namespace='##targetNamespace'"
	 * @generated
	 */
	JsonPathExpression getJsonpath();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getJsonpath <em>Jsonpath</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_Language()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	LanguageExpression getLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getLanguage <em>Language</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_Method()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	MethodCallExpression getMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getMethod <em>Method</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_Mvel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mvel' namespace='##targetNamespace'"
	 * @generated
	 */
	MvelExpression getMvel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getMvel <em>Mvel</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_Ognl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ognl' namespace='##targetNamespace'"
	 * @generated
	 */
	OgnlExpression getOgnl();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getOgnl <em>Ognl</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_Python()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='python' namespace='##targetNamespace'"
	 * @generated
	 */
	PythonExpression getPython();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getPython <em>Python</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_Ref()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ref' namespace='##targetNamespace'"
	 * @generated
	 */
	RefExpression getRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getRef <em>Ref</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_Simple()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='simple' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleExpression getSimple();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getSimple <em>Simple</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_Spel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='spel' namespace='##targetNamespace'"
	 * @generated
	 */
	SpELExpression getSpel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getSpel <em>Spel</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_Tokenize()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tokenize' namespace='##targetNamespace'"
	 * @generated
	 */
	TokenizerExpression getTokenize();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getTokenize <em>Tokenize</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_Variable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variable' namespace='##targetNamespace'"
	 * @generated
	 */
	VariableExpression getVariable();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getVariable <em>Variable</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_Wasm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wasm' namespace='##targetNamespace'"
	 * @generated
	 */
	WasmExpression getWasm();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getWasm <em>Wasm</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_Xtokenize()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xtokenize' namespace='##targetNamespace'"
	 * @generated
	 */
	XmlTokenizerExpression getXtokenize();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getXtokenize <em>Xtokenize</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_Xpath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xpath' namespace='##targetNamespace'"
	 * @generated
	 */
	XPathExpression getXpath();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getXpath <em>Xpath</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_Xquery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xquery' namespace='##targetNamespace'"
	 * @generated
	 */
	XQueryExpression getXquery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getXquery <em>Xquery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xquery</em>' containment reference.
	 * @see #getXquery()
	 * @generated
	 */
	void setXquery(XQueryExpression value);

	/**
	 * Returns the value of the '<em><b>Predicate Exception Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The bean id of custom PredicateExceptionFactory to use for creating the exception when the validation fails. By default,
	 * Camel will throw PredicateValidationException. By using a custom factory you can control which exception to throw
	 * instead.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Predicate Exception Factory</em>' attribute.
	 * @see #setPredicateExceptionFactory(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidateDefinition_PredicateExceptionFactory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='predicateExceptionFactory'"
	 * @generated
	 */
	String getPredicateExceptionFactory();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition#getPredicateExceptionFactory <em>Predicate Exception Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate Exception Factory</em>' attribute.
	 * @see #getPredicateExceptionFactory()
	 * @generated
	 */
	void setPredicateExceptionFactory(String value);

} // ValidateDefinition
