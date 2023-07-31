package com.in.att.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan({"com.in.*"})
public class UserAttApplication {

	public static void main(String[] args) {
		System.out.println("-- User Service--");
		SpringApplication.run(UserAttApplication.class, args);
	}

}
