package com.gx.liteweb.config;

import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
* @ClassName:RootConfig
* @Description: 配置类，用于管理ContextLoadListener创建的上下文的bean
* @Author:gaoxin11
* @Date:2018/3/15 10:14
**/
@Configuration
@ComponentScan(basePackages = {"com.gx.liteweb.config", "com.gx.liteweb.dao", "com.gx.liteweb.service"})
@Import(DataSourceConfig.class)
public class RootConfig {

    @Bean
    public BeanNameAutoProxyCreator proxyCreator(){
        BeanNameAutoProxyCreator proxyCreator = new BeanNameAutoProxyCreator();
        proxyCreator.setProxyTargetClass(true);
        proxyCreator.setBeanNames("*ServiceImpl");
        proxyCreator.setInterceptorNames("transactionInterceptor");
        return proxyCreator;
    }
}
