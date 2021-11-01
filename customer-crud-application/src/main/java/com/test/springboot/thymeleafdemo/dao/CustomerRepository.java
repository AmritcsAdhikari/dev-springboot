package com.test.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.springboot.thymeleafdemo.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	
	//This is all we need here
	
	public List<Customer> findAllByOrderByLastNameAsc();
	
}
