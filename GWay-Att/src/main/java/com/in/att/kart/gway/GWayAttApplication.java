package com.in.att.kart.gway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GWayAttApplication {

	public static void main(String[] args) {
		SpringApplication.run(GWayAttApplication.class, args);
	}

}
