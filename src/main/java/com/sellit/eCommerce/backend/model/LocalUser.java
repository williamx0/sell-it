package com.sellit.eCommerce.backend.model;

import java.util.ArrayList;
import java.util.List;

//import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;



@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "Local_AppUsers")
public class LocalUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    @NotBlank(message = "Username is required")
    private String username;


    @Column(name = "password", nullable = false, length = 100)
    @NotBlank(message = "Password is required")
    @Size(min = 8, message = "Password must be at least 8 characters long")
    private String password;


    @Email 
    @Column(name = "email", nullable = false, unique = true, length = 300)
    @NotBlank(message = "Email Address is required")
    @Size(max = 300, message = "Email Adrress cannot be more than 300 characters")
    private String email;


    @Column(name = "first_name", nullable = false)
    private String firstName;


    @Column(name = "last_name", nullable = false)
    private String lastName;

    @OneToMany(mappedBy = "user")
    private List<Address> addresses = new ArrayList<>();  


}