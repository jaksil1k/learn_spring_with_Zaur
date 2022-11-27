package com.example.learn_spring_with_zaur.hibernate_one_to_one;

import com.example.learn_spring_with_zaur.hibernate_one_to_one.entity.Detail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(com.example.learn_spring_with_zaur.hibernate_one_to_one.entity.Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();


        Session session = null;
        try {

//            session = factory.getCurrentSession();
//            Employee employee = new Employee("Nikolay", "Romanov"
//            , "tsar", 1000);
//            Detail detail = new Detail("Petersburg", "000000001"
//            ,"lastTsar@gmail.com");
//            session.beginTransaction();
//            //Detail detail = session.get(Detail.class, 4);
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);
//            //session.delete(detail);
//            session.save(detail);
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Detail detail = session.get(Detail.class, 6);
//            System.out.println(detail.getEmployee());
//            session.getTransaction().commit();
//            System.out.println("Done!");

            session = factory.getCurrentSession();
            session.beginTransaction();

//            Detail detail = session.get(Detail.class, 5);
//            session.delete(detail);
//            Employee employee = session.get(Employee.class, 3);
//            session.delete(employee);

//            Detail detail = session.get(Detail.class, 6);

            Detail detail = session.get(Detail.class, 1);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);


            session.getTransaction().commit();
            System.out.println("Done!");

        }
        finally {
            session.close();
            factory.close();
        }
    }
}
