package com.uttesh.spring.entitymanager.user;

import java.util.List;

import com.uttesh.spring.entitymanager.model.User;

public interface IUserService {

	void save(User user);
	List<User> findAllUsers();
}
