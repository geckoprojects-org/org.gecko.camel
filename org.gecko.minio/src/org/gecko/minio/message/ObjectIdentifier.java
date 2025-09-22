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
 * The Class ObjectIdentifier.
 *
 * @author Fuchs
 * @since 29.04.2020
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ObjectIdentifier {

    @XmlElement(name = "Key")
    private String key;

    @XmlElement(name = "VersionId")
    private String versionId;

    /**
     * Returns the key.
     * Key name of the object to delete
     *
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key.
     * Key name of the object to delete
     *
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Returns the versionId.
     * VersionId for the specific version of the object to delete.
     *
     * @return the versionId
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * Sets the versionId.
     * VersionId for the specific version of the object to delete.
     *
     * @param versionId the versionId to set
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }



}
