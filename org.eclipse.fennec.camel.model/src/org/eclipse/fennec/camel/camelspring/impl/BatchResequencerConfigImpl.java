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

import org.eclipse.fennec.camel.camelspring.BatchResequencerConfig;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Batch Resequencer Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BatchResequencerConfigImpl#getAllowDuplicates <em>Allow Duplicates</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BatchResequencerConfigImpl#getBatchSize <em>Batch Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BatchResequencerConfigImpl#getBatchTimeout <em>Batch Timeout</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BatchResequencerConfigImpl#getIgnoreInvalidExchanges <em>Ignore Invalid Exchanges</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BatchResequencerConfigImpl#getReverse <em>Reverse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BatchResequencerConfigImpl extends ResequencerConfigImpl implements BatchResequencerConfig {
	/**
	 * The default value of the '{@link #getAllowDuplicates() <em>Allow Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowDuplicates()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_DUPLICATES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowDuplicates() <em>Allow Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowDuplicates()
	 * @generated
	 * @ordered
	 */
	protected String allowDuplicates = ALLOW_DUPLICATES_EDEFAULT;

	/**
	 * The default value of the '{@link #getBatchSize() <em>Batch Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchSize()
	 * @generated
	 * @ordered
	 */
	protected static final String BATCH_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBatchSize() <em>Batch Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchSize()
	 * @generated
	 * @ordered
	 */
	protected String batchSize = BATCH_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBatchTimeout() <em>Batch Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String BATCH_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBatchTimeout() <em>Batch Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchTimeout()
	 * @generated
	 * @ordered
	 */
	protected String batchTimeout = BATCH_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIgnoreInvalidExchanges() <em>Ignore Invalid Exchanges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreInvalidExchanges()
	 * @generated
	 * @ordered
	 */
	protected static final String IGNORE_INVALID_EXCHANGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIgnoreInvalidExchanges() <em>Ignore Invalid Exchanges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreInvalidExchanges()
	 * @generated
	 * @ordered
	 */
	protected String ignoreInvalidExchanges = IGNORE_INVALID_EXCHANGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getReverse() <em>Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverse()
	 * @generated
	 * @ordered
	 */
	protected static final String REVERSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReverse() <em>Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverse()
	 * @generated
	 * @ordered
	 */
	protected String reverse = REVERSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BatchResequencerConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getBatchResequencerConfig();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowDuplicates() {
		return allowDuplicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowDuplicates(String newAllowDuplicates) {
		String oldAllowDuplicates = allowDuplicates;
		allowDuplicates = newAllowDuplicates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BATCH_RESEQUENCER_CONFIG__ALLOW_DUPLICATES, oldAllowDuplicates, allowDuplicates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBatchSize() {
		return batchSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBatchSize(String newBatchSize) {
		String oldBatchSize = batchSize;
		batchSize = newBatchSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BATCH_RESEQUENCER_CONFIG__BATCH_SIZE, oldBatchSize, batchSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBatchTimeout() {
		return batchTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBatchTimeout(String newBatchTimeout) {
		String oldBatchTimeout = batchTimeout;
		batchTimeout = newBatchTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BATCH_RESEQUENCER_CONFIG__BATCH_TIMEOUT, oldBatchTimeout, batchTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIgnoreInvalidExchanges() {
		return ignoreInvalidExchanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreInvalidExchanges(String newIgnoreInvalidExchanges) {
		String oldIgnoreInvalidExchanges = ignoreInvalidExchanges;
		ignoreInvalidExchanges = newIgnoreInvalidExchanges;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BATCH_RESEQUENCER_CONFIG__IGNORE_INVALID_EXCHANGES, oldIgnoreInvalidExchanges, ignoreInvalidExchanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReverse() {
		return reverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReverse(String newReverse) {
		String oldReverse = reverse;
		reverse = newReverse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BATCH_RESEQUENCER_CONFIG__REVERSE, oldReverse, reverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.BATCH_RESEQUENCER_CONFIG__ALLOW_DUPLICATES:
				return getAllowDuplicates();
			case CamelSpringPackage.BATCH_RESEQUENCER_CONFIG__BATCH_SIZE:
				return getBatchSize();
			case CamelSpringPackage.BATCH_RESEQUENCER_CONFIG__BATCH_TIMEOUT:
				return getBatchTimeout();
			case CamelSpringPackage.BATCH_RESEQUENCER_CONFIG__IGNORE_INVALID_EXCHANGES:
				return getIgnoreInvalidExchanges();
			case CamelSpringPackage.BATCH_RESEQUENCER_CONFIG__REVERSE:
				return getReverse();
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
			case CamelSpringPackage.BATCH_RESEQUENCER_CONFIG__ALLOW_DUPLICATES:
				setAllowDuplicates((String)newValue);
				return;
			case CamelSpringPackage.BATCH_RESEQUENCER_CONFIG__BATCH_SIZE:
				setBatchSize((String)newValue);
				return;
			case CamelSpringPackage.BATCH_RESEQUENCER_CONFIG__BATCH_TIMEOUT:
				setBatchTimeout((String)newValue);
				return;
			case CamelSpringPackage.BATCH_RESEQUENCER_CONFIG__IGNORE_INVALID_EXCHANGES:
				setIgnoreInvalidExchanges((String)newValue);
				return;
			case CamelSpringPackage.BATCH_RESEQUENCER_CONFIG__REVERSE:
				setReverse((String)newValue);
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
			case CamelSpringPackage.BATCH_RESEQUENCER_CONFIG__ALLOW_DUPLICATES:
				setAllowDuplicates(ALLOW_DUPLICATES_EDEFAULT);
				return;
			case CamelSpringPackage.BATCH_RESEQUENCER_CONFIG__BATCH_SIZE:
				setBatchSize(BATCH_SIZE_EDEFAULT);
				return;
			case CamelSpringPackage.BATCH_RESEQUENCER_CONFIG__BATCH_TIMEOUT:
				setBatchTimeout(BATCH_TIMEOUT_EDEFAULT);
				return;
			case CamelSpringPackage.BATCH_RESEQUENCER_CONFIG__IGNORE_INVALID_EXCHANGES:
				setIgnoreInvalidExchanges(IGNORE_INVALID_EXCHANGES_EDEFAULT);
				return;
			case CamelSpringPackage.BATCH_RESEQUENCER_CONFIG__REVERSE:
				setReverse(REVERSE_EDEFAULT);
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
			case CamelSpringPackage.BATCH_RESEQUENCER_CONFIG__ALLOW_DUPLICATES:
				return ALLOW_DUPLICATES_EDEFAULT == null ? allowDuplicates != null : !ALLOW_DUPLICATES_EDEFAULT.equals(allowDuplicates);
			case CamelSpringPackage.BATCH_RESEQUENCER_CONFIG__BATCH_SIZE:
				return BATCH_SIZE_EDEFAULT == null ? batchSize != null : !BATCH_SIZE_EDEFAULT.equals(batchSize);
			case CamelSpringPackage.BATCH_RESEQUENCER_CONFIG__BATCH_TIMEOUT:
				return BATCH_TIMEOUT_EDEFAULT == null ? batchTimeout != null : !BATCH_TIMEOUT_EDEFAULT.equals(batchTimeout);
			case CamelSpringPackage.BATCH_RESEQUENCER_CONFIG__IGNORE_INVALID_EXCHANGES:
				return IGNORE_INVALID_EXCHANGES_EDEFAULT == null ? ignoreInvalidExchanges != null : !IGNORE_INVALID_EXCHANGES_EDEFAULT.equals(ignoreInvalidExchanges);
			case CamelSpringPackage.BATCH_RESEQUENCER_CONFIG__REVERSE:
				return REVERSE_EDEFAULT == null ? reverse != null : !REVERSE_EDEFAULT.equals(reverse);
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
		result.append(" (allowDuplicates: ");
		result.append(allowDuplicates);
		result.append(", batchSize: ");
		result.append(batchSize);
		result.append(", batchTimeout: ");
		result.append(batchTimeout);
		result.append(", ignoreInvalidExchanges: ");
		result.append(ignoreInvalidExchanges);
		result.append(", reverse: ");
		result.append(reverse);
		result.append(')');
		return result.toString();
	}

} //BatchResequencerConfigImpl
