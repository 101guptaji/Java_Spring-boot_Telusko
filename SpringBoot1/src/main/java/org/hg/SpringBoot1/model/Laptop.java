package org.hg.SpringBoot1.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
    public Laptop() {
        System.out.println("Laptop has built.");
    }

    @Override
    public void compile() {
        System.out.println("Laoptop is compiling.");
    }
}
