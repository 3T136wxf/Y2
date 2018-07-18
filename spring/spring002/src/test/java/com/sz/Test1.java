package com.sz;

import com.sz.bean.Book;
import com.sz.bean.Rice;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    @Test
    public void m1(){
        ApplicationContext ctx= new ClassPathXmlApplicationContext("ioc1.xml");
//        通过名字获取比较靠谱
        Book book = (Book) ctx.getBean("book");
//        通过类型去找 要是有两个对象 就不行了
//        Book book = (Book) ctx.getBean(Book.class);
        System.out.println(book);

        Book b2 = (Book) ctx.getBean("book2");
        Book b3 = (Book) ctx.getBean("book2");
        System.out.println(b2==b3);
//        让ctx死亡 但已经过时（不推荐）
//        ((ClassPathXmlApplicationContext) ctx).destroy();
//        关闭上下文
//        ((ClassPathXmlApplicationContext) ctx).close();
        Rice rice = (Rice) ctx.getBean("rice");

        Book b6 = (Book) ctx.getBean("b6");
        System.out.println(b6);
    }

}
