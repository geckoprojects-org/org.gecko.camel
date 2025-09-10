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
 * A representation of the model object '<em><b>Remove Headers Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RemoveHeadersDefinition#getExcludePattern <em>Exclude Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RemoveHeadersDefinition#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRemoveHeadersDefinition()
 * @model extendedMetaData="name='removeHeadersDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface RemoveHeadersDefinition extends NoOutputDefinition {
	/**
	 * Returns the value of the '<em><b>Exclude Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Name or patter of headers to not remove. The pattern is matched in the following order: 1 = exact match 2 = wildcard
	 * (pattern ends with a and the name starts with the pattern) 3 = regular expression (all of above is case in-sensitive).
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude Pattern</em>' attribute.
	 * @see #setExcludePattern(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRemoveHeadersDefinition_ExcludePattern()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='excludePattern'"
	 * @generated
	 */
	String getExcludePattern();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RemoveHeadersDefinition#getExcludePattern <em>Exclude Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Pattern</em>' attribute.
	 * @see #getExcludePattern()
	 * @generated
	 */
	void setExcludePattern(String value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Name or pattern of headers to remove. The pattern is matched in the following order: 1 = exact match 2 = wildcard
	 * (pattern ends with a and the name starts with the pattern) 3 = regular expression (all of above is case in-sensitive).
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRemoveHeadersDefinition_Pattern()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='pattern'"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RemoveHeadersDefinition#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

} // RemoveHeadersDefinition
