package com.sellit.eCommerce.backend.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sellit.eCommerce.backend.api.model.RegistrationBody;
import com.sellit.eCommerce.backend.service.UserService;

<<<<<<< Updated upstream
=======
import com.sellit.eCommerce.backend.api.model.RegistrationBody;
import com.sellit.eCommerce.backend.exception.UserAlreadyExistsException;
import com.sellit.eCommerce.backend.service.UserService;

>>>>>>> Stashed changes

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    
    @PostMapping("/register")
    public void registerUser() {

    
    }

}
