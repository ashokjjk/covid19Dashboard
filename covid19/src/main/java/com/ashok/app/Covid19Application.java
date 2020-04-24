package com.ashok.app;

/**
 * Author - Ashok Kumar
 * Organization - Newcastle University
 * Project - Coronavirus tracker
 * Ver - 1.0
 * 
 * */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Covid19Application {

	public static void main(String[] args) {
		SpringApplication.run(Covid19Application.class, args);
	}

}
