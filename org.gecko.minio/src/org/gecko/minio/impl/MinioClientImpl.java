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

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.Base64;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;
import java.util.function.Consumer;

import jakarta.xml.bind.JAXB;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import org.gecko.minio.MinioClient;
import org.gecko.minio.MinioClientException;
import org.gecko.minio.message.Delete;
import org.gecko.minio.message.DeleteObjectsOutput;
import org.gecko.minio.message.ListAllMyBucketsResult;
import org.gecko.minio.message.ListBucketResult;
import org.gecko.minio.message.ObjectIdentifier;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;

/**
 * @author mark
 * @since 13.05.2019
 */
@Component(name = "MinIOClient", configurationPid = MinioClient.CONFIGURATION_PID, configurationPolicy = ConfigurationPolicy.REQUIRE)
public class MinioClientImpl implements MinioClient {

    private volatile MinioConfig config;
    private volatile String name;

    private @interface MinioConfig {
        String name();

        String protocol()

        default "https";

        String hostname()

        default "localhost";

        int port()

        default 9000;

        String accessKey();

        String secretKey();

        int timeout() default 30;
    }

    /**
     * Called on component activation
     *
     * @param config the configuration
     * @throws ConfigurationException
     */
    @Activate
    public void activate(MinioConfig config) throws ConfigurationException {
        validateConfiguration(config);
        updateConfiguration(config);
    }

    /**
     * Called on component modification, when the configuration changes
     *
     * @param config the configuration
     * @throws ConfigurationException
     */
    @Modified
    public void modified(MinioConfig config) throws ConfigurationException {
        validateConfiguration(config);
        updateConfiguration(config);
    }

    /**
     * Called on component deactivation
     */
    @Deactivate
    public void deactivate() {
        // do nothing
    }

    @Override
    public String getId() {
        return name;
    }

    @Override
    public boolean bucketExists(String bucket) throws MinioClientException {
        checkBucketName(bucket);
        HttpURLConnection client = getConnection("HEAD", "", "", "", "/" + bucket, null);
        try {
            client.connect();
            if (client.getResponseCode() == 200) {
                return true;
            } else if (client.getResponseCode() == 404) {
                return false;
            } else {
                throw new MinioClientException(name, client.getResponseCode(), getErrorMessage(client));
            }
        } catch (IOException e) {
            throw new MinioClientException(name, e);
        }
    }

    @Override
    public ListAllMyBucketsResult listBuckets() throws MinioClientException {
        HttpURLConnection client = getConnection("GET", "", "", "", "/", null);
        try {
            client.connect();
            if (client.getResponseCode() == 200) {
                return JAXB.unmarshal(client.getInputStream(), ListAllMyBucketsResult.class);
            } else {
                throw new MinioClientException(name, client.getResponseCode(), getErrorMessage(client));
            }
        } catch (IOException e) {
            throw new MinioClientException(name, e);
        }
    }

    @Override
    public void createBucket(String bucket) throws MinioClientException {
        checkBucketName(bucket);
        HttpURLConnection client = getConnection("PUT", "", "", "", "/" + bucket, null);
        try {
            client.connect();
            if (client.getResponseCode() != 200) {
                throw new MinioClientException(name, client.getResponseCode(), getErrorMessage(client));
            }
        } catch (IOException e) {
            throw new MinioClientException(name, e);
        }
    }

    @Override
    public void deleteBucket(String bucket) throws MinioClientException {
        checkBucketName(bucket);
        HttpURLConnection client = getConnection("DELETE", "", "", "", "/" + bucket, null);
        try {
            client.connect();
            if (client.getResponseCode() != 204) {
                throw new MinioClientException(name, client.getResponseCode(), getErrorMessage(client));
            }
        } catch (IOException e) {
            throw new MinioClientException(name, e);
        }

    }

    @Override
    public boolean objectExists(String bucket, String key) throws MinioClientException {
        checkBucketName(bucket);
        checkKey(key);
        HttpURLConnection client = getConnection("HEAD", "", "", "", "/" + bucket + "/" + key, null);
        try {
            client.connect();
            if (client.getResponseCode() == 200) {
                return true;
            } else if (client.getResponseCode() == 404) {
                return false;
            } else {
                throw new MinioClientException(name, client.getResponseCode(), getErrorMessage(client));
            }
        } catch (IOException e) {
            throw new MinioClientException(name, e);
        }
    }

    @Override
    public ListBucketResult listObjects(String bucket) throws MinioClientException {
        return listObjects(bucket, null);
    }

    @Override
    public ListBucketResult listObjects(String bucket, String continuationToken) throws MinioClientException {
        return listObjects(bucket, Optional.empty(), Optional.ofNullable(continuationToken));
    }

    @Override
    public ListBucketResult listObjects(String bucket, Optional<Integer> maxKeys, Optional<String> continuationToken) throws MinioClientException {
        checkBucketName(bucket);

        StringBuilder query = new StringBuilder();
        query.append("list-type=2");
        query.append("&delimiter="); // empty
        query.append("&prefix="); // empty
        if (maxKeys.isPresent()) {
            query.append("&max-keys=");
            query.append(maxKeys.get().intValue());
        }
        try {
            if (continuationToken.isPresent()) {
                query.append("&continuation-token=");
                query.append(URLEncoder.encode(continuationToken.get(), "UTF-8"));
            }

            HttpURLConnection client = getConnection("GET", "", "", "", "/" + bucket + "/", query.toString());
            client.connect();
            if (client.getResponseCode() == 200) {
                return JAXB.unmarshal(client.getInputStream(), ListBucketResult.class);
            } else {
                throw new MinioClientException(name, client.getResponseCode(), getErrorMessage(client));
            }
        } catch (IOException e) {
            throw new MinioClientException(name, e);
        }
    }

    @Override
    public InputStream getObject(String bucket, String key, String contentType) throws MinioClientException {
        checkKey(key);
        HttpURLConnection client = getConnection("GET", "", "", contentType, "/" + bucket + "/" + key, null);
        try {
            client.connect();
            if (client.getResponseCode() == 200) {
                return client.getInputStream();
            } else {
                throw new MinioClientException(name, client.getResponseCode(), getErrorMessage(client));
            }
        } catch (IOException e) {
            throw new MinioClientException(name, e);
        }
    }

    @Override
    public void putObject(String bucket, String key, String contentType, InputStream content) throws MinioClientException {
        Consumer<OutputStream> consumer = os -> {
            try (BufferedInputStream bis = new BufferedInputStream(content)) {
                byte[] buffer = new byte[4096];
                for (int length; (length = bis.read(buffer)) >= 0;) {
                    os.write(buffer, 0, length);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
        putObject(bucket, key, contentType, consumer);
    }

    @Override
    public void putObject(String bucket, String key, String contentType, Consumer<OutputStream> content) throws MinioClientException {
        checkKey(key);
        HttpURLConnection client = getConnection("PUT", "", "", contentType, "/" + bucket + "/" + key, null);
        client.setDoOutput(true);
        try (DataOutputStream requestStream = new DataOutputStream(client.getOutputStream())) {
            content.accept(requestStream);
            requestStream.flush();
            if (client.getResponseCode() != 200) {
                throw new MinioClientException(name, client.getResponseCode(), getErrorMessage(client));
            }
        } catch (IOException e) {
            throw new MinioClientException(name, e);
        }
    }

    @Override
    public void deleteObject(String bucket, String key) throws MinioClientException {
        checkKey(key);
        HttpURLConnection client = getConnection("DELETE", "", "", "application/octet-stream", "/" + bucket + "/" + key, null);
        try {
            client.connect();
            if (client.getResponseCode() != 204) {
                throw new MinioClientException(name, client.getResponseCode(), getErrorMessage(client));
            }
        } catch (IOException e) {
            throw new MinioClientException(name, e);
        }
    }

    @Override
    public DeleteObjectsOutput deleteObjects(String bucket, Collection<String> keys) throws MinioClientException {
        return deleteObjects(bucket, keys, false);
    }

    @Override
    public DeleteObjectsOutput deleteObjects(String bucket, Collection<String> keys, boolean quiet) throws MinioClientException {
        checkBucketName(bucket);
        Delete delete = new Delete();
        keys.forEach(k -> {
            ObjectIdentifier objectIdentifier = new ObjectIdentifier();
            objectIdentifier.setKey(k);
            delete.getObjects().add(objectIdentifier);
        });

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Delete.class, ObjectIdentifier.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            // marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
            StringWriter sw = new StringWriter();
            marshaller.marshal(delete, sw);

            String xmlString = sw.getBuffer().toString().trim();
            // System.out.println("XXX" + xmlString + "XXX"); // XXX remove sysout
            String contentLength = String.valueOf(xmlString.length());
            // System.out.println(contentLength); // XXX remove sysout

            byte[] data = xmlString.getBytes(StandardCharsets.UTF_8);
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] digest = md5.digest(data);
            String contentMD5 = Base64.getEncoder().encodeToString(digest);
            // System.out.println(contentMD5); // XXX remove sysout

            HttpURLConnection client = getConnection("POST", contentMD5, contentLength, "application/xml", "/" + bucket + "/", "delete");
            client.setDoInput(true);
            client.setDoOutput(true);

            try (DataOutputStream dos = new DataOutputStream(client.getOutputStream())) {
                dos.write(data);
                dos.flush();
            }
            if (client.getResponseCode() == 200) {
                return JAXB.unmarshal(client.getInputStream(), DeleteObjectsOutput.class);
            } else {
                throw new MinioClientException(name, client.getResponseCode(), getErrorMessage(client));
            }
        } catch (IOException | NoSuchAlgorithmException | JAXBException e) {
            throw new MinioClientException(name, e);
        }
    }

    private String getErrorMessage(HttpURLConnection client) throws IOException {
        try (InputStream errorResponse = client.getErrorStream();
                BufferedInputStream errorBis = new BufferedInputStream(errorResponse);
                ByteArrayOutputStream errorBaos = new ByteArrayOutputStream()) {
            byte[] errorBuffer = new byte[512];
            while (0 < errorBis.read(errorBuffer)) {
                errorBaos.write(errorBuffer);
            }
            return new String(errorBaos.toByteArray(), StandardCharsets.UTF_8);
        }
    }

    /**
     * Validates the configuration for missing properties
     *
     * @param config the configuration to validate
     * @throws ConfigurationException
     */
    private void validateConfiguration(MinioConfig config) throws ConfigurationException {
        if (config.name() == null) {
            throw new ConfigurationException("name", "A driver name must be provided");
        }
        if (config.accessKey() == null) {
            throw new ConfigurationException("accessKey", "An access key must be provided");
        }
        if (config.secretKey() == null) {
            throw new ConfigurationException("secretKey", "A secret key must be provided");
        }
    }

    /**
     * Updates the configuration on changed
     *
     * @param config the current new configuration
     */
    private void updateConfiguration(MinioConfig config) {
        if ( !sameConfigs(this.config, config)) {
            this.config = config;
            name = config.name();
        }
    }

    /**
     * Checks, if the configuration has changed
     *
     * @param oldConfig the old configuration
     * @param newConfig the current new configuration
     * @return <code>true</code>, if the configurations are same
     */
    private boolean sameConfigs(MinioConfig oldConfig, MinioConfig newConfig) {
        if (oldConfig == null && newConfig != null) {
            return false;
        }
        return oldConfig.accessKey().equals(newConfig.accessKey()) &&
                oldConfig.secretKey().equals(newConfig.secretKey()) &&
                oldConfig.name().equals(newConfig.name()) &&
                oldConfig.hostname().equals(newConfig.hostname()) &&
                oldConfig.protocol().equals(newConfig.protocol()) &&
                oldConfig.port() == newConfig.port();

    }

    /**
     * Creates a {@link HttpURLConnection} for the corresponding method and parameters.
     *
     * @param method the HTTP method
     * @param contentMD5 the content MD 5
     * @param contentLength the content length
     * @param contentType the content type
     * @param bucketPath the bucket file path
     * @param query the query
     * @return the {@link HttpURLConnection}
     * @throws MinioClientException the minio client exception
     */
    private HttpURLConnection getConnection(String method, String contentMD5, String contentLength, String contentType, String bucketPath, String query)
            throws MinioClientException {
        if (method == null || contentType == null || bucketPath == null) {
            throw new IllegalArgumentException(String.format("[%s] Error preparing connection: method, contentType and bucketPath must not be null", name));
        }
        String dateString = MinioRequestSigner.REQUEST_DATE_FORMATTER.format(new Date());
        try {
            URI uri = new URI(config.protocol(),
                    null, // user info
                    config.hostname(), config.port(), bucketPath, query,
                    null); // fragment
            URL url = new URL(uri.toASCIIString());
            HttpURLConnection client = (HttpURLConnection) url.openConnection();
            client.setRequestMethod(method);
            client.setConnectTimeout(config.timeout());
            client.addRequestProperty("Host", config.hostname());
            client.addRequestProperty("Content-Type", contentType);
            client.addRequestProperty("Date", dateString);
            String hash = MinioRequestSigner.generateAWSHash(method, contentType, dateString, url.getPath(), config.secretKey());
            client.setRequestProperty("Authorization", String.format("AWS %s:%s", config.accessKey(), hash));
            if ( !contentMD5.isEmpty()) {
                client.addRequestProperty("Content-MD5", contentMD5);
            }
            if ( !contentLength.isEmpty()) {
                client.addRequestProperty("Content-Length", contentLength);
            }

            // System.out.println(dateString + "\t" + hash + "\t" + url.getPath()); // XXX remove sysout

            return client;
        } catch (IOException | URISyntaxException | InvalidKeyException | SignatureException | NoSuchAlgorithmException e) {
            throw new MinioClientException("Error creating connection", e);
        }
    }

    private void checkKey(String key) throws MinioClientException {
        if (key == null || key.isEmpty()) {
            throw new MinioClientException(name, "No Key specified");
        }
    }

    private void checkBucketName(String bucket) throws MinioClientException {
        if (bucket == null) {
            throw new MinioClientException(name, "Bucket name is null");
        }
        if (bucket.length() < 3 || bucket.length() > 63) {
            throw new MinioClientException(name, "Bucket name must be between 3 and 63 characters long");
        }
        if (bucket.contains("..")) {
            throw new MinioClientException(name, "Bucket name must must not contain 2 or more periods (\"..\")");
        }
        if ( !bucket.matches("^[a-z0-9][a-z0-9\\.\\-]+[a-z0-9]$")) {
            throw new MinioClientException(name, "Bucket name may contain only lowercase letters, digits, dots, and minus sign");
        }
    }
}
