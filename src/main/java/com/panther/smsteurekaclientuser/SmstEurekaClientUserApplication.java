package com.panther.smsteurekaclientuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SmstEurekaClientUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmstEurekaClientUserApplication.class, args);
	}

}
