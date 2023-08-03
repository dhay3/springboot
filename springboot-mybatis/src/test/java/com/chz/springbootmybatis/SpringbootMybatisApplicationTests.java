package com.chz.springbootmybatis;

import com.chz.springbootmybatis.service.impl.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
//@MapperScan(basePackages = {"com.chz.springbootmybatis.*"})//@Mapper所在的包
class SpringbootMybatisApplicationTests {
    @Autowired
    ApplicationContext context;
    @Test
    void contextLoads() {
//        for (User user : context.getBean(UserMapper.class).queryAll()) {
//            System.out.println(user);
//        }
        UserService service = (UserService)context.getBean("service");
        System.out.println(service.queryAll());
    }

}
