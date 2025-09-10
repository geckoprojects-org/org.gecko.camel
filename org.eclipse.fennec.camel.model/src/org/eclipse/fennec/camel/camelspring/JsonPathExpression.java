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
 * A representation of the model object '<em><b>Json Path Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonPathExpression#getAllowEasyPredicate <em>Allow Easy Predicate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonPathExpression#getAllowSimple <em>Allow Simple</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonPathExpression#getOption <em>Option</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonPathExpression#getSuppressExceptions <em>Suppress Exceptions</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonPathExpression#getUnpackArray <em>Unpack Array</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonPathExpression#getWriteAsString <em>Write As String</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonPathExpression()
 * @model extendedMetaData="name='jsonPathExpression' kind='simple'"
 * @generated
 */
@ProviderType
public interface JsonPathExpression extends SingleInputTypedExpressionDefinition {
	/**
	 * Returns the value of the '<em><b>Allow Easy Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to allow using the easy predicate parser to pre-parse predicates. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Easy Predicate</em>' attribute.
	 * @see #setAllowEasyPredicate(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonPathExpression_AllowEasyPredicate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowEasyPredicate'"
	 * @generated
	 */
	String getAllowEasyPredicate();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonPathExpression#getAllowEasyPredicate <em>Allow Easy Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Easy Predicate</em>' attribute.
	 * @see #getAllowEasyPredicate()
	 * @generated
	 */
	void setAllowEasyPredicate(String value);

	/**
	 * Returns the value of the '<em><b>Allow Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to allow in inlined Simple exceptions in the JSONPath expression. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Simple</em>' attribute.
	 * @see #setAllowSimple(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonPathExpression_AllowSimple()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowSimple'"
	 * @generated
	 */
	String getAllowSimple();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonPathExpression#getAllowSimple <em>Allow Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Simple</em>' attribute.
	 * @see #getAllowSimple()
	 * @generated
	 */
	void setAllowSimple(String value);

	/**
	 * Returns the value of the '<em><b>Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To configure additional options on JSONPath. Multiple values can be separated by comma.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Option</em>' attribute.
	 * @see #setOption(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonPathExpression_Option()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='option'"
	 * @generated
	 */
	String getOption();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonPathExpression#getOption <em>Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' attribute.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(String value);

	/**
	 * Returns the value of the '<em><b>Suppress Exceptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to suppress exceptions such as PathNotFoundException. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Suppress Exceptions</em>' attribute.
	 * @see #setSuppressExceptions(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonPathExpression_SuppressExceptions()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='suppressExceptions'"
	 * @generated
	 */
	String getSuppressExceptions();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonPathExpression#getSuppressExceptions <em>Suppress Exceptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suppress Exceptions</em>' attribute.
	 * @see #getSuppressExceptions()
	 * @generated
	 */
	void setSuppressExceptions(String value);

	/**
	 * Returns the value of the '<em><b>Unpack Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to unpack a single element json-array into an object. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unpack Array</em>' attribute.
	 * @see #setUnpackArray(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonPathExpression_UnpackArray()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='unpackArray'"
	 * @generated
	 */
	String getUnpackArray();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonPathExpression#getUnpackArray <em>Unpack Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unpack Array</em>' attribute.
	 * @see #getUnpackArray()
	 * @generated
	 */
	void setUnpackArray(String value);

	/**
	 * Returns the value of the '<em><b>Write As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to write the output of each row/element as a JSON String value instead of a Map/POJO value. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write As String</em>' attribute.
	 * @see #setWriteAsString(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonPathExpression_WriteAsString()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='writeAsString'"
	 * @generated
	 */
	String getWriteAsString();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonPathExpression#getWriteAsString <em>Write As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write As String</em>' attribute.
	 * @see #getWriteAsString()
	 * @generated
	 */
	void setWriteAsString(String value);

} // JsonPathExpression
