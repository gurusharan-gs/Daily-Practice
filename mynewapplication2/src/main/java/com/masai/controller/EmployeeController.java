package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.masai.model.Employee;
import com.masai.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/employee/add")
	public ResponseEntity<Employee> addEmpH(@RequestBody Employee employee) {
		Employee saveEmp = employeeService.addEmp(employee);
		return new ResponseEntity<Employee>(saveEmp, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/employee/{empId}")
	public ResponseEntity<Employee> deleteEmpH(@PathVariable("empId") Integer id) {
		Employee deleteEmp = employeeService.deleteEmp(id);
		return new ResponseEntity<Employee>(deleteEmp, HttpStatus.OK);
	}
	
	@GetMapping("/employee/{empId}")
	public ResponseEntity<Employee> getByIdH(@PathVariable("empId") Integer id) {
		Employee getEmp = employeeService.getByIdEmp(id);
		return new ResponseEntity<Employee>(getEmp, HttpStatus.OK);
	}
	
	@PutMapping("/employee/update")
	public ResponseEntity<Employee> updateEmpH(@RequestBody Employee employee) {
		Employee updateEmp = employeeService.updateEmp(employee);
		return new ResponseEntity<Employee>(updateEmp, HttpStatus.CREATED);
	}
}
