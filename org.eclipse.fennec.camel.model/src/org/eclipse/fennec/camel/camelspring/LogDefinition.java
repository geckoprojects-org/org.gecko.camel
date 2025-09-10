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
 * A representation of the model object '<em><b>Log Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LogDefinition#getLogger <em>Logger</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LogDefinition#getLoggingLevel <em>Logging Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LogDefinition#getLogLanguage <em>Log Language</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LogDefinition#getLogName <em>Log Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LogDefinition#getMarker <em>Marker</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.LogDefinition#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLogDefinition()
 * @model extendedMetaData="name='logDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface LogDefinition extends NoOutputDefinition {
	/**
	 * Returns the value of the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To refer to a custom logger instance to lookup from the registry.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logger</em>' attribute.
	 * @see #setLogger(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLogDefinition_Logger()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logger'"
	 * @generated
	 */
	String getLogger();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LogDefinition#getLogger <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logger</em>' attribute.
	 * @see #getLogger()
	 * @generated
	 */
	void setLogger(String value);

	/**
	 * Returns the value of the '<em><b>Logging Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the logging level. The default value is INFO. Default value: INFO
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logging Level</em>' attribute.
	 * @see #setLoggingLevel(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLogDefinition_LoggingLevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='loggingLevel'"
	 * @generated
	 */
	String getLoggingLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LogDefinition#getLoggingLevel <em>Logging Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logging Level</em>' attribute.
	 * @see #getLoggingLevel()
	 * @generated
	 */
	void setLoggingLevel(String value);

	/**
	 * Returns the value of the '<em><b>Log Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To configure the language to use. By default, the simple language is used. However, Camel also supports other languages
	 * such as groovy.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Language</em>' attribute.
	 * @see #setLogLanguage(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLogDefinition_LogLanguage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logLanguage'"
	 * @generated
	 */
	String getLogLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LogDefinition#getLogLanguage <em>Log Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Language</em>' attribute.
	 * @see #getLogLanguage()
	 * @generated
	 */
	void setLogLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Log Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the name of the logger. The name is default the routeId or the source:line if source location is enabled. You can
	 * also specify the name using tokens: ${class} - the logger class name (org.apache.camel.processor.LogProcessor)
	 * ${contextId} - the camel context id ${routeId} - the route id ${groupId} - the route group id ${nodeId} - the node id
	 * ${nodePrefixId} - the node prefix id ${source} - the source:line (source location must be enabled) ${source.name} - the
	 * source filename (source location must be enabled) ${source.line} - the source line number (source location must be
	 * enabled) For example to use the route and node id you can specify the name as: ${routeId}/${nodeId}.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Name</em>' attribute.
	 * @see #setLogName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLogDefinition_LogName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logName'"
	 * @generated
	 */
	String getLogName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LogDefinition#getLogName <em>Log Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Name</em>' attribute.
	 * @see #getLogName()
	 * @generated
	 */
	void setLogName(String value);

	/**
	 * Returns the value of the '<em><b>Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use slf4j marker.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Marker</em>' attribute.
	 * @see #setMarker(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLogDefinition_Marker()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='marker'"
	 * @generated
	 */
	String getMarker();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LogDefinition#getMarker <em>Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker</em>' attribute.
	 * @see #getMarker()
	 * @generated
	 */
	void setMarker(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the log message (uses simple language).
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getLogDefinition_Message()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='message'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.LogDefinition#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

} // LogDefinition
