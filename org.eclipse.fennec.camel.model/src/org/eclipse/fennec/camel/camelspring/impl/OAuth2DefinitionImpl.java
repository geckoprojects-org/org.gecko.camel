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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.OAuth2Definition;
import org.eclipse.fennec.camel.camelspring.RestPropertyDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OAuth2 Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.OAuth2DefinitionImpl#getScopes <em>Scopes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.OAuth2DefinitionImpl#getAuthorizationUrl <em>Authorization Url</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.OAuth2DefinitionImpl#getFlow <em>Flow</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.OAuth2DefinitionImpl#getRefreshUrl <em>Refresh Url</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.OAuth2DefinitionImpl#getTokenUrl <em>Token Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OAuth2DefinitionImpl extends RestSecurityDefinitionImpl implements OAuth2Definition {
	/**
	 * The cached value of the '{@link #getScopes() <em>Scopes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopes()
	 * @generated
	 * @ordered
	 */
	protected EList<RestPropertyDefinition> scopes;

	/**
	 * The default value of the '{@link #getAuthorizationUrl() <em>Authorization Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORIZATION_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorizationUrl() <em>Authorization Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationUrl()
	 * @generated
	 * @ordered
	 */
	protected String authorizationUrl = AUTHORIZATION_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlow() <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlow()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlow() <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlow()
	 * @generated
	 * @ordered
	 */
	protected String flow = FLOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefreshUrl() <em>Refresh Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String REFRESH_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefreshUrl() <em>Refresh Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshUrl()
	 * @generated
	 * @ordered
	 */
	protected String refreshUrl = REFRESH_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTokenUrl() <em>Token Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTokenUrl() <em>Token Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenUrl()
	 * @generated
	 * @ordered
	 */
	protected String tokenUrl = TOKEN_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OAuth2DefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getOAuth2Definition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RestPropertyDefinition> getScopes() {
		if (scopes == null) {
			scopes = new EObjectContainmentEList<RestPropertyDefinition>(RestPropertyDefinition.class, this, CamelSpringPackage.OAUTH2_DEFINITION__SCOPES);
		}
		return scopes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthorizationUrl() {
		return authorizationUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorizationUrl(String newAuthorizationUrl) {
		String oldAuthorizationUrl = authorizationUrl;
		authorizationUrl = newAuthorizationUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.OAUTH2_DEFINITION__AUTHORIZATION_URL, oldAuthorizationUrl, authorizationUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFlow() {
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlow(String newFlow) {
		String oldFlow = flow;
		flow = newFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.OAUTH2_DEFINITION__FLOW, oldFlow, flow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRefreshUrl() {
		return refreshUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefreshUrl(String newRefreshUrl) {
		String oldRefreshUrl = refreshUrl;
		refreshUrl = newRefreshUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.OAUTH2_DEFINITION__REFRESH_URL, oldRefreshUrl, refreshUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTokenUrl() {
		return tokenUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTokenUrl(String newTokenUrl) {
		String oldTokenUrl = tokenUrl;
		tokenUrl = newTokenUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.OAUTH2_DEFINITION__TOKEN_URL, oldTokenUrl, tokenUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.OAUTH2_DEFINITION__SCOPES:
				return ((InternalEList<?>)getScopes()).basicRemove(otherEnd, msgs);
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
			case CamelSpringPackage.OAUTH2_DEFINITION__SCOPES:
				return getScopes();
			case CamelSpringPackage.OAUTH2_DEFINITION__AUTHORIZATION_URL:
				return getAuthorizationUrl();
			case CamelSpringPackage.OAUTH2_DEFINITION__FLOW:
				return getFlow();
			case CamelSpringPackage.OAUTH2_DEFINITION__REFRESH_URL:
				return getRefreshUrl();
			case CamelSpringPackage.OAUTH2_DEFINITION__TOKEN_URL:
				return getTokenUrl();
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
			case CamelSpringPackage.OAUTH2_DEFINITION__SCOPES:
				getScopes().clear();
				getScopes().addAll((Collection<? extends RestPropertyDefinition>)newValue);
				return;
			case CamelSpringPackage.OAUTH2_DEFINITION__AUTHORIZATION_URL:
				setAuthorizationUrl((String)newValue);
				return;
			case CamelSpringPackage.OAUTH2_DEFINITION__FLOW:
				setFlow((String)newValue);
				return;
			case CamelSpringPackage.OAUTH2_DEFINITION__REFRESH_URL:
				setRefreshUrl((String)newValue);
				return;
			case CamelSpringPackage.OAUTH2_DEFINITION__TOKEN_URL:
				setTokenUrl((String)newValue);
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
			case CamelSpringPackage.OAUTH2_DEFINITION__SCOPES:
				getScopes().clear();
				return;
			case CamelSpringPackage.OAUTH2_DEFINITION__AUTHORIZATION_URL:
				setAuthorizationUrl(AUTHORIZATION_URL_EDEFAULT);
				return;
			case CamelSpringPackage.OAUTH2_DEFINITION__FLOW:
				setFlow(FLOW_EDEFAULT);
				return;
			case CamelSpringPackage.OAUTH2_DEFINITION__REFRESH_URL:
				setRefreshUrl(REFRESH_URL_EDEFAULT);
				return;
			case CamelSpringPackage.OAUTH2_DEFINITION__TOKEN_URL:
				setTokenUrl(TOKEN_URL_EDEFAULT);
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
			case CamelSpringPackage.OAUTH2_DEFINITION__SCOPES:
				return scopes != null && !scopes.isEmpty();
			case CamelSpringPackage.OAUTH2_DEFINITION__AUTHORIZATION_URL:
				return AUTHORIZATION_URL_EDEFAULT == null ? authorizationUrl != null : !AUTHORIZATION_URL_EDEFAULT.equals(authorizationUrl);
			case CamelSpringPackage.OAUTH2_DEFINITION__FLOW:
				return FLOW_EDEFAULT == null ? flow != null : !FLOW_EDEFAULT.equals(flow);
			case CamelSpringPackage.OAUTH2_DEFINITION__REFRESH_URL:
				return REFRESH_URL_EDEFAULT == null ? refreshUrl != null : !REFRESH_URL_EDEFAULT.equals(refreshUrl);
			case CamelSpringPackage.OAUTH2_DEFINITION__TOKEN_URL:
				return TOKEN_URL_EDEFAULT == null ? tokenUrl != null : !TOKEN_URL_EDEFAULT.equals(tokenUrl);
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
		result.append(" (authorizationUrl: ");
		result.append(authorizationUrl);
		result.append(", flow: ");
		result.append(flow);
		result.append(", refreshUrl: ");
		result.append(refreshUrl);
		result.append(", tokenUrl: ");
		result.append(tokenUrl);
		result.append(')');
		return result.toString();
	}

} //OAuth2DefinitionImpl
