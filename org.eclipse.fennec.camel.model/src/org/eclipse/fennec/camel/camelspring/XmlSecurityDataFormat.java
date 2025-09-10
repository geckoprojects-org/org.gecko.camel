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
 * A representation of the model object '<em><b>Xml Security Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat#getAddKeyValueForEncryptedKey <em>Add Key Value For Encrypted Key</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat#getDigestAlgorithm <em>Digest Algorithm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat#getKeyCipherAlgorithm <em>Key Cipher Algorithm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat#getKeyOrTrustStoreParametersRef <em>Key Or Trust Store Parameters Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat#getKeyPassword <em>Key Password</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat#getMgfAlgorithm <em>Mgf Algorithm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat#getPassPhrase <em>Pass Phrase</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat#getPassPhraseByte <em>Pass Phrase Byte</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat#getRecipientKeyAlias <em>Recipient Key Alias</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat#getSecureTag <em>Secure Tag</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat#getSecureTagContents <em>Secure Tag Contents</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat#getXmlCipherAlgorithm <em>Xml Cipher Algorithm</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXmlSecurityDataFormat()
 * @model extendedMetaData="name='xmlSecurityDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface XmlSecurityDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Add Key Value For Encrypted Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to add the public key used to encrypt the session key as a KeyValue in the EncryptedKey structure or not.
	 * Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Add Key Value For Encrypted Key</em>' attribute.
	 * @see #setAddKeyValueForEncryptedKey(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXmlSecurityDataFormat_AddKeyValueForEncryptedKey()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='addKeyValueForEncryptedKey'"
	 * @generated
	 */
	String getAddKeyValueForEncryptedKey();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat#getAddKeyValueForEncryptedKey <em>Add Key Value For Encrypted Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Key Value For Encrypted Key</em>' attribute.
	 * @see #getAddKeyValueForEncryptedKey()
	 * @generated
	 */
	void setAddKeyValueForEncryptedKey(String value);

	/**
	 * Returns the value of the '<em><b>Digest Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The digest algorithm to use with the RSA OAEP algorithm. The available choices are: XMLCipher.SHA1 XMLCipher.SHA256
	 * XMLCipher.SHA512 The default value is XMLCipher.SHA1. Default value: SHA1
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Digest Algorithm</em>' attribute.
	 * @see #setDigestAlgorithm(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXmlSecurityDataFormat_DigestAlgorithm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='digestAlgorithm'"
	 * @generated
	 */
	String getDigestAlgorithm();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat#getDigestAlgorithm <em>Digest Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digest Algorithm</em>' attribute.
	 * @see #getDigestAlgorithm()
	 * @generated
	 */
	void setDigestAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Key Cipher Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The cipher algorithm to be used for encryption/decryption of the asymmetric key. The available choices are:
	 * XMLCipher.RSA_v1dot5 XMLCipher.RSA_OAEP XMLCipher.RSA_OAEP_11 The default value is XMLCipher.RSA_OAEP. Default value:
	 * RSA_OAEP
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Cipher Algorithm</em>' attribute.
	 * @see #setKeyCipherAlgorithm(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXmlSecurityDataFormat_KeyCipherAlgorithm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='keyCipherAlgorithm'"
	 * @generated
	 */
	String getKeyCipherAlgorithm();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat#getKeyCipherAlgorithm <em>Key Cipher Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Cipher Algorithm</em>' attribute.
	 * @see #getKeyCipherAlgorithm()
	 * @generated
	 */
	void setKeyCipherAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Key Or Trust Store Parameters Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Refers to a KeyStore instance to lookup in the registry, which is used for configuration options for creating and
	 * loading a KeyStore instance that represents the sender's trustStore or recipient's keyStore.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Or Trust Store Parameters Ref</em>' attribute.
	 * @see #setKeyOrTrustStoreParametersRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXmlSecurityDataFormat_KeyOrTrustStoreParametersRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='keyOrTrustStoreParametersRef'"
	 * @generated
	 */
	String getKeyOrTrustStoreParametersRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat#getKeyOrTrustStoreParametersRef <em>Key Or Trust Store Parameters Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Or Trust Store Parameters Ref</em>' attribute.
	 * @see #getKeyOrTrustStoreParametersRef()
	 * @generated
	 */
	void setKeyOrTrustStoreParametersRef(String value);

	/**
	 * Returns the value of the '<em><b>Key Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The password to be used for retrieving the private key from the KeyStore. This key is used for asymmetric decryption.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Password</em>' attribute.
	 * @see #setKeyPassword(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXmlSecurityDataFormat_KeyPassword()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='keyPassword'"
	 * @generated
	 */
	String getKeyPassword();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat#getKeyPassword <em>Key Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Password</em>' attribute.
	 * @see #getKeyPassword()
	 * @generated
	 */
	void setKeyPassword(String value);

	/**
	 * Returns the value of the '<em><b>Mgf Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The MGF Algorithm to use with the RSA OAEP algorithm. The available choices are: EncryptionConstants.MGF1_SHA1
	 * EncryptionConstants.MGF1_SHA256 EncryptionConstants.MGF1_SHA512 The default value is EncryptionConstants.MGF1_SHA1.
	 * Default value: MGF1_SHA1
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mgf Algorithm</em>' attribute.
	 * @see #setMgfAlgorithm(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXmlSecurityDataFormat_MgfAlgorithm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mgfAlgorithm'"
	 * @generated
	 */
	String getMgfAlgorithm();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat#getMgfAlgorithm <em>Mgf Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mgf Algorithm</em>' attribute.
	 * @see #getMgfAlgorithm()
	 * @generated
	 */
	void setMgfAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Pass Phrase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A String used as passPhrase to encrypt/decrypt content. The passPhrase has to be provided. The passPhrase needs to be
	 * put together in conjunction with the appropriate encryption algorithm. For example using TRIPLEDES the passPhase can be
	 * a Only another 24 Byte key.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pass Phrase</em>' attribute.
	 * @see #setPassPhrase(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXmlSecurityDataFormat_PassPhrase()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='passPhrase'"
	 * @generated
	 */
	String getPassPhrase();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat#getPassPhrase <em>Pass Phrase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pass Phrase</em>' attribute.
	 * @see #getPassPhrase()
	 * @generated
	 */
	void setPassPhrase(String value);

	/**
	 * Returns the value of the '<em><b>Pass Phrase Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A byte used as passPhrase to encrypt/decrypt content. The passPhrase has to be provided. The passPhrase needs to be put
	 * together in conjunction with the appropriate encryption algorithm. For example using TRIPLEDES the passPhase can be a
	 * Only another 24 Byte key.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pass Phrase Byte</em>' attribute.
	 * @see #setPassPhraseByte(byte[])
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXmlSecurityDataFormat_PassPhraseByte()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='attribute' name='passPhraseByte'"
	 * @generated
	 */
	byte[] getPassPhraseByte();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat#getPassPhraseByte <em>Pass Phrase Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pass Phrase Byte</em>' attribute.
	 * @see #getPassPhraseByte()
	 * @generated
	 */
	void setPassPhraseByte(byte[] value);

	/**
	 * Returns the value of the '<em><b>Recipient Key Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The key alias to be used when retrieving the recipient's public or private key from a KeyStore when performing
	 * asymmetric key encryption or decryption.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recipient Key Alias</em>' attribute.
	 * @see #setRecipientKeyAlias(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXmlSecurityDataFormat_RecipientKeyAlias()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='recipientKeyAlias'"
	 * @generated
	 */
	String getRecipientKeyAlias();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat#getRecipientKeyAlias <em>Recipient Key Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient Key Alias</em>' attribute.
	 * @see #getRecipientKeyAlias()
	 * @generated
	 */
	void setRecipientKeyAlias(String value);

	/**
	 * Returns the value of the '<em><b>Secure Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The XPath reference to the XML Element selected for encryption/decryption. If no tag is specified, the entire payload is
	 * encrypted/decrypted.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secure Tag</em>' attribute.
	 * @see #setSecureTag(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXmlSecurityDataFormat_SecureTag()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='secureTag'"
	 * @generated
	 */
	String getSecureTag();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat#getSecureTag <em>Secure Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secure Tag</em>' attribute.
	 * @see #getSecureTag()
	 * @generated
	 */
	void setSecureTag(String value);

	/**
	 * Returns the value of the '<em><b>Secure Tag Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A boolean value to specify whether the XML Element is to be encrypted or the contents of the XML Element. false =
	 * Element Level. true = Element Content Level. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secure Tag Contents</em>' attribute.
	 * @see #setSecureTagContents(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXmlSecurityDataFormat_SecureTagContents()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='secureTagContents'"
	 * @generated
	 */
	String getSecureTagContents();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat#getSecureTagContents <em>Secure Tag Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secure Tag Contents</em>' attribute.
	 * @see #getSecureTagContents()
	 * @generated
	 */
	void setSecureTagContents(String value);

	/**
	 * Returns the value of the '<em><b>Xml Cipher Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The cipher algorithm to be used for encryption/decryption of the XML message content. The available choices are:
	 * XMLCipher.TRIPLEDES XMLCipher.AES_128 XMLCipher.AES_128_GCM XMLCipher.AES_192 XMLCipher.AES_192_GCM XMLCipher.AES_256
	 * XMLCipher.AES_256_GCM XMLCipher.SEED_128 XMLCipher.CAMELLIA_128 XMLCipher.CAMELLIA_192 XMLCipher.CAMELLIA_256 The
	 * default value is XMLCipher.AES_256_GCM. Default value: AES-256-GCM
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xml Cipher Algorithm</em>' attribute.
	 * @see #setXmlCipherAlgorithm(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXmlSecurityDataFormat_XmlCipherAlgorithm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='xmlCipherAlgorithm'"
	 * @generated
	 */
	String getXmlCipherAlgorithm();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat#getXmlCipherAlgorithm <em>Xml Cipher Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Cipher Algorithm</em>' attribute.
	 * @see #getXmlCipherAlgorithm()
	 * @generated
	 */
	void setXmlCipherAlgorithm(String value);

} // XmlSecurityDataFormat
