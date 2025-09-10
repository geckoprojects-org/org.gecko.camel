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
import org.eclipse.fennec.camel.camelspring.ToDynamicDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Dynamic Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ToDynamicDefinitionImpl#getAllowOptimisedComponents <em>Allow Optimised Components</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ToDynamicDefinitionImpl#getAutoStartComponents <em>Auto Start Components</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ToDynamicDefinitionImpl#getCacheSize <em>Cache Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ToDynamicDefinitionImpl#getIgnoreInvalidEndpoint <em>Ignore Invalid Endpoint</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ToDynamicDefinitionImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ToDynamicDefinitionImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ToDynamicDefinitionImpl#getVariableReceive <em>Variable Receive</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ToDynamicDefinitionImpl#getVariableSend <em>Variable Send</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToDynamicDefinitionImpl extends NoOutputDefinitionImpl implements ToDynamicDefinition {
	/**
	 * The default value of the '{@link #getAllowOptimisedComponents() <em>Allow Optimised Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowOptimisedComponents()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_OPTIMISED_COMPONENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowOptimisedComponents() <em>Allow Optimised Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowOptimisedComponents()
	 * @generated
	 * @ordered
	 */
	protected String allowOptimisedComponents = ALLOW_OPTIMISED_COMPONENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoStartComponents() <em>Auto Start Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoStartComponents()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTO_START_COMPONENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoStartComponents() <em>Auto Start Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoStartComponents()
	 * @generated
	 * @ordered
	 */
	protected String autoStartComponents = AUTO_START_COMPONENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCacheSize() <em>Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheSize()
	 * @generated
	 * @ordered
	 */
	protected static final String CACHE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCacheSize() <em>Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheSize()
	 * @generated
	 * @ordered
	 */
	protected String cacheSize = CACHE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIgnoreInvalidEndpoint() <em>Ignore Invalid Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreInvalidEndpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String IGNORE_INVALID_ENDPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIgnoreInvalidEndpoint() <em>Ignore Invalid Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreInvalidEndpoint()
	 * @generated
	 * @ordered
	 */
	protected String ignoreInvalidEndpoint = IGNORE_INVALID_ENDPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected String pattern = PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariableReceive() <em>Variable Receive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableReceive()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_RECEIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableReceive() <em>Variable Receive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableReceive()
	 * @generated
	 * @ordered
	 */
	protected String variableReceive = VARIABLE_RECEIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariableSend() <em>Variable Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableSend()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_SEND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableSend() <em>Variable Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableSend()
	 * @generated
	 * @ordered
	 */
	protected String variableSend = VARIABLE_SEND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToDynamicDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getToDynamicDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowOptimisedComponents() {
		return allowOptimisedComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowOptimisedComponents(String newAllowOptimisedComponents) {
		String oldAllowOptimisedComponents = allowOptimisedComponents;
		allowOptimisedComponents = newAllowOptimisedComponents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TO_DYNAMIC_DEFINITION__ALLOW_OPTIMISED_COMPONENTS, oldAllowOptimisedComponents, allowOptimisedComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAutoStartComponents() {
		return autoStartComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoStartComponents(String newAutoStartComponents) {
		String oldAutoStartComponents = autoStartComponents;
		autoStartComponents = newAutoStartComponents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TO_DYNAMIC_DEFINITION__AUTO_START_COMPONENTS, oldAutoStartComponents, autoStartComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCacheSize() {
		return cacheSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCacheSize(String newCacheSize) {
		String oldCacheSize = cacheSize;
		cacheSize = newCacheSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TO_DYNAMIC_DEFINITION__CACHE_SIZE, oldCacheSize, cacheSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIgnoreInvalidEndpoint() {
		return ignoreInvalidEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreInvalidEndpoint(String newIgnoreInvalidEndpoint) {
		String oldIgnoreInvalidEndpoint = ignoreInvalidEndpoint;
		ignoreInvalidEndpoint = newIgnoreInvalidEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TO_DYNAMIC_DEFINITION__IGNORE_INVALID_ENDPOINT, oldIgnoreInvalidEndpoint, ignoreInvalidEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPattern(String newPattern) {
		String oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TO_DYNAMIC_DEFINITION__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TO_DYNAMIC_DEFINITION__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVariableReceive() {
		return variableReceive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariableReceive(String newVariableReceive) {
		String oldVariableReceive = variableReceive;
		variableReceive = newVariableReceive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TO_DYNAMIC_DEFINITION__VARIABLE_RECEIVE, oldVariableReceive, variableReceive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVariableSend() {
		return variableSend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariableSend(String newVariableSend) {
		String oldVariableSend = variableSend;
		variableSend = newVariableSend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TO_DYNAMIC_DEFINITION__VARIABLE_SEND, oldVariableSend, variableSend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__ALLOW_OPTIMISED_COMPONENTS:
				return getAllowOptimisedComponents();
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__AUTO_START_COMPONENTS:
				return getAutoStartComponents();
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__CACHE_SIZE:
				return getCacheSize();
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__IGNORE_INVALID_ENDPOINT:
				return getIgnoreInvalidEndpoint();
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__PATTERN:
				return getPattern();
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__URI:
				return getUri();
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__VARIABLE_RECEIVE:
				return getVariableReceive();
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__VARIABLE_SEND:
				return getVariableSend();
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
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__ALLOW_OPTIMISED_COMPONENTS:
				setAllowOptimisedComponents((String)newValue);
				return;
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__AUTO_START_COMPONENTS:
				setAutoStartComponents((String)newValue);
				return;
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__CACHE_SIZE:
				setCacheSize((String)newValue);
				return;
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__IGNORE_INVALID_ENDPOINT:
				setIgnoreInvalidEndpoint((String)newValue);
				return;
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__PATTERN:
				setPattern((String)newValue);
				return;
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__URI:
				setUri((String)newValue);
				return;
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__VARIABLE_RECEIVE:
				setVariableReceive((String)newValue);
				return;
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__VARIABLE_SEND:
				setVariableSend((String)newValue);
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
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__ALLOW_OPTIMISED_COMPONENTS:
				setAllowOptimisedComponents(ALLOW_OPTIMISED_COMPONENTS_EDEFAULT);
				return;
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__AUTO_START_COMPONENTS:
				setAutoStartComponents(AUTO_START_COMPONENTS_EDEFAULT);
				return;
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__CACHE_SIZE:
				setCacheSize(CACHE_SIZE_EDEFAULT);
				return;
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__IGNORE_INVALID_ENDPOINT:
				setIgnoreInvalidEndpoint(IGNORE_INVALID_ENDPOINT_EDEFAULT);
				return;
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__URI:
				setUri(URI_EDEFAULT);
				return;
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__VARIABLE_RECEIVE:
				setVariableReceive(VARIABLE_RECEIVE_EDEFAULT);
				return;
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__VARIABLE_SEND:
				setVariableSend(VARIABLE_SEND_EDEFAULT);
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
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__ALLOW_OPTIMISED_COMPONENTS:
				return ALLOW_OPTIMISED_COMPONENTS_EDEFAULT == null ? allowOptimisedComponents != null : !ALLOW_OPTIMISED_COMPONENTS_EDEFAULT.equals(allowOptimisedComponents);
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__AUTO_START_COMPONENTS:
				return AUTO_START_COMPONENTS_EDEFAULT == null ? autoStartComponents != null : !AUTO_START_COMPONENTS_EDEFAULT.equals(autoStartComponents);
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__CACHE_SIZE:
				return CACHE_SIZE_EDEFAULT == null ? cacheSize != null : !CACHE_SIZE_EDEFAULT.equals(cacheSize);
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__IGNORE_INVALID_ENDPOINT:
				return IGNORE_INVALID_ENDPOINT_EDEFAULT == null ? ignoreInvalidEndpoint != null : !IGNORE_INVALID_ENDPOINT_EDEFAULT.equals(ignoreInvalidEndpoint);
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__VARIABLE_RECEIVE:
				return VARIABLE_RECEIVE_EDEFAULT == null ? variableReceive != null : !VARIABLE_RECEIVE_EDEFAULT.equals(variableReceive);
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION__VARIABLE_SEND:
				return VARIABLE_SEND_EDEFAULT == null ? variableSend != null : !VARIABLE_SEND_EDEFAULT.equals(variableSend);
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
		result.append(" (allowOptimisedComponents: ");
		result.append(allowOptimisedComponents);
		result.append(", autoStartComponents: ");
		result.append(autoStartComponents);
		result.append(", cacheSize: ");
		result.append(cacheSize);
		result.append(", ignoreInvalidEndpoint: ");
		result.append(ignoreInvalidEndpoint);
		result.append(", pattern: ");
		result.append(pattern);
		result.append(", uri: ");
		result.append(uri);
		result.append(", variableReceive: ");
		result.append(variableReceive);
		result.append(", variableSend: ");
		result.append(variableSend);
		result.append(')');
		return result.toString();
	}

} //ToDynamicDefinitionImpl
