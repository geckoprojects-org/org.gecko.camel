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
package org.eclipse.fennec.camel.camelspring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Beans Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeansDefinition#getComponentScan <em>Component Scan</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeansDefinition#getBean <em>Bean</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeansDefinition#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeansDefinition#getDataFormats <em>Data Formats</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeansDefinition#getRestConfiguration <em>Rest Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeansDefinition#getRest <em>Rest</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeansDefinition#getRouteConfiguration <em>Route Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeansDefinition#getRouteTemplate <em>Route Template</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeansDefinition#getTemplatedRoute <em>Templated Route</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeansDefinition#getRoute <em>Route</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeansDefinition()
 * @model extendedMetaData="name='beansDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BeansDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Scan</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ComponentScanDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Component scanning that can auto-discover Camel route builders from the classpath.
	 * 
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Scan</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeansDefinition_ComponentScan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='component-scan' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ComponentScanDefinition> getComponentScan();

	/**
	 * Returns the value of the '<em><b>Bean</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * List of bean.
	 * 
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bean</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeansDefinition_Bean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bean' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BeanFactoryDefinition> getBean();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeansDefinition_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='skip'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Data Formats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * List of data formats.
	 * 
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Formats</em>' containment reference.
	 * @see #setDataFormats(DataFormatsType)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeansDefinition_DataFormats()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataFormats' namespace='##targetNamespace'"
	 * @generated
	 */
	DataFormatsType getDataFormats();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BeansDefinition#getDataFormats <em>Data Formats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Formats</em>' containment reference.
	 * @see #getDataFormats()
	 * @generated
	 */
	void setDataFormats(DataFormatsType value);

	/**
	 * Returns the value of the '<em><b>Rest Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To configure rest
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rest Configuration</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeansDefinition_RestConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='restConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RestConfigurationDefinition> getRestConfiguration();

	/**
	 * Returns the value of the '<em><b>Rest</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RestDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Defines a rest service using the rest-dsl
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rest</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeansDefinition_Rest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rest' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RestDefinition> getRest();

	/**
	 * Returns the value of the '<em><b>Route Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RouteConfigurationDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Reusable configuration for Camel route(s).
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Configuration</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeansDefinition_RouteConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='routeConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RouteConfigurationDefinition> getRouteConfiguration();

	/**
	 * Returns the value of the '<em><b>Route Template</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RouteTemplateDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Defines a route template (parameterized routes)
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Template</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeansDefinition_RouteTemplate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='routeTemplate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RouteTemplateDefinition> getRouteTemplate();

	/**
	 * Returns the value of the '<em><b>Templated Route</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.TemplatedRouteDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Defines a templated route (a route built from a route template)
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Templated Route</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeansDefinition_TemplatedRoute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='templatedRoute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TemplatedRouteDefinition> getTemplatedRoute();

	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RouteDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A Camel route
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeansDefinition_Route()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='route' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RouteDefinition> getRoute();

} // BeansDefinition
