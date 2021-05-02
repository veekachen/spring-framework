package com.my.example.ext;

import org.springframework.beans.factory.FactoryBean;

/**
 * FactoryBean中 必须存在无参构造函数
 */
public class MyFactoryBean implements FactoryBean<MyFactoryBean> {

    private String name;
    private int age;

    @Override
    public MyFactoryBean getObject() throws Exception {
        MyFactoryBean myFactoryBean = new MyFactoryBean();
        myFactoryBean.name = "aaaabbb";
        myFactoryBean.age = 15;
        return myFactoryBean;
    }

    @Override
    public Class<?> getObjectType() {
        return MyFactoryBean.class;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
