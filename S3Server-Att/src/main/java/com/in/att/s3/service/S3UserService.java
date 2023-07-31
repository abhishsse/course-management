/**
 * 
 */
package com.in.att.s3.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.in.att.s3.common.S3UserCommon;
import com.in.att.s3.entity.S3UserEntity;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author Abhi
 *
 */

@Service
public class S3UserService {
	
	
	@Value("${cloud.aws.s3.bucket.name}")
	private String bucketName;
	
	@Autowired
	private AmazonS3 amazonS3;
	
	@Autowired
	private S3UserCommon s3userCommon;
	
	@Autowired
	private S3UserEntity s3userEntity;
	
	public S3UserEntity upload(MultipartFile mfile) {
		
		File fileObject=s3userCommon.convertMultiPartFileToFile(mfile);
		String fileName= System.currentTimeMillis()+"_"+mfile.getOriginalFilename();
		amazonS3.putObject(new PutObjectRequest(bucketName, fileName,fileObject ));
		s3userEntity.setFileSize(mfile.getSize());
		s3userEntity.setFileName(mfile.getOriginalFilename());
		fileObject.delete();
		
		return s3userEntity;
		
		
	}

}
