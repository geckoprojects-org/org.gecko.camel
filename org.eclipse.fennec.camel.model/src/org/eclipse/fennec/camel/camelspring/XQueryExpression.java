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
 * A representation of the model object '<em><b>XQuery Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.XQueryExpression#getConfigurationRef <em>Configuration Ref</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXQueryExpression()
 * @model extendedMetaData="name='xQueryExpression' kind='simple'"
 * @generated
 */
@ProviderType
public interface XQueryExpression extends NamespaceAwareExpression {
	/**
	 * Returns the value of the '<em><b>Configuration Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Reference to a saxon configuration instance in the registry to use for xquery (requires camel-saxon). This may be needed
	 * to add custom functions to a saxon configuration, so these custom functions can be used in xquery expressions.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration Ref</em>' attribute.
	 * @see #setConfigurationRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXQueryExpression_ConfigurationRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='configurationRef'"
	 * @generated
	 */
	String getConfigurationRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.XQueryExpression#getConfigurationRef <em>Configuration Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Ref</em>' attribute.
	 * @see #getConfigurationRef()
	 * @generated
	 */
	void setConfigurationRef(String value);

} // XQueryExpression
