package com.in28minutes.springboot.web.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.springboot.web.model.Todo;
//CRUDRepository vs. JpaRepository : Jpa help to get directly without call in 
public interface TodoRepository extends JpaRepository<Todo,Integer> {
	//Service.retrieveTodos(Name). we have to create this 
	List<Todo> findByUser(String user);
	
	
	
	//jpaRepository include these service  but not the name above 
	//Service.deleteTodo(id)
	//Service.retrieveTodo(id)
	//Service.updateTodo(todo)
	//Sevice.addTodo()

}
