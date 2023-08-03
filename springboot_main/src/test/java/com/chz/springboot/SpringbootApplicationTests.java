package com.chz.springboot;

import com.chz.springboot.pojo.Cat;
import com.chz.springboot.pojo.Dog;
import com.chz.springboot.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 * @SpringBootTest 相当于@RunWith()和@ContextConfiguration,获取ioc容器
 * @BootstrapWith(SpringBootTestContextBootstrapper.class)
 * 相当于以前的RunWith(SpringJunit4ClassRunner.class)但是springboot默认用Junit5,如果需要会自动去找SpringBootConfiguration
 **/
@SpringBootTest
//@EnableConfigurationProperties(Student.class)
class SpringbootApplicationTests {
    @Autowired
    ApplicationContext context;

    @Test
    void contextLoads() {

    }
    @Test//拿到通过@Component注入到ioc中的bean
    void component(){
        Cat bean = context.getBean(Cat.class);
        bean.run();
    }
    @Test//拿到通过@Configuration导入ioc中的bean
    void configuration(){
        System.out.println(context.getBean(Dog.class));
    }

    @Test//拿到通过@ConfigurationProperties
    void configurationProperties(){
        System.out.println(context.getBean(Student.class));
    }
}
