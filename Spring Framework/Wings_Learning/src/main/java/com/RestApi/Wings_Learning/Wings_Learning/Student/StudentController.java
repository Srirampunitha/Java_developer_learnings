package com.RestApi.Wings_Learning.Wings_Learning.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
        
	  @Autowired
      private StudentService service ;
	  
	  @Autowired
	  private StudentRepository repo ;
      
	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable long id) {
		Student student = service.findById(id);
		if(student==null) 
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);	
		else
		return new ResponseEntity<>(student,HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		Student savedstudent = service.addStudent(student);
		if(savedstudent==null) 
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);	
		else
		return new ResponseEntity<>(savedstudent,HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<Object> getAllStudents() {
		List<Student> students = service.findAll();
		if(students.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}else {
		return new ResponseEntity<>(students,HttpStatus.OK);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteStudnetById(@PathVariable long id) {
		return service.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateStudnetById(@PathVariable long id, @RequestBody Student student) {
		return service.updateById(id, student);
	}
	
	@GetMapping("Name/{name}")
	public ResponseEntity<Object> getStudnetByName(@PathVariable String name) {
		List<Student> students = service.findByName(name);
		if(students.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}else {
		return new ResponseEntity<>(students,HttpStatus.OK);
		}
	}
	
	@GetMapping("fromRepoInterface/{name}")
	public ResponseEntity<Object> findStudnetByName(@PathVariable String name) {
		List<Student> students = service.findByName(name);
		if(students.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}else {
		return new ResponseEntity<>(students,HttpStatus.OK);
		}
	}
	
	@GetMapping("/Id")
	public ResponseEntity<Student> StudentById(@RequestParam long id) {
		Student student = service.findById(id);
		if(student==null) 
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);	
		else
		return new ResponseEntity<>(student,HttpStatus.OK);
	}
	
}
