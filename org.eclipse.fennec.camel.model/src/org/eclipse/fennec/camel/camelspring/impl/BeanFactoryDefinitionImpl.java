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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fennec.camel.camelspring.BeanConstructorsDefinition;
import org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition;
import org.eclipse.fennec.camel.camelspring.BeanPropertiesDefinition;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bean Factory Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeanFactoryDefinitionImpl#getConstructors <em>Constructors</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeanFactoryDefinitionImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeanFactoryDefinitionImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeanFactoryDefinitionImpl#getBuilderClass <em>Builder Class</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeanFactoryDefinitionImpl#getBuilderMethod <em>Builder Method</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeanFactoryDefinitionImpl#getDestroyMethod <em>Destroy Method</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeanFactoryDefinitionImpl#getFactoryBean <em>Factory Bean</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeanFactoryDefinitionImpl#getFactoryMethod <em>Factory Method</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeanFactoryDefinitionImpl#getInitMethod <em>Init Method</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeanFactoryDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeanFactoryDefinitionImpl#getScriptLanguage <em>Script Language</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeanFactoryDefinitionImpl#getScriptPropertyPlaceholders <em>Script Property Placeholders</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeanFactoryDefinitionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BeanFactoryDefinitionImpl extends MinimalEObjectImpl.Container implements BeanFactoryDefinition {
	/**
	 * The cached value of the '{@link #getConstructors() <em>Constructors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructors()
	 * @generated
	 * @ordered
	 */
	protected BeanConstructorsDefinition constructors;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected BeanPropertiesDefinition properties;

	/**
	 * The default value of the '{@link #getScript() <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected String script = SCRIPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuilderClass() <em>Builder Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuilderClass()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILDER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuilderClass() <em>Builder Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuilderClass()
	 * @generated
	 * @ordered
	 */
	protected String builderClass = BUILDER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuilderMethod() <em>Builder Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuilderMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILDER_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuilderMethod() <em>Builder Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuilderMethod()
	 * @generated
	 * @ordered
	 */
	protected String builderMethod = BUILDER_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestroyMethod() <em>Destroy Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestroyMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTROY_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestroyMethod() <em>Destroy Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestroyMethod()
	 * @generated
	 * @ordered
	 */
	protected String destroyMethod = DESTROY_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getFactoryBean() <em>Factory Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryBean()
	 * @generated
	 * @ordered
	 */
	protected static final String FACTORY_BEAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFactoryBean() <em>Factory Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryBean()
	 * @generated
	 * @ordered
	 */
	protected String factoryBean = FACTORY_BEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFactoryMethod() <em>Factory Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String FACTORY_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFactoryMethod() <em>Factory Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryMethod()
	 * @generated
	 * @ordered
	 */
	protected String factoryMethod = FACTORY_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitMethod() <em>Init Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String INIT_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitMethod() <em>Init Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitMethod()
	 * @generated
	 * @ordered
	 */
	protected String initMethod = INIT_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getScriptLanguage() <em>Script Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScriptLanguage() <em>Script Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptLanguage()
	 * @generated
	 * @ordered
	 */
	protected String scriptLanguage = SCRIPT_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScriptPropertyPlaceholders() <em>Script Property Placeholders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptPropertyPlaceholders()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_PROPERTY_PLACEHOLDERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScriptPropertyPlaceholders() <em>Script Property Placeholders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptPropertyPlaceholders()
	 * @generated
	 * @ordered
	 */
	protected String scriptPropertyPlaceholders = SCRIPT_PROPERTY_PLACEHOLDERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BeanFactoryDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getBeanFactoryDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeanConstructorsDefinition getConstructors() {
		return constructors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstructors(BeanConstructorsDefinition newConstructors, NotificationChain msgs) {
		BeanConstructorsDefinition oldConstructors = constructors;
		constructors = newConstructors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BEAN_FACTORY_DEFINITION__CONSTRUCTORS, oldConstructors, newConstructors);
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
	public void setConstructors(BeanConstructorsDefinition newConstructors) {
		if (newConstructors != constructors) {
			NotificationChain msgs = null;
			if (constructors != null)
				msgs = ((InternalEObject)constructors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.BEAN_FACTORY_DEFINITION__CONSTRUCTORS, null, msgs);
			if (newConstructors != null)
				msgs = ((InternalEObject)newConstructors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.BEAN_FACTORY_DEFINITION__CONSTRUCTORS, null, msgs);
			msgs = basicSetConstructors(newConstructors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BEAN_FACTORY_DEFINITION__CONSTRUCTORS, newConstructors, newConstructors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeanPropertiesDefinition getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(BeanPropertiesDefinition newProperties, NotificationChain msgs) {
		BeanPropertiesDefinition oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BEAN_FACTORY_DEFINITION__PROPERTIES, oldProperties, newProperties);
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
	public void setProperties(BeanPropertiesDefinition newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.BEAN_FACTORY_DEFINITION__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.BEAN_FACTORY_DEFINITION__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BEAN_FACTORY_DEFINITION__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScript() {
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScript(String newScript) {
		String oldScript = script;
		script = newScript;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BEAN_FACTORY_DEFINITION__SCRIPT, oldScript, script));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBuilderClass() {
		return builderClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuilderClass(String newBuilderClass) {
		String oldBuilderClass = builderClass;
		builderClass = newBuilderClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BEAN_FACTORY_DEFINITION__BUILDER_CLASS, oldBuilderClass, builderClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBuilderMethod() {
		return builderMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuilderMethod(String newBuilderMethod) {
		String oldBuilderMethod = builderMethod;
		builderMethod = newBuilderMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BEAN_FACTORY_DEFINITION__BUILDER_METHOD, oldBuilderMethod, builderMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDestroyMethod() {
		return destroyMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestroyMethod(String newDestroyMethod) {
		String oldDestroyMethod = destroyMethod;
		destroyMethod = newDestroyMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BEAN_FACTORY_DEFINITION__DESTROY_METHOD, oldDestroyMethod, destroyMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFactoryBean() {
		return factoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFactoryBean(String newFactoryBean) {
		String oldFactoryBean = factoryBean;
		factoryBean = newFactoryBean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BEAN_FACTORY_DEFINITION__FACTORY_BEAN, oldFactoryBean, factoryBean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFactoryMethod() {
		return factoryMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFactoryMethod(String newFactoryMethod) {
		String oldFactoryMethod = factoryMethod;
		factoryMethod = newFactoryMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BEAN_FACTORY_DEFINITION__FACTORY_METHOD, oldFactoryMethod, factoryMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInitMethod() {
		return initMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitMethod(String newInitMethod) {
		String oldInitMethod = initMethod;
		initMethod = newInitMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BEAN_FACTORY_DEFINITION__INIT_METHOD, oldInitMethod, initMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BEAN_FACTORY_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScriptLanguage() {
		return scriptLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScriptLanguage(String newScriptLanguage) {
		String oldScriptLanguage = scriptLanguage;
		scriptLanguage = newScriptLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BEAN_FACTORY_DEFINITION__SCRIPT_LANGUAGE, oldScriptLanguage, scriptLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScriptPropertyPlaceholders() {
		return scriptPropertyPlaceholders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScriptPropertyPlaceholders(String newScriptPropertyPlaceholders) {
		String oldScriptPropertyPlaceholders = scriptPropertyPlaceholders;
		scriptPropertyPlaceholders = newScriptPropertyPlaceholders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BEAN_FACTORY_DEFINITION__SCRIPT_PROPERTY_PLACEHOLDERS, oldScriptPropertyPlaceholders, scriptPropertyPlaceholders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BEAN_FACTORY_DEFINITION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__CONSTRUCTORS:
				return basicSetConstructors(null, msgs);
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__PROPERTIES:
				return basicSetProperties(null, msgs);
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
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__CONSTRUCTORS:
				return getConstructors();
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__PROPERTIES:
				return getProperties();
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__SCRIPT:
				return getScript();
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__BUILDER_CLASS:
				return getBuilderClass();
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__BUILDER_METHOD:
				return getBuilderMethod();
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__DESTROY_METHOD:
				return getDestroyMethod();
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__FACTORY_BEAN:
				return getFactoryBean();
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__FACTORY_METHOD:
				return getFactoryMethod();
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__INIT_METHOD:
				return getInitMethod();
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__NAME:
				return getName();
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__SCRIPT_LANGUAGE:
				return getScriptLanguage();
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__SCRIPT_PROPERTY_PLACEHOLDERS:
				return getScriptPropertyPlaceholders();
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__TYPE:
				return getType();
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
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__CONSTRUCTORS:
				setConstructors((BeanConstructorsDefinition)newValue);
				return;
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__PROPERTIES:
				setProperties((BeanPropertiesDefinition)newValue);
				return;
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__SCRIPT:
				setScript((String)newValue);
				return;
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__BUILDER_CLASS:
				setBuilderClass((String)newValue);
				return;
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__BUILDER_METHOD:
				setBuilderMethod((String)newValue);
				return;
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__DESTROY_METHOD:
				setDestroyMethod((String)newValue);
				return;
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__FACTORY_BEAN:
				setFactoryBean((String)newValue);
				return;
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__FACTORY_METHOD:
				setFactoryMethod((String)newValue);
				return;
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__INIT_METHOD:
				setInitMethod((String)newValue);
				return;
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__SCRIPT_LANGUAGE:
				setScriptLanguage((String)newValue);
				return;
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__SCRIPT_PROPERTY_PLACEHOLDERS:
				setScriptPropertyPlaceholders((String)newValue);
				return;
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__TYPE:
				setType((String)newValue);
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
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__CONSTRUCTORS:
				setConstructors((BeanConstructorsDefinition)null);
				return;
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__PROPERTIES:
				setProperties((BeanPropertiesDefinition)null);
				return;
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__SCRIPT:
				setScript(SCRIPT_EDEFAULT);
				return;
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__BUILDER_CLASS:
				setBuilderClass(BUILDER_CLASS_EDEFAULT);
				return;
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__BUILDER_METHOD:
				setBuilderMethod(BUILDER_METHOD_EDEFAULT);
				return;
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__DESTROY_METHOD:
				setDestroyMethod(DESTROY_METHOD_EDEFAULT);
				return;
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__FACTORY_BEAN:
				setFactoryBean(FACTORY_BEAN_EDEFAULT);
				return;
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__FACTORY_METHOD:
				setFactoryMethod(FACTORY_METHOD_EDEFAULT);
				return;
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__INIT_METHOD:
				setInitMethod(INIT_METHOD_EDEFAULT);
				return;
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__SCRIPT_LANGUAGE:
				setScriptLanguage(SCRIPT_LANGUAGE_EDEFAULT);
				return;
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__SCRIPT_PROPERTY_PLACEHOLDERS:
				setScriptPropertyPlaceholders(SCRIPT_PROPERTY_PLACEHOLDERS_EDEFAULT);
				return;
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__TYPE:
				setType(TYPE_EDEFAULT);
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
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__CONSTRUCTORS:
				return constructors != null;
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__PROPERTIES:
				return properties != null;
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__SCRIPT:
				return SCRIPT_EDEFAULT == null ? script != null : !SCRIPT_EDEFAULT.equals(script);
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__BUILDER_CLASS:
				return BUILDER_CLASS_EDEFAULT == null ? builderClass != null : !BUILDER_CLASS_EDEFAULT.equals(builderClass);
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__BUILDER_METHOD:
				return BUILDER_METHOD_EDEFAULT == null ? builderMethod != null : !BUILDER_METHOD_EDEFAULT.equals(builderMethod);
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__DESTROY_METHOD:
				return DESTROY_METHOD_EDEFAULT == null ? destroyMethod != null : !DESTROY_METHOD_EDEFAULT.equals(destroyMethod);
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__FACTORY_BEAN:
				return FACTORY_BEAN_EDEFAULT == null ? factoryBean != null : !FACTORY_BEAN_EDEFAULT.equals(factoryBean);
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__FACTORY_METHOD:
				return FACTORY_METHOD_EDEFAULT == null ? factoryMethod != null : !FACTORY_METHOD_EDEFAULT.equals(factoryMethod);
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__INIT_METHOD:
				return INIT_METHOD_EDEFAULT == null ? initMethod != null : !INIT_METHOD_EDEFAULT.equals(initMethod);
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__SCRIPT_LANGUAGE:
				return SCRIPT_LANGUAGE_EDEFAULT == null ? scriptLanguage != null : !SCRIPT_LANGUAGE_EDEFAULT.equals(scriptLanguage);
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__SCRIPT_PROPERTY_PLACEHOLDERS:
				return SCRIPT_PROPERTY_PLACEHOLDERS_EDEFAULT == null ? scriptPropertyPlaceholders != null : !SCRIPT_PROPERTY_PLACEHOLDERS_EDEFAULT.equals(scriptPropertyPlaceholders);
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (script: ");
		result.append(script);
		result.append(", builderClass: ");
		result.append(builderClass);
		result.append(", builderMethod: ");
		result.append(builderMethod);
		result.append(", destroyMethod: ");
		result.append(destroyMethod);
		result.append(", factoryBean: ");
		result.append(factoryBean);
		result.append(", factoryMethod: ");
		result.append(factoryMethod);
		result.append(", initMethod: ");
		result.append(initMethod);
		result.append(", name: ");
		result.append(name);
		result.append(", scriptLanguage: ");
		result.append(scriptLanguage);
		result.append(", scriptPropertyPlaceholders: ");
		result.append(scriptPropertyPlaceholders);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //BeanFactoryDefinitionImpl
