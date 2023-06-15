package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
public class Application {

	public static void main(String[] args) {
		System.out.println("I'm going to Saigon to start a business");
		SpringApplication.run(Application.class, args);
	}

}
