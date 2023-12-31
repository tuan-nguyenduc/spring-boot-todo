package com.tuannd.springboot.firstwebapp.todo;

import java.util.List;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;


@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int todosCount = 0;
	
	static {
			todos.add(new Todo(++todosCount, "tuannd","Learn AWS", 
								LocalDate.now().plusYears(1), false ));
			todos.add(new Todo(++todosCount, "tuannd","Learn DevOps", 
					LocalDate.now().plusYears(2), false ));
			todos.add(new Todo(++todosCount, "tuannd","Learn Full Stack Development", 
					LocalDate.now().plusYears(3), false ));
	}

	public List<Todo> findByUsername(String username) {
		return todos;
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todosCount,username,description,targetDate,done);
		todos.add(todo);
	}
	
}
