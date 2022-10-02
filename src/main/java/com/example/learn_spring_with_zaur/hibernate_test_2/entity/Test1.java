package com.example.learn_spring_with_zaur.hibernate_test_2.entity;

import com.example.learn_spring_with_zaur.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(com.example.learn_spring_with_zaur.hibernate_test.entity.Employee.class)
                .buildSessionFactory();


        try {
            Session session = factory.getCurrentSession();
            com.example.learn_spring_with_zaur.hibernate_test.entity.Employee emp = new Employee("Zhaksylyk", "Omirbekov", "junior java", 250);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
    }
}
