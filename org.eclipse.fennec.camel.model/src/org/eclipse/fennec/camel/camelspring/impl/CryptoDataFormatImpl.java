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
import org.eclipse.fennec.camel.camelspring.CryptoDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crypto Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CryptoDataFormatImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CryptoDataFormatImpl#getAlgorithmParameterRef <em>Algorithm Parameter Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CryptoDataFormatImpl#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CryptoDataFormatImpl#getCryptoProvider <em>Crypto Provider</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CryptoDataFormatImpl#getInitVectorRef <em>Init Vector Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CryptoDataFormatImpl#getInline <em>Inline</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CryptoDataFormatImpl#getKeyRef <em>Key Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CryptoDataFormatImpl#getMacAlgorithm <em>Mac Algorithm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CryptoDataFormatImpl#getShouldAppendHMAC <em>Should Append HMAC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CryptoDataFormatImpl extends DataFormatImpl implements CryptoDataFormat {
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
	 * The default value of the '{@link #getAlgorithmParameterRef() <em>Algorithm Parameter Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmParameterRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_PARAMETER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithmParameterRef() <em>Algorithm Parameter Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmParameterRef()
	 * @generated
	 * @ordered
	 */
	protected String algorithmParameterRef = ALGORITHM_PARAMETER_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSize()
	 * @generated
	 * @ordered
	 */
	protected static final String BUFFER_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSize()
	 * @generated
	 * @ordered
	 */
	protected String bufferSize = BUFFER_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCryptoProvider() <em>Crypto Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCryptoProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String CRYPTO_PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCryptoProvider() <em>Crypto Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCryptoProvider()
	 * @generated
	 * @ordered
	 */
	protected String cryptoProvider = CRYPTO_PROVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitVectorRef() <em>Init Vector Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitVectorRef()
	 * @generated
	 * @ordered
	 */
	protected static final String INIT_VECTOR_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitVectorRef() <em>Init Vector Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitVectorRef()
	 * @generated
	 * @ordered
	 */
	protected String initVectorRef = INIT_VECTOR_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getInline() <em>Inline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInline()
	 * @generated
	 * @ordered
	 */
	protected static final String INLINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInline() <em>Inline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInline()
	 * @generated
	 * @ordered
	 */
	protected String inline = INLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyRef() <em>Key Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyRef()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyRef() <em>Key Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyRef()
	 * @generated
	 * @ordered
	 */
	protected String keyRef = KEY_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getMacAlgorithm() <em>Mac Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String MAC_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMacAlgorithm() <em>Mac Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String macAlgorithm = MAC_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getShouldAppendHMAC() <em>Should Append HMAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShouldAppendHMAC()
	 * @generated
	 * @ordered
	 */
	protected static final String SHOULD_APPEND_HMAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShouldAppendHMAC() <em>Should Append HMAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShouldAppendHMAC()
	 * @generated
	 * @ordered
	 */
	protected String shouldAppendHMAC = SHOULD_APPEND_HMAC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CryptoDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getCryptoDataFormat();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CRYPTO_DATA_FORMAT__ALGORITHM, oldAlgorithm, algorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlgorithmParameterRef() {
		return algorithmParameterRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgorithmParameterRef(String newAlgorithmParameterRef) {
		String oldAlgorithmParameterRef = algorithmParameterRef;
		algorithmParameterRef = newAlgorithmParameterRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CRYPTO_DATA_FORMAT__ALGORITHM_PARAMETER_REF, oldAlgorithmParameterRef, algorithmParameterRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBufferSize() {
		return bufferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBufferSize(String newBufferSize) {
		String oldBufferSize = bufferSize;
		bufferSize = newBufferSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CRYPTO_DATA_FORMAT__BUFFER_SIZE, oldBufferSize, bufferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCryptoProvider() {
		return cryptoProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCryptoProvider(String newCryptoProvider) {
		String oldCryptoProvider = cryptoProvider;
		cryptoProvider = newCryptoProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CRYPTO_DATA_FORMAT__CRYPTO_PROVIDER, oldCryptoProvider, cryptoProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInitVectorRef() {
		return initVectorRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitVectorRef(String newInitVectorRef) {
		String oldInitVectorRef = initVectorRef;
		initVectorRef = newInitVectorRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CRYPTO_DATA_FORMAT__INIT_VECTOR_REF, oldInitVectorRef, initVectorRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInline() {
		return inline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInline(String newInline) {
		String oldInline = inline;
		inline = newInline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CRYPTO_DATA_FORMAT__INLINE, oldInline, inline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeyRef() {
		return keyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyRef(String newKeyRef) {
		String oldKeyRef = keyRef;
		keyRef = newKeyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CRYPTO_DATA_FORMAT__KEY_REF, oldKeyRef, keyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMacAlgorithm() {
		return macAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMacAlgorithm(String newMacAlgorithm) {
		String oldMacAlgorithm = macAlgorithm;
		macAlgorithm = newMacAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CRYPTO_DATA_FORMAT__MAC_ALGORITHM, oldMacAlgorithm, macAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShouldAppendHMAC() {
		return shouldAppendHMAC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShouldAppendHMAC(String newShouldAppendHMAC) {
		String oldShouldAppendHMAC = shouldAppendHMAC;
		shouldAppendHMAC = newShouldAppendHMAC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CRYPTO_DATA_FORMAT__SHOULD_APPEND_HMAC, oldShouldAppendHMAC, shouldAppendHMAC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__ALGORITHM:
				return getAlgorithm();
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__ALGORITHM_PARAMETER_REF:
				return getAlgorithmParameterRef();
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__BUFFER_SIZE:
				return getBufferSize();
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__CRYPTO_PROVIDER:
				return getCryptoProvider();
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__INIT_VECTOR_REF:
				return getInitVectorRef();
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__INLINE:
				return getInline();
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__KEY_REF:
				return getKeyRef();
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__MAC_ALGORITHM:
				return getMacAlgorithm();
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__SHOULD_APPEND_HMAC:
				return getShouldAppendHMAC();
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
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__ALGORITHM:
				setAlgorithm((String)newValue);
				return;
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__ALGORITHM_PARAMETER_REF:
				setAlgorithmParameterRef((String)newValue);
				return;
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__BUFFER_SIZE:
				setBufferSize((String)newValue);
				return;
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__CRYPTO_PROVIDER:
				setCryptoProvider((String)newValue);
				return;
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__INIT_VECTOR_REF:
				setInitVectorRef((String)newValue);
				return;
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__INLINE:
				setInline((String)newValue);
				return;
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__KEY_REF:
				setKeyRef((String)newValue);
				return;
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__MAC_ALGORITHM:
				setMacAlgorithm((String)newValue);
				return;
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__SHOULD_APPEND_HMAC:
				setShouldAppendHMAC((String)newValue);
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
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__ALGORITHM:
				setAlgorithm(ALGORITHM_EDEFAULT);
				return;
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__ALGORITHM_PARAMETER_REF:
				setAlgorithmParameterRef(ALGORITHM_PARAMETER_REF_EDEFAULT);
				return;
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__BUFFER_SIZE:
				setBufferSize(BUFFER_SIZE_EDEFAULT);
				return;
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__CRYPTO_PROVIDER:
				setCryptoProvider(CRYPTO_PROVIDER_EDEFAULT);
				return;
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__INIT_VECTOR_REF:
				setInitVectorRef(INIT_VECTOR_REF_EDEFAULT);
				return;
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__INLINE:
				setInline(INLINE_EDEFAULT);
				return;
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__KEY_REF:
				setKeyRef(KEY_REF_EDEFAULT);
				return;
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__MAC_ALGORITHM:
				setMacAlgorithm(MAC_ALGORITHM_EDEFAULT);
				return;
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__SHOULD_APPEND_HMAC:
				setShouldAppendHMAC(SHOULD_APPEND_HMAC_EDEFAULT);
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
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__ALGORITHM:
				return ALGORITHM_EDEFAULT == null ? algorithm != null : !ALGORITHM_EDEFAULT.equals(algorithm);
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__ALGORITHM_PARAMETER_REF:
				return ALGORITHM_PARAMETER_REF_EDEFAULT == null ? algorithmParameterRef != null : !ALGORITHM_PARAMETER_REF_EDEFAULT.equals(algorithmParameterRef);
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__BUFFER_SIZE:
				return BUFFER_SIZE_EDEFAULT == null ? bufferSize != null : !BUFFER_SIZE_EDEFAULT.equals(bufferSize);
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__CRYPTO_PROVIDER:
				return CRYPTO_PROVIDER_EDEFAULT == null ? cryptoProvider != null : !CRYPTO_PROVIDER_EDEFAULT.equals(cryptoProvider);
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__INIT_VECTOR_REF:
				return INIT_VECTOR_REF_EDEFAULT == null ? initVectorRef != null : !INIT_VECTOR_REF_EDEFAULT.equals(initVectorRef);
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__INLINE:
				return INLINE_EDEFAULT == null ? inline != null : !INLINE_EDEFAULT.equals(inline);
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__KEY_REF:
				return KEY_REF_EDEFAULT == null ? keyRef != null : !KEY_REF_EDEFAULT.equals(keyRef);
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__MAC_ALGORITHM:
				return MAC_ALGORITHM_EDEFAULT == null ? macAlgorithm != null : !MAC_ALGORITHM_EDEFAULT.equals(macAlgorithm);
			case CamelSpringPackage.CRYPTO_DATA_FORMAT__SHOULD_APPEND_HMAC:
				return SHOULD_APPEND_HMAC_EDEFAULT == null ? shouldAppendHMAC != null : !SHOULD_APPEND_HMAC_EDEFAULT.equals(shouldAppendHMAC);
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
		result.append(", algorithmParameterRef: ");
		result.append(algorithmParameterRef);
		result.append(", bufferSize: ");
		result.append(bufferSize);
		result.append(", cryptoProvider: ");
		result.append(cryptoProvider);
		result.append(", initVectorRef: ");
		result.append(initVectorRef);
		result.append(", inline: ");
		result.append(inline);
		result.append(", keyRef: ");
		result.append(keyRef);
		result.append(", macAlgorithm: ");
		result.append(macAlgorithm);
		result.append(", shouldAppendHMAC: ");
		result.append(shouldAppendHMAC);
		result.append(')');
		return result.toString();
	}

} //CryptoDataFormatImpl
