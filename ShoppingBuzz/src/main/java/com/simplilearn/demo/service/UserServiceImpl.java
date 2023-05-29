package com.simplilearn.demo.service;

import com.simplilearn.demo.dao.UserDao;
import com.simplilearn.demo.dao.UserDaoImpl;
import com.simplilearn.demo.dto.User;

public class UserServiceImpl implements UserService {
	
	private UserDao userdao;
	
	public UserServiceImpl() {
		userdao = new UserDaoImpl();
	}
	@Override
	public boolean validateUser(User user) {
		return userdao.validateUser(user);
	}
	@Override
	public boolean registerUser(User user) {
		return userdao.registerUser(user);
	}

}
