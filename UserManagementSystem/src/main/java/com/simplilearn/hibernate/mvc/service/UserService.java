package com.simplilearn.hibernate.mvc.service;

import java.util.List;

import com.simplilearn.hibernate.mvc.dto.User;

public interface UserService {
    
    public Integer addUser(User user);
    public void updateUser(int userId, String password);
    public void deleteUser(int userId);
    public User searchUser(int userId);
    public List<User> getAllUsers();

}
