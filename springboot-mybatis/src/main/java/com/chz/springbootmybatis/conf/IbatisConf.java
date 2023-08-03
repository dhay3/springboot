package com.chz.springbootmybatis.conf;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IbatisConf {
    //mybatis自定义配置类
    @Bean
    public ConfigurationCustomizer configurationCustomizer() {
        //mybatis默认不开启驼峰命名
        return configuration -> {
            configuration.setMapUnderscoreToCamelCase(true);
//            configuration.setAggressiveLazyLoading(true);
        };
    }
}
