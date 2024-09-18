package com.Sriram.RestApi.Wing1_demo.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Sriram.RestApi.Wing1_demo.Model.Student;
import com.Sriram.RestApi.Wing1_demo.repository.StudentRepo;

@Service
public class StudentService {
     
	@Autowired
	private StudentRepo repo;
	
	public Object findall() {
   
   List<Student> students =  repo.findAll();
   if(students.isEmpty()) {
	   return new ResponseEntity<>("No records Available",HttpStatus.NO_CONTENT);
   }else {
   return new ResponseEntity<>(students,HttpStatus.OK);
	}
  }

	public Object findStudnetsbyid(int id) {
		if(repo.existsById(id)) {
			return new ResponseEntity<>(repo.findById(id).get(),HttpStatus.OK);
		}else {
			return new ResponseEntity<>("ID not Found",HttpStatus.NOT_FOUND);
		}
	}

	public Object addStudents(Student student) {
		if(student!=null || student.getName()!=null) {
			return new ResponseEntity<>(repo.save(student),HttpStatus.CREATED);
		}else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	public Object updateStudentsbyId(Student student, int id) {
		if(repo.existsById(id)) {
			student.setId(id);
			Student updatedStudnet = repo.save(student);
			return new ResponseEntity<>(updatedStudnet,HttpStatus.OK);
		}else {
			return new ResponseEntity<>("ID not Found",HttpStatus.NOT_FOUND);
		}
	}

	public Object deleteById(int id) {
		if(repo.existsById(id)) {
			 repo.deleteById(id);
			return new ResponseEntity<>("records Dleted Succussfully",HttpStatus.OK);
		}else {
			return new ResponseEntity<>("ID not Found",HttpStatus.NOT_FOUND);
		}
	}

	public Object updateStudentName(Student student, int id) {
		
		if(repo.existsById(id)) {
			 Optional<Student> oldstudent = repo.findById(id);
			 if(oldstudent.isEmpty()) {
				 return new ResponseEntity<>("nothing to Update studnet is empty",HttpStatus.NO_CONTENT); 
			 }else {
				 Student updateStudent = oldstudent.get();
				 updateStudent.setId(id);
				 updateStudent.setName(student.getName());
				 return new ResponseEntity<>(repo.save(updateStudent),HttpStatus.OK); 
			 }	
		}else {
			return new ResponseEntity<>("ID not Found",HttpStatus.NOT_FOUND);
		}
	}

	public List<Student> findByName(String name) {
		List<Student> Allstudents = repo.findAll();
		Predicate<? super Student> predicate = students -> students.getName().equalsIgnoreCase(name);
		List<Student> students =	Allstudents.stream().filter(predicate).toList();
		return students ;
	}
}
