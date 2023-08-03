package com.chz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JDBCController {
    //springboot对jdbc封装的api
    @Autowired
    JdbcTemplate jdbcTemplate;

    //没有实体类,数据库中的东西用map封装
    @GetMapping("/query")
    public List<Map<String, Object>> JDBCQuery() {
        String sql = "select * from tbl_employee";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return maps;
    }

    @GetMapping("/insert")
    public String addUser() {
        //增删改都是update
        String sql = "insert into teacher values(?,?,?)";
        jdbcTemplate.update(sql, "baby", "22", 1);
        return "insert";
    }

    @GetMapping("/user/{id}")
    public String deleteUser(@PathVariable("id") Integer i) {
        String sql = "delete from tbl_teacher where  id=" + i;
        jdbcTemplate.update(sql);
        return "delete";
    }

    @GetMapping("/update")
    public String updateUser() {
        String sql = "update teacher set gender=? where t_name=?";
        Object[] objects = new Object[2];
        objects[0]=9;
        objects[1]="Mr.T";
        jdbcTemplate.update(sql,objects);
        return "update";
    }
}
