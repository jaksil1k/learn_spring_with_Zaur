package com.example.learn_spring_with_zaur.spring_introduction;

import org.springframework.stereotype.Component;

//@Component("dogBean")
public class Dog implements Pet{
//    private String name;

    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }

    public void init(){
        System.out.println("Class Dog: init method");
    }

    public void destroy(){
        System.out.println("Class Dog: destroy method");
    }
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
