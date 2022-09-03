package com.example.learn_spring_with_zaur.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Book book = context.getBean("bookBean", Book.class);

        UniLibrary uniLibrary = context.getBean("uniLibraryBean", UniLibrary.class);
        uniLibrary.getBook();
        uniLibrary.addBook("Zhaksylyk", book);
        uniLibrary.addMagazine();

//        SchoolLibrary schoolLibrary = context.getBean("schoolLibraryBean", SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();
    }
}