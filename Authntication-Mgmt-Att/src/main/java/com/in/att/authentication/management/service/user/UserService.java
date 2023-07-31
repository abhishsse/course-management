package com.in.att.authentication.management.service.user;

import com.in.att.authentication.management.dto.SignupRequest;
import com.in.att.authentication.management.dto.UserDto;

public interface UserService {

     UserDto createUser(SignupRequest signupRequest) throws Exception;

     Boolean hasUserWithEmail(String email);


}
