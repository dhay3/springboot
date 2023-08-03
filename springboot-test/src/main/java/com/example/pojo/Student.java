package com.example.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@Data
//@ConfigurationProperties(prefix = "s")
//@Component
//@ConditionalOnMissingBean
@ToString
public class Student {
    @Autowired
    private Cat cat;
    private String name;
    private int age;

//    @Bean
//    @ConfigurationProperties(prefix = "cat")
//    public Cat getCat() {
//        return new Cat();
//    }
    public void a(){
        cat.cry();
    }
}