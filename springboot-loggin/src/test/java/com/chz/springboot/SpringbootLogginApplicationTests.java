package com.chz.springboot;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootLogginApplicationTests {

    @Test
    void contextLoads() {
        //slf4j下的LoggerFactory
        Logger logger = LoggerFactory.getLogger(SpringbootLogginApplication.class);
        //日志级别同(log4j) trace<debug<info<warn<error
        logger.trace("这是trace日志");
        logger.debug("这是debug信息");
        //springboot默认info级别
        logger.info("这是info信息");
        logger.warn("这是warn信息");
        logger.error("这是error信息");
    }

}
