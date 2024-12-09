package com.example.uti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UtiApplication {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(UtiApplication.class);
		app.setWebApplicationType(WebApplicationType.SERVLET); // Force it to run as a web app
		app.run(args);
	}
}
