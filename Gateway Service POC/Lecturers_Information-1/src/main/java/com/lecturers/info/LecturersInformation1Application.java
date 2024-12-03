package com.lecturers.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value="com.lecturers.info.*")
public class LecturersInformation1Application {

	public static void main(String[] args) {
		SpringApplication.run(LecturersInformation1Application.class, args);
	}

}
