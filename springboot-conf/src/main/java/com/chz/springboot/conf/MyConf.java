package com.chz.springboot.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

@Configuration//必须要@Configuration或是@Component
public class MyConf implements WebMvcConfigurer {

    @Override//通过重写addResourceHandlers方法重新指定静态资源存放的位置
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //当访问路径中有test,就相当于访问到了classpath:/img/目录下(不支持中间带星),springboot默认的静态资源访问路径失效
        registry.addResourceHandler("/test/**").addResourceLocations("classpath:/img/");
    }

//    @Override//相当于添加一个<mvc:view-controller url="" , view-name="">
//        public void addViewControllers(ViewControllerRegistry registry) {
//        //同样的也会经过视图解析器(在templates目录下)
//        registry.addViewController("/test").setViewName("haha");
//    }

    @Override//添加一个拦截器
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor()
    }

    /**
     * @Bean 注入的bean的名字要于WebMvcAutoConfiguration中的bean的name一样才会自动装配
     * @return
     */
    @Bean//将自定义的viewResolver加入springboot管理的容器
    public ViewResolver viewResolver() {
        return new MyViewResolver();
    }
    @Bean
//spring.mvc.locale会自动拿到header中的locale信息所以@ConditionalOnProperties会生效
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }

    //实现了ViewResolver接口的类就是视图解析器
    public static class MyViewResolver implements ViewResolver {
        @Override
        public View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }
    //实现了LocaleResolver接口的类就是语言环境解析器
    public static class MyLocaleResolver implements LocaleResolver{

        @Override
        public Locale resolveLocale(HttpServletRequest request) {
            return null;
        }

        @Override
        public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

        }
    }
}
