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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Service Call Service Discovery Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.StaticServiceCallServiceDiscoveryConfiguration#getServers <em>Servers</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getStaticServiceCallServiceDiscoveryConfiguration()
 * @model extendedMetaData="name='staticServiceCallServiceDiscoveryConfiguration' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StaticServiceCallServiceDiscoveryConfiguration extends ServiceCallServiceDiscoveryConfiguration {
	/**
	 * Returns the value of the '<em><b>Servers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the server list. Each entry can be a list of servers separated by comma in the format:
	 * servicehost:port,servicehost2:port,servicehost3:port.
	 * 
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Servers</em>' attribute list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getStaticServiceCallServiceDiscoveryConfiguration_Servers()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='servers' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getServers();

} // StaticServiceCallServiceDiscoveryConfiguration
