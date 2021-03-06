package com.ahmedgaber.crud.service;

import java.util.List;

import com.ahmedgaber.crud.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
	
	public Customer getCustomers(int theId);

	public void deleteCustomer(int theId);
	
}
