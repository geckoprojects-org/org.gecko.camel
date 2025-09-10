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
 * A representation of the model object '<em><b>Camel Property Placeholder Location Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderLocationDefinition#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderLocationDefinition#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderLocationDefinition#getResolver <em>Resolver</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelPropertyPlaceholderLocationDefinition()
 * @model extendedMetaData="name='camelPropertyPlaceholderLocationDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface CamelPropertyPlaceholderLocationDefinition extends IdentifiedType {
	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If the location is optional. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #isSetOptional()
	 * @see #unsetOptional()
	 * @see #setOptional(boolean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelPropertyPlaceholderLocationDefinition_Optional()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='optional'"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderLocationDefinition#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isSetOptional()
	 * @see #unsetOptional()
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderLocationDefinition#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOptional()
	 * @see #isOptional()
	 * @see #setOptional(boolean)
	 * @generated
	 */
	void unsetOptional();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderLocationDefinition#isOptional <em>Optional</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Optional</em>' attribute is set.
	 * @see #unsetOptional()
	 * @see #isOptional()
	 * @see #setOptional(boolean)
	 * @generated
	 */
	boolean isSetOptional();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Property locations to use.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelPropertyPlaceholderLocationDefinition_Path()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='path'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderLocationDefinition#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Resolver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The resolver to use to locate the location. Default value: classpath
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolver</em>' attribute.
	 * @see #setResolver(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelPropertyPlaceholderLocationDefinition_Resolver()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='resolver'"
	 * @generated
	 */
	String getResolver();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderLocationDefinition#getResolver <em>Resolver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolver</em>' attribute.
	 * @see #getResolver()
	 * @generated
	 */
	void setResolver(String value);

} // CamelPropertyPlaceholderLocationDefinition
