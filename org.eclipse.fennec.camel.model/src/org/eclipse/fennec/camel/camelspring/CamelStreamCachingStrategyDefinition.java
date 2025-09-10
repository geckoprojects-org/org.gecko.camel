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
 * A representation of the model object '<em><b>Camel Stream Caching Strategy Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getAllowClasses <em>Allow Classes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getAnySpoolRules <em>Any Spool Rules</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getDenyClasses <em>Deny Classes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getRemoveSpoolDirectoryWhenStopping <em>Remove Spool Directory When Stopping</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getSpoolCipher <em>Spool Cipher</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getSpoolDirectory <em>Spool Directory</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getSpoolEnabled <em>Spool Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getSpoolRules <em>Spool Rules</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getSpoolThreshold <em>Spool Threshold</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getSpoolUsedHeapMemoryLimit <em>Spool Used Heap Memory Limit</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getSpoolUsedHeapMemoryThreshold <em>Spool Used Heap Memory Threshold</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getStatisticsEnabled <em>Statistics Enabled</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelStreamCachingStrategyDefinition()
 * @model extendedMetaData="name='camelStreamCachingStrategyDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface CamelStreamCachingStrategyDefinition extends IdentifiedType {
	/**
	 * Returns the value of the '<em><b>Allow Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To filter stream caching of a given set of allowed/denied classes. By default, all classes that are java.io.InputStream
	 * is allowed. Multiple class names can be separated by comma.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Classes</em>' attribute.
	 * @see #setAllowClasses(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelStreamCachingStrategyDefinition_AllowClasses()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowClasses'"
	 * @generated
	 */
	String getAllowClasses();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getAllowClasses <em>Allow Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Classes</em>' attribute.
	 * @see #getAllowClasses()
	 * @generated
	 */
	void setAllowClasses(String value);

	/**
	 * Returns the value of the '<em><b>Any Spool Rules</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether if just any of the org.apache.camel.spi.StreamCachingStrategy.SpoolRule rules returns true then
	 * shouldSpoolCache(long) returns true. If this option is false, then all the
	 * org.apache.camel.spi.StreamCachingStrategy.SpoolRule must return true. The default value is false which means that all
	 * the rules must return true. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any Spool Rules</em>' attribute.
	 * @see #setAnySpoolRules(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelStreamCachingStrategyDefinition_AnySpoolRules()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='anySpoolRules'"
	 * @generated
	 */
	String getAnySpoolRules();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getAnySpoolRules <em>Any Spool Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Any Spool Rules</em>' attribute.
	 * @see #getAnySpoolRules()
	 * @generated
	 */
	void setAnySpoolRules(String value);

	/**
	 * Returns the value of the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the buffer size to use when allocating in-memory buffers used for in-memory stream caches. The default size is
	 * org.apache.camel.util.IOHelper#DEFAULT_BUFFER_SIZE. Default value: 16384
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Buffer Size</em>' attribute.
	 * @see #setBufferSize(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelStreamCachingStrategyDefinition_BufferSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='bufferSize'"
	 * @generated
	 */
	String getBufferSize();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getBufferSize <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Size</em>' attribute.
	 * @see #getBufferSize()
	 * @generated
	 */
	void setBufferSize(String value);

	/**
	 * Returns the value of the '<em><b>Deny Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To filter stream caching of a given set of allowed/denied classes. By default, all classes that are java.io.InputStream
	 * is allowed. Multiple class names can be separated by comma.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deny Classes</em>' attribute.
	 * @see #setDenyClasses(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelStreamCachingStrategyDefinition_DenyClasses()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='denyClasses'"
	 * @generated
	 */
	String getDenyClasses();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getDenyClasses <em>Deny Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deny Classes</em>' attribute.
	 * @see #getDenyClasses()
	 * @generated
	 */
	void setDenyClasses(String value);

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether stream caching is enabled or not. While stream types (like StreamSource, InputStream and Reader) are
	 * commonly used in messaging for performance reasons, they also have an important drawback: they can only be read once. In
	 * order to be able to work with message content multiple times, the stream needs to be cached. Streams are cached in
	 * memory only (by default). If streamCachingSpoolEnabled=true, then, for large stream messages (over 128 KB by default)
	 * will be cached in a temporary file instead, and Camel will handle deleting the temporary file once the cached stream is
	 * no longer necessary. Default is true. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelStreamCachingStrategyDefinition_Enabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='enabled'"
	 * @generated
	 */
	String getEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #getEnabled()
	 * @generated
	 */
	void setEnabled(String value);

	/**
	 * Returns the value of the '<em><b>Remove Spool Directory When Stopping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to remove the temporary directory when stopping. This option is default true. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remove Spool Directory When Stopping</em>' attribute.
	 * @see #setRemoveSpoolDirectoryWhenStopping(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelStreamCachingStrategyDefinition_RemoveSpoolDirectoryWhenStopping()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='removeSpoolDirectoryWhenStopping'"
	 * @generated
	 */
	String getRemoveSpoolDirectoryWhenStopping();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getRemoveSpoolDirectoryWhenStopping <em>Remove Spool Directory When Stopping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Spool Directory When Stopping</em>' attribute.
	 * @see #getRemoveSpoolDirectoryWhenStopping()
	 * @generated
	 */
	void setRemoveSpoolDirectoryWhenStopping(String value);

	/**
	 * Returns the value of the '<em><b>Spool Cipher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets a cipher name to use when spooling to disk to write with encryption. By default the data is not encrypted.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spool Cipher</em>' attribute.
	 * @see #setSpoolCipher(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelStreamCachingStrategyDefinition_SpoolCipher()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='spoolCipher'"
	 * @generated
	 */
	String getSpoolCipher();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getSpoolCipher <em>Spool Cipher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spool Cipher</em>' attribute.
	 * @see #getSpoolCipher()
	 * @generated
	 */
	void setSpoolCipher(String value);

	/**
	 * Returns the value of the '<em><b>Spool Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the spool (temporary) directory to use for overflow and spooling to disk. If no spool directory has been explicit
	 * configured, then a temporary directory is created in the java.io.tmpdir directory.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spool Directory</em>' attribute.
	 * @see #setSpoolDirectory(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelStreamCachingStrategyDefinition_SpoolDirectory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='spoolDirectory'"
	 * @generated
	 */
	String getSpoolDirectory();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getSpoolDirectory <em>Spool Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spool Directory</em>' attribute.
	 * @see #getSpoolDirectory()
	 * @generated
	 */
	void setSpoolDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Spool Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To enable stream caching spooling to disk. This means, for large stream messages (over 128 KB by default) will be cached
	 * in a temporary file instead, and Camel will handle deleting the temporary file once the cached stream is no longer
	 * necessary. Default is false. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spool Enabled</em>' attribute.
	 * @see #setSpoolEnabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelStreamCachingStrategyDefinition_SpoolEnabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='spoolEnabled'"
	 * @generated
	 */
	String getSpoolEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getSpoolEnabled <em>Spool Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spool Enabled</em>' attribute.
	 * @see #getSpoolEnabled()
	 * @generated
	 */
	void setSpoolEnabled(String value);

	/**
	 * Returns the value of the '<em><b>Spool Rules</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Reference to one or more custom org.apache.camel.spi.StreamCachingStrategy.SpoolRule to use. Multiple rules can be
	 * separated by comma.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spool Rules</em>' attribute.
	 * @see #setSpoolRules(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelStreamCachingStrategyDefinition_SpoolRules()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='spoolRules'"
	 * @generated
	 */
	String getSpoolRules();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getSpoolRules <em>Spool Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spool Rules</em>' attribute.
	 * @see #getSpoolRules()
	 * @generated
	 */
	void setSpoolRules(String value);

	/**
	 * Returns the value of the '<em><b>Spool Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Threshold in bytes when overflow to disk is activated. The default threshold is
	 * org.apache.camel.StreamCache#DEFAULT_SPOOL_THRESHOLD bytes (eg 128kb). Use -1 to disable overflow to disk. Default
	 * value: 131072
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spool Threshold</em>' attribute.
	 * @see #setSpoolThreshold(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelStreamCachingStrategyDefinition_SpoolThreshold()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='spoolThreshold'"
	 * @generated
	 */
	String getSpoolThreshold();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getSpoolThreshold <em>Spool Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spool Threshold</em>' attribute.
	 * @see #getSpoolThreshold()
	 * @generated
	 */
	void setSpoolThreshold(String value);

	/**
	 * Returns the value of the '<em><b>Spool Used Heap Memory Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets what the upper bounds should be when spoolUsedHeapMemoryThreshold is in use.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spool Used Heap Memory Limit</em>' attribute.
	 * @see #setSpoolUsedHeapMemoryLimit(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelStreamCachingStrategyDefinition_SpoolUsedHeapMemoryLimit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='spoolUsedHeapMemoryLimit'"
	 * @generated
	 */
	String getSpoolUsedHeapMemoryLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getSpoolUsedHeapMemoryLimit <em>Spool Used Heap Memory Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spool Used Heap Memory Limit</em>' attribute.
	 * @see #getSpoolUsedHeapMemoryLimit()
	 * @generated
	 */
	void setSpoolUsedHeapMemoryLimit(String value);

	/**
	 * Returns the value of the '<em><b>Spool Used Heap Memory Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets a percentage (1-99) of used heap memory threshold to activate spooling to disk.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spool Used Heap Memory Threshold</em>' attribute.
	 * @see #setSpoolUsedHeapMemoryThreshold(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelStreamCachingStrategyDefinition_SpoolUsedHeapMemoryThreshold()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='spoolUsedHeapMemoryThreshold'"
	 * @generated
	 */
	String getSpoolUsedHeapMemoryThreshold();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getSpoolUsedHeapMemoryThreshold <em>Spool Used Heap Memory Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spool Used Heap Memory Threshold</em>' attribute.
	 * @see #getSpoolUsedHeapMemoryThreshold()
	 * @generated
	 */
	void setSpoolUsedHeapMemoryThreshold(String value);

	/**
	 * Returns the value of the '<em><b>Statistics Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether statistics is enabled. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statistics Enabled</em>' attribute.
	 * @see #setStatisticsEnabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelStreamCachingStrategyDefinition_StatisticsEnabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='statisticsEnabled'"
	 * @generated
	 */
	String getStatisticsEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition#getStatisticsEnabled <em>Statistics Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statistics Enabled</em>' attribute.
	 * @see #getStatisticsEnabled()
	 * @generated
	 */
	void setStatisticsEnabled(String value);

} // CamelStreamCachingStrategyDefinition
