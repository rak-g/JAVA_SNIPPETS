package com.simplilearn.demo.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServlet
 */
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestFor = request.getParameter("task");
		//System.out.println(requestFor);
		
		if(requestFor.equals("login")) {
			/*Request delegation to LoginServlet*/
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/LoginServlet");
			/*Post request delegate response for the request*/
			requestDispatcher.forward(request, response);
		}
		else {
			response.sendRedirect("registeruser.html");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
