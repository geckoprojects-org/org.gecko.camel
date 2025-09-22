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
 * The Class ListBucketResult.
 *
 * @author Fuchs
 * @since 28.04.2020
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ListBucketResult", namespace = "http://s3.amazonaws.com/doc/2006-03-01/")
public class ListBucketResult {

    @XmlElement(name = "IsTruncated")
    private boolean isTruncated;

    @XmlElement(name = "Contents")
    private List<Content> contents = new ArrayList<>();

    @XmlElement(name = "Name")
    private String name;

    @XmlElement(name = "Prefix")
    private String prefix;

    @XmlElement(name = "Delimiter")
    private String delimiter;

    @XmlElement(name = "MaxKeys")
    private int maxKeys;

    @XmlElementWrapper(name = "CommonPrefixes")
    @XmlElement(name = "Prefix")
    private List<String> commonPrefixes = new ArrayList<>();

    @XmlElement(name = "EncodingType")
    private String encodingType;

    @XmlElement(name = "KeyCount")
    private int keyCount;

    @XmlElement(name = "ContinuationToken")
    private String continuationToken;

    @XmlElement(name = "NextContinuationToken")
    private String nextContinuationToken;

    @XmlElement(name = "StartAfter")
    private String startAfter;

    /**
     * Returns the isTruncated.
     * Set to false if all of the results were returned.
     * Set to true if more keys are available to return.
     * If the number of results exceeds that specified by MaxKeys, all of the results might not be returned.
     *
     * @return the isTruncated
     */
    public boolean isTruncated() {
        return isTruncated;
    }

    /**
     * Sets the isTruncated.
     *
     * @param isTruncated the isTruncated to set
     */
    public void setTruncated(boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * Returns the Bucket name.
     *
     * @return the Bucket name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the Bucket name.
     *
     * @param name the Bucket name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the prefix.
     * Keys that begin with the indicated prefix.
     *
     * @return the prefix
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the prefix.
     *
     * @param prefix the prefix to set
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * Returns the delimiter.
     * Causes keys that contain the same string between the prefix and the first occurrence of the delimiter
     * to be rolled up into a single result element in the CommonPrefixes collection.
     * These rolled-up keys are not returned elsewhere in the response.
     * Each rolled-up result counts as only one return against the MaxKeys value.
     *
     * @return the delimiter
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * Sets the delimiter.
     *
     * @param delimiter the delimiter to set
     */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * Returns the maxKeys.
     * Sets the maximum number of keys returned in the response.
     * By default the API returns up to 1,000 key names. The response might contain fewer keys but will never contain more.
     *
     * @return the maxKeys
     */
    public int getMaxKeys() {
        return maxKeys;
    }

    /**
     * Sets the maxKeys.
     *
     * @param maxKeys the maxKeys to set
     */
    public void setMaxKeys(int maxKeys) {
        this.maxKeys = maxKeys;
    }

    /**
     * Returns the encodingType.
     * Encoding type used by Amazon S3 to encode object key names in the XML response.
     * If you specify the encoding-type request parameter, Amazon S3 includes this element in the response,
     * and returns encoded key name values in the following response elements:
     * <code>Delimiter</code>, <code>Prefix</code>, <code>Key</code>, and <code>StartAfter</code>.
     *
     * @return the encodingType
     */
    public String getEncodingType() {
        return encodingType;
    }

    /**
     * Sets the encodingType.
     *
     * @param encodingType the encodingType to set
     */
    public void setEncodingType(String encodingType) {
        this.encodingType = encodingType;
    }

    /**
     * Returns the keyCount.
     * KeyCount is the number of keys returned with this request.
     * KeyCount will always be less than equals to MaxKeys field.
     * Say you ask for 50 keys, your result will include less than equals 50 keys
     *
     * @return the keyCount
     */
    public int getKeyCount() {
        return keyCount;
    }

    /**
     * Sets the keyCount.
     *
     * @param keyCount the keyCount to set
     */
    public void setKeyCount(int keyCount) {
        this.keyCount = keyCount;
    }

    /**
     * Returns the continuationToken.
     * If ContinuationToken was sent with the request, it is included in the response.
     *
     * @return the continuationToken
     */
    public String getContinuationToken() {
        return continuationToken;
    }

    /**
     * Sets the continuationToken.
     *
     * @param continuationToken the continuationToken to set
     */
    public void setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
    }

    /**
     * Returns the nextContinuationToken.
     * NextContinuationToken is sent when isTruncated is true, which means there are more keys in the bucket that can be listed.
     * The next list requests to Amazon S3 can be continued with this NextContinuationToken.
     * NextContinuationToken is obfuscated and is not a real key
     *
     * @return the nextContinuationToken
     */
    public String getNextContinuationToken() {
        return nextContinuationToken;
    }

    /**
     * Sets the nextContinuationToken.
     *
     * @param nextContinuationToken the nextContinuationToken to set
     */
    public void setNextContinuationToken(String nextContinuationToken) {
        this.nextContinuationToken = nextContinuationToken;
    }

    /**
     * Returns the startAfter.
     * If StartAfter was sent with the request, it is included in the response.
     *
     * @return the startAfter
     */
    public String getStartAfter() {
        return startAfter;
    }

    /**
     * Sets the startAfter.
     *
     * @param startAfter the startAfter to set
     */
    public void setStartAfter(String startAfter) {
        this.startAfter = startAfter;
    }

    /**
     * Returns the contents.
     * Metadata about each object returned.
     *
     * @return the contents
     */
    public List<Content> getContents() {
        return contents;
    }

    /**
     * Sets the contents.
     *
     * @param contents the contents to set
     */
    public void setContents(List<Content> contents) {
        this.contents = contents;
    }

    /**
     * Gets the common prefixes.
     * All of the keys rolled up into a common prefix count as a single return when calculating the number of returns.
     * A response can contain CommonPrefixes only if you specify a delimiter.
     * CommonPrefixes contains all (if there are any) keys between Prefix and the next occurrence of the string specified by a delimiter.
     * CommonPrefixes lists keys that act like subdirectories in the directory specified by Prefix.
     * For example, if the prefix is notes/ and the delimiter is a slash (/) as in notes/summer/july, the common prefix is notes/summer/.
     * All of the keys that roll up into a common prefix count as a single return when calculating the number of returns.
     *
     * @return the common prefixes
     */
    public List<String> getCommonPrefixes() {
        return commonPrefixes;
    }

    /**
     * Sets the common prefixes.
     *
     * @param commonPrefixes the new common prefixes
     */
    public void setCommonPrefixes(List<String> commonPrefixes) {
        this.commonPrefixes = commonPrefixes;
    }


}
