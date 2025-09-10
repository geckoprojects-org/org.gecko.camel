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
 * A representation of the model object '<em><b>Convert Variable Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ConvertVariableDefinition#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ConvertVariableDefinition#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ConvertVariableDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ConvertVariableDefinition#getToName <em>To Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ConvertVariableDefinition#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getConvertVariableDefinition()
 * @model extendedMetaData="name='convertVariableDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface ConvertVariableDefinition extends NoOutputDefinition {
	/**
	 * Returns the value of the '<em><b>Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a specific charset when converting.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Charset</em>' attribute.
	 * @see #setCharset(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getConvertVariableDefinition_Charset()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='charset'"
	 * @generated
	 */
	String getCharset();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ConvertVariableDefinition#getCharset <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charset</em>' attribute.
	 * @see #getCharset()
	 * @generated
	 */
	void setCharset(String value);

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * When mandatory then the conversion must return a value (cannot be null), if this is not possible then
	 * NoTypeConversionAvailableException is thrown. Setting this to false could mean conversion is not possible and the value
	 * is null. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getConvertVariableDefinition_Mandatory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mandatory'"
	 * @generated
	 */
	String getMandatory();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ConvertVariableDefinition#getMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #getMandatory()
	 * @generated
	 */
	void setMandatory(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Name of variable to convert its value The simple language can be used to define a dynamic evaluated header name to be
	 * used. Otherwise a constant name will be used.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getConvertVariableDefinition_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ConvertVariableDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>To Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use another variable to store the result. By default, the result is stored in the same variable. This option allows
	 * to use another variable. The simple language can be used to define a dynamic evaluated variable name to be used.
	 * Otherwise a constant name will be used.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Name</em>' attribute.
	 * @see #setToName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getConvertVariableDefinition_ToName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='toName'"
	 * @generated
	 */
	String getToName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ConvertVariableDefinition#getToName <em>To Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Name</em>' attribute.
	 * @see #getToName()
	 * @generated
	 */
	void setToName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The java type to convert to.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getConvertVariableDefinition_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ConvertVariableDefinition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // ConvertVariableDefinition
