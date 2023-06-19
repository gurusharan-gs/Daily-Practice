package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;
import com.masai.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/student/add")
	public ResponseEntity<Student> addStudentH(@RequestBody Student student){
		Student add = studentService.addStudent(student);
		return new  ResponseEntity<Student>(add, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/student/delete/{id}")
	public ResponseEntity<Student> deleteStudentH(@PathVariable("id") int id){
		Student delete = studentService.deleteStudent(id);
		return new  ResponseEntity<Student>(delete, HttpStatus.OK);
	}
	
	@PutMapping("student/updata")
	public ResponseEntity<Student> updataStudentH(@RequestBody Student student){
		Student updata = studentService.updateStudent(student);
		return new ResponseEntity<Student>(updata, HttpStatus.OK);
	}
}
