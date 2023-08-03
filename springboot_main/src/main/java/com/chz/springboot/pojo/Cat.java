package com.chz.springboot.pojo;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    public void run(){
        System.out.println("component without componentScan");
    }
}
