package com.chz.dao;

import com.chz.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
//PagingAndSortingRepository 有分页功能,CrudRepository 有基本的crud
//JPaRepository 继承了以上两者
//<1,2> 1表示操作的实体类,2表示主键的类型
//不加@Repository同样会注入ioc
public interface UserRepo extends JpaRepository<User,Integer> {
}
