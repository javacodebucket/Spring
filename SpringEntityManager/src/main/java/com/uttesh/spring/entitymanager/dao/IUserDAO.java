package com.uttesh.spring.entitymanager.dao;

import java.util.List;

import com.uttesh.spring.entitymanager.model.User;

public interface IUserDAO {

	public void save(User user);
	List<User> findAllUsers();
}
