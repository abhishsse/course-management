/**
 * 
 */
package com.in.att.s3.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

/**
 * @author Abhi
 *
 */

@Configuration
public class S3Configuration {
	
	@Value("${cloud.aws.access.key}")
	private String accessKey;
	
	@Value("${cloud.aws.access.secret}")
	private String  accessSecret;
	
	@Value("${cloud.aws.access.region}")
	private String region;
	
	@Bean
	public AmazonS3 authenticateS3() {
		AWSCredentials awsCredentials= new BasicAWSCredentials(accessKey, accessSecret);
		return AmazonS3ClientBuilder.standard().withRegion(region).withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();
		
		
	}

}
