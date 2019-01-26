package com.in28minutes.learning.jpa.jpain10steps.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//if you want to store this user in a table use @Entity

@Entity
public class User {
	// define primary key @id and let system generate id used @GenerateValue
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String role;
	
	//JPA expect for every class default constructor on top of regular constructor
	protected User() {
		
	}
	public User(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getRole() {
		return role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
	

}
