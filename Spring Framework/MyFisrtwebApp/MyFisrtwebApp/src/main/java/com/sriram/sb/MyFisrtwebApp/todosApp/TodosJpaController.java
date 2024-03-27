package com.sriram.sb.MyFisrtwebApp.todosApp;

import java.time.LocalDate;
import java.util.Optional;

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

@Controller
@SessionAttributes("name")
public class TodosJpaController {

	private TodoRepository todorepo;

	public TodosJpaController(TodoRepository todorepo) {

		this.todorepo = todorepo;

	}

	@RequestMapping("listtodos")
	public String goToTodosPage(ModelMap model) {
		System.out.println("list-todo get method");
		model.addAttribute("todos", todorepo.findByUsername(getUserName()));
		return "listtodos";
	}

	@RequestMapping(value = "add-todo", method = RequestMethod.GET)
	public String goToaddTodosPage(ModelMap model) {
		System.out.println("add-todo get method");
		String username = getUserName();
		TodosEntity todoenEntity = new TodosEntity(0, username, "", LocalDate.now(), false);
		model.addAttribute("todo", todoenEntity);
		return "addtodo";
	}

	@RequestMapping(value = "add-todo", method = RequestMethod.POST)
	public String addedTodos(ModelMap model, @ModelAttribute("todo") @Valid TodosEntity todo, BindingResult result) {
		if (result.hasErrors()) {
			return "addtodo";
		}
		System.out.println("add-todo post method");
		String name = getUserName();
		todo.setUsername(name);
		todorepo.save(todo);
		return "redirect:listtodos";
	}

	@RequestMapping(value = "delete-todo", method = RequestMethod.GET)
	public String deletetodo(@RequestParam int id) {
		todorepo.deleteById(id);
		return "redirect:listtodos";
	}

	@RequestMapping(value = "update-todo", method = RequestMethod.GET)
	public String updateTodo(@RequestParam int id, ModelMap model) {
		System.out.println("update-todo get method");
		TodosEntity todo = todorepo.getById(id);
		model.addAttribute("todo", todo);
		return "addtodo";
	}

	@RequestMapping(value = "update-todo", method = RequestMethod.POST)
	public String updatedTodo(ModelMap model, @ModelAttribute("todo") @Valid TodosEntity todo, BindingResult result) {
		System.out.println("update-todo post method");
		if (result.hasErrors()) {
			return "addtodo";
		}
		String name = getUserName();
		todo.setUsername(name);
		todorepo.save(todo);
		return "redirect:listtodos";
	}

	private String getUserName() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		return auth.getName();
	}
}
