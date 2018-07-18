package com.sz;

import com.sz.pojo.User;
import com.sz.service.StudentService;
import com.sz.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    @Test
    public void m1(){
        ApplicationContext ctx= new ClassPathXmlApplicationContext("aop.xml");
        UserService userService = ctx.getBean("userService", UserService.class);
        userService.show();
        StudentService studentService = ctx.getBean("studentService", StudentService.class);
        studentService.show("张浩");
        StudentService studentService2 = ctx.getBean("studentService", StudentService.class);
        studentService2.login("张浩",new User("陈浩南"));


    }
}
