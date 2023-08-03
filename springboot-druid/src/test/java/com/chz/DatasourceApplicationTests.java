package com.chz;

import com.chz.dao.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class DatasourceApplicationTests {
    @Autowired
    DataSource dataSource;
    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() throws SQLException {
        //查看数据源
        System.out.println(dataSource.getClass());
        //测试数据源
        Connection connection = dataSource.getConnection();
    }
    @Test
    public void test(){
        System.out.println(userMapper.queryAll());
    }

}
