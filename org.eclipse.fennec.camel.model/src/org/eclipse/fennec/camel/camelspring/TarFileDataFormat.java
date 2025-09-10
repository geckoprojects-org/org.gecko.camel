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
 * A representation of the model object '<em><b>Tar File Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TarFileDataFormat#getAllowEmptyDirectory <em>Allow Empty Directory</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TarFileDataFormat#getMaxDecompressedSize <em>Max Decompressed Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TarFileDataFormat#getPreservePathElements <em>Preserve Path Elements</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TarFileDataFormat#getUsingIterator <em>Using Iterator</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTarFileDataFormat()
 * @model extendedMetaData="name='tarFileDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface TarFileDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Allow Empty Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If the tar file has more than one entry, setting this option to true, allows to get the iterator even if the directory
	 * is empty. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Empty Directory</em>' attribute.
	 * @see #setAllowEmptyDirectory(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTarFileDataFormat_AllowEmptyDirectory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowEmptyDirectory'"
	 * @generated
	 */
	String getAllowEmptyDirectory();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TarFileDataFormat#getAllowEmptyDirectory <em>Allow Empty Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Empty Directory</em>' attribute.
	 * @see #getAllowEmptyDirectory()
	 * @generated
	 */
	void setAllowEmptyDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Max Decompressed Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Set the maximum decompressed size of a tar file (in bytes). The default value if not specified corresponds to 1
	 * gigabyte. An IOException will be thrown if the decompressed size exceeds this amount. Set to -1 to disable setting a
	 * maximum decompressed size. Default value: 1073741824
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Decompressed Size</em>' attribute.
	 * @see #setMaxDecompressedSize(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTarFileDataFormat_MaxDecompressedSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='maxDecompressedSize'"
	 * @generated
	 */
	String getMaxDecompressedSize();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TarFileDataFormat#getMaxDecompressedSize <em>Max Decompressed Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Decompressed Size</em>' attribute.
	 * @see #getMaxDecompressedSize()
	 * @generated
	 */
	void setMaxDecompressedSize(String value);

	/**
	 * Returns the value of the '<em><b>Preserve Path Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If the file name contains path elements, setting this option to true, allows the path to be maintained in the tar file.
	 * Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preserve Path Elements</em>' attribute.
	 * @see #setPreservePathElements(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTarFileDataFormat_PreservePathElements()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='preservePathElements'"
	 * @generated
	 */
	String getPreservePathElements();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TarFileDataFormat#getPreservePathElements <em>Preserve Path Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preserve Path Elements</em>' attribute.
	 * @see #getPreservePathElements()
	 * @generated
	 */
	void setPreservePathElements(String value);

	/**
	 * Returns the value of the '<em><b>Using Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If the tar file has more than one entry, the setting this option to true, allows working with the splitter EIP, to split
	 * the data using an iterator in a streaming mode. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Using Iterator</em>' attribute.
	 * @see #setUsingIterator(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTarFileDataFormat_UsingIterator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='usingIterator'"
	 * @generated
	 */
	String getUsingIterator();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TarFileDataFormat#getUsingIterator <em>Using Iterator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Using Iterator</em>' attribute.
	 * @see #getUsingIterator()
	 * @generated
	 */
	void setUsingIterator(String value);

} // TarFileDataFormat
