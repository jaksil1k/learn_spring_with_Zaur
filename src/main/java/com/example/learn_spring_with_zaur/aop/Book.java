package com.example.learn_spring_with_zaur.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bookBean")
public class Book {
    @Value("Metaphysics")
    private String name;


    public String getName() {
        return name;
    }

}
