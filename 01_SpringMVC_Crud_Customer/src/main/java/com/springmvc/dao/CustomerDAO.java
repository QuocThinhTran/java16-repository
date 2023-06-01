package com.springmvc.dao;

import java.util.List;

import com.springmvc.entity.Customer;

public interface CustomerDAO {
	List<Customer> getAllCustomers();

    List<Customer> searchCustomersByName(String keyword);

	void addCustomer(Customer customer);

	void updateCustomer(Customer customer);

	Customer getCustomerById(int id);
	
	void deleteCustomer(int id);
	
}
