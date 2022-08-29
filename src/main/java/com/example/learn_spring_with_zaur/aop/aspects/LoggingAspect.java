package com.example.learn_spring_with_zaur.aop.aspects;

import com.example.learn_spring_with_zaur.aop.Library;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(public void getBook())")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: trying to get book..");
    }
}