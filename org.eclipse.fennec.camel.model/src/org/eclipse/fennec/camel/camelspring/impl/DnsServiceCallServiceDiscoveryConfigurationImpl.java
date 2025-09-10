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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.DnsServiceCallServiceDiscoveryConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dns Service Call Service Discovery Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DnsServiceCallServiceDiscoveryConfigurationImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DnsServiceCallServiceDiscoveryConfigurationImpl#getProto <em>Proto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DnsServiceCallServiceDiscoveryConfigurationImpl extends ServiceCallServiceDiscoveryConfigurationImpl implements DnsServiceCallServiceDiscoveryConfiguration {
	/**
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected String domain = DOMAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getProto() <em>Proto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProto()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProto() <em>Proto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProto()
	 * @generated
	 * @ordered
	 */
	protected String proto = PROTO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DnsServiceCallServiceDiscoveryConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getDnsServiceCallServiceDiscoveryConfiguration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomain(String newDomain) {
		String oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.DNS_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProto() {
		return proto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProto(String newProto) {
		String oldProto = proto;
		proto = newProto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.DNS_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__PROTO, oldProto, proto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.DNS_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DOMAIN:
				return getDomain();
			case CamelSpringPackage.DNS_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__PROTO:
				return getProto();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CamelSpringPackage.DNS_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DOMAIN:
				setDomain((String)newValue);
				return;
			case CamelSpringPackage.DNS_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__PROTO:
				setProto((String)newValue);
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
			case CamelSpringPackage.DNS_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DOMAIN:
				setDomain(DOMAIN_EDEFAULT);
				return;
			case CamelSpringPackage.DNS_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__PROTO:
				setProto(PROTO_EDEFAULT);
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
			case CamelSpringPackage.DNS_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DOMAIN:
				return DOMAIN_EDEFAULT == null ? domain != null : !DOMAIN_EDEFAULT.equals(domain);
			case CamelSpringPackage.DNS_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__PROTO:
				return PROTO_EDEFAULT == null ? proto != null : !PROTO_EDEFAULT.equals(proto);
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
		result.append(" (domain: ");
		result.append(domain);
		result.append(", proto: ");
		result.append(proto);
		result.append(')');
		return result.toString();
	}

} //DnsServiceCallServiceDiscoveryConfigurationImpl
