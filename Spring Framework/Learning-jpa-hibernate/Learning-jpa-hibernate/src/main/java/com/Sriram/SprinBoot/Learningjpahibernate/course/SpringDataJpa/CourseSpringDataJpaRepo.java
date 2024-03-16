package com.Sriram.SprinBoot.Learningjpahibernate.course.SpringDataJpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sriram.SprinBoot.Learningjpahibernate.course.Course;

public  interface CourseSpringDataJpaRepo extends JpaRepository<Course, Long> {

}
