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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OAuth2 Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.OAuth2Definition#getScopes <em>Scopes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.OAuth2Definition#getAuthorizationUrl <em>Authorization Url</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.OAuth2Definition#getFlow <em>Flow</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.OAuth2Definition#getRefreshUrl <em>Refresh Url</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.OAuth2Definition#getTokenUrl <em>Token Url</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getOAuth2Definition()
 * @model extendedMetaData="name='oAuth2Definition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface OAuth2Definition extends RestSecurityDefinition {
	/**
	 * Returns the value of the '<em><b>Scopes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RestPropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The available scopes for an OAuth2 security scheme.
	 * 
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scopes</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getOAuth2Definition_Scopes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scopes' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RestPropertyDefinition> getScopes();

	/**
	 * Returns the value of the '<em><b>Authorization Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The authorization URL to be used for this flow. This SHOULD be in the form of a URL. Required for implicit and access
	 * code flows.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authorization Url</em>' attribute.
	 * @see #setAuthorizationUrl(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getOAuth2Definition_AuthorizationUrl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='authorizationUrl'"
	 * @generated
	 */
	String getAuthorizationUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.OAuth2Definition#getAuthorizationUrl <em>Authorization Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization Url</em>' attribute.
	 * @see #getAuthorizationUrl()
	 * @generated
	 */
	void setAuthorizationUrl(String value);

	/**
	 * Returns the value of the '<em><b>Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The flow used by the OAuth2 security scheme. Valid values are implicit, password, application or accessCode.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flow</em>' attribute.
	 * @see #setFlow(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getOAuth2Definition_Flow()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='flow'"
	 * @generated
	 */
	String getFlow();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.OAuth2Definition#getFlow <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow</em>' attribute.
	 * @see #getFlow()
	 * @generated
	 */
	void setFlow(String value);

	/**
	 * Returns the value of the '<em><b>Refresh Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The URL to be used for obtaining refresh tokens. This MUST be in the form of a URL.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refresh Url</em>' attribute.
	 * @see #setRefreshUrl(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getOAuth2Definition_RefreshUrl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='refreshUrl'"
	 * @generated
	 */
	String getRefreshUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.OAuth2Definition#getRefreshUrl <em>Refresh Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Url</em>' attribute.
	 * @see #getRefreshUrl()
	 * @generated
	 */
	void setRefreshUrl(String value);

	/**
	 * Returns the value of the '<em><b>Token Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The token URL to be used for this flow. This SHOULD be in the form of a URL. Required for password, application, and
	 * access code flows.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Token Url</em>' attribute.
	 * @see #setTokenUrl(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getOAuth2Definition_TokenUrl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='tokenUrl'"
	 * @generated
	 */
	String getTokenUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.OAuth2Definition#getTokenUrl <em>Token Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Url</em>' attribute.
	 * @see #getTokenUrl()
	 * @generated
	 */
	void setTokenUrl(String value);

} // OAuth2Definition
