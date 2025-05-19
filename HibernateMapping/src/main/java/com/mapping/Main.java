package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Courses c1 = new Courses();
        c1.setcId(101);
        c1.setcName("Maths");
        c1.setCredits(5);

        Courses c2 = new Courses();
        c2.setcId(103);
        c2.setcName("English");
        c2.setCredits(3);

        Student s1 = new Student();
        s1.setRollNo(1);
        s1.setsName("Himanshu");
        s1.setsEmail("him@gmail.com");
        s1.setCourses(Arrays.asList(c1,c2));

        c1.setStudent(s1);
        c2.setStudent(s1);

        SessionFactory sf = new Configuration()
                .configure()
                .addAnnotatedClass(com.mapping.Student.class)
                .addAnnotatedClass(com.mapping.Courses.class)
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(c1);
        session.persist(c2);
        session.persist(s1);
        transaction.commit();

        session.close();

//      to get actual data from database, instead of cached data
        session = sf.openSession();
        Student s2 = session.get(Student.class, 1);
//        System.out.println(s2);

        session.close();
        sf.close();


    }
}
