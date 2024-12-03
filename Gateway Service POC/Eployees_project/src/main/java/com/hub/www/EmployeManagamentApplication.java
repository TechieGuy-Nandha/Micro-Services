package com.hub.www;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(value="com.hub.www.*")
public class EmployeManagamentApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeManagamentApplication.class, args);
	}
}
