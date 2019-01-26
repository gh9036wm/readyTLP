package com.in28minutes.learning.jpa.jpain10steps.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;
// @Repository is used to interact with database
// To insert or modify we have to be inside transaction: open transaction- modify- close transaction
// Relation between Persistence context and EntityManager: EntityManage is interface of persistence context:
//entityManager.persist(user); user inside persitence context and is tracked by Persistence context
@Repository
@Transactional
public class UserDAOService {
	@PersistenceContext
	private EntityManager entityManager ;
	
	public long insert(User user) {
		entityManager.persist(user);
		return user.getId();
		
	}

}
