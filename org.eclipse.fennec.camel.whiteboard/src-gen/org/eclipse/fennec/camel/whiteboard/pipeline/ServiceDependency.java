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
package org.eclipse.fennec.camel.whiteboard.pipeline;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a dependency on an OSGi service required for pipeline execution
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency#getServiceInterface <em>Service Interface</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency#getBindName <em>Bind Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelinePackage#getServiceDependency()
 * @model
 * @generated
 */
@ProviderType
public interface ServiceDependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Java interface name of the required service
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Interface</em>' attribute.
	 * @see #setServiceInterface(String)
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelinePackage#getServiceDependency_ServiceInterface()
	 * @model required="true"
	 * @generated
	 */
	String getServiceInterface();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency#getServiceInterface <em>Service Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Interface</em>' attribute.
	 * @see #getServiceInterface()
	 * @generated
	 */
	void setServiceInterface(String value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional LDAP filter for service selection
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #setFilter(String)
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelinePackage#getServiceDependency_Filter()
	 * @model
	 * @generated
	 */
	String getFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency#getFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(String value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.camel.whiteboard.pipeline.DependencyCardinality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether single or multiple instances are required
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.DependencyCardinality
	 * @see #setCardinality(DependencyCardinality)
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelinePackage#getServiceDependency_Cardinality()
	 * @model
	 * @generated
	 */
	DependencyCardinality getCardinality();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.DependencyCardinality
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(DependencyCardinality value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this dependency is optional
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelinePackage#getServiceDependency_Optional()
	 * @model default="false"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Bind Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name to bind this service under in the Camel registry
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bind Name</em>' attribute.
	 * @see #setBindName(String)
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelinePackage#getServiceDependency_BindName()
	 * @model
	 * @generated
	 */
	String getBindName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency#getBindName <em>Bind Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bind Name</em>' attribute.
	 * @see #getBindName()
	 * @generated
	 */
	void setBindName(String value);

} // ServiceDependency
