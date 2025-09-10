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
import org.eclipse.fennec.camel.camelspring.LogDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.LogDefinitionImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.LogDefinitionImpl#getLoggingLevel <em>Logging Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.LogDefinitionImpl#getLogLanguage <em>Log Language</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.LogDefinitionImpl#getLogName <em>Log Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.LogDefinitionImpl#getMarker <em>Marker</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.LogDefinitionImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogDefinitionImpl extends NoOutputDefinitionImpl implements LogDefinition {
	/**
	 * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated
	 * @ordered
	 */
	protected String logger = LOGGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoggingLevel() <em>Logging Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoggingLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGGING_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoggingLevel() <em>Logging Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoggingLevel()
	 * @generated
	 * @ordered
	 */
	protected String loggingLevel = LOGGING_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogLanguage() <em>Log Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogLanguage() <em>Log Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogLanguage()
	 * @generated
	 * @ordered
	 */
	protected String logLanguage = LOG_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogName() <em>Log Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogName() <em>Log Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogName()
	 * @generated
	 * @ordered
	 */
	protected String logName = LOG_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarker() <em>Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarker()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarker() <em>Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarker()
	 * @generated
	 * @ordered
	 */
	protected String marker = MARKER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getLogDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogger() {
		return logger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogger(String newLogger) {
		String oldLogger = logger;
		logger = newLogger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.LOG_DEFINITION__LOGGER, oldLogger, logger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLoggingLevel() {
		return loggingLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoggingLevel(String newLoggingLevel) {
		String oldLoggingLevel = loggingLevel;
		loggingLevel = newLoggingLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.LOG_DEFINITION__LOGGING_LEVEL, oldLoggingLevel, loggingLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogLanguage() {
		return logLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogLanguage(String newLogLanguage) {
		String oldLogLanguage = logLanguage;
		logLanguage = newLogLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.LOG_DEFINITION__LOG_LANGUAGE, oldLogLanguage, logLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogName() {
		return logName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogName(String newLogName) {
		String oldLogName = logName;
		logName = newLogName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.LOG_DEFINITION__LOG_NAME, oldLogName, logName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMarker() {
		return marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarker(String newMarker) {
		String oldMarker = marker;
		marker = newMarker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.LOG_DEFINITION__MARKER, oldMarker, marker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.LOG_DEFINITION__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.LOG_DEFINITION__LOGGER:
				return getLogger();
			case CamelSpringPackage.LOG_DEFINITION__LOGGING_LEVEL:
				return getLoggingLevel();
			case CamelSpringPackage.LOG_DEFINITION__LOG_LANGUAGE:
				return getLogLanguage();
			case CamelSpringPackage.LOG_DEFINITION__LOG_NAME:
				return getLogName();
			case CamelSpringPackage.LOG_DEFINITION__MARKER:
				return getMarker();
			case CamelSpringPackage.LOG_DEFINITION__MESSAGE:
				return getMessage();
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
			case CamelSpringPackage.LOG_DEFINITION__LOGGER:
				setLogger((String)newValue);
				return;
			case CamelSpringPackage.LOG_DEFINITION__LOGGING_LEVEL:
				setLoggingLevel((String)newValue);
				return;
			case CamelSpringPackage.LOG_DEFINITION__LOG_LANGUAGE:
				setLogLanguage((String)newValue);
				return;
			case CamelSpringPackage.LOG_DEFINITION__LOG_NAME:
				setLogName((String)newValue);
				return;
			case CamelSpringPackage.LOG_DEFINITION__MARKER:
				setMarker((String)newValue);
				return;
			case CamelSpringPackage.LOG_DEFINITION__MESSAGE:
				setMessage((String)newValue);
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
			case CamelSpringPackage.LOG_DEFINITION__LOGGER:
				setLogger(LOGGER_EDEFAULT);
				return;
			case CamelSpringPackage.LOG_DEFINITION__LOGGING_LEVEL:
				setLoggingLevel(LOGGING_LEVEL_EDEFAULT);
				return;
			case CamelSpringPackage.LOG_DEFINITION__LOG_LANGUAGE:
				setLogLanguage(LOG_LANGUAGE_EDEFAULT);
				return;
			case CamelSpringPackage.LOG_DEFINITION__LOG_NAME:
				setLogName(LOG_NAME_EDEFAULT);
				return;
			case CamelSpringPackage.LOG_DEFINITION__MARKER:
				setMarker(MARKER_EDEFAULT);
				return;
			case CamelSpringPackage.LOG_DEFINITION__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
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
			case CamelSpringPackage.LOG_DEFINITION__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
			case CamelSpringPackage.LOG_DEFINITION__LOGGING_LEVEL:
				return LOGGING_LEVEL_EDEFAULT == null ? loggingLevel != null : !LOGGING_LEVEL_EDEFAULT.equals(loggingLevel);
			case CamelSpringPackage.LOG_DEFINITION__LOG_LANGUAGE:
				return LOG_LANGUAGE_EDEFAULT == null ? logLanguage != null : !LOG_LANGUAGE_EDEFAULT.equals(logLanguage);
			case CamelSpringPackage.LOG_DEFINITION__LOG_NAME:
				return LOG_NAME_EDEFAULT == null ? logName != null : !LOG_NAME_EDEFAULT.equals(logName);
			case CamelSpringPackage.LOG_DEFINITION__MARKER:
				return MARKER_EDEFAULT == null ? marker != null : !MARKER_EDEFAULT.equals(marker);
			case CamelSpringPackage.LOG_DEFINITION__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
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
		result.append(" (logger: ");
		result.append(logger);
		result.append(", loggingLevel: ");
		result.append(loggingLevel);
		result.append(", logLanguage: ");
		result.append(logLanguage);
		result.append(", logName: ");
		result.append(logName);
		result.append(", marker: ");
		result.append(marker);
		result.append(", message: ");
		result.append(message);
		result.append(')');
		return result.toString();
	}

} //LogDefinitionImpl
