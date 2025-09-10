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
 * A representation of the model object '<em><b>Zip Deflater Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ZipDeflaterDataFormat#getCompressionLevel <em>Compression Level</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getZipDeflaterDataFormat()
 * @model extendedMetaData="name='zipDeflaterDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface ZipDeflaterDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Compression Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To specify a specific compression between 0-9. -1 is default compression, 0 is no compression, and 9 is the best
	 * compression. Default value: -1
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compression Level</em>' attribute.
	 * @see #setCompressionLevel(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getZipDeflaterDataFormat_CompressionLevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='compressionLevel'"
	 * @generated
	 */
	String getCompressionLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ZipDeflaterDataFormat#getCompressionLevel <em>Compression Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression Level</em>' attribute.
	 * @see #getCompressionLevel()
	 * @generated
	 */
	void setCompressionLevel(String value);

} // ZipDeflaterDataFormat
