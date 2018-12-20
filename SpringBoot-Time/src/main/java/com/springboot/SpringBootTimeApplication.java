package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling//开启定时
@SpringBootApplication
public class SpringBootTimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTimeApplication.class, args);
	}

}

