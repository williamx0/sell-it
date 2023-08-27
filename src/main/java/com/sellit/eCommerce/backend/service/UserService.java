package com.sellit.eCommerce.backend.service;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sellit.eCommerce.backend.api.model.RegistrationBody;
import com.sellit.eCommerce.backend.exception.UserAlreadyExistsException;
import com.sellit.eCommerce.backend.model.LocalUser;
import com.sellit.eCommerce.backend.model.dao.LocalUserDAO;

@Service
public class UserService {
    
    private LocalUserDAO localUserDAO;

    public UserService(LocalUserDAO localUserDAO) {
        this.localUserDAO = localUserDAO;
    }


    public LocalUser registerUser(RegistrationBody registrationBody) throws UserAlreadyExistsException {
        if (localUserDAO.findByEmailIgnoreCase(registrationBody.getEmail()).isPresent() 
            ||localUserDAO.findByUsernameIgnoreCase(registrationBody.getUsername()).isPresent()) {
          throw new UserAlreadyExistsException();
        }
        LocalUser user = new LocalUser();
        user.setEmail(registrationBody.getEmail());
        user.setFirstName(registrationBody.getFirstName());
        user.setLastName(registrationBody.getLastName());
        user.setUsername(registrationBody.getUsername());

        //TODO: Encrypt Password!!! 

        user.setPassword(registrationBody.getPassword());
        return user = localUserDAO.save(user);
        
    }
}
