package com.masai.service;

import java.net.URI;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.masai.exception.EmployeeExcepione;
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
			throw new EmployeeExcepione("employee id not found");
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
//		
//		ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.INTERNAL_SERVER_ERROR);
//		problemDetail.setTitle("employee id not found");
//		problemDetail.setDetail("invalid employee id");
//		problemDetail.setType(URI.create("http://localhost:8888/errors"));
//		problemDetail.setProperty("host", "localhost");
//		problemDetail.setProperty("port", 8888);
//	    ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(problemDetail);
	    
	    throw new EmployeeExcepione("employee id not found");
	}
	

	@Override
	public Employee updateEmp(Integer id, Employee employee) {
		Optional<Employee> opt = employeeDao.findById(id);
		
		if (opt.isPresent()) {
			
			Employee upEmp = opt.get();
			
			upEmp.setName(employee.getName());
			upEmp.setRole(employee.getRole());
			upEmp.setSalary(employee.getSalary());
			
			return employeeDao.save(upEmp);
		}else {
//			ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.INTERNAL_SERVER_ERROR);
//			problemDetail.setTitle("employee id not found");
//			problemDetail.setDetail("invalid employee id");
//			problemDetail.setType(URI.create("http://localhost:8888/errors"));
//			problemDetail.setProperty("host", "localhost");
//			problemDetail.setProperty("port", 8888);
//		    ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(problemDetail);
			
			throw new EmployeeExcepione("employee not found");
			
		}
		
//		if (opt.isPresent()) {
//			Employee update = employeeDao.save(employee);
//			return update;
//		}
//		throw new EmployeeExcepion("employee not found");
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> empList = employeeDao.findAll();
		
		if (empList.isEmpty()) {
			throw new EmployeeExcepione("not found");
		}
		return empList;
	}

	@Override
	public Employee getByNameEmp(String name) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Employee getByNameEmp(String name) {
//		String emp = employeeDao.findByName(name);
//		
//		if (emp.isEmpty()) {
//			
//		}
//	}

}
