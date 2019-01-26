package com.in28minutes.springboot.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // map this class to database
public class User {
	// Using id as primary key
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO) // auto generate the id
	private Long id;
	
	private String Name;
	private String role;
	
	//JPA require empty constructor
	protected User() {}
	
	
	public User(String name, String role) {
		super();
		Name = name;
		this.role = role;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", Name=" + Name + ", role=" + role + "]";
	}
	

}
