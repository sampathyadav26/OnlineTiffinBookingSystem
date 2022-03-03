package com.example.onlinetiffinbookingproject.service;

import java.util.List;

import com.example.onlinetiffinbookingproject.entity.MenuItem;

public interface MenuItemService {
	
		public List<MenuItem> findAll();
		
		public MenuItem findById(int theId);
		
		public void save(MenuItem theMenuItem);
		
		public void deleteById(int theId);

	


}
