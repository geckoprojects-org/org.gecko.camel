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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Dynamic Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ToDynamicDefinition#getAllowOptimisedComponents <em>Allow Optimised Components</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ToDynamicDefinition#getAutoStartComponents <em>Auto Start Components</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ToDynamicDefinition#getCacheSize <em>Cache Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ToDynamicDefinition#getIgnoreInvalidEndpoint <em>Ignore Invalid Endpoint</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ToDynamicDefinition#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ToDynamicDefinition#getUri <em>Uri</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ToDynamicDefinition#getVariableReceive <em>Variable Receive</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ToDynamicDefinition#getVariableSend <em>Variable Send</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getToDynamicDefinition()
 * @model extendedMetaData="name='toDynamicDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface ToDynamicDefinition extends NoOutputDefinition {
	/**
	 * Returns the value of the '<em><b>Allow Optimised Components</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to allow components to optimise toD if they are org.apache.camel.spi.SendDynamicAware . Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Optimised Components</em>' attribute.
	 * @see #setAllowOptimisedComponents(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getToDynamicDefinition_AllowOptimisedComponents()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowOptimisedComponents'"
	 * @generated
	 */
	String getAllowOptimisedComponents();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ToDynamicDefinition#getAllowOptimisedComponents <em>Allow Optimised Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Optimised Components</em>' attribute.
	 * @see #getAllowOptimisedComponents()
	 * @generated
	 */
	void setAllowOptimisedComponents(String value);

	/**
	 * Returns the value of the '<em><b>Auto Start Components</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to auto startup components when toD is starting up. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Start Components</em>' attribute.
	 * @see #setAutoStartComponents(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getToDynamicDefinition_AutoStartComponents()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='autoStartComponents'"
	 * @generated
	 */
	String getAutoStartComponents();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ToDynamicDefinition#getAutoStartComponents <em>Auto Start Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Start Components</em>' attribute.
	 * @see #getAutoStartComponents()
	 * @generated
	 */
	void setAutoStartComponents(String value);

	/**
	 * Returns the value of the '<em><b>Cache Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the maximum size used by the org.apache.camel.spi.ProducerCache which is used to cache and reuse producers when
	 * using this recipient list, when uris are reused. Beware that when using dynamic endpoints then it affects how well the
	 * cache can be utilized. If each dynamic endpoint is unique then its best to turn off caching by setting this to -1, which
	 * allows Camel to not cache both the producers and endpoints; they are regarded as prototype scoped and will be stopped
	 * and discarded after use. This reduces memory usage as otherwise producers/endpoints are stored in memory in the caches.
	 * However if there are a high degree of dynamic endpoints that have been used before, then it can benefit to use the cache
	 * to reuse both producers and endpoints and therefore the cache size can be set accordingly or rely on the default size
	 * (1000). If there is a mix of unique and used before dynamic endpoints, then setting a reasonable cache size can help
	 * reduce memory usage to avoid storing too many non frequent used producers.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cache Size</em>' attribute.
	 * @see #setCacheSize(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getToDynamicDefinition_CacheSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='cacheSize'"
	 * @generated
	 */
	String getCacheSize();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ToDynamicDefinition#getCacheSize <em>Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Size</em>' attribute.
	 * @see #getCacheSize()
	 * @generated
	 */
	void setCacheSize(String value);

	/**
	 * Returns the value of the '<em><b>Ignore Invalid Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to ignore invalid endpoint URIs and skip sending the message. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ignore Invalid Endpoint</em>' attribute.
	 * @see #setIgnoreInvalidEndpoint(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getToDynamicDefinition_IgnoreInvalidEndpoint()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ignoreInvalidEndpoint'"
	 * @generated
	 */
	String getIgnoreInvalidEndpoint();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ToDynamicDefinition#getIgnoreInvalidEndpoint <em>Ignore Invalid Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Invalid Endpoint</em>' attribute.
	 * @see #getIgnoreInvalidEndpoint()
	 * @generated
	 */
	void setIgnoreInvalidEndpoint(String value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the optional ExchangePattern used to invoke this endpoint.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getToDynamicDefinition_Pattern()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='pattern'"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ToDynamicDefinition#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The uri of the endpoint to send to. The uri can be dynamic computed using the
	 * org.apache.camel.language.simple.SimpleLanguage expression.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getToDynamicDefinition_Uri()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='uri'"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ToDynamicDefinition#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Variable Receive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a variable as the source for the message body to send. This makes it handy to use variables for user data and to
	 * easily control what data to use for sending and receiving. Important: When using send variable then the message body is
	 * taken from this variable instead of the current Message , however the headers from the Message will still be used as
	 * well. In other words, the variable is used instead of the message body, but everything else is as usual.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable Receive</em>' attribute.
	 * @see #setVariableReceive(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getToDynamicDefinition_VariableReceive()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='variableReceive'"
	 * @generated
	 */
	String getVariableReceive();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ToDynamicDefinition#getVariableReceive <em>Variable Receive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Receive</em>' attribute.
	 * @see #getVariableReceive()
	 * @generated
	 */
	void setVariableReceive(String value);

	/**
	 * Returns the value of the '<em><b>Variable Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a variable as the source for the message body to send. This makes it handy to use variables for user data and to
	 * easily control what data to use for sending and receiving. Important: When using send variable then the message body is
	 * taken from this variable instead of the current message, however the headers from the message will still be used as
	 * well. In other words, the variable is used instead of the message body, but everything else is as usual.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable Send</em>' attribute.
	 * @see #setVariableSend(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getToDynamicDefinition_VariableSend()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='variableSend'"
	 * @generated
	 */
	String getVariableSend();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ToDynamicDefinition#getVariableSend <em>Variable Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Send</em>' attribute.
	 * @see #getVariableSend()
	 * @generated
	 */
	void setVariableSend(String value);

} // ToDynamicDefinition
