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
package org.eclipse.fennec.camel.camelspring.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.SecureSocketProtocolsParameters;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secure Socket Protocols Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SecureSocketProtocolsParametersImpl#getSecureSocketProtocol <em>Secure Socket Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecureSocketProtocolsParametersImpl extends MinimalEObjectImpl.Container implements SecureSocketProtocolsParameters {
	/**
	 * The cached value of the '{@link #getSecureSocketProtocol() <em>Secure Socket Protocol</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecureSocketProtocol()
	 * @generated
	 * @ordered
	 */
	protected EList<String> secureSocketProtocol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecureSocketProtocolsParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getSecureSocketProtocolsParameters();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSecureSocketProtocol() {
		if (secureSocketProtocol == null) {
			secureSocketProtocol = new EDataTypeEList<String>(String.class, this, CamelSpringPackage.SECURE_SOCKET_PROTOCOLS_PARAMETERS__SECURE_SOCKET_PROTOCOL);
		}
		return secureSocketProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.SECURE_SOCKET_PROTOCOLS_PARAMETERS__SECURE_SOCKET_PROTOCOL:
				return getSecureSocketProtocol();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CamelSpringPackage.SECURE_SOCKET_PROTOCOLS_PARAMETERS__SECURE_SOCKET_PROTOCOL:
				getSecureSocketProtocol().clear();
				getSecureSocketProtocol().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CamelSpringPackage.SECURE_SOCKET_PROTOCOLS_PARAMETERS__SECURE_SOCKET_PROTOCOL:
				getSecureSocketProtocol().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CamelSpringPackage.SECURE_SOCKET_PROTOCOLS_PARAMETERS__SECURE_SOCKET_PROTOCOL:
				return secureSocketProtocol != null && !secureSocketProtocol.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (secureSocketProtocol: ");
		result.append(secureSocketProtocol);
		result.append(')');
		return result.toString();
	}

} //SecureSocketProtocolsParametersImpl
