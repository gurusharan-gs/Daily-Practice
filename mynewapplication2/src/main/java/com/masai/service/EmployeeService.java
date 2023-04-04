package com.masai.service;

import java.util.List;

import com.masai.exception.EmployeeExcepione;
import com.masai.model.Employee;



public interface EmployeeService {
	
	public Employee addEmp(Employee employee);
	
	public Employee deleteEmp(Integer id)throws EmployeeExcepione;
	
	public Employee getByIdEmp(Integer id)throws EmployeeExcepione;
	
	public Employee updateEmp(Integer id, Employee employee)throws EmployeeExcepione;
	
	public List<Employee> getAll()throws EmployeeExcepione;
	
	public Employee getByNameEmp(String name)throws EmployeeExcepione;
	
	

}
