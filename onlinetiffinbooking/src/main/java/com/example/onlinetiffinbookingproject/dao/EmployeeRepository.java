package com.example.onlinetiffinbookingproject.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onlinetiffinbookingproject.entity.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}
