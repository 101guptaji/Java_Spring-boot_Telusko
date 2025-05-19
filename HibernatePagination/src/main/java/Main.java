import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Actor.class);
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter page No.");
        int pageNo = sc.nextInt();
        int pageSize = 10;
        int firstResult = (pageNo-1) * pageSize;

        String hql = "FROM Actor";
        Query query = session.createQuery(hql, Actor.class);

        // Set pagination parameters
        query.setFirstResult(firstResult);
        query.setMaxResults(pageSize);

        // Retrieve actors from the database
        List<Actor> actors = query.list();

        // Display actors on the current page
        for (Actor actor : actors) {
            System.out.println(actor);
        }
    }
}
