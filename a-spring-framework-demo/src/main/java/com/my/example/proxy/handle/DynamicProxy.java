package com.my.example.proxy.handle;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.my.example.proxy.service.MainService;

public class DynamicProxy {
    private MainService mainService;
    public DynamicProxy(MainService mainService){
        this.mainService=mainService;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(
                mainService.getClass().getClassLoader(),
                mainService.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("begin time:"+System.currentTimeMillis());
                        method.invoke(mainService, args);
                        System.out.println("end time:"+System.currentTimeMillis());
                        return null;
                    }
                });
    }
}
