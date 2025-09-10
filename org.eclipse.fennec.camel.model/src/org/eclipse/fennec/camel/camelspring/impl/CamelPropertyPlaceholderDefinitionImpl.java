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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderDefinition;
import org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderFunctionDefinition;
import org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderLocationDefinition;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Property Placeholder Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelPropertyPlaceholderDefinitionImpl#getPropertiesFunction <em>Properties Function</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelPropertyPlaceholderDefinitionImpl#getPropertiesLocation <em>Properties Location</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelPropertyPlaceholderDefinitionImpl#isDefaultFallbackEnabled <em>Default Fallback Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelPropertyPlaceholderDefinitionImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelPropertyPlaceholderDefinitionImpl#isIgnoreMissingLocation <em>Ignore Missing Location</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelPropertyPlaceholderDefinitionImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelPropertyPlaceholderDefinitionImpl#isNestedPlaceholder <em>Nested Placeholder</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelPropertyPlaceholderDefinitionImpl#getPropertiesParserRef <em>Properties Parser Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CamelPropertyPlaceholderDefinitionImpl extends IdentifiedTypeImpl implements CamelPropertyPlaceholderDefinition {
	/**
	 * The cached value of the '{@link #getPropertiesFunction() <em>Properties Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertiesFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<CamelPropertyPlaceholderFunctionDefinition> propertiesFunction;

	/**
	 * The cached value of the '{@link #getPropertiesLocation() <em>Properties Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertiesLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<CamelPropertyPlaceholderLocationDefinition> propertiesLocation;

	/**
	 * The default value of the '{@link #isDefaultFallbackEnabled() <em>Default Fallback Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultFallbackEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_FALLBACK_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefaultFallbackEnabled() <em>Default Fallback Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultFallbackEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultFallbackEnabled = DEFAULT_FALLBACK_ENABLED_EDEFAULT;

	/**
	 * This is true if the Default Fallback Enabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultFallbackEnabledESet;

	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected String encoding = ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #isIgnoreMissingLocation() <em>Ignore Missing Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreMissingLocation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_MISSING_LOCATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIgnoreMissingLocation() <em>Ignore Missing Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreMissingLocation()
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreMissingLocation = IGNORE_MISSING_LOCATION_EDEFAULT;

	/**
	 * This is true if the Ignore Missing Location attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreMissingLocationESet;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isNestedPlaceholder() <em>Nested Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNestedPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NESTED_PLACEHOLDER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNestedPlaceholder() <em>Nested Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNestedPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected boolean nestedPlaceholder = NESTED_PLACEHOLDER_EDEFAULT;

	/**
	 * This is true if the Nested Placeholder attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nestedPlaceholderESet;

	/**
	 * The default value of the '{@link #getPropertiesParserRef() <em>Properties Parser Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertiesParserRef()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTIES_PARSER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertiesParserRef() <em>Properties Parser Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertiesParserRef()
	 * @generated
	 * @ordered
	 */
	protected String propertiesParserRef = PROPERTIES_PARSER_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CamelPropertyPlaceholderDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getCamelPropertyPlaceholderDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CamelPropertyPlaceholderFunctionDefinition> getPropertiesFunction() {
		if (propertiesFunction == null) {
			propertiesFunction = new EObjectContainmentEList<CamelPropertyPlaceholderFunctionDefinition>(CamelPropertyPlaceholderFunctionDefinition.class, this, CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_FUNCTION);
		}
		return propertiesFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CamelPropertyPlaceholderLocationDefinition> getPropertiesLocation() {
		if (propertiesLocation == null) {
			propertiesLocation = new EObjectContainmentEList<CamelPropertyPlaceholderLocationDefinition>(CamelPropertyPlaceholderLocationDefinition.class, this, CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_LOCATION);
		}
		return propertiesLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDefaultFallbackEnabled() {
		return defaultFallbackEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultFallbackEnabled(boolean newDefaultFallbackEnabled) {
		boolean oldDefaultFallbackEnabled = defaultFallbackEnabled;
		defaultFallbackEnabled = newDefaultFallbackEnabled;
		boolean oldDefaultFallbackEnabledESet = defaultFallbackEnabledESet;
		defaultFallbackEnabledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__DEFAULT_FALLBACK_ENABLED, oldDefaultFallbackEnabled, defaultFallbackEnabled, !oldDefaultFallbackEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDefaultFallbackEnabled() {
		boolean oldDefaultFallbackEnabled = defaultFallbackEnabled;
		boolean oldDefaultFallbackEnabledESet = defaultFallbackEnabledESet;
		defaultFallbackEnabled = DEFAULT_FALLBACK_ENABLED_EDEFAULT;
		defaultFallbackEnabledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__DEFAULT_FALLBACK_ENABLED, oldDefaultFallbackEnabled, DEFAULT_FALLBACK_ENABLED_EDEFAULT, oldDefaultFallbackEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDefaultFallbackEnabled() {
		return defaultFallbackEnabledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncoding(String newEncoding) {
		String oldEncoding = encoding;
		encoding = newEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__ENCODING, oldEncoding, encoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIgnoreMissingLocation() {
		return ignoreMissingLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreMissingLocation(boolean newIgnoreMissingLocation) {
		boolean oldIgnoreMissingLocation = ignoreMissingLocation;
		ignoreMissingLocation = newIgnoreMissingLocation;
		boolean oldIgnoreMissingLocationESet = ignoreMissingLocationESet;
		ignoreMissingLocationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__IGNORE_MISSING_LOCATION, oldIgnoreMissingLocation, ignoreMissingLocation, !oldIgnoreMissingLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIgnoreMissingLocation() {
		boolean oldIgnoreMissingLocation = ignoreMissingLocation;
		boolean oldIgnoreMissingLocationESet = ignoreMissingLocationESet;
		ignoreMissingLocation = IGNORE_MISSING_LOCATION_EDEFAULT;
		ignoreMissingLocationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__IGNORE_MISSING_LOCATION, oldIgnoreMissingLocation, IGNORE_MISSING_LOCATION_EDEFAULT, oldIgnoreMissingLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIgnoreMissingLocation() {
		return ignoreMissingLocationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNestedPlaceholder() {
		return nestedPlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNestedPlaceholder(boolean newNestedPlaceholder) {
		boolean oldNestedPlaceholder = nestedPlaceholder;
		nestedPlaceholder = newNestedPlaceholder;
		boolean oldNestedPlaceholderESet = nestedPlaceholderESet;
		nestedPlaceholderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__NESTED_PLACEHOLDER, oldNestedPlaceholder, nestedPlaceholder, !oldNestedPlaceholderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNestedPlaceholder() {
		boolean oldNestedPlaceholder = nestedPlaceholder;
		boolean oldNestedPlaceholderESet = nestedPlaceholderESet;
		nestedPlaceholder = NESTED_PLACEHOLDER_EDEFAULT;
		nestedPlaceholderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__NESTED_PLACEHOLDER, oldNestedPlaceholder, NESTED_PLACEHOLDER_EDEFAULT, oldNestedPlaceholderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNestedPlaceholder() {
		return nestedPlaceholderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPropertiesParserRef() {
		return propertiesParserRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertiesParserRef(String newPropertiesParserRef) {
		String oldPropertiesParserRef = propertiesParserRef;
		propertiesParserRef = newPropertiesParserRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_PARSER_REF, oldPropertiesParserRef, propertiesParserRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_FUNCTION:
				return ((InternalEList<?>)getPropertiesFunction()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_LOCATION:
				return ((InternalEList<?>)getPropertiesLocation()).basicRemove(otherEnd, msgs);
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
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_FUNCTION:
				return getPropertiesFunction();
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_LOCATION:
				return getPropertiesLocation();
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__DEFAULT_FALLBACK_ENABLED:
				return isDefaultFallbackEnabled();
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__ENCODING:
				return getEncoding();
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__IGNORE_MISSING_LOCATION:
				return isIgnoreMissingLocation();
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__LOCATION:
				return getLocation();
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__NESTED_PLACEHOLDER:
				return isNestedPlaceholder();
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_PARSER_REF:
				return getPropertiesParserRef();
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
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_FUNCTION:
				getPropertiesFunction().clear();
				getPropertiesFunction().addAll((Collection<? extends CamelPropertyPlaceholderFunctionDefinition>)newValue);
				return;
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_LOCATION:
				getPropertiesLocation().clear();
				getPropertiesLocation().addAll((Collection<? extends CamelPropertyPlaceholderLocationDefinition>)newValue);
				return;
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__DEFAULT_FALLBACK_ENABLED:
				setDefaultFallbackEnabled((Boolean)newValue);
				return;
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__ENCODING:
				setEncoding((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__IGNORE_MISSING_LOCATION:
				setIgnoreMissingLocation((Boolean)newValue);
				return;
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__LOCATION:
				setLocation((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__NESTED_PLACEHOLDER:
				setNestedPlaceholder((Boolean)newValue);
				return;
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_PARSER_REF:
				setPropertiesParserRef((String)newValue);
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
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_FUNCTION:
				getPropertiesFunction().clear();
				return;
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_LOCATION:
				getPropertiesLocation().clear();
				return;
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__DEFAULT_FALLBACK_ENABLED:
				unsetDefaultFallbackEnabled();
				return;
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__IGNORE_MISSING_LOCATION:
				unsetIgnoreMissingLocation();
				return;
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__NESTED_PLACEHOLDER:
				unsetNestedPlaceholder();
				return;
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_PARSER_REF:
				setPropertiesParserRef(PROPERTIES_PARSER_REF_EDEFAULT);
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
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_FUNCTION:
				return propertiesFunction != null && !propertiesFunction.isEmpty();
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_LOCATION:
				return propertiesLocation != null && !propertiesLocation.isEmpty();
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__DEFAULT_FALLBACK_ENABLED:
				return isSetDefaultFallbackEnabled();
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__ENCODING:
				return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__IGNORE_MISSING_LOCATION:
				return isSetIgnoreMissingLocation();
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__NESTED_PLACEHOLDER:
				return isSetNestedPlaceholder();
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_PARSER_REF:
				return PROPERTIES_PARSER_REF_EDEFAULT == null ? propertiesParserRef != null : !PROPERTIES_PARSER_REF_EDEFAULT.equals(propertiesParserRef);
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
		result.append(" (defaultFallbackEnabled: ");
		if (defaultFallbackEnabledESet) result.append(defaultFallbackEnabled); else result.append("<unset>");
		result.append(", encoding: ");
		result.append(encoding);
		result.append(", ignoreMissingLocation: ");
		if (ignoreMissingLocationESet) result.append(ignoreMissingLocation); else result.append("<unset>");
		result.append(", location: ");
		result.append(location);
		result.append(", nestedPlaceholder: ");
		if (nestedPlaceholderESet) result.append(nestedPlaceholder); else result.append("<unset>");
		result.append(", propertiesParserRef: ");
		result.append(propertiesParserRef);
		result.append(')');
		return result.toString();
	}

} //CamelPropertyPlaceholderDefinitionImpl
