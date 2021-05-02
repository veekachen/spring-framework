package com.my.example.proxy.handle;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibInterceptor implements MethodInterceptor {


    @Override
	public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("begin time:"+System.currentTimeMillis());
        Object object = methodProxy.invokeSuper(obj, objects);
        System.out.println("end time:"+System.currentTimeMillis());
        return object;
    }
}
