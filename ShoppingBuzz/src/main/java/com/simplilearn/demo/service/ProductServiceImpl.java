package com.simplilearn.demo.service;

import java.util.Set;

import com.simplilearn.demo.dao.ProductDao;
import com.simplilearn.demo.dao.ProductDaoImpl;
import com.simplilearn.demo.dto.Product;

public class ProductServiceImpl implements ProductService {

	private ProductDao dao;
	
	public ProductServiceImpl() {
		dao = new ProductDaoImpl();
	}
	
	public Set<Product> getProducts() {
		return dao.getProducts();
	}

}
