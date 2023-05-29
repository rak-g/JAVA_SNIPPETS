package com.simplilearn.hibernate.mvc.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplilearn.hibernate.mvc.dto.User;
import com.simplilearn.hibernate.mvc.service.UserServiceImpl;

public class GetAllUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    List<User> allusers = new UserServiceImpl().getAllUsers();
	    
	    if(allusers.size()>0) {
		request.setAttribute("allusers", allusers);
		RequestDispatcher dispatcher = request.getRequestDispatcher("displayallusers.jsp");
		dispatcher.forward(request, response);
	    }
	    else {
		String msg = "No Data found";
		request.setAttribute("msg", msg);
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	    }
	    
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
