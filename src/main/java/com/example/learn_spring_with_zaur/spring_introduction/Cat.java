package com.example.learn_spring_with_zaur.spring_introduction;


import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet{
    public Cat(){
        System.out.println("Cat bean has created");
    }
    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
