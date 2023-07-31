package com.in.att.authentication.management.controller;


import com.in.att.authentication.management.dto.SignupRequest;
import com.in.att.authentication.management.dto.UserDto;
import com.in.att.authentication.management.service.user.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SignupController {

    @Autowired
    UserService userService;

    @PostMapping({"/sign-up"})
    public ResponseEntity<?> signupUser(@RequestBody SignupRequest signupRequest) throws Exception {

        if (userService.hasUserWithEmail(signupRequest.getEmail()))
            return new ResponseEntity<>("User already exists", HttpStatus.NOT_ACCEPTABLE);

        UserDto createdUser = userService.createUser(signupRequest);
        if (createdUser == null)
            return new ResponseEntity<>("User not created, come again later", HttpStatus.NOT_ACCEPTABLE);

        return new ResponseEntity<>(createdUser, HttpStatus.OK);
    }



}
