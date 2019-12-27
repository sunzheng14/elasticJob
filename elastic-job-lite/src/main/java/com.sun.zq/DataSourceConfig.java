package com.sun.zq;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean(name = "dataSource")
    @Qualifier("dataSource")
    @ConfigurationProperties(prefix="spring.datasource.other")
    public DataSource getMyDataSource(){
        return DataSourceBuilder.create().build();
    }
}
