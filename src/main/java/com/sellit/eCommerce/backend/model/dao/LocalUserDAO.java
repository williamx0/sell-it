package com.sellit.eCommerce.backend.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.sellit.eCommerce.backend.model.LocalUser;


public interface LocalUserDAO extends CrudRepository<LocalUser, Long> {
    
}
