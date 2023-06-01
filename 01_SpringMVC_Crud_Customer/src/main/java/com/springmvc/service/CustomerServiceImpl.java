package com.springmvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.CustomerDAO;
import com.springmvc.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDAO customerDAO;

	@Override
	@Transactional
	public List<Customer> getAllCustomers() {
		return customerDAO.getAllCustomers();
	}
	
	@Override
	@Transactional
	public List<Customer> searchCustomersByName(String keyword) {
		return customerDAO.searchCustomersByName(keyword);
	}
	
	@Override
	@Transactional
	public void addCustomer(Customer customer) {
		customerDAO.addCustomer(customer);
	}
	
	@Override
	@Transactional
	public void updateCustomer(Customer customer) {
		customerDAO.updateCustomer(customer);
	}
	
	@Override
	@Transactional
	public Customer getCustomerById(int id) {
		return customerDAO.getCustomerById(id);
	}
	
	@Override
	@Transactional
	public void deleteCustomer(int id) {
		customerDAO.deleteCustomer(id);	
	}
}
