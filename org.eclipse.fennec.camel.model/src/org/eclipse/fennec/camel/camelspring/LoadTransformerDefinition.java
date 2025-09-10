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
 * A representation of the model object '<em><b>Load Transformer Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoadTransformerDefinition#getDefaults <em>Defaults</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LoadTransformerDefinition#getPackageScan <em>Package Scan</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoadTransformerDefinition()
 * @model extendedMetaData="name='loadTransformerDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface LoadTransformerDefinition extends Transformer {
	/**
	 * Returns the value of the '<em><b>Defaults</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Enable loading of default transformers. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Defaults</em>' attribute.
	 * @see #setDefaults(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoadTransformerDefinition_Defaults()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='defaults'"
	 * @generated
	 */
	String getDefaults();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoadTransformerDefinition#getDefaults <em>Defaults</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defaults</em>' attribute.
	 * @see #getDefaults()
	 * @generated
	 */
	void setDefaults(String value);

	/**
	 * Returns the value of the '<em><b>Package Scan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Set the classpath location to scan for annotated transformers.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Scan</em>' attribute.
	 * @see #setPackageScan(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLoadTransformerDefinition_PackageScan()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='packageScan'"
	 * @generated
	 */
	String getPackageScan();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LoadTransformerDefinition#getPackageScan <em>Package Scan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Scan</em>' attribute.
	 * @see #getPackageScan()
	 * @generated
	 */
	void setPackageScan(String value);

} // LoadTransformerDefinition
