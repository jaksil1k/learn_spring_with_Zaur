package com.example.learn_spring_with_zaur.aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {
    public void getBook(){
        System.out.println("We take book");
    }
}
