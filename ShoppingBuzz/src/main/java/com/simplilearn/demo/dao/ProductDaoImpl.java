package com.simplilearn.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import com.mysql.cj.xdevapi.Statement;
import com.simplilearn.demo.dto.Product;
import com.simplilearn.demo.util.ConnectionManagerImpl;

public class ProductDaoImpl implements ProductDao {
	
	private Connection connection;
	
	public ProductDaoImpl() {
		connection = new ConnectionManagerImpl().getConnection();
	}
	@Override
	public Set<Product> getProducts() {
		Set<Product> allProducts = new HashSet<Product>();
		
		String query = "select * from products";
		try {
		    PreparedStatement statement = connection.prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				Product product = new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3));
				allProducts.add(product);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return allProducts;
	}

}
