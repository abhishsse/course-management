/**
 * 
 */
package com.in.att.s3.entity;

import org.springframework.stereotype.Component;

/**
 * @author Abhi
 *
 */

@Component
public class S3UserEntity {

	private String fileName;
	private String fileId;
	private String fileType;
	private String fileExtension;
	private String uploadedDate;
	private String modifiedDate;
	private long fileSize;
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getFileExtension() {
		return fileExtension;
	}
	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}
	public String getUploadedDate() {
		return uploadedDate;
	}
	public void setUploadedDate(String uploadedDate) {
		this.uploadedDate = uploadedDate;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	@Override
	public String toString() {
		return "S3UserEntity [fileName=" + fileName + ", fileId=" + fileId + ", fileType=" + fileType
				+ ", fileExtension=" + fileExtension + ", uploadedDate=" + uploadedDate + ", modifiedDate="
				+ modifiedDate + ", fileSize=" + fileSize + "]";
	}
	
}
