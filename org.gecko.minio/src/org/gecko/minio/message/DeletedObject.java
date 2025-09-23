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
 *      Sebastian Fuchs - TragWerk Software Döking+Purtak GbR, Dresden, Germany
 */
package org.gecko.minio.message;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

/**
 * The Class DeletedObject.
 *
 * @author Fuchs
 * @since 29.04.2020
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class DeletedObject {

    @XmlElement(name = "Key")
    private String key;

    @XmlElement(name = "VersionId")
    private String versionId;

    @XmlElement(name = "DeleteMarker")
    private boolean deleteMarker;

    @XmlElement(name = "DeleteMarkerVersionId")
    private String deleteMarkerVersionId;

    /**
     * Returns the key.
     * The name of the deleted object.
     *
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key.
     *
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Returns the versionId.
     * The version ID of the deleted object.
     *
     * @return the versionId
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * Sets the versionId.
     *
     * @param versionId the versionId to set
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * Returns the deleteMarkerVersionId.
     * The version ID of the delete marker created as a result of the DELETE operation.
     * If you delete a specific object version, the value returned by this header is the version ID of the object version deleted.
     *
     * @return the deleteMarkerVersionId
     */
    public String getDeleteMarkerVersionId() {
        return deleteMarkerVersionId;
    }

    /**
     * Sets the deleteMarkerVersionId.
     *
     * @param deleteMarkerVersionId the deleteMarkerVersionId to set
     */
    public void setDeleteMarkerVersionId(String deleteMarkerVersionId) {
        this.deleteMarkerVersionId = deleteMarkerVersionId;
    }

    /**
     * Returns the deleteMarker.
     * Specifies whether the versioned object that was permanently deleted was (true) or was not (false) a delete marker.
     * In a simple DELETE, this header indicates whether (true) or not (false) a delete marker was created.
     *
     * @return the deleteMarker
     */
    public boolean isDeleteMarker() {
        return deleteMarker;
    }

    /**
     * Sets the deleteMarker.
     *
     * @param deleteMarker the deleteMarker to set
     */
    public void setDeleteMarker(boolean deleteMarker) {
        this.deleteMarker = deleteMarker;
    }

}
