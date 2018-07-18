package com.sz.contorller;

import com.sz.service.UserService;

public class UserContorller {

    private UserService userService;

    public void show(){
        System.out.println("contorller....运行。。。");
        userService.eat();
    }

}
