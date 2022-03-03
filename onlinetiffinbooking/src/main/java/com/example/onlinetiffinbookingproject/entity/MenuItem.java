package com.example.onlinetiffinbookingproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Item")
public class MenuItem {
  
  // define fields
  
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="fname")
    private String fname;
    
    @Column(name="price")
    private double price;
    
    @Column(name="quantity")
    private int quantity;
    
    
    
   
    public MenuItem() {
      
    }




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "MenuItem [id=" + id + ", fname=" + fname + ", price=" + price + ", quantity=" + quantity + "]";
	}







}

    

  