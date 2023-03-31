package com.masai.service;

import java.util.List;

import com.masai.model.Employee;



public interface EmployeeService {
	
	public Employee addEmp(Employee employee);
	
	public Employee deleteEmp(Integer id);
	
	public Employee getByIdEmp(Integer id);
	
	public Employee updateEmp(Employee employee);
	
	public List<Employee> getAll();
	
	

}
