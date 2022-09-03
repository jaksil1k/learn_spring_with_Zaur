package com.example.learn_spring_with_zaur.aop;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends AbstractLibrary {


    public void getBook(){
        System.out.println("We take book from university");
        System.out.println("-------------------------------------");
    }

    public void returnBook(){
        System.out.println("We return a book to university");
        System.out.println("-------------------------------------");
    }
    public void getMagazine(){
        System.out.println("We take magazine from university");
        System.out.println("-------------------------------------");
    }

    public void returnMagazine(){
        System.out.println("We return magazine to university");
        System.out.println("-------------------------------------");
    }

    public void addBook(String personName, Book book){
        System.out.println("We add book to university");
        System.out.println("-------------------------------------");
    }


    public void addMagazine(){
        System.out.println("We add magazine to university");
        System.out.println("-------------------------------------");
    }
}
