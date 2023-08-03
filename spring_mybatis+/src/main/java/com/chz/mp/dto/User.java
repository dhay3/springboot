package com.chz.mp.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName
@Data
public class User {
    @TableId(value = "id")
    private Integer no;
    @TableField
    private String username;
    @TableField
    private String address;
}
