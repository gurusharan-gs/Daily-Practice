package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;
import com.masai.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/student/creat")
	public ResponseEntity<Student> creatStudentHandel(@RequestBody Student student){
		Student creatStd = studentService.creatStudent(student);
		return new ResponseEntity<Student>(creatStd, HttpStatus.CREATED);
	}

}
