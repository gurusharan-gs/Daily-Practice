
package com.masai.service;

import java.util.List;

import com.masai.model.Product;

public interface ProductService {

	public Product addProduct(Product product);
	
	public List<Product> getAllProduct(Product product);
	
}
