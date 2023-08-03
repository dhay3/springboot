package com.chz.conf;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.AbstractFilterRegistrationBean;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.Filter;
import javax.servlet.Registration;
import javax.sql.DataSource;
import java.util.HashMap;

/**
 * @author 82341
 */
//非starter配置druid参数
//@Configuration
public class MyConf {

    @Bean
    //不需要在该类中设置 maxactive...等参数直接通过yml文件传递
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource() {
        final DruidDataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }

    //后台监控系统
    @Bean
    public ServletRegistrationBean<StatViewServlet> statViewServlet() {
        ServletRegistrationBean<StatViewServlet> registrationBean =
                new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
        registrationBean.setLoadOnStartup(1);
        HashMap<String, String> map = new HashMap<>();
        //登入配置
        map.put("loginUsername", "admin");//登入的key是固定的 loginUsername loginPassword
        map.put("loginPassword", "12345");
        //允许谁访问, ip地址
        map.put("allow", "");//参数为空所用人能访问
        //禁止谁访问, ip地址
//        map.put("","");
        registrationBean.setInitParameters(map);
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean<WebStatFilter> filterStatFilter() {
        FilterRegistrationBean<WebStatFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new WebStatFilter());
        HashMap<String, String> map = new HashMap<>();
        //不统计这些
        map.put("exclusion", "*.jsp,*.css,/druid/*");
        registrationBean.setInitParameters(map);
        return registrationBean;
    }
}
