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
import org.eclipse.fennec.camel.camelspring.PgpDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pgp Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.PgpDataFormatImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.PgpDataFormatImpl#getArmored <em>Armored</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.PgpDataFormatImpl#getCompressionAlgorithm <em>Compression Algorithm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.PgpDataFormatImpl#getHashAlgorithm <em>Hash Algorithm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.PgpDataFormatImpl#getIntegrity <em>Integrity</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.PgpDataFormatImpl#getKeyFileName <em>Key File Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.PgpDataFormatImpl#getKeyUserid <em>Key Userid</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.PgpDataFormatImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.PgpDataFormatImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.PgpDataFormatImpl#getSignatureKeyFileName <em>Signature Key File Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.PgpDataFormatImpl#getSignatureKeyRing <em>Signature Key Ring</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.PgpDataFormatImpl#getSignatureKeyUserid <em>Signature Key Userid</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.PgpDataFormatImpl#getSignaturePassword <em>Signature Password</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.PgpDataFormatImpl#getSignatureVerificationOption <em>Signature Verification Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PgpDataFormatImpl extends DataFormatImpl implements PgpDataFormat {
	/**
	 * The default value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String algorithm = ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getArmored() <em>Armored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmored()
	 * @generated
	 * @ordered
	 */
	protected static final String ARMORED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArmored() <em>Armored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmored()
	 * @generated
	 * @ordered
	 */
	protected String armored = ARMORED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompressionAlgorithm() <em>Compression Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPRESSION_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompressionAlgorithm() <em>Compression Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String compressionAlgorithm = COMPRESSION_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHashAlgorithm() <em>Hash Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String HASH_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHashAlgorithm() <em>Hash Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String hashAlgorithm = HASH_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntegrity() <em>Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrity()
	 * @generated
	 * @ordered
	 */
	protected static final String INTEGRITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntegrity() <em>Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrity()
	 * @generated
	 * @ordered
	 */
	protected String integrity = INTEGRITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyFileName() <em>Key File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyFileName() <em>Key File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyFileName()
	 * @generated
	 * @ordered
	 */
	protected String keyFileName = KEY_FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyUserid() <em>Key Userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyUserid()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_USERID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyUserid() <em>Key Userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyUserid()
	 * @generated
	 * @ordered
	 */
	protected String keyUserid = KEY_USERID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected String provider = PROVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignatureKeyFileName() <em>Signature Key File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureKeyFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_KEY_FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignatureKeyFileName() <em>Signature Key File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureKeyFileName()
	 * @generated
	 * @ordered
	 */
	protected String signatureKeyFileName = SIGNATURE_KEY_FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignatureKeyRing() <em>Signature Key Ring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureKeyRing()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_KEY_RING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignatureKeyRing() <em>Signature Key Ring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureKeyRing()
	 * @generated
	 * @ordered
	 */
	protected String signatureKeyRing = SIGNATURE_KEY_RING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignatureKeyUserid() <em>Signature Key Userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureKeyUserid()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_KEY_USERID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignatureKeyUserid() <em>Signature Key Userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureKeyUserid()
	 * @generated
	 * @ordered
	 */
	protected String signatureKeyUserid = SIGNATURE_KEY_USERID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignaturePassword() <em>Signature Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignaturePassword()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignaturePassword() <em>Signature Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignaturePassword()
	 * @generated
	 * @ordered
	 */
	protected String signaturePassword = SIGNATURE_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignatureVerificationOption() <em>Signature Verification Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureVerificationOption()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_VERIFICATION_OPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignatureVerificationOption() <em>Signature Verification Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureVerificationOption()
	 * @generated
	 * @ordered
	 */
	protected String signatureVerificationOption = SIGNATURE_VERIFICATION_OPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PgpDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getPgpDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlgorithm() {
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgorithm(String newAlgorithm) {
		String oldAlgorithm = algorithm;
		algorithm = newAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PGP_DATA_FORMAT__ALGORITHM, oldAlgorithm, algorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArmored() {
		return armored;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArmored(String newArmored) {
		String oldArmored = armored;
		armored = newArmored;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PGP_DATA_FORMAT__ARMORED, oldArmored, armored));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompressionAlgorithm() {
		return compressionAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompressionAlgorithm(String newCompressionAlgorithm) {
		String oldCompressionAlgorithm = compressionAlgorithm;
		compressionAlgorithm = newCompressionAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PGP_DATA_FORMAT__COMPRESSION_ALGORITHM, oldCompressionAlgorithm, compressionAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHashAlgorithm() {
		return hashAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHashAlgorithm(String newHashAlgorithm) {
		String oldHashAlgorithm = hashAlgorithm;
		hashAlgorithm = newHashAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PGP_DATA_FORMAT__HASH_ALGORITHM, oldHashAlgorithm, hashAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIntegrity() {
		return integrity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntegrity(String newIntegrity) {
		String oldIntegrity = integrity;
		integrity = newIntegrity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PGP_DATA_FORMAT__INTEGRITY, oldIntegrity, integrity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeyFileName() {
		return keyFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyFileName(String newKeyFileName) {
		String oldKeyFileName = keyFileName;
		keyFileName = newKeyFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PGP_DATA_FORMAT__KEY_FILE_NAME, oldKeyFileName, keyFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeyUserid() {
		return keyUserid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyUserid(String newKeyUserid) {
		String oldKeyUserid = keyUserid;
		keyUserid = newKeyUserid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PGP_DATA_FORMAT__KEY_USERID, oldKeyUserid, keyUserid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PGP_DATA_FORMAT__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvider(String newProvider) {
		String oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PGP_DATA_FORMAT__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSignatureKeyFileName() {
		return signatureKeyFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignatureKeyFileName(String newSignatureKeyFileName) {
		String oldSignatureKeyFileName = signatureKeyFileName;
		signatureKeyFileName = newSignatureKeyFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PGP_DATA_FORMAT__SIGNATURE_KEY_FILE_NAME, oldSignatureKeyFileName, signatureKeyFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSignatureKeyRing() {
		return signatureKeyRing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignatureKeyRing(String newSignatureKeyRing) {
		String oldSignatureKeyRing = signatureKeyRing;
		signatureKeyRing = newSignatureKeyRing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PGP_DATA_FORMAT__SIGNATURE_KEY_RING, oldSignatureKeyRing, signatureKeyRing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSignatureKeyUserid() {
		return signatureKeyUserid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignatureKeyUserid(String newSignatureKeyUserid) {
		String oldSignatureKeyUserid = signatureKeyUserid;
		signatureKeyUserid = newSignatureKeyUserid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PGP_DATA_FORMAT__SIGNATURE_KEY_USERID, oldSignatureKeyUserid, signatureKeyUserid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSignaturePassword() {
		return signaturePassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignaturePassword(String newSignaturePassword) {
		String oldSignaturePassword = signaturePassword;
		signaturePassword = newSignaturePassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PGP_DATA_FORMAT__SIGNATURE_PASSWORD, oldSignaturePassword, signaturePassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSignatureVerificationOption() {
		return signatureVerificationOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignatureVerificationOption(String newSignatureVerificationOption) {
		String oldSignatureVerificationOption = signatureVerificationOption;
		signatureVerificationOption = newSignatureVerificationOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PGP_DATA_FORMAT__SIGNATURE_VERIFICATION_OPTION, oldSignatureVerificationOption, signatureVerificationOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.PGP_DATA_FORMAT__ALGORITHM:
				return getAlgorithm();
			case CamelSpringPackage.PGP_DATA_FORMAT__ARMORED:
				return getArmored();
			case CamelSpringPackage.PGP_DATA_FORMAT__COMPRESSION_ALGORITHM:
				return getCompressionAlgorithm();
			case CamelSpringPackage.PGP_DATA_FORMAT__HASH_ALGORITHM:
				return getHashAlgorithm();
			case CamelSpringPackage.PGP_DATA_FORMAT__INTEGRITY:
				return getIntegrity();
			case CamelSpringPackage.PGP_DATA_FORMAT__KEY_FILE_NAME:
				return getKeyFileName();
			case CamelSpringPackage.PGP_DATA_FORMAT__KEY_USERID:
				return getKeyUserid();
			case CamelSpringPackage.PGP_DATA_FORMAT__PASSWORD:
				return getPassword();
			case CamelSpringPackage.PGP_DATA_FORMAT__PROVIDER:
				return getProvider();
			case CamelSpringPackage.PGP_DATA_FORMAT__SIGNATURE_KEY_FILE_NAME:
				return getSignatureKeyFileName();
			case CamelSpringPackage.PGP_DATA_FORMAT__SIGNATURE_KEY_RING:
				return getSignatureKeyRing();
			case CamelSpringPackage.PGP_DATA_FORMAT__SIGNATURE_KEY_USERID:
				return getSignatureKeyUserid();
			case CamelSpringPackage.PGP_DATA_FORMAT__SIGNATURE_PASSWORD:
				return getSignaturePassword();
			case CamelSpringPackage.PGP_DATA_FORMAT__SIGNATURE_VERIFICATION_OPTION:
				return getSignatureVerificationOption();
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
			case CamelSpringPackage.PGP_DATA_FORMAT__ALGORITHM:
				setAlgorithm((String)newValue);
				return;
			case CamelSpringPackage.PGP_DATA_FORMAT__ARMORED:
				setArmored((String)newValue);
				return;
			case CamelSpringPackage.PGP_DATA_FORMAT__COMPRESSION_ALGORITHM:
				setCompressionAlgorithm((String)newValue);
				return;
			case CamelSpringPackage.PGP_DATA_FORMAT__HASH_ALGORITHM:
				setHashAlgorithm((String)newValue);
				return;
			case CamelSpringPackage.PGP_DATA_FORMAT__INTEGRITY:
				setIntegrity((String)newValue);
				return;
			case CamelSpringPackage.PGP_DATA_FORMAT__KEY_FILE_NAME:
				setKeyFileName((String)newValue);
				return;
			case CamelSpringPackage.PGP_DATA_FORMAT__KEY_USERID:
				setKeyUserid((String)newValue);
				return;
			case CamelSpringPackage.PGP_DATA_FORMAT__PASSWORD:
				setPassword((String)newValue);
				return;
			case CamelSpringPackage.PGP_DATA_FORMAT__PROVIDER:
				setProvider((String)newValue);
				return;
			case CamelSpringPackage.PGP_DATA_FORMAT__SIGNATURE_KEY_FILE_NAME:
				setSignatureKeyFileName((String)newValue);
				return;
			case CamelSpringPackage.PGP_DATA_FORMAT__SIGNATURE_KEY_RING:
				setSignatureKeyRing((String)newValue);
				return;
			case CamelSpringPackage.PGP_DATA_FORMAT__SIGNATURE_KEY_USERID:
				setSignatureKeyUserid((String)newValue);
				return;
			case CamelSpringPackage.PGP_DATA_FORMAT__SIGNATURE_PASSWORD:
				setSignaturePassword((String)newValue);
				return;
			case CamelSpringPackage.PGP_DATA_FORMAT__SIGNATURE_VERIFICATION_OPTION:
				setSignatureVerificationOption((String)newValue);
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
			case CamelSpringPackage.PGP_DATA_FORMAT__ALGORITHM:
				setAlgorithm(ALGORITHM_EDEFAULT);
				return;
			case CamelSpringPackage.PGP_DATA_FORMAT__ARMORED:
				setArmored(ARMORED_EDEFAULT);
				return;
			case CamelSpringPackage.PGP_DATA_FORMAT__COMPRESSION_ALGORITHM:
				setCompressionAlgorithm(COMPRESSION_ALGORITHM_EDEFAULT);
				return;
			case CamelSpringPackage.PGP_DATA_FORMAT__HASH_ALGORITHM:
				setHashAlgorithm(HASH_ALGORITHM_EDEFAULT);
				return;
			case CamelSpringPackage.PGP_DATA_FORMAT__INTEGRITY:
				setIntegrity(INTEGRITY_EDEFAULT);
				return;
			case CamelSpringPackage.PGP_DATA_FORMAT__KEY_FILE_NAME:
				setKeyFileName(KEY_FILE_NAME_EDEFAULT);
				return;
			case CamelSpringPackage.PGP_DATA_FORMAT__KEY_USERID:
				setKeyUserid(KEY_USERID_EDEFAULT);
				return;
			case CamelSpringPackage.PGP_DATA_FORMAT__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case CamelSpringPackage.PGP_DATA_FORMAT__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case CamelSpringPackage.PGP_DATA_FORMAT__SIGNATURE_KEY_FILE_NAME:
				setSignatureKeyFileName(SIGNATURE_KEY_FILE_NAME_EDEFAULT);
				return;
			case CamelSpringPackage.PGP_DATA_FORMAT__SIGNATURE_KEY_RING:
				setSignatureKeyRing(SIGNATURE_KEY_RING_EDEFAULT);
				return;
			case CamelSpringPackage.PGP_DATA_FORMAT__SIGNATURE_KEY_USERID:
				setSignatureKeyUserid(SIGNATURE_KEY_USERID_EDEFAULT);
				return;
			case CamelSpringPackage.PGP_DATA_FORMAT__SIGNATURE_PASSWORD:
				setSignaturePassword(SIGNATURE_PASSWORD_EDEFAULT);
				return;
			case CamelSpringPackage.PGP_DATA_FORMAT__SIGNATURE_VERIFICATION_OPTION:
				setSignatureVerificationOption(SIGNATURE_VERIFICATION_OPTION_EDEFAULT);
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
			case CamelSpringPackage.PGP_DATA_FORMAT__ALGORITHM:
				return ALGORITHM_EDEFAULT == null ? algorithm != null : !ALGORITHM_EDEFAULT.equals(algorithm);
			case CamelSpringPackage.PGP_DATA_FORMAT__ARMORED:
				return ARMORED_EDEFAULT == null ? armored != null : !ARMORED_EDEFAULT.equals(armored);
			case CamelSpringPackage.PGP_DATA_FORMAT__COMPRESSION_ALGORITHM:
				return COMPRESSION_ALGORITHM_EDEFAULT == null ? compressionAlgorithm != null : !COMPRESSION_ALGORITHM_EDEFAULT.equals(compressionAlgorithm);
			case CamelSpringPackage.PGP_DATA_FORMAT__HASH_ALGORITHM:
				return HASH_ALGORITHM_EDEFAULT == null ? hashAlgorithm != null : !HASH_ALGORITHM_EDEFAULT.equals(hashAlgorithm);
			case CamelSpringPackage.PGP_DATA_FORMAT__INTEGRITY:
				return INTEGRITY_EDEFAULT == null ? integrity != null : !INTEGRITY_EDEFAULT.equals(integrity);
			case CamelSpringPackage.PGP_DATA_FORMAT__KEY_FILE_NAME:
				return KEY_FILE_NAME_EDEFAULT == null ? keyFileName != null : !KEY_FILE_NAME_EDEFAULT.equals(keyFileName);
			case CamelSpringPackage.PGP_DATA_FORMAT__KEY_USERID:
				return KEY_USERID_EDEFAULT == null ? keyUserid != null : !KEY_USERID_EDEFAULT.equals(keyUserid);
			case CamelSpringPackage.PGP_DATA_FORMAT__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case CamelSpringPackage.PGP_DATA_FORMAT__PROVIDER:
				return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
			case CamelSpringPackage.PGP_DATA_FORMAT__SIGNATURE_KEY_FILE_NAME:
				return SIGNATURE_KEY_FILE_NAME_EDEFAULT == null ? signatureKeyFileName != null : !SIGNATURE_KEY_FILE_NAME_EDEFAULT.equals(signatureKeyFileName);
			case CamelSpringPackage.PGP_DATA_FORMAT__SIGNATURE_KEY_RING:
				return SIGNATURE_KEY_RING_EDEFAULT == null ? signatureKeyRing != null : !SIGNATURE_KEY_RING_EDEFAULT.equals(signatureKeyRing);
			case CamelSpringPackage.PGP_DATA_FORMAT__SIGNATURE_KEY_USERID:
				return SIGNATURE_KEY_USERID_EDEFAULT == null ? signatureKeyUserid != null : !SIGNATURE_KEY_USERID_EDEFAULT.equals(signatureKeyUserid);
			case CamelSpringPackage.PGP_DATA_FORMAT__SIGNATURE_PASSWORD:
				return SIGNATURE_PASSWORD_EDEFAULT == null ? signaturePassword != null : !SIGNATURE_PASSWORD_EDEFAULT.equals(signaturePassword);
			case CamelSpringPackage.PGP_DATA_FORMAT__SIGNATURE_VERIFICATION_OPTION:
				return SIGNATURE_VERIFICATION_OPTION_EDEFAULT == null ? signatureVerificationOption != null : !SIGNATURE_VERIFICATION_OPTION_EDEFAULT.equals(signatureVerificationOption);
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
		result.append(" (algorithm: ");
		result.append(algorithm);
		result.append(", armored: ");
		result.append(armored);
		result.append(", compressionAlgorithm: ");
		result.append(compressionAlgorithm);
		result.append(", hashAlgorithm: ");
		result.append(hashAlgorithm);
		result.append(", integrity: ");
		result.append(integrity);
		result.append(", keyFileName: ");
		result.append(keyFileName);
		result.append(", keyUserid: ");
		result.append(keyUserid);
		result.append(", password: ");
		result.append(password);
		result.append(", provider: ");
		result.append(provider);
		result.append(", signatureKeyFileName: ");
		result.append(signatureKeyFileName);
		result.append(", signatureKeyRing: ");
		result.append(signatureKeyRing);
		result.append(", signatureKeyUserid: ");
		result.append(signatureKeyUserid);
		result.append(", signaturePassword: ");
		result.append(signaturePassword);
		result.append(", signatureVerificationOption: ");
		result.append(signatureVerificationOption);
		result.append(')');
		return result.toString();
	}

} //PgpDataFormatImpl
