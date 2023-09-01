package com.katrinporkul.cinema.controller;

import com.katrinporkul.cinema.dto.LoginResponseDTO;
import com.katrinporkul.cinema.dto.RegistrationDTO;
import com.katrinporkul.cinema.service.AuthService;
import com.katrinporkul.cinema.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public User registerUser(@RequestBody RegistrationDTO body){
        return authService.registerUser(body.getUsername(), body.getPassword());
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> loginUser(@RequestBody RegistrationDTO body) {
        try {
            LoginResponseDTO loginResponse = authService.loginUser(body.getUsername(), body.getPassword());

            // Return the response with 200 OK status
            return new ResponseEntity<>(loginResponse, HttpStatus.OK);
        } catch (Exception e) {
            // Here you can catch specific exceptions like UserNotFoundException etc.
            // Return the response with 400 BAD REQUEST or whatever status you prefer
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}