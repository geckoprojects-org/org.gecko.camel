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
 */
package org.eclipse.fennec.minio.example.impl;

import java.io.FileOutputStream;
import java.io.InputStream;

import org.eclipse.fennec.minio.example.MinIOClient;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class XMIDownloadService {
    
    private Logger logger = LoggerFactory.getLogger(XMIDownloadService.class);
    
    @Reference
    private MinIOClient minioClient;
    
    @Activate
    void activate() {
        logger.info("XMI Download Service activated");
        try {
            downloadXMIFiles();
        } catch (Exception e) {
            logger.error("Failed to download XMI files", e);
        }
    }
    
    private void downloadXMIFiles() throws Exception {
        String bucketName = "test";
        
        // Download Person.xmi
        downloadFile(bucketName, "Person.xmi", "/tmp/PersonMIO.xmi");
        
        // Download Address.xmi  
        downloadFile(bucketName, "Address.xmi", "/tmp/AddressMIO.xmi");
        
        logger.info("Successfully downloaded XMI files from bucket: {}", bucketName);
    }
    
    private void downloadFile(String bucketName, String objectName, String targetPath) throws Exception {
    	try (InputStream inputStream = minioClient.getObject(bucketName, objectName);
//        try (InputStream inputStream = minioClient.getObject(bucketName, objectName, "application/octet-stream");
             FileOutputStream outputStream = new FileOutputStream(targetPath)) {
            
            inputStream.transferTo(outputStream);
            logger.info("Downloaded {} to {}", objectName, targetPath);
        }
    }
}