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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.FailoverLoadBalancerDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failover Load Balancer Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FailoverLoadBalancerDefinitionImpl#getException <em>Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FailoverLoadBalancerDefinitionImpl#isInheritErrorHandler <em>Inherit Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FailoverLoadBalancerDefinitionImpl#getMaximumFailoverAttempts <em>Maximum Failover Attempts</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FailoverLoadBalancerDefinitionImpl#getRoundRobin <em>Round Robin</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FailoverLoadBalancerDefinitionImpl#getSticky <em>Sticky</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailoverLoadBalancerDefinitionImpl extends LoadBalancerDefinitionImpl implements FailoverLoadBalancerDefinition {
	/**
	 * The cached value of the '{@link #getException() <em>Exception</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected EList<String> exception;

	/**
	 * The default value of the '{@link #isInheritErrorHandler() <em>Inherit Error Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInheritErrorHandler()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INHERIT_ERROR_HANDLER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInheritErrorHandler() <em>Inherit Error Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInheritErrorHandler()
	 * @generated
	 * @ordered
	 */
	protected boolean inheritErrorHandler = INHERIT_ERROR_HANDLER_EDEFAULT;

	/**
	 * This is true if the Inherit Error Handler attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inheritErrorHandlerESet;

	/**
	 * The default value of the '{@link #getMaximumFailoverAttempts() <em>Maximum Failover Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumFailoverAttempts()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_FAILOVER_ATTEMPTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumFailoverAttempts() <em>Maximum Failover Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumFailoverAttempts()
	 * @generated
	 * @ordered
	 */
	protected String maximumFailoverAttempts = MAXIMUM_FAILOVER_ATTEMPTS_EDEFAULT;

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
	 * The default value of the '{@link #getSticky() <em>Sticky</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSticky()
	 * @generated
	 * @ordered
	 */
	protected static final String STICKY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSticky() <em>Sticky</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSticky()
	 * @generated
	 * @ordered
	 */
	protected String sticky = STICKY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailoverLoadBalancerDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getFailoverLoadBalancerDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getException() {
		if (exception == null) {
			exception = new EDataTypeEList<String>(String.class, this, CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__EXCEPTION);
		}
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInheritErrorHandler() {
		return inheritErrorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInheritErrorHandler(boolean newInheritErrorHandler) {
		boolean oldInheritErrorHandler = inheritErrorHandler;
		inheritErrorHandler = newInheritErrorHandler;
		boolean oldInheritErrorHandlerESet = inheritErrorHandlerESet;
		inheritErrorHandlerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__INHERIT_ERROR_HANDLER, oldInheritErrorHandler, inheritErrorHandler, !oldInheritErrorHandlerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetInheritErrorHandler() {
		boolean oldInheritErrorHandler = inheritErrorHandler;
		boolean oldInheritErrorHandlerESet = inheritErrorHandlerESet;
		inheritErrorHandler = INHERIT_ERROR_HANDLER_EDEFAULT;
		inheritErrorHandlerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__INHERIT_ERROR_HANDLER, oldInheritErrorHandler, INHERIT_ERROR_HANDLER_EDEFAULT, oldInheritErrorHandlerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInheritErrorHandler() {
		return inheritErrorHandlerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaximumFailoverAttempts() {
		return maximumFailoverAttempts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumFailoverAttempts(String newMaximumFailoverAttempts) {
		String oldMaximumFailoverAttempts = maximumFailoverAttempts;
		maximumFailoverAttempts = newMaximumFailoverAttempts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__MAXIMUM_FAILOVER_ATTEMPTS, oldMaximumFailoverAttempts, maximumFailoverAttempts));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__ROUND_ROBIN, oldRoundRobin, roundRobin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSticky() {
		return sticky;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSticky(String newSticky) {
		String oldSticky = sticky;
		sticky = newSticky;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__STICKY, oldSticky, sticky));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__EXCEPTION:
				return getException();
			case CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__INHERIT_ERROR_HANDLER:
				return isInheritErrorHandler();
			case CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__MAXIMUM_FAILOVER_ATTEMPTS:
				return getMaximumFailoverAttempts();
			case CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__ROUND_ROBIN:
				return getRoundRobin();
			case CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__STICKY:
				return getSticky();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__EXCEPTION:
				getException().clear();
				getException().addAll((Collection<? extends String>)newValue);
				return;
			case CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__INHERIT_ERROR_HANDLER:
				setInheritErrorHandler((Boolean)newValue);
				return;
			case CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__MAXIMUM_FAILOVER_ATTEMPTS:
				setMaximumFailoverAttempts((String)newValue);
				return;
			case CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__ROUND_ROBIN:
				setRoundRobin((String)newValue);
				return;
			case CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__STICKY:
				setSticky((String)newValue);
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
			case CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__EXCEPTION:
				getException().clear();
				return;
			case CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__INHERIT_ERROR_HANDLER:
				unsetInheritErrorHandler();
				return;
			case CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__MAXIMUM_FAILOVER_ATTEMPTS:
				setMaximumFailoverAttempts(MAXIMUM_FAILOVER_ATTEMPTS_EDEFAULT);
				return;
			case CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__ROUND_ROBIN:
				setRoundRobin(ROUND_ROBIN_EDEFAULT);
				return;
			case CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__STICKY:
				setSticky(STICKY_EDEFAULT);
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
			case CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__EXCEPTION:
				return exception != null && !exception.isEmpty();
			case CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__INHERIT_ERROR_HANDLER:
				return isSetInheritErrorHandler();
			case CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__MAXIMUM_FAILOVER_ATTEMPTS:
				return MAXIMUM_FAILOVER_ATTEMPTS_EDEFAULT == null ? maximumFailoverAttempts != null : !MAXIMUM_FAILOVER_ATTEMPTS_EDEFAULT.equals(maximumFailoverAttempts);
			case CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__ROUND_ROBIN:
				return ROUND_ROBIN_EDEFAULT == null ? roundRobin != null : !ROUND_ROBIN_EDEFAULT.equals(roundRobin);
			case CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__STICKY:
				return STICKY_EDEFAULT == null ? sticky != null : !STICKY_EDEFAULT.equals(sticky);
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
		result.append(" (exception: ");
		result.append(exception);
		result.append(", inheritErrorHandler: ");
		if (inheritErrorHandlerESet) result.append(inheritErrorHandler); else result.append("<unset>");
		result.append(", maximumFailoverAttempts: ");
		result.append(maximumFailoverAttempts);
		result.append(", roundRobin: ");
		result.append(roundRobin);
		result.append(", sticky: ");
		result.append(sticky);
		result.append(')');
		return result.toString();
	}

} //FailoverLoadBalancerDefinitionImpl
