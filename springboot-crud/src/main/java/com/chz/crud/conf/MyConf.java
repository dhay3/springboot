package com.chz.crud.conf;

import com.chz.crud.component.MyLocalResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration//必须加@Configuration配置类才会加入到主配置文件中
//所有springMvc的功能和控制组件都在webMvcConfigurer中
public class MyConf implements WebMvcConfigurer {

//    方法二 通过一个类继承WebMvcConfigurer实现特定功能
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/").setViewName("list");
//    }
//    方法三 注入一个处理springMvc业务的类,一定要返回WebMvcConfigurer和@Bean
    @Bean//将组件注册到容器中
    public WebMvcConfigurer index() {
        return new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/login.html").setViewName("login");
            }
        };
    }

    @Bean
    //加入区域解析器
    public LocaleResolver localResolver(){
      return new MyLocalResolver();
    }



}
