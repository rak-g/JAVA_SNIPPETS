package com.simplilearn.demo.dao;

import com.simplilearn.demo.dto.User;

public interface UserDao {
	public boolean validateUser(User user);
	public boolean registerUser(User user);
}
