package com.ximalaya.springboot.Controller;

import com.ximalaya.springboot.Service.UserService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/*
* Created by qinzhikui on 20180915
*/
@Controller
@RequestMapping("/springboot")
public class TestController{

    @Autowired
    UserService userService;

    @RequestMapping("/addUser")
    @ResponseBody
    public String addUser(HttpServletRequest httpServletRequest){
        String name=httpServletRequest.getParameter("name");
        String age=httpServletRequest.getParameter("age");

        userService.addUserService(name,age);
        return "OK";
    }
}