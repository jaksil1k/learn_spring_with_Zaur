package com.example.learn_spring_with_zaur.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

//    @Pointcut("execution(* com.example.learn_spring_with_zaur.aop.UniLibrary.*(..))")
//    public void allMethodsFromUniLibrary() {}
//    @Pointcut("execution(* com.example.learn_spring_with_zaur.aop.UniLibrary.retrurn*())")
//    private void allReturnMethodsFromUniLibrary() {}
//
//    @Pointcut("allMethodsFromUniLibrary() && !allReturnMethodsFromUniLibrary()")
//    private void allMethodsExceptReturnFromUniLibrary() {}
//
//    @Before("allMethodsExceptReturnFromUniLibrary()")
//    public void BeforeAllLoggingExceptReturnAdvice() {
//        System.out.println("BeforeAllLoggingExceptReturnAdvice Log #2");
//    }

//    @Pointcut("execution(* com.example.learn_spring_with_zaur.aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {}
//
//    @Pointcut("execution(* com.example.learn_spring_with_zaur.aop.UniLibrary.add*())")
//    private void allAddMethodsFromUniLibrary() {}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allAddMethodsFromUniLibrary()")
//    private void allGetAndAddMethodsFromUniLibrary() {}
//
//    //We are considering all methods expect return #1
//    @Before("allGetAndAddMethodsFromUniLibrary()")
//    public void beforeGetAndAddLoggingAdvice(){
//        System.out.println("beforeGetAndAddLoggingAdvice: Log #1");
//    }

//    @Pointcut("execution(* com.example.learn_spring_with_zaur.aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {}
//
//    @Pointcut("execution(* com.example.learn_spring_with_zaur.aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary() {}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromLibrary() {}
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allGetAndReturnMethodsFromLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }

    @Before("com.example.learn_spring_with_zaur.aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetBookAdvice:logging and try to get book/magazine");
    }

}
