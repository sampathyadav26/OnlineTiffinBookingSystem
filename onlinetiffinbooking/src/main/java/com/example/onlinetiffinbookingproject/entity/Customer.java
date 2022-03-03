package com.example.onlinetiffinbookingproject.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;


@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int customerId;
	
	@NonNull
	private String customerName;
	
	private String customerPhoneNo;
	
	private String customerAddress;
	
	private String menuItemCatogery;
	
	private String menuItemName;
	
	private String menuItemQuantity;
	
	private double amount;

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	

	


	public Customer(int customerId, String customerName, String customerPhoneNo, String customerAddress,
			String menuItemCatogery, String menuItemName, String menuItemQuantity, double amount) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPhoneNo = customerPhoneNo;
		this.customerAddress = customerAddress;
		this.menuItemCatogery = menuItemCatogery;
		this.menuItemName = menuItemName;
		this.menuItemQuantity = menuItemQuantity;
		this.amount = amount;
	}






	public int getCustomerId() {
		return customerId;
	}






	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}






	public String getCustomerName() {
		return customerName;
	}






	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}






	public String getCustomerPhoneNo() {
		return customerPhoneNo;
	}






	public void setCustomerPhoneNo(String customerPhoneNo) {
		this.customerPhoneNo = customerPhoneNo;
	}






	public String getCustomerAddress() {
		return customerAddress;
	}






	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}






	public String getMenuItemCatogery() {
		return menuItemCatogery;
	}






	public void setMenuItemCatogery(String menuItemCatogery) {
		this.menuItemCatogery = menuItemCatogery;
	}






	public String getMenuItemName() {
		return menuItemName;
	}






	public void setMenuItemName(String menuItemName) {
		this.menuItemName = menuItemName;
	}






	public String getMenuItemQuantity() {
		return menuItemQuantity;
	}






	public void setMenuItemQuantity(String menuItemQuantity) {
		this.menuItemQuantity = menuItemQuantity;
	}






	public double getAmount() {
		return amount;
	}






	public void setAmount(double amount) {
		this.amount = amount;
	}






	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPhoneNo="
				+ customerPhoneNo + ", customerAddress=" + customerAddress + ", menuItemCatogery=" + menuItemCatogery
				+ ", menuItemName=" + menuItemName + ", menuItemQuantity=" + menuItemQuantity + ", amount=" + amount
				+ "]";
	}






	

	


}
