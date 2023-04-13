package com.masai.service;

import java.util.List;

import com.masai.model.Student;



public interface StudentService {
	
	public Student addStudent(Student student);
	
	public Student updateStudent(Student student);
	
	public Student deleteStudent(Integer roll);
	
	public Student findByNameStudend(String name);
	
	public List<Student> getAllStudent();
}
