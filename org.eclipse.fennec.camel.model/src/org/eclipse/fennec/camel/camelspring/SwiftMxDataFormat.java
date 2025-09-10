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
 * A representation of the model object '<em><b>Swift Mx Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SwiftMxDataFormat#getReadConfigRef <em>Read Config Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SwiftMxDataFormat#getReadMessageId <em>Read Message Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SwiftMxDataFormat#getWriteConfigRef <em>Write Config Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SwiftMxDataFormat#getWriteInJson <em>Write In Json</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSwiftMxDataFormat()
 * @model extendedMetaData="name='swiftMxDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface SwiftMxDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Read Config Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Refers to a specific configuration to use when unmarshalling an input stream to lookup from the registry.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Config Ref</em>' attribute.
	 * @see #setReadConfigRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSwiftMxDataFormat_ReadConfigRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='readConfigRef'"
	 * @generated
	 */
	String getReadConfigRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SwiftMxDataFormat#getReadConfigRef <em>Read Config Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Config Ref</em>' attribute.
	 * @see #getReadConfigRef()
	 * @generated
	 */
	void setReadConfigRef(String value);

	/**
	 * Returns the value of the '<em><b>Read Message Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The type of MX message to produce when unmarshalling an input stream. If not set, it will be automatically detected from
	 * the namespace used.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Message Id</em>' attribute.
	 * @see #setReadMessageId(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSwiftMxDataFormat_ReadMessageId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='readMessageId'"
	 * @generated
	 */
	String getReadMessageId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SwiftMxDataFormat#getReadMessageId <em>Read Message Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Message Id</em>' attribute.
	 * @see #getReadMessageId()
	 * @generated
	 */
	void setReadMessageId(String value);

	/**
	 * Returns the value of the '<em><b>Write Config Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Refers to a specific configuration to use when marshalling a message to lookup from the registry.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write Config Ref</em>' attribute.
	 * @see #setWriteConfigRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSwiftMxDataFormat_WriteConfigRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='writeConfigRef'"
	 * @generated
	 */
	String getWriteConfigRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SwiftMxDataFormat#getWriteConfigRef <em>Write Config Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Config Ref</em>' attribute.
	 * @see #getWriteConfigRef()
	 * @generated
	 */
	void setWriteConfigRef(String value);

	/**
	 * Returns the value of the '<em><b>Write In Json</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The flag indicating that messages must be marshalled in a JSON format. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write In Json</em>' attribute.
	 * @see #setWriteInJson(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSwiftMxDataFormat_WriteInJson()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='writeInJson'"
	 * @generated
	 */
	String getWriteInJson();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SwiftMxDataFormat#getWriteInJson <em>Write In Json</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write In Json</em>' attribute.
	 * @see #getWriteInJson()
	 * @generated
	 */
	void setWriteInJson(String value);

} // SwiftMxDataFormat
