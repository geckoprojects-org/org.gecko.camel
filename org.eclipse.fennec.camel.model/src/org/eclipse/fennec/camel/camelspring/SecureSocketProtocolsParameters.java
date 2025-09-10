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
 * A representation of the model object '<em><b>Secure Socket Protocols Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SecureSocketProtocolsParameters#getSecureSocketProtocol <em>Secure Socket Protocol</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSecureSocketProtocolsParameters()
 * @model extendedMetaData="name='secureSocketProtocolsParameters' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SecureSocketProtocolsParameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Secure Socket Protocol</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secure Socket Protocol</em>' attribute list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSecureSocketProtocolsParameters_SecureSocketProtocol()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='secureSocketProtocol' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getSecureSocketProtocol();

} // SecureSocketProtocolsParameters
