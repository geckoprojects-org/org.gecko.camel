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
 * A representation of the model object '<em><b>Tokenizer Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TokenizerExpression#getEndToken <em>End Token</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TokenizerExpression#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TokenizerExpression#getGroupDelimiter <em>Group Delimiter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TokenizerExpression#getIncludeTokens <em>Include Tokens</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TokenizerExpression#getInheritNamespaceTagName <em>Inherit Namespace Tag Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TokenizerExpression#getRegex <em>Regex</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TokenizerExpression#getSkipFirst <em>Skip First</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TokenizerExpression#getToken <em>Token</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TokenizerExpression#getXml <em>Xml</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTokenizerExpression()
 * @model extendedMetaData="name='tokenizerExpression' kind='simple'"
 * @generated
 */
@ProviderType
public interface TokenizerExpression extends SingleInputTypedExpressionDefinition {
	/**
	 * Returns the value of the '<em><b>End Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The end token to use as tokenizer if using start/end token pairs. You can use simple language as the token to support
	 * dynamic tokens.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Token</em>' attribute.
	 * @see #setEndToken(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTokenizerExpression_EndToken()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='endToken'"
	 * @generated
	 */
	String getEndToken();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TokenizerExpression#getEndToken <em>End Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Token</em>' attribute.
	 * @see #getEndToken()
	 * @generated
	 */
	void setEndToken(String value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To group N parts together, for example to split big files into chunks of 1000 lines. You can use simple language as the
	 * group to support dynamic group sizes.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTokenizerExpression_Group()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='group'"
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TokenizerExpression#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

	/**
	 * Returns the value of the '<em><b>Group Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the delimiter to use when grouping. If this has not been set then token will be used as the delimiter.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Delimiter</em>' attribute.
	 * @see #setGroupDelimiter(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTokenizerExpression_GroupDelimiter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='groupDelimiter'"
	 * @generated
	 */
	String getGroupDelimiter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TokenizerExpression#getGroupDelimiter <em>Group Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Delimiter</em>' attribute.
	 * @see #getGroupDelimiter()
	 * @generated
	 */
	void setGroupDelimiter(String value);

	/**
	 * Returns the value of the '<em><b>Include Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to include the tokens in the parts when using pairs. When including tokens then the endToken property must also
	 * be configured (to use pair mode). The default value is false. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Tokens</em>' attribute.
	 * @see #setIncludeTokens(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTokenizerExpression_IncludeTokens()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='includeTokens'"
	 * @generated
	 */
	String getIncludeTokens();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TokenizerExpression#getIncludeTokens <em>Include Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Tokens</em>' attribute.
	 * @see #getIncludeTokens()
	 * @generated
	 */
	void setIncludeTokens(String value);

	/**
	 * Returns the value of the '<em><b>Inherit Namespace Tag Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To inherit namespaces from a root/parent tag name when using XML You can use simple language as the tag name to support
	 * dynamic names.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inherit Namespace Tag Name</em>' attribute.
	 * @see #setInheritNamespaceTagName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTokenizerExpression_InheritNamespaceTagName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='inheritNamespaceTagName'"
	 * @generated
	 */
	String getInheritNamespaceTagName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TokenizerExpression#getInheritNamespaceTagName <em>Inherit Namespace Tag Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherit Namespace Tag Name</em>' attribute.
	 * @see #getInheritNamespaceTagName()
	 * @generated
	 */
	void setInheritNamespaceTagName(String value);

	/**
	 * Returns the value of the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If the token is a regular expression pattern. The default value is false. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regex</em>' attribute.
	 * @see #setRegex(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTokenizerExpression_Regex()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='regex'"
	 * @generated
	 */
	String getRegex();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TokenizerExpression#getRegex <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regex</em>' attribute.
	 * @see #getRegex()
	 * @generated
	 */
	void setRegex(String value);

	/**
	 * Returns the value of the '<em><b>Skip First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To skip the very first element. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Skip First</em>' attribute.
	 * @see #setSkipFirst(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTokenizerExpression_SkipFirst()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='skipFirst'"
	 * @generated
	 */
	String getSkipFirst();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TokenizerExpression#getSkipFirst <em>Skip First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip First</em>' attribute.
	 * @see #getSkipFirst()
	 * @generated
	 */
	void setSkipFirst(String value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The (start) token to use as tokenizer, for example you can use the new line token. You can use simple language as the
	 * token to support dynamic tokens.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTokenizerExpression_Token()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='token'"
	 * @generated
	 */
	String getToken();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TokenizerExpression#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(String value);

	/**
	 * Returns the value of the '<em><b>Xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether the input is XML messages. This option must be set to true if working with XML payloads. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xml</em>' attribute.
	 * @see #setXml(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTokenizerExpression_Xml()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='xml'"
	 * @generated
	 */
	String getXml();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TokenizerExpression#getXml <em>Xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml</em>' attribute.
	 * @see #getXml()
	 * @generated
	 */
	void setXml(String value);

} // TokenizerExpression
