package com.springmvc.service;

import java.util.List;

import com.springmvc.entity.Customer;

public interface CustomerService {
	List<Customer> getAllCustomers();

	List<Customer> searchCustomersByName(String keyword);

	void addCustomer(Customer customer);

	void updateCustomer(Customer customer);

	Customer getCustomerById(int id);

	void deleteCustomer(int id);
}
