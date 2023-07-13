package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.entities.Customers;
import com.app.repository.CustomerRepo;
@Service
@Transactional
public class ServiceImpl implements CustService {

	@Autowired
	private CustomerRepo custrepo;
	
	@Override
	public List<Customers> getAllCustomers() {
		return custrepo.findAll();
	}
	
  public Customers AddCustomer(Customers cust) {
	  return custrepo.save(cust);
  }
	
  @Override
public String DeleteCustomer(Long id) {
	  String mesg="invalid id";
	  if (custrepo.existsById(id)) {
		  custrepo.deleteById(id);
		  mesg="customer with id"+id+"deleted successfully.";
		
	} return mesg;
  }
	
	
  @Override
public Customers UpdateCustomer(Customers cust) {
	  return custrepo.save(cust);
  }
	
  @Override
public Customers getCustomerDetailsByID(Long id) {
	  return custrepo.findById(id).orElseThrow(()->new ResourceNotFoundException("invalid ID"));
  }
	
	
	
	
}
