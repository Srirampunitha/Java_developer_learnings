package com.sriram.sb.MyFisrtwebApp.todosApp;

import java.time.LocalDate;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;


@SessionAttributes("name")
public class TodosController {
    private TodosService todoservice ;
   
    public TodosController(TodosService todoservice ,TodoRepository todorepo) {
    	this.todoservice =todoservice ;
    	
    	
    }
	@RequestMapping("listtodos")
	public String goToTodosPage(ModelMap model) {
		System.out.println("list-todo get method");
		model.addAttribute("todos", todoservice.findByUser(getUserName()));
		return "listtodos";
	}
	
	@RequestMapping(value="add-todo" ,method=RequestMethod.GET)
	public String goToaddTodosPage(ModelMap model) {
		System.out.println("add-todo get method");
		String username = getUserName();
		TodosEntity todoenEntity = new TodosEntity(0, username,"", LocalDate.now(), false);
		model.addAttribute("todo", todoenEntity);
		return "addtodo";
	}
	
	@RequestMapping(value="add-todo" ,method=RequestMethod.POST)
	public String addedTodos( ModelMap model , @ModelAttribute("todo") @Valid TodosEntity todo , BindingResult result ) {
		if(result.hasErrors()) {
			return "addtodo";
		}
		System.out.println("add-todo post method");
		String username = getUserName();
		todoservice.addtodos( username, todo.getTodos(), todo.getDate());
		return "redirect:listtodos";
	}
	@RequestMapping(value="delete-todo" ,method=RequestMethod.GET)
	public String deletetodo(@RequestParam int id ) {
		todoservice.deleteById(id);
		return "redirect:listtodos";
	}
	@RequestMapping(value="update-todo" ,method=RequestMethod.GET)
	public String updateTodo(@RequestParam int id ,ModelMap model) {
		System.out.println("update-todo get method");
		TodosEntity todo =  todoservice.findById(id);
		model.addAttribute("todo", todo);
		return "addtodo";	
		}
	@RequestMapping(value="update-todo" ,method=RequestMethod.POST)
	public String updatedTodo(ModelMap model,@ModelAttribute("todo") @Valid TodosEntity todo,BindingResult result) {
		System.out.println("update-todo post method");
		if(result.hasErrors()) {
			return "addtodo";
		}
		String name = getUserName();
		todo.setUsername(name);
		todoservice.update(todo);
		return "redirect:listtodos";
	}
	private String getUserName() {
		Authentication auth =  SecurityContextHolder.getContext().getAuthentication() ;
		   return auth.getName() ;
	}
}
