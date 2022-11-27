package com.example.learn_spring_with_zaur.hibernate_one_to_one;

import com.example.learn_spring_with_zaur.hibernate_one_to_one.entity.Detail;
import com.example.learn_spring_with_zaur.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(com.example.learn_spring_with_zaur.hibernate_one_to_one.entity.Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();


        Session session = null;
        try {
//            Session session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = new Employee("Zaur", "Tregulov", "IT", 500);
//            Detail detail = new Detail("Baku", "123456789", "zaurtregulov@gmail.com");
//
//            employee.setEmpDetail(detail);
//
//            session.save(employee);
//
//            session.getTransaction().commit();



//            Session session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = new Employee("Oleg", "Smirnov", "Sales", 700);
//            Detail detail = new Detail("Moscow", "987654321", "olejka@gmail.com");
//
//            employee.setEmpDetail(detail);
//
//            session.save(employee);
//
//            session.getTransaction().commit();



            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee emp = session.get(Employee.class, 1);
            System.out.println(emp.getEmpDetail());

            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
