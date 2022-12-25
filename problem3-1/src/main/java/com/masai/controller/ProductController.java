package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Product;
import com.masai.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService pservice;
	
	@PostMapping("/product")
	public ResponseEntity<Product> addProductHandle(Product product){
		
		Product savePr = pservice.addProduct(product);
		
		return new ResponseEntity<Product>(savePr, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/product")
	public ResponseEntity<List<Product>> getAllProductHandle(Product product){
		
		List<Product> savePr = pservice.getAllProduct(product);
		
		return new ResponseEntity<List<Product>>(savePr, HttpStatus.OK);
		
	}
	
	
	
}
