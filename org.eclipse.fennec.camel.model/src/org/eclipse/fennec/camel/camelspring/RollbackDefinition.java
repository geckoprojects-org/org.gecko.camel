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
 * A representation of the model object '<em><b>Rollback Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RollbackDefinition#getMarkRollbackOnly <em>Mark Rollback Only</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RollbackDefinition#getMarkRollbackOnlyLast <em>Mark Rollback Only Last</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RollbackDefinition#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRollbackDefinition()
 * @model extendedMetaData="name='rollbackDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface RollbackDefinition extends NoOutputDefinition {
	/**
	 * Returns the value of the '<em><b>Mark Rollback Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Mark the transaction for rollback only (cannot be overruled to commit). Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mark Rollback Only</em>' attribute.
	 * @see #setMarkRollbackOnly(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRollbackDefinition_MarkRollbackOnly()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='markRollbackOnly'"
	 * @generated
	 */
	String getMarkRollbackOnly();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RollbackDefinition#getMarkRollbackOnly <em>Mark Rollback Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mark Rollback Only</em>' attribute.
	 * @see #getMarkRollbackOnly()
	 * @generated
	 */
	void setMarkRollbackOnly(String value);

	/**
	 * Returns the value of the '<em><b>Mark Rollback Only Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Mark only last sub transaction for rollback only. When using sub transactions (if the transaction manager support this).
	 * Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mark Rollback Only Last</em>' attribute.
	 * @see #setMarkRollbackOnlyLast(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRollbackDefinition_MarkRollbackOnlyLast()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='markRollbackOnlyLast'"
	 * @generated
	 */
	String getMarkRollbackOnlyLast();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RollbackDefinition#getMarkRollbackOnlyLast <em>Mark Rollback Only Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mark Rollback Only Last</em>' attribute.
	 * @see #getMarkRollbackOnlyLast()
	 * @generated
	 */
	void setMarkRollbackOnlyLast(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Message to use in rollback exception.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRollbackDefinition_Message()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='message'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RollbackDefinition#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

} // RollbackDefinition
