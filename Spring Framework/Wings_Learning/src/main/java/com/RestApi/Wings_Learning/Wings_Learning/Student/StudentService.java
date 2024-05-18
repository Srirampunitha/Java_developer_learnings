package com.RestApi.Wings_Learning.Wings_Learning.Student;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
    private StudentRepository repo ;
    
    public List<Student> findAll(){
    	return repo.findAll();
    }
    
    public Student findById(long id) {
    	Optional<Student> opstudent =repo.findById(id);
    	
    	if(opstudent.isEmpty()) {
    		return null;
    	}else {
    		return opstudent.get();
    	}
    }
    
    public Student addStudent(Student student) {
    	return repo.save(student);
    }
    
    public ResponseEntity<Object> deleteById(long id){
      
    	Optional<Student> opstudent =repo.findById(id);
    	
    	if(opstudent.isEmpty()) {
    		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    	}else {
    		repo.deleteById(id);
    		return new ResponseEntity<>(HttpStatus.OK);
    	}
    }
    
    public ResponseEntity<Object> updateById(long id , Student student){
        
    	Optional<Student> opstudent =repo.findById(id);
    	
    	if(opstudent.isEmpty()) {
    		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    	}else {
    		Student oldstudent = opstudent.get();
    		oldstudent.setId(id);
    		oldstudent.setName(student.getName());
    		oldstudent.setPlace(student.getPlace());
    		
    		return new ResponseEntity<>(repo.save(oldstudent),HttpStatus.OK);
    	}
    }
    
    public List<Student> findByName(String name) {
      List<Student> students =repo.findAll();
      
      Predicate<? super Student> predicate = s -> s.getName().equals(name);
	return students.stream().filter(predicate).toList();
    }
}
