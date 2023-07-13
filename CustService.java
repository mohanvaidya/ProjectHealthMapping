package com.app.service;

import java.util.List;

import com.app.entities.Customers;

public interface CustService {

	List<Customers> getAllCustomers();

	Customers AddCustomer(Customers cust);

	String DeleteCustomer(Long id);

	Customers UpdateCustomer(Customers cust);

	Customers getCustomerDetailsByID(Long id);
	

}
