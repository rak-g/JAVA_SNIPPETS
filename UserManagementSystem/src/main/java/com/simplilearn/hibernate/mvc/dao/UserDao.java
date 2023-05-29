package com.simplilearn.hibernate.mvc.dao;

import java.util.List;

import com.simplilearn.hibernate.mvc.dto.User;

public interface UserDao {

    public Integer addUser(User user);
    public void updateUser(int userId, String password);
    public void deleteUser(int userId);
    public User searchUser(int userId);
    public List<User> getAllUsers();
}
