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
 * A representation of the model object '<em><b>Error Handler Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ErrorHandlerDefinition#getDeadLetterChannel <em>Dead Letter Channel</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ErrorHandlerDefinition#getDefaultErrorHandler <em>Default Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ErrorHandlerDefinition#getNoErrorHandler <em>No Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ErrorHandlerDefinition#getRefErrorHandler <em>Ref Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ErrorHandlerDefinition#getJtaTransactionErrorHandler <em>Jta Transaction Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ErrorHandlerDefinition#getSpringTransactionErrorHandler <em>Spring Transaction Error Handler</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getErrorHandlerDefinition()
 * @model extendedMetaData="name='errorHandlerDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ErrorHandlerDefinition extends IdentifiedType {
	/**
	 * Returns the value of the '<em><b>Dead Letter Channel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Error handler with dead letter queue.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dead Letter Channel</em>' containment reference.
	 * @see #setDeadLetterChannel(DeadLetterChannelDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getErrorHandlerDefinition_DeadLetterChannel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deadLetterChannel' namespace='##targetNamespace'"
	 * @generated
	 */
	DeadLetterChannelDefinition getDeadLetterChannel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ErrorHandlerDefinition#getDeadLetterChannel <em>Dead Letter Channel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dead Letter Channel</em>' containment reference.
	 * @see #getDeadLetterChannel()
	 * @generated
	 */
	void setDeadLetterChannel(DeadLetterChannelDefinition value);

	/**
	 * Returns the value of the '<em><b>Default Error Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The default error handler.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Error Handler</em>' containment reference.
	 * @see #setDefaultErrorHandler(DefaultErrorHandlerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getErrorHandlerDefinition_DefaultErrorHandler()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultErrorHandler' namespace='##targetNamespace'"
	 * @generated
	 */
	DefaultErrorHandlerDefinition getDefaultErrorHandler();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ErrorHandlerDefinition#getDefaultErrorHandler <em>Default Error Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Error Handler</em>' containment reference.
	 * @see #getDefaultErrorHandler()
	 * @generated
	 */
	void setDefaultErrorHandler(DefaultErrorHandlerDefinition value);

	/**
	 * Returns the value of the '<em><b>No Error Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To not use an error handler.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Error Handler</em>' containment reference.
	 * @see #setNoErrorHandler(NoErrorHandlerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getErrorHandlerDefinition_NoErrorHandler()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='noErrorHandler' namespace='##targetNamespace'"
	 * @generated
	 */
	NoErrorHandlerDefinition getNoErrorHandler();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ErrorHandlerDefinition#getNoErrorHandler <em>No Error Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Error Handler</em>' containment reference.
	 * @see #getNoErrorHandler()
	 * @generated
	 */
	void setNoErrorHandler(NoErrorHandlerDefinition value);

	/**
	 * Returns the value of the '<em><b>Ref Error Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * References to an existing or custom error handler.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref Error Handler</em>' containment reference.
	 * @see #setRefErrorHandler(RefErrorHandlerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getErrorHandlerDefinition_RefErrorHandler()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='refErrorHandler' namespace='##targetNamespace'"
	 * @generated
	 */
	RefErrorHandlerDefinition getRefErrorHandler();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ErrorHandlerDefinition#getRefErrorHandler <em>Ref Error Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Error Handler</em>' containment reference.
	 * @see #getRefErrorHandler()
	 * @generated
	 */
	void setRefErrorHandler(RefErrorHandlerDefinition value);

	/**
	 * Returns the value of the '<em><b>Jta Transaction Error Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * JTA based transactional error handler (requires camel-jta).
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jta Transaction Error Handler</em>' containment reference.
	 * @see #setJtaTransactionErrorHandler(JtaTransactionErrorHandlerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getErrorHandlerDefinition_JtaTransactionErrorHandler()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jtaTransactionErrorHandler' namespace='##targetNamespace'"
	 * @generated
	 */
	JtaTransactionErrorHandlerDefinition getJtaTransactionErrorHandler();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ErrorHandlerDefinition#getJtaTransactionErrorHandler <em>Jta Transaction Error Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jta Transaction Error Handler</em>' containment reference.
	 * @see #getJtaTransactionErrorHandler()
	 * @generated
	 */
	void setJtaTransactionErrorHandler(JtaTransactionErrorHandlerDefinition value);

	/**
	 * Returns the value of the '<em><b>Spring Transaction Error Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Spring based transactional error handler (requires camel-spring).
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spring Transaction Error Handler</em>' containment reference.
	 * @see #setSpringTransactionErrorHandler(SpringTransactionErrorHandlerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getErrorHandlerDefinition_SpringTransactionErrorHandler()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='springTransactionErrorHandler' namespace='##targetNamespace'"
	 * @generated
	 */
	SpringTransactionErrorHandlerDefinition getSpringTransactionErrorHandler();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ErrorHandlerDefinition#getSpringTransactionErrorHandler <em>Spring Transaction Error Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spring Transaction Error Handler</em>' containment reference.
	 * @see #getSpringTransactionErrorHandler()
	 * @generated
	 */
	void setSpringTransactionErrorHandler(SpringTransactionErrorHandlerDefinition value);

} // ErrorHandlerDefinition
