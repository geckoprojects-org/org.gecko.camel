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

import org.eclipse.fennec.camel.camelspring.AbstractTrustManagersParametersFactoryBean;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Trust Managers Parameters Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AbstractTrustManagersParametersFactoryBeanImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AbstractTrustManagersParametersFactoryBeanImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AbstractTrustManagersParametersFactoryBeanImpl#getTrustManager <em>Trust Manager</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractTrustManagersParametersFactoryBeanImpl extends AbstractJsseUtilFactoryBeanImpl implements AbstractTrustManagersParametersFactoryBean {
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
	 * The default value of the '{@link #getTrustManager() <em>Trust Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustManager()
	 * @generated
	 * @ordered
	 */
	protected static final String TRUST_MANAGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrustManager() <em>Trust Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustManager()
	 * @generated
	 * @ordered
	 */
	protected String trustManager = TRUST_MANAGER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTrustManagersParametersFactoryBeanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getAbstractTrustManagersParametersFactoryBean();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ABSTRACT_TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN__ALGORITHM, oldAlgorithm, algorithm));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ABSTRACT_TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrustManager() {
		return trustManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrustManager(String newTrustManager) {
		String oldTrustManager = trustManager;
		trustManager = newTrustManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ABSTRACT_TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN__TRUST_MANAGER, oldTrustManager, trustManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.ABSTRACT_TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN__ALGORITHM:
				return getAlgorithm();
			case CamelSpringPackage.ABSTRACT_TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN__PROVIDER:
				return getProvider();
			case CamelSpringPackage.ABSTRACT_TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN__TRUST_MANAGER:
				return getTrustManager();
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
			case CamelSpringPackage.ABSTRACT_TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN__ALGORITHM:
				setAlgorithm((String)newValue);
				return;
			case CamelSpringPackage.ABSTRACT_TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN__PROVIDER:
				setProvider((String)newValue);
				return;
			case CamelSpringPackage.ABSTRACT_TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN__TRUST_MANAGER:
				setTrustManager((String)newValue);
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
			case CamelSpringPackage.ABSTRACT_TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN__ALGORITHM:
				setAlgorithm(ALGORITHM_EDEFAULT);
				return;
			case CamelSpringPackage.ABSTRACT_TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case CamelSpringPackage.ABSTRACT_TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN__TRUST_MANAGER:
				setTrustManager(TRUST_MANAGER_EDEFAULT);
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
			case CamelSpringPackage.ABSTRACT_TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN__ALGORITHM:
				return ALGORITHM_EDEFAULT == null ? algorithm != null : !ALGORITHM_EDEFAULT.equals(algorithm);
			case CamelSpringPackage.ABSTRACT_TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN__PROVIDER:
				return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
			case CamelSpringPackage.ABSTRACT_TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN__TRUST_MANAGER:
				return TRUST_MANAGER_EDEFAULT == null ? trustManager != null : !TRUST_MANAGER_EDEFAULT.equals(trustManager);
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
		result.append(", provider: ");
		result.append(provider);
		result.append(", trustManager: ");
		result.append(trustManager);
		result.append(')');
		return result.toString();
	}

} //AbstractTrustManagersParametersFactoryBeanImpl
