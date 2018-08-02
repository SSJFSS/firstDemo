package com.example.demo.controller;

import com.example.demo.dao.LiabraryMessageMapper;
import com.example.demo.pojo.LiabraryMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index/LiabraryMassage")
public class LiabraryMassageController {
    @Autowired
    private LiabraryMessageMapper liabraryMessageMapper;
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public int insertLiabraryMassage(@RequestBody LiabraryMessage liabraryMessage){
        return liabraryMessageMapper.insert(liabraryMessage);
    }
}

