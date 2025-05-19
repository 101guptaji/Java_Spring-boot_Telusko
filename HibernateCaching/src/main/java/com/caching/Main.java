package com.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Departments dp = new Departments();
        dp.setDepart_name("Electrical");
        dp.setBatches(3);
        dp.setHod("Pooja");


        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Departments.class);
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();

        Session session = sf.openSession();

//        Transaction transaction = session.beginTransaction();
//        session.persist(dp);
//        transaction.commit();

//        Query query = session.createQuery("FROM Departments where hod = :hod");
//        query.setParameter("hod", "pooja");
////        query.setCacheable(true);
//        List<Departments> results = query.getResultList();
//        System.out.println(results);
//
//        Query query2 = session.createQuery("FROM Departments where hod = :hod");
//        query2.setParameter("hod", "pooja");
////        query2.setCacheable(true);
//        List<Departments> results2 = query2.getResultList();
//        System.out.println(results2);

        Departments d1 = session.get(Departments.class, 1);
        System.out.println(d1);
        session.close();

        Session session1 = sf.openSession();
        Departments d2 = session1.get(Departments.class, 1);
        System.out.println(d2);
        session1.close();

        sf.close();


    }
}
