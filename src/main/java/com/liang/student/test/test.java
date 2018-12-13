package com.liang.student.test;

import java.util.List;

import com.liang.student.beans.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.liang.student.service.IStudentService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class test {
	@Autowired
	private IStudentService studentService;
	
	@Test
	public void testFindAllStudent() {
		List<Student> studentList = studentService.findAllStudent();
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
	
	@Test
	public void testAddStudent() {
		Student student = new Student();
		student.setNum("201511701111");
		student.setName("towns");
		student.setGrade("体育1821");
		student.setCollege("休闲体育学院");
		studentService.addStudent(student);
	}
	
	@Test
	public void testFindStudentByID() {
		Student student = studentService.getStudent("201511701111");
		System.out.println(student);
	}
	
	@Test
	public void testUpdateStudent() {
		Student student = new Student();
		student.setNum("201511701111");
		student.setName("wade");
		student.setGrade("体育1821");
		student.setCollege("休闲体育学院");
		studentService.updateStudent(student);
	}
	
	@Test
	public void testDeleteStudentByID() {
		studentService.deleteStudent("123");
	}
}
