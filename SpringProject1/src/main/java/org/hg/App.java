package org.hg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  // create a container

        Programmer obj = (Programmer) context.getBean("programObj"); // programObj is the id of bean in applicationContext.xml
        obj.pName = "Rahul";
        obj.code();

        Programmer obj1 = (Programmer) context.getBean("programObj"); // programObj is the id of bean in applicationContext.xml
        obj1.code();


    }
}
