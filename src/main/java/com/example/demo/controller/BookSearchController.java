package com.example.demo.controller;

import com.example.demo.dao.LiabraryMessageMapper;
import com.example.demo.pojo.LiabraryMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/index")
public class BookSearchController {
    @Autowired
    private LiabraryMessageMapper liabraryMessageMapper;
    @RequestMapping(value = "/SearchLiabrary",method = RequestMethod.POST)
    public LiabraryMessage searchLiabrary(@RequestBody LiabraryMessage liabraryMessage){
        return liabraryMessageMapper.selectByPrimaryKey(liabraryMessage.getBookname());
    }
}
