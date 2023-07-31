package com.in.att.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerAttApplication {

	public static void main(String[] args) {
		
		System.out.println("-Config - Server - Up !!");
		SpringApplication.run(ConfigServerAttApplication.class, args);
	}

}
