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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.camel.camelspring.CachingServiceCallServiceDiscoveryConfiguration;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.CombinedServiceCallServiceDiscoveryConfiguration;
import org.eclipse.fennec.camel.camelspring.ConsulServiceCallServiceDiscoveryConfiguration;
import org.eclipse.fennec.camel.camelspring.DnsServiceCallServiceDiscoveryConfiguration;
import org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration;
import org.eclipse.fennec.camel.camelspring.StaticServiceCallServiceDiscoveryConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Caching Service Call Service Discovery Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CachingServiceCallServiceDiscoveryConfigurationImpl#getConsulServiceDiscovery <em>Consul Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CachingServiceCallServiceDiscoveryConfigurationImpl#getDnsServiceDiscovery <em>Dns Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CachingServiceCallServiceDiscoveryConfigurationImpl#getKubernetesServiceDiscovery <em>Kubernetes Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CachingServiceCallServiceDiscoveryConfigurationImpl#getCombinedServiceDiscovery <em>Combined Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CachingServiceCallServiceDiscoveryConfigurationImpl#getStaticServiceDiscovery <em>Static Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CachingServiceCallServiceDiscoveryConfigurationImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CachingServiceCallServiceDiscoveryConfigurationImpl#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CachingServiceCallServiceDiscoveryConfigurationImpl extends ServiceCallServiceDiscoveryConfigurationImpl implements CachingServiceCallServiceDiscoveryConfiguration {
	/**
	 * The cached value of the '{@link #getConsulServiceDiscovery() <em>Consul Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsulServiceDiscovery()
	 * @generated
	 * @ordered
	 */
	protected ConsulServiceCallServiceDiscoveryConfiguration consulServiceDiscovery;

	/**
	 * The cached value of the '{@link #getDnsServiceDiscovery() <em>Dns Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDnsServiceDiscovery()
	 * @generated
	 * @ordered
	 */
	protected DnsServiceCallServiceDiscoveryConfiguration dnsServiceDiscovery;

	/**
	 * The cached value of the '{@link #getKubernetesServiceDiscovery() <em>Kubernetes Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKubernetesServiceDiscovery()
	 * @generated
	 * @ordered
	 */
	protected KubernetesServiceCallServiceDiscoveryConfiguration kubernetesServiceDiscovery;

	/**
	 * The cached value of the '{@link #getCombinedServiceDiscovery() <em>Combined Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinedServiceDiscovery()
	 * @generated
	 * @ordered
	 */
	protected CombinedServiceCallServiceDiscoveryConfiguration combinedServiceDiscovery;

	/**
	 * The cached value of the '{@link #getStaticServiceDiscovery() <em>Static Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticServiceDiscovery()
	 * @generated
	 * @ordered
	 */
	protected StaticServiceCallServiceDiscoveryConfiguration staticServiceDiscovery;

	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected String timeout = TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected static final String UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected String units = UNITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachingServiceCallServiceDiscoveryConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getCachingServiceCallServiceDiscoveryConfiguration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsulServiceCallServiceDiscoveryConfiguration getConsulServiceDiscovery() {
		return consulServiceDiscovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsulServiceDiscovery(ConsulServiceCallServiceDiscoveryConfiguration newConsulServiceDiscovery, NotificationChain msgs) {
		ConsulServiceCallServiceDiscoveryConfiguration oldConsulServiceDiscovery = consulServiceDiscovery;
		consulServiceDiscovery = newConsulServiceDiscovery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CONSUL_SERVICE_DISCOVERY, oldConsulServiceDiscovery, newConsulServiceDiscovery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsulServiceDiscovery(ConsulServiceCallServiceDiscoveryConfiguration newConsulServiceDiscovery) {
		if (newConsulServiceDiscovery != consulServiceDiscovery) {
			NotificationChain msgs = null;
			if (consulServiceDiscovery != null)
				msgs = ((InternalEObject)consulServiceDiscovery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CONSUL_SERVICE_DISCOVERY, null, msgs);
			if (newConsulServiceDiscovery != null)
				msgs = ((InternalEObject)newConsulServiceDiscovery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CONSUL_SERVICE_DISCOVERY, null, msgs);
			msgs = basicSetConsulServiceDiscovery(newConsulServiceDiscovery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CONSUL_SERVICE_DISCOVERY, newConsulServiceDiscovery, newConsulServiceDiscovery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DnsServiceCallServiceDiscoveryConfiguration getDnsServiceDiscovery() {
		return dnsServiceDiscovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDnsServiceDiscovery(DnsServiceCallServiceDiscoveryConfiguration newDnsServiceDiscovery, NotificationChain msgs) {
		DnsServiceCallServiceDiscoveryConfiguration oldDnsServiceDiscovery = dnsServiceDiscovery;
		dnsServiceDiscovery = newDnsServiceDiscovery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DNS_SERVICE_DISCOVERY, oldDnsServiceDiscovery, newDnsServiceDiscovery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDnsServiceDiscovery(DnsServiceCallServiceDiscoveryConfiguration newDnsServiceDiscovery) {
		if (newDnsServiceDiscovery != dnsServiceDiscovery) {
			NotificationChain msgs = null;
			if (dnsServiceDiscovery != null)
				msgs = ((InternalEObject)dnsServiceDiscovery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DNS_SERVICE_DISCOVERY, null, msgs);
			if (newDnsServiceDiscovery != null)
				msgs = ((InternalEObject)newDnsServiceDiscovery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DNS_SERVICE_DISCOVERY, null, msgs);
			msgs = basicSetDnsServiceDiscovery(newDnsServiceDiscovery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DNS_SERVICE_DISCOVERY, newDnsServiceDiscovery, newDnsServiceDiscovery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KubernetesServiceCallServiceDiscoveryConfiguration getKubernetesServiceDiscovery() {
		return kubernetesServiceDiscovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKubernetesServiceDiscovery(KubernetesServiceCallServiceDiscoveryConfiguration newKubernetesServiceDiscovery, NotificationChain msgs) {
		KubernetesServiceCallServiceDiscoveryConfiguration oldKubernetesServiceDiscovery = kubernetesServiceDiscovery;
		kubernetesServiceDiscovery = newKubernetesServiceDiscovery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__KUBERNETES_SERVICE_DISCOVERY, oldKubernetesServiceDiscovery, newKubernetesServiceDiscovery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKubernetesServiceDiscovery(KubernetesServiceCallServiceDiscoveryConfiguration newKubernetesServiceDiscovery) {
		if (newKubernetesServiceDiscovery != kubernetesServiceDiscovery) {
			NotificationChain msgs = null;
			if (kubernetesServiceDiscovery != null)
				msgs = ((InternalEObject)kubernetesServiceDiscovery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__KUBERNETES_SERVICE_DISCOVERY, null, msgs);
			if (newKubernetesServiceDiscovery != null)
				msgs = ((InternalEObject)newKubernetesServiceDiscovery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__KUBERNETES_SERVICE_DISCOVERY, null, msgs);
			msgs = basicSetKubernetesServiceDiscovery(newKubernetesServiceDiscovery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__KUBERNETES_SERVICE_DISCOVERY, newKubernetesServiceDiscovery, newKubernetesServiceDiscovery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CombinedServiceCallServiceDiscoveryConfiguration getCombinedServiceDiscovery() {
		return combinedServiceDiscovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCombinedServiceDiscovery(CombinedServiceCallServiceDiscoveryConfiguration newCombinedServiceDiscovery, NotificationChain msgs) {
		CombinedServiceCallServiceDiscoveryConfiguration oldCombinedServiceDiscovery = combinedServiceDiscovery;
		combinedServiceDiscovery = newCombinedServiceDiscovery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__COMBINED_SERVICE_DISCOVERY, oldCombinedServiceDiscovery, newCombinedServiceDiscovery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCombinedServiceDiscovery(CombinedServiceCallServiceDiscoveryConfiguration newCombinedServiceDiscovery) {
		if (newCombinedServiceDiscovery != combinedServiceDiscovery) {
			NotificationChain msgs = null;
			if (combinedServiceDiscovery != null)
				msgs = ((InternalEObject)combinedServiceDiscovery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__COMBINED_SERVICE_DISCOVERY, null, msgs);
			if (newCombinedServiceDiscovery != null)
				msgs = ((InternalEObject)newCombinedServiceDiscovery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__COMBINED_SERVICE_DISCOVERY, null, msgs);
			msgs = basicSetCombinedServiceDiscovery(newCombinedServiceDiscovery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__COMBINED_SERVICE_DISCOVERY, newCombinedServiceDiscovery, newCombinedServiceDiscovery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaticServiceCallServiceDiscoveryConfiguration getStaticServiceDiscovery() {
		return staticServiceDiscovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaticServiceDiscovery(StaticServiceCallServiceDiscoveryConfiguration newStaticServiceDiscovery, NotificationChain msgs) {
		StaticServiceCallServiceDiscoveryConfiguration oldStaticServiceDiscovery = staticServiceDiscovery;
		staticServiceDiscovery = newStaticServiceDiscovery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__STATIC_SERVICE_DISCOVERY, oldStaticServiceDiscovery, newStaticServiceDiscovery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStaticServiceDiscovery(StaticServiceCallServiceDiscoveryConfiguration newStaticServiceDiscovery) {
		if (newStaticServiceDiscovery != staticServiceDiscovery) {
			NotificationChain msgs = null;
			if (staticServiceDiscovery != null)
				msgs = ((InternalEObject)staticServiceDiscovery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__STATIC_SERVICE_DISCOVERY, null, msgs);
			if (newStaticServiceDiscovery != null)
				msgs = ((InternalEObject)newStaticServiceDiscovery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__STATIC_SERVICE_DISCOVERY, null, msgs);
			msgs = basicSetStaticServiceDiscovery(newStaticServiceDiscovery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__STATIC_SERVICE_DISCOVERY, newStaticServiceDiscovery, newStaticServiceDiscovery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeout(String newTimeout) {
		String oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnits() {
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnits(String newUnits) {
		String oldUnits = units;
		units = newUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__UNITS, oldUnits, units));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CONSUL_SERVICE_DISCOVERY:
				return basicSetConsulServiceDiscovery(null, msgs);
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DNS_SERVICE_DISCOVERY:
				return basicSetDnsServiceDiscovery(null, msgs);
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__KUBERNETES_SERVICE_DISCOVERY:
				return basicSetKubernetesServiceDiscovery(null, msgs);
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__COMBINED_SERVICE_DISCOVERY:
				return basicSetCombinedServiceDiscovery(null, msgs);
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__STATIC_SERVICE_DISCOVERY:
				return basicSetStaticServiceDiscovery(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CONSUL_SERVICE_DISCOVERY:
				return getConsulServiceDiscovery();
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DNS_SERVICE_DISCOVERY:
				return getDnsServiceDiscovery();
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__KUBERNETES_SERVICE_DISCOVERY:
				return getKubernetesServiceDiscovery();
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__COMBINED_SERVICE_DISCOVERY:
				return getCombinedServiceDiscovery();
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__STATIC_SERVICE_DISCOVERY:
				return getStaticServiceDiscovery();
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__TIMEOUT:
				return getTimeout();
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__UNITS:
				return getUnits();
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
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CONSUL_SERVICE_DISCOVERY:
				setConsulServiceDiscovery((ConsulServiceCallServiceDiscoveryConfiguration)newValue);
				return;
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DNS_SERVICE_DISCOVERY:
				setDnsServiceDiscovery((DnsServiceCallServiceDiscoveryConfiguration)newValue);
				return;
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__KUBERNETES_SERVICE_DISCOVERY:
				setKubernetesServiceDiscovery((KubernetesServiceCallServiceDiscoveryConfiguration)newValue);
				return;
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__COMBINED_SERVICE_DISCOVERY:
				setCombinedServiceDiscovery((CombinedServiceCallServiceDiscoveryConfiguration)newValue);
				return;
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__STATIC_SERVICE_DISCOVERY:
				setStaticServiceDiscovery((StaticServiceCallServiceDiscoveryConfiguration)newValue);
				return;
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__TIMEOUT:
				setTimeout((String)newValue);
				return;
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__UNITS:
				setUnits((String)newValue);
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
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CONSUL_SERVICE_DISCOVERY:
				setConsulServiceDiscovery((ConsulServiceCallServiceDiscoveryConfiguration)null);
				return;
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DNS_SERVICE_DISCOVERY:
				setDnsServiceDiscovery((DnsServiceCallServiceDiscoveryConfiguration)null);
				return;
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__KUBERNETES_SERVICE_DISCOVERY:
				setKubernetesServiceDiscovery((KubernetesServiceCallServiceDiscoveryConfiguration)null);
				return;
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__COMBINED_SERVICE_DISCOVERY:
				setCombinedServiceDiscovery((CombinedServiceCallServiceDiscoveryConfiguration)null);
				return;
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__STATIC_SERVICE_DISCOVERY:
				setStaticServiceDiscovery((StaticServiceCallServiceDiscoveryConfiguration)null);
				return;
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
				return;
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__UNITS:
				setUnits(UNITS_EDEFAULT);
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
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CONSUL_SERVICE_DISCOVERY:
				return consulServiceDiscovery != null;
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DNS_SERVICE_DISCOVERY:
				return dnsServiceDiscovery != null;
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__KUBERNETES_SERVICE_DISCOVERY:
				return kubernetesServiceDiscovery != null;
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__COMBINED_SERVICE_DISCOVERY:
				return combinedServiceDiscovery != null;
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__STATIC_SERVICE_DISCOVERY:
				return staticServiceDiscovery != null;
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__TIMEOUT:
				return TIMEOUT_EDEFAULT == null ? timeout != null : !TIMEOUT_EDEFAULT.equals(timeout);
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__UNITS:
				return UNITS_EDEFAULT == null ? units != null : !UNITS_EDEFAULT.equals(units);
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
		result.append(" (timeout: ");
		result.append(timeout);
		result.append(", units: ");
		result.append(units);
		result.append(')');
		return result.toString();
	}

} //CachingServiceCallServiceDiscoveryConfigurationImpl
