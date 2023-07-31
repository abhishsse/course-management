/**
 * 
 */
package com.in.att.security.service.auth;

import java.util.Optional;

import com.in.att.security.dto.SignUpDTO;
import com.in.att.security.dto.UserDTO;

/**
 * @author Abhi
 *
 */

public interface AuthServiceI {

	public Optional<UserDTO> createUser(SignUpDTO signUpDTO);

}
