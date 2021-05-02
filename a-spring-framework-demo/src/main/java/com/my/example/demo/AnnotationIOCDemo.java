package com.my.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.my.example.service.IOCService;

public class AnnotationIOCDemo {
    public static void main (String args[]){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.my.example.config");
        IOCService iocService=context.getBean(IOCService.class);
        System.out.println(iocService.hollo());
    }
}
