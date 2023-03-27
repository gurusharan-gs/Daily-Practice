package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Laptop;
import com.masai.service.LaptopService;

@RestController
public class LaptopController {
	
	@Autowired
	private LaptopService laptopService;
	
	@PostMapping("/laptop/creat/{id}")
	public ResponseEntity<Laptop> creatLaptopHandel(@RequestBody Laptop laptop, @PathVariable("id") Integer id){
		Laptop creatLpt = laptopService.creatLaptop(laptop, id);
		return new ResponseEntity<Laptop>(creatLpt, HttpStatus.CREATED);
	}

}
