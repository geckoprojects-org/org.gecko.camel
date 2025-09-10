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

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.CustomValidatorDefinition;
import org.eclipse.fennec.camel.camelspring.EndpointValidatorDefinition;
import org.eclipse.fennec.camel.camelspring.PredicateValidatorDefinition;
import org.eclipse.fennec.camel.camelspring.ValidatorsDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validators Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ValidatorsDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ValidatorsDefinitionImpl#getEndpointValidator <em>Endpoint Validator</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ValidatorsDefinitionImpl#getPredicateValidator <em>Predicate Validator</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ValidatorsDefinitionImpl#getCustomValidator <em>Custom Validator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidatorsDefinitionImpl extends MinimalEObjectImpl.Container implements ValidatorsDefinition {
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
	protected ValidatorsDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getValidatorsDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CamelSpringPackage.VALIDATORS_DEFINITION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EndpointValidatorDefinition> getEndpointValidator() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getValidatorsDefinition_EndpointValidator());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PredicateValidatorDefinition> getPredicateValidator() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getValidatorsDefinition_PredicateValidator());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CustomValidatorDefinition> getCustomValidator() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getValidatorsDefinition_CustomValidator());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.VALIDATORS_DEFINITION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.VALIDATORS_DEFINITION__ENDPOINT_VALIDATOR:
				return ((InternalEList<?>)getEndpointValidator()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.VALIDATORS_DEFINITION__PREDICATE_VALIDATOR:
				return ((InternalEList<?>)getPredicateValidator()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.VALIDATORS_DEFINITION__CUSTOM_VALIDATOR:
				return ((InternalEList<?>)getCustomValidator()).basicRemove(otherEnd, msgs);
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
			case CamelSpringPackage.VALIDATORS_DEFINITION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CamelSpringPackage.VALIDATORS_DEFINITION__ENDPOINT_VALIDATOR:
				return getEndpointValidator();
			case CamelSpringPackage.VALIDATORS_DEFINITION__PREDICATE_VALIDATOR:
				return getPredicateValidator();
			case CamelSpringPackage.VALIDATORS_DEFINITION__CUSTOM_VALIDATOR:
				return getCustomValidator();
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
			case CamelSpringPackage.VALIDATORS_DEFINITION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CamelSpringPackage.VALIDATORS_DEFINITION__ENDPOINT_VALIDATOR:
				getEndpointValidator().clear();
				getEndpointValidator().addAll((Collection<? extends EndpointValidatorDefinition>)newValue);
				return;
			case CamelSpringPackage.VALIDATORS_DEFINITION__PREDICATE_VALIDATOR:
				getPredicateValidator().clear();
				getPredicateValidator().addAll((Collection<? extends PredicateValidatorDefinition>)newValue);
				return;
			case CamelSpringPackage.VALIDATORS_DEFINITION__CUSTOM_VALIDATOR:
				getCustomValidator().clear();
				getCustomValidator().addAll((Collection<? extends CustomValidatorDefinition>)newValue);
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
			case CamelSpringPackage.VALIDATORS_DEFINITION__GROUP:
				getGroup().clear();
				return;
			case CamelSpringPackage.VALIDATORS_DEFINITION__ENDPOINT_VALIDATOR:
				getEndpointValidator().clear();
				return;
			case CamelSpringPackage.VALIDATORS_DEFINITION__PREDICATE_VALIDATOR:
				getPredicateValidator().clear();
				return;
			case CamelSpringPackage.VALIDATORS_DEFINITION__CUSTOM_VALIDATOR:
				getCustomValidator().clear();
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
			case CamelSpringPackage.VALIDATORS_DEFINITION__GROUP:
				return group != null && !group.isEmpty();
			case CamelSpringPackage.VALIDATORS_DEFINITION__ENDPOINT_VALIDATOR:
				return !getEndpointValidator().isEmpty();
			case CamelSpringPackage.VALIDATORS_DEFINITION__PREDICATE_VALIDATOR:
				return !getPredicateValidator().isEmpty();
			case CamelSpringPackage.VALIDATORS_DEFINITION__CUSTOM_VALIDATOR:
				return !getCustomValidator().isEmpty();
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

} //ValidatorsDefinitionImpl
