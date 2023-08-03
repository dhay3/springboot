package com.chz.mp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chz.mp.dto.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User>{
}
