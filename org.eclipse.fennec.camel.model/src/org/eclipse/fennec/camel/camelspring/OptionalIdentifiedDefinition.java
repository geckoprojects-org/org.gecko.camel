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
 * A representation of the model object '<em><b>Optional Identified Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.OptionalIdentifiedDefinition#isCustomId <em>Custom Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.OptionalIdentifiedDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.OptionalIdentifiedDefinition#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getOptionalIdentifiedDefinition()
 * @model abstract="true"
 *        extendedMetaData="name='optionalIdentifiedDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface OptionalIdentifiedDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Id</em>' attribute.
	 * @see #isSetCustomId()
	 * @see #unsetCustomId()
	 * @see #setCustomId(boolean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getOptionalIdentifiedDefinition_CustomId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='customId'"
	 * @generated
	 */
	boolean isCustomId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.OptionalIdentifiedDefinition#isCustomId <em>Custom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Id</em>' attribute.
	 * @see #isSetCustomId()
	 * @see #unsetCustomId()
	 * @see #isCustomId()
	 * @generated
	 */
	void setCustomId(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.OptionalIdentifiedDefinition#isCustomId <em>Custom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCustomId()
	 * @see #isCustomId()
	 * @see #setCustomId(boolean)
	 * @generated
	 */
	void unsetCustomId();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.OptionalIdentifiedDefinition#isCustomId <em>Custom Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Custom Id</em>' attribute is set.
	 * @see #unsetCustomId()
	 * @see #isCustomId()
	 * @see #setCustomId(boolean)
	 * @generated
	 */
	boolean isSetCustomId();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the description of this node.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getOptionalIdentifiedDefinition_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.OptionalIdentifiedDefinition#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the id of this node.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getOptionalIdentifiedDefinition_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.OptionalIdentifiedDefinition#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // OptionalIdentifiedDefinition
