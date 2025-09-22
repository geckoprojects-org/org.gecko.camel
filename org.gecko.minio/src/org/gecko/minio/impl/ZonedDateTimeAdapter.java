/*************************************************************************************
 * Copyright (c) 2005, 2020 TragWerk Software Döking+Purtak GbR, Dresden, Germany
 * Author: Fuchs
 * All rights reserved.
 *************************************************************************************/
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
