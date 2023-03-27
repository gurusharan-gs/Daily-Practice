package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Laptop;
import com.masai.model.Student;
import com.masai.repository.LaptopRepo;
import com.masai.repository.StudentRepo;

@Service
public class LaptopServiceImpl implements LaptopService{

	@Autowired
	private LaptopRepo laptoprepo;
	
	@Autowired
	private StudentRepo studentRepo;
	
	@Override
	public Laptop creatLaptop(Laptop laptop, Integer id) {
		
		Student student = studentRepo.findById(id).get();
		
		laptop.setStudent(student);
		student.setLaptop(laptop);

		
		
		return studentRepo.save(student).getLaptop();
		
		
		
	
	}

}
