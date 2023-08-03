package com.chz.crud.component;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;
@Configuration
public class MyLocalResolver implements LocaleResolver {

    @Override
    //解析区域信息
    public Locale resolveLocale(HttpServletRequest request) {
        Locale locale= Locale.getDefault();//获取系统默认操作信息
        String l = request.getParameter("l");//获取l=参数
        //如果l不为空
        if (!StringUtils.isEmpty(l)){
            String[] s = l.split("_");
            locale=new Locale(s[0],s[1]);
        }
        //如果l为空返回系统默认操作信息
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
