package com.example.onlinetiffinbookingproject.service;


import java.util.List;

import com.example.onlinetiffinbookingproject.entity.Customer;



public interface CustomerService {
	
	public List<Customer> findAll();
	
	public Customer findById(int theId);
	
	public void save(Customer theCustomer);
	
	public void deleteById(int theId);
	

}
