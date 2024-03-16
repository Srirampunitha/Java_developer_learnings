package com.Sriram.SprinBoot.Learningjpahibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Sriram.SprinBoot.Learningjpahibernate.course.SpringDataJpa.CourseSpringDataJpaRepo;

@Component
public class CourseCommanLineRunner implements CommandLineRunner {
   
	
	//private CourseJdbcRepository repo ;
   
//	@Autowired
//	private CourseJpaRepo repo ;
	@Autowired
	private CourseSpringDataJpaRepo repo; 
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Course(1, "react", "Sriram"));
		repo.save(new Course(2, "AWS", "Ram"));
		repo.save(new Course(3, "spring framework", "Ranga"));
		repo.save(new Course(4, "devops", "Rahul M"));
		System.out.println("values inserted into db");
		System.out.println(repo.findById(1l));
		repo.deleteById(2l);
		//repo.Update(new Course("Azure" ,"Jsoeph" ,2));
	    System.out.println(repo.findById(2l));
	    System.out.println(repo.findById(3l));
	    System.out.println(repo.findById(4l));
	}
  
}
