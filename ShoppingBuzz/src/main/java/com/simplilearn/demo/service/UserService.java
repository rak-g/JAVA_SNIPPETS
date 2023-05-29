package com.simplilearn.demo.service;

import com.simplilearn.demo.dto.User;

public interface UserService {
	public boolean validateUser(User user);
	public boolean registerUser(User user);
}
