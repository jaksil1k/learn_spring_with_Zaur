package com.example.learn_spring_with_zaur.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(public void *(..))")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: trying to get book..");
    }

    @Before("execution(* returnBook())")
    public void BeforeReturnBookAdvice(){
        System.out.println("beforeReturnBookAdvice: trying to return book..");
    }
}
