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
 * A representation of the model object '<em><b>Beanio Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeanioDataFormat#getBeanReaderErrorHandlerType <em>Bean Reader Error Handler Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeanioDataFormat#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeanioDataFormat#getIgnoreInvalidRecords <em>Ignore Invalid Records</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeanioDataFormat#getIgnoreUnexpectedRecords <em>Ignore Unexpected Records</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeanioDataFormat#getIgnoreUnidentifiedRecords <em>Ignore Unidentified Records</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeanioDataFormat#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeanioDataFormat#getStreamName <em>Stream Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeanioDataFormat#getUnmarshalSingleObject <em>Unmarshal Single Object</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeanioDataFormat()
 * @model extendedMetaData="name='beanioDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface BeanioDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Bean Reader Error Handler Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a custom org.apache.camel.dataformat.beanio.BeanIOErrorHandler as error handler while parsing. Configure the
	 * fully qualified class name of the error handler. Notice the options ignoreUnidentifiedRecords, ignoreUnexpectedRecords,
	 * and ignoreInvalidRecords may not be in use when you use a custom error handler.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bean Reader Error Handler Type</em>' attribute.
	 * @see #setBeanReaderErrorHandlerType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeanioDataFormat_BeanReaderErrorHandlerType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='beanReaderErrorHandlerType'"
	 * @generated
	 */
	String getBeanReaderErrorHandlerType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BeanioDataFormat#getBeanReaderErrorHandlerType <em>Bean Reader Error Handler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bean Reader Error Handler Type</em>' attribute.
	 * @see #getBeanReaderErrorHandlerType()
	 * @generated
	 */
	void setBeanReaderErrorHandlerType(String value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The charset to use. Is by default the JVM platform default charset.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #setEncoding(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeanioDataFormat_Encoding()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='encoding'"
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BeanioDataFormat#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

	/**
	 * Returns the value of the '<em><b>Ignore Invalid Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to ignore invalid records. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ignore Invalid Records</em>' attribute.
	 * @see #setIgnoreInvalidRecords(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeanioDataFormat_IgnoreInvalidRecords()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ignoreInvalidRecords'"
	 * @generated
	 */
	String getIgnoreInvalidRecords();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BeanioDataFormat#getIgnoreInvalidRecords <em>Ignore Invalid Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Invalid Records</em>' attribute.
	 * @see #getIgnoreInvalidRecords()
	 * @generated
	 */
	void setIgnoreInvalidRecords(String value);

	/**
	 * Returns the value of the '<em><b>Ignore Unexpected Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to ignore unexpected records. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ignore Unexpected Records</em>' attribute.
	 * @see #setIgnoreUnexpectedRecords(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeanioDataFormat_IgnoreUnexpectedRecords()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ignoreUnexpectedRecords'"
	 * @generated
	 */
	String getIgnoreUnexpectedRecords();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BeanioDataFormat#getIgnoreUnexpectedRecords <em>Ignore Unexpected Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Unexpected Records</em>' attribute.
	 * @see #getIgnoreUnexpectedRecords()
	 * @generated
	 */
	void setIgnoreUnexpectedRecords(String value);

	/**
	 * Returns the value of the '<em><b>Ignore Unidentified Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to ignore unidentified records. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ignore Unidentified Records</em>' attribute.
	 * @see #setIgnoreUnidentifiedRecords(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeanioDataFormat_IgnoreUnidentifiedRecords()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ignoreUnidentifiedRecords'"
	 * @generated
	 */
	String getIgnoreUnidentifiedRecords();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BeanioDataFormat#getIgnoreUnidentifiedRecords <em>Ignore Unidentified Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Unidentified Records</em>' attribute.
	 * @see #getIgnoreUnidentifiedRecords()
	 * @generated
	 */
	void setIgnoreUnidentifiedRecords(String value);

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The BeanIO mapping file. Is by default loaded from the classpath. You can prefix with file:, http:, or classpath: to
	 * denote from where to load the mapping file.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mapping</em>' attribute.
	 * @see #setMapping(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeanioDataFormat_Mapping()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='mapping'"
	 * @generated
	 */
	String getMapping();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BeanioDataFormat#getMapping <em>Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' attribute.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(String value);

	/**
	 * Returns the value of the '<em><b>Stream Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The name of the stream to use.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stream Name</em>' attribute.
	 * @see #setStreamName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeanioDataFormat_StreamName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='streamName'"
	 * @generated
	 */
	String getStreamName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BeanioDataFormat#getStreamName <em>Stream Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stream Name</em>' attribute.
	 * @see #getStreamName()
	 * @generated
	 */
	void setStreamName(String value);

	/**
	 * Returns the value of the '<em><b>Unmarshal Single Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * This options controls whether to unmarshal as a list of objects or as a single object only. The former is the default
	 * mode, and the latter is only intended in special use-cases where beanio maps the Camel message to a single POJO bean.
	 * Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unmarshal Single Object</em>' attribute.
	 * @see #setUnmarshalSingleObject(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeanioDataFormat_UnmarshalSingleObject()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='unmarshalSingleObject'"
	 * @generated
	 */
	String getUnmarshalSingleObject();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BeanioDataFormat#getUnmarshalSingleObject <em>Unmarshal Single Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unmarshal Single Object</em>' attribute.
	 * @see #getUnmarshalSingleObject()
	 * @generated
	 */
	void setUnmarshalSingleObject(String value);

} // BeanioDataFormat
