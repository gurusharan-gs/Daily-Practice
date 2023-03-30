package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Employee;
import com.masai.service.EmployeeService;

import jakarta.websocket.server.PathParam;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService emploService;

	@PostMapping("/employee/add")
	public ResponseEntity<Employee> addempHandel(@RequestBody Employee employee){
		Employee saveEmp = emploService.addEmp(employee);
		return new ResponseEntity<>(saveEmp, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/employee/{empId}")
	public ResponseEntity<Employee> deleteEmpHandel(@PathVariable("empId") Integer id){
		Employee deleteEmp = emploService.deleteEmp(id);
		return new ResponseEntity<>(deleteEmp, HttpStatus.OK);
	}
}
