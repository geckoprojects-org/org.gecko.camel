/*************************************************************************************
 * Copyright (c) 2005, 2020 TragWerk Software Döking+Purtak GbR, Dresden, Germany
 * Author: Fuchs
 * All rights reserved.
 *************************************************************************************/
package org.gecko.minio.message;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

/**
 * The Class Error.
 *
 * @author Fuchs
 * @since 29.04.2020
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Error {

    @XmlElement(name = "Code")
    private String code;

    @XmlElement(name = "Key")
    private String key;

    @XmlElement(name = "Message")
    private String message;

    @XmlElement(name = "VersionId")
    private String versionId;

    /**
     * Returns the code.
     * The error code is a string that uniquely identifies an error condition. It is meant to be read and understood by programs that detect and handle errors
     * by type.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the code.
     * The error code is a string that uniquely identifies an error condition. It is meant to be read and understood by programs that detect and handle errors
     * by type.
     *
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Returns the key.
     * The error key.
     *
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key.
     * The error key.
     *
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Returns the message.
     * The error message contains a generic description of the error condition in English.
     * It is intended for a human audience. Simple programs display the message directly to the end user if
     * they encounter an error condition they don't know how or don't care to handle.
     * Sophisticated programs with more exhaustive error handling and proper internationalization are more likely to ignore the error message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the message.
     * The error message contains a generic description of the error condition in English.
     * It is intended for a human audience. Simple programs display the message directly to the end user if
     * they encounter an error condition they don't know how or don't care to handle.
     * Sophisticated programs with more exhaustive error handling and proper internationalization are more likely to ignore the error message.
     *
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Returns the versionId.
     * The version ID of the error.
     *
     * @return the versionId
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * Sets the versionId.
     * The version ID of the error.
     *
     * @param versionId the versionId to set
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }



}
