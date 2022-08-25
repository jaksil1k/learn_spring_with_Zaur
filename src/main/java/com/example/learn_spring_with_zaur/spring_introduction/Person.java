package com.example.learn_spring_with_zaur.spring_introduction;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public Person(){

    }

    public void callYourPet(){
        System.out.println("Hello, my pet");
        pet.say();
    }

    public void setPet(Pet pet){
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }
}
