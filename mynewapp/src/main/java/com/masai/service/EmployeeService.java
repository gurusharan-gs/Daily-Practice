package com.masai.service;

import com.masai.exception.EmployeeExcepion;
import com.masai.model.Employee;

public interface EmployeeService {
	
	public Employee addEmp(Employee employee);
	
	public Employee deleteEmp(Integer id)throws EmployeeExcepion;
	
//	public Employee getByIdEmp(Integer id)throws EmployeeExcepion;
	
	public Employee updateEmp(Employee employee);

}
