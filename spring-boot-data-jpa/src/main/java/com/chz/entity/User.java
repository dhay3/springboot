package com.chz.entity;

import lombok.Data;

import javax.persistence.*;

@Data
//使用jpa注解配置映射关系
@Entity//告诉jpa这是一个实体类(和数据库表映射的类)
@Table(name = "jpa_user")//指定和那个数据表对应,如果省略默认表明,类名小写
public class User {
    @Id//这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键策略
    private Integer id;
    @Column(name="u_name",length = 50)//表示这是和数据库对应的一个列,length长度
    private String name;
    @Column//如果省略默认列名就是属性名
    private Integer age;
    private Integer gender;
}
