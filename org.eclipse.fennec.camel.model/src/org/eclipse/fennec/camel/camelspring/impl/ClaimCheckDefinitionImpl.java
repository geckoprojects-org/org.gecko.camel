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
import org.eclipse.fennec.camel.camelspring.ClaimCheckDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Check Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ClaimCheckDefinitionImpl#getAggregationStrategy <em>Aggregation Strategy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ClaimCheckDefinitionImpl#getAggregationStrategyMethodName <em>Aggregation Strategy Method Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ClaimCheckDefinitionImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ClaimCheckDefinitionImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ClaimCheckDefinitionImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimCheckDefinitionImpl extends NoOutputDefinitionImpl implements ClaimCheckDefinition {
	/**
	 * The default value of the '{@link #getAggregationStrategy() <em>Aggregation Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final String AGGREGATION_STRATEGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregationStrategy() <em>Aggregation Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationStrategy()
	 * @generated
	 * @ordered
	 */
	protected String aggregationStrategy = AGGREGATION_STRATEGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregationStrategyMethodName() <em>Aggregation Strategy Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationStrategyMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String AGGREGATION_STRATEGY_METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregationStrategyMethodName() <em>Aggregation Strategy Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationStrategyMethodName()
	 * @generated
	 * @ordered
	 */
	protected String aggregationStrategyMethodName = AGGREGATION_STRATEGY_METHOD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected String filter = FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected String operation = OPERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimCheckDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getClaimCheckDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAggregationStrategy() {
		return aggregationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregationStrategy(String newAggregationStrategy) {
		String oldAggregationStrategy = aggregationStrategy;
		aggregationStrategy = newAggregationStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CLAIM_CHECK_DEFINITION__AGGREGATION_STRATEGY, oldAggregationStrategy, aggregationStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAggregationStrategyMethodName() {
		return aggregationStrategyMethodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregationStrategyMethodName(String newAggregationStrategyMethodName) {
		String oldAggregationStrategyMethodName = aggregationStrategyMethodName;
		aggregationStrategyMethodName = newAggregationStrategyMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CLAIM_CHECK_DEFINITION__AGGREGATION_STRATEGY_METHOD_NAME, oldAggregationStrategyMethodName, aggregationStrategyMethodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilter(String newFilter) {
		String oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CLAIM_CHECK_DEFINITION__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CLAIM_CHECK_DEFINITION__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperation(String newOperation) {
		String oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CLAIM_CHECK_DEFINITION__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.CLAIM_CHECK_DEFINITION__AGGREGATION_STRATEGY:
				return getAggregationStrategy();
			case CamelSpringPackage.CLAIM_CHECK_DEFINITION__AGGREGATION_STRATEGY_METHOD_NAME:
				return getAggregationStrategyMethodName();
			case CamelSpringPackage.CLAIM_CHECK_DEFINITION__FILTER:
				return getFilter();
			case CamelSpringPackage.CLAIM_CHECK_DEFINITION__KEY:
				return getKey();
			case CamelSpringPackage.CLAIM_CHECK_DEFINITION__OPERATION:
				return getOperation();
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
			case CamelSpringPackage.CLAIM_CHECK_DEFINITION__AGGREGATION_STRATEGY:
				setAggregationStrategy((String)newValue);
				return;
			case CamelSpringPackage.CLAIM_CHECK_DEFINITION__AGGREGATION_STRATEGY_METHOD_NAME:
				setAggregationStrategyMethodName((String)newValue);
				return;
			case CamelSpringPackage.CLAIM_CHECK_DEFINITION__FILTER:
				setFilter((String)newValue);
				return;
			case CamelSpringPackage.CLAIM_CHECK_DEFINITION__KEY:
				setKey((String)newValue);
				return;
			case CamelSpringPackage.CLAIM_CHECK_DEFINITION__OPERATION:
				setOperation((String)newValue);
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
			case CamelSpringPackage.CLAIM_CHECK_DEFINITION__AGGREGATION_STRATEGY:
				setAggregationStrategy(AGGREGATION_STRATEGY_EDEFAULT);
				return;
			case CamelSpringPackage.CLAIM_CHECK_DEFINITION__AGGREGATION_STRATEGY_METHOD_NAME:
				setAggregationStrategyMethodName(AGGREGATION_STRATEGY_METHOD_NAME_EDEFAULT);
				return;
			case CamelSpringPackage.CLAIM_CHECK_DEFINITION__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case CamelSpringPackage.CLAIM_CHECK_DEFINITION__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case CamelSpringPackage.CLAIM_CHECK_DEFINITION__OPERATION:
				setOperation(OPERATION_EDEFAULT);
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
			case CamelSpringPackage.CLAIM_CHECK_DEFINITION__AGGREGATION_STRATEGY:
				return AGGREGATION_STRATEGY_EDEFAULT == null ? aggregationStrategy != null : !AGGREGATION_STRATEGY_EDEFAULT.equals(aggregationStrategy);
			case CamelSpringPackage.CLAIM_CHECK_DEFINITION__AGGREGATION_STRATEGY_METHOD_NAME:
				return AGGREGATION_STRATEGY_METHOD_NAME_EDEFAULT == null ? aggregationStrategyMethodName != null : !AGGREGATION_STRATEGY_METHOD_NAME_EDEFAULT.equals(aggregationStrategyMethodName);
			case CamelSpringPackage.CLAIM_CHECK_DEFINITION__FILTER:
				return FILTER_EDEFAULT == null ? filter != null : !FILTER_EDEFAULT.equals(filter);
			case CamelSpringPackage.CLAIM_CHECK_DEFINITION__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case CamelSpringPackage.CLAIM_CHECK_DEFINITION__OPERATION:
				return OPERATION_EDEFAULT == null ? operation != null : !OPERATION_EDEFAULT.equals(operation);
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
		result.append(" (aggregationStrategy: ");
		result.append(aggregationStrategy);
		result.append(", aggregationStrategyMethodName: ");
		result.append(aggregationStrategyMethodName);
		result.append(", filter: ");
		result.append(filter);
		result.append(", key: ");
		result.append(key);
		result.append(", operation: ");
		result.append(operation);
		result.append(')');
		return result.toString();
	}

} //ClaimCheckDefinitionImpl
