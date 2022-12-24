package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Employee;
import com.masai.repository.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao edao;
	
	@Override
	public Employee insertEmployees(Employee employee) {
		
		Employee saveEmployee = edao.save(employee);
		
		return saveEmployee;
	}

}
