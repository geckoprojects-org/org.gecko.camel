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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Stream Caching Strategy Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelStreamCachingStrategyDefinitionImpl#getAllowClasses <em>Allow Classes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelStreamCachingStrategyDefinitionImpl#getAnySpoolRules <em>Any Spool Rules</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelStreamCachingStrategyDefinitionImpl#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelStreamCachingStrategyDefinitionImpl#getDenyClasses <em>Deny Classes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelStreamCachingStrategyDefinitionImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelStreamCachingStrategyDefinitionImpl#getRemoveSpoolDirectoryWhenStopping <em>Remove Spool Directory When Stopping</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelStreamCachingStrategyDefinitionImpl#getSpoolCipher <em>Spool Cipher</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelStreamCachingStrategyDefinitionImpl#getSpoolDirectory <em>Spool Directory</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelStreamCachingStrategyDefinitionImpl#getSpoolEnabled <em>Spool Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelStreamCachingStrategyDefinitionImpl#getSpoolRules <em>Spool Rules</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelStreamCachingStrategyDefinitionImpl#getSpoolThreshold <em>Spool Threshold</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelStreamCachingStrategyDefinitionImpl#getSpoolUsedHeapMemoryLimit <em>Spool Used Heap Memory Limit</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelStreamCachingStrategyDefinitionImpl#getSpoolUsedHeapMemoryThreshold <em>Spool Used Heap Memory Threshold</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelStreamCachingStrategyDefinitionImpl#getStatisticsEnabled <em>Statistics Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CamelStreamCachingStrategyDefinitionImpl extends IdentifiedTypeImpl implements CamelStreamCachingStrategyDefinition {
	/**
	 * The default value of the '{@link #getAllowClasses() <em>Allow Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowClasses()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_CLASSES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowClasses() <em>Allow Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowClasses()
	 * @generated
	 * @ordered
	 */
	protected String allowClasses = ALLOW_CLASSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnySpoolRules() <em>Any Spool Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnySpoolRules()
	 * @generated
	 * @ordered
	 */
	protected static final String ANY_SPOOL_RULES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnySpoolRules() <em>Any Spool Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnySpoolRules()
	 * @generated
	 * @ordered
	 */
	protected String anySpoolRules = ANY_SPOOL_RULES_EDEFAULT;

	/**
	 * The default value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSize()
	 * @generated
	 * @ordered
	 */
	protected static final String BUFFER_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSize()
	 * @generated
	 * @ordered
	 */
	protected String bufferSize = BUFFER_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDenyClasses() <em>Deny Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenyClasses()
	 * @generated
	 * @ordered
	 */
	protected static final String DENY_CLASSES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDenyClasses() <em>Deny Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenyClasses()
	 * @generated
	 * @ordered
	 */
	protected String denyClasses = DENY_CLASSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final String ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected String enabled = ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoveSpoolDirectoryWhenStopping() <em>Remove Spool Directory When Stopping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoveSpoolDirectoryWhenStopping()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOVE_SPOOL_DIRECTORY_WHEN_STOPPING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoveSpoolDirectoryWhenStopping() <em>Remove Spool Directory When Stopping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoveSpoolDirectoryWhenStopping()
	 * @generated
	 * @ordered
	 */
	protected String removeSpoolDirectoryWhenStopping = REMOVE_SPOOL_DIRECTORY_WHEN_STOPPING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpoolCipher() <em>Spool Cipher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpoolCipher()
	 * @generated
	 * @ordered
	 */
	protected static final String SPOOL_CIPHER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpoolCipher() <em>Spool Cipher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpoolCipher()
	 * @generated
	 * @ordered
	 */
	protected String spoolCipher = SPOOL_CIPHER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpoolDirectory() <em>Spool Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpoolDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String SPOOL_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpoolDirectory() <em>Spool Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpoolDirectory()
	 * @generated
	 * @ordered
	 */
	protected String spoolDirectory = SPOOL_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpoolEnabled() <em>Spool Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpoolEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final String SPOOL_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpoolEnabled() <em>Spool Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpoolEnabled()
	 * @generated
	 * @ordered
	 */
	protected String spoolEnabled = SPOOL_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpoolRules() <em>Spool Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpoolRules()
	 * @generated
	 * @ordered
	 */
	protected static final String SPOOL_RULES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpoolRules() <em>Spool Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpoolRules()
	 * @generated
	 * @ordered
	 */
	protected String spoolRules = SPOOL_RULES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpoolThreshold() <em>Spool Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpoolThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final String SPOOL_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpoolThreshold() <em>Spool Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpoolThreshold()
	 * @generated
	 * @ordered
	 */
	protected String spoolThreshold = SPOOL_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpoolUsedHeapMemoryLimit() <em>Spool Used Heap Memory Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpoolUsedHeapMemoryLimit()
	 * @generated
	 * @ordered
	 */
	protected static final String SPOOL_USED_HEAP_MEMORY_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpoolUsedHeapMemoryLimit() <em>Spool Used Heap Memory Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpoolUsedHeapMemoryLimit()
	 * @generated
	 * @ordered
	 */
	protected String spoolUsedHeapMemoryLimit = SPOOL_USED_HEAP_MEMORY_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpoolUsedHeapMemoryThreshold() <em>Spool Used Heap Memory Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpoolUsedHeapMemoryThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final String SPOOL_USED_HEAP_MEMORY_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpoolUsedHeapMemoryThreshold() <em>Spool Used Heap Memory Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpoolUsedHeapMemoryThreshold()
	 * @generated
	 * @ordered
	 */
	protected String spoolUsedHeapMemoryThreshold = SPOOL_USED_HEAP_MEMORY_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatisticsEnabled() <em>Statistics Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatisticsEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final String STATISTICS_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatisticsEnabled() <em>Statistics Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatisticsEnabled()
	 * @generated
	 * @ordered
	 */
	protected String statisticsEnabled = STATISTICS_ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CamelStreamCachingStrategyDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getCamelStreamCachingStrategyDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowClasses() {
		return allowClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowClasses(String newAllowClasses) {
		String oldAllowClasses = allowClasses;
		allowClasses = newAllowClasses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__ALLOW_CLASSES, oldAllowClasses, allowClasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnySpoolRules() {
		return anySpoolRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnySpoolRules(String newAnySpoolRules) {
		String oldAnySpoolRules = anySpoolRules;
		anySpoolRules = newAnySpoolRules;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__ANY_SPOOL_RULES, oldAnySpoolRules, anySpoolRules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBufferSize() {
		return bufferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBufferSize(String newBufferSize) {
		String oldBufferSize = bufferSize;
		bufferSize = newBufferSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__BUFFER_SIZE, oldBufferSize, bufferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDenyClasses() {
		return denyClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDenyClasses(String newDenyClasses) {
		String oldDenyClasses = denyClasses;
		denyClasses = newDenyClasses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__DENY_CLASSES, oldDenyClasses, denyClasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnabled(String newEnabled) {
		String oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRemoveSpoolDirectoryWhenStopping() {
		return removeSpoolDirectoryWhenStopping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoveSpoolDirectoryWhenStopping(String newRemoveSpoolDirectoryWhenStopping) {
		String oldRemoveSpoolDirectoryWhenStopping = removeSpoolDirectoryWhenStopping;
		removeSpoolDirectoryWhenStopping = newRemoveSpoolDirectoryWhenStopping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__REMOVE_SPOOL_DIRECTORY_WHEN_STOPPING, oldRemoveSpoolDirectoryWhenStopping, removeSpoolDirectoryWhenStopping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpoolCipher() {
		return spoolCipher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpoolCipher(String newSpoolCipher) {
		String oldSpoolCipher = spoolCipher;
		spoolCipher = newSpoolCipher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_CIPHER, oldSpoolCipher, spoolCipher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpoolDirectory() {
		return spoolDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpoolDirectory(String newSpoolDirectory) {
		String oldSpoolDirectory = spoolDirectory;
		spoolDirectory = newSpoolDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_DIRECTORY, oldSpoolDirectory, spoolDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpoolEnabled() {
		return spoolEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpoolEnabled(String newSpoolEnabled) {
		String oldSpoolEnabled = spoolEnabled;
		spoolEnabled = newSpoolEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_ENABLED, oldSpoolEnabled, spoolEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpoolRules() {
		return spoolRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpoolRules(String newSpoolRules) {
		String oldSpoolRules = spoolRules;
		spoolRules = newSpoolRules;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_RULES, oldSpoolRules, spoolRules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpoolThreshold() {
		return spoolThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpoolThreshold(String newSpoolThreshold) {
		String oldSpoolThreshold = spoolThreshold;
		spoolThreshold = newSpoolThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_THRESHOLD, oldSpoolThreshold, spoolThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpoolUsedHeapMemoryLimit() {
		return spoolUsedHeapMemoryLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpoolUsedHeapMemoryLimit(String newSpoolUsedHeapMemoryLimit) {
		String oldSpoolUsedHeapMemoryLimit = spoolUsedHeapMemoryLimit;
		spoolUsedHeapMemoryLimit = newSpoolUsedHeapMemoryLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_USED_HEAP_MEMORY_LIMIT, oldSpoolUsedHeapMemoryLimit, spoolUsedHeapMemoryLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpoolUsedHeapMemoryThreshold() {
		return spoolUsedHeapMemoryThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpoolUsedHeapMemoryThreshold(String newSpoolUsedHeapMemoryThreshold) {
		String oldSpoolUsedHeapMemoryThreshold = spoolUsedHeapMemoryThreshold;
		spoolUsedHeapMemoryThreshold = newSpoolUsedHeapMemoryThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_USED_HEAP_MEMORY_THRESHOLD, oldSpoolUsedHeapMemoryThreshold, spoolUsedHeapMemoryThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatisticsEnabled() {
		return statisticsEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatisticsEnabled(String newStatisticsEnabled) {
		String oldStatisticsEnabled = statisticsEnabled;
		statisticsEnabled = newStatisticsEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__STATISTICS_ENABLED, oldStatisticsEnabled, statisticsEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__ALLOW_CLASSES:
				return getAllowClasses();
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__ANY_SPOOL_RULES:
				return getAnySpoolRules();
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__BUFFER_SIZE:
				return getBufferSize();
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__DENY_CLASSES:
				return getDenyClasses();
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__ENABLED:
				return getEnabled();
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__REMOVE_SPOOL_DIRECTORY_WHEN_STOPPING:
				return getRemoveSpoolDirectoryWhenStopping();
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_CIPHER:
				return getSpoolCipher();
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_DIRECTORY:
				return getSpoolDirectory();
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_ENABLED:
				return getSpoolEnabled();
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_RULES:
				return getSpoolRules();
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_THRESHOLD:
				return getSpoolThreshold();
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_USED_HEAP_MEMORY_LIMIT:
				return getSpoolUsedHeapMemoryLimit();
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_USED_HEAP_MEMORY_THRESHOLD:
				return getSpoolUsedHeapMemoryThreshold();
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__STATISTICS_ENABLED:
				return getStatisticsEnabled();
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
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__ALLOW_CLASSES:
				setAllowClasses((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__ANY_SPOOL_RULES:
				setAnySpoolRules((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__BUFFER_SIZE:
				setBufferSize((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__DENY_CLASSES:
				setDenyClasses((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__ENABLED:
				setEnabled((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__REMOVE_SPOOL_DIRECTORY_WHEN_STOPPING:
				setRemoveSpoolDirectoryWhenStopping((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_CIPHER:
				setSpoolCipher((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_DIRECTORY:
				setSpoolDirectory((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_ENABLED:
				setSpoolEnabled((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_RULES:
				setSpoolRules((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_THRESHOLD:
				setSpoolThreshold((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_USED_HEAP_MEMORY_LIMIT:
				setSpoolUsedHeapMemoryLimit((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_USED_HEAP_MEMORY_THRESHOLD:
				setSpoolUsedHeapMemoryThreshold((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__STATISTICS_ENABLED:
				setStatisticsEnabled((String)newValue);
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
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__ALLOW_CLASSES:
				setAllowClasses(ALLOW_CLASSES_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__ANY_SPOOL_RULES:
				setAnySpoolRules(ANY_SPOOL_RULES_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__BUFFER_SIZE:
				setBufferSize(BUFFER_SIZE_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__DENY_CLASSES:
				setDenyClasses(DENY_CLASSES_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__REMOVE_SPOOL_DIRECTORY_WHEN_STOPPING:
				setRemoveSpoolDirectoryWhenStopping(REMOVE_SPOOL_DIRECTORY_WHEN_STOPPING_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_CIPHER:
				setSpoolCipher(SPOOL_CIPHER_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_DIRECTORY:
				setSpoolDirectory(SPOOL_DIRECTORY_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_ENABLED:
				setSpoolEnabled(SPOOL_ENABLED_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_RULES:
				setSpoolRules(SPOOL_RULES_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_THRESHOLD:
				setSpoolThreshold(SPOOL_THRESHOLD_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_USED_HEAP_MEMORY_LIMIT:
				setSpoolUsedHeapMemoryLimit(SPOOL_USED_HEAP_MEMORY_LIMIT_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_USED_HEAP_MEMORY_THRESHOLD:
				setSpoolUsedHeapMemoryThreshold(SPOOL_USED_HEAP_MEMORY_THRESHOLD_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__STATISTICS_ENABLED:
				setStatisticsEnabled(STATISTICS_ENABLED_EDEFAULT);
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
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__ALLOW_CLASSES:
				return ALLOW_CLASSES_EDEFAULT == null ? allowClasses != null : !ALLOW_CLASSES_EDEFAULT.equals(allowClasses);
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__ANY_SPOOL_RULES:
				return ANY_SPOOL_RULES_EDEFAULT == null ? anySpoolRules != null : !ANY_SPOOL_RULES_EDEFAULT.equals(anySpoolRules);
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__BUFFER_SIZE:
				return BUFFER_SIZE_EDEFAULT == null ? bufferSize != null : !BUFFER_SIZE_EDEFAULT.equals(bufferSize);
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__DENY_CLASSES:
				return DENY_CLASSES_EDEFAULT == null ? denyClasses != null : !DENY_CLASSES_EDEFAULT.equals(denyClasses);
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__ENABLED:
				return ENABLED_EDEFAULT == null ? enabled != null : !ENABLED_EDEFAULT.equals(enabled);
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__REMOVE_SPOOL_DIRECTORY_WHEN_STOPPING:
				return REMOVE_SPOOL_DIRECTORY_WHEN_STOPPING_EDEFAULT == null ? removeSpoolDirectoryWhenStopping != null : !REMOVE_SPOOL_DIRECTORY_WHEN_STOPPING_EDEFAULT.equals(removeSpoolDirectoryWhenStopping);
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_CIPHER:
				return SPOOL_CIPHER_EDEFAULT == null ? spoolCipher != null : !SPOOL_CIPHER_EDEFAULT.equals(spoolCipher);
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_DIRECTORY:
				return SPOOL_DIRECTORY_EDEFAULT == null ? spoolDirectory != null : !SPOOL_DIRECTORY_EDEFAULT.equals(spoolDirectory);
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_ENABLED:
				return SPOOL_ENABLED_EDEFAULT == null ? spoolEnabled != null : !SPOOL_ENABLED_EDEFAULT.equals(spoolEnabled);
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_RULES:
				return SPOOL_RULES_EDEFAULT == null ? spoolRules != null : !SPOOL_RULES_EDEFAULT.equals(spoolRules);
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_THRESHOLD:
				return SPOOL_THRESHOLD_EDEFAULT == null ? spoolThreshold != null : !SPOOL_THRESHOLD_EDEFAULT.equals(spoolThreshold);
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_USED_HEAP_MEMORY_LIMIT:
				return SPOOL_USED_HEAP_MEMORY_LIMIT_EDEFAULT == null ? spoolUsedHeapMemoryLimit != null : !SPOOL_USED_HEAP_MEMORY_LIMIT_EDEFAULT.equals(spoolUsedHeapMemoryLimit);
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__SPOOL_USED_HEAP_MEMORY_THRESHOLD:
				return SPOOL_USED_HEAP_MEMORY_THRESHOLD_EDEFAULT == null ? spoolUsedHeapMemoryThreshold != null : !SPOOL_USED_HEAP_MEMORY_THRESHOLD_EDEFAULT.equals(spoolUsedHeapMemoryThreshold);
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION__STATISTICS_ENABLED:
				return STATISTICS_ENABLED_EDEFAULT == null ? statisticsEnabled != null : !STATISTICS_ENABLED_EDEFAULT.equals(statisticsEnabled);
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
		result.append(" (allowClasses: ");
		result.append(allowClasses);
		result.append(", anySpoolRules: ");
		result.append(anySpoolRules);
		result.append(", bufferSize: ");
		result.append(bufferSize);
		result.append(", denyClasses: ");
		result.append(denyClasses);
		result.append(", enabled: ");
		result.append(enabled);
		result.append(", removeSpoolDirectoryWhenStopping: ");
		result.append(removeSpoolDirectoryWhenStopping);
		result.append(", spoolCipher: ");
		result.append(spoolCipher);
		result.append(", spoolDirectory: ");
		result.append(spoolDirectory);
		result.append(", spoolEnabled: ");
		result.append(spoolEnabled);
		result.append(", spoolRules: ");
		result.append(spoolRules);
		result.append(", spoolThreshold: ");
		result.append(spoolThreshold);
		result.append(", spoolUsedHeapMemoryLimit: ");
		result.append(spoolUsedHeapMemoryLimit);
		result.append(", spoolUsedHeapMemoryThreshold: ");
		result.append(spoolUsedHeapMemoryThreshold);
		result.append(", statisticsEnabled: ");
		result.append(statisticsEnabled);
		result.append(')');
		return result.toString();
	}

} //CamelStreamCachingStrategyDefinitionImpl
