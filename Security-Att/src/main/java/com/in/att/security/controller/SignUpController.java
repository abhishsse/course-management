/**
 * 
 */
package com.in.att.security.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in.att.security.dto.SignUpDTO;
import com.in.att.security.dto.UserDTO;
import com.in.att.security.service.auth.AuthServiceI;

/**
 * @author Abhi
 *
 */

@RestController
@RequestMapping("/att")
public class SignUpController {

	@Autowired
	private AuthServiceI authServiceI;

	@PostMapping("/signup")
	public ResponseEntity<?> signUpUser(@RequestBody SignUpDTO signUpDTO) {

		Optional<UserDTO> userDTO = authServiceI.createUser(signUpDTO);
		
		if (userDTO == null)
			return new ResponseEntity<>("usernot created", HttpStatus.BAD_REQUEST);

		return new ResponseEntity<>("created", HttpStatus.CREATED);

	}

}
