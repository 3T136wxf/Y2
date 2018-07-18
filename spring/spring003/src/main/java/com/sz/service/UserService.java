package com.sz.service;

import com.sz.pojo.User;

public class UserService {

    public void show(){
        System.out.println("UserService 注解执行中。。。。。。。。");
    }

    public void show(String name){
        System.out.println("UserService 注解执行带参。。中。。。。。。。。");
    }

    public void add(){
        System.out.println("UserService xml执行中。。。。。。。。");
    }

    public void add(String name){
        System.out.println("UserService xml执行带参。。中。。。。。。。。");
    }

    public String login(String name,User user){
        System.out.println(name+".......别名.........:"+user);
        return "主人";
    }

}
