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

import org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderLocationDefinition;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Property Placeholder Location Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelPropertyPlaceholderLocationDefinitionImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelPropertyPlaceholderLocationDefinitionImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelPropertyPlaceholderLocationDefinitionImpl#getResolver <em>Resolver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CamelPropertyPlaceholderLocationDefinitionImpl extends IdentifiedTypeImpl implements CamelPropertyPlaceholderLocationDefinition {
	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * This is true if the Optional attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean optionalESet;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolver() <em>Resolver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolver()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOLVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolver() <em>Resolver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolver()
	 * @generated
	 * @ordered
	 */
	protected String resolver = RESOLVER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CamelPropertyPlaceholderLocationDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getCamelPropertyPlaceholderLocationDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		boolean oldOptionalESet = optionalESet;
		optionalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_LOCATION_DEFINITION__OPTIONAL, oldOptional, optional, !oldOptionalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOptional() {
		boolean oldOptional = optional;
		boolean oldOptionalESet = optionalESet;
		optional = OPTIONAL_EDEFAULT;
		optionalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_LOCATION_DEFINITION__OPTIONAL, oldOptional, OPTIONAL_EDEFAULT, oldOptionalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOptional() {
		return optionalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_LOCATION_DEFINITION__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResolver() {
		return resolver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResolver(String newResolver) {
		String oldResolver = resolver;
		resolver = newResolver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_LOCATION_DEFINITION__RESOLVER, oldResolver, resolver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_LOCATION_DEFINITION__OPTIONAL:
				return isOptional();
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_LOCATION_DEFINITION__PATH:
				return getPath();
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_LOCATION_DEFINITION__RESOLVER:
				return getResolver();
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
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_LOCATION_DEFINITION__OPTIONAL:
				setOptional((Boolean)newValue);
				return;
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_LOCATION_DEFINITION__PATH:
				setPath((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_LOCATION_DEFINITION__RESOLVER:
				setResolver((String)newValue);
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
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_LOCATION_DEFINITION__OPTIONAL:
				unsetOptional();
				return;
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_LOCATION_DEFINITION__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_LOCATION_DEFINITION__RESOLVER:
				setResolver(RESOLVER_EDEFAULT);
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
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_LOCATION_DEFINITION__OPTIONAL:
				return isSetOptional();
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_LOCATION_DEFINITION__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_LOCATION_DEFINITION__RESOLVER:
				return RESOLVER_EDEFAULT == null ? resolver != null : !RESOLVER_EDEFAULT.equals(resolver);
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
		result.append(" (optional: ");
		if (optionalESet) result.append(optional); else result.append("<unset>");
		result.append(", path: ");
		result.append(path);
		result.append(", resolver: ");
		result.append(resolver);
		result.append(')');
		return result.toString();
	}

} //CamelPropertyPlaceholderLocationDefinitionImpl
