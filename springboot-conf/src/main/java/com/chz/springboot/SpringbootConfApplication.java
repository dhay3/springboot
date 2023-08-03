package com.chz.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootConfiguration, 表示是一个springboot入口类
//@EnableAutoConfiguration, 核心注解,自动配置spring,及引入第三方技术的自动配置
//@ComponentScan, 组件扫描注解:<context:component-scan basePackage="">
//默认扫描的是入口类所在的包及其子包
public class SpringbootConfApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootConfApplication.class, args);
    }

}
