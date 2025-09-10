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
 * A representation of the model object '<em><b>Abstract Key Store Parameters Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractKeyStoreParametersFactoryBean#getKeyStore <em>Key Store</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractKeyStoreParametersFactoryBean#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractKeyStoreParametersFactoryBean#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractKeyStoreParametersFactoryBean#getResource <em>Resource</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractKeyStoreParametersFactoryBean#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractKeyStoreParametersFactoryBean()
 * @model abstract="true"
 *        extendedMetaData="name='abstractKeyStoreParametersFactoryBean' kind='empty'"
 * @generated
 */
@ProviderType
public interface AbstractKeyStoreParametersFactoryBean extends AbstractJsseUtilFactoryBean {
	/**
	 * Returns the value of the '<em><b>Key Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To lookup an existing KeyStore instance from the registry, for example for testing and development.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Store</em>' attribute.
	 * @see #setKeyStore(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractKeyStoreParametersFactoryBean_KeyStore()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='keyStore'"
	 * @generated
	 */
	String getKeyStore();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractKeyStoreParametersFactoryBean#getKeyStore <em>Key Store</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Store</em>' attribute.
	 * @see #getKeyStore()
	 * @generated
	 */
	void setKeyStore(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The password for reading/opening/verifying the key store.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractKeyStoreParametersFactoryBean_Password()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='password'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractKeyStoreParametersFactoryBean#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The provider identifier for instantiating the key store.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see #setProvider(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractKeyStoreParametersFactoryBean_Provider()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='provider'"
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractKeyStoreParametersFactoryBean#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(String value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The keystore to load. The keystore is by default loaded from classpath. If you must load from file system, then use
	 * file: as prefix. file:nameOfFile (to refer to the file system) classpath:nameOfFile (to refer to the classpath; default)
	 * http:uri (to load the resource using HTTP) ref:nameOfBean (to lookup an existing KeyStore instance from the registry,
	 * for example for testing and development).
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' attribute.
	 * @see #setResource(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractKeyStoreParametersFactoryBean_Resource()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='resource'"
	 * @generated
	 */
	String getResource();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractKeyStoreParametersFactoryBean#getResource <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' attribute.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The type of the key store to create and load. See
	 * https://docs.oracle.com/en/java/javase/17/docs/specs/security/standard-names.html.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractKeyStoreParametersFactoryBean_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractKeyStoreParametersFactoryBean#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // AbstractKeyStoreParametersFactoryBean
