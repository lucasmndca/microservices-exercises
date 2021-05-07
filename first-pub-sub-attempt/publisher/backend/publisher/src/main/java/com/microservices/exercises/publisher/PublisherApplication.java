package com.microservices.exercises.publisher;

import com.microservices.exercises.publisher.services.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class PublisherApplication {

	@Autowired
	PublisherService publisherService;

	public static void main(String[] args) {
		SpringApplication.run(PublisherApplication.class, args);
	}

}
