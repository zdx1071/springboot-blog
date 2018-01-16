package com.zdx.service;


import com.zdx.entity.User;

import java.util.List;

public interface UserService {

    User findById(Long id);

    void deleteById(Long id);

    void edit(User user);

    List<User> getUserList();

    User findByUsername(String username);
}

