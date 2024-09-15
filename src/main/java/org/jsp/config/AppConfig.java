package org.jsp.config;

import org.jsp.Alien;
import org.jsp.Computer;
import org.jsp.Desktop;
import org.jsp.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.jsp")
public class AppConfig {


//    @Bean
//    public Alien alien(Computer com){  // @Qualifier("desktop")
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setComputer(com);
//        return obj;
//    }
//
//    //@Bean(name = {"desk1", "beast", "com2"})
//    @Bean
//   //@Scope("prototype") // it will help to create 2 object, 2nd obj from dt1 in App.java
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }
}
