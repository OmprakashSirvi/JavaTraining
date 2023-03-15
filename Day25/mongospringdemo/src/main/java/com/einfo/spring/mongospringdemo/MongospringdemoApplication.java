package com.einfo.spring.mongospringdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongospringdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongospringdemoApplication.class, args);
		System.out.println("This app is up and running at : http://localhost:8080");
	}
}
