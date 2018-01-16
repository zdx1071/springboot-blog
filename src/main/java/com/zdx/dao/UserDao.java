package com.zdx.dao;

import com.zdx.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,Long>{
    //通过username查找用户信息
    User findByUsername(String username);
    User findById(Long id);

}
