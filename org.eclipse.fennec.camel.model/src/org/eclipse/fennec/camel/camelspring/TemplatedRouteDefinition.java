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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Templated Route Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TemplatedRouteDefinition#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TemplatedRouteDefinition#getBean <em>Bean</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TemplatedRouteDefinition#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TemplatedRouteDefinition#getPrefixId <em>Prefix Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TemplatedRouteDefinition#getRouteId <em>Route Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TemplatedRouteDefinition#getRouteTemplateRef <em>Route Template Ref</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTemplatedRouteDefinition()
 * @model extendedMetaData="name='templatedRouteDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TemplatedRouteDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.TemplatedRouteParameterDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Adds an input parameter of the template to build the route.
	 * 
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTemplatedRouteDefinition_Parameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TemplatedRouteParameterDefinition> getParameter();

	/**
	 * Returns the value of the '<em><b>Bean</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Adds a local bean as input of the template to build the route.
	 * 
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bean</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTemplatedRouteDefinition_Bean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bean' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BeanFactoryDefinition> getBean();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The group name for the route built from this template. Multiple routes can belong to the same group.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTemplatedRouteDefinition_Group()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='group'"
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TemplatedRouteDefinition#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

	/**
	 * Returns the value of the '<em><b>Prefix Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets a prefix to use for all node ids (not route id).
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefix Id</em>' attribute.
	 * @see #setPrefixId(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTemplatedRouteDefinition_PrefixId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='prefixId'"
	 * @generated
	 */
	String getPrefixId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TemplatedRouteDefinition#getPrefixId <em>Prefix Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix Id</em>' attribute.
	 * @see #getPrefixId()
	 * @generated
	 */
	void setPrefixId(String value);

	/**
	 * Returns the value of the '<em><b>Route Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the id of the route built from the route template.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Id</em>' attribute.
	 * @see #setRouteId(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTemplatedRouteDefinition_RouteId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='routeId'"
	 * @generated
	 */
	String getRouteId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TemplatedRouteDefinition#getRouteId <em>Route Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Id</em>' attribute.
	 * @see #getRouteId()
	 * @generated
	 */
	void setRouteId(String value);

	/**
	 * Returns the value of the '<em><b>Route Template Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the id of the route template to use to build the route.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Template Ref</em>' attribute.
	 * @see #setRouteTemplateRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTemplatedRouteDefinition_RouteTemplateRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='routeTemplateRef'"
	 * @generated
	 */
	String getRouteTemplateRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TemplatedRouteDefinition#getRouteTemplateRef <em>Route Template Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Template Ref</em>' attribute.
	 * @see #getRouteTemplateRef()
	 * @generated
	 */
	void setRouteTemplateRef(String value);

} // TemplatedRouteDefinition
