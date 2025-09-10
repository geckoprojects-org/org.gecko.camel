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
 * A representation of the model object '<em><b>Lzf Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LzfDataFormat#getUsingParallelCompression <em>Using Parallel Compression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLzfDataFormat()
 * @model extendedMetaData="name='lzfDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface LzfDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Using Parallel Compression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Enable encoding (compress) using multiple processing cores. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Using Parallel Compression</em>' attribute.
	 * @see #setUsingParallelCompression(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLzfDataFormat_UsingParallelCompression()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='usingParallelCompression'"
	 * @generated
	 */
	String getUsingParallelCompression();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LzfDataFormat#getUsingParallelCompression <em>Using Parallel Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Using Parallel Compression</em>' attribute.
	 * @see #getUsingParallelCompression()
	 * @generated
	 */
	void setUsingParallelCompression(String value);

} // LzfDataFormat
