package com.java_backend.backend.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

// TODO: This is not working properly
@Configuration(proxyBeanMethods = false)
public class SqliteConfig {

    @Autowired
    Environment env;

    @Bean
    public DataSource sqLiteDataSource() {
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        // set directly for now because 
        // Null type mismatch: required '@NonNull String' but the provided value is specified as @NullableJava(536871845)
        dataSource.setDriverClassName("org.sqlite.JDBC");
        dataSource.setUrl(env.getProperty("url"));
        dataSource.setUsername(env.getProperty("user"));
        dataSource.setPassword(env.getProperty("password"));
        return dataSource;
    }
}
