package com.simplilearn.hibernate.mvc.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.simplilearn.hibernate.mvc.dto.User;
import com.simplilearn.hibernate.mvc.util.SessionFactoryManagerImpl;

public class UserDaoImpl implements UserDao{
    
    private SessionFactory factory;
    
    public UserDaoImpl() {
	factory = new SessionFactoryManagerImpl().getSessionFactory();
    }

    @Override
    public Integer addUser(User user) {
	Integer userId=null;
	Session session = factory.openSession();
	org.hibernate.Transaction transaction = session.beginTransaction();
	
	userId = (Integer) session.save(user);
	
	transaction.commit();
	session.close();
	return userId;
    }

    @Override
    public void updateUser(int userId, String password) {
	Session session = factory.openSession();
	org.hibernate.Transaction transaction = session.beginTransaction();
	
	User user = session.get(User.class, userId);
	user.setPassword(password);
	session.update(user);
	
	transaction.commit();
	session.close();
    }

    @Override
    public void deleteUser(int userId) {
	Session session = factory.openSession();
	org.hibernate.Transaction transaction = session.beginTransaction();
	
	User user = session.get(User.class, userId);
	//user.setPassword(password);
	session.delete(user);
	
	transaction.commit();
	session.close();
	
    }

    @Override
    public User searchUser(int userId) {
	
	Session session = factory.openSession();
	//org.hibernate.Transaction transaction = session.beginTransaction();
	
	User user = session.get(User.class, userId);
	
	return user;
    }

    @Override
    public List<User> getAllUsers() {
	List<User> allUsers = new ArrayList<User>();
	Session session = factory.openSession();
	
	String hql = "FROM User";
	TypedQuery<User> query = session.createQuery(hql);
	allUsers = query.getResultList();
	
	return allUsers;
    }

}
