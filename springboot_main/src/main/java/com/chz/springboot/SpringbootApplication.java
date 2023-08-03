package com.chz.springboot;


import com.chz.springboot.pojo.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @SpringBootConfiguration 中的@Configuration表示当前主入口也是一个配置类,所以能导入
 * @EnableAutoConfiguration 会自动导入@Configuration的配置类
 * @ComponentScan 会自动扫描主配置及以下的包, 即(springboot下的包及子包)
 **/

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {//通过args传入虚拟参数
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
