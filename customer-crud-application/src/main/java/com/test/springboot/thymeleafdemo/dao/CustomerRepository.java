package com.test.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.springboot.thymeleafdemo.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	//there's no need to write implementation class
	//we get all the crud methods for free
	//----------good thing about spring-data-jpa-------------
	
	public List<Customer> findAllByOrderByLastNameAsc();
	
}
