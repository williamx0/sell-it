package com.sellit.eCommerce.backend.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< Updated upstream
=======
import com.sellit.eCommerce.backend.api.model.RegistrationBody;
import com.sellit.eCommerce.backend.exception.UserAlreadyExistsException;
import com.sellit.eCommerce.backend.service.UserService;

>>>>>>> Stashed changes

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    
<<<<<<< Updated upstream
    @PostMapping("/register")
    public void registerUser() {

=======
    private UserService userService; 
 
    public AuthenticationController(UserService userService) {
        this.userService = userService;     // UserService generated constructor  
    }


    @PostMapping("/register")  
    public ResponseEntity registerUser(@RequestBody RegistrationBody registrationBody) {
        try {
            userService.registerUser(registrationBody);    // this registers the user 
            return ResponseEntity.ok().build();
        }   catch (UserAlreadyExistsException ex) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        } 
       
>>>>>>> Stashed changes
    
    }

}
