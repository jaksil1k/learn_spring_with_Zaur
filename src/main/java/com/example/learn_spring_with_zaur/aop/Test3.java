package com.example.learn_spring_with_zaur.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibraryBean", UniLibrary.class);
        String bookName = uniLibrary.returnBook();
        System.out.println("to library was returned " + bookName);

        context.close();
        System.out.println("method name ends");
    }
}