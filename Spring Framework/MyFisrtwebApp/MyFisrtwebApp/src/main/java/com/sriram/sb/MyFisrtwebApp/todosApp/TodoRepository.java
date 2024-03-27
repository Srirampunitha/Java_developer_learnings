package com.sriram.sb.MyFisrtwebApp.todosApp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodosEntity, Integer> {
        public List<TodosEntity> findByUsername(String Username);

		
}
