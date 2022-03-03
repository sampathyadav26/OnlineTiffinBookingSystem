package com.example.onlinetiffinbookingproject.dao;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.onlinetiffinbookingproject.entity.MenuItem;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Integer> {
	
}
