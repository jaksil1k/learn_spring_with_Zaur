package com.example.learn_spring_with_zaur;

import com.example.learn_spring_with_zaur.spring_introduction.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class LearnSpringWithZaurApplication {

    public static void main(String[] args) {
        //SpringApplication.run(LearnSpringWithZaurApplication.class, args);
        Dog dog = new Dog();
        dog.say();
    }

}
