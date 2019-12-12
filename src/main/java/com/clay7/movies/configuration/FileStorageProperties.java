package com.clay7.movies.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: steventjoa
 * @date: 2019/11/11
 * @modifiedby:
 */

@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {
  private String uploadDir;

  public String getUploadDir() {
    return uploadDir;
  }

  public void setUploadDir(String uploadDir) {
    this.uploadDir = uploadDir;
  }
}