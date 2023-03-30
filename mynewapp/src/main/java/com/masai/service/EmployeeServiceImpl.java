package com.masai.service;

import java.lang.StackWalker.Option;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.masai.exception.EmployeeExcepion;
import com.masai.model.Employee;
import com.masai.repository.EmployeeDao;

@Service
public abstract class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee addEmp(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.save(employee);
	}

	public Employee deleteEmp(Integer id) throws EmployeeExcepion {

		Optional<Employee> opt = employeeDao.findById(id);
		if (opt != null) {
			Employee employee = opt.get();
			employeeDao.delete(employee);
			return employee;
		} else {
			throw new EmployeeExcepion("employee id not found");
		}

	}

}
