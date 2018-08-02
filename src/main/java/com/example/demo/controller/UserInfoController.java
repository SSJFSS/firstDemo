package com.example.demo.controller;

import com.example.demo.dao.UserInfoMapper;
import com.example.demo.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/UserInfo")
public class UserInfoController {
    @Autowired
    private UserInfoMapper userinfomapper;
    @RequestMapping("/getIn")
    public UserInfo hello(){
        return userinfomapper.selectByPrimaryKey(2);
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public UserInfo selectUser(@RequestParam("id")int id){
        return userinfomapper.selectByPrimaryKey(id);
    }
}
