package com.springmvc.dao;

import com.springmvc.entity.User;

public interface UserDao {

	public int saveUser(User user);
	
	public User loginUser(String email, String password);
}
