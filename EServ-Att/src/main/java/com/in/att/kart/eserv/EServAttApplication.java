package com.in.att.kart.eserv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EServAttApplication {
	
	Logger logger = LoggerFactory.getLogger(EServAttApplication.class);
	EServAttApplication(){
		
		logger.info("Contructor");
		logger.info("test");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Server is UP!!");
		String str="abc";
		System.out.println(str);
		SpringApplication.run(EServAttApplication.class, args);
	}

}
