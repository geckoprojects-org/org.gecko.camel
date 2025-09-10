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
import org.eclipse.fennec.camel.camelspring.KeyStoreParametersFactoryBean;
import org.eclipse.fennec.camel.camelspring.TrustManagersParametersFactoryBean;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trust Managers Parameters Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TrustManagersParametersFactoryBeanImpl#getKeyStore <em>Key Store</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrustManagersParametersFactoryBeanImpl extends AbstractTrustManagersParametersFactoryBeanImpl implements TrustManagersParametersFactoryBean {
	/**
	 * The cached value of the '{@link #getKeyStore() <em>Key Store</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyStore()
	 * @generated
	 * @ordered
	 */
	protected KeyStoreParametersFactoryBean keyStore;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrustManagersParametersFactoryBeanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getTrustManagersParametersFactoryBean();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyStoreParametersFactoryBean getKeyStore() {
		return keyStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyStore(KeyStoreParametersFactoryBean newKeyStore, NotificationChain msgs) {
		KeyStoreParametersFactoryBean oldKeyStore = keyStore;
		keyStore = newKeyStore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN__KEY_STORE, oldKeyStore, newKeyStore);
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
	public void setKeyStore(KeyStoreParametersFactoryBean newKeyStore) {
		if (newKeyStore != keyStore) {
			NotificationChain msgs = null;
			if (keyStore != null)
				msgs = ((InternalEObject)keyStore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN__KEY_STORE, null, msgs);
			if (newKeyStore != null)
				msgs = ((InternalEObject)newKeyStore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN__KEY_STORE, null, msgs);
			msgs = basicSetKeyStore(newKeyStore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN__KEY_STORE, newKeyStore, newKeyStore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN__KEY_STORE:
				return basicSetKeyStore(null, msgs);
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
			case CamelSpringPackage.TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN__KEY_STORE:
				return getKeyStore();
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
			case CamelSpringPackage.TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN__KEY_STORE:
				setKeyStore((KeyStoreParametersFactoryBean)newValue);
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
			case CamelSpringPackage.TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN__KEY_STORE:
				setKeyStore((KeyStoreParametersFactoryBean)null);
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
			case CamelSpringPackage.TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN__KEY_STORE:
				return keyStore != null;
		}
		return super.eIsSet(featureID);
	}

} //TrustManagersParametersFactoryBeanImpl
