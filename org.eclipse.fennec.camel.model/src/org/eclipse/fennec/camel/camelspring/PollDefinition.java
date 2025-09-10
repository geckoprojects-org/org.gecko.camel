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
 * A representation of the model object '<em><b>Poll Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.PollDefinition#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.PollDefinition#getUri <em>Uri</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.PollDefinition#getVariableReceive <em>Variable Receive</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getPollDefinition()
 * @model extendedMetaData="name='pollDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface PollDefinition extends NoOutputDefinition {
	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Timeout in millis when polling from the external service. The timeout has influence about the poll enrich behavior. It
	 * basically operations in three different modes: negative value - Waits until a message is available and then returns it.
	 * Warning that this method could block indefinitely if no messages are available. 0 - Attempts to receive a message
	 * exchange immediately without waiting and returning null if a message exchange is not available yet. positive value -
	 * Attempts to receive a message exchange, waiting up to the given timeout to expire if a message is not yet available.
	 * Returns null if timed out The default value is 20000 (20 seconds). Default value: 20000
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getPollDefinition_Timeout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='timeout'"
	 * @generated
	 */
	String getTimeout();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.PollDefinition#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(String value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the uri of the endpoint to poll from.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getPollDefinition_Uri()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='uri'"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.PollDefinition#getUri <em>Uri</em>}' attribute.
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
	 * To use a variable to store the received message body (only body, not headers). This makes it handy to use variables for
	 * user data and to easily control what data to use for sending and receiving. Important: When using receive variable then
	 * the received body is stored only in this variable and not on the current message.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable Receive</em>' attribute.
	 * @see #setVariableReceive(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getPollDefinition_VariableReceive()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='variableReceive'"
	 * @generated
	 */
	String getVariableReceive();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.PollDefinition#getVariableReceive <em>Variable Receive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Receive</em>' attribute.
	 * @see #getVariableReceive()
	 * @generated
	 */
	void setVariableReceive(String value);

} // PollDefinition
