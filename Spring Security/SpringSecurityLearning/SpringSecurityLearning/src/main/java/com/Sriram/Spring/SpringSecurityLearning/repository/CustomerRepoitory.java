package com.Sriram.Spring.SpringSecurityLearning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sriram.Spring.SpringSecurityLearning.model.Customer;

public interface CustomerRepoitory extends JpaRepository<Customer, Integer> {
        public List<Customer> findByEmail(String email);
}
