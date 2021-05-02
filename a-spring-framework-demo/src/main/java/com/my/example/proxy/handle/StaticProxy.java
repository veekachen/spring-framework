package com.my.example.proxy.handle;

import com.my.example.proxy.service.MainService;

public class StaticProxy implements MainService {
    private MainService mainService;
    public StaticProxy(MainService mainService){
        this.mainService=mainService;
    }

    @Override
	public void doSomeThing() {
        System.out.println("begin time:"+System.currentTimeMillis());
        mainService.doSomeThing();
        System.out.println("end time:"+System.currentTimeMillis());
    }
}
