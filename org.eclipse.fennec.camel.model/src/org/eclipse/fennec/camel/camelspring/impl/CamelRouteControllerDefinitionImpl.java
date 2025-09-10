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

import org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Route Controller Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelRouteControllerDefinitionImpl#getBackOffDelay <em>Back Off Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelRouteControllerDefinitionImpl#getBackOffMaxAttempts <em>Back Off Max Attempts</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelRouteControllerDefinitionImpl#getBackOffMaxDelay <em>Back Off Max Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelRouteControllerDefinitionImpl#getBackOffMaxElapsedTime <em>Back Off Max Elapsed Time</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelRouteControllerDefinitionImpl#getBackOffMultiplier <em>Back Off Multiplier</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelRouteControllerDefinitionImpl#getExcludeRoutes <em>Exclude Routes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelRouteControllerDefinitionImpl#getIncludeRoutes <em>Include Routes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelRouteControllerDefinitionImpl#getInitialDelay <em>Initial Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelRouteControllerDefinitionImpl#getLoggingLevel <em>Logging Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelRouteControllerDefinitionImpl#getSupervising <em>Supervising</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelRouteControllerDefinitionImpl#getThreadPoolSize <em>Thread Pool Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelRouteControllerDefinitionImpl#getUnhealthyOnExhausted <em>Unhealthy On Exhausted</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelRouteControllerDefinitionImpl#getUnhealthyOnRestarting <em>Unhealthy On Restarting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CamelRouteControllerDefinitionImpl extends IdentifiedTypeImpl implements CamelRouteControllerDefinition {
	/**
	 * The default value of the '{@link #getBackOffDelay() <em>Back Off Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackOffDelay()
	 * @generated
	 * @ordered
	 */
	protected static final String BACK_OFF_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackOffDelay() <em>Back Off Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackOffDelay()
	 * @generated
	 * @ordered
	 */
	protected String backOffDelay = BACK_OFF_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackOffMaxAttempts() <em>Back Off Max Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackOffMaxAttempts()
	 * @generated
	 * @ordered
	 */
	protected static final String BACK_OFF_MAX_ATTEMPTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackOffMaxAttempts() <em>Back Off Max Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackOffMaxAttempts()
	 * @generated
	 * @ordered
	 */
	protected String backOffMaxAttempts = BACK_OFF_MAX_ATTEMPTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackOffMaxDelay() <em>Back Off Max Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackOffMaxDelay()
	 * @generated
	 * @ordered
	 */
	protected static final String BACK_OFF_MAX_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackOffMaxDelay() <em>Back Off Max Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackOffMaxDelay()
	 * @generated
	 * @ordered
	 */
	protected String backOffMaxDelay = BACK_OFF_MAX_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackOffMaxElapsedTime() <em>Back Off Max Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackOffMaxElapsedTime()
	 * @generated
	 * @ordered
	 */
	protected static final String BACK_OFF_MAX_ELAPSED_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackOffMaxElapsedTime() <em>Back Off Max Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackOffMaxElapsedTime()
	 * @generated
	 * @ordered
	 */
	protected String backOffMaxElapsedTime = BACK_OFF_MAX_ELAPSED_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackOffMultiplier() <em>Back Off Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackOffMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final String BACK_OFF_MULTIPLIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackOffMultiplier() <em>Back Off Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackOffMultiplier()
	 * @generated
	 * @ordered
	 */
	protected String backOffMultiplier = BACK_OFF_MULTIPLIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getExcludeRoutes() <em>Exclude Routes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeRoutes()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCLUDE_ROUTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExcludeRoutes() <em>Exclude Routes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeRoutes()
	 * @generated
	 * @ordered
	 */
	protected String excludeRoutes = EXCLUDE_ROUTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeRoutes() <em>Include Routes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeRoutes()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_ROUTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeRoutes() <em>Include Routes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeRoutes()
	 * @generated
	 * @ordered
	 */
	protected String includeRoutes = INCLUDE_ROUTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialDelay() <em>Initial Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialDelay()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialDelay() <em>Initial Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialDelay()
	 * @generated
	 * @ordered
	 */
	protected String initialDelay = INITIAL_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoggingLevel() <em>Logging Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoggingLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGGING_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoggingLevel() <em>Logging Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoggingLevel()
	 * @generated
	 * @ordered
	 */
	protected String loggingLevel = LOGGING_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupervising() <em>Supervising</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervising()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPERVISING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupervising() <em>Supervising</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervising()
	 * @generated
	 * @ordered
	 */
	protected String supervising = SUPERVISING_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreadPoolSize() <em>Thread Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadPoolSize()
	 * @generated
	 * @ordered
	 */
	protected static final String THREAD_POOL_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThreadPoolSize() <em>Thread Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadPoolSize()
	 * @generated
	 * @ordered
	 */
	protected String threadPoolSize = THREAD_POOL_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnhealthyOnExhausted() <em>Unhealthy On Exhausted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnhealthyOnExhausted()
	 * @generated
	 * @ordered
	 */
	protected static final String UNHEALTHY_ON_EXHAUSTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnhealthyOnExhausted() <em>Unhealthy On Exhausted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnhealthyOnExhausted()
	 * @generated
	 * @ordered
	 */
	protected String unhealthyOnExhausted = UNHEALTHY_ON_EXHAUSTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnhealthyOnRestarting() <em>Unhealthy On Restarting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnhealthyOnRestarting()
	 * @generated
	 * @ordered
	 */
	protected static final String UNHEALTHY_ON_RESTARTING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnhealthyOnRestarting() <em>Unhealthy On Restarting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnhealthyOnRestarting()
	 * @generated
	 * @ordered
	 */
	protected String unhealthyOnRestarting = UNHEALTHY_ON_RESTARTING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CamelRouteControllerDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getCamelRouteControllerDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBackOffDelay() {
		return backOffDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackOffDelay(String newBackOffDelay) {
		String oldBackOffDelay = backOffDelay;
		backOffDelay = newBackOffDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__BACK_OFF_DELAY, oldBackOffDelay, backOffDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBackOffMaxAttempts() {
		return backOffMaxAttempts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackOffMaxAttempts(String newBackOffMaxAttempts) {
		String oldBackOffMaxAttempts = backOffMaxAttempts;
		backOffMaxAttempts = newBackOffMaxAttempts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__BACK_OFF_MAX_ATTEMPTS, oldBackOffMaxAttempts, backOffMaxAttempts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBackOffMaxDelay() {
		return backOffMaxDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackOffMaxDelay(String newBackOffMaxDelay) {
		String oldBackOffMaxDelay = backOffMaxDelay;
		backOffMaxDelay = newBackOffMaxDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__BACK_OFF_MAX_DELAY, oldBackOffMaxDelay, backOffMaxDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBackOffMaxElapsedTime() {
		return backOffMaxElapsedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackOffMaxElapsedTime(String newBackOffMaxElapsedTime) {
		String oldBackOffMaxElapsedTime = backOffMaxElapsedTime;
		backOffMaxElapsedTime = newBackOffMaxElapsedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__BACK_OFF_MAX_ELAPSED_TIME, oldBackOffMaxElapsedTime, backOffMaxElapsedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBackOffMultiplier() {
		return backOffMultiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackOffMultiplier(String newBackOffMultiplier) {
		String oldBackOffMultiplier = backOffMultiplier;
		backOffMultiplier = newBackOffMultiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__BACK_OFF_MULTIPLIER, oldBackOffMultiplier, backOffMultiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExcludeRoutes() {
		return excludeRoutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExcludeRoutes(String newExcludeRoutes) {
		String oldExcludeRoutes = excludeRoutes;
		excludeRoutes = newExcludeRoutes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__EXCLUDE_ROUTES, oldExcludeRoutes, excludeRoutes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIncludeRoutes() {
		return includeRoutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeRoutes(String newIncludeRoutes) {
		String oldIncludeRoutes = includeRoutes;
		includeRoutes = newIncludeRoutes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__INCLUDE_ROUTES, oldIncludeRoutes, includeRoutes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInitialDelay() {
		return initialDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialDelay(String newInitialDelay) {
		String oldInitialDelay = initialDelay;
		initialDelay = newInitialDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__INITIAL_DELAY, oldInitialDelay, initialDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLoggingLevel() {
		return loggingLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoggingLevel(String newLoggingLevel) {
		String oldLoggingLevel = loggingLevel;
		loggingLevel = newLoggingLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__LOGGING_LEVEL, oldLoggingLevel, loggingLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupervising() {
		return supervising;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupervising(String newSupervising) {
		String oldSupervising = supervising;
		supervising = newSupervising;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__SUPERVISING, oldSupervising, supervising));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThreadPoolSize() {
		return threadPoolSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreadPoolSize(String newThreadPoolSize) {
		String oldThreadPoolSize = threadPoolSize;
		threadPoolSize = newThreadPoolSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__THREAD_POOL_SIZE, oldThreadPoolSize, threadPoolSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnhealthyOnExhausted() {
		return unhealthyOnExhausted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnhealthyOnExhausted(String newUnhealthyOnExhausted) {
		String oldUnhealthyOnExhausted = unhealthyOnExhausted;
		unhealthyOnExhausted = newUnhealthyOnExhausted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__UNHEALTHY_ON_EXHAUSTED, oldUnhealthyOnExhausted, unhealthyOnExhausted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnhealthyOnRestarting() {
		return unhealthyOnRestarting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnhealthyOnRestarting(String newUnhealthyOnRestarting) {
		String oldUnhealthyOnRestarting = unhealthyOnRestarting;
		unhealthyOnRestarting = newUnhealthyOnRestarting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__UNHEALTHY_ON_RESTARTING, oldUnhealthyOnRestarting, unhealthyOnRestarting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__BACK_OFF_DELAY:
				return getBackOffDelay();
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__BACK_OFF_MAX_ATTEMPTS:
				return getBackOffMaxAttempts();
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__BACK_OFF_MAX_DELAY:
				return getBackOffMaxDelay();
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__BACK_OFF_MAX_ELAPSED_TIME:
				return getBackOffMaxElapsedTime();
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__BACK_OFF_MULTIPLIER:
				return getBackOffMultiplier();
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__EXCLUDE_ROUTES:
				return getExcludeRoutes();
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__INCLUDE_ROUTES:
				return getIncludeRoutes();
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__INITIAL_DELAY:
				return getInitialDelay();
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__LOGGING_LEVEL:
				return getLoggingLevel();
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__SUPERVISING:
				return getSupervising();
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__THREAD_POOL_SIZE:
				return getThreadPoolSize();
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__UNHEALTHY_ON_EXHAUSTED:
				return getUnhealthyOnExhausted();
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__UNHEALTHY_ON_RESTARTING:
				return getUnhealthyOnRestarting();
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
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__BACK_OFF_DELAY:
				setBackOffDelay((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__BACK_OFF_MAX_ATTEMPTS:
				setBackOffMaxAttempts((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__BACK_OFF_MAX_DELAY:
				setBackOffMaxDelay((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__BACK_OFF_MAX_ELAPSED_TIME:
				setBackOffMaxElapsedTime((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__BACK_OFF_MULTIPLIER:
				setBackOffMultiplier((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__EXCLUDE_ROUTES:
				setExcludeRoutes((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__INCLUDE_ROUTES:
				setIncludeRoutes((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__INITIAL_DELAY:
				setInitialDelay((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__LOGGING_LEVEL:
				setLoggingLevel((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__SUPERVISING:
				setSupervising((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__THREAD_POOL_SIZE:
				setThreadPoolSize((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__UNHEALTHY_ON_EXHAUSTED:
				setUnhealthyOnExhausted((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__UNHEALTHY_ON_RESTARTING:
				setUnhealthyOnRestarting((String)newValue);
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
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__BACK_OFF_DELAY:
				setBackOffDelay(BACK_OFF_DELAY_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__BACK_OFF_MAX_ATTEMPTS:
				setBackOffMaxAttempts(BACK_OFF_MAX_ATTEMPTS_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__BACK_OFF_MAX_DELAY:
				setBackOffMaxDelay(BACK_OFF_MAX_DELAY_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__BACK_OFF_MAX_ELAPSED_TIME:
				setBackOffMaxElapsedTime(BACK_OFF_MAX_ELAPSED_TIME_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__BACK_OFF_MULTIPLIER:
				setBackOffMultiplier(BACK_OFF_MULTIPLIER_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__EXCLUDE_ROUTES:
				setExcludeRoutes(EXCLUDE_ROUTES_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__INCLUDE_ROUTES:
				setIncludeRoutes(INCLUDE_ROUTES_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__INITIAL_DELAY:
				setInitialDelay(INITIAL_DELAY_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__LOGGING_LEVEL:
				setLoggingLevel(LOGGING_LEVEL_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__SUPERVISING:
				setSupervising(SUPERVISING_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__THREAD_POOL_SIZE:
				setThreadPoolSize(THREAD_POOL_SIZE_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__UNHEALTHY_ON_EXHAUSTED:
				setUnhealthyOnExhausted(UNHEALTHY_ON_EXHAUSTED_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__UNHEALTHY_ON_RESTARTING:
				setUnhealthyOnRestarting(UNHEALTHY_ON_RESTARTING_EDEFAULT);
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
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__BACK_OFF_DELAY:
				return BACK_OFF_DELAY_EDEFAULT == null ? backOffDelay != null : !BACK_OFF_DELAY_EDEFAULT.equals(backOffDelay);
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__BACK_OFF_MAX_ATTEMPTS:
				return BACK_OFF_MAX_ATTEMPTS_EDEFAULT == null ? backOffMaxAttempts != null : !BACK_OFF_MAX_ATTEMPTS_EDEFAULT.equals(backOffMaxAttempts);
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__BACK_OFF_MAX_DELAY:
				return BACK_OFF_MAX_DELAY_EDEFAULT == null ? backOffMaxDelay != null : !BACK_OFF_MAX_DELAY_EDEFAULT.equals(backOffMaxDelay);
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__BACK_OFF_MAX_ELAPSED_TIME:
				return BACK_OFF_MAX_ELAPSED_TIME_EDEFAULT == null ? backOffMaxElapsedTime != null : !BACK_OFF_MAX_ELAPSED_TIME_EDEFAULT.equals(backOffMaxElapsedTime);
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__BACK_OFF_MULTIPLIER:
				return BACK_OFF_MULTIPLIER_EDEFAULT == null ? backOffMultiplier != null : !BACK_OFF_MULTIPLIER_EDEFAULT.equals(backOffMultiplier);
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__EXCLUDE_ROUTES:
				return EXCLUDE_ROUTES_EDEFAULT == null ? excludeRoutes != null : !EXCLUDE_ROUTES_EDEFAULT.equals(excludeRoutes);
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__INCLUDE_ROUTES:
				return INCLUDE_ROUTES_EDEFAULT == null ? includeRoutes != null : !INCLUDE_ROUTES_EDEFAULT.equals(includeRoutes);
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__INITIAL_DELAY:
				return INITIAL_DELAY_EDEFAULT == null ? initialDelay != null : !INITIAL_DELAY_EDEFAULT.equals(initialDelay);
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__LOGGING_LEVEL:
				return LOGGING_LEVEL_EDEFAULT == null ? loggingLevel != null : !LOGGING_LEVEL_EDEFAULT.equals(loggingLevel);
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__SUPERVISING:
				return SUPERVISING_EDEFAULT == null ? supervising != null : !SUPERVISING_EDEFAULT.equals(supervising);
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__THREAD_POOL_SIZE:
				return THREAD_POOL_SIZE_EDEFAULT == null ? threadPoolSize != null : !THREAD_POOL_SIZE_EDEFAULT.equals(threadPoolSize);
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__UNHEALTHY_ON_EXHAUSTED:
				return UNHEALTHY_ON_EXHAUSTED_EDEFAULT == null ? unhealthyOnExhausted != null : !UNHEALTHY_ON_EXHAUSTED_EDEFAULT.equals(unhealthyOnExhausted);
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION__UNHEALTHY_ON_RESTARTING:
				return UNHEALTHY_ON_RESTARTING_EDEFAULT == null ? unhealthyOnRestarting != null : !UNHEALTHY_ON_RESTARTING_EDEFAULT.equals(unhealthyOnRestarting);
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
		result.append(" (backOffDelay: ");
		result.append(backOffDelay);
		result.append(", backOffMaxAttempts: ");
		result.append(backOffMaxAttempts);
		result.append(", backOffMaxDelay: ");
		result.append(backOffMaxDelay);
		result.append(", backOffMaxElapsedTime: ");
		result.append(backOffMaxElapsedTime);
		result.append(", backOffMultiplier: ");
		result.append(backOffMultiplier);
		result.append(", excludeRoutes: ");
		result.append(excludeRoutes);
		result.append(", includeRoutes: ");
		result.append(includeRoutes);
		result.append(", initialDelay: ");
		result.append(initialDelay);
		result.append(", loggingLevel: ");
		result.append(loggingLevel);
		result.append(", supervising: ");
		result.append(supervising);
		result.append(", threadPoolSize: ");
		result.append(threadPoolSize);
		result.append(", unhealthyOnExhausted: ");
		result.append(unhealthyOnExhausted);
		result.append(", unhealthyOnRestarting: ");
		result.append(unhealthyOnRestarting);
		result.append(')');
		return result.toString();
	}

} //CamelRouteControllerDefinitionImpl
