package com.example.onlinetiffinbookingproject.service;



import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.onlinetiffinbookingproject.dao.MenuItemRepository;
import com.example.onlinetiffinbookingproject.entity.MenuItem;

@Service
public class MenuItemServiceImpl implements MenuItemService {
	
	private MenuItemRepository menuitemRepository;
	
	public MenuItemServiceImpl(MenuItemRepository theMenuItemRepository) {
		menuitemRepository = theMenuItemRepository;
	}

	@Override
	public List<MenuItem> findAll() {
		return (List<MenuItem>) menuitemRepository.findAll();
	}

	@Override
	public MenuItem findById(int theId) {
		Optional<MenuItem> result = menuitemRepository.findById(theId);
		
		MenuItem theMenuItem = null;
		
		if(result.isPresent())
		{
			theMenuItem = result.get();
		}
		else
		{
			//we didn't find the medicines
			throw new RuntimeException("Did not find MenuItem id- "+theId);
		}
		return theMenuItem;
		

	}

	@Override
	public void save(MenuItem theMenuItem) {
		menuitemRepository.save(theMenuItem);
		
	}

	@Override
	public void deleteById(int theId) {
		menuitemRepository.deleteById(theId);
		
	}
	
	
	
	
	
}

