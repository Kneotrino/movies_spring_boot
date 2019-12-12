package com.clay7.movies.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by xiahonggao on 2017/9/10.
 */
@Component
@Profile({"dev", "test", "prod"})
public class DatabaseConfig {
  @Value("${db.url}")
  private String url;
  @Value("${db.user}")
  private String userName;
  @Value("${db.password}")
  private String password;
  @Value("${db.initialSize}")
  private Integer initialSize;
  @Value("${db.minIdle}")
  private Integer minIdle;
  @Value("${db.maxActive}")
  private Integer maxActive;
  @Value("${db.maxWaitMillis}")
  private Integer maxWait;

  public String getUrl() {
    return url;
  }

  public String getUserName() {
    return userName;
  }

  public String getPassword() {
    return password;
  }

  public Integer getInitialSize() {
    return initialSize;
  }

  public Integer getMinIdle() {
    return initialSize;
  }

  public Integer getMaxActive() {
    return maxActive;
  }

  public Integer getMaxWait() {
    return maxWait;
  }
}
