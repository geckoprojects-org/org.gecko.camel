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
package org.gecko.minio.impl;

import java.text.ParseException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

/**
 * {@link XmlAdapter} for ZonedDateTime to timestamp
 */
public class ZonedDateTimeAdapter extends XmlAdapter<String, ZonedDateTime> {

    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

    @Override
    public ZonedDateTime unmarshal(String date) throws ParseException {
        return ZonedDateTime.parse(date, dateTimeFormatter);
    }

    @Override
    public String marshal(ZonedDateTime date) {
        return dateTimeFormatter.format(date);
    }
}
