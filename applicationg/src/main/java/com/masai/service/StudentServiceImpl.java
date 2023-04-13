package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Student;
import com.masai.repository.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studenDao;

	@Override
	public Student addStudent(Student student) {
		return studenDao.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		Optional<Student> opt = studenDao.findById(student.getRoll());

		if (opt.isPresent()) {
			Student updateStudent = opt.get();
			if (student.getRoll() != null) {
				updateStudent.setRoll(student.getRoll());
			}
			if (student.getName() != null) {
				updateStudent.setName(student.getName());
			}
			if (student.getMarks() != null) {
				updateStudent.setMarks(student.getMarks());
			}
			if (student.getAddr() != null) {
				updateStudent.setAddr(student.getAddr());
			}
			return studenDao.save(updateStudent);
		}
		throw new IllegalArgumentException("not found");
	}

	@Override
	public Student deleteStudent(Integer roll) {
		Optional<Student> opt = studenDao.findById(roll);
		if (opt.isPresent()) {
			Student student = opt.get();
			studenDao.delete(student);
			return student;
		}
		throw new IllegalArgumentException("not found this id");
	}

	@Override
	public Student findByNameStudend(String name) {
		Student student = studenDao.findByName(name);
		if (student == null) {
			throw new IllegalArgumentException("not found this name "+name);
		} else {
			return student;
		}
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> allStudent = studenDao.findAll();
		if (allStudent.size()==0) {
			throw new IllegalArgumentException("not fond list");
		}
		return allStudent;
	}
	
	

}
