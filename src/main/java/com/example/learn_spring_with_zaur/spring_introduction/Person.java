package com.example.learn_spring_with_zaur.spring_introduction;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my pet");
        pet.say();
    }
}
