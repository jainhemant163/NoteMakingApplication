package com.cloud.csye6225.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class NoteMakingApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoteMakingApplication.class, args);
	}

}
