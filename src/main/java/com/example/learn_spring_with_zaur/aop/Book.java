package com.example.learn_spring_with_zaur.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bookBean")
public class Book {
    @Value("Metaphysics")
    private String name;

    @Value("Aristotle")
    private String author;

    @Value("1924")
    private int yearOfPublication;


    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
