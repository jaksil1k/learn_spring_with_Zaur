package com.example.learn_spring_with_zaur.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog myDog = context.getBean("dogBean", Dog.class);
        myDog.say();

//        System.out.println(myDog == yourDog);
//        System.out.println(myDog);
//        System.out.println(yourDog);

        context.close();
    }
}
