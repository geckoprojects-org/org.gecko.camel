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
 * A representation of the model object '<em><b>Resumable Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ResumableDefinition#getIntermittent <em>Intermittent</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ResumableDefinition#getLoggingLevel <em>Logging Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ResumableDefinition#getResumeStrategy <em>Resume Strategy</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResumableDefinition()
 * @model extendedMetaData="name='resumableDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface ResumableDefinition extends NoOutputDefinition {
	/**
	 * Returns the value of the '<em><b>Intermittent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether the offsets will be intermittently present or whether they must be present in every exchange. Default
	 * value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intermittent</em>' attribute.
	 * @see #setIntermittent(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResumableDefinition_Intermittent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='intermittent'"
	 * @generated
	 */
	String getIntermittent();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ResumableDefinition#getIntermittent <em>Intermittent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intermittent</em>' attribute.
	 * @see #getIntermittent()
	 * @generated
	 */
	void setIntermittent(String value);

	/**
	 * Returns the value of the '<em><b>Logging Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The logging level to use in case of failures. Default value: ERROR
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logging Level</em>' attribute.
	 * @see #setLoggingLevel(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResumableDefinition_LoggingLevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='loggingLevel'"
	 * @generated
	 */
	String getLoggingLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ResumableDefinition#getLoggingLevel <em>Logging Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logging Level</em>' attribute.
	 * @see #getLoggingLevel()
	 * @generated
	 */
	void setLoggingLevel(String value);

	/**
	 * Returns the value of the '<em><b>Resume Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the resume strategy to use.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resume Strategy</em>' attribute.
	 * @see #setResumeStrategy(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResumableDefinition_ResumeStrategy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='resumeStrategy'"
	 * @generated
	 */
	String getResumeStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ResumableDefinition#getResumeStrategy <em>Resume Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resume Strategy</em>' attribute.
	 * @see #getResumeStrategy()
	 * @generated
	 */
	void setResumeStrategy(String value);

} // ResumableDefinition
