package com.ssp.apps.library.manament.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class BookServiceApplication{
@Autowired
    private BookRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication.class, args);
	}
  

}
