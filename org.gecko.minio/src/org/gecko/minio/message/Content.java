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

import java.time.ZonedDateTime;

import org.gecko.minio.impl.ZonedDateTimeAdapter;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * The Class Content.
 *
 * @author Fuchs
 * @since 28.04.2020
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Content {

    @XmlElement(name = "ETag")
    private String etag;

    @XmlElement(name = "Key")
    private String key;

    @XmlElement(name = "LastModified")
    @XmlJavaTypeAdapter(value = ZonedDateTimeAdapter.class)
    private ZonedDateTime lastModified;

    @XmlElement(name = "Owner")
    private Owner owner;

    @XmlElement(name = "Size")
    private int size;

    @XmlElement(name = "StorageClass")
    private String storageClass;

    /**
     * Returns the etag.
     * The entity tag is an MD5 hash of the object. ETag reflects only changes to the contents of an object, not its metadata.
     *
     * @return the etag
     */
    public String getEtag() {
        return etag;
    }

    /**
     * Sets the etag.
     *
     * @param etag the new etag
     */
    public void setEtag(String etag) {
        this.etag = etag;
    }

    /**
     * Returns the key.
     * The name that you assign to an object. You use the object key to retrieve the object.
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
     * Returns the lastModified.
     * The date the Object was Last Modified
     *
     * @return the lastModified
     */
    public ZonedDateTime getLastModified() {
        return lastModified;
    }

    /**
     * Sets the lastModified.
     *
     * @param lastModified the lastModified to set
     */
    public void setLastModified(ZonedDateTime lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * Returns the owner.
     * The owner of the object
     *
     * @return the owner
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Sets the owner.
     *
     * @param owner the owner to set
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * Returns the size.
     * Size in bytes of the object
     *
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * Sets the size.
     *
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Returns the storageClass.
     * The class of storage used to store the object.
     * Valid Values: <code>STANDARD | REDUCED_REDUNDANCY | GLACIER | STANDARD_IA | ONEZONE_IA | INTELLIGENT_TIERING | DEEP_ARCHIVE</code>
     *
     * @return the storageClass
     */
    public String getStorageClass() {
        return storageClass;
    }

    /**
     * Sets the storageClass.
     *
     * @param storageClass the storageClass to set
     */
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

}
