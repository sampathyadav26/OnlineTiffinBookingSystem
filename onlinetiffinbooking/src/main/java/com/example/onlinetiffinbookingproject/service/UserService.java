package com.example.onlinetiffinbookingproject.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.onlinetiffinbookingproject.entity.User;
import com.example.onlinetiffinbookingproject.rest.dto.UserRegistrationDto;



public interface UserService extends UserDetailsService{
	
	User save(UserRegistrationDto registrationDto);

	
	
	
	}



