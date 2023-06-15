package com.springmvc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvc.entity.Customer;

@Repository
public class HibernateCustomerDAO implements CustomerDAO {
	
	private static final String GET_ALL_LIST_CUSTOMERS = "SELECT * FROM CUSTOMER";
	private static final String SEARCH_NAME_OR_ADDRESS = "FROM Customer WHERE FULL_NAME LIKE :keyword OR address LIKE :keyword";

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Customer> getAllCustomers() {
		Session session = sessionFactory.getCurrentSession();
		return session.createNativeQuery(GET_ALL_LIST_CUSTOMERS, Customer.class).getResultList();
	}

	@Override
	@Transactional
	public List<Customer> searchCustomersByName(String keyword) {
	    Session session = sessionFactory.getCurrentSession();
	    Query<Customer> query = session.createQuery(SEARCH_NAME_OR_ADDRESS, Customer.class);
	    query.setParameter("keyword", "%" + keyword + "%");
	    return query.getResultList();
	}

	@Override
	@Transactional
	public void addCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.save(customer);
	}

	@Override
	@Transactional
	public void updateCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.update(customer);
	}

	@Override
	@Transactional
	public Customer getCustomerById(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Customer.class, id);
	}

	@Override
	@Transactional
	public void deleteCustomer(int id) {
		Session session = sessionFactory.getCurrentSession();
		Customer customer = session.get(Customer.class, id);
		session.delete(customer);
	}
}
