package com.example.onlinetiffinbookingproject.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onlinetiffinbookingproject.entity.User;
import com.example.onlinetiffinbookingproject.rest.dto.UserRegistrationDto;



@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

	

}
