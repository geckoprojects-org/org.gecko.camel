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
package org.gecko.minio;

/**
 * Execption that is thrown, if the driver is not available for certain reasons
 *
 * @author Mark Hoffmann
 * @since 13.05.2019
 */
public class MinioClientException extends Exception {

    /** serialVersionUID */
    private static final long serialVersionUID = 4160925867371377194L;
    private final String clientId;
    private final int responseCode;
    private final String xmlResponse;

    /**
     * Creates a new instance.
     *
     * @param clientId the client id
     * @param cause the cause
     */
    public MinioClientException(String clientId, Throwable cause) {
        super(String.format("[%s] Error connecting client: %s", clientId, cause.getMessage()), cause);
        this.clientId = clientId;
        responseCode = -1;
        xmlResponse = null;
    }

    /**
     * Creates a new instance.
     *
     * @param clientId the client id
     * @param message the message
     */
    public MinioClientException(String clientId, String message) {
        super(String.format("[%s] Error connecting client: %s", clientId, message));
        this.clientId = clientId;
        responseCode = -1;
        xmlResponse = null;
    }

    /**
     * Creates a new instance.
     */
    public MinioClientException(String clientId, int responseCode, String message) {
        this(clientId, responseCode, message, null);
    }

    /**
     * Creates a new instance.
     */
    public MinioClientException(String clientId, int responseCode, String message, Throwable cause) {
        super(String.format("[%s][%s] Response error: %s", clientId, responseCode, message == null ? "" : message), cause);
        this.clientId = clientId;
        this.responseCode = responseCode;
        xmlResponse = message;
    }


    /**
     * Returns the responseCode.
     *
     * @return the responseCode
     */
    public int getResponseCode() {
        return responseCode;
    }

    /**
     * Returns the clientId.
     *
     * @return the clientId
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Returns the xmlResponse.
     *
     * @return the xmlResponse
     */
    public String getXmlResponse() {
        return xmlResponse;
    }
}
