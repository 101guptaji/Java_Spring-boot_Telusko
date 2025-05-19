package org.hg;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    private String brand;

    private  CPU cpu;

    public Laptop() {
        System.out.println("Laptop has built");
    }

    public Laptop(String brand, CPU cpu) {
        System.out.println("Laptop Paramaterized contructor calling");
        this.brand = brand;
        this.cpu = cpu;
        cpu.cores();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("Setting brand");
        this.brand = brand;
    }


}
