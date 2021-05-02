package com.my.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.example.service.IOCService;

/**
 * @author syj
 * CreateTime 2019/7/18
 * describe:
 */
public class IOCDemo {
    public static void main (String args[]){
        System.setProperty("aaaaa", "application-ioc");
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:${aaaaa}.xml");
        IOCService iocService=context.getBean(IOCService.class);
        System.out.println(iocService.hollo());

        /*
        // 校验依赖的环境变量是否存在
        MyClassPathXmlApplicationContext myClassPathXmlApplicationContext = new MyClassPathXmlApplicationContext("classpath:application-ioc.xml");
        IOCService bean = myClassPathXmlApplicationContext.getBean(IOCService.class);
        System.out.println(bean.hollo());
        */
    }
}
