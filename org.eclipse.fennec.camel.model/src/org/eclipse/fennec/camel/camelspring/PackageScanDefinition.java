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
 * A representation of the model object '<em><b>Package Scan Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.PackageScanDefinition#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.PackageScanDefinition#getExcludes <em>Excludes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.PackageScanDefinition#getIncludes <em>Includes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getPackageScanDefinition()
 * @model extendedMetaData="name='packageScanDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PackageScanDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the java package names to use for scanning for route builder classes.
	 * 
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package</em>' attribute list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getPackageScanDefinition_Package()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='package' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getPackage();

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getPackageScanDefinition_Excludes()
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getPackageScanDefinition_Includes()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='includes' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getIncludes();

} // PackageScanDefinition
