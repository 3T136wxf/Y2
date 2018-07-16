package com.sz;

import com.sz.entity.Car;
import com.sz.entity.Moot;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    @Test
    public void m(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"spring.xml","moot.xml"});
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);

    }

    @Test
    public void m1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);

    }

    @Test
    public void m2(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("moot.xml");
        Moot moot = (Moot) ctx.getBean("moot");
        System.out.println(moot);

    }

}
