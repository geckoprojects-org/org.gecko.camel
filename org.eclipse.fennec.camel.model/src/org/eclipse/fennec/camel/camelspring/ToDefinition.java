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
 * A representation of the model object '<em><b>To Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ToDefinition#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ToDefinition#getVariableReceive <em>Variable Receive</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ToDefinition#getVariableSend <em>Variable Send</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getToDefinition()
 * @model extendedMetaData="name='toDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface ToDefinition extends SendDefinition {
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getToDefinition_Pattern()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='pattern'"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ToDefinition#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getToDefinition_VariableReceive()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='variableReceive'"
	 * @generated
	 */
	String getVariableReceive();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ToDefinition#getVariableReceive <em>Variable Receive</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getToDefinition_VariableSend()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='variableSend'"
	 * @generated
	 */
	String getVariableSend();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ToDefinition#getVariableSend <em>Variable Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Send</em>' attribute.
	 * @see #getVariableSend()
	 * @generated
	 */
	void setVariableSend(String value);

} // ToDefinition
