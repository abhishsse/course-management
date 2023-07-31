package com.in.att.s3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S3ServerAttApplication {

	public static void main(String[] args) {
		System.out.println("S3 Services are up!!");
		SpringApplication.run(S3ServerAttApplication.class, args);
	}

}
