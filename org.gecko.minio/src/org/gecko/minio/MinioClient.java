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

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Consumer;

import org.gecko.minio.message.DeleteObjectsOutput;
import org.gecko.minio.message.ListAllMyBucketsResult;
import org.gecko.minio.message.ListBucketResult;

/**
 * Interface for an Min.io client driver.
 * Subset of the Amazon S3 Protocol. See https://docs.aws.amazon.com/AmazonS3/latest/API/Welcome.html
 *
 * @author Mark Hoffmann
 * @since 13.05.2019
 */
public interface MinioClient {

    /** The Minio Service Component Configuration PID */
    public static final String CONFIGURATION_PID = "MinIOClient";

    /** The Key for the Configuration Property of the MinioConfigName - Expected Value is String */
    public static final String CONFIG_KEY_NAME = "name";

    /** The Key for the Configuration Property of the Minio Server Protocol - Expected Value is String, e.g. <code>http</code> or <code>https</code> */
    public static final String CONFIG_KEY_PROTOCOL = "protocol";

    /** The Key for the Configuration Property of the Minio Server Hostname - Expected Value is String */
    public static final String CONFIG_KEY_HOST = "hostname";

    /** The Key for the Configuration Property of the Minio Server Port - Expected Value is int */
    public static final String CONFIG_KEY_PORT = "port";

    /** The Key for the Configuration Property of the Minio Server Access Key - Expected Value is String */
    public static final String CONFIG_KEY_ACCESSKEY = "accessKey";

    /** The Key for the Configuration Property of the Minio Server Secret Key - Expected Value is String */
    public static final String CONFIG_KEY_SECRETKEY = "secretKey";

    /** The Key for the Configuration Property of the Minio Server Timeout in milliseconds - Expected Value is int */
    public static final String CONFIG_KEY_TIMEOUT = "timeout";

    /**
     * Returns the driver id
     *
     * @return the driver id
     */
    String getId();

    /**
     * Checks whether the Bucket exists and is accesible.
     *
     * @param bucket the bucket
     * @return <code>true</code> if the Bucket exists and is accessible, <code>false</code> otherwise
     * @throws MinioClientException the minio client exception
     */
    boolean bucketExists(String bucket) throws MinioClientException;

    /**
     * Lists all buckets.
     *
     * @return the list all my buckets result
     * @throws MinioClientException the minio client exception
     */
    ListAllMyBucketsResult listBuckets() throws MinioClientException;

    /**
     * Creates a new Bucket.
     *
     * @param bucket the bucket
     * @throws MinioClientException the minio client exception
     */
    void createBucket(String bucket) throws MinioClientException;

    /**
     * Deletes the Bucket.
     *
     * @param bucket the bucket
     * @throws MinioClientException the minio client exception
     */
    void deleteBucket(String bucket) throws MinioClientException;

    /**
     * Returns some or all (up to 1,000) of the objects in a bucket.
     * You can use the request parameters as selection criteria to return a subset of the objects in a bucket.
     * A 200 OK response can contain valid or invalid XML. Make sure to design your application to parse the
     * contents of the response and handle it appropriately.
     *
     * @param bucket the bucket
     * @return the list bucket result
     * @throws MinioClientException the minio client exception
     */
    ListBucketResult listObjects(String bucket) throws MinioClientException;

    /**
     * Returns some or all (up to 1,000) of the objects in a bucket.
     * You can use the request parameters as selection criteria to return a subset of the objects in a bucket.
     * A 200 OK response can contain valid or invalid XML. Make sure to design your application to parse the
     * contents of the response and handle it appropriately.
     *
     * @param bucket the bucket
     * @param continuationToken the continuation token
     * @return the list bucket result
     * @throws MinioClientException the minio client exception
     */
    ListBucketResult listObjects(String bucket, String continuationToken) throws MinioClientException;

    /**
     * Returns some or all (up to 1,000) of the objects in a bucket.
     * You can use the request parameters as selection criteria to return a subset of the objects in a bucket.
     * A 200 OK response can contain valid or invalid XML. Make sure to design your application to parse the
     * contents of the response and handle it appropriately.
     *
     * @param bucket the bucket
     * @param maxKeys the max keys
     * @param continuationToken the continuation token
     * @return the list bucket result
     * @throws MinioClientException the minio client exception
     */
    ListBucketResult listObjects(String bucket, Optional<Integer> maxKeys, Optional<String> continuationToken) throws MinioClientException;

    /**
     * Checks whether the Object exists and is accesible.
     *
     * @param bucket the bucket
     * @param key the Object key
     * @return <code>true</code> if the Object exists and is accessible, <code>false</code> otherwise
     * @throws MinioClientException the minio client exception
     */
    boolean objectExists(String bucket, String key) throws MinioClientException;

    /**
     * Adds an object to a bucket. You must have WRITE permissions on a bucket to add an object to it.
     *
     * @param bucket the bucket
     * @param key the Object Key
     * @param contentType the content type
     * @param content the content
     * @throws MinioClientException the minio client exception
     */
    void putObject(String bucket, String key, String contentType, InputStream content) throws MinioClientException;

    /**
     * Adds an object to a bucket. You must have WRITE permissions on a bucket to add an object to it.
     *
     * @param bucket the bucket
     * @param key the Object Key
     * @param contentType the content type
     * @param content the content
     * @throws MinioClientException the minio client exception
     */
    void putObject(String bucket, String key, String contentType, Consumer<OutputStream> content) throws MinioClientException;

    /**
     * Retriev an object. To use GET, you must have READ access to the object.
     *
     * @param bucket the bucket
     * @param key Key of the object to get
     * @param contentType the content type
     * @return the file
     * @throws MinioClientException the minio client exception
     */
    InputStream getObject(String bucket, String key, String contentType) throws MinioClientException;

    /**
     * Removes an object.
     *
     * @param bucket the bucket
     * @param key Key name of the object to delete
     * @throws MinioClientException the minio client exception
     */
    void deleteObject(String bucket, String key) throws MinioClientException;

    /**
     * This operation enables you to delete multiple objects from a bucket using a single HTTP request.
     * If you know the object keys that you want to delete, then this operation provides a suitable alternative to sending individual delete requests, reducing
     * per-request overhead.
     * The request contains a list of up to 1000 keys that you want to delete. In the XML, you provide the object key names, and optionally,
     * version IDs if you want to delete a specific version of the object from a versioning-enabled bucket. For each key,
     * Amazon S3 performs a delete operation and returns the result of that delete, success, or failure, in the response.
     * Note that if the object specified in the request is not found, Amazon S3 returns the result as deleted.
     * The operation supports two modes for the response: verbose and quiet. By default, the operation uses verbose mode in which the
     * response includes the result of deletion of each key in your request. In quiet mode the response includes only keys where the
     * delete operation encountered an error. For a successful deletion, the operation does not return any information about the delete in the response body.
     *
     * @param bucket the bucket
     * @param keys the keys to delete
     * @throws MinioClientException the minio client exception
     */
    DeleteObjectsOutput deleteObjects(String bucket, Collection<String> keys) throws MinioClientException;

    /**
     * This operation enables you to delete multiple objects from a bucket using a single HTTP request.
     * If you know the object keys that you want to delete, then this operation provides a suitable alternative to sending individual delete requests, reducing
     * per-request overhead.
     * The request contains a list of up to 1000 keys that you want to delete. In the XML, you provide the object key names, and optionally,
     * version IDs if you want to delete a specific version of the object from a versioning-enabled bucket. For each key,
     * Amazon S3 performs a delete operation and returns the result of that delete, success, or failure, in the response.
     * Note that if the object specified in the request is not found, Amazon S3 returns the result as deleted.
     * The operation supports two modes for the response: verbose and quiet. By default, the operation uses verbose mode in which the
     * response includes the result of deletion of each key in your request. In quiet mode the response includes only keys where the
     * delete operation encountered an error. For a successful deletion, the operation does not return any information about the delete in the response body.
     *
     * @param bucket the bucket
     * @param keys the keys to delete
     * @param quiet the quiet
     * @throws MinioClientException the minio client exception
     */
    DeleteObjectsOutput deleteObjects(String bucket, Collection<String> keys, boolean quiet) throws MinioClientException;

}
