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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.camel.camelspring.ApiKeyDefinition;
import org.eclipse.fennec.camel.camelspring.BasicAuthDefinition;
import org.eclipse.fennec.camel.camelspring.BearerTokenDefinition;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.MutualTLSDefinition;
import org.eclipse.fennec.camel.camelspring.OAuth2Definition;
import org.eclipse.fennec.camel.camelspring.OpenIdConnectDefinition;
import org.eclipse.fennec.camel.camelspring.RestSecuritiesDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rest Securities Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestSecuritiesDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestSecuritiesDefinitionImpl#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestSecuritiesDefinitionImpl#getBasicAuth <em>Basic Auth</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestSecuritiesDefinitionImpl#getBearerToken <em>Bearer Token</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestSecuritiesDefinitionImpl#getOauth2 <em>Oauth2</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestSecuritiesDefinitionImpl#getOpenIdConnect <em>Open Id Connect</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestSecuritiesDefinitionImpl#getMutualTLS <em>Mutual TLS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestSecuritiesDefinitionImpl extends MinimalEObjectImpl.Container implements RestSecuritiesDefinition {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestSecuritiesDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getRestSecuritiesDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CamelSpringPackage.REST_SECURITIES_DEFINITION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ApiKeyDefinition> getApiKey() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRestSecuritiesDefinition_ApiKey());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BasicAuthDefinition> getBasicAuth() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRestSecuritiesDefinition_BasicAuth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BearerTokenDefinition> getBearerToken() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRestSecuritiesDefinition_BearerToken());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OAuth2Definition> getOauth2() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRestSecuritiesDefinition_Oauth2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OpenIdConnectDefinition> getOpenIdConnect() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRestSecuritiesDefinition_OpenIdConnect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MutualTLSDefinition> getMutualTLS() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRestSecuritiesDefinition_MutualTLS());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__API_KEY:
				return ((InternalEList<?>)getApiKey()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__BASIC_AUTH:
				return ((InternalEList<?>)getBasicAuth()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__BEARER_TOKEN:
				return ((InternalEList<?>)getBearerToken()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__OAUTH2:
				return ((InternalEList<?>)getOauth2()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__OPEN_ID_CONNECT:
				return ((InternalEList<?>)getOpenIdConnect()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__MUTUAL_TLS:
				return ((InternalEList<?>)getMutualTLS()).basicRemove(otherEnd, msgs);
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
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__API_KEY:
				return getApiKey();
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__BASIC_AUTH:
				return getBasicAuth();
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__BEARER_TOKEN:
				return getBearerToken();
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__OAUTH2:
				return getOauth2();
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__OPEN_ID_CONNECT:
				return getOpenIdConnect();
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__MUTUAL_TLS:
				return getMutualTLS();
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
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__API_KEY:
				getApiKey().clear();
				getApiKey().addAll((Collection<? extends ApiKeyDefinition>)newValue);
				return;
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__BASIC_AUTH:
				getBasicAuth().clear();
				getBasicAuth().addAll((Collection<? extends BasicAuthDefinition>)newValue);
				return;
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__BEARER_TOKEN:
				getBearerToken().clear();
				getBearerToken().addAll((Collection<? extends BearerTokenDefinition>)newValue);
				return;
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__OAUTH2:
				getOauth2().clear();
				getOauth2().addAll((Collection<? extends OAuth2Definition>)newValue);
				return;
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__OPEN_ID_CONNECT:
				getOpenIdConnect().clear();
				getOpenIdConnect().addAll((Collection<? extends OpenIdConnectDefinition>)newValue);
				return;
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__MUTUAL_TLS:
				getMutualTLS().clear();
				getMutualTLS().addAll((Collection<? extends MutualTLSDefinition>)newValue);
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
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__GROUP:
				getGroup().clear();
				return;
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__API_KEY:
				getApiKey().clear();
				return;
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__BASIC_AUTH:
				getBasicAuth().clear();
				return;
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__BEARER_TOKEN:
				getBearerToken().clear();
				return;
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__OAUTH2:
				getOauth2().clear();
				return;
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__OPEN_ID_CONNECT:
				getOpenIdConnect().clear();
				return;
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__MUTUAL_TLS:
				getMutualTLS().clear();
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
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__GROUP:
				return group != null && !group.isEmpty();
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__API_KEY:
				return !getApiKey().isEmpty();
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__BASIC_AUTH:
				return !getBasicAuth().isEmpty();
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__BEARER_TOKEN:
				return !getBearerToken().isEmpty();
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__OAUTH2:
				return !getOauth2().isEmpty();
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__OPEN_ID_CONNECT:
				return !getOpenIdConnect().isEmpty();
			case CamelSpringPackage.REST_SECURITIES_DEFINITION__MUTUAL_TLS:
				return !getMutualTLS().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //RestSecuritiesDefinitionImpl
