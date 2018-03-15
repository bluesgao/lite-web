package com.gx.liteweb.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @ClassName:WebAppInitializer
 * @Description:应用启动入口和各类配置
 * @Author:gaoxin11
 * @Date:2018/3/15 10:09
 **/
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    private static final Logger LOG = LoggerFactory.getLogger(WebAppInitializer.class);

    @Override
    protected Class<?>[] getRootConfigClasses() {
        LOG.info("------RootConfig 配置类初始化------");
        return new Class<?>[] { RootConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        LOG.info("------ServletConfig 配置类初始化------");
        return new Class<?>[] { WebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        LOG.info("------ServletMappings 映射根路径初始化------");
        //请求路径映射
        return new String[]{"/"};
    }
}
