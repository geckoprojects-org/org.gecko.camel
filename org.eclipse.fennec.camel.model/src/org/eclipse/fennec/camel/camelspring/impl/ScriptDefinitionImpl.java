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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.camel.camelspring.CSimpleExpression;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.ConstantExpression;
import org.eclipse.fennec.camel.camelspring.DatasonnetExpression;
import org.eclipse.fennec.camel.camelspring.ExchangePropertyExpression;
import org.eclipse.fennec.camel.camelspring.Expression;
import org.eclipse.fennec.camel.camelspring.GroovyExpression;
import org.eclipse.fennec.camel.camelspring.HeaderExpression;
import org.eclipse.fennec.camel.camelspring.Hl7TerserExpression;
import org.eclipse.fennec.camel.camelspring.JavaExpression;
import org.eclipse.fennec.camel.camelspring.JavaScriptExpression;
import org.eclipse.fennec.camel.camelspring.JoorExpression;
import org.eclipse.fennec.camel.camelspring.JqExpression;
import org.eclipse.fennec.camel.camelspring.JsonPathExpression;
import org.eclipse.fennec.camel.camelspring.LanguageExpression;
import org.eclipse.fennec.camel.camelspring.MethodCallExpression;
import org.eclipse.fennec.camel.camelspring.MvelExpression;
import org.eclipse.fennec.camel.camelspring.OgnlExpression;
import org.eclipse.fennec.camel.camelspring.PythonExpression;
import org.eclipse.fennec.camel.camelspring.RefExpression;
import org.eclipse.fennec.camel.camelspring.ScriptDefinition;
import org.eclipse.fennec.camel.camelspring.SimpleExpression;
import org.eclipse.fennec.camel.camelspring.SpELExpression;
import org.eclipse.fennec.camel.camelspring.TokenizerExpression;
import org.eclipse.fennec.camel.camelspring.VariableExpression;
import org.eclipse.fennec.camel.camelspring.WasmExpression;
import org.eclipse.fennec.camel.camelspring.XPathExpression;
import org.eclipse.fennec.camel.camelspring.XQueryExpression;
import org.eclipse.fennec.camel.camelspring.XmlTokenizerExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getExpressionDefinition <em>Expression Definition</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getCsimple <em>Csimple</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getDatasonnet <em>Datasonnet</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getExchangeProperty <em>Exchange Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getGroovy <em>Groovy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getHl7terser <em>Hl7terser</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getJava <em>Java</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getJs <em>Js</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getJoor <em>Joor</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getJq <em>Jq</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getJsonpath <em>Jsonpath</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getMvel <em>Mvel</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getOgnl <em>Ognl</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getPython <em>Python</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getSpel <em>Spel</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getTokenize <em>Tokenize</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getWasm <em>Wasm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getXtokenize <em>Xtokenize</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getXpath <em>Xpath</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ScriptDefinitionImpl#getXquery <em>Xquery</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptDefinitionImpl extends ProcessorDefinitionImpl implements ScriptDefinition {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getScriptDefinition();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__EXPRESSION_DEFINITION, oldExpressionDefinition, newExpressionDefinition);
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
				msgs = ((InternalEObject)expressionDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__EXPRESSION_DEFINITION, null, msgs);
			if (newExpressionDefinition != null)
				msgs = ((InternalEObject)newExpressionDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__EXPRESSION_DEFINITION, null, msgs);
			msgs = basicSetExpressionDefinition(newExpressionDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__EXPRESSION_DEFINITION, newExpressionDefinition, newExpressionDefinition));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__CSIMPLE, oldCsimple, newCsimple);
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
				msgs = ((InternalEObject)csimple).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__CSIMPLE, null, msgs);
			if (newCsimple != null)
				msgs = ((InternalEObject)newCsimple).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__CSIMPLE, null, msgs);
			msgs = basicSetCsimple(newCsimple, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__CSIMPLE, newCsimple, newCsimple));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__CONSTANT, oldConstant, newConstant);
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
				msgs = ((InternalEObject)constant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__CONSTANT, null, msgs);
			if (newConstant != null)
				msgs = ((InternalEObject)newConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__CONSTANT, null, msgs);
			msgs = basicSetConstant(newConstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__CONSTANT, newConstant, newConstant));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__DATASONNET, oldDatasonnet, newDatasonnet);
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
				msgs = ((InternalEObject)datasonnet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__DATASONNET, null, msgs);
			if (newDatasonnet != null)
				msgs = ((InternalEObject)newDatasonnet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__DATASONNET, null, msgs);
			msgs = basicSetDatasonnet(newDatasonnet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__DATASONNET, newDatasonnet, newDatasonnet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__EXCHANGE_PROPERTY, oldExchangeProperty, newExchangeProperty);
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
				msgs = ((InternalEObject)exchangeProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__EXCHANGE_PROPERTY, null, msgs);
			if (newExchangeProperty != null)
				msgs = ((InternalEObject)newExchangeProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__EXCHANGE_PROPERTY, null, msgs);
			msgs = basicSetExchangeProperty(newExchangeProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__EXCHANGE_PROPERTY, newExchangeProperty, newExchangeProperty));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__GROOVY, oldGroovy, newGroovy);
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
				msgs = ((InternalEObject)groovy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__GROOVY, null, msgs);
			if (newGroovy != null)
				msgs = ((InternalEObject)newGroovy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__GROOVY, null, msgs);
			msgs = basicSetGroovy(newGroovy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__GROOVY, newGroovy, newGroovy));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__HEADER, oldHeader, newHeader);
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
				msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__HEADER, null, msgs);
			if (newHeader != null)
				msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__HEADER, null, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__HEADER, newHeader, newHeader));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__HL7TERSER, oldHl7terser, newHl7terser);
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
				msgs = ((InternalEObject)hl7terser).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__HL7TERSER, null, msgs);
			if (newHl7terser != null)
				msgs = ((InternalEObject)newHl7terser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__HL7TERSER, null, msgs);
			msgs = basicSetHl7terser(newHl7terser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__HL7TERSER, newHl7terser, newHl7terser));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__JAVA, oldJava, newJava);
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
				msgs = ((InternalEObject)java).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__JAVA, null, msgs);
			if (newJava != null)
				msgs = ((InternalEObject)newJava).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__JAVA, null, msgs);
			msgs = basicSetJava(newJava, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__JAVA, newJava, newJava));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__JS, oldJs, newJs);
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
				msgs = ((InternalEObject)js).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__JS, null, msgs);
			if (newJs != null)
				msgs = ((InternalEObject)newJs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__JS, null, msgs);
			msgs = basicSetJs(newJs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__JS, newJs, newJs));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__JOOR, oldJoor, newJoor);
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
				msgs = ((InternalEObject)joor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__JOOR, null, msgs);
			if (newJoor != null)
				msgs = ((InternalEObject)newJoor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__JOOR, null, msgs);
			msgs = basicSetJoor(newJoor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__JOOR, newJoor, newJoor));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__JQ, oldJq, newJq);
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
				msgs = ((InternalEObject)jq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__JQ, null, msgs);
			if (newJq != null)
				msgs = ((InternalEObject)newJq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__JQ, null, msgs);
			msgs = basicSetJq(newJq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__JQ, newJq, newJq));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__JSONPATH, oldJsonpath, newJsonpath);
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
				msgs = ((InternalEObject)jsonpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__JSONPATH, null, msgs);
			if (newJsonpath != null)
				msgs = ((InternalEObject)newJsonpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__JSONPATH, null, msgs);
			msgs = basicSetJsonpath(newJsonpath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__JSONPATH, newJsonpath, newJsonpath));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__LANGUAGE, oldLanguage, newLanguage);
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
				msgs = ((InternalEObject)language).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__LANGUAGE, null, msgs);
			if (newLanguage != null)
				msgs = ((InternalEObject)newLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__LANGUAGE, null, msgs);
			msgs = basicSetLanguage(newLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__LANGUAGE, newLanguage, newLanguage));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__METHOD, oldMethod, newMethod);
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
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__METHOD, newMethod, newMethod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__MVEL, oldMvel, newMvel);
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
				msgs = ((InternalEObject)mvel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__MVEL, null, msgs);
			if (newMvel != null)
				msgs = ((InternalEObject)newMvel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__MVEL, null, msgs);
			msgs = basicSetMvel(newMvel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__MVEL, newMvel, newMvel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__OGNL, oldOgnl, newOgnl);
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
				msgs = ((InternalEObject)ognl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__OGNL, null, msgs);
			if (newOgnl != null)
				msgs = ((InternalEObject)newOgnl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__OGNL, null, msgs);
			msgs = basicSetOgnl(newOgnl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__OGNL, newOgnl, newOgnl));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__PYTHON, oldPython, newPython);
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
				msgs = ((InternalEObject)python).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__PYTHON, null, msgs);
			if (newPython != null)
				msgs = ((InternalEObject)newPython).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__PYTHON, null, msgs);
			msgs = basicSetPython(newPython, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__PYTHON, newPython, newPython));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__REF, oldRef, newRef);
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
				msgs = ((InternalEObject)ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__REF, null, msgs);
			if (newRef != null)
				msgs = ((InternalEObject)newRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__REF, null, msgs);
			msgs = basicSetRef(newRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__REF, newRef, newRef));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__SIMPLE, oldSimple, newSimple);
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
				msgs = ((InternalEObject)simple).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__SIMPLE, null, msgs);
			if (newSimple != null)
				msgs = ((InternalEObject)newSimple).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__SIMPLE, null, msgs);
			msgs = basicSetSimple(newSimple, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__SIMPLE, newSimple, newSimple));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__SPEL, oldSpel, newSpel);
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
				msgs = ((InternalEObject)spel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__SPEL, null, msgs);
			if (newSpel != null)
				msgs = ((InternalEObject)newSpel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__SPEL, null, msgs);
			msgs = basicSetSpel(newSpel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__SPEL, newSpel, newSpel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__TOKENIZE, oldTokenize, newTokenize);
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
				msgs = ((InternalEObject)tokenize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__TOKENIZE, null, msgs);
			if (newTokenize != null)
				msgs = ((InternalEObject)newTokenize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__TOKENIZE, null, msgs);
			msgs = basicSetTokenize(newTokenize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__TOKENIZE, newTokenize, newTokenize));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__VARIABLE, oldVariable, newVariable);
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
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__VARIABLE, newVariable, newVariable));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__WASM, oldWasm, newWasm);
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
				msgs = ((InternalEObject)wasm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__WASM, null, msgs);
			if (newWasm != null)
				msgs = ((InternalEObject)newWasm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__WASM, null, msgs);
			msgs = basicSetWasm(newWasm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__WASM, newWasm, newWasm));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__XTOKENIZE, oldXtokenize, newXtokenize);
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
				msgs = ((InternalEObject)xtokenize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__XTOKENIZE, null, msgs);
			if (newXtokenize != null)
				msgs = ((InternalEObject)newXtokenize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__XTOKENIZE, null, msgs);
			msgs = basicSetXtokenize(newXtokenize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__XTOKENIZE, newXtokenize, newXtokenize));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__XPATH, oldXpath, newXpath);
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
				msgs = ((InternalEObject)xpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__XPATH, null, msgs);
			if (newXpath != null)
				msgs = ((InternalEObject)newXpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__XPATH, null, msgs);
			msgs = basicSetXpath(newXpath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__XPATH, newXpath, newXpath));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__XQUERY, oldXquery, newXquery);
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
				msgs = ((InternalEObject)xquery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__XQUERY, null, msgs);
			if (newXquery != null)
				msgs = ((InternalEObject)newXquery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SCRIPT_DEFINITION__XQUERY, null, msgs);
			msgs = basicSetXquery(newXquery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SCRIPT_DEFINITION__XQUERY, newXquery, newXquery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.SCRIPT_DEFINITION__EXPRESSION_DEFINITION:
				return basicSetExpressionDefinition(null, msgs);
			case CamelSpringPackage.SCRIPT_DEFINITION__CSIMPLE:
				return basicSetCsimple(null, msgs);
			case CamelSpringPackage.SCRIPT_DEFINITION__CONSTANT:
				return basicSetConstant(null, msgs);
			case CamelSpringPackage.SCRIPT_DEFINITION__DATASONNET:
				return basicSetDatasonnet(null, msgs);
			case CamelSpringPackage.SCRIPT_DEFINITION__EXCHANGE_PROPERTY:
				return basicSetExchangeProperty(null, msgs);
			case CamelSpringPackage.SCRIPT_DEFINITION__GROOVY:
				return basicSetGroovy(null, msgs);
			case CamelSpringPackage.SCRIPT_DEFINITION__HEADER:
				return basicSetHeader(null, msgs);
			case CamelSpringPackage.SCRIPT_DEFINITION__HL7TERSER:
				return basicSetHl7terser(null, msgs);
			case CamelSpringPackage.SCRIPT_DEFINITION__JAVA:
				return basicSetJava(null, msgs);
			case CamelSpringPackage.SCRIPT_DEFINITION__JS:
				return basicSetJs(null, msgs);
			case CamelSpringPackage.SCRIPT_DEFINITION__JOOR:
				return basicSetJoor(null, msgs);
			case CamelSpringPackage.SCRIPT_DEFINITION__JQ:
				return basicSetJq(null, msgs);
			case CamelSpringPackage.SCRIPT_DEFINITION__JSONPATH:
				return basicSetJsonpath(null, msgs);
			case CamelSpringPackage.SCRIPT_DEFINITION__LANGUAGE:
				return basicSetLanguage(null, msgs);
			case CamelSpringPackage.SCRIPT_DEFINITION__METHOD:
				return basicSetMethod(null, msgs);
			case CamelSpringPackage.SCRIPT_DEFINITION__MVEL:
				return basicSetMvel(null, msgs);
			case CamelSpringPackage.SCRIPT_DEFINITION__OGNL:
				return basicSetOgnl(null, msgs);
			case CamelSpringPackage.SCRIPT_DEFINITION__PYTHON:
				return basicSetPython(null, msgs);
			case CamelSpringPackage.SCRIPT_DEFINITION__REF:
				return basicSetRef(null, msgs);
			case CamelSpringPackage.SCRIPT_DEFINITION__SIMPLE:
				return basicSetSimple(null, msgs);
			case CamelSpringPackage.SCRIPT_DEFINITION__SPEL:
				return basicSetSpel(null, msgs);
			case CamelSpringPackage.SCRIPT_DEFINITION__TOKENIZE:
				return basicSetTokenize(null, msgs);
			case CamelSpringPackage.SCRIPT_DEFINITION__VARIABLE:
				return basicSetVariable(null, msgs);
			case CamelSpringPackage.SCRIPT_DEFINITION__WASM:
				return basicSetWasm(null, msgs);
			case CamelSpringPackage.SCRIPT_DEFINITION__XTOKENIZE:
				return basicSetXtokenize(null, msgs);
			case CamelSpringPackage.SCRIPT_DEFINITION__XPATH:
				return basicSetXpath(null, msgs);
			case CamelSpringPackage.SCRIPT_DEFINITION__XQUERY:
				return basicSetXquery(null, msgs);
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
			case CamelSpringPackage.SCRIPT_DEFINITION__EXPRESSION_DEFINITION:
				return getExpressionDefinition();
			case CamelSpringPackage.SCRIPT_DEFINITION__CSIMPLE:
				return getCsimple();
			case CamelSpringPackage.SCRIPT_DEFINITION__CONSTANT:
				return getConstant();
			case CamelSpringPackage.SCRIPT_DEFINITION__DATASONNET:
				return getDatasonnet();
			case CamelSpringPackage.SCRIPT_DEFINITION__EXCHANGE_PROPERTY:
				return getExchangeProperty();
			case CamelSpringPackage.SCRIPT_DEFINITION__GROOVY:
				return getGroovy();
			case CamelSpringPackage.SCRIPT_DEFINITION__HEADER:
				return getHeader();
			case CamelSpringPackage.SCRIPT_DEFINITION__HL7TERSER:
				return getHl7terser();
			case CamelSpringPackage.SCRIPT_DEFINITION__JAVA:
				return getJava();
			case CamelSpringPackage.SCRIPT_DEFINITION__JS:
				return getJs();
			case CamelSpringPackage.SCRIPT_DEFINITION__JOOR:
				return getJoor();
			case CamelSpringPackage.SCRIPT_DEFINITION__JQ:
				return getJq();
			case CamelSpringPackage.SCRIPT_DEFINITION__JSONPATH:
				return getJsonpath();
			case CamelSpringPackage.SCRIPT_DEFINITION__LANGUAGE:
				return getLanguage();
			case CamelSpringPackage.SCRIPT_DEFINITION__METHOD:
				return getMethod();
			case CamelSpringPackage.SCRIPT_DEFINITION__MVEL:
				return getMvel();
			case CamelSpringPackage.SCRIPT_DEFINITION__OGNL:
				return getOgnl();
			case CamelSpringPackage.SCRIPT_DEFINITION__PYTHON:
				return getPython();
			case CamelSpringPackage.SCRIPT_DEFINITION__REF:
				return getRef();
			case CamelSpringPackage.SCRIPT_DEFINITION__SIMPLE:
				return getSimple();
			case CamelSpringPackage.SCRIPT_DEFINITION__SPEL:
				return getSpel();
			case CamelSpringPackage.SCRIPT_DEFINITION__TOKENIZE:
				return getTokenize();
			case CamelSpringPackage.SCRIPT_DEFINITION__VARIABLE:
				return getVariable();
			case CamelSpringPackage.SCRIPT_DEFINITION__WASM:
				return getWasm();
			case CamelSpringPackage.SCRIPT_DEFINITION__XTOKENIZE:
				return getXtokenize();
			case CamelSpringPackage.SCRIPT_DEFINITION__XPATH:
				return getXpath();
			case CamelSpringPackage.SCRIPT_DEFINITION__XQUERY:
				return getXquery();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CamelSpringPackage.SCRIPT_DEFINITION__EXPRESSION_DEFINITION:
				setExpressionDefinition((Expression)newValue);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__CSIMPLE:
				setCsimple((CSimpleExpression)newValue);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__CONSTANT:
				setConstant((ConstantExpression)newValue);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__DATASONNET:
				setDatasonnet((DatasonnetExpression)newValue);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__EXCHANGE_PROPERTY:
				setExchangeProperty((ExchangePropertyExpression)newValue);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__GROOVY:
				setGroovy((GroovyExpression)newValue);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__HEADER:
				setHeader((HeaderExpression)newValue);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__HL7TERSER:
				setHl7terser((Hl7TerserExpression)newValue);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__JAVA:
				setJava((JavaExpression)newValue);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__JS:
				setJs((JavaScriptExpression)newValue);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__JOOR:
				setJoor((JoorExpression)newValue);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__JQ:
				setJq((JqExpression)newValue);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__JSONPATH:
				setJsonpath((JsonPathExpression)newValue);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__LANGUAGE:
				setLanguage((LanguageExpression)newValue);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__METHOD:
				setMethod((MethodCallExpression)newValue);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__MVEL:
				setMvel((MvelExpression)newValue);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__OGNL:
				setOgnl((OgnlExpression)newValue);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__PYTHON:
				setPython((PythonExpression)newValue);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__REF:
				setRef((RefExpression)newValue);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__SIMPLE:
				setSimple((SimpleExpression)newValue);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__SPEL:
				setSpel((SpELExpression)newValue);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__TOKENIZE:
				setTokenize((TokenizerExpression)newValue);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__VARIABLE:
				setVariable((VariableExpression)newValue);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__WASM:
				setWasm((WasmExpression)newValue);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__XTOKENIZE:
				setXtokenize((XmlTokenizerExpression)newValue);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__XPATH:
				setXpath((XPathExpression)newValue);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__XQUERY:
				setXquery((XQueryExpression)newValue);
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
			case CamelSpringPackage.SCRIPT_DEFINITION__EXPRESSION_DEFINITION:
				setExpressionDefinition((Expression)null);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__CSIMPLE:
				setCsimple((CSimpleExpression)null);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__CONSTANT:
				setConstant((ConstantExpression)null);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__DATASONNET:
				setDatasonnet((DatasonnetExpression)null);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__EXCHANGE_PROPERTY:
				setExchangeProperty((ExchangePropertyExpression)null);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__GROOVY:
				setGroovy((GroovyExpression)null);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__HEADER:
				setHeader((HeaderExpression)null);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__HL7TERSER:
				setHl7terser((Hl7TerserExpression)null);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__JAVA:
				setJava((JavaExpression)null);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__JS:
				setJs((JavaScriptExpression)null);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__JOOR:
				setJoor((JoorExpression)null);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__JQ:
				setJq((JqExpression)null);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__JSONPATH:
				setJsonpath((JsonPathExpression)null);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__LANGUAGE:
				setLanguage((LanguageExpression)null);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__METHOD:
				setMethod((MethodCallExpression)null);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__MVEL:
				setMvel((MvelExpression)null);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__OGNL:
				setOgnl((OgnlExpression)null);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__PYTHON:
				setPython((PythonExpression)null);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__REF:
				setRef((RefExpression)null);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__SIMPLE:
				setSimple((SimpleExpression)null);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__SPEL:
				setSpel((SpELExpression)null);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__TOKENIZE:
				setTokenize((TokenizerExpression)null);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__VARIABLE:
				setVariable((VariableExpression)null);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__WASM:
				setWasm((WasmExpression)null);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__XTOKENIZE:
				setXtokenize((XmlTokenizerExpression)null);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__XPATH:
				setXpath((XPathExpression)null);
				return;
			case CamelSpringPackage.SCRIPT_DEFINITION__XQUERY:
				setXquery((XQueryExpression)null);
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
			case CamelSpringPackage.SCRIPT_DEFINITION__EXPRESSION_DEFINITION:
				return expressionDefinition != null;
			case CamelSpringPackage.SCRIPT_DEFINITION__CSIMPLE:
				return csimple != null;
			case CamelSpringPackage.SCRIPT_DEFINITION__CONSTANT:
				return constant != null;
			case CamelSpringPackage.SCRIPT_DEFINITION__DATASONNET:
				return datasonnet != null;
			case CamelSpringPackage.SCRIPT_DEFINITION__EXCHANGE_PROPERTY:
				return exchangeProperty != null;
			case CamelSpringPackage.SCRIPT_DEFINITION__GROOVY:
				return groovy != null;
			case CamelSpringPackage.SCRIPT_DEFINITION__HEADER:
				return header != null;
			case CamelSpringPackage.SCRIPT_DEFINITION__HL7TERSER:
				return hl7terser != null;
			case CamelSpringPackage.SCRIPT_DEFINITION__JAVA:
				return java != null;
			case CamelSpringPackage.SCRIPT_DEFINITION__JS:
				return js != null;
			case CamelSpringPackage.SCRIPT_DEFINITION__JOOR:
				return joor != null;
			case CamelSpringPackage.SCRIPT_DEFINITION__JQ:
				return jq != null;
			case CamelSpringPackage.SCRIPT_DEFINITION__JSONPATH:
				return jsonpath != null;
			case CamelSpringPackage.SCRIPT_DEFINITION__LANGUAGE:
				return language != null;
			case CamelSpringPackage.SCRIPT_DEFINITION__METHOD:
				return method != null;
			case CamelSpringPackage.SCRIPT_DEFINITION__MVEL:
				return mvel != null;
			case CamelSpringPackage.SCRIPT_DEFINITION__OGNL:
				return ognl != null;
			case CamelSpringPackage.SCRIPT_DEFINITION__PYTHON:
				return python != null;
			case CamelSpringPackage.SCRIPT_DEFINITION__REF:
				return ref != null;
			case CamelSpringPackage.SCRIPT_DEFINITION__SIMPLE:
				return simple != null;
			case CamelSpringPackage.SCRIPT_DEFINITION__SPEL:
				return spel != null;
			case CamelSpringPackage.SCRIPT_DEFINITION__TOKENIZE:
				return tokenize != null;
			case CamelSpringPackage.SCRIPT_DEFINITION__VARIABLE:
				return variable != null;
			case CamelSpringPackage.SCRIPT_DEFINITION__WASM:
				return wasm != null;
			case CamelSpringPackage.SCRIPT_DEFINITION__XTOKENIZE:
				return xtokenize != null;
			case CamelSpringPackage.SCRIPT_DEFINITION__XPATH:
				return xpath != null;
			case CamelSpringPackage.SCRIPT_DEFINITION__XQUERY:
				return xquery != null;
		}
		return super.eIsSet(featureID);
	}

} //ScriptDefinitionImpl
