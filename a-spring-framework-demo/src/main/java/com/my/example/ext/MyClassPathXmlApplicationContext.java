package com.my.example.ext;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

    public MyClassPathXmlApplicationContext(String configLocation) throws BeansException {
        super(configLocation);
    }

    @Override
    protected void initPropertySources() {
        super.initPropertySources();
        // 添加一个必须检查的环境变量
        this.getEnvironment().setRequiredProperties("MYSQL_HOST");
    }
}
