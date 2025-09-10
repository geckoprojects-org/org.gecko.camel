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
import org.eclipse.fennec.camel.camelspring.WeightedLoadBalancerDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weighted Load Balancer Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.WeightedLoadBalancerDefinitionImpl#getDistributionRatio <em>Distribution Ratio</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.WeightedLoadBalancerDefinitionImpl#getDistributionRatioDelimiter <em>Distribution Ratio Delimiter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.WeightedLoadBalancerDefinitionImpl#getRoundRobin <em>Round Robin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeightedLoadBalancerDefinitionImpl extends LoadBalancerDefinitionImpl implements WeightedLoadBalancerDefinition {
	/**
	 * The default value of the '{@link #getDistributionRatio() <em>Distribution Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributionRatio()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTRIBUTION_RATIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistributionRatio() <em>Distribution Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributionRatio()
	 * @generated
	 * @ordered
	 */
	protected String distributionRatio = DISTRIBUTION_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistributionRatioDelimiter() <em>Distribution Ratio Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributionRatioDelimiter()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTRIBUTION_RATIO_DELIMITER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistributionRatioDelimiter() <em>Distribution Ratio Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributionRatioDelimiter()
	 * @generated
	 * @ordered
	 */
	protected String distributionRatioDelimiter = DISTRIBUTION_RATIO_DELIMITER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoundRobin() <em>Round Robin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundRobin()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUND_ROBIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoundRobin() <em>Round Robin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundRobin()
	 * @generated
	 * @ordered
	 */
	protected String roundRobin = ROUND_ROBIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeightedLoadBalancerDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getWeightedLoadBalancerDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDistributionRatio() {
		return distributionRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistributionRatio(String newDistributionRatio) {
		String oldDistributionRatio = distributionRatio;
		distributionRatio = newDistributionRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__DISTRIBUTION_RATIO, oldDistributionRatio, distributionRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDistributionRatioDelimiter() {
		return distributionRatioDelimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistributionRatioDelimiter(String newDistributionRatioDelimiter) {
		String oldDistributionRatioDelimiter = distributionRatioDelimiter;
		distributionRatioDelimiter = newDistributionRatioDelimiter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__DISTRIBUTION_RATIO_DELIMITER, oldDistributionRatioDelimiter, distributionRatioDelimiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoundRobin() {
		return roundRobin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoundRobin(String newRoundRobin) {
		String oldRoundRobin = roundRobin;
		roundRobin = newRoundRobin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__ROUND_ROBIN, oldRoundRobin, roundRobin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__DISTRIBUTION_RATIO:
				return getDistributionRatio();
			case CamelSpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__DISTRIBUTION_RATIO_DELIMITER:
				return getDistributionRatioDelimiter();
			case CamelSpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__ROUND_ROBIN:
				return getRoundRobin();
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
			case CamelSpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__DISTRIBUTION_RATIO:
				setDistributionRatio((String)newValue);
				return;
			case CamelSpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__DISTRIBUTION_RATIO_DELIMITER:
				setDistributionRatioDelimiter((String)newValue);
				return;
			case CamelSpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__ROUND_ROBIN:
				setRoundRobin((String)newValue);
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
			case CamelSpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__DISTRIBUTION_RATIO:
				setDistributionRatio(DISTRIBUTION_RATIO_EDEFAULT);
				return;
			case CamelSpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__DISTRIBUTION_RATIO_DELIMITER:
				setDistributionRatioDelimiter(DISTRIBUTION_RATIO_DELIMITER_EDEFAULT);
				return;
			case CamelSpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__ROUND_ROBIN:
				setRoundRobin(ROUND_ROBIN_EDEFAULT);
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
			case CamelSpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__DISTRIBUTION_RATIO:
				return DISTRIBUTION_RATIO_EDEFAULT == null ? distributionRatio != null : !DISTRIBUTION_RATIO_EDEFAULT.equals(distributionRatio);
			case CamelSpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__DISTRIBUTION_RATIO_DELIMITER:
				return DISTRIBUTION_RATIO_DELIMITER_EDEFAULT == null ? distributionRatioDelimiter != null : !DISTRIBUTION_RATIO_DELIMITER_EDEFAULT.equals(distributionRatioDelimiter);
			case CamelSpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__ROUND_ROBIN:
				return ROUND_ROBIN_EDEFAULT == null ? roundRobin != null : !ROUND_ROBIN_EDEFAULT.equals(roundRobin);
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
		result.append(" (distributionRatio: ");
		result.append(distributionRatio);
		result.append(", distributionRatioDelimiter: ");
		result.append(distributionRatioDelimiter);
		result.append(", roundRobin: ");
		result.append(roundRobin);
		result.append(')');
		return result.toString();
	}

} //WeightedLoadBalancerDefinitionImpl
