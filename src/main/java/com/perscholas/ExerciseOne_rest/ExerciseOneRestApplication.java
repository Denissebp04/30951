package com.perscholas.ExerciseOne_rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="com.perscholas")
public class ExerciseOneRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciseOneRestApplication.class, args);
	}

}
