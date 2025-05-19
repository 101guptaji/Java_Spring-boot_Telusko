package org.hg.SpringBoot1;

import org.hg.SpringBoot1.model.Laptop;
import org.hg.SpringBoot1.model.Programmer;
import org.hg.SpringBoot1.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringBoot1Application.class, args);
		LaptopService lapService = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		lapService.addLaptop(lap);
	}

}
