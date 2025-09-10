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
 * A representation of the model object '<em><b>Transaction Error Handler Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactionErrorHandlerDefinition#getRollbackLoggingLevel <em>Rollback Logging Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransactionErrorHandlerDefinition#getTransactedPolicyRef <em>Transacted Policy Ref</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactionErrorHandlerDefinition()
 * @model abstract="true"
 *        extendedMetaData="name='transactionErrorHandlerDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TransactionErrorHandlerDefinition extends DefaultErrorHandlerDefinition {
	/**
	 * Returns the value of the '<em><b>Rollback Logging Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the logging level to use for logging transactional rollback. This option is default WARN. Default value: WARN
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rollback Logging Level</em>' attribute.
	 * @see #setRollbackLoggingLevel(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactionErrorHandlerDefinition_RollbackLoggingLevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='rollbackLoggingLevel'"
	 * @generated
	 */
	String getRollbackLoggingLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TransactionErrorHandlerDefinition#getRollbackLoggingLevel <em>Rollback Logging Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rollback Logging Level</em>' attribute.
	 * @see #getRollbackLoggingLevel()
	 * @generated
	 */
	void setRollbackLoggingLevel(String value);

	/**
	 * Returns the value of the '<em><b>Transacted Policy Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The transacted policy to use that is configured for either Spring or JTA based transactions. If no policy has been
	 * configured then Camel will attempt to auto-discover.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transacted Policy Ref</em>' attribute.
	 * @see #setTransactedPolicyRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransactionErrorHandlerDefinition_TransactedPolicyRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='transactedPolicyRef'"
	 * @generated
	 */
	String getTransactedPolicyRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TransactionErrorHandlerDefinition#getTransactedPolicyRef <em>Transacted Policy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transacted Policy Ref</em>' attribute.
	 * @see #getTransactedPolicyRef()
	 * @generated
	 */
	void setTransactedPolicyRef(String value);

} // TransactionErrorHandlerDefinition
