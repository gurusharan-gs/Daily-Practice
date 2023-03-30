package com.masai.service;

import com.masai.model.Employee;

public interface EmployeeService {
	
	public Employee addEmp(Employee employee);
	
	public Employee deleteEmp(Integer id);
	
	public Employee getByIdEmp(Integer id);
	
	public Employee updateEmp(Employee employee);
	
	

}
