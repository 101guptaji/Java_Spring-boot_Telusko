package com.hg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello");

        Student s1 = new Student();
        s1.setId(103);
        s1.setName("Roshan");
        s1.setEmail("avni@gmail.com");

//        System.out.println(s1);

//        Create a configuration using hibernate library
        Configuration config = new Configuration();

        config.addAnnotatedClass(com.hg.Student.class);
        config.configure("hibernate.cfg.xml"); // create a file name hibernate.cfg.xml in Resource folder

        Session session;
        SessionFactory sf = config.buildSessionFactory();
        session = sf.openSession();

//        To insert a data
//        Transaction transaction = session.beginTransaction();
////        session.save(s1);
//        session.persist(s1);
//        transaction.commit();


//        To get a data
//        Student s2 = session.get(Student.class, 101);
//        System.out.println(s2);


//        Update or insert a data
//        s1.setName("UpdatedName");
//        Transaction transaction = session.beginTransaction();
//        session.merge(s1);
//        transaction.commit();

//        Delete a record
        Student s2 = session.get(Student.class, 102);
        if(s2!=null) {
            Transaction transaction = session.beginTransaction();
            session.remove(s2);
            transaction.commit();
        }


        session.close();
        sf.close();
    }
}
