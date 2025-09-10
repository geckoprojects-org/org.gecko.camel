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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.TokenizerExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tokenizer Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TokenizerExpressionImpl#getEndToken <em>End Token</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TokenizerExpressionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TokenizerExpressionImpl#getGroupDelimiter <em>Group Delimiter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TokenizerExpressionImpl#getIncludeTokens <em>Include Tokens</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TokenizerExpressionImpl#getInheritNamespaceTagName <em>Inherit Namespace Tag Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TokenizerExpressionImpl#getRegex <em>Regex</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TokenizerExpressionImpl#getSkipFirst <em>Skip First</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TokenizerExpressionImpl#getToken <em>Token</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TokenizerExpressionImpl#getXml <em>Xml</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TokenizerExpressionImpl extends SingleInputTypedExpressionDefinitionImpl implements TokenizerExpression {
	/**
	 * The default value of the '{@link #getEndToken() <em>End Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndToken()
	 * @generated
	 * @ordered
	 */
	protected static final String END_TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndToken() <em>End Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndToken()
	 * @generated
	 * @ordered
	 */
	protected String endToken = END_TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected String group = GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupDelimiter() <em>Group Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupDelimiter()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_DELIMITER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupDelimiter() <em>Group Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupDelimiter()
	 * @generated
	 * @ordered
	 */
	protected String groupDelimiter = GROUP_DELIMITER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeTokens() <em>Include Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTokens()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_TOKENS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeTokens() <em>Include Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTokens()
	 * @generated
	 * @ordered
	 */
	protected String includeTokens = INCLUDE_TOKENS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInheritNamespaceTagName() <em>Inherit Namespace Tag Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritNamespaceTagName()
	 * @generated
	 * @ordered
	 */
	protected static final String INHERIT_NAMESPACE_TAG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInheritNamespaceTagName() <em>Inherit Namespace Tag Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritNamespaceTagName()
	 * @generated
	 * @ordered
	 */
	protected String inheritNamespaceTagName = INHERIT_NAMESPACE_TAG_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegex() <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegex()
	 * @generated
	 * @ordered
	 */
	protected static final String REGEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegex() <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegex()
	 * @generated
	 * @ordered
	 */
	protected String regex = REGEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSkipFirst() <em>Skip First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkipFirst()
	 * @generated
	 * @ordered
	 */
	protected static final String SKIP_FIRST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSkipFirst() <em>Skip First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkipFirst()
	 * @generated
	 * @ordered
	 */
	protected String skipFirst = SKIP_FIRST_EDEFAULT;

	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected String token = TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getXml() <em>Xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXml() <em>Xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml()
	 * @generated
	 * @ordered
	 */
	protected String xml = XML_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenizerExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getTokenizerExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndToken() {
		return endToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndToken(String newEndToken) {
		String oldEndToken = endToken;
		endToken = newEndToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TOKENIZER_EXPRESSION__END_TOKEN, oldEndToken, endToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TOKENIZER_EXPRESSION__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupDelimiter() {
		return groupDelimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupDelimiter(String newGroupDelimiter) {
		String oldGroupDelimiter = groupDelimiter;
		groupDelimiter = newGroupDelimiter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TOKENIZER_EXPRESSION__GROUP_DELIMITER, oldGroupDelimiter, groupDelimiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIncludeTokens() {
		return includeTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeTokens(String newIncludeTokens) {
		String oldIncludeTokens = includeTokens;
		includeTokens = newIncludeTokens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TOKENIZER_EXPRESSION__INCLUDE_TOKENS, oldIncludeTokens, includeTokens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInheritNamespaceTagName() {
		return inheritNamespaceTagName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInheritNamespaceTagName(String newInheritNamespaceTagName) {
		String oldInheritNamespaceTagName = inheritNamespaceTagName;
		inheritNamespaceTagName = newInheritNamespaceTagName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TOKENIZER_EXPRESSION__INHERIT_NAMESPACE_TAG_NAME, oldInheritNamespaceTagName, inheritNamespaceTagName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegex() {
		return regex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegex(String newRegex) {
		String oldRegex = regex;
		regex = newRegex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TOKENIZER_EXPRESSION__REGEX, oldRegex, regex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSkipFirst() {
		return skipFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkipFirst(String newSkipFirst) {
		String oldSkipFirst = skipFirst;
		skipFirst = newSkipFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TOKENIZER_EXPRESSION__SKIP_FIRST, oldSkipFirst, skipFirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToken(String newToken) {
		String oldToken = token;
		token = newToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TOKENIZER_EXPRESSION__TOKEN, oldToken, token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXml() {
		return xml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXml(String newXml) {
		String oldXml = xml;
		xml = newXml;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TOKENIZER_EXPRESSION__XML, oldXml, xml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.TOKENIZER_EXPRESSION__END_TOKEN:
				return getEndToken();
			case CamelSpringPackage.TOKENIZER_EXPRESSION__GROUP:
				return getGroup();
			case CamelSpringPackage.TOKENIZER_EXPRESSION__GROUP_DELIMITER:
				return getGroupDelimiter();
			case CamelSpringPackage.TOKENIZER_EXPRESSION__INCLUDE_TOKENS:
				return getIncludeTokens();
			case CamelSpringPackage.TOKENIZER_EXPRESSION__INHERIT_NAMESPACE_TAG_NAME:
				return getInheritNamespaceTagName();
			case CamelSpringPackage.TOKENIZER_EXPRESSION__REGEX:
				return getRegex();
			case CamelSpringPackage.TOKENIZER_EXPRESSION__SKIP_FIRST:
				return getSkipFirst();
			case CamelSpringPackage.TOKENIZER_EXPRESSION__TOKEN:
				return getToken();
			case CamelSpringPackage.TOKENIZER_EXPRESSION__XML:
				return getXml();
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
			case CamelSpringPackage.TOKENIZER_EXPRESSION__END_TOKEN:
				setEndToken((String)newValue);
				return;
			case CamelSpringPackage.TOKENIZER_EXPRESSION__GROUP:
				setGroup((String)newValue);
				return;
			case CamelSpringPackage.TOKENIZER_EXPRESSION__GROUP_DELIMITER:
				setGroupDelimiter((String)newValue);
				return;
			case CamelSpringPackage.TOKENIZER_EXPRESSION__INCLUDE_TOKENS:
				setIncludeTokens((String)newValue);
				return;
			case CamelSpringPackage.TOKENIZER_EXPRESSION__INHERIT_NAMESPACE_TAG_NAME:
				setInheritNamespaceTagName((String)newValue);
				return;
			case CamelSpringPackage.TOKENIZER_EXPRESSION__REGEX:
				setRegex((String)newValue);
				return;
			case CamelSpringPackage.TOKENIZER_EXPRESSION__SKIP_FIRST:
				setSkipFirst((String)newValue);
				return;
			case CamelSpringPackage.TOKENIZER_EXPRESSION__TOKEN:
				setToken((String)newValue);
				return;
			case CamelSpringPackage.TOKENIZER_EXPRESSION__XML:
				setXml((String)newValue);
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
			case CamelSpringPackage.TOKENIZER_EXPRESSION__END_TOKEN:
				setEndToken(END_TOKEN_EDEFAULT);
				return;
			case CamelSpringPackage.TOKENIZER_EXPRESSION__GROUP:
				setGroup(GROUP_EDEFAULT);
				return;
			case CamelSpringPackage.TOKENIZER_EXPRESSION__GROUP_DELIMITER:
				setGroupDelimiter(GROUP_DELIMITER_EDEFAULT);
				return;
			case CamelSpringPackage.TOKENIZER_EXPRESSION__INCLUDE_TOKENS:
				setIncludeTokens(INCLUDE_TOKENS_EDEFAULT);
				return;
			case CamelSpringPackage.TOKENIZER_EXPRESSION__INHERIT_NAMESPACE_TAG_NAME:
				setInheritNamespaceTagName(INHERIT_NAMESPACE_TAG_NAME_EDEFAULT);
				return;
			case CamelSpringPackage.TOKENIZER_EXPRESSION__REGEX:
				setRegex(REGEX_EDEFAULT);
				return;
			case CamelSpringPackage.TOKENIZER_EXPRESSION__SKIP_FIRST:
				setSkipFirst(SKIP_FIRST_EDEFAULT);
				return;
			case CamelSpringPackage.TOKENIZER_EXPRESSION__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case CamelSpringPackage.TOKENIZER_EXPRESSION__XML:
				setXml(XML_EDEFAULT);
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
			case CamelSpringPackage.TOKENIZER_EXPRESSION__END_TOKEN:
				return END_TOKEN_EDEFAULT == null ? endToken != null : !END_TOKEN_EDEFAULT.equals(endToken);
			case CamelSpringPackage.TOKENIZER_EXPRESSION__GROUP:
				return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
			case CamelSpringPackage.TOKENIZER_EXPRESSION__GROUP_DELIMITER:
				return GROUP_DELIMITER_EDEFAULT == null ? groupDelimiter != null : !GROUP_DELIMITER_EDEFAULT.equals(groupDelimiter);
			case CamelSpringPackage.TOKENIZER_EXPRESSION__INCLUDE_TOKENS:
				return INCLUDE_TOKENS_EDEFAULT == null ? includeTokens != null : !INCLUDE_TOKENS_EDEFAULT.equals(includeTokens);
			case CamelSpringPackage.TOKENIZER_EXPRESSION__INHERIT_NAMESPACE_TAG_NAME:
				return INHERIT_NAMESPACE_TAG_NAME_EDEFAULT == null ? inheritNamespaceTagName != null : !INHERIT_NAMESPACE_TAG_NAME_EDEFAULT.equals(inheritNamespaceTagName);
			case CamelSpringPackage.TOKENIZER_EXPRESSION__REGEX:
				return REGEX_EDEFAULT == null ? regex != null : !REGEX_EDEFAULT.equals(regex);
			case CamelSpringPackage.TOKENIZER_EXPRESSION__SKIP_FIRST:
				return SKIP_FIRST_EDEFAULT == null ? skipFirst != null : !SKIP_FIRST_EDEFAULT.equals(skipFirst);
			case CamelSpringPackage.TOKENIZER_EXPRESSION__TOKEN:
				return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT.equals(token);
			case CamelSpringPackage.TOKENIZER_EXPRESSION__XML:
				return XML_EDEFAULT == null ? xml != null : !XML_EDEFAULT.equals(xml);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (endToken: ");
		result.append(endToken);
		result.append(", group: ");
		result.append(group);
		result.append(", groupDelimiter: ");
		result.append(groupDelimiter);
		result.append(", includeTokens: ");
		result.append(includeTokens);
		result.append(", inheritNamespaceTagName: ");
		result.append(inheritNamespaceTagName);
		result.append(", regex: ");
		result.append(regex);
		result.append(", skipFirst: ");
		result.append(skipFirst);
		result.append(", token: ");
		result.append(token);
		result.append(", xml: ");
		result.append(xml);
		result.append(')');
		return result.toString();
	}

} //TokenizerExpressionImpl
