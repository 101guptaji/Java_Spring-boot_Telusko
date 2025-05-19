package org.hg;

public class Laptop implements Computer {
    private String brand;


    public Laptop() {
        System.out.println("Laptop has built");
    }

    public Laptop(String bName) {
        System.out.println("Laptop Parameterized Constructor");
        this.brand = bName;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("Setting brand");
        this.brand = brand;
    }

    @Override
    public void print(){
        System.out.println("This is a "+brand+" laptop.");
    }
}
