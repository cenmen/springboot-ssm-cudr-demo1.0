package com.liang.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liang.student.beans.Student;
import com.liang.student.mapper.StudentMapper;
import com.liang.student.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public List<Student> findAllStudent() {
		return studentMapper.getStudents();
	}

	@Override
	public void addStudent(Student student) {
		studentMapper.addStudent(student);
	}

	@Override
	public Student getStudent(String num) {
		Student student = new Student();
		student.setNum(num);
		return studentMapper.getStudentById(student);
	}

	@Override
	public void updateStudent(Student student) {
		studentMapper.updateStudent(student);
	}

	@Override
	public void deleteStudent(String num) {
		Student student = new Student();
		student.setNum(num);
		studentMapper.deleteStudent(student);
	}

}
