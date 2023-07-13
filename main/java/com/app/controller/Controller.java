package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Customers;
import com.app.service.CustService;

@RestController
@RequestMapping("/customers")
//@CrossOrigin(origins = "http://localhost:3000")

public class Controller {
	public Controller() {
		System.out.println("inside the constr of" + getClass());
	}

	@Autowired
	private CustService custserv;

	@GetMapping
	public List<Customers> getAllCust() {
		return custserv.getAllCustomers();
	}

	@PostMapping
	public ResponseEntity<?> addCustomer(@RequestBody Customers cust) {
		return new ResponseEntity<>(custserv.AddCustomer(cust), HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public String DeleteCust(@PathVariable Long id) {
		custserv.DeleteCustomer(id);
		return "Deleted Successfully";
	}

	@PutMapping("/{id}")
	public Customers UpdateCust(@RequestBody Customers cust) {
		return custserv.UpdateCustomer(cust);

	}
	@GetMapping("/{id}")
	public Customers getDetailsById(@PathVariable Long id) {
		return custserv.getCustomerDetailsByID(id);
	}

}
