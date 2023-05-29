package com.simplilearn.demo.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplilearn.demo.dto.Product;
import com.simplilearn.demo.service.ProductServiceImpl;

public class ProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Set<Product> allProducts = new ProductServiceImpl().getProducts();
		PrintWriter writer = response.getWriter();
		writer.println("<table border='3'>");
		for(Product product:allProducts) {
			writer.println("<tr>");
			writer.println("<td>");
			writer.println(product.getProductId());
			writer.println("</td>");
			writer.println("<td>");
			writer.println(product.getProductName());
			writer.println("</td>");
			writer.println("<td>");
			writer.println(product.getProductCost());
			writer.println("</td>");
			writer.println("</tr>");
		}
		writer.println("</table");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
