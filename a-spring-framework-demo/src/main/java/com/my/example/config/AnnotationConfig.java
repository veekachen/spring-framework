package com.my.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.my.example.service.IOCService;
import com.my.example.service.impl.IOCServiceImpl;

@EnableAspectJAutoProxy
@Configuration
public class AnnotationConfig {
    @Bean
    public IOCService iocService(){
        return new IOCServiceImpl();
    }
}
