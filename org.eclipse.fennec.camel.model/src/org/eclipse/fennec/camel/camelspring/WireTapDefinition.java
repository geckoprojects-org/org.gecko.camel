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
 * A representation of the model object '<em><b>Wire Tap Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.WireTapDefinition#getCopy <em>Copy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.WireTapDefinition#getDynamicUri <em>Dynamic Uri</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.WireTapDefinition#getExecutorService <em>Executor Service</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.WireTapDefinition#getOnPrepare <em>On Prepare</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getWireTapDefinition()
 * @model extendedMetaData="name='wireTapDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface WireTapDefinition extends ToDynamicDefinition {
	/**
	 * Returns the value of the '<em><b>Copy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Uses a copy of the original exchange. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copy</em>' attribute.
	 * @see #setCopy(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getWireTapDefinition_Copy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='copy'"
	 * @generated
	 */
	String getCopy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.WireTapDefinition#getCopy <em>Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy</em>' attribute.
	 * @see #getCopy()
	 * @generated
	 */
	void setCopy(String value);

	/**
	 * Returns the value of the '<em><b>Dynamic Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether the uri is dynamic or static. If the uri is dynamic then the simple language is used to evaluate a dynamic uri
	 * to use as the wire-tap destination, for each incoming message. This works similar to how the toD EIP pattern works. If
	 * static then the uri is used as-is as the wire-tap destination. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamic Uri</em>' attribute.
	 * @see #setDynamicUri(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getWireTapDefinition_DynamicUri()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='dynamicUri'"
	 * @generated
	 */
	String getDynamicUri();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.WireTapDefinition#getDynamicUri <em>Dynamic Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Uri</em>' attribute.
	 * @see #getDynamicUri()
	 * @generated
	 */
	void setDynamicUri(String value);

	/**
	 * Returns the value of the '<em><b>Executor Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Uses a custom thread pool.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Executor Service</em>' attribute.
	 * @see #setExecutorService(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getWireTapDefinition_ExecutorService()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='executorService'"
	 * @generated
	 */
	String getExecutorService();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.WireTapDefinition#getExecutorService <em>Executor Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor Service</em>' attribute.
	 * @see #getExecutorService()
	 * @generated
	 */
	void setExecutorService(String value);

	/**
	 * Returns the value of the '<em><b>On Prepare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Uses the Processor when preparing the org.apache.camel.Exchange to be sent. This can be used to deep-clone messages that
	 * should be sent, or any custom logic needed before the exchange is sent.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Prepare</em>' attribute.
	 * @see #setOnPrepare(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getWireTapDefinition_OnPrepare()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='onPrepare'"
	 * @generated
	 */
	String getOnPrepare();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.WireTapDefinition#getOnPrepare <em>On Prepare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Prepare</em>' attribute.
	 * @see #getOnPrepare()
	 * @generated
	 */
	void setOnPrepare(String value);

} // WireTapDefinition
