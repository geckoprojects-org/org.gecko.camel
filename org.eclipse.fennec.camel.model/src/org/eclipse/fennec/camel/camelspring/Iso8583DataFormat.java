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
 * A representation of the model object '<em><b>Iso8583 Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Iso8583DataFormat#getAllowAutoWiredMessageFormat <em>Allow Auto Wired Message Format</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Iso8583DataFormat#getConfigFile <em>Config File</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Iso8583DataFormat#getIsoType <em>Iso Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getIso8583DataFormat()
 * @model extendedMetaData="name='iso8583DataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface Iso8583DataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Allow Auto Wired Message Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to auto-discover com.solab.iso8583.MessageFactory from the registry. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Auto Wired Message Format</em>' attribute.
	 * @see #setAllowAutoWiredMessageFormat(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getIso8583DataFormat_AllowAutoWiredMessageFormat()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowAutoWiredMessageFormat'"
	 * @generated
	 */
	String getAllowAutoWiredMessageFormat();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Iso8583DataFormat#getAllowAutoWiredMessageFormat <em>Allow Auto Wired Message Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Auto Wired Message Format</em>' attribute.
	 * @see #getAllowAutoWiredMessageFormat()
	 * @generated
	 */
	void setAllowAutoWiredMessageFormat(String value);

	/**
	 * Returns the value of the '<em><b>Config File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The j8583 configuration file to load from classpath. Default value: j8583-config.xml
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Config File</em>' attribute.
	 * @see #setConfigFile(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getIso8583DataFormat_ConfigFile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='configFile'"
	 * @generated
	 */
	String getConfigFile();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Iso8583DataFormat#getConfigFile <em>Config File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config File</em>' attribute.
	 * @see #getConfigFile()
	 * @generated
	 */
	void setConfigFile(String value);

	/**
	 * Returns the value of the '<em><b>Iso Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The default ISO-Type to use.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Iso Type</em>' attribute.
	 * @see #setIsoType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getIso8583DataFormat_IsoType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isoType'"
	 * @generated
	 */
	String getIsoType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Iso8583DataFormat#getIsoType <em>Iso Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iso Type</em>' attribute.
	 * @see #getIsoType()
	 * @generated
	 */
	void setIsoType(String value);

} // Iso8583DataFormat
