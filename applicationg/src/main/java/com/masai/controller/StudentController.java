package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
	public ResponseEntity<Student> addStudentHandel(@RequestBody Student student) {
		Student saveStudent = studentService.addStudent(student);
		return new ResponseEntity<Student>(saveStudent, HttpStatus.CREATED);
	}

	@PutMapping("/student/update")
	public ResponseEntity<Student> updateStudentHandel(@RequestBody Student student) {
		Student updateStudent = studentService.updateStudent(student);
		return new ResponseEntity<Student>(updateStudent, HttpStatus.OK);
	}

	@DeleteMapping("/student/delete/{rollId}")
	public ResponseEntity<Student> deleteStudentHandel(@PathVariable("rollId") Integer roll) {
		Student deleteStudent = studentService.deleteStudent(roll);
		return new ResponseEntity<Student>(deleteStudent, HttpStatus.OK);
	}

	@GetMapping("/student/{name}")
	public ResponseEntity<Student> findByNameHandel(@PathVariable("name") String name) {
		Student studentName = studentService.findByNameStudend(name);
		return new ResponseEntity<Student>(studentName, HttpStatus.OK);
	}
	
	@GetMapping("/student/all")
	public ResponseEntity<List<Student>> getAllStudentH(){
		List<Student> all = studentService.getAllStudent();
		return new ResponseEntity<List<Student>>(all,HttpStatus.OK);
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getByIdHandel(@PathVariable("id") Integer roll) {
		Student studentId = studentService.findById(roll);
		return new ResponseEntity<Student>(studentId, HttpStatus.OK);
	}
}
