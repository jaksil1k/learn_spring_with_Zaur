package com.example.learn_spring_with_zaur.hibernate_test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();


        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Zhaksylyk", "Omirbekov", "junior java", 250);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
    }
}
