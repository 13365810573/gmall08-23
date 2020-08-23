package com.gmall.gmall.user.controller;


import com.gmall.gmall.user.bean.UmsMember;
import com.gmall.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/getUser")
    @ResponseBody
    public List<UmsMember> getUser(){

       List<UmsMember> UmsMember = userService.getUser();

        return UmsMember;
    }


}
