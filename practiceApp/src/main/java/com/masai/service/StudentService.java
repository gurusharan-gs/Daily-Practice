package com.masai.service;

import org.springframework.stereotype.Service;

import com.masai.exception.StudentException;
import com.masai.model.Student;

public interface StudentService {

	public Student addStudent(Student student); 
	
	public Student deleteStudent(int id)throws StudentException;
	
	public Student updateStudent(Student student)throws StudentException;
}
