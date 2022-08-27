package com.example.learn_spring_with_zaur.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext2.xml");

//        Dog myDog = context.getBean("myPet", Dog.class);
//        myDog.setName("Belka");
//        Dog yourDog = context.getBean("myPet", Dog.class);
//        yourDog.setName("Strelka");
//
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());
        // when scope of bean is singleton the answer will be: Strelka Strelka
        //when scope is prototype, the answer will be: Belka Strelka
        /*
        Singleton create object when maven reads config file
        Prototype create object when we call method getBean
         */
    }
}
