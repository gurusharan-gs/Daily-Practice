package com.masai.controller;

import java.util.List;

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

//	employee data adding 
	
	@PostMapping("/employee/add")
	public ResponseEntity<Employee> addEmpH(@RequestBody Employee employee) {
		Employee saveEmp = employeeService.addEmp(employee);
		return new ResponseEntity<Employee>(saveEmp, HttpStatus.CREATED);
	}
	
//	employee data deleting 
	
	@DeleteMapping("/employee/{empId}")
	public ResponseEntity<Employee> deleteEmpH(@PathVariable("empId") Integer id) {
		Employee deleteEmp = employeeService.deleteEmp(id);
		return new ResponseEntity<Employee>(deleteEmp, HttpStatus.OK);
	}
	
//	employee data get by id
	
	@GetMapping("/employee/{empId}")
	public ResponseEntity<Employee> getByIdH(@PathVariable("empId") Integer id) {
		Employee getEmp = employeeService.getByIdEmp(id);
		return new ResponseEntity<Employee>(getEmp, HttpStatus.OK);
	}
	
//	employee data updating
	
	@PutMapping("/employee/{empId}/update")
	public ResponseEntity<Employee> updateEmpH(@PathVariable("empId")Integer id, @RequestBody Employee employee) {
		Employee updateEmp = employeeService.updateEmp(id, employee);
		return new ResponseEntity<Employee>(updateEmp, HttpStatus.CREATED);
	}
	
//	employee data get all
	
	@GetMapping("/employee/all")
	public ResponseEntity<List<Employee>> getAll(){
		List<Employee> allEmp = employeeService.getAll();
		return new ResponseEntity<List<Employee>>(allEmp, HttpStatus.OK);
	}
}
