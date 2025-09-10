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
import org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xml Security Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.XmlSecurityDataFormatImpl#getAddKeyValueForEncryptedKey <em>Add Key Value For Encrypted Key</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.XmlSecurityDataFormatImpl#getDigestAlgorithm <em>Digest Algorithm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.XmlSecurityDataFormatImpl#getKeyCipherAlgorithm <em>Key Cipher Algorithm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.XmlSecurityDataFormatImpl#getKeyOrTrustStoreParametersRef <em>Key Or Trust Store Parameters Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.XmlSecurityDataFormatImpl#getKeyPassword <em>Key Password</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.XmlSecurityDataFormatImpl#getMgfAlgorithm <em>Mgf Algorithm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.XmlSecurityDataFormatImpl#getPassPhrase <em>Pass Phrase</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.XmlSecurityDataFormatImpl#getPassPhraseByte <em>Pass Phrase Byte</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.XmlSecurityDataFormatImpl#getRecipientKeyAlias <em>Recipient Key Alias</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.XmlSecurityDataFormatImpl#getSecureTag <em>Secure Tag</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.XmlSecurityDataFormatImpl#getSecureTagContents <em>Secure Tag Contents</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.XmlSecurityDataFormatImpl#getXmlCipherAlgorithm <em>Xml Cipher Algorithm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XmlSecurityDataFormatImpl extends DataFormatImpl implements XmlSecurityDataFormat {
	/**
	 * The default value of the '{@link #getAddKeyValueForEncryptedKey() <em>Add Key Value For Encrypted Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddKeyValueForEncryptedKey()
	 * @generated
	 * @ordered
	 */
	protected static final String ADD_KEY_VALUE_FOR_ENCRYPTED_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddKeyValueForEncryptedKey() <em>Add Key Value For Encrypted Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddKeyValueForEncryptedKey()
	 * @generated
	 * @ordered
	 */
	protected String addKeyValueForEncryptedKey = ADD_KEY_VALUE_FOR_ENCRYPTED_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDigestAlgorithm() <em>Digest Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigestAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String DIGEST_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDigestAlgorithm() <em>Digest Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigestAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String digestAlgorithm = DIGEST_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyCipherAlgorithm() <em>Key Cipher Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyCipherAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_CIPHER_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyCipherAlgorithm() <em>Key Cipher Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyCipherAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String keyCipherAlgorithm = KEY_CIPHER_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyOrTrustStoreParametersRef() <em>Key Or Trust Store Parameters Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyOrTrustStoreParametersRef()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_OR_TRUST_STORE_PARAMETERS_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyOrTrustStoreParametersRef() <em>Key Or Trust Store Parameters Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyOrTrustStoreParametersRef()
	 * @generated
	 * @ordered
	 */
	protected String keyOrTrustStoreParametersRef = KEY_OR_TRUST_STORE_PARAMETERS_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyPassword() <em>Key Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyPassword() <em>Key Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyPassword()
	 * @generated
	 * @ordered
	 */
	protected String keyPassword = KEY_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMgfAlgorithm() <em>Mgf Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMgfAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String MGF_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMgfAlgorithm() <em>Mgf Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMgfAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String mgfAlgorithm = MGF_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassPhrase() <em>Pass Phrase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassPhrase()
	 * @generated
	 * @ordered
	 */
	protected static final String PASS_PHRASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassPhrase() <em>Pass Phrase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassPhrase()
	 * @generated
	 * @ordered
	 */
	protected String passPhrase = PASS_PHRASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassPhraseByte() <em>Pass Phrase Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassPhraseByte()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] PASS_PHRASE_BYTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassPhraseByte() <em>Pass Phrase Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassPhraseByte()
	 * @generated
	 * @ordered
	 */
	protected byte[] passPhraseByte = PASS_PHRASE_BYTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecipientKeyAlias() <em>Recipient Key Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipientKeyAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String RECIPIENT_KEY_ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecipientKeyAlias() <em>Recipient Key Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipientKeyAlias()
	 * @generated
	 * @ordered
	 */
	protected String recipientKeyAlias = RECIPIENT_KEY_ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecureTag() <em>Secure Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecureTag()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURE_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecureTag() <em>Secure Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecureTag()
	 * @generated
	 * @ordered
	 */
	protected String secureTag = SECURE_TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecureTagContents() <em>Secure Tag Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecureTagContents()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURE_TAG_CONTENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecureTagContents() <em>Secure Tag Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecureTagContents()
	 * @generated
	 * @ordered
	 */
	protected String secureTagContents = SECURE_TAG_CONTENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getXmlCipherAlgorithm() <em>Xml Cipher Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlCipherAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_CIPHER_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmlCipherAlgorithm() <em>Xml Cipher Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlCipherAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String xmlCipherAlgorithm = XML_CIPHER_ALGORITHM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlSecurityDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getXmlSecurityDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddKeyValueForEncryptedKey() {
		return addKeyValueForEncryptedKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddKeyValueForEncryptedKey(String newAddKeyValueForEncryptedKey) {
		String oldAddKeyValueForEncryptedKey = addKeyValueForEncryptedKey;
		addKeyValueForEncryptedKey = newAddKeyValueForEncryptedKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.XML_SECURITY_DATA_FORMAT__ADD_KEY_VALUE_FOR_ENCRYPTED_KEY, oldAddKeyValueForEncryptedKey, addKeyValueForEncryptedKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDigestAlgorithm() {
		return digestAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDigestAlgorithm(String newDigestAlgorithm) {
		String oldDigestAlgorithm = digestAlgorithm;
		digestAlgorithm = newDigestAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.XML_SECURITY_DATA_FORMAT__DIGEST_ALGORITHM, oldDigestAlgorithm, digestAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeyCipherAlgorithm() {
		return keyCipherAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyCipherAlgorithm(String newKeyCipherAlgorithm) {
		String oldKeyCipherAlgorithm = keyCipherAlgorithm;
		keyCipherAlgorithm = newKeyCipherAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.XML_SECURITY_DATA_FORMAT__KEY_CIPHER_ALGORITHM, oldKeyCipherAlgorithm, keyCipherAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeyOrTrustStoreParametersRef() {
		return keyOrTrustStoreParametersRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyOrTrustStoreParametersRef(String newKeyOrTrustStoreParametersRef) {
		String oldKeyOrTrustStoreParametersRef = keyOrTrustStoreParametersRef;
		keyOrTrustStoreParametersRef = newKeyOrTrustStoreParametersRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.XML_SECURITY_DATA_FORMAT__KEY_OR_TRUST_STORE_PARAMETERS_REF, oldKeyOrTrustStoreParametersRef, keyOrTrustStoreParametersRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeyPassword() {
		return keyPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyPassword(String newKeyPassword) {
		String oldKeyPassword = keyPassword;
		keyPassword = newKeyPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.XML_SECURITY_DATA_FORMAT__KEY_PASSWORD, oldKeyPassword, keyPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMgfAlgorithm() {
		return mgfAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMgfAlgorithm(String newMgfAlgorithm) {
		String oldMgfAlgorithm = mgfAlgorithm;
		mgfAlgorithm = newMgfAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.XML_SECURITY_DATA_FORMAT__MGF_ALGORITHM, oldMgfAlgorithm, mgfAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPassPhrase() {
		return passPhrase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassPhrase(String newPassPhrase) {
		String oldPassPhrase = passPhrase;
		passPhrase = newPassPhrase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.XML_SECURITY_DATA_FORMAT__PASS_PHRASE, oldPassPhrase, passPhrase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getPassPhraseByte() {
		return passPhraseByte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassPhraseByte(byte[] newPassPhraseByte) {
		byte[] oldPassPhraseByte = passPhraseByte;
		passPhraseByte = newPassPhraseByte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.XML_SECURITY_DATA_FORMAT__PASS_PHRASE_BYTE, oldPassPhraseByte, passPhraseByte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRecipientKeyAlias() {
		return recipientKeyAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecipientKeyAlias(String newRecipientKeyAlias) {
		String oldRecipientKeyAlias = recipientKeyAlias;
		recipientKeyAlias = newRecipientKeyAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.XML_SECURITY_DATA_FORMAT__RECIPIENT_KEY_ALIAS, oldRecipientKeyAlias, recipientKeyAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecureTag() {
		return secureTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecureTag(String newSecureTag) {
		String oldSecureTag = secureTag;
		secureTag = newSecureTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.XML_SECURITY_DATA_FORMAT__SECURE_TAG, oldSecureTag, secureTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecureTagContents() {
		return secureTagContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecureTagContents(String newSecureTagContents) {
		String oldSecureTagContents = secureTagContents;
		secureTagContents = newSecureTagContents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.XML_SECURITY_DATA_FORMAT__SECURE_TAG_CONTENTS, oldSecureTagContents, secureTagContents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXmlCipherAlgorithm() {
		return xmlCipherAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmlCipherAlgorithm(String newXmlCipherAlgorithm) {
		String oldXmlCipherAlgorithm = xmlCipherAlgorithm;
		xmlCipherAlgorithm = newXmlCipherAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.XML_SECURITY_DATA_FORMAT__XML_CIPHER_ALGORITHM, oldXmlCipherAlgorithm, xmlCipherAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__ADD_KEY_VALUE_FOR_ENCRYPTED_KEY:
				return getAddKeyValueForEncryptedKey();
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__DIGEST_ALGORITHM:
				return getDigestAlgorithm();
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__KEY_CIPHER_ALGORITHM:
				return getKeyCipherAlgorithm();
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__KEY_OR_TRUST_STORE_PARAMETERS_REF:
				return getKeyOrTrustStoreParametersRef();
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__KEY_PASSWORD:
				return getKeyPassword();
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__MGF_ALGORITHM:
				return getMgfAlgorithm();
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__PASS_PHRASE:
				return getPassPhrase();
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__PASS_PHRASE_BYTE:
				return getPassPhraseByte();
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__RECIPIENT_KEY_ALIAS:
				return getRecipientKeyAlias();
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__SECURE_TAG:
				return getSecureTag();
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__SECURE_TAG_CONTENTS:
				return getSecureTagContents();
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__XML_CIPHER_ALGORITHM:
				return getXmlCipherAlgorithm();
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
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__ADD_KEY_VALUE_FOR_ENCRYPTED_KEY:
				setAddKeyValueForEncryptedKey((String)newValue);
				return;
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__DIGEST_ALGORITHM:
				setDigestAlgorithm((String)newValue);
				return;
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__KEY_CIPHER_ALGORITHM:
				setKeyCipherAlgorithm((String)newValue);
				return;
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__KEY_OR_TRUST_STORE_PARAMETERS_REF:
				setKeyOrTrustStoreParametersRef((String)newValue);
				return;
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__KEY_PASSWORD:
				setKeyPassword((String)newValue);
				return;
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__MGF_ALGORITHM:
				setMgfAlgorithm((String)newValue);
				return;
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__PASS_PHRASE:
				setPassPhrase((String)newValue);
				return;
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__PASS_PHRASE_BYTE:
				setPassPhraseByte((byte[])newValue);
				return;
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__RECIPIENT_KEY_ALIAS:
				setRecipientKeyAlias((String)newValue);
				return;
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__SECURE_TAG:
				setSecureTag((String)newValue);
				return;
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__SECURE_TAG_CONTENTS:
				setSecureTagContents((String)newValue);
				return;
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__XML_CIPHER_ALGORITHM:
				setXmlCipherAlgorithm((String)newValue);
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
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__ADD_KEY_VALUE_FOR_ENCRYPTED_KEY:
				setAddKeyValueForEncryptedKey(ADD_KEY_VALUE_FOR_ENCRYPTED_KEY_EDEFAULT);
				return;
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__DIGEST_ALGORITHM:
				setDigestAlgorithm(DIGEST_ALGORITHM_EDEFAULT);
				return;
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__KEY_CIPHER_ALGORITHM:
				setKeyCipherAlgorithm(KEY_CIPHER_ALGORITHM_EDEFAULT);
				return;
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__KEY_OR_TRUST_STORE_PARAMETERS_REF:
				setKeyOrTrustStoreParametersRef(KEY_OR_TRUST_STORE_PARAMETERS_REF_EDEFAULT);
				return;
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__KEY_PASSWORD:
				setKeyPassword(KEY_PASSWORD_EDEFAULT);
				return;
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__MGF_ALGORITHM:
				setMgfAlgorithm(MGF_ALGORITHM_EDEFAULT);
				return;
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__PASS_PHRASE:
				setPassPhrase(PASS_PHRASE_EDEFAULT);
				return;
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__PASS_PHRASE_BYTE:
				setPassPhraseByte(PASS_PHRASE_BYTE_EDEFAULT);
				return;
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__RECIPIENT_KEY_ALIAS:
				setRecipientKeyAlias(RECIPIENT_KEY_ALIAS_EDEFAULT);
				return;
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__SECURE_TAG:
				setSecureTag(SECURE_TAG_EDEFAULT);
				return;
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__SECURE_TAG_CONTENTS:
				setSecureTagContents(SECURE_TAG_CONTENTS_EDEFAULT);
				return;
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__XML_CIPHER_ALGORITHM:
				setXmlCipherAlgorithm(XML_CIPHER_ALGORITHM_EDEFAULT);
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
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__ADD_KEY_VALUE_FOR_ENCRYPTED_KEY:
				return ADD_KEY_VALUE_FOR_ENCRYPTED_KEY_EDEFAULT == null ? addKeyValueForEncryptedKey != null : !ADD_KEY_VALUE_FOR_ENCRYPTED_KEY_EDEFAULT.equals(addKeyValueForEncryptedKey);
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__DIGEST_ALGORITHM:
				return DIGEST_ALGORITHM_EDEFAULT == null ? digestAlgorithm != null : !DIGEST_ALGORITHM_EDEFAULT.equals(digestAlgorithm);
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__KEY_CIPHER_ALGORITHM:
				return KEY_CIPHER_ALGORITHM_EDEFAULT == null ? keyCipherAlgorithm != null : !KEY_CIPHER_ALGORITHM_EDEFAULT.equals(keyCipherAlgorithm);
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__KEY_OR_TRUST_STORE_PARAMETERS_REF:
				return KEY_OR_TRUST_STORE_PARAMETERS_REF_EDEFAULT == null ? keyOrTrustStoreParametersRef != null : !KEY_OR_TRUST_STORE_PARAMETERS_REF_EDEFAULT.equals(keyOrTrustStoreParametersRef);
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__KEY_PASSWORD:
				return KEY_PASSWORD_EDEFAULT == null ? keyPassword != null : !KEY_PASSWORD_EDEFAULT.equals(keyPassword);
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__MGF_ALGORITHM:
				return MGF_ALGORITHM_EDEFAULT == null ? mgfAlgorithm != null : !MGF_ALGORITHM_EDEFAULT.equals(mgfAlgorithm);
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__PASS_PHRASE:
				return PASS_PHRASE_EDEFAULT == null ? passPhrase != null : !PASS_PHRASE_EDEFAULT.equals(passPhrase);
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__PASS_PHRASE_BYTE:
				return PASS_PHRASE_BYTE_EDEFAULT == null ? passPhraseByte != null : !PASS_PHRASE_BYTE_EDEFAULT.equals(passPhraseByte);
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__RECIPIENT_KEY_ALIAS:
				return RECIPIENT_KEY_ALIAS_EDEFAULT == null ? recipientKeyAlias != null : !RECIPIENT_KEY_ALIAS_EDEFAULT.equals(recipientKeyAlias);
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__SECURE_TAG:
				return SECURE_TAG_EDEFAULT == null ? secureTag != null : !SECURE_TAG_EDEFAULT.equals(secureTag);
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__SECURE_TAG_CONTENTS:
				return SECURE_TAG_CONTENTS_EDEFAULT == null ? secureTagContents != null : !SECURE_TAG_CONTENTS_EDEFAULT.equals(secureTagContents);
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT__XML_CIPHER_ALGORITHM:
				return XML_CIPHER_ALGORITHM_EDEFAULT == null ? xmlCipherAlgorithm != null : !XML_CIPHER_ALGORITHM_EDEFAULT.equals(xmlCipherAlgorithm);
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
		result.append(" (addKeyValueForEncryptedKey: ");
		result.append(addKeyValueForEncryptedKey);
		result.append(", digestAlgorithm: ");
		result.append(digestAlgorithm);
		result.append(", keyCipherAlgorithm: ");
		result.append(keyCipherAlgorithm);
		result.append(", keyOrTrustStoreParametersRef: ");
		result.append(keyOrTrustStoreParametersRef);
		result.append(", keyPassword: ");
		result.append(keyPassword);
		result.append(", mgfAlgorithm: ");
		result.append(mgfAlgorithm);
		result.append(", passPhrase: ");
		result.append(passPhrase);
		result.append(", passPhraseByte: ");
		result.append(passPhraseByte);
		result.append(", recipientKeyAlias: ");
		result.append(recipientKeyAlias);
		result.append(", secureTag: ");
		result.append(secureTag);
		result.append(", secureTagContents: ");
		result.append(secureTagContents);
		result.append(", xmlCipherAlgorithm: ");
		result.append(xmlCipherAlgorithm);
		result.append(')');
		return result.toString();
	}

} //XmlSecurityDataFormatImpl
