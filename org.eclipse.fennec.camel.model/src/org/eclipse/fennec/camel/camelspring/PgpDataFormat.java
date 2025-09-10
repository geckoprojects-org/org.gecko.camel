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
 * A representation of the model object '<em><b>Pgp Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getArmored <em>Armored</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getCompressionAlgorithm <em>Compression Algorithm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getHashAlgorithm <em>Hash Algorithm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getIntegrity <em>Integrity</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getKeyFileName <em>Key File Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getKeyUserid <em>Key Userid</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getSignatureKeyFileName <em>Signature Key File Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getSignatureKeyRing <em>Signature Key Ring</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getSignatureKeyUserid <em>Signature Key Userid</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getSignaturePassword <em>Signature Password</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getSignatureVerificationOption <em>Signature Verification Option</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getPgpDataFormat()
 * @model extendedMetaData="name='pgpDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface PgpDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Symmetric key encryption algorithm; possible values are defined in org.bouncycastle.bcpg.SymmetricKeyAlgorithmTags; for
	 * example 2 (= TRIPLE DES), 3 (= CAST5), 4 (= BLOWFISH), 6 (= DES), 7 (= AES_128). Only relevant for encrypting.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #setAlgorithm(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getPgpDataFormat_Algorithm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='algorithm'"
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Armored</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * This option will cause PGP to base64 encode the encrypted text, making it available for copy/paste, etc. Default value:
	 * false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Armored</em>' attribute.
	 * @see #setArmored(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getPgpDataFormat_Armored()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='armored'"
	 * @generated
	 */
	String getArmored();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getArmored <em>Armored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Armored</em>' attribute.
	 * @see #getArmored()
	 * @generated
	 */
	void setArmored(String value);

	/**
	 * Returns the value of the '<em><b>Compression Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Compression algorithm; possible values are defined in org.bouncycastle.bcpg.CompressionAlgorithmTags; for example 0 (=
	 * UNCOMPRESSED), 1 (= ZIP), 2 (= ZLIB), 3 (= BZIP2). Only relevant for encrypting.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compression Algorithm</em>' attribute.
	 * @see #setCompressionAlgorithm(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getPgpDataFormat_CompressionAlgorithm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='compressionAlgorithm'"
	 * @generated
	 */
	String getCompressionAlgorithm();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getCompressionAlgorithm <em>Compression Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression Algorithm</em>' attribute.
	 * @see #getCompressionAlgorithm()
	 * @generated
	 */
	void setCompressionAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Hash Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Signature hash algorithm; possible values are defined in org.bouncycastle.bcpg.HashAlgorithmTags; for example 2 (=
	 * SHA1), 8 (= SHA256), 9 (= SHA384), 10 (= SHA512), 11 (=SHA224). Only relevant for signing.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hash Algorithm</em>' attribute.
	 * @see #setHashAlgorithm(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getPgpDataFormat_HashAlgorithm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='hashAlgorithm'"
	 * @generated
	 */
	String getHashAlgorithm();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getHashAlgorithm <em>Hash Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash Algorithm</em>' attribute.
	 * @see #getHashAlgorithm()
	 * @generated
	 */
	void setHashAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Adds an integrity check/sign into the encryption file. The default value is true. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Integrity</em>' attribute.
	 * @see #setIntegrity(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getPgpDataFormat_Integrity()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='integrity'"
	 * @generated
	 */
	String getIntegrity();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getIntegrity <em>Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integrity</em>' attribute.
	 * @see #getIntegrity()
	 * @generated
	 */
	void setIntegrity(String value);

	/**
	 * Returns the value of the '<em><b>Key File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Filename of the keyring; must be accessible as a classpath resource (but you can specify a location in the file system
	 * by using the file: prefix).
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key File Name</em>' attribute.
	 * @see #setKeyFileName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getPgpDataFormat_KeyFileName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='keyFileName'"
	 * @generated
	 */
	String getKeyFileName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getKeyFileName <em>Key File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key File Name</em>' attribute.
	 * @see #getKeyFileName()
	 * @generated
	 */
	void setKeyFileName(String value);

	/**
	 * Returns the value of the '<em><b>Key Userid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The user ID of the key in the PGP keyring used during encryption. Can also be only a part of a user ID. For example, if
	 * the user ID is Test User then you can use the part Test User or to address the user ID.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Userid</em>' attribute.
	 * @see #setKeyUserid(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getPgpDataFormat_KeyUserid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='keyUserid'"
	 * @generated
	 */
	String getKeyUserid();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getKeyUserid <em>Key Userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Userid</em>' attribute.
	 * @see #getKeyUserid()
	 * @generated
	 */
	void setKeyUserid(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Password used when opening the private key (not used for encryption).
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getPgpDataFormat_Password()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='password'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Java Cryptography Extension (JCE) provider, default is Bouncy Castle (BC). Alternatively you can use, for example, the
	 * IAIK JCE provider; in this case the provider must be registered beforehand and the Bouncy Castle provider must not be
	 * registered beforehand. The Sun JCE provider does not work.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see #setProvider(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getPgpDataFormat_Provider()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='provider'"
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(String value);

	/**
	 * Returns the value of the '<em><b>Signature Key File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Filename of the keyring to use for signing (during encryption) or for signature verification (during decryption); must
	 * be accessible as a classpath resource (but you can specify a location in the file system by using the file: prefix).
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature Key File Name</em>' attribute.
	 * @see #setSignatureKeyFileName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getPgpDataFormat_SignatureKeyFileName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='signatureKeyFileName'"
	 * @generated
	 */
	String getSignatureKeyFileName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getSignatureKeyFileName <em>Signature Key File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Key File Name</em>' attribute.
	 * @see #getSignatureKeyFileName()
	 * @generated
	 */
	void setSignatureKeyFileName(String value);

	/**
	 * Returns the value of the '<em><b>Signature Key Ring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Keyring used for signing/verifying as byte array. You can not set the signatureKeyFileName and signatureKeyRing at the
	 * same time.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature Key Ring</em>' attribute.
	 * @see #setSignatureKeyRing(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getPgpDataFormat_SignatureKeyRing()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='signatureKeyRing'"
	 * @generated
	 */
	String getSignatureKeyRing();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getSignatureKeyRing <em>Signature Key Ring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Key Ring</em>' attribute.
	 * @see #getSignatureKeyRing()
	 * @generated
	 */
	void setSignatureKeyRing(String value);

	/**
	 * Returns the value of the '<em><b>Signature Key Userid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * User ID of the key in the PGP keyring used for signing (during encryption) or signature verification (during
	 * decryption). During the signature verification process the specified User ID restricts the public keys from the public
	 * keyring which can be used for the verification. If no User ID is specified for the signature verficiation then any
	 * public key in the public keyring can be used for the verification. Can also be only a part of a user ID. For example, if
	 * the user ID is Test User then you can use the part Test User or to address the User ID.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature Key Userid</em>' attribute.
	 * @see #setSignatureKeyUserid(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getPgpDataFormat_SignatureKeyUserid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='signatureKeyUserid'"
	 * @generated
	 */
	String getSignatureKeyUserid();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getSignatureKeyUserid <em>Signature Key Userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Key Userid</em>' attribute.
	 * @see #getSignatureKeyUserid()
	 * @generated
	 */
	void setSignatureKeyUserid(String value);

	/**
	 * Returns the value of the '<em><b>Signature Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Password used when opening the private key used for signing (during encryption).
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature Password</em>' attribute.
	 * @see #setSignaturePassword(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getPgpDataFormat_SignaturePassword()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='signaturePassword'"
	 * @generated
	 */
	String getSignaturePassword();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getSignaturePassword <em>Signature Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Password</em>' attribute.
	 * @see #getSignaturePassword()
	 * @generated
	 */
	void setSignaturePassword(String value);

	/**
	 * Returns the value of the '<em><b>Signature Verification Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Controls the behavior for verifying the signature during unmarshaling. There are 4 values possible: optional: The PGP
	 * message may or may not contain signatures; if it does contain signatures, then a signature verification is executed.
	 * required: The PGP message must contain at least one signature; if this is not the case an exception (PGPException) is
	 * thrown. A signature verification is executed. ignore: Contained signatures in the PGP message are ignored; no signature
	 * verification is executed. no_signature_allowed: The PGP message must not contain a signature; otherwise an exception
	 * (PGPException) is thrown.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature Verification Option</em>' attribute.
	 * @see #setSignatureVerificationOption(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getPgpDataFormat_SignatureVerificationOption()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='signatureVerificationOption'"
	 * @generated
	 */
	String getSignatureVerificationOption();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat#getSignatureVerificationOption <em>Signature Verification Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Verification Option</em>' attribute.
	 * @see #getSignatureVerificationOption()
	 * @generated
	 */
	void setSignatureVerificationOption(String value);

} // PgpDataFormat
