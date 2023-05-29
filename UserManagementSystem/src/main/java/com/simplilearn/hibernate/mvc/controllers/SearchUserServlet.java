package com.simplilearn.hibernate.mvc.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplilearn.hibernate.mvc.dao.UserDaoImpl;
import com.simplilearn.hibernate.mvc.dto.User;

public class SearchUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    Integer userId = Integer.parseInt(request.getParameter("userid"));
	    User user = new UserDaoImpl().searchUser(userId);

	    if(user!=null) {
		request.setAttribute("user", user);
		RequestDispatcher dispatcher = request.getRequestDispatcher("displayuser.jsp");
		dispatcher.forward(request, response);
	    }
	    else {
		String msg = "User not found";
		request.setAttribute("msg", msg);
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
