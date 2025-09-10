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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sampling Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SamplingDefinition#getMessageFrequency <em>Message Frequency</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SamplingDefinition#getSamplePeriod <em>Sample Period</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSamplingDefinition()
 * @model extendedMetaData="name='samplingDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface SamplingDefinition extends NoOutputDefinition {
	/**
	 * Returns the value of the '<em><b>Message Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the sample message count which only a single Exchange will pass through after this many received.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Frequency</em>' attribute.
	 * @see #setMessageFrequency(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSamplingDefinition_MessageFrequency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='messageFrequency'"
	 * @generated
	 */
	String getMessageFrequency();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SamplingDefinition#getMessageFrequency <em>Message Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Frequency</em>' attribute.
	 * @see #getMessageFrequency()
	 * @generated
	 */
	void setMessageFrequency(String value);

	/**
	 * Returns the value of the '<em><b>Sample Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the sample period during which only a single Exchange will pass through. Default value: 1000
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sample Period</em>' attribute.
	 * @see #setSamplePeriod(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSamplingDefinition_SamplePeriod()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='samplePeriod'"
	 * @generated
	 */
	String getSamplePeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SamplingDefinition#getSamplePeriod <em>Sample Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Period</em>' attribute.
	 * @see #getSamplePeriod()
	 * @generated
	 */
	void setSamplePeriod(String value);

} // SamplingDefinition
