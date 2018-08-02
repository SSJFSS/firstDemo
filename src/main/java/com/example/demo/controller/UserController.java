package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/index")
public class UserController {

    @RequestMapping("/BorrowManagement")
    public String BorrowManagement(){
        return "/BorrowManagement";
    }
    @RequestMapping("/ReturnManagement")
    public String ReturnManagement(){
        return "/ReturnManagement";
    }
    @RequestMapping("/BookSearch")
    public String BookSearch(){
        return "/hello";
    }
    @RequestMapping("/LiabraryMessage")
    public String LiabraryMassage(){
        return "/LiabraryMessage";
    }


}
