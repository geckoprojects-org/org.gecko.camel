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
 * A representation of the model object '<em><b>Trust Managers Parameters Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TrustManagersParametersFactoryBean#getKeyStore <em>Key Store</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTrustManagersParametersFactoryBean()
 * @model extendedMetaData="name='trustManagersParametersFactoryBean' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TrustManagersParametersFactoryBean extends AbstractTrustManagersParametersFactoryBean {
	/**
	 * Returns the value of the '<em><b>Key Store</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Store</em>' containment reference.
	 * @see #setKeyStore(KeyStoreParametersFactoryBean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTrustManagersParametersFactoryBean_KeyStore()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='keyStore' namespace='##targetNamespace'"
	 * @generated
	 */
	KeyStoreParametersFactoryBean getKeyStore();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TrustManagersParametersFactoryBean#getKeyStore <em>Key Store</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Store</em>' containment reference.
	 * @see #getKeyStore()
	 * @generated
	 */
	void setKeyStore(KeyStoreParametersFactoryBean value);

} // TrustManagersParametersFactoryBean
