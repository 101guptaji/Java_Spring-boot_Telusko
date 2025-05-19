package org.hg.SpringBoot1.repository;

import org.hg.SpringBoot1.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepo {

    public void save(Laptop lap) {
        System.out.println("Laptop saved to database");
    }
}
