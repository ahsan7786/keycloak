package com.hisabkar.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = MyService.class)
public class HisabkarApplication {

	public static void main(String[] args) {
		SpringApplication.run(HisabkarApplication.class, args);
	}

}
