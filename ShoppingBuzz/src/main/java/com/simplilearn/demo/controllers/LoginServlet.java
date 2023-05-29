package com.simplilearn.demo.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplilearn.demo.dto.User;
import com.simplilearn.demo.service.UserServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("LoginServlet");
		
		String uname = request.getParameter("uname");
		String password = request.getParameter("pword");
		
		User user = new User(uname,password);
		boolean isUserValid = new UserServiceImpl().validateUser(user);
		
		if(isUserValid==true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("ValidUserServlet");
			dispatcher.forward(request, response);
		}
		else {
			response.sendRedirect("InvalidUserServlet");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
