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
 * A representation of the model object '<em><b>Method Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MethodCallExpression#getBeanType <em>Bean Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MethodCallExpression#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MethodCallExpression#getRef <em>Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MethodCallExpression#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MethodCallExpression#getValidate <em>Validate</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMethodCallExpression()
 * @model extendedMetaData="name='methodCallExpression' kind='simple'"
 * @generated
 */
@ProviderType
public interface MethodCallExpression extends TypedExpressionDefinition {
	/**
	 * Returns the value of the '<em><b>Bean Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Class name (fully qualified) of the bean to use Will lookup in registry and if there is a single instance of the same
	 * type, then the existing bean is used, otherwise a new bean is created (requires a default no-arg constructor).
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bean Type</em>' attribute.
	 * @see #setBeanType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMethodCallExpression_BeanType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='beanType'"
	 * @generated
	 */
	String getBeanType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MethodCallExpression#getBeanType <em>Bean Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bean Type</em>' attribute.
	 * @see #getBeanType()
	 * @generated
	 */
	void setBeanType(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Name of method to call.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMethodCallExpression_Method()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='method'"
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MethodCallExpression#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Reference to an existing bean (bean id) to lookup in the registry.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMethodCallExpression_Ref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ref'"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MethodCallExpression#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Scope of bean. When using singleton scope (default) the bean is created or looked up only once and reused for the
	 * lifetime of the endpoint. The bean should be thread-safe in case concurrent threads is calling the bean at the same
	 * time. When using request scope the bean is created or looked up once per request (exchange). This can be used if you
	 * want to store state on a bean while processing a request and you want to call the same bean instance multiple times
	 * while processing the request. The bean does not have to be thread-safe as the instance is only called from the same
	 * request. When using prototype scope, then the bean will be looked up or created per call. However in case of lookup then
	 * this is delegated to the bean registry such as Spring or CDI (if in use), which depends on their configuration can act
	 * as either singleton or prototype scope. So when using prototype scope then this depends on the bean registry
	 * implementation. Default value: Singleton
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see #setScope(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMethodCallExpression_Scope()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='scope'"
	 * @generated
	 */
	String getScope();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MethodCallExpression#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(String value);

	/**
	 * Returns the value of the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to validate the bean has the configured method. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validate</em>' attribute.
	 * @see #setValidate(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMethodCallExpression_Validate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='validate'"
	 * @generated
	 */
	String getValidate();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MethodCallExpression#getValidate <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate</em>' attribute.
	 * @see #getValidate()
	 * @generated
	 */
	void setValidate(String value);

} // MethodCallExpression
