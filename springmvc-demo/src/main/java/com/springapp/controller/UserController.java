package com.springapp.controller;

import com.springapp.pojo.User;
import com.springapp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Title:
 * Description:
 * Create Time: 2016/6/21 0021 23:25
 *
 * @author: YEEQiang
 * @version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("hello")
    public String hello(HttpServletRequest requset) {
        User user = new User();
        user.setUserName("yiqiang-chen");
        user.setAge(26);
        userService.hello(user);
        requset.setAttribute("user",user);
        return "user/userHello";
    }
}
