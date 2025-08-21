package com.yasin.erp;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ErpApplication {
	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();

		// Set environment variables for Spring Boot to read
		System.setProperty("DB_URL", dotenv.get("DB_URL"));
		System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
		System.setProperty("SERVER_PORT", dotenv.get("SERVER_PORT"));
		System.setProperty("CONTEXT_PATH", dotenv.get("CONTEXT_PATH"));

		SpringApplication.run(ErpApplication.class, args);
	}
}
