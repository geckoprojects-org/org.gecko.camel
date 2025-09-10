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
 * A representation of the model object '<em><b>Lang Chain4j Tokenizer Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LangChain4jTokenizerImplementation#getMaxOverlap <em>Max Overlap</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LangChain4jTokenizerImplementation#getMaxTokens <em>Max Tokens</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LangChain4jTokenizerImplementation#getModelName <em>Model Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LangChain4jTokenizerImplementation#getTokenizerType <em>Tokenizer Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLangChain4jTokenizerImplementation()
 * @model extendedMetaData="name='langChain4jTokenizerImplementation' kind='empty'"
 * @generated
 */
@ProviderType
public interface LangChain4jTokenizerImplementation extends TokenizerImplementation {
	/**
	 * Returns the value of the '<em><b>Max Overlap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the maximum number of tokens that can overlap in each segment.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Overlap</em>' attribute.
	 * @see #setMaxOverlap(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLangChain4jTokenizerImplementation_MaxOverlap()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='maxOverlap'"
	 * @generated
	 */
	String getMaxOverlap();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LangChain4jTokenizerImplementation#getMaxOverlap <em>Max Overlap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Overlap</em>' attribute.
	 * @see #getMaxOverlap()
	 * @generated
	 */
	void setMaxOverlap(String value);

	/**
	 * Returns the value of the '<em><b>Max Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the maximum number of tokens on each segment.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Tokens</em>' attribute.
	 * @see #setMaxTokens(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLangChain4jTokenizerImplementation_MaxTokens()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='maxTokens'"
	 * @generated
	 */
	String getMaxTokens();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LangChain4jTokenizerImplementation#getMaxTokens <em>Max Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Tokens</em>' attribute.
	 * @see #getMaxTokens()
	 * @generated
	 */
	void setMaxTokens(String value);

	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the model name.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLangChain4jTokenizerImplementation_ModelName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='modelName'"
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LangChain4jTokenizerImplementation#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

	/**
	 * Returns the value of the '<em><b>Tokenizer Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the tokenizer type.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tokenizer Type</em>' attribute.
	 * @see #setTokenizerType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLangChain4jTokenizerImplementation_TokenizerType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='tokenizerType'"
	 * @generated
	 */
	String getTokenizerType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LangChain4jTokenizerImplementation#getTokenizerType <em>Tokenizer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tokenizer Type</em>' attribute.
	 * @see #getTokenizerType()
	 * @generated
	 */
	void setTokenizerType(String value);

} // LangChain4jTokenizerImplementation
