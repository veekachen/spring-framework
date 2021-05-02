package com.my.example.proxy.test;

import com.my.example.proxy.handle.DynamicProxy;
import com.my.example.proxy.service.MainService;
import com.my.example.proxy.service.impl.MainServiceImpl;

public class DynamicTest {

    public static void main (String args[]){
        MainService mainService=new MainServiceImpl();
        DynamicProxy dynamicProxy=new DynamicProxy(mainService);
        ((MainService)dynamicProxy.getProxy()).doSomeThing();
    }


}
