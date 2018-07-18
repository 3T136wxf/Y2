package com.sz;

import com.sz.pojo.User;
import com.sz.service.StudentService;
import com.sz.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    @Test
    public void m1(){
        ApplicationContext ctx= new ClassPathXmlApplicationContext("aop.xml");
        UserService userService = ctx.getBean("userService", UserService.class);
        userService.login("张三",new User("张三丰"));
        StudentService studentService = ctx.getBean("studentService", StudentService.class);
        studentService.login("李四",new User("李四疯"));
    }
}
