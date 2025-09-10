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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.OptionalIdentifiedDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optional Identified Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.OptionalIdentifiedDefinitionImpl#isCustomId <em>Custom Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.OptionalIdentifiedDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.OptionalIdentifiedDefinitionImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OptionalIdentifiedDefinitionImpl extends MinimalEObjectImpl.Container implements OptionalIdentifiedDefinition {
	/**
	 * The default value of the '{@link #isCustomId() <em>Custom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCustomId()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CUSTOM_ID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCustomId() <em>Custom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCustomId()
	 * @generated
	 * @ordered
	 */
	protected boolean customId = CUSTOM_ID_EDEFAULT;

	/**
	 * This is true if the Custom Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean customIdESet;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionalIdentifiedDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getOptionalIdentifiedDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCustomId() {
		return customId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomId(boolean newCustomId) {
		boolean oldCustomId = customId;
		customId = newCustomId;
		boolean oldCustomIdESet = customIdESet;
		customIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.OPTIONAL_IDENTIFIED_DEFINITION__CUSTOM_ID, oldCustomId, customId, !oldCustomIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCustomId() {
		boolean oldCustomId = customId;
		boolean oldCustomIdESet = customIdESet;
		customId = CUSTOM_ID_EDEFAULT;
		customIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.OPTIONAL_IDENTIFIED_DEFINITION__CUSTOM_ID, oldCustomId, CUSTOM_ID_EDEFAULT, oldCustomIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCustomId() {
		return customIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.OPTIONAL_IDENTIFIED_DEFINITION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.OPTIONAL_IDENTIFIED_DEFINITION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.OPTIONAL_IDENTIFIED_DEFINITION__CUSTOM_ID:
				return isCustomId();
			case CamelSpringPackage.OPTIONAL_IDENTIFIED_DEFINITION__DESCRIPTION:
				return getDescription();
			case CamelSpringPackage.OPTIONAL_IDENTIFIED_DEFINITION__ID:
				return getId();
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
			case CamelSpringPackage.OPTIONAL_IDENTIFIED_DEFINITION__CUSTOM_ID:
				setCustomId((Boolean)newValue);
				return;
			case CamelSpringPackage.OPTIONAL_IDENTIFIED_DEFINITION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CamelSpringPackage.OPTIONAL_IDENTIFIED_DEFINITION__ID:
				setId((String)newValue);
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
			case CamelSpringPackage.OPTIONAL_IDENTIFIED_DEFINITION__CUSTOM_ID:
				unsetCustomId();
				return;
			case CamelSpringPackage.OPTIONAL_IDENTIFIED_DEFINITION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CamelSpringPackage.OPTIONAL_IDENTIFIED_DEFINITION__ID:
				setId(ID_EDEFAULT);
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
			case CamelSpringPackage.OPTIONAL_IDENTIFIED_DEFINITION__CUSTOM_ID:
				return isSetCustomId();
			case CamelSpringPackage.OPTIONAL_IDENTIFIED_DEFINITION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CamelSpringPackage.OPTIONAL_IDENTIFIED_DEFINITION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (customId: ");
		if (customIdESet) result.append(customId); else result.append("<unset>");
		result.append(", description: ");
		result.append(description);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //OptionalIdentifiedDefinitionImpl
