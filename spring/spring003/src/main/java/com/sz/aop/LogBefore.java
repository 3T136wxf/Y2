package com.sz.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LogBefore {

//    注解方式
    @Before("execution(public void show(..))")
    public void beforeMethod(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
//        获取访问修饰符 以数字的形式来显示 public = 1  ....
        int modifiers = joinPoint.getSignature().getModifiers();
        System.out.println("访问修饰符等级 modifiers："+modifiers+"   "+Arrays.toString(args));
        System.out.println("注解带参方法前置执行中。。。。。");

    }

    @After("execution(public void show(..))")
    public void afterMethod(JoinPoint joinPoint){
//        获取方法名 joinPoint.getSignature().getName()
//        获取类名 joinPoint.getTarget().getClass()
        System.out.println("类名："+ joinPoint.getTarget().getClass()+ "  方法名："+joinPoint.getSignature().getName()+"后置插入 注解执行 after..........中。。。。");
    }

    @AfterReturning(value = "execution(public String login(..))",returning = "returning")
    public void AfterReturningMethod(String returning){
        System.out.println("返回之后执行，返回值为："+returning);
    }

//    xml方式
    public void beforeMethod2(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        int modifiers = joinPoint.getSignature().getModifiers();
        System.out.println("访问修饰符等级 modifiers:"+modifiers);
        System.out.println(Arrays.toString(args)+" "+"xml带参方法前置执行中。。。。。");
    }

    public void afterMethod2(JoinPoint joinPoint){
        System.out.println("类名："+ joinPoint.getTarget().getClass()+ "  方法名："+joinPoint.getSignature().getName()+"后置插入 xml执行 after..........中。。。。");
    }

    public void AfterReturningMethod2(String returning){
            System.out.println("返回之后执行，返回值为："+returning);
        }

}
