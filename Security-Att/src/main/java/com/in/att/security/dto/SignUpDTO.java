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
public class SignUpDTO {

	private Long id;
	private String name;
	private String email;
	private String password;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
		return "SignUpDTO [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
	

}
