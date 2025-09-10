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
 * A representation of the model object '<em><b>Java Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JavaExpression#getPreCompile <em>Pre Compile</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JavaExpression#getSingleQuotes <em>Single Quotes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJavaExpression()
 * @model extendedMetaData="name='javaExpression' kind='simple'"
 * @generated
 */
@ProviderType
public interface JavaExpression extends TypedExpressionDefinition {
	/**
	 * Returns the value of the '<em><b>Pre Compile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether the expression should be pre compiled once during initialization phase. If this is turned off, then the
	 * expression is reloaded and compiled on each evaluation. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Compile</em>' attribute.
	 * @see #setPreCompile(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJavaExpression_PreCompile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='preCompile'"
	 * @generated
	 */
	String getPreCompile();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JavaExpression#getPreCompile <em>Pre Compile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Compile</em>' attribute.
	 * @see #getPreCompile()
	 * @generated
	 */
	void setPreCompile(String value);

	/**
	 * Returns the value of the '<em><b>Single Quotes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether single quotes can be used as replacement for double quotes. This is convenient when you need to work with
	 * strings inside strings. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Single Quotes</em>' attribute.
	 * @see #setSingleQuotes(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJavaExpression_SingleQuotes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='singleQuotes'"
	 * @generated
	 */
	String getSingleQuotes();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JavaExpression#getSingleQuotes <em>Single Quotes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Quotes</em>' attribute.
	 * @see #getSingleQuotes()
	 * @generated
	 */
	void setSingleQuotes(String value);

} // JavaExpression
