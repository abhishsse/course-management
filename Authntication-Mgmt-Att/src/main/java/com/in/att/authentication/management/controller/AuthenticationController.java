package com.in.att.authentication.management.controller;

import com.in.att.authentication.management.dto.AuthenticationRequest;
import com.in.att.authentication.management.dto.AuthenticationResponse;
import com.in.att.authentication.management.model.User;
import com.in.att.authentication.management.repository.UserRepo;
import com.in.att.authentication.management.service.jwt.UserDetailsServiceImpl;
import com.in.att.authentication.management.service.user.UserService;
import com.in.att.authentication.management.util.JwtUtil;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private UserService userService;

    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";

    @PostMapping({"/authenticate"})
    public AuthenticationResponse createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest, HttpServletResponse response) throws BadCredentialsException, DisabledException, UsernameNotFoundException, IOException, JSONException, ServletException {
       
    	System.out.println("--createAuthenticationToken--");
    	try {
    		System.out.println("--TRY STARTS--");
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
            System.out.println("authenticationManager- "+authenticationManager);
            System.out.println("--TRY ENDS--");
    	} catch (BadCredentialsException e) {
            throw new BadCredentialsException("Incorrect username or password", e);
        }
        catch (DisabledException disabledException){
        	System.out.println("--CATCH STARTS--");
        	System.out.println("--disabledException--"+disabledException);
            response.sendError(HttpServletResponse.SC_NOT_ACCEPTABLE, "User Is Not Activated");
        	System.out.println("--CATCH ENDS--");
            return null;
        }

    	System.out.println("-- userDetails STARTS--");
    	System.out.println("--userDetails--");
        final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
    	System.out.println("--userDetails ENDS--"+userDetails);
    	System.out.println("--user--STARTS");
        User user = userRepo.findFirstByEmail(authenticationRequest.getUsername());

    	System.out.println("--user--ENDS"+user);
        final String jwt = jwtUtil.generateToken(userDetails);

    	System.out.println("--jwt--"+jwt);
        return new AuthenticationResponse(jwt);

    }



}
