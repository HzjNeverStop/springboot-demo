package com.example.spring_demo;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * @author huzijie
 * @version DemoCAutoConfiguration.java, v 0.1 2024年06月20日 14:20 huzijie Exp $
 */
@AutoConfiguration(after = DemoAAutoConfiguration.class, before = DemoBAutoConfiguration.class)
public class DemoCAutoConfiguration {

    @Bean
    public FilterRegistrationBean<ErrorBean> errorBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new ErrorBean());
        return filterRegistrationBean;
    }
}
