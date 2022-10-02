package com.example.learn_spring_with_zaur.hibernate_test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();


        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            List emps = session.createQuery("from Employee")
//                            .getResultList();

            List emps = session.createQuery("from Employee " +
                            "where name = 'Elena' and salary>650")
                    .getResultList();

            for (Object e : emps){
                System.out.println(e);
            }

            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
    }
}