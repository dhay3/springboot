package com.example;


import com.example.pojo.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@SpringBootTest
@EnableConfigurationProperties(Student.class)
class MMMMMMMApplicationTests {
    @Autowired
    ApplicationContext context;

    @Test
    void f() throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InstantiationException {
//        System.out.println(context.getBean(Cat.class));
//        System.out.println(context.getBean(Student.class));
        context.getBean("cat");
    }
    @Test
    void f1(){
        new Student().a();
    }

}
