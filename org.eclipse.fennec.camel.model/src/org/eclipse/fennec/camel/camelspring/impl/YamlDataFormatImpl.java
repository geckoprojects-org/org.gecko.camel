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

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.YamlDataFormat;
import org.eclipse.fennec.camel.camelspring.YamlLibrary;
import org.eclipse.fennec.camel.camelspring.YamlTypeFilterDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Yaml Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.YamlDataFormatImpl#getTypeFilter <em>Type Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.YamlDataFormatImpl#getAllowAnyType <em>Allow Any Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.YamlDataFormatImpl#getAllowRecursiveKeys <em>Allow Recursive Keys</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.YamlDataFormatImpl#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.YamlDataFormatImpl#getDumperOptions <em>Dumper Options</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.YamlDataFormatImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.YamlDataFormatImpl#getMaxAliasesForCollections <em>Max Aliases For Collections</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.YamlDataFormatImpl#getPrettyFlow <em>Pretty Flow</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.YamlDataFormatImpl#getRepresenter <em>Representer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.YamlDataFormatImpl#getResolver <em>Resolver</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.YamlDataFormatImpl#getUnmarshalType <em>Unmarshal Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.YamlDataFormatImpl#getUseApplicationContextClassLoader <em>Use Application Context Class Loader</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YamlDataFormatImpl extends DataFormatImpl implements YamlDataFormat {
	/**
	 * The cached value of the '{@link #getTypeFilter() <em>Type Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<YamlTypeFilterDefinition> typeFilter;

	/**
	 * The default value of the '{@link #getAllowAnyType() <em>Allow Any Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowAnyType()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_ANY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowAnyType() <em>Allow Any Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowAnyType()
	 * @generated
	 * @ordered
	 */
	protected String allowAnyType = ALLOW_ANY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowRecursiveKeys() <em>Allow Recursive Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowRecursiveKeys()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_RECURSIVE_KEYS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowRecursiveKeys() <em>Allow Recursive Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowRecursiveKeys()
	 * @generated
	 * @ordered
	 */
	protected String allowRecursiveKeys = ALLOW_RECURSIVE_KEYS_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstructor() <em>Constructor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructor()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRUCTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstructor() <em>Constructor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructor()
	 * @generated
	 * @ordered
	 */
	protected String constructor = CONSTRUCTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDumperOptions() <em>Dumper Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDumperOptions()
	 * @generated
	 * @ordered
	 */
	protected static final String DUMPER_OPTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDumperOptions() <em>Dumper Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDumperOptions()
	 * @generated
	 * @ordered
	 */
	protected String dumperOptions = DUMPER_OPTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibrary() <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected static final YamlLibrary LIBRARY_EDEFAULT = YamlLibrary.SNAKE_YAML;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected YamlLibrary library = LIBRARY_EDEFAULT;

	/**
	 * This is true if the Library attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean libraryESet;

	/**
	 * The default value of the '{@link #getMaxAliasesForCollections() <em>Max Aliases For Collections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAliasesForCollections()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_ALIASES_FOR_COLLECTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxAliasesForCollections() <em>Max Aliases For Collections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAliasesForCollections()
	 * @generated
	 * @ordered
	 */
	protected String maxAliasesForCollections = MAX_ALIASES_FOR_COLLECTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrettyFlow() <em>Pretty Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrettyFlow()
	 * @generated
	 * @ordered
	 */
	protected static final String PRETTY_FLOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrettyFlow() <em>Pretty Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrettyFlow()
	 * @generated
	 * @ordered
	 */
	protected String prettyFlow = PRETTY_FLOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepresenter() <em>Representer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresenter()
	 * @generated
	 * @ordered
	 */
	protected static final String REPRESENTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepresenter() <em>Representer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresenter()
	 * @generated
	 * @ordered
	 */
	protected String representer = REPRESENTER_EDEFAULT;

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
	 * The default value of the '{@link #getUnmarshalType() <em>Unmarshal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnmarshalType()
	 * @generated
	 * @ordered
	 */
	protected static final String UNMARSHAL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnmarshalType() <em>Unmarshal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnmarshalType()
	 * @generated
	 * @ordered
	 */
	protected String unmarshalType = UNMARSHAL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseApplicationContextClassLoader() <em>Use Application Context Class Loader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseApplicationContextClassLoader()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_APPLICATION_CONTEXT_CLASS_LOADER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseApplicationContextClassLoader() <em>Use Application Context Class Loader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseApplicationContextClassLoader()
	 * @generated
	 * @ordered
	 */
	protected String useApplicationContextClassLoader = USE_APPLICATION_CONTEXT_CLASS_LOADER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YamlDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getYamlDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<YamlTypeFilterDefinition> getTypeFilter() {
		if (typeFilter == null) {
			typeFilter = new EObjectContainmentEList<YamlTypeFilterDefinition>(YamlTypeFilterDefinition.class, this, CamelSpringPackage.YAML_DATA_FORMAT__TYPE_FILTER);
		}
		return typeFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowAnyType() {
		return allowAnyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowAnyType(String newAllowAnyType) {
		String oldAllowAnyType = allowAnyType;
		allowAnyType = newAllowAnyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.YAML_DATA_FORMAT__ALLOW_ANY_TYPE, oldAllowAnyType, allowAnyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowRecursiveKeys() {
		return allowRecursiveKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowRecursiveKeys(String newAllowRecursiveKeys) {
		String oldAllowRecursiveKeys = allowRecursiveKeys;
		allowRecursiveKeys = newAllowRecursiveKeys;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.YAML_DATA_FORMAT__ALLOW_RECURSIVE_KEYS, oldAllowRecursiveKeys, allowRecursiveKeys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConstructor() {
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstructor(String newConstructor) {
		String oldConstructor = constructor;
		constructor = newConstructor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.YAML_DATA_FORMAT__CONSTRUCTOR, oldConstructor, constructor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDumperOptions() {
		return dumperOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDumperOptions(String newDumperOptions) {
		String oldDumperOptions = dumperOptions;
		dumperOptions = newDumperOptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.YAML_DATA_FORMAT__DUMPER_OPTIONS, oldDumperOptions, dumperOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public YamlLibrary getLibrary() {
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLibrary(YamlLibrary newLibrary) {
		YamlLibrary oldLibrary = library;
		library = newLibrary == null ? LIBRARY_EDEFAULT : newLibrary;
		boolean oldLibraryESet = libraryESet;
		libraryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.YAML_DATA_FORMAT__LIBRARY, oldLibrary, library, !oldLibraryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLibrary() {
		YamlLibrary oldLibrary = library;
		boolean oldLibraryESet = libraryESet;
		library = LIBRARY_EDEFAULT;
		libraryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.YAML_DATA_FORMAT__LIBRARY, oldLibrary, LIBRARY_EDEFAULT, oldLibraryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLibrary() {
		return libraryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaxAliasesForCollections() {
		return maxAliasesForCollections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxAliasesForCollections(String newMaxAliasesForCollections) {
		String oldMaxAliasesForCollections = maxAliasesForCollections;
		maxAliasesForCollections = newMaxAliasesForCollections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.YAML_DATA_FORMAT__MAX_ALIASES_FOR_COLLECTIONS, oldMaxAliasesForCollections, maxAliasesForCollections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrettyFlow() {
		return prettyFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrettyFlow(String newPrettyFlow) {
		String oldPrettyFlow = prettyFlow;
		prettyFlow = newPrettyFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.YAML_DATA_FORMAT__PRETTY_FLOW, oldPrettyFlow, prettyFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRepresenter() {
		return representer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepresenter(String newRepresenter) {
		String oldRepresenter = representer;
		representer = newRepresenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.YAML_DATA_FORMAT__REPRESENTER, oldRepresenter, representer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.YAML_DATA_FORMAT__RESOLVER, oldResolver, resolver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnmarshalType() {
		return unmarshalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnmarshalType(String newUnmarshalType) {
		String oldUnmarshalType = unmarshalType;
		unmarshalType = newUnmarshalType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.YAML_DATA_FORMAT__UNMARSHAL_TYPE, oldUnmarshalType, unmarshalType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUseApplicationContextClassLoader() {
		return useApplicationContextClassLoader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseApplicationContextClassLoader(String newUseApplicationContextClassLoader) {
		String oldUseApplicationContextClassLoader = useApplicationContextClassLoader;
		useApplicationContextClassLoader = newUseApplicationContextClassLoader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.YAML_DATA_FORMAT__USE_APPLICATION_CONTEXT_CLASS_LOADER, oldUseApplicationContextClassLoader, useApplicationContextClassLoader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.YAML_DATA_FORMAT__TYPE_FILTER:
				return ((InternalEList<?>)getTypeFilter()).basicRemove(otherEnd, msgs);
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
			case CamelSpringPackage.YAML_DATA_FORMAT__TYPE_FILTER:
				return getTypeFilter();
			case CamelSpringPackage.YAML_DATA_FORMAT__ALLOW_ANY_TYPE:
				return getAllowAnyType();
			case CamelSpringPackage.YAML_DATA_FORMAT__ALLOW_RECURSIVE_KEYS:
				return getAllowRecursiveKeys();
			case CamelSpringPackage.YAML_DATA_FORMAT__CONSTRUCTOR:
				return getConstructor();
			case CamelSpringPackage.YAML_DATA_FORMAT__DUMPER_OPTIONS:
				return getDumperOptions();
			case CamelSpringPackage.YAML_DATA_FORMAT__LIBRARY:
				return getLibrary();
			case CamelSpringPackage.YAML_DATA_FORMAT__MAX_ALIASES_FOR_COLLECTIONS:
				return getMaxAliasesForCollections();
			case CamelSpringPackage.YAML_DATA_FORMAT__PRETTY_FLOW:
				return getPrettyFlow();
			case CamelSpringPackage.YAML_DATA_FORMAT__REPRESENTER:
				return getRepresenter();
			case CamelSpringPackage.YAML_DATA_FORMAT__RESOLVER:
				return getResolver();
			case CamelSpringPackage.YAML_DATA_FORMAT__UNMARSHAL_TYPE:
				return getUnmarshalType();
			case CamelSpringPackage.YAML_DATA_FORMAT__USE_APPLICATION_CONTEXT_CLASS_LOADER:
				return getUseApplicationContextClassLoader();
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
			case CamelSpringPackage.YAML_DATA_FORMAT__TYPE_FILTER:
				getTypeFilter().clear();
				getTypeFilter().addAll((Collection<? extends YamlTypeFilterDefinition>)newValue);
				return;
			case CamelSpringPackage.YAML_DATA_FORMAT__ALLOW_ANY_TYPE:
				setAllowAnyType((String)newValue);
				return;
			case CamelSpringPackage.YAML_DATA_FORMAT__ALLOW_RECURSIVE_KEYS:
				setAllowRecursiveKeys((String)newValue);
				return;
			case CamelSpringPackage.YAML_DATA_FORMAT__CONSTRUCTOR:
				setConstructor((String)newValue);
				return;
			case CamelSpringPackage.YAML_DATA_FORMAT__DUMPER_OPTIONS:
				setDumperOptions((String)newValue);
				return;
			case CamelSpringPackage.YAML_DATA_FORMAT__LIBRARY:
				setLibrary((YamlLibrary)newValue);
				return;
			case CamelSpringPackage.YAML_DATA_FORMAT__MAX_ALIASES_FOR_COLLECTIONS:
				setMaxAliasesForCollections((String)newValue);
				return;
			case CamelSpringPackage.YAML_DATA_FORMAT__PRETTY_FLOW:
				setPrettyFlow((String)newValue);
				return;
			case CamelSpringPackage.YAML_DATA_FORMAT__REPRESENTER:
				setRepresenter((String)newValue);
				return;
			case CamelSpringPackage.YAML_DATA_FORMAT__RESOLVER:
				setResolver((String)newValue);
				return;
			case CamelSpringPackage.YAML_DATA_FORMAT__UNMARSHAL_TYPE:
				setUnmarshalType((String)newValue);
				return;
			case CamelSpringPackage.YAML_DATA_FORMAT__USE_APPLICATION_CONTEXT_CLASS_LOADER:
				setUseApplicationContextClassLoader((String)newValue);
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
			case CamelSpringPackage.YAML_DATA_FORMAT__TYPE_FILTER:
				getTypeFilter().clear();
				return;
			case CamelSpringPackage.YAML_DATA_FORMAT__ALLOW_ANY_TYPE:
				setAllowAnyType(ALLOW_ANY_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.YAML_DATA_FORMAT__ALLOW_RECURSIVE_KEYS:
				setAllowRecursiveKeys(ALLOW_RECURSIVE_KEYS_EDEFAULT);
				return;
			case CamelSpringPackage.YAML_DATA_FORMAT__CONSTRUCTOR:
				setConstructor(CONSTRUCTOR_EDEFAULT);
				return;
			case CamelSpringPackage.YAML_DATA_FORMAT__DUMPER_OPTIONS:
				setDumperOptions(DUMPER_OPTIONS_EDEFAULT);
				return;
			case CamelSpringPackage.YAML_DATA_FORMAT__LIBRARY:
				unsetLibrary();
				return;
			case CamelSpringPackage.YAML_DATA_FORMAT__MAX_ALIASES_FOR_COLLECTIONS:
				setMaxAliasesForCollections(MAX_ALIASES_FOR_COLLECTIONS_EDEFAULT);
				return;
			case CamelSpringPackage.YAML_DATA_FORMAT__PRETTY_FLOW:
				setPrettyFlow(PRETTY_FLOW_EDEFAULT);
				return;
			case CamelSpringPackage.YAML_DATA_FORMAT__REPRESENTER:
				setRepresenter(REPRESENTER_EDEFAULT);
				return;
			case CamelSpringPackage.YAML_DATA_FORMAT__RESOLVER:
				setResolver(RESOLVER_EDEFAULT);
				return;
			case CamelSpringPackage.YAML_DATA_FORMAT__UNMARSHAL_TYPE:
				setUnmarshalType(UNMARSHAL_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.YAML_DATA_FORMAT__USE_APPLICATION_CONTEXT_CLASS_LOADER:
				setUseApplicationContextClassLoader(USE_APPLICATION_CONTEXT_CLASS_LOADER_EDEFAULT);
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
			case CamelSpringPackage.YAML_DATA_FORMAT__TYPE_FILTER:
				return typeFilter != null && !typeFilter.isEmpty();
			case CamelSpringPackage.YAML_DATA_FORMAT__ALLOW_ANY_TYPE:
				return ALLOW_ANY_TYPE_EDEFAULT == null ? allowAnyType != null : !ALLOW_ANY_TYPE_EDEFAULT.equals(allowAnyType);
			case CamelSpringPackage.YAML_DATA_FORMAT__ALLOW_RECURSIVE_KEYS:
				return ALLOW_RECURSIVE_KEYS_EDEFAULT == null ? allowRecursiveKeys != null : !ALLOW_RECURSIVE_KEYS_EDEFAULT.equals(allowRecursiveKeys);
			case CamelSpringPackage.YAML_DATA_FORMAT__CONSTRUCTOR:
				return CONSTRUCTOR_EDEFAULT == null ? constructor != null : !CONSTRUCTOR_EDEFAULT.equals(constructor);
			case CamelSpringPackage.YAML_DATA_FORMAT__DUMPER_OPTIONS:
				return DUMPER_OPTIONS_EDEFAULT == null ? dumperOptions != null : !DUMPER_OPTIONS_EDEFAULT.equals(dumperOptions);
			case CamelSpringPackage.YAML_DATA_FORMAT__LIBRARY:
				return isSetLibrary();
			case CamelSpringPackage.YAML_DATA_FORMAT__MAX_ALIASES_FOR_COLLECTIONS:
				return MAX_ALIASES_FOR_COLLECTIONS_EDEFAULT == null ? maxAliasesForCollections != null : !MAX_ALIASES_FOR_COLLECTIONS_EDEFAULT.equals(maxAliasesForCollections);
			case CamelSpringPackage.YAML_DATA_FORMAT__PRETTY_FLOW:
				return PRETTY_FLOW_EDEFAULT == null ? prettyFlow != null : !PRETTY_FLOW_EDEFAULT.equals(prettyFlow);
			case CamelSpringPackage.YAML_DATA_FORMAT__REPRESENTER:
				return REPRESENTER_EDEFAULT == null ? representer != null : !REPRESENTER_EDEFAULT.equals(representer);
			case CamelSpringPackage.YAML_DATA_FORMAT__RESOLVER:
				return RESOLVER_EDEFAULT == null ? resolver != null : !RESOLVER_EDEFAULT.equals(resolver);
			case CamelSpringPackage.YAML_DATA_FORMAT__UNMARSHAL_TYPE:
				return UNMARSHAL_TYPE_EDEFAULT == null ? unmarshalType != null : !UNMARSHAL_TYPE_EDEFAULT.equals(unmarshalType);
			case CamelSpringPackage.YAML_DATA_FORMAT__USE_APPLICATION_CONTEXT_CLASS_LOADER:
				return USE_APPLICATION_CONTEXT_CLASS_LOADER_EDEFAULT == null ? useApplicationContextClassLoader != null : !USE_APPLICATION_CONTEXT_CLASS_LOADER_EDEFAULT.equals(useApplicationContextClassLoader);
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
		result.append(" (allowAnyType: ");
		result.append(allowAnyType);
		result.append(", allowRecursiveKeys: ");
		result.append(allowRecursiveKeys);
		result.append(", constructor: ");
		result.append(constructor);
		result.append(", dumperOptions: ");
		result.append(dumperOptions);
		result.append(", library: ");
		if (libraryESet) result.append(library); else result.append("<unset>");
		result.append(", maxAliasesForCollections: ");
		result.append(maxAliasesForCollections);
		result.append(", prettyFlow: ");
		result.append(prettyFlow);
		result.append(", representer: ");
		result.append(representer);
		result.append(", resolver: ");
		result.append(resolver);
		result.append(", unmarshalType: ");
		result.append(unmarshalType);
		result.append(", useApplicationContextClassLoader: ");
		result.append(useApplicationContextClassLoader);
		result.append(')');
		return result.toString();
	}

} //YamlDataFormatImpl
