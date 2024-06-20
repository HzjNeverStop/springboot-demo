package com.example.spring_demo;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

/**
 * @author huzijie
 * @version DemoAutoConfiguration.java, v 0.1 2024年06月20日 14:09 huzijie Exp $
 */
@AutoConfiguration
public class DemoBAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public DemoBean demoBean() {
        return new DemoBean("from DemoBAutoConfiguration");
    }
}
