package com.my.example.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;

import com.my.example.service.JDBCService;
import com.my.example.service.impl.JDBCServiceImpl;

@EnableTransactionManagement
@Configuration
public class JDBCConfig {
    @Bean
    public DruidDataSource druidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root");
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3307/demo?characterEncoding=utf-8&useSSL=false");
        return druidDataSource;
    }

    @Bean
    public JDBCService jdbcService(DruidDataSource druidDataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(druidDataSource);
        JDBCService jdbcService = new JDBCServiceImpl(jdbcTemplate);
        return jdbcService;
    }

    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager(DruidDataSource druidDataSource) {
        return new DataSourceTransactionManager(druidDataSource);
    }
}
