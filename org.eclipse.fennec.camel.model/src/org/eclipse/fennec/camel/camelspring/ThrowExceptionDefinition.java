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
 * A representation of the model object '<em><b>Throw Exception Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ThrowExceptionDefinition#getExceptionType <em>Exception Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ThrowExceptionDefinition#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ThrowExceptionDefinition#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getThrowExceptionDefinition()
 * @model extendedMetaData="name='throwExceptionDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface ThrowExceptionDefinition extends NoOutputDefinition {
	/**
	 * Returns the value of the '<em><b>Exception Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The class of the exception to create using the message.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception Type</em>' attribute.
	 * @see #setExceptionType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getThrowExceptionDefinition_ExceptionType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='exceptionType'"
	 * @generated
	 */
	String getExceptionType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ThrowExceptionDefinition#getExceptionType <em>Exception Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Type</em>' attribute.
	 * @see #getExceptionType()
	 * @generated
	 */
	void setExceptionType(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To create a new exception instance and use the given message as caused message (supports simple language).
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getThrowExceptionDefinition_Message()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='message'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ThrowExceptionDefinition#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Reference to the exception instance to lookup from the registry to throw.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getThrowExceptionDefinition_Ref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ref'"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ThrowExceptionDefinition#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

} // ThrowExceptionDefinition
