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
 * A representation of the model object '<em><b>Fory Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ForyDataFormat#getAllowAutoWiredFory <em>Allow Auto Wired Fory</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ForyDataFormat#getRequireClassRegistration <em>Require Class Registration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ForyDataFormat#getThreadSafe <em>Thread Safe</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ForyDataFormat#getUnmarshalType <em>Unmarshal Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getForyDataFormat()
 * @model extendedMetaData="name='foryDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface ForyDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Allow Auto Wired Fory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to auto-discover Fory from the registry. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Auto Wired Fory</em>' attribute.
	 * @see #setAllowAutoWiredFory(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getForyDataFormat_AllowAutoWiredFory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowAutoWiredFory'"
	 * @generated
	 */
	String getAllowAutoWiredFory();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ForyDataFormat#getAllowAutoWiredFory <em>Allow Auto Wired Fory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Auto Wired Fory</em>' attribute.
	 * @see #getAllowAutoWiredFory()
	 * @generated
	 */
	void setAllowAutoWiredFory(String value);

	/**
	 * Returns the value of the '<em><b>Require Class Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to require register classes. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Require Class Registration</em>' attribute.
	 * @see #setRequireClassRegistration(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getForyDataFormat_RequireClassRegistration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='requireClassRegistration'"
	 * @generated
	 */
	String getRequireClassRegistration();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ForyDataFormat#getRequireClassRegistration <em>Require Class Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Class Registration</em>' attribute.
	 * @see #getRequireClassRegistration()
	 * @generated
	 */
	void setRequireClassRegistration(String value);

	/**
	 * Returns the value of the '<em><b>Thread Safe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to use the threadsafe Fory. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thread Safe</em>' attribute.
	 * @see #setThreadSafe(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getForyDataFormat_ThreadSafe()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='threadSafe'"
	 * @generated
	 */
	String getThreadSafe();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ForyDataFormat#getThreadSafe <em>Thread Safe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Safe</em>' attribute.
	 * @see #getThreadSafe()
	 * @generated
	 */
	void setThreadSafe(String value);

	/**
	 * Returns the value of the '<em><b>Unmarshal Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Class of the java type to use when unmarshalling.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unmarshal Type</em>' attribute.
	 * @see #setUnmarshalType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getForyDataFormat_UnmarshalType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='unmarshalType'"
	 * @generated
	 */
	String getUnmarshalType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ForyDataFormat#getUnmarshalType <em>Unmarshal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unmarshal Type</em>' attribute.
	 * @see #getUnmarshalType()
	 * @generated
	 */
	void setUnmarshalType(String value);

} // ForyDataFormat
