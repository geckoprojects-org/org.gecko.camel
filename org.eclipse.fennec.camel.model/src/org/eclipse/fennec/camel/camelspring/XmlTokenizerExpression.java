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
 * A representation of the model object '<em><b>Xml Tokenizer Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.XmlTokenizerExpression#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.XmlTokenizerExpression#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXmlTokenizerExpression()
 * @model extendedMetaData="name='xmlTokenizerExpression' kind='simple'"
 * @generated
 */
@ProviderType
public interface XmlTokenizerExpression extends NamespaceAwareExpression {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To group N parts together.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXmlTokenizerExpression_Group()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='group'"
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.XmlTokenizerExpression#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The extraction mode. The available extraction modes are: i - injecting the contextual namespace bindings into the
	 * extracted token (default) w - wrapping the extracted token in its ancestor context u - unwrapping the extracted token to
	 * its child content t - extracting the text content of the specified element. Default value: i
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #setMode(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXmlTokenizerExpression_Mode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mode'"
	 * @generated
	 */
	String getMode();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.XmlTokenizerExpression#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(String value);

} // XmlTokenizerExpression
