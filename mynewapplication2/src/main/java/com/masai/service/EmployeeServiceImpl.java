package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EmployeeExcepion;
import com.masai.model.Employee;
import com.masai.repository.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee addEmp(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public Employee deleteEmp(Integer id) {
		Optional<Employee> opt = employeeDao.findById(id);

		if (opt != null) {
			throw new EmployeeExcepion("employee id not found");
		}
		Employee emp = opt.get();
		employeeDao.delete(emp);
		return emp;
	}

	@Override
	public Employee getByIdEmp(Integer id) {
		Optional<Employee> opt = employeeDao.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		}
		throw new EmployeeExcepion("employee id not found");
	}
	
//	if (opt.isPresent()) {
//		Student uStudent = studentDao.save(student);
//		return uStudent;
//	}

	@Override
	public Employee updateEmp(Employee employee) {
		Optional<Employee> opt = employeeDao.findById(employee.getId());
		if (opt.isPresent()) {
			Employee update = employeeDao.save(employee);
			return update;
		}
		throw new EmployeeExcepion("employee not found");
	}

}
