package com.chz.springboot.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;
import java.util.Map;

/*
将配置文件中配置的每一个属性值映射到这个组件
prefix="student"指定绑定配置文件中的哪一个属性(key)
只有是ioc容器中的组件,才有容器提供的@ConfigurationProperties功能
默认从全局配置文件中获取(application.properties,application.yml)
 */
@Component//如果yml文件不提示要先加载@ConfigurationProperties修饰的类才会生效
@ConfigurationProperties(prefix = "student")//properties或yml中#{}不支持,但是支持${}
/*读取指定位置的prop文件,与@ConfigurationProperties同时存在时@ConfigurationProperties优于@PropertySource
添加注解@Validate 支持jsr303校验*/
//@PropertySource(value = {"classpath:person.properties"})//使用该注解要使用@Value才能赋值
//@PropertySource(value = {"classpath:config/application-dev.yml"})//使用该注解要使用@Value才能赋值,也作用于yml
@Validated//只会对controller过来的数据校验,不会对mybatis入库的数据校验
public class Student {
    //    @Value("丁一")同样适用于springBoot，@ConfigurationProperties按优于@Value，不支持jsr303校验
//    @Email
    @NotBlank
    @Value("${student.name}")//同样可以获取到yml中的参数
    private String name;
    private int age;
    private Boolean gender;
    private Date date;
    private List<Object> list;
    private Map<String, Object> map;
    //引用对象也要getter和setter
    private Dog dog;
    //    通过setter注入
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", date=" + date +
                ", list=" + list +
                ", map=" + map +
                ", dog=" + dog +
                '}';
    }
}
