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
 * A representation of the model object '<em><b>Swift Mt Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SwiftMtDataFormat#getWriteInJson <em>Write In Json</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSwiftMtDataFormat()
 * @model extendedMetaData="name='swiftMtDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface SwiftMtDataFormat extends DataFormat {
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSwiftMtDataFormat_WriteInJson()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='writeInJson'"
	 * @generated
	 */
	String getWriteInJson();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SwiftMtDataFormat#getWriteInJson <em>Write In Json</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write In Json</em>' attribute.
	 * @see #getWriteInJson()
	 * @generated
	 */
	void setWriteInJson(String value);

} // SwiftMtDataFormat
