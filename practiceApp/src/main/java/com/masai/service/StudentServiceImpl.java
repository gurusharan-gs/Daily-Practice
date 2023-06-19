package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

//	@Override
//	public Student deleteStudent(int id) throws StudentException {
//		Optional<Student> opt = studentRepository.findById(id);
//		if(opt.isPresent()) {
//			Student std = opt.get();
//			studentRepository.delete(std);
//			return std;
//		}
//		throw new StudentException("not found this student");
//	}

	@Override
	public Student updateStudent(Student student) throws StudentException {
		 
		Optional<Student> opt = studentRepository.findById(student.getId());
		
		if (opt.isPresent()) {
			Student update = opt.get();
			
			update.setName(student.getName());
			update.setMarks(student.getMarks());
			update.setAddr(student.getAddr());
			
			return studentRepository.save(update);
		}
		throw new StudentException("not foud..");
	}

@Override
public Student deleteStudent(int id) throws StudentException {
	Optional<Student> opt = studentRepository.findById(id);
	if(opt.isPresent()) {
		Student std = opt.get();
		studentRepository.delete(std);
		return std;
	}
	throw new StudentException("not found this student");
}



}
