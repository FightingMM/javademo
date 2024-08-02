package com.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("com.project.mapper")
public class CollabinApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollabinApplication.class, args);
	}

}
