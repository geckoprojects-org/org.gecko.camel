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
package org.eclipse.fennec.camel.camelspring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest Securities Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestSecuritiesDefinition#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestSecuritiesDefinition#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestSecuritiesDefinition#getBasicAuth <em>Basic Auth</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestSecuritiesDefinition#getBearerToken <em>Bearer Token</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestSecuritiesDefinition#getOauth2 <em>Oauth2</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestSecuritiesDefinition#getOpenIdConnect <em>Open Id Connect</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestSecuritiesDefinition#getMutualTLS <em>Mutual TLS</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestSecuritiesDefinition()
 * @model extendedMetaData="name='restSecuritiesDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RestSecuritiesDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestSecuritiesDefinition_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Api Key</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ApiKeyDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Rest security basic auth definition
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Api Key</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestSecuritiesDefinition_ApiKey()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='apiKey' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ApiKeyDefinition> getApiKey();

	/**
	 * Returns the value of the '<em><b>Basic Auth</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.BasicAuthDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Rest security basic auth definition
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Basic Auth</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestSecuritiesDefinition_BasicAuth()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='basicAuth' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<BasicAuthDefinition> getBasicAuth();

	/**
	 * Returns the value of the '<em><b>Bearer Token</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.BearerTokenDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Rest security bearer token authentication definition
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bearer Token</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestSecuritiesDefinition_BearerToken()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bearerToken' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<BearerTokenDefinition> getBearerToken();

	/**
	 * Returns the value of the '<em><b>Oauth2</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.OAuth2Definition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Rest security OAuth2 definition
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oauth2</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestSecuritiesDefinition_Oauth2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='oauth2' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<OAuth2Definition> getOauth2();

	/**
	 * Returns the value of the '<em><b>Open Id Connect</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.OpenIdConnectDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Rest security OpenID Connect definition
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Open Id Connect</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestSecuritiesDefinition_OpenIdConnect()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='openIdConnect' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<OpenIdConnectDefinition> getOpenIdConnect();

	/**
	 * Returns the value of the '<em><b>Mutual TLS</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.MutualTLSDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Rest security mutual TLS authentication definition
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mutual TLS</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestSecuritiesDefinition_MutualTLS()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mutualTLS' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<MutualTLSDefinition> getMutualTLS();

} // RestSecuritiesDefinition
