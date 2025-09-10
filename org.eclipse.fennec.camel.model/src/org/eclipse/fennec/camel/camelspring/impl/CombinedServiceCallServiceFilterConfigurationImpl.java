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

import org.eclipse.fennec.camel.camelspring.BlacklistServiceCallServiceFilterConfiguration;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.CombinedServiceCallServiceFilterConfiguration;
import org.eclipse.fennec.camel.camelspring.CustomServiceCallServiceFilterConfiguration;
import org.eclipse.fennec.camel.camelspring.HealthyServiceCallServiceFilterConfiguration;
import org.eclipse.fennec.camel.camelspring.PassThroughServiceCallServiceFilterConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combined Service Call Service Filter Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CombinedServiceCallServiceFilterConfigurationImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CombinedServiceCallServiceFilterConfigurationImpl#getBlacklistServiceFilter <em>Blacklist Service Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CombinedServiceCallServiceFilterConfigurationImpl#getCustomServiceFilter <em>Custom Service Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CombinedServiceCallServiceFilterConfigurationImpl#getHealthyServiceFilter <em>Healthy Service Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CombinedServiceCallServiceFilterConfigurationImpl#getPassThroughServiceFilter <em>Pass Through Service Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CombinedServiceCallServiceFilterConfigurationImpl extends ServiceCallServiceFilterConfigurationImpl implements CombinedServiceCallServiceFilterConfiguration {
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
	protected CombinedServiceCallServiceFilterConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getCombinedServiceCallServiceFilterConfiguration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BlacklistServiceCallServiceFilterConfiguration> getBlacklistServiceFilter() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCombinedServiceCallServiceFilterConfiguration_BlacklistServiceFilter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CustomServiceCallServiceFilterConfiguration> getCustomServiceFilter() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCombinedServiceCallServiceFilterConfiguration_CustomServiceFilter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HealthyServiceCallServiceFilterConfiguration> getHealthyServiceFilter() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCombinedServiceCallServiceFilterConfiguration_HealthyServiceFilter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PassThroughServiceCallServiceFilterConfiguration> getPassThroughServiceFilter() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getCombinedServiceCallServiceFilterConfiguration_PassThroughServiceFilter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION__BLACKLIST_SERVICE_FILTER:
				return ((InternalEList<?>)getBlacklistServiceFilter()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION__CUSTOM_SERVICE_FILTER:
				return ((InternalEList<?>)getCustomServiceFilter()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION__HEALTHY_SERVICE_FILTER:
				return ((InternalEList<?>)getHealthyServiceFilter()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION__PASS_THROUGH_SERVICE_FILTER:
				return ((InternalEList<?>)getPassThroughServiceFilter()).basicRemove(otherEnd, msgs);
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
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION__BLACKLIST_SERVICE_FILTER:
				return getBlacklistServiceFilter();
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION__CUSTOM_SERVICE_FILTER:
				return getCustomServiceFilter();
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION__HEALTHY_SERVICE_FILTER:
				return getHealthyServiceFilter();
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION__PASS_THROUGH_SERVICE_FILTER:
				return getPassThroughServiceFilter();
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
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION__BLACKLIST_SERVICE_FILTER:
				getBlacklistServiceFilter().clear();
				getBlacklistServiceFilter().addAll((Collection<? extends BlacklistServiceCallServiceFilterConfiguration>)newValue);
				return;
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION__CUSTOM_SERVICE_FILTER:
				getCustomServiceFilter().clear();
				getCustomServiceFilter().addAll((Collection<? extends CustomServiceCallServiceFilterConfiguration>)newValue);
				return;
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION__HEALTHY_SERVICE_FILTER:
				getHealthyServiceFilter().clear();
				getHealthyServiceFilter().addAll((Collection<? extends HealthyServiceCallServiceFilterConfiguration>)newValue);
				return;
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION__PASS_THROUGH_SERVICE_FILTER:
				getPassThroughServiceFilter().clear();
				getPassThroughServiceFilter().addAll((Collection<? extends PassThroughServiceCallServiceFilterConfiguration>)newValue);
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
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION__GROUP:
				getGroup().clear();
				return;
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION__BLACKLIST_SERVICE_FILTER:
				getBlacklistServiceFilter().clear();
				return;
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION__CUSTOM_SERVICE_FILTER:
				getCustomServiceFilter().clear();
				return;
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION__HEALTHY_SERVICE_FILTER:
				getHealthyServiceFilter().clear();
				return;
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION__PASS_THROUGH_SERVICE_FILTER:
				getPassThroughServiceFilter().clear();
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
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION__GROUP:
				return group != null && !group.isEmpty();
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION__BLACKLIST_SERVICE_FILTER:
				return !getBlacklistServiceFilter().isEmpty();
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION__CUSTOM_SERVICE_FILTER:
				return !getCustomServiceFilter().isEmpty();
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION__HEALTHY_SERVICE_FILTER:
				return !getHealthyServiceFilter().isEmpty();
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION__PASS_THROUGH_SERVICE_FILTER:
				return !getPassThroughServiceFilter().isEmpty();
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

} //CombinedServiceCallServiceFilterConfigurationImpl
