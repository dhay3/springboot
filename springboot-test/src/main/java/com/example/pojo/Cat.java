package com.example.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Cat {
    private String name;
    private String age;

//    public Cat(String name, String age) {
//        this.name = name;
//        this.age = age;
//    }

    public void cry(){
        System.out.println("Miao miao");
    }
}
