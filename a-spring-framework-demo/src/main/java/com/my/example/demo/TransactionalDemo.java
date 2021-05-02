package com.my.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.my.example.service.JDBCService;

public class TransactionalDemo {
    public static void main (String args[]){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.my.example.config");
        JDBCService jdbcService=  context.getBean(JDBCService.class);
        jdbcService.testTransactional();
    }
}
