package com.simplilearn.demo.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplilearn.demo.dto.User;
import com.simplilearn.demo.service.UserServiceImpl;


public class RegisterUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String first_name = request.getParameter("fname");
		String last_name = request.getParameter("lname");
		String user_name = request.getParameter("uname");
		String password = request.getParameter("pword");
		String address = request.getParameter("address");
		
		User user = new User(first_name,last_name,address,user_name,password);
		boolean isUserRegistered = new UserServiceImpl().registerUser(user);
		if(isUserRegistered==true) {
			response.sendRedirect("home.html");
		}
		else {
			response.sendRedirect("registeruser.html");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
