/**
 * 
 */
package com.in.att.security.service.auth;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.in.att.security.dto.SignUpDTO;
import com.in.att.security.dto.UserDTO;
import com.in.att.security.entity.SecurityUserEntity;
import com.in.att.security.repository.SecurityUserRepositoryI;

/**
 * @author Abhi
 *
 */
@Service
public class AuthServiceImpl implements AuthServiceI {
	
	
	@Autowired
	SecurityUserRepositoryI securityUserRepositoryI;

	@Override
	public Optional<UserDTO> createUser(SignUpDTO signUpDTO) {
		
		SecurityUserEntity securityUserEntity= new SecurityUserEntity();
		
		securityUserEntity.setName(signUpDTO.getName());
		securityUserEntity.setEmail(signUpDTO.getEmail());
		securityUserEntity.setId(signUpDTO.getId());
		securityUserEntity.setPassword(new BCryptPasswordEncoder().encode(signUpDTO.getPassword()));
		
		SecurityUserEntity cereatedUserEntity	=securityUserRepositoryI.save(securityUserEntity);
		UserDTO userDTO= new UserDTO();
		userDTO.setEmail(cereatedUserEntity.getEmail());
		userDTO.setName(cereatedUserEntity.getName());
		Optional<UserDTO> optionalUserDTO = Optional.ofNullable(userDTO);
		return optionalUserDTO;
	}

}
