/**
 * 
 */
package com.in.att.user.repository.impl;

import org.springframework.stereotype.Service;

import com.in.att.user.domain.UserDomain;
import com.in.att.user.repository.UserRepository;

/**
 * @author Abhi
 *
 */

@Service
public class UserRepositoryImpl {

	private UserRepository userRepository;

	public void saveUser(UserDomain userDomain) {
		System.out.println("UserRepositoryImpl -"+userDomain);
		userRepository.save(userDomain);
	}
}
