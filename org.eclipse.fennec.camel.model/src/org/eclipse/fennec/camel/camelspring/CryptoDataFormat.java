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
 * A representation of the model object '<em><b>Crypto Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CryptoDataFormat#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CryptoDataFormat#getAlgorithmParameterRef <em>Algorithm Parameter Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CryptoDataFormat#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CryptoDataFormat#getCryptoProvider <em>Crypto Provider</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CryptoDataFormat#getInitVectorRef <em>Init Vector Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CryptoDataFormat#getInline <em>Inline</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CryptoDataFormat#getKeyRef <em>Key Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CryptoDataFormat#getMacAlgorithm <em>Mac Algorithm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CryptoDataFormat#getShouldAppendHMAC <em>Should Append HMAC</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCryptoDataFormat()
 * @model extendedMetaData="name='cryptoDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface CryptoDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The JCE algorithm name indicating the cryptographic algorithm that will be used.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #setAlgorithm(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCryptoDataFormat_Algorithm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='algorithm'"
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CryptoDataFormat#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Algorithm Parameter Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A JCE AlgorithmParameterSpec used to initialize the Cipher. Will lookup the type using the given name as a
	 * java.security.spec.AlgorithmParameterSpec type.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Algorithm Parameter Ref</em>' attribute.
	 * @see #setAlgorithmParameterRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCryptoDataFormat_AlgorithmParameterRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='algorithmParameterRef'"
	 * @generated
	 */
	String getAlgorithmParameterRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CryptoDataFormat#getAlgorithmParameterRef <em>Algorithm Parameter Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm Parameter Ref</em>' attribute.
	 * @see #getAlgorithmParameterRef()
	 * @generated
	 */
	void setAlgorithmParameterRef(String value);

	/**
	 * Returns the value of the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The size of the buffer used in the signature process. Default value: 4096
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Buffer Size</em>' attribute.
	 * @see #setBufferSize(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCryptoDataFormat_BufferSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='bufferSize'"
	 * @generated
	 */
	String getBufferSize();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CryptoDataFormat#getBufferSize <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Size</em>' attribute.
	 * @see #getBufferSize()
	 * @generated
	 */
	void setBufferSize(String value);

	/**
	 * Returns the value of the '<em><b>Crypto Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The name of the JCE Security Provider that should be used.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crypto Provider</em>' attribute.
	 * @see #setCryptoProvider(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCryptoDataFormat_CryptoProvider()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='cryptoProvider'"
	 * @generated
	 */
	String getCryptoProvider();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CryptoDataFormat#getCryptoProvider <em>Crypto Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crypto Provider</em>' attribute.
	 * @see #getCryptoProvider()
	 * @generated
	 */
	void setCryptoProvider(String value);

	/**
	 * Returns the value of the '<em><b>Init Vector Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Refers to a byte array containing the Initialization Vector that will be used to initialize the Cipher.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Init Vector Ref</em>' attribute.
	 * @see #setInitVectorRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCryptoDataFormat_InitVectorRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='initVectorRef'"
	 * @generated
	 */
	String getInitVectorRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CryptoDataFormat#getInitVectorRef <em>Init Vector Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Vector Ref</em>' attribute.
	 * @see #getInitVectorRef()
	 * @generated
	 */
	void setInitVectorRef(String value);

	/**
	 * Returns the value of the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Flag indicating that the configured IV should be inlined into the encrypted data stream. Is by default false. Default
	 * value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inline</em>' attribute.
	 * @see #setInline(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCryptoDataFormat_Inline()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='inline'"
	 * @generated
	 */
	String getInline();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CryptoDataFormat#getInline <em>Inline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inline</em>' attribute.
	 * @see #getInline()
	 * @generated
	 */
	void setInline(String value);

	/**
	 * Returns the value of the '<em><b>Key Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Refers to the secret key to lookup from the register to use.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Ref</em>' attribute.
	 * @see #setKeyRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCryptoDataFormat_KeyRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='keyRef'"
	 * @generated
	 */
	String getKeyRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CryptoDataFormat#getKeyRef <em>Key Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Ref</em>' attribute.
	 * @see #getKeyRef()
	 * @generated
	 */
	void setKeyRef(String value);

	/**
	 * Returns the value of the '<em><b>Mac Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The JCE algorithm name indicating the Message Authentication algorithm. Default value: HmacSHA1
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mac Algorithm</em>' attribute.
	 * @see #setMacAlgorithm(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCryptoDataFormat_MacAlgorithm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='macAlgorithm'"
	 * @generated
	 */
	String getMacAlgorithm();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CryptoDataFormat#getMacAlgorithm <em>Mac Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mac Algorithm</em>' attribute.
	 * @see #getMacAlgorithm()
	 * @generated
	 */
	void setMacAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Should Append HMAC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Flag indicating that a Message Authentication Code should be calculated and appended to the encrypted data. Default
	 * value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Should Append HMAC</em>' attribute.
	 * @see #setShouldAppendHMAC(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCryptoDataFormat_ShouldAppendHMAC()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='shouldAppendHMAC'"
	 * @generated
	 */
	String getShouldAppendHMAC();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CryptoDataFormat#getShouldAppendHMAC <em>Should Append HMAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Should Append HMAC</em>' attribute.
	 * @see #getShouldAppendHMAC()
	 * @generated
	 */
	void setShouldAppendHMAC(String value);

} // CryptoDataFormat
