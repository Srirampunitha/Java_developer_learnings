package com.RestApi.Wings_Learning.Wings_Learning.Student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
     public List<Student> findByName(String name);
}
