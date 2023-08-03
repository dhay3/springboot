package com.chz.mp;

import com.chz.mp.dao.UserMapper;
import com.chz.mp.dto.User;
import com.chz.mp.service.UserService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
//如果dao层不加Mapper要加@MapperScan
@MapperScan("com.chz.mp.dao")
class SpringMpApplicationTests {
    @Autowired
    private UserMapper mapper;
    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {
        System.out.println(mapper.selectList(null));
    }
    @Test
    void test(){
        List<User> users = userService.queryAll();
        System.out.println(users);
    }
}
