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
 * A representation of the model object '<em><b>Dead Letter Channel Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DeadLetterChannelDefinition#getDeadLetterHandleNewException <em>Dead Letter Handle New Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DeadLetterChannelDefinition#getDeadLetterUri <em>Dead Letter Uri</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDeadLetterChannelDefinition()
 * @model extendedMetaData="name='deadLetterChannelDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeadLetterChannelDefinition extends DefaultErrorHandlerDefinition {
	/**
	 * Returns the value of the '<em><b>Dead Letter Handle New Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether the dead letter channel should handle (and ignore) any new exception that may been thrown during sending the
	 * message to the dead letter endpoint. The default value is true which means any such kind of exception is handled and
	 * ignored. Set this to false to let the exception be propagated back on the org.apache.camel.Exchange . This can be used
	 * in situations where you use transactions, and want to use Camel's dead letter channel to deal with exceptions during
	 * routing, but if the dead letter channel itself fails because of a new exception being thrown, then by setting this to
	 * false the new exceptions is propagated back and set on the org.apache.camel.Exchange , which allows the transaction to
	 * detect the exception, and rollback. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dead Letter Handle New Exception</em>' attribute.
	 * @see #setDeadLetterHandleNewException(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDeadLetterChannelDefinition_DeadLetterHandleNewException()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='deadLetterHandleNewException'"
	 * @generated
	 */
	String getDeadLetterHandleNewException();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DeadLetterChannelDefinition#getDeadLetterHandleNewException <em>Dead Letter Handle New Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dead Letter Handle New Exception</em>' attribute.
	 * @see #getDeadLetterHandleNewException()
	 * @generated
	 */
	void setDeadLetterHandleNewException(String value);

	/**
	 * Returns the value of the '<em><b>Dead Letter Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The dead letter endpoint uri for the Dead Letter error handler.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dead Letter Uri</em>' attribute.
	 * @see #setDeadLetterUri(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDeadLetterChannelDefinition_DeadLetterUri()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='deadLetterUri'"
	 * @generated
	 */
	String getDeadLetterUri();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DeadLetterChannelDefinition#getDeadLetterUri <em>Dead Letter Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dead Letter Uri</em>' attribute.
	 * @see #getDeadLetterUri()
	 * @generated
	 */
	void setDeadLetterUri(String value);

} // DeadLetterChannelDefinition
