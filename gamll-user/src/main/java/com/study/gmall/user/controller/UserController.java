package com.study.gmall.user.controller;

import com.study.gmall.user.bean.UserMember;
import com.study.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: CHENLH
 * @Description:
 * @Date: Create in 17:49 2020/5/7
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String test() {
        return "hello world";
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UserMember> getAllUser() {
        return userService.getAllUser();
    }

}
