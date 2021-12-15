package com.example.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class GreetingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingApplication.class, args);
	}

	// method to read spring app properties file
	@Bean
	ApplicationRunner applicationRunner(Environment environment) {
		return args -> {
			System.out
					.println("message from application.properties " + environment.getProperty("message-from-app-prop"));
			
			System.out
			.println("Welcome back" + environment.getProperty("name"));
		};
	}

}
