package com.Sriram.SprinBoot.Learningjpahibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Sriram.SprinBoot.Learningjpahibernate.course.Course;

@Repository
public class CourseJdbcRepository {

@Autowired
private JdbcTemplate springjdbctemplate;

private static String INSERT_QUERY =
"""	
insert into course (id,Name,Author) 
values (?, ? , ?);
""";

private static String DELETE_QUERY = """ 
	delete from course where id = ?	
	"""; 
private static String UPDATE_QUERY = """
		update course set name=? , author =? where id = ?
		
		""";
private static String SELECT_QUERY = """
SELECT * from course where id = ?

""";

public void insert(Course course) {
springjdbctemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
}
public void Delete(long id) {
springjdbctemplate.update(DELETE_QUERY,id);
}
public void Update(Course course) {
springjdbctemplate.update(UPDATE_QUERY,course.getName(),course.getAuthor(),course.getId());
}
public Course findById (long id) {
return springjdbctemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class) ,id) ;
}
}
