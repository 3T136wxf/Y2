package com.sz.service;


import com.sz.pojo.User;

public class StudentService {

    public void show(){
        System.out.println("StudentService  注解执行中。。。。。。");
    }

    public void show(String name){
        System.out.println("StudentService  注解带参执行中。。。。。。");
    }

    public void add(){
        System.out.println("StudentService  xml执行中。。。。。。");
    }

    public void add(String name){
        System.out.println("StudentService  xml带参执行中。。。。。。");
    }

    public String login(String name,User user){
        System.out.println(name+"....别名............: "+user);
        return "学生";
    }

}
