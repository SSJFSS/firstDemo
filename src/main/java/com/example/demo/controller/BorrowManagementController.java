package com.example.demo.controller;

import com.example.demo.dao.BorrowManagementMapper;
import com.example.demo.pojo.BorrowManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index/BorrowManagement")
public class BorrowManagementController {
    @Autowired
    private BorrowManagementMapper borrowManagementMapper;
    @RequestMapping(value = "/insert",method = {RequestMethod.POST})
    public int insertBorrow(@RequestBody BorrowManagement borrowManagement){
        return borrowManagementMapper.insert(borrowManagement);
    }
}
