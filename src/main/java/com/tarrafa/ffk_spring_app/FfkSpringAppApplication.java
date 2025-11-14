package com.tarrafa.ffk_spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile("dev")
public class FfkSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FfkSpringAppApplication.class, args);
	}

}
