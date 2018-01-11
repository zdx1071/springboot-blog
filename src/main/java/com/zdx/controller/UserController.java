package com.zdx.controller;

import com.zdx.entity.User;
import com.zdx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index")
    public String index(){
        return "user/index";
    }

    @RequestMapping(value = "/show")
    @ResponseBody
    public String show(@RequestParam(value = "name") String name){
        User user = userService.findUserByName(name);
        if(null != user){
            return user.getId() + "/" + user.getName() + "/" + user.getPassword();
        }else{
            return "null";
        }
    }

}
