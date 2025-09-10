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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.camel.camelspring.CachingServiceCallServiceDiscoveryConfiguration;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.CombinedServiceCallServiceDiscoveryConfiguration;
import org.eclipse.fennec.camel.camelspring.ConsulServiceCallServiceDiscoveryConfiguration;
import org.eclipse.fennec.camel.camelspring.DnsServiceCallServiceDiscoveryConfiguration;
import org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration;
import org.eclipse.fennec.camel.camelspring.StaticServiceCallServiceDiscoveryConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combined Service Call Service Discovery Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CombinedServiceCallServiceDiscoveryConfigurationImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CombinedServiceCallServiceDiscoveryConfigurationImpl#getConsulServiceDiscovery <em>Consul Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CombinedServiceCallServiceDiscoveryConfigurationImpl#getDnsServiceDiscovery <em>Dns Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CombinedServiceCallServiceDiscoveryConfigurationImpl#getKubernetesServiceDiscovery <em>Kubernetes Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CombinedServiceCallServiceDiscoveryConfigurationImpl#getStaticServiceDiscovery <em>Static Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CombinedServiceCallServiceDiscoveryConfigurationImpl#getCachingServiceDiscovery <em>Caching Service Discovery</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CombinedServiceCallServiceDiscoveryConfigurationImpl extends ServiceCallServiceDiscoveryConfigurationImpl implements CombinedServiceCallServiceDiscoveryConfiguration {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinedServiceCallServiceDiscoveryConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getCombinedServiceCallServiceDiscoveryConfiguration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConsulServiceCallServiceDiscoveryConfiguration> getConsulServiceDiscovery() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCombinedServiceCallServiceDiscoveryConfiguration_ConsulServiceDiscovery());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DnsServiceCallServiceDiscoveryConfiguration> getDnsServiceDiscovery() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCombinedServiceCallServiceDiscoveryConfiguration_DnsServiceDiscovery());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KubernetesServiceCallServiceDiscoveryConfiguration> getKubernetesServiceDiscovery() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCombinedServiceCallServiceDiscoveryConfiguration_KubernetesServiceDiscovery());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StaticServiceCallServiceDiscoveryConfiguration> getStaticServiceDiscovery() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCombinedServiceCallServiceDiscoveryConfiguration_StaticServiceDiscovery());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CachingServiceCallServiceDiscoveryConfiguration> getCachingServiceDiscovery() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCombinedServiceCallServiceDiscoveryConfiguration_CachingServiceDiscovery());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CONSUL_SERVICE_DISCOVERY:
				return ((InternalEList<?>)getConsulServiceDiscovery()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DNS_SERVICE_DISCOVERY:
				return ((InternalEList<?>)getDnsServiceDiscovery()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__KUBERNETES_SERVICE_DISCOVERY:
				return ((InternalEList<?>)getKubernetesServiceDiscovery()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__STATIC_SERVICE_DISCOVERY:
				return ((InternalEList<?>)getStaticServiceDiscovery()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CACHING_SERVICE_DISCOVERY:
				return ((InternalEList<?>)getCachingServiceDiscovery()).basicRemove(otherEnd, msgs);
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
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CONSUL_SERVICE_DISCOVERY:
				return getConsulServiceDiscovery();
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DNS_SERVICE_DISCOVERY:
				return getDnsServiceDiscovery();
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__KUBERNETES_SERVICE_DISCOVERY:
				return getKubernetesServiceDiscovery();
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__STATIC_SERVICE_DISCOVERY:
				return getStaticServiceDiscovery();
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CACHING_SERVICE_DISCOVERY:
				return getCachingServiceDiscovery();
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
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CONSUL_SERVICE_DISCOVERY:
				getConsulServiceDiscovery().clear();
				getConsulServiceDiscovery().addAll((Collection<? extends ConsulServiceCallServiceDiscoveryConfiguration>)newValue);
				return;
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DNS_SERVICE_DISCOVERY:
				getDnsServiceDiscovery().clear();
				getDnsServiceDiscovery().addAll((Collection<? extends DnsServiceCallServiceDiscoveryConfiguration>)newValue);
				return;
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__KUBERNETES_SERVICE_DISCOVERY:
				getKubernetesServiceDiscovery().clear();
				getKubernetesServiceDiscovery().addAll((Collection<? extends KubernetesServiceCallServiceDiscoveryConfiguration>)newValue);
				return;
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__STATIC_SERVICE_DISCOVERY:
				getStaticServiceDiscovery().clear();
				getStaticServiceDiscovery().addAll((Collection<? extends StaticServiceCallServiceDiscoveryConfiguration>)newValue);
				return;
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CACHING_SERVICE_DISCOVERY:
				getCachingServiceDiscovery().clear();
				getCachingServiceDiscovery().addAll((Collection<? extends CachingServiceCallServiceDiscoveryConfiguration>)newValue);
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
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__GROUP:
				getGroup().clear();
				return;
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CONSUL_SERVICE_DISCOVERY:
				getConsulServiceDiscovery().clear();
				return;
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DNS_SERVICE_DISCOVERY:
				getDnsServiceDiscovery().clear();
				return;
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__KUBERNETES_SERVICE_DISCOVERY:
				getKubernetesServiceDiscovery().clear();
				return;
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__STATIC_SERVICE_DISCOVERY:
				getStaticServiceDiscovery().clear();
				return;
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CACHING_SERVICE_DISCOVERY:
				getCachingServiceDiscovery().clear();
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
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__GROUP:
				return group != null && !group.isEmpty();
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CONSUL_SERVICE_DISCOVERY:
				return !getConsulServiceDiscovery().isEmpty();
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DNS_SERVICE_DISCOVERY:
				return !getDnsServiceDiscovery().isEmpty();
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__KUBERNETES_SERVICE_DISCOVERY:
				return !getKubernetesServiceDiscovery().isEmpty();
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__STATIC_SERVICE_DISCOVERY:
				return !getStaticServiceDiscovery().isEmpty();
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CACHING_SERVICE_DISCOVERY:
				return !getCachingServiceDiscovery().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //CombinedServiceCallServiceDiscoveryConfigurationImpl
