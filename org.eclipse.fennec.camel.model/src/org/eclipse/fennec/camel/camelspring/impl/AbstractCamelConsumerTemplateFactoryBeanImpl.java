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

import org.eclipse.fennec.camel.camelspring.AbstractCamelConsumerTemplateFactoryBean;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Camel Consumer Template Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AbstractCamelConsumerTemplateFactoryBeanImpl#getMaximumCacheSize <em>Maximum Cache Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractCamelConsumerTemplateFactoryBeanImpl extends AbstractCamelFactoryBeanImpl implements AbstractCamelConsumerTemplateFactoryBean {
	/**
	 * The default value of the '{@link #getMaximumCacheSize() <em>Maximum Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumCacheSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_CACHE_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaximumCacheSize() <em>Maximum Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumCacheSize()
	 * @generated
	 * @ordered
	 */
	protected int maximumCacheSize = MAXIMUM_CACHE_SIZE_EDEFAULT;

	/**
	 * This is true if the Maximum Cache Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximumCacheSizeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractCamelConsumerTemplateFactoryBeanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getAbstractCamelConsumerTemplateFactoryBean();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaximumCacheSize() {
		return maximumCacheSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumCacheSize(int newMaximumCacheSize) {
		int oldMaximumCacheSize = maximumCacheSize;
		maximumCacheSize = newMaximumCacheSize;
		boolean oldMaximumCacheSizeESet = maximumCacheSizeESet;
		maximumCacheSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ABSTRACT_CAMEL_CONSUMER_TEMPLATE_FACTORY_BEAN__MAXIMUM_CACHE_SIZE, oldMaximumCacheSize, maximumCacheSize, !oldMaximumCacheSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaximumCacheSize() {
		int oldMaximumCacheSize = maximumCacheSize;
		boolean oldMaximumCacheSizeESet = maximumCacheSizeESet;
		maximumCacheSize = MAXIMUM_CACHE_SIZE_EDEFAULT;
		maximumCacheSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.ABSTRACT_CAMEL_CONSUMER_TEMPLATE_FACTORY_BEAN__MAXIMUM_CACHE_SIZE, oldMaximumCacheSize, MAXIMUM_CACHE_SIZE_EDEFAULT, oldMaximumCacheSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaximumCacheSize() {
		return maximumCacheSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.ABSTRACT_CAMEL_CONSUMER_TEMPLATE_FACTORY_BEAN__MAXIMUM_CACHE_SIZE:
				return getMaximumCacheSize();
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
			case CamelSpringPackage.ABSTRACT_CAMEL_CONSUMER_TEMPLATE_FACTORY_BEAN__MAXIMUM_CACHE_SIZE:
				setMaximumCacheSize((Integer)newValue);
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
			case CamelSpringPackage.ABSTRACT_CAMEL_CONSUMER_TEMPLATE_FACTORY_BEAN__MAXIMUM_CACHE_SIZE:
				unsetMaximumCacheSize();
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
			case CamelSpringPackage.ABSTRACT_CAMEL_CONSUMER_TEMPLATE_FACTORY_BEAN__MAXIMUM_CACHE_SIZE:
				return isSetMaximumCacheSize();
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
		result.append(" (maximumCacheSize: ");
		if (maximumCacheSizeESet) result.append(maximumCacheSize); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AbstractCamelConsumerTemplateFactoryBeanImpl
