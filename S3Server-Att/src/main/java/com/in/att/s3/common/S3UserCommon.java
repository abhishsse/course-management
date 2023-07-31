/**
 * 
 */
package com.in.att.s3.common;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Abhi
 *
 */
@Component
@Slf4j
public class S3UserCommon {

	
	   public File convertMultiPartFileToFile (MultipartFile file) {
	        File convertedFile = new File(file.getOriginalFilename());
	        try (FileOutputStream fos = new FileOutputStream(convertedFile)) {
	            fos.write(file.getBytes());
	        } catch (IOException e) {
	           
				//new Logger(null, null, null).error("Error converting multipartFile to file", e);
	        }
	        return convertedFile;
	    }
}
