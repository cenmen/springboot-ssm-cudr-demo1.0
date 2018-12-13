package com.liang.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liang.student.beans.Student;
import com.liang.student.service.IStudentService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private IStudentService studentService;
	
	@RequestMapping(path="/addStudent.do")
	public void addStudent(Student student) {
		studentService.addStudent(student);
	}
	
	@RequestMapping(path="/updateStudent.do")
	public void updateStudent(Student student) {
		studentService.updateStudent(student);
	}
	
	@RequestMapping(path="/deleteStudent.do")
	public void deleteStudent(String num) {
		studentService.deleteStudent(num);
	}
	
	@RequestMapping(path="/getAllStudent.do", produces="application/json;charset=utf-8")
	public List<Student> getAllStudent(ModelMap modelMap) {
		List<Student> studentList = studentService.findAllStudent();
		modelMap.addAttribute("studentList", studentList); 
		System.out.println(studentList);
		return studentList;
	}
}
