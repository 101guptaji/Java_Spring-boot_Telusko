package org.hg.SpringBoot1.service;

import org.hg.SpringBoot1.model.Laptop;
import org.hg.SpringBoot1.repository.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    LaptopRepo lapRepo;

    public void addLaptop(Laptop lap) {
        lapRepo.save(lap);
    }
}
