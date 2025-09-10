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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Scan Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ComponentScanDefinition#getBasePackage <em>Base Package</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getComponentScanDefinition()
 * @model extendedMetaData="name='componentScanDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface ComponentScanDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getComponentScanDefinition_BasePackage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='base-package'"
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ComponentScanDefinition#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

} // ComponentScanDefinition
