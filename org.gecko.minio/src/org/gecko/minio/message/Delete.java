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

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * The Class Delete.
 *
 * @author Fuchs
 * @since 29.04.2020
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Delete", namespace = "http://s3.amazonaws.com/doc/2006-03-01/")
public class Delete {

    @XmlElement(name = "Quiet")
    // Object Type -> according to the S3 standard, the value should only be marshalled when it is true
    private Boolean quiet;

    @XmlElement(name = "Object")
    private List<ObjectIdentifier> objects = new ArrayList<>();

    /**
     * Gets the quiet.
     *
     * @return the quiet, <code>null</code> means false
     */
    public Boolean getQuiet() {
        return quiet;
    }

    /**
     * Sets the quiet.
     *
     * @param quiet the new quiet
     */
    public void setQuiet(Boolean quiet) {
        if (quiet != null && !quiet.booleanValue()) {
            this.quiet = null; // according to the S3 standard, the value should only be marshalled when it is true
        } else {
            this.quiet = quiet;
        }

    }

    /**
     * Returns the objects.
     *
     * @return the objects
     */
    public List<ObjectIdentifier> getObjects() {
        return objects;
    }

    /**
     * Sets the objects.
     *
     * @param objects the objects to set
     */
    public void setObjects(List<ObjectIdentifier> objects) {
        this.objects = objects;
    }

}
