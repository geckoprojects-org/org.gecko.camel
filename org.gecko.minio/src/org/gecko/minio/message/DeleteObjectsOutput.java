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
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * The Class DeleteObjectsOutput.
 *
 * @author Fuchs
 * @since 29.04.2020
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "DeleteObjectsOutput", namespace = "http://s3.amazonaws.com/doc/2006-03-01/")
public class DeleteObjectsOutput {

    @XmlElement(name = "Deleted")
    private List<DeletedObject> deleted = new ArrayList<>();

    @XmlElement(name = "Error")
    private List<Error> errors = new ArrayList<>();


    /**
     * Returns the deleted.
     *
     * @return the deleted
     */
    public List<DeletedObject> getDeleted() {
        return deleted;
    }

    /**
     * Sets the deleted.
     *
     * @param deleted the deleted to set
     */
    public void setDeleted(List<DeletedObject> deleted) {
        this.deleted = deleted;
    }

    /**
     * Returns the errors.
     *
     * @return the errors
     */
    public List<Error> getErrors() {
        return errors;
    }

    /**
     * Sets the errors.
     *
     * @param errors the errors to set
     */
    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }
}
