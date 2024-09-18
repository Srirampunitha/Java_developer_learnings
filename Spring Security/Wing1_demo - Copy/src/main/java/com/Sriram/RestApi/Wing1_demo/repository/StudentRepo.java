package com.Sriram.RestApi.Wing1_demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sriram.RestApi.Wing1_demo.Model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
      
}
