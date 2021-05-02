package com.my.example.proxy.test;

import org.springframework.cglib.proxy.Enhancer;

import com.my.example.proxy.handle.CglibInterceptor;
import com.my.example.proxy.service.MainService;
import com.my.example.proxy.service.impl.MainServiceImpl;

public class CglibTest {

    public static void main (String args[]){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(MainServiceImpl.class);
        enhancer.setCallback(new CglibInterceptor());
        MainService proxy= (MainService)enhancer.create();
        proxy.doSomeThing();
    }
}
