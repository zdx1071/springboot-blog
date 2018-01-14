package com.zdx.service;


import com.zdx.entity.UserInfo;

public interface UserInfoService {

    UserInfo findByUsername(String username);
}

