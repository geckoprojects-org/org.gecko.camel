/**
 * Copyright (c) 2012 - 2020 Data In Motion and others.
 * All rights reserved.
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * Data In Motion - initial API and implementation
 */
package org.gecko.minio.message;

import java.time.ZonedDateTime;

import org.gecko.minio.impl.ZonedDateTimeAdapter;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * @author Fuchs
 * @since 28.04.2020
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Bucket {

    @XmlElement(name = "CreationDate")
    @XmlJavaTypeAdapter(value = ZonedDateTimeAdapter.class)
    private ZonedDateTime creationDate;

    @XmlElement(name = "Name")
    private String name;

    /**
     * Returns the creationDate.
     *
     * @return the creationDate
     */
    public ZonedDateTime getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the creationDate.
     *
     * @param creationDate the creationDate to set
     */
    public void setCreationDate(ZonedDateTime creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Returns the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }


}
