package com.example.learn_spring_with_zaur.aop.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

   @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
       System.out.println("aroundReturnBookLoggingAdvice: trying to return book");
       Object targetMethodResult;

       try {
           targetMethodResult = proceedingJoinPoint.proceed();
       }
       catch (Exception e){
           System.out.println("exception was caught " + e);
           targetMethodResult = "Unknown name of book";
       }
       System.out.println("aroundReturnBookLoggingAdvice: returned book to library");


       return targetMethodResult;

    }
}
