package com.Sriram.SprinBoot.Learningjpahibernate.course.jpa;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.Sriram.SprinBoot.Learningjpahibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepo {
	@PersistenceContext
    EntityManager em;
	
	public void insert(Course course) {
		em.merge(course);
	}
	
	public Course findById (long id) {
	return em.find(Course.class, id);
		}
	public void Delete (long id) {
		Course course = em.find(Course.class, id);
		em.remove(course);
			}
}
