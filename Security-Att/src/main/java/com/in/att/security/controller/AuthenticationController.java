/**
 * 
 */
package com.in.att.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in.att.security.dto.AuthenticationDTO;
import com.in.att.security.dto.AuthenticationResonseSTO;
import com.in.att.security.service.auth.AuthServiceI;

/**
 * @author Abhi
 *
 */

@RestController
@RequestMapping("jwt/auth")
public class AuthenticationController {
	
	
	
	@Autowired
	private AuthServiceI authServiceI;
	
	public AuthenticationResonseSTO createAuthenticationToken(@RequestBody AuthenticationDTO authenticationDTO) throws Exception{
		
		
		
		return null;
		
	}

}
