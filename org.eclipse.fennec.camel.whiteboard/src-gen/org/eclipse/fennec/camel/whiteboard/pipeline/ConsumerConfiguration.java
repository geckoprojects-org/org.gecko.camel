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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consumer Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Configuration for a consumer that uses a pipeline
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration#getInlinePipeline <em>Inline Pipeline</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration#getParameterValues <em>Parameter Values</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration#isAutoStart <em>Auto Start</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelinePackage#getConsumerConfiguration()
 * @model
 * @generated
 */
@ProviderType
public interface ConsumerConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier for this consumer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelinePackage#getConsumerConfiguration_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable name for this consumer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelinePackage#getConsumerConfiguration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pipeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the pipeline definition to use
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pipeline</em>' reference.
	 * @see #setPipeline(PipelineDefinition)
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelinePackage#getConsumerConfiguration_Pipeline()
	 * @model
	 * @generated
	 */
	PipelineDefinition getPipeline();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration#getPipeline <em>Pipeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pipeline</em>' reference.
	 * @see #getPipeline()
	 * @generated
	 */
	void setPipeline(PipelineDefinition value);

	/**
	 * Returns the value of the '<em><b>Inline Pipeline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inline pipeline definition (alternative to pipeline reference)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inline Pipeline</em>' containment reference.
	 * @see #setInlinePipeline(PipelineDefinition)
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelinePackage#getConsumerConfiguration_InlinePipeline()
	 * @model containment="true"
	 * @generated
	 */
	PipelineDefinition getInlinePipeline();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration#getInlinePipeline <em>Inline Pipeline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inline Pipeline</em>' containment reference.
	 * @see #getInlinePipeline()
	 * @generated
	 */
	void setInlinePipeline(PipelineDefinition value);

	/**
	 * Returns the value of the '<em><b>Parameter Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.whiteboard.pipeline.ParameterValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameter values for this consumer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Values</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelinePackage#getConsumerConfiguration_ParameterValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterValue> getParameterValues();

	/**
	 * Returns the value of the '<em><b>Auto Start</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to automatically start this consumer when dependencies are ready
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Start</em>' attribute.
	 * @see #setAutoStart(boolean)
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelinePackage#getConsumerConfiguration_AutoStart()
	 * @model default="true"
	 * @generated
	 */
	boolean isAutoStart();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration#isAutoStart <em>Auto Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Start</em>' attribute.
	 * @see #isAutoStart()
	 * @generated
	 */
	void setAutoStart(boolean value);

} // ConsumerConfiguration
