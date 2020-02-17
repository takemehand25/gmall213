package com.takemehand.gmall.user.controller;

import com.takemehand.gmall.user.bean.UmsMeber;
import com.takemehand.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userServiceImpl;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public String getAllUser(){
        List<UmsMeber> umsMenbers = userServiceImpl.getAllUser();
        System.out.println(umsMenbers);
        return null;
    }
}
