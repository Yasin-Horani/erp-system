package com.yasin.erp;

import com.yasin.erp.utilities.EnvLoaderUtility;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ErpApplication {
	public static void main(String[] args) {

		// Set environment variables for Spring Boot to read
		EnvLoaderUtility envLoaderUtility = new EnvLoaderUtility();
		envLoaderUtility.loadIntoSystemProperties();
		SpringApplication.run(ErpApplication.class, args);
	}
}
