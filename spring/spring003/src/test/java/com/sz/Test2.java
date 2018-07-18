package com.sz;

import com.sz.pojo.User;
import com.sz.service.StudentService;
import com.sz.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

//    xml 测试
    @Test
    public void m1(){
        ApplicationContext ctx= new ClassPathXmlApplicationContext("xmlAop.xml");
        UserService userService = ctx.getBean("userService", UserService.class);
        userService.add();
        StudentService studentService = ctx.getBean("studentService", StudentService.class);
        studentService.add("张浩");
        StudentService studentService2 = ctx.getBean("studentService", StudentService.class);
        studentService2.login("陈小春",new User("山鸡"));
    }
}
