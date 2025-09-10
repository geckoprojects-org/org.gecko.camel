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
 * A representation of the model object '<em><b>Tokenizer Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TokenizerDefinition#getLangChain4jCharacterTokenizer <em>Lang Chain4j Character Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TokenizerDefinition#getLangChain4jLineTokenizer <em>Lang Chain4j Line Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TokenizerDefinition#getLangChain4jParagraphTokenizer <em>Lang Chain4j Paragraph Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TokenizerDefinition#getLangChain4jSentenceTokenizer <em>Lang Chain4j Sentence Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TokenizerDefinition#getLangChain4jWordTokenizer <em>Lang Chain4j Word Tokenizer</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTokenizerDefinition()
 * @model extendedMetaData="name='tokenizerDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TokenizerDefinition extends NoOutputDefinition {
	/**
	 * Returns the value of the '<em><b>Lang Chain4j Character Tokenizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Camel AI: Tokenizer for splitting by character.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang Chain4j Character Tokenizer</em>' containment reference.
	 * @see #setLangChain4jCharacterTokenizer(LangChain4JCharacterTokenizerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTokenizerDefinition_LangChain4jCharacterTokenizer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='langChain4jCharacterTokenizer' namespace='##targetNamespace'"
	 * @generated
	 */
	LangChain4JCharacterTokenizerDefinition getLangChain4jCharacterTokenizer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TokenizerDefinition#getLangChain4jCharacterTokenizer <em>Lang Chain4j Character Tokenizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Chain4j Character Tokenizer</em>' containment reference.
	 * @see #getLangChain4jCharacterTokenizer()
	 * @generated
	 */
	void setLangChain4jCharacterTokenizer(LangChain4JCharacterTokenizerDefinition value);

	/**
	 * Returns the value of the '<em><b>Lang Chain4j Line Tokenizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Camel AI: Tokenizer for splitting line by line.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang Chain4j Line Tokenizer</em>' containment reference.
	 * @see #setLangChain4jLineTokenizer(LangChain4JLineTokenizerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTokenizerDefinition_LangChain4jLineTokenizer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='langChain4jLineTokenizer' namespace='##targetNamespace'"
	 * @generated
	 */
	LangChain4JLineTokenizerDefinition getLangChain4jLineTokenizer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TokenizerDefinition#getLangChain4jLineTokenizer <em>Lang Chain4j Line Tokenizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Chain4j Line Tokenizer</em>' containment reference.
	 * @see #getLangChain4jLineTokenizer()
	 * @generated
	 */
	void setLangChain4jLineTokenizer(LangChain4JLineTokenizerDefinition value);

	/**
	 * Returns the value of the '<em><b>Lang Chain4j Paragraph Tokenizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Camel AI: Tokenizer for splitting by paragraphs.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang Chain4j Paragraph Tokenizer</em>' containment reference.
	 * @see #setLangChain4jParagraphTokenizer(LangChain4JParagraphTokenizerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTokenizerDefinition_LangChain4jParagraphTokenizer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='langChain4jParagraphTokenizer' namespace='##targetNamespace'"
	 * @generated
	 */
	LangChain4JParagraphTokenizerDefinition getLangChain4jParagraphTokenizer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TokenizerDefinition#getLangChain4jParagraphTokenizer <em>Lang Chain4j Paragraph Tokenizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Chain4j Paragraph Tokenizer</em>' containment reference.
	 * @see #getLangChain4jParagraphTokenizer()
	 * @generated
	 */
	void setLangChain4jParagraphTokenizer(LangChain4JParagraphTokenizerDefinition value);

	/**
	 * Returns the value of the '<em><b>Lang Chain4j Sentence Tokenizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Camel AI: Tokenizer for splitting by sentences.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang Chain4j Sentence Tokenizer</em>' containment reference.
	 * @see #setLangChain4jSentenceTokenizer(LangChain4JSentenceTokenizerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTokenizerDefinition_LangChain4jSentenceTokenizer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='langChain4jSentenceTokenizer' namespace='##targetNamespace'"
	 * @generated
	 */
	LangChain4JSentenceTokenizerDefinition getLangChain4jSentenceTokenizer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TokenizerDefinition#getLangChain4jSentenceTokenizer <em>Lang Chain4j Sentence Tokenizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Chain4j Sentence Tokenizer</em>' containment reference.
	 * @see #getLangChain4jSentenceTokenizer()
	 * @generated
	 */
	void setLangChain4jSentenceTokenizer(LangChain4JSentenceTokenizerDefinition value);

	/**
	 * Returns the value of the '<em><b>Lang Chain4j Word Tokenizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Camel AI: Tokenizer for splitting by word.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang Chain4j Word Tokenizer</em>' containment reference.
	 * @see #setLangChain4jWordTokenizer(LangChain4JWordTokenizerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTokenizerDefinition_LangChain4jWordTokenizer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='langChain4jWordTokenizer' namespace='##targetNamespace'"
	 * @generated
	 */
	LangChain4JWordTokenizerDefinition getLangChain4jWordTokenizer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TokenizerDefinition#getLangChain4jWordTokenizer <em>Lang Chain4j Word Tokenizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Chain4j Word Tokenizer</em>' containment reference.
	 * @see #getLangChain4jWordTokenizer()
	 * @generated
	 */
	void setLangChain4jWordTokenizer(LangChain4JWordTokenizerDefinition value);

} // TokenizerDefinition
