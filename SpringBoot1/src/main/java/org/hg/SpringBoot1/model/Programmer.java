package org.hg.SpringBoot1.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Programmer {
    private String name;

    private Computer comp;

    public Programmer() {
        System.out.println("Programmer is created.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer getComp() {
        return comp;
    }

    @Autowired
//    @Qualifier("laptop")
    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code(){
        System.out.println(name+" is Coding.");
        comp.compile();
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", comp=" + comp +
                '}';
    }
}
