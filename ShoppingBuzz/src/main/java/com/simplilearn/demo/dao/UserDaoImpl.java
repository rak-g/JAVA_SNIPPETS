package com.simplilearn.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.simplilearn.demo.dto.User;
import com.simplilearn.demo.util.ConnectionManagerImpl;

public class UserDaoImpl implements UserDao {

	private Connection connection;
	
	public UserDaoImpl() {
		connection = new ConnectionManagerImpl().getConnection();
	}
	@Override
	public boolean validateUser(User user) {
		boolean isUserValid = false;
		
		String query = "select * from userdetails where user_name=? and password=?";
		try {
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, user.getUserName());
			statement.setString(2, user.getPassword());
			
			ResultSet resultset = statement.executeQuery();
			if(resultset.next()==true)
				isUserValid = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isUserValid;
	}
	@Override
	public boolean registerUser(User user) {
		boolean isUserRegistered=false;
		String query="insert into userdetails value(?,?,?,?,?)";
		try {
			PreparedStatement preparedstatement = connection.prepareStatement(query);
			preparedstatement.setString(1, user.getFirstName());
			preparedstatement.setString(2, user.getLastName());
			preparedstatement.setString(3, user.getAddress());
			preparedstatement.setString(4, user.getUserName());
			preparedstatement.setString(5, user.getPassword());
			
			int data=preparedstatement.executeUpdate();
			if(data>0)
				isUserRegistered=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isUserRegistered;
	}

}
