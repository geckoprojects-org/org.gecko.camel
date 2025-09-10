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
 * A representation of the model object '<em><b>Smooks Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SmooksDataFormat#getSmooksConfig <em>Smooks Config</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSmooksDataFormat()
 * @model extendedMetaData="name='smooksDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface SmooksDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Smooks Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Path to the Smooks configuration file.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Smooks Config</em>' attribute.
	 * @see #setSmooksConfig(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSmooksDataFormat_SmooksConfig()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='smooksConfig'"
	 * @generated
	 */
	String getSmooksConfig();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SmooksDataFormat#getSmooksConfig <em>Smooks Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smooks Config</em>' attribute.
	 * @see #getSmooksConfig()
	 * @generated
	 */
	void setSmooksConfig(String value);

} // SmooksDataFormat
