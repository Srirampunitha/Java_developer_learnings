package com.Sriram.RestApi.Wing1_demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sriram.RestApi.Wing1_demo.Model.Customers;

public interface CustomersRepository extends JpaRepository<Customers, Integer>{
        public List<Customers> findByUsername(String username);
}
