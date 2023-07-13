package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Customers;

public interface CustomerRepo extends JpaRepository<Customers, Long > {

}
