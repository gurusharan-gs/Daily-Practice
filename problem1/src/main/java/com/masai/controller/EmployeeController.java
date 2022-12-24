package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Employee;
import com.masai.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService eService;
	
	@PostMapping("/employees")
	public ResponseEntity<Employee>  insertEmployeesHandler(Employee employee) {
		
		Employee saveEmp = eService.insertEmployees(employee);
		
		return new ResponseEntity<Employee>(saveEmp, HttpStatus.CREATED);
		
	}
	
	
}
