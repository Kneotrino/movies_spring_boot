package com.clay7.movies.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * @author: steventjoa
 * @date: 2019/10/30
 * @modifiedby:
 */

// Allow CORS POLICY
@Configuration
public class AppConfiguration {

  @Autowired
  private Environment env;

}