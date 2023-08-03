package com.chz.cors;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//方法一 全局cors
//@Configuration
public class Config implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //如果没有allowedOrigins,默认所有的跨域请求都能返回数据
        //如果指定了allowedOrigins,就只有指定的域名才能接收到通过该域名解析url返回的数据
        registry.addMapping("/cors/**").allowedOrigins("http://localhost:8080");
    }
}
