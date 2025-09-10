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
import org.eclipse.fennec.camel.camelspring.StreamResequencerConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stream Resequencer Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.StreamResequencerConfigImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.StreamResequencerConfigImpl#getComparator <em>Comparator</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.StreamResequencerConfigImpl#getDeliveryAttemptInterval <em>Delivery Attempt Interval</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.StreamResequencerConfigImpl#getIgnoreInvalidExchanges <em>Ignore Invalid Exchanges</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.StreamResequencerConfigImpl#getRejectOld <em>Reject Old</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.StreamResequencerConfigImpl#getTimeout <em>Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StreamResequencerConfigImpl extends ResequencerConfigImpl implements StreamResequencerConfig {
	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected String capacity = CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getComparator() <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparator()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPARATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComparator() <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparator()
	 * @generated
	 * @ordered
	 */
	protected String comparator = COMPARATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliveryAttemptInterval() <em>Delivery Attempt Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryAttemptInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIVERY_ATTEMPT_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveryAttemptInterval() <em>Delivery Attempt Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryAttemptInterval()
	 * @generated
	 * @ordered
	 */
	protected String deliveryAttemptInterval = DELIVERY_ATTEMPT_INTERVAL_EDEFAULT;

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
	 * The default value of the '{@link #getRejectOld() <em>Reject Old</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectOld()
	 * @generated
	 * @ordered
	 */
	protected static final String REJECT_OLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRejectOld() <em>Reject Old</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectOld()
	 * @generated
	 * @ordered
	 */
	protected String rejectOld = REJECT_OLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected String timeout = TIMEOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreamResequencerConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getStreamResequencerConfig();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacity(String newCapacity) {
		String oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComparator() {
		return comparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComparator(String newComparator) {
		String oldComparator = comparator;
		comparator = newComparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__COMPARATOR, oldComparator, comparator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeliveryAttemptInterval() {
		return deliveryAttemptInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliveryAttemptInterval(String newDeliveryAttemptInterval) {
		String oldDeliveryAttemptInterval = deliveryAttemptInterval;
		deliveryAttemptInterval = newDeliveryAttemptInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__DELIVERY_ATTEMPT_INTERVAL, oldDeliveryAttemptInterval, deliveryAttemptInterval));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__IGNORE_INVALID_EXCHANGES, oldIgnoreInvalidExchanges, ignoreInvalidExchanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRejectOld() {
		return rejectOld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRejectOld(String newRejectOld) {
		String oldRejectOld = rejectOld;
		rejectOld = newRejectOld;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__REJECT_OLD, oldRejectOld, rejectOld));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeout(String newTimeout) {
		String oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__CAPACITY:
				return getCapacity();
			case CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__COMPARATOR:
				return getComparator();
			case CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__DELIVERY_ATTEMPT_INTERVAL:
				return getDeliveryAttemptInterval();
			case CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__IGNORE_INVALID_EXCHANGES:
				return getIgnoreInvalidExchanges();
			case CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__REJECT_OLD:
				return getRejectOld();
			case CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__TIMEOUT:
				return getTimeout();
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
			case CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__CAPACITY:
				setCapacity((String)newValue);
				return;
			case CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__COMPARATOR:
				setComparator((String)newValue);
				return;
			case CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__DELIVERY_ATTEMPT_INTERVAL:
				setDeliveryAttemptInterval((String)newValue);
				return;
			case CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__IGNORE_INVALID_EXCHANGES:
				setIgnoreInvalidExchanges((String)newValue);
				return;
			case CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__REJECT_OLD:
				setRejectOld((String)newValue);
				return;
			case CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__TIMEOUT:
				setTimeout((String)newValue);
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
			case CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__COMPARATOR:
				setComparator(COMPARATOR_EDEFAULT);
				return;
			case CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__DELIVERY_ATTEMPT_INTERVAL:
				setDeliveryAttemptInterval(DELIVERY_ATTEMPT_INTERVAL_EDEFAULT);
				return;
			case CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__IGNORE_INVALID_EXCHANGES:
				setIgnoreInvalidExchanges(IGNORE_INVALID_EXCHANGES_EDEFAULT);
				return;
			case CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__REJECT_OLD:
				setRejectOld(REJECT_OLD_EDEFAULT);
				return;
			case CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
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
			case CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__CAPACITY:
				return CAPACITY_EDEFAULT == null ? capacity != null : !CAPACITY_EDEFAULT.equals(capacity);
			case CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__COMPARATOR:
				return COMPARATOR_EDEFAULT == null ? comparator != null : !COMPARATOR_EDEFAULT.equals(comparator);
			case CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__DELIVERY_ATTEMPT_INTERVAL:
				return DELIVERY_ATTEMPT_INTERVAL_EDEFAULT == null ? deliveryAttemptInterval != null : !DELIVERY_ATTEMPT_INTERVAL_EDEFAULT.equals(deliveryAttemptInterval);
			case CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__IGNORE_INVALID_EXCHANGES:
				return IGNORE_INVALID_EXCHANGES_EDEFAULT == null ? ignoreInvalidExchanges != null : !IGNORE_INVALID_EXCHANGES_EDEFAULT.equals(ignoreInvalidExchanges);
			case CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__REJECT_OLD:
				return REJECT_OLD_EDEFAULT == null ? rejectOld != null : !REJECT_OLD_EDEFAULT.equals(rejectOld);
			case CamelSpringPackage.STREAM_RESEQUENCER_CONFIG__TIMEOUT:
				return TIMEOUT_EDEFAULT == null ? timeout != null : !TIMEOUT_EDEFAULT.equals(timeout);
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
		result.append(" (capacity: ");
		result.append(capacity);
		result.append(", comparator: ");
		result.append(comparator);
		result.append(", deliveryAttemptInterval: ");
		result.append(deliveryAttemptInterval);
		result.append(", ignoreInvalidExchanges: ");
		result.append(ignoreInvalidExchanges);
		result.append(", rejectOld: ");
		result.append(rejectOld);
		result.append(", timeout: ");
		result.append(timeout);
		result.append(')');
		return result.toString();
	}

} //StreamResequencerConfigImpl
