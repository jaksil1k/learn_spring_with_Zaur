package com.example.learn_spring_with_zaur.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
//    @Value("${person.lastName}")
    private String lastName;
//    @Value("${person.age}")
    private int age;

    @Autowired
    public Person(@Qualifier("catBean") Pet pet) {
        System.out.println("Person has been created");
        this.pet = pet;
    }


    public void callYourPet(){
        System.out.println("Hello, my pet");
        pet.say();
    }

//    @Autowired
//    public void setPet(Pet pet){
//        System.out.println("Class Person: set pet");
//        this.pet = pet;
//    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
