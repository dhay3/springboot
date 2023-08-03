package com.chz.springboot.pojo;

//@EnableCon
// figurationProperties
public class Student {
    private String username;
    private Integer aga;

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", aga=" + aga +
                '}';
    }
}
