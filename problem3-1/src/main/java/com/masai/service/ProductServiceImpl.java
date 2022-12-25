package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Product;
import com.masai.repository.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{
	
    @Autowired
	private ProductDao pdao;
	
	@Override
	public Product addProduct(Product product) {
       Product p = pdao.save(product);
       return p;
	}

	@Override
	public List<Product> getAllProduct(Product product) {

		 List<Product> p = pdao.findAll();
		 if(p.size()== 0) {
			 throw new IllegalArgumentException("invalid");
		 }
		 return p;
		
	}

}
