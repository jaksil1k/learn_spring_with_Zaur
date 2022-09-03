package com.example.learn_spring_with_zaur.aop;

public class Student {
    private String fullName;
    private int course;
    private double GPA;


    public Student(String fullName, int course, double gpa) {
        this.fullName = fullName;
        this.course = course;
        GPA = gpa;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName=" + fullName +
                ", course=" + course +
                ", GPA=" + GPA +
                '}';
    }
}
