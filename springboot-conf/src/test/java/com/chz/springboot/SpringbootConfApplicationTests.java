package com.chz.springboot;

import com.chz.springboot.pojo.Cat;
import com.chz.springboot.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringbootConfApplicationTests {
    @Autowired
    ApplicationContext context;

    @Test
    void contextLoads() {
        Cat bean = context.getBean(Cat.class);
        bean.f();
    }
    @Test
    void test1(){
//        System.out.println(student);
        System.out.println(context.getBean(Student.class));
    }


}
