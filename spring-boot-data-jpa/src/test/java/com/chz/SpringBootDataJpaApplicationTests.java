package com.chz;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class SpringBootDataJpaApplicationTests {
    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() {
    }
    @Test
    public void test() throws SQLException {
        System.out.println(dataSource.getConnection());
    }


}
