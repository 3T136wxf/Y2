package com.sz;

import com.sz.bean.Book;
import com.sz.bean.Girl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollectionDI {

    @Test
    public void m1(){
        ApplicationContext ctx= new ClassPathXmlApplicationContext("ioc-collections.xml");

        Girl girl2 = ctx.getBean("girl2", Girl.class);
        System.out.println(girl2);
        Girl girl3 = ctx.getBean("girl3", Girl.class);
        System.out.println(girl3);
        System.out.println(girl3.getLikeRices());
    }

    @Test
    public void m2(){
        ApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
//        Girl girl4 = ctx.getBean("girl4", Girl.class);
//        System.out.println(girl4.getLikeRices().get("like01").getName());

        Book b3 =ctx.getBean("b3",Book.class);
        System.out.println(b3);

    }

}
