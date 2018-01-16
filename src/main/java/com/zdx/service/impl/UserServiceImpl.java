package com.zdx.service.impl;


import com.zdx.dao.UserDao;
import com.zdx.entity.User;
import com.zdx.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }


    @Override
    public User findById(Long id) {
        return userDao.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        userDao.delete(id);
    }

    @Override
    public void edit(User user){
        userDao.save(user);
    }

    @Override
    public List<User> getUserList() {
        return (List<User>) userDao.findAll();
    }
}

