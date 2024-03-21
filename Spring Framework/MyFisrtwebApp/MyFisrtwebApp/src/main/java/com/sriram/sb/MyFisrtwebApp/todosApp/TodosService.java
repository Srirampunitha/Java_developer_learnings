package com.sriram.sb.MyFisrtwebApp.todosApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class TodosService {
	private static int todoscount = -1;
	public static List<TodosEntity> todos = new ArrayList<>();
	static {

		todos.add(new TodosEntity(++todoscount, "Sriram", "learn devops", LocalDate.now().plusYears(1), false));
		todos.add(new TodosEntity(++todoscount, "Sriram", "learn aws", LocalDate.now().plusYears(2), false));
		todos.add(new TodosEntity(++todoscount, "Sriram", "learn Azure", LocalDate.now().plusYears(3), true));
	}

	public void addtodos(String name, String todos, LocalDate date) {
		TodosEntity todoentity = new TodosEntity(++todoscount, name, todos, date, false);
		TodosService.todos.add(todoentity);
	}

	public List<TodosEntity> findByUser(String name) {
		return todos;
	}
	public void deleteById(int id) {
		Predicate<TodosEntity> pedicate = TodosEntity -> TodosEntity.getId() == id ;
		todos.removeIf(pedicate);
	}
	public void update(TodosEntity todo ) {
		deleteById(todo.getId());
		todos.add(todo);
	}
	public TodosEntity findById(int id ) {
		Predicate<TodosEntity> pedicate = 
				TodosEntity -> TodosEntity.getId() == id ;
		return todos.stream().filter(pedicate).findFirst().get();		
	}
}
