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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Scan Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ContextScanDefinition#getExcludes <em>Excludes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ContextScanDefinition#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ContextScanDefinition#getIncludeNonSingletons <em>Include Non Singletons</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getContextScanDefinition()
 * @model extendedMetaData="name='contextScanDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ContextScanDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Excludes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Exclude finding route builder from these java package names.
	 * 
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Excludes</em>' attribute list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getContextScanDefinition_Excludes()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='excludes' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getExcludes();

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Include finding route builder from these java package names.
	 * 
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Includes</em>' attribute list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getContextScanDefinition_Includes()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='includes' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getIncludes();

	/**
	 * Returns the value of the '<em><b>Include Non Singletons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to include non-singleton beans (prototypes) By default only singleton beans is included in the context scan.
	 * Default value: false
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Non Singletons</em>' attribute.
	 * @see #setIncludeNonSingletons(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getContextScanDefinition_IncludeNonSingletons()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='includeNonSingletons'"
	 * @generated
	 */
	String getIncludeNonSingletons();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ContextScanDefinition#getIncludeNonSingletons <em>Include Non Singletons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Non Singletons</em>' attribute.
	 * @see #getIncludeNonSingletons()
	 * @generated
	 */
	void setIncludeNonSingletons(String value);

} // ContextScanDefinition
