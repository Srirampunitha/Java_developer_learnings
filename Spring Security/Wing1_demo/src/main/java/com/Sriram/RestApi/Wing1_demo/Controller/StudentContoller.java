package com.Sriram.RestApi.Wing1_demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.Sriram.RestApi.Wing1_demo.Model.Customers;
import com.Sriram.RestApi.Wing1_demo.Model.Student;
import com.Sriram.RestApi.Wing1_demo.Service.StudentService;
import com.Sriram.RestApi.Wing1_demo.repository.StudentRepo;

@RestController
public class StudentContoller {
	
	@Autowired
	private StudentRepo repo;
    
	@Autowired
	private StudentService service ;
	
	@GetMapping("/students")
	public Object findAllStudnets() {
		return service.findall();
	}
	
	@GetMapping("/students/{id}")
	public Object findStudnetsbyid(@PathVariable int id) {
		return service.findStudnetsbyid(id);
	}
	
	@PostMapping("/students")
	public Object addStudnets(@RequestBody Student student) {
		return service.addStudents(student);
	}
	
	@PutMapping("/students/{id}")
	public Object updateStudnet(@RequestBody Student student ,@PathVariable int id) {
		return service.updateStudentsbyId(student ,id);
	}
	
	@DeleteMapping("/students/{id}")
	public Object deleteStudentbyId(@PathVariable int id) {
		return service.deleteById(id);
	}
	
	@PatchMapping("/studnets/updatename/{id}")
	public Object updateNameById(@RequestBody Student student,@PathVariable int id) {
		return service.updateStudentName(student, id);
	}
	
	@GetMapping("/students/name/{name}")
	public Object getstudentsbyName(@PathVariable String name) {
	  List<Student> students =service.findByName(name);
	  if(students.isEmpty()) {
		  return new ResponseEntity<>("no content available",HttpStatus.NO_CONTENT);
	  }else {
		  return new ResponseEntity<>(students,HttpStatus.OK);
	  } 
}
}