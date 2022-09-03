package com.example.learn_spring_with_zaur.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();


    public void addStudents() {
        Student student1 = new Student("Omirbekov Zhalsylyk", 2, 2.7);
        Student student2 = new Student("Abilgaziev Adi", 2, 3.3);
        Student student3 = new Student("Kanaliev Ildar", 1, 2.3);

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents(){
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }
}
