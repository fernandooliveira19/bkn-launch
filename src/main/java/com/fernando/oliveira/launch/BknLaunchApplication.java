package com.fernando.oliveira.launch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BknLaunchApplication {

	public static void main(String[] args) {
		SpringApplication.run(BknLaunchApplication.class, args);
	}

}
