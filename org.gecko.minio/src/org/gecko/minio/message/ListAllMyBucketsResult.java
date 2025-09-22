/*************************************************************************************
 * Copyright (c) 2005, 2020 TragWerk Software Döking+Purtak GbR, Dresden, Germany
 * Author: Fuchs
 * All rights reserved.
 *************************************************************************************/
package org.gecko.minio.message;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * The Class ListBucketsOutput.
 *
 * @author Fuchs
 * @since 28.04.2020
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ListAllMyBucketsResult", namespace = "http://s3.amazonaws.com/doc/2006-03-01/")
public class ListAllMyBucketsResult {

    @XmlElementWrapper(name = "Buckets")
    @XmlElement(name = "Bucket")
    private List<Bucket> buckets = new ArrayList<>();

    @XmlElement(name = "Owner")
    private Owner owner;

    /**
     * @return the buckets
     */
    public List<Bucket> getBuckets() {
        return buckets;
    }

    /**
     * Sets the buckets.
     *
     * @param buckets the new buckets
     */
    public void setBuckets(List<Bucket> buckets) {
        this.buckets = buckets;
    }

    /**
     * Gets the owner.
     *
     * @return the owner
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Sets the owner.
     *
     * @param owner the new owner
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

}
