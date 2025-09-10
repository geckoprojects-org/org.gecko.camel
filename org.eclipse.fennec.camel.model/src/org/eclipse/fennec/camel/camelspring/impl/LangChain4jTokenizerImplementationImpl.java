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
import org.eclipse.fennec.camel.camelspring.LangChain4jTokenizerImplementation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lang Chain4j Tokenizer Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.LangChain4jTokenizerImplementationImpl#getMaxOverlap <em>Max Overlap</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.LangChain4jTokenizerImplementationImpl#getMaxTokens <em>Max Tokens</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.LangChain4jTokenizerImplementationImpl#getModelName <em>Model Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.LangChain4jTokenizerImplementationImpl#getTokenizerType <em>Tokenizer Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LangChain4jTokenizerImplementationImpl extends TokenizerImplementationImpl implements LangChain4jTokenizerImplementation {
	/**
	 * The default value of the '{@link #getMaxOverlap() <em>Max Overlap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOverlap()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_OVERLAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxOverlap() <em>Max Overlap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOverlap()
	 * @generated
	 * @ordered
	 */
	protected String maxOverlap = MAX_OVERLAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTokens() <em>Max Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTokens()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_TOKENS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxTokens() <em>Max Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTokens()
	 * @generated
	 * @ordered
	 */
	protected String maxTokens = MAX_TOKENS_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected String modelName = MODEL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTokenizerType() <em>Tokenizer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenizerType()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKENIZER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTokenizerType() <em>Tokenizer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenizerType()
	 * @generated
	 * @ordered
	 */
	protected String tokenizerType = TOKENIZER_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LangChain4jTokenizerImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getLangChain4jTokenizerImplementation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaxOverlap() {
		return maxOverlap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxOverlap(String newMaxOverlap) {
		String oldMaxOverlap = maxOverlap;
		maxOverlap = newMaxOverlap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.LANG_CHAIN4J_TOKENIZER_IMPLEMENTATION__MAX_OVERLAP, oldMaxOverlap, maxOverlap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaxTokens() {
		return maxTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxTokens(String newMaxTokens) {
		String oldMaxTokens = maxTokens;
		maxTokens = newMaxTokens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.LANG_CHAIN4J_TOKENIZER_IMPLEMENTATION__MAX_TOKENS, oldMaxTokens, maxTokens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModelName() {
		return modelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelName(String newModelName) {
		String oldModelName = modelName;
		modelName = newModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.LANG_CHAIN4J_TOKENIZER_IMPLEMENTATION__MODEL_NAME, oldModelName, modelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTokenizerType() {
		return tokenizerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTokenizerType(String newTokenizerType) {
		String oldTokenizerType = tokenizerType;
		tokenizerType = newTokenizerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.LANG_CHAIN4J_TOKENIZER_IMPLEMENTATION__TOKENIZER_TYPE, oldTokenizerType, tokenizerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.LANG_CHAIN4J_TOKENIZER_IMPLEMENTATION__MAX_OVERLAP:
				return getMaxOverlap();
			case CamelSpringPackage.LANG_CHAIN4J_TOKENIZER_IMPLEMENTATION__MAX_TOKENS:
				return getMaxTokens();
			case CamelSpringPackage.LANG_CHAIN4J_TOKENIZER_IMPLEMENTATION__MODEL_NAME:
				return getModelName();
			case CamelSpringPackage.LANG_CHAIN4J_TOKENIZER_IMPLEMENTATION__TOKENIZER_TYPE:
				return getTokenizerType();
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
			case CamelSpringPackage.LANG_CHAIN4J_TOKENIZER_IMPLEMENTATION__MAX_OVERLAP:
				setMaxOverlap((String)newValue);
				return;
			case CamelSpringPackage.LANG_CHAIN4J_TOKENIZER_IMPLEMENTATION__MAX_TOKENS:
				setMaxTokens((String)newValue);
				return;
			case CamelSpringPackage.LANG_CHAIN4J_TOKENIZER_IMPLEMENTATION__MODEL_NAME:
				setModelName((String)newValue);
				return;
			case CamelSpringPackage.LANG_CHAIN4J_TOKENIZER_IMPLEMENTATION__TOKENIZER_TYPE:
				setTokenizerType((String)newValue);
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
			case CamelSpringPackage.LANG_CHAIN4J_TOKENIZER_IMPLEMENTATION__MAX_OVERLAP:
				setMaxOverlap(MAX_OVERLAP_EDEFAULT);
				return;
			case CamelSpringPackage.LANG_CHAIN4J_TOKENIZER_IMPLEMENTATION__MAX_TOKENS:
				setMaxTokens(MAX_TOKENS_EDEFAULT);
				return;
			case CamelSpringPackage.LANG_CHAIN4J_TOKENIZER_IMPLEMENTATION__MODEL_NAME:
				setModelName(MODEL_NAME_EDEFAULT);
				return;
			case CamelSpringPackage.LANG_CHAIN4J_TOKENIZER_IMPLEMENTATION__TOKENIZER_TYPE:
				setTokenizerType(TOKENIZER_TYPE_EDEFAULT);
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
			case CamelSpringPackage.LANG_CHAIN4J_TOKENIZER_IMPLEMENTATION__MAX_OVERLAP:
				return MAX_OVERLAP_EDEFAULT == null ? maxOverlap != null : !MAX_OVERLAP_EDEFAULT.equals(maxOverlap);
			case CamelSpringPackage.LANG_CHAIN4J_TOKENIZER_IMPLEMENTATION__MAX_TOKENS:
				return MAX_TOKENS_EDEFAULT == null ? maxTokens != null : !MAX_TOKENS_EDEFAULT.equals(maxTokens);
			case CamelSpringPackage.LANG_CHAIN4J_TOKENIZER_IMPLEMENTATION__MODEL_NAME:
				return MODEL_NAME_EDEFAULT == null ? modelName != null : !MODEL_NAME_EDEFAULT.equals(modelName);
			case CamelSpringPackage.LANG_CHAIN4J_TOKENIZER_IMPLEMENTATION__TOKENIZER_TYPE:
				return TOKENIZER_TYPE_EDEFAULT == null ? tokenizerType != null : !TOKENIZER_TYPE_EDEFAULT.equals(tokenizerType);
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
		result.append(" (maxOverlap: ");
		result.append(maxOverlap);
		result.append(", maxTokens: ");
		result.append(maxTokens);
		result.append(", modelName: ");
		result.append(modelName);
		result.append(", tokenizerType: ");
		result.append(tokenizerType);
		result.append(')');
		return result.toString();
	}

} //LangChain4jTokenizerImplementationImpl
