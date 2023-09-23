package com.sellit.eCommerce.backend.api.controller;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sellit.eCommerce.backend.api.model.RegistrationBody;
import com.sellit.eCommerce.backend.service.UserService;


@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    
    private UserService userService; 
 
    public AuthenticationController(UserService userService) {
        this.userService = userService;   // UserService generated constructor  
    }


    @PostMapping("/register")  
    public void registerUser(@RequestBody RegistrationBody registrationBody) {

        userService.registerUser(registrationBody);  // this registers the user 
    
    }

}
