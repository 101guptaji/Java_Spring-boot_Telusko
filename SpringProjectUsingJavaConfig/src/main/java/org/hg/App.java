package org.hg;

import org.hg.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Laptop lap = context.getBean("lapObj",Laptop.class);
        lap.setBrand("Asus");
        lap.print();

//        Laptop lap2 = context.getBean("getLaptopWithBrand", Laptop.class);
//        lap2.print();

        Programmer pg = context.getBean(Programmer.class);
        pg.code();
    }
}
