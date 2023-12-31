/**
 * 
 */
package com.in.att.security.dto;

import lombok.Data;

/**
 * @author Abhi
 *
 */
@Data
public class AuthenticationDTO {
	
	private String email;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AuthenticationDTO [email=" + email + ", password=" + password + "]";
	}
	public AuthenticationDTO(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public AuthenticationDTO() {
		super();
	}
	
	

}
