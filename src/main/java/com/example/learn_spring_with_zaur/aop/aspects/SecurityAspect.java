package com.example.learn_spring_with_zaur.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspect {
    @Before("com.example.learn_spring_with_zaur.aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeSecurityAdvice: check rights to get book/magazine ");
    }
}
