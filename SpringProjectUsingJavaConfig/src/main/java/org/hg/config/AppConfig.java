package org.hg.config;

import org.hg.Computer;
import org.hg.Laptop;
import org.hg.Programmer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = {"lapObj"})
    @Primary
    public Laptop getLaptop(){
        return new Laptop();
    }

    @Bean
    @Scope("prototype")
    public Laptop getLaptopWithBrand(){
        return new Laptop("Dell");
    }

    @Bean
    public Programmer getProgrammer(Computer comp){ //@Qualifier("getLaptopWithBrand")
        Programmer prg = new Programmer();
        prg.setpName("Gupta");
        prg.setComp(comp);
        return prg;
    }
}
