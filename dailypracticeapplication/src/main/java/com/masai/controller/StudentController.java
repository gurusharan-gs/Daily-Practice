package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;
import com.masai.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	public ResponseEntity<Student> addStudentH(Student student) {
		Student saveStudent = studentService.addStudent(student);
		return new ResponseEntity<Student>(saveStudent, HttpStatus.CREATED);
	}

}
