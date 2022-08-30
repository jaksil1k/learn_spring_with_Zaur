package com.example.learn_spring_with_zaur.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {
    @Before("com.example.learn_spring_with_zaur.aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetExceptionHandlingException() {
        System.out.println("beforeGetExceptionHandlingException: catch/handling exception while trying to get book/magazine");
    }
}
