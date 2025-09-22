/*************************************************************************************
 * Copyright (c) 2005, 2020 TragWerk Software Döking+Purtak GbR, Dresden, Germany
 * Author: Fuchs
 * All rights reserved.
 *************************************************************************************/
package org.gecko.minio.impl;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Locale;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * Helper class for handling Minio communication
 *
 * @author Mark Hoffmann
 * @since 13.05.2019
 * @see https://docs.aws.amazon.com/de_de/AmazonS3/latest/dev/RESTAuthentication.html#ConstructingTheAuthenticationHeader
 */
public class MinioRequestSigner {

    /*
     * https://docs.aws.amazon.com/de_de/AmazonS3/latest/dev/RESTAuthentication.html#ConstructingTheAuthenticationHeader
     * Authorization = "AWS" + " " + AWSAccessKeyId + ":" + Signature;
     * Signature = Base64( HMAC-SHA1( YourSecretAccessKey, UTF-8-Encoding-Of( StringToSign ) ) );
     * StringToSign = HTTP-Verb + "\n" +
     * Content-MD5 + "\n" +
     * Content-Type + "\n" +
     * Date + "\n" +
     * CanonicalizedAmzHeaders +
     * CanonicalizedResource;
     * CanonicalizedResource = [ "/" + Bucket ] +
     * <HTTP-Request-URI, from the protocol name up to the query string> +
     * [ subresource, if present. For example "?acl", "?location", "?logging", or "?torrent"];
     * CanonicalizedAmzHeaders = <described below>
     */

    public static final SimpleDateFormat REQUEST_DATE_FORMATTER = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z", Locale.US);

    private static final String HMAC_SHA1_ALGORITHM = "HmacSHA1";
    private static final String HASH_PATTERN = "%s\n\n%s\n%s\n%s";

    /**
     * Calculates a Hmac SHA1 hash after RFC2104
     *
     * @param content the content to be signed
     * @param secretKey the secret key to sign
     * @return the hash as byte array
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeyException
     */
    public static byte[] generateHMACRaw(String content, String secretKey)
            throws NoSuchAlgorithmException, InvalidKeyException {
        if (content == null || secretKey == null) {
            throw new IllegalArgumentException("Both parameters must be set");
        }
        SecretKeySpec signingKey = new SecretKeySpec(secretKey.getBytes(), HMAC_SHA1_ALGORITHM);
        Mac mac = Mac.getInstance(HMAC_SHA1_ALGORITHM);
        mac.init(signingKey);
        return mac.doFinal(content.getBytes());
    }

    /**
     * Calculates a Hmac SHA1 hash after RFC2104, but Base64 encoded
     *
     * @param content the content to be signed
     * @param secretKey the secret key to sign
     * @return the hash as byte array
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeyException
     */
    public static byte[] generateHMACBase64(String content, String secretKey)
            throws NoSuchAlgorithmException, InvalidKeyException {
        byte[] unencoded = generateHMACRaw(content, secretKey);
        return Base64.getEncoder().encode(unencoded);
    }

    /**
     * Calculates a Hmac SHA1 hash after RFC2104, but Base64 encoded
     *
     * @param content the content to be signed
     * @param secretKey the secret key to sign
     * @return the hash as String
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeyException
     */
    public static String generateHMACBase64String(String content, String secretKey)
            throws NoSuchAlgorithmException, InvalidKeyException {
        byte[] unencoded = generateHMACRaw(content, secretKey);
        return Base64.getEncoder().encodeToString(unencoded);
    }

    /**
     * Generates the AWS hash out of the parameters.
     *
     * @param requestMethod the HTTP request method
     * @param contentType the content type
     * @param requestTimestamp the time in format 'EEE, dd MMM yyyy HH:mm:ss Z'
     * @param filePath the bucket file path
     * @param secretKey the secret key
     * @return the AWS hash base 64 encoded
     * @throws InvalidKeyException the invalid key exception
     * @throws SignatureException the signature exception
     * @throws NoSuchAlgorithmException the no such algorithm exception
     * @throws UnsupportedEncodingException
     */
    public static String generateAWSHash(String requestMethod, String contentType, String requestTimestamp, String filePath, String secretKey)
            throws InvalidKeyException, SignatureException, NoSuchAlgorithmException, UnsupportedEncodingException {
        if (requestMethod == null || contentType == null || requestTimestamp == null || filePath == null || secretKey == null) {
            throw new IllegalArgumentException("Error generating AWS hash. All parameter must be set and must not be null");
        }
        String requestToSign = String.format(HASH_PATTERN, requestMethod, contentType, requestTimestamp, filePath);

        // System.out.println(); // XXX remove sysout
        // System.out.println(); // XXX remove sysout
        // System.out.println(requestToSign); // XXX remove sysout

        return MinioRequestSigner.generateHMACBase64String(requestToSign, secretKey);
    }


}
