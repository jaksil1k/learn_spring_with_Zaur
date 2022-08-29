package com.example.learn_spring_with_zaur.aop;

import org.springframework.stereotype.Component;

@Component("schoolLibraryBean")
public class SchoolLibrary extends AbstractLibrary{
    public void getBook(){
        System.out.println("We take book from school");
    }
}
