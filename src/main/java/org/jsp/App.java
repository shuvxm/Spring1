package org.jsp;

import org.jsp.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj1 = context.getBean(Alien.class);
        System.out.println(obj1.getAge());
        obj1.code();

//        Laptop l = context.getBean(Laptop.class);
//        l.compile();



//        Desktop dt = context.getBean("desktop", Desktop.class);
//        Desktop dt = context.getBean(Desktop.class);
//        dt.compile();
//        Desktop dt1 = context.getBean(Desktop.class);
//        dt1.compile();





            // XML config
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//
//        Alien obj1 = (Alien) context.getBean("alien1");
//        obj1.setAge(20);
//        System.out.println(obj1.getAge());
//        obj1.code();
//
////        Alien obj2 = (Alien) context.getBean("alien1");
////        System.out.println(obj2.age);
//
////        obj2.code();
//
////        Desktop obj = (Desktop) context.getBean("com2");
//
//        Desktop obj = context.getBean(Desktop.class);

    }
}
