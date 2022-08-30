package com.example.learn_spring_with_zaur.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* get*())")
    public void allGetMethods(){}

}
