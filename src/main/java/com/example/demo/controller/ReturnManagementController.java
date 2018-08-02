package com.example.demo.controller;

import com.example.demo.dao.ReturnManagementMapper;
import com.example.demo.pojo.ReturnManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
@RequestMapping("/index/ReturnManagement")
public class ReturnManagementController {
    @Autowired
    private ReturnManagementMapper returnManagementMapper;
    @RequestMapping(value = "/insert",method = {RequestMethod.POST})
    public int insertReturn(@RequestBody ReturnManagement returnManagement){
        return returnManagementMapper.insert(returnManagement);
    }
}
