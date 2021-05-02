package com.my.example.proxy.test;

import com.my.example.proxy.handle.StaticProxy;
import com.my.example.proxy.service.MainService;
import com.my.example.proxy.service.impl.MainServiceImpl;

public class StaticTest {

    public static void main (String args[]){
        MainService mainService=new MainServiceImpl();
        MainService staticProxy=new StaticProxy(mainService);
        staticProxy.doSomeThing();
    }


}
