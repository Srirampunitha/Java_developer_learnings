package com.Sriram.Jwt_Token_Authentication.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sriram.Jwt_Token_Authentication.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
	
	public Optional<Customer> findByMail(String mail);

}
