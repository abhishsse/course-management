/**
 * 
 */
package com.in.att.s3.controller;

import javax.ws.rs.Consumes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.in.att.s3.entity.S3UserEntity;
import com.in.att.s3.service.S3UserService;

/**
 * @author Abhi
 *
 */
@RestController
public class S3UserImageController {

	@Autowired
	private S3UserService s3userService;

	@PostMapping("/upload")
	public ResponseEntity<S3UserEntity> upload(@RequestParam(value = "file") MultipartFile file) {
		System.out.println("----upload method called----"+ file);
		return new ResponseEntity<S3UserEntity>(s3userService.upload(file), HttpStatus.OK);
	}

}
