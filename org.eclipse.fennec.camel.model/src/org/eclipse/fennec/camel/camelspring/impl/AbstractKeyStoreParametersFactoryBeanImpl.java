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

import org.eclipse.fennec.camel.camelspring.AbstractKeyStoreParametersFactoryBean;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Key Store Parameters Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AbstractKeyStoreParametersFactoryBeanImpl#getKeyStore <em>Key Store</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AbstractKeyStoreParametersFactoryBeanImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AbstractKeyStoreParametersFactoryBeanImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AbstractKeyStoreParametersFactoryBeanImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AbstractKeyStoreParametersFactoryBeanImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractKeyStoreParametersFactoryBeanImpl extends AbstractJsseUtilFactoryBeanImpl implements AbstractKeyStoreParametersFactoryBean {
	/**
	 * The default value of the '{@link #getKeyStore() <em>Key Store</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyStore()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_STORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyStore() <em>Key Store</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyStore()
	 * @generated
	 * @ordered
	 */
	protected String keyStore = KEY_STORE_EDEFAULT;

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
	 * The default value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected String resource = RESOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractKeyStoreParametersFactoryBeanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getAbstractKeyStoreParametersFactoryBean();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeyStore() {
		return keyStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyStore(String newKeyStore) {
		String oldKeyStore = keyStore;
		keyStore = newKeyStore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN__KEY_STORE, oldKeyStore, keyStore));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN__PASSWORD, oldPassword, password));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResource(String newResource) {
		String oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN__KEY_STORE:
				return getKeyStore();
			case CamelSpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN__PASSWORD:
				return getPassword();
			case CamelSpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN__PROVIDER:
				return getProvider();
			case CamelSpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN__RESOURCE:
				return getResource();
			case CamelSpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN__TYPE:
				return getType();
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
			case CamelSpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN__KEY_STORE:
				setKeyStore((String)newValue);
				return;
			case CamelSpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN__PASSWORD:
				setPassword((String)newValue);
				return;
			case CamelSpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN__PROVIDER:
				setProvider((String)newValue);
				return;
			case CamelSpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN__RESOURCE:
				setResource((String)newValue);
				return;
			case CamelSpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN__TYPE:
				setType((String)newValue);
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
			case CamelSpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN__KEY_STORE:
				setKeyStore(KEY_STORE_EDEFAULT);
				return;
			case CamelSpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case CamelSpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case CamelSpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN__RESOURCE:
				setResource(RESOURCE_EDEFAULT);
				return;
			case CamelSpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN__TYPE:
				setType(TYPE_EDEFAULT);
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
			case CamelSpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN__KEY_STORE:
				return KEY_STORE_EDEFAULT == null ? keyStore != null : !KEY_STORE_EDEFAULT.equals(keyStore);
			case CamelSpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case CamelSpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN__PROVIDER:
				return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
			case CamelSpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN__RESOURCE:
				return RESOURCE_EDEFAULT == null ? resource != null : !RESOURCE_EDEFAULT.equals(resource);
			case CamelSpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (keyStore: ");
		result.append(keyStore);
		result.append(", password: ");
		result.append(password);
		result.append(", provider: ");
		result.append(provider);
		result.append(", resource: ");
		result.append(resource);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //AbstractKeyStoreParametersFactoryBeanImpl
