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

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.LangChain4JCharacterTokenizerDefinition;
import org.eclipse.fennec.camel.camelspring.LangChain4JLineTokenizerDefinition;
import org.eclipse.fennec.camel.camelspring.LangChain4JParagraphTokenizerDefinition;
import org.eclipse.fennec.camel.camelspring.LangChain4JSentenceTokenizerDefinition;
import org.eclipse.fennec.camel.camelspring.LangChain4JWordTokenizerDefinition;
import org.eclipse.fennec.camel.camelspring.TokenizerDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tokenizer Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TokenizerDefinitionImpl#getLangChain4jCharacterTokenizer <em>Lang Chain4j Character Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TokenizerDefinitionImpl#getLangChain4jLineTokenizer <em>Lang Chain4j Line Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TokenizerDefinitionImpl#getLangChain4jParagraphTokenizer <em>Lang Chain4j Paragraph Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TokenizerDefinitionImpl#getLangChain4jSentenceTokenizer <em>Lang Chain4j Sentence Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TokenizerDefinitionImpl#getLangChain4jWordTokenizer <em>Lang Chain4j Word Tokenizer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TokenizerDefinitionImpl extends NoOutputDefinitionImpl implements TokenizerDefinition {
	/**
	 * The cached value of the '{@link #getLangChain4jCharacterTokenizer() <em>Lang Chain4j Character Tokenizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangChain4jCharacterTokenizer()
	 * @generated
	 * @ordered
	 */
	protected LangChain4JCharacterTokenizerDefinition langChain4jCharacterTokenizer;

	/**
	 * The cached value of the '{@link #getLangChain4jLineTokenizer() <em>Lang Chain4j Line Tokenizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangChain4jLineTokenizer()
	 * @generated
	 * @ordered
	 */
	protected LangChain4JLineTokenizerDefinition langChain4jLineTokenizer;

	/**
	 * The cached value of the '{@link #getLangChain4jParagraphTokenizer() <em>Lang Chain4j Paragraph Tokenizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangChain4jParagraphTokenizer()
	 * @generated
	 * @ordered
	 */
	protected LangChain4JParagraphTokenizerDefinition langChain4jParagraphTokenizer;

	/**
	 * The cached value of the '{@link #getLangChain4jSentenceTokenizer() <em>Lang Chain4j Sentence Tokenizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangChain4jSentenceTokenizer()
	 * @generated
	 * @ordered
	 */
	protected LangChain4JSentenceTokenizerDefinition langChain4jSentenceTokenizer;

	/**
	 * The cached value of the '{@link #getLangChain4jWordTokenizer() <em>Lang Chain4j Word Tokenizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangChain4jWordTokenizer()
	 * @generated
	 * @ordered
	 */
	protected LangChain4JWordTokenizerDefinition langChain4jWordTokenizer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenizerDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getTokenizerDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LangChain4JCharacterTokenizerDefinition getLangChain4jCharacterTokenizer() {
		return langChain4jCharacterTokenizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLangChain4jCharacterTokenizer(LangChain4JCharacterTokenizerDefinition newLangChain4jCharacterTokenizer, NotificationChain msgs) {
		LangChain4JCharacterTokenizerDefinition oldLangChain4jCharacterTokenizer = langChain4jCharacterTokenizer;
		langChain4jCharacterTokenizer = newLangChain4jCharacterTokenizer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_CHARACTER_TOKENIZER, oldLangChain4jCharacterTokenizer, newLangChain4jCharacterTokenizer);
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
	public void setLangChain4jCharacterTokenizer(LangChain4JCharacterTokenizerDefinition newLangChain4jCharacterTokenizer) {
		if (newLangChain4jCharacterTokenizer != langChain4jCharacterTokenizer) {
			NotificationChain msgs = null;
			if (langChain4jCharacterTokenizer != null)
				msgs = ((InternalEObject)langChain4jCharacterTokenizer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_CHARACTER_TOKENIZER, null, msgs);
			if (newLangChain4jCharacterTokenizer != null)
				msgs = ((InternalEObject)newLangChain4jCharacterTokenizer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_CHARACTER_TOKENIZER, null, msgs);
			msgs = basicSetLangChain4jCharacterTokenizer(newLangChain4jCharacterTokenizer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_CHARACTER_TOKENIZER, newLangChain4jCharacterTokenizer, newLangChain4jCharacterTokenizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LangChain4JLineTokenizerDefinition getLangChain4jLineTokenizer() {
		return langChain4jLineTokenizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLangChain4jLineTokenizer(LangChain4JLineTokenizerDefinition newLangChain4jLineTokenizer, NotificationChain msgs) {
		LangChain4JLineTokenizerDefinition oldLangChain4jLineTokenizer = langChain4jLineTokenizer;
		langChain4jLineTokenizer = newLangChain4jLineTokenizer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_LINE_TOKENIZER, oldLangChain4jLineTokenizer, newLangChain4jLineTokenizer);
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
	public void setLangChain4jLineTokenizer(LangChain4JLineTokenizerDefinition newLangChain4jLineTokenizer) {
		if (newLangChain4jLineTokenizer != langChain4jLineTokenizer) {
			NotificationChain msgs = null;
			if (langChain4jLineTokenizer != null)
				msgs = ((InternalEObject)langChain4jLineTokenizer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_LINE_TOKENIZER, null, msgs);
			if (newLangChain4jLineTokenizer != null)
				msgs = ((InternalEObject)newLangChain4jLineTokenizer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_LINE_TOKENIZER, null, msgs);
			msgs = basicSetLangChain4jLineTokenizer(newLangChain4jLineTokenizer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_LINE_TOKENIZER, newLangChain4jLineTokenizer, newLangChain4jLineTokenizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LangChain4JParagraphTokenizerDefinition getLangChain4jParagraphTokenizer() {
		return langChain4jParagraphTokenizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLangChain4jParagraphTokenizer(LangChain4JParagraphTokenizerDefinition newLangChain4jParagraphTokenizer, NotificationChain msgs) {
		LangChain4JParagraphTokenizerDefinition oldLangChain4jParagraphTokenizer = langChain4jParagraphTokenizer;
		langChain4jParagraphTokenizer = newLangChain4jParagraphTokenizer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_PARAGRAPH_TOKENIZER, oldLangChain4jParagraphTokenizer, newLangChain4jParagraphTokenizer);
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
	public void setLangChain4jParagraphTokenizer(LangChain4JParagraphTokenizerDefinition newLangChain4jParagraphTokenizer) {
		if (newLangChain4jParagraphTokenizer != langChain4jParagraphTokenizer) {
			NotificationChain msgs = null;
			if (langChain4jParagraphTokenizer != null)
				msgs = ((InternalEObject)langChain4jParagraphTokenizer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_PARAGRAPH_TOKENIZER, null, msgs);
			if (newLangChain4jParagraphTokenizer != null)
				msgs = ((InternalEObject)newLangChain4jParagraphTokenizer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_PARAGRAPH_TOKENIZER, null, msgs);
			msgs = basicSetLangChain4jParagraphTokenizer(newLangChain4jParagraphTokenizer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_PARAGRAPH_TOKENIZER, newLangChain4jParagraphTokenizer, newLangChain4jParagraphTokenizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LangChain4JSentenceTokenizerDefinition getLangChain4jSentenceTokenizer() {
		return langChain4jSentenceTokenizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLangChain4jSentenceTokenizer(LangChain4JSentenceTokenizerDefinition newLangChain4jSentenceTokenizer, NotificationChain msgs) {
		LangChain4JSentenceTokenizerDefinition oldLangChain4jSentenceTokenizer = langChain4jSentenceTokenizer;
		langChain4jSentenceTokenizer = newLangChain4jSentenceTokenizer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_SENTENCE_TOKENIZER, oldLangChain4jSentenceTokenizer, newLangChain4jSentenceTokenizer);
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
	public void setLangChain4jSentenceTokenizer(LangChain4JSentenceTokenizerDefinition newLangChain4jSentenceTokenizer) {
		if (newLangChain4jSentenceTokenizer != langChain4jSentenceTokenizer) {
			NotificationChain msgs = null;
			if (langChain4jSentenceTokenizer != null)
				msgs = ((InternalEObject)langChain4jSentenceTokenizer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_SENTENCE_TOKENIZER, null, msgs);
			if (newLangChain4jSentenceTokenizer != null)
				msgs = ((InternalEObject)newLangChain4jSentenceTokenizer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_SENTENCE_TOKENIZER, null, msgs);
			msgs = basicSetLangChain4jSentenceTokenizer(newLangChain4jSentenceTokenizer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_SENTENCE_TOKENIZER, newLangChain4jSentenceTokenizer, newLangChain4jSentenceTokenizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LangChain4JWordTokenizerDefinition getLangChain4jWordTokenizer() {
		return langChain4jWordTokenizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLangChain4jWordTokenizer(LangChain4JWordTokenizerDefinition newLangChain4jWordTokenizer, NotificationChain msgs) {
		LangChain4JWordTokenizerDefinition oldLangChain4jWordTokenizer = langChain4jWordTokenizer;
		langChain4jWordTokenizer = newLangChain4jWordTokenizer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_WORD_TOKENIZER, oldLangChain4jWordTokenizer, newLangChain4jWordTokenizer);
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
	public void setLangChain4jWordTokenizer(LangChain4JWordTokenizerDefinition newLangChain4jWordTokenizer) {
		if (newLangChain4jWordTokenizer != langChain4jWordTokenizer) {
			NotificationChain msgs = null;
			if (langChain4jWordTokenizer != null)
				msgs = ((InternalEObject)langChain4jWordTokenizer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_WORD_TOKENIZER, null, msgs);
			if (newLangChain4jWordTokenizer != null)
				msgs = ((InternalEObject)newLangChain4jWordTokenizer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_WORD_TOKENIZER, null, msgs);
			msgs = basicSetLangChain4jWordTokenizer(newLangChain4jWordTokenizer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_WORD_TOKENIZER, newLangChain4jWordTokenizer, newLangChain4jWordTokenizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_CHARACTER_TOKENIZER:
				return basicSetLangChain4jCharacterTokenizer(null, msgs);
			case CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_LINE_TOKENIZER:
				return basicSetLangChain4jLineTokenizer(null, msgs);
			case CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_PARAGRAPH_TOKENIZER:
				return basicSetLangChain4jParagraphTokenizer(null, msgs);
			case CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_SENTENCE_TOKENIZER:
				return basicSetLangChain4jSentenceTokenizer(null, msgs);
			case CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_WORD_TOKENIZER:
				return basicSetLangChain4jWordTokenizer(null, msgs);
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
			case CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_CHARACTER_TOKENIZER:
				return getLangChain4jCharacterTokenizer();
			case CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_LINE_TOKENIZER:
				return getLangChain4jLineTokenizer();
			case CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_PARAGRAPH_TOKENIZER:
				return getLangChain4jParagraphTokenizer();
			case CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_SENTENCE_TOKENIZER:
				return getLangChain4jSentenceTokenizer();
			case CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_WORD_TOKENIZER:
				return getLangChain4jWordTokenizer();
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
			case CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_CHARACTER_TOKENIZER:
				setLangChain4jCharacterTokenizer((LangChain4JCharacterTokenizerDefinition)newValue);
				return;
			case CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_LINE_TOKENIZER:
				setLangChain4jLineTokenizer((LangChain4JLineTokenizerDefinition)newValue);
				return;
			case CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_PARAGRAPH_TOKENIZER:
				setLangChain4jParagraphTokenizer((LangChain4JParagraphTokenizerDefinition)newValue);
				return;
			case CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_SENTENCE_TOKENIZER:
				setLangChain4jSentenceTokenizer((LangChain4JSentenceTokenizerDefinition)newValue);
				return;
			case CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_WORD_TOKENIZER:
				setLangChain4jWordTokenizer((LangChain4JWordTokenizerDefinition)newValue);
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
			case CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_CHARACTER_TOKENIZER:
				setLangChain4jCharacterTokenizer((LangChain4JCharacterTokenizerDefinition)null);
				return;
			case CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_LINE_TOKENIZER:
				setLangChain4jLineTokenizer((LangChain4JLineTokenizerDefinition)null);
				return;
			case CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_PARAGRAPH_TOKENIZER:
				setLangChain4jParagraphTokenizer((LangChain4JParagraphTokenizerDefinition)null);
				return;
			case CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_SENTENCE_TOKENIZER:
				setLangChain4jSentenceTokenizer((LangChain4JSentenceTokenizerDefinition)null);
				return;
			case CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_WORD_TOKENIZER:
				setLangChain4jWordTokenizer((LangChain4JWordTokenizerDefinition)null);
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
			case CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_CHARACTER_TOKENIZER:
				return langChain4jCharacterTokenizer != null;
			case CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_LINE_TOKENIZER:
				return langChain4jLineTokenizer != null;
			case CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_PARAGRAPH_TOKENIZER:
				return langChain4jParagraphTokenizer != null;
			case CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_SENTENCE_TOKENIZER:
				return langChain4jSentenceTokenizer != null;
			case CamelSpringPackage.TOKENIZER_DEFINITION__LANG_CHAIN4J_WORD_TOKENIZER:
				return langChain4jWordTokenizer != null;
		}
		return super.eIsSet(featureID);
	}

} //TokenizerDefinitionImpl
