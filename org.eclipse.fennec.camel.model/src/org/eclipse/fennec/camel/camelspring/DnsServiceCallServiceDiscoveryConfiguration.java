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
 * A representation of the model object '<em><b>Dns Service Call Service Discovery Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DnsServiceCallServiceDiscoveryConfiguration#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DnsServiceCallServiceDiscoveryConfiguration#getProto <em>Proto</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDnsServiceCallServiceDiscoveryConfiguration()
 * @model extendedMetaData="name='dnsServiceCallServiceDiscoveryConfiguration' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DnsServiceCallServiceDiscoveryConfiguration extends ServiceCallServiceDiscoveryConfiguration {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The domain name;.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDnsServiceCallServiceDiscoveryConfiguration_Domain()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='domain'"
	 * @generated
	 */
	String getDomain();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DnsServiceCallServiceDiscoveryConfiguration#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(String value);

	/**
	 * Returns the value of the '<em><b>Proto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The transport protocol of the desired service. Default value: _tcp
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Proto</em>' attribute.
	 * @see #setProto(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDnsServiceCallServiceDiscoveryConfiguration_Proto()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='proto'"
	 * @generated
	 */
	String getProto();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DnsServiceCallServiceDiscoveryConfiguration#getProto <em>Proto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proto</em>' attribute.
	 * @see #getProto()
	 * @generated
	 */
	void setProto(String value);

} // DnsServiceCallServiceDiscoveryConfiguration
