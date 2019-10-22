package com.sion.entry;

import org.springframework.beans.factory.InitializingBean;

public class exampleBean implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("实例Bean初始化");
    }
}
