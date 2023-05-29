package com.simplilearn.hibernate.mvc.service;

import java.util.List;

import com.simplilearn.hibernate.mvc.dao.UserDao;
import com.simplilearn.hibernate.mvc.dao.UserDaoImpl;
import com.simplilearn.hibernate.mvc.dto.User;

public class UserServiceImpl implements UserService {

    UserDao dao;
    public UserServiceImpl() {
	dao = new UserDaoImpl();
    }
    @Override
    public Integer addUser(User user) {
	return dao.addUser(user);
	
    }

    @Override
    public void updateUser(int userId, String password) {
	dao.updateUser(userId,password);
	
    }

    @Override
    public void deleteUser(int userId) {
	dao.deleteUser(userId);
	
    }

    @Override
    public User searchUser(int userId) {
	return dao.searchUser(userId);
    }

    @Override
    public List<User> getAllUsers() {
	return dao.getAllUsers();
    }

}
