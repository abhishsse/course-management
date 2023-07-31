package com.in.att.authentication.management.service.user;

import com.in.att.authentication.management.dto.SignupRequest;
import com.in.att.authentication.management.dto.UserDto;
import com.in.att.authentication.management.model.User;
import com.in.att.authentication.management.repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;

    @Transactional
    public UserDto createUser(SignupRequest signupRequest) throws Exception {
        User user = new User(signupRequest.getEmail(), new BCryptPasswordEncoder().encode(signupRequest.getPassword()), signupRequest.getName());
        user = userRepo.save(user);
        if (user == null)
            return  null;

        return user.mapUsertoUserDto();
    }


    public Boolean hasUserWithEmail(String email) {
        return userRepo.findFirstByEmail(email) != null;
    }


}
