package com.example.learn_spring_with_zaur.aop;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends AbstractLibrary {


    public void getBook(){
        System.out.println("We take book from university");
    }

    String returnBook(){
        System.out.println("We return a book to university");
        return "OK";
    }
    public void getMagazine(){
        System.out.println("We take magazine from university");
    }

    public void returnMagazine(){
        System.out.println("We return magazine to university");
    }

    public void addBook(){
        System.out.println("We add book to university");
    }


    public void addMagazine(){
        System.out.println("We add magazine to university");
    }
}
