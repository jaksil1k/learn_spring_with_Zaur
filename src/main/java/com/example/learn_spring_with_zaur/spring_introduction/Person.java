package com.example.learn_spring_with_zaur.spring_introduction;

public class Person {
    private Pet pet;
    private String lastName;
    private int age;

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
