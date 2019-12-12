//package com.clay7.movies.configuration;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.jooq.SQLDialect;
//import org.jooq.conf.Settings;
//import org.jooq.impl.DataSourceConnectionProvider;
//import org.jooq.impl.DefaultConfiguration;
//import org.jooq.impl.DefaultDSLContext;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//
//import javax.sql.DataSource;
//import java.util.ArrayList;
//import java.util.List;
//
//
///**
// * Created by xiahonggao on 2017/8/8.
// */
//@Configuration
//@Profile({"dev", "test", "prod"})
//public class JooqConfiguration {
//
//  @Autowired
//  private DatabaseConfig dbConfig;
//
//  @Bean
//  public DataSource dataSource() {
//    DruidDataSource dataSource = new DruidDataSource();
//    dataSource.setUrl(dbConfig.getUrl());
//    dataSource.setUsername(dbConfig.getUserName());
//    dataSource.setPassword(dbConfig.getPassword());
//    dataSource.setInitialSize(dbConfig.getInitialSize());
//    dataSource.setMinIdle(dbConfig.getMinIdle());
//    dataSource.setMaxActive(dbConfig.getMaxActive());
//    dataSource.setMaxWait(dbConfig.getMaxWait());
//    dataSource.setConnectionInitSqls(getInitSqls());
//    return dataSource;
//  }
//
//  @Bean
//  public DataSourceConnectionProvider connectionProvider(DataSource dataSource) {
//    return new DataSourceConnectionProvider(dataSource);
//  }
//
//  @Bean
//  public DefaultDSLContext dslContext(DefaultConfiguration configuration) {
//    return new DefaultDSLContext(configuration);
//  }
//
//  @Bean
//  public DefaultConfiguration configuration(DataSourceConnectionProvider connectionProvider) {
//    DefaultConfiguration configuration = new DefaultConfiguration();
//    configuration.set(connectionProvider);
//    configuration.set(SQLDialect.MYSQL);
//    configuration.set(new Settings().withFetchWarnings(false));
//    return configuration;
//  }
//
//  private List<String> getInitSqls() {
//    List<String> sqls = new ArrayList<>();
//    sqls.add("set names utf8mb4;");
//    return sqls;
//  }
//}