package com.ximalaya.springboot.Service;

import org.springframework.stereotype.Service;

@Service
public class UserService{

    public void addUserService(String name,String age){

        System.out.println(name+age);
    }
}