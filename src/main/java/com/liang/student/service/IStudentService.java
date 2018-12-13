package com.liang.student.service;

import java.util.List;

import com.liang.student.beans.Student;

public interface IStudentService {
	/**
	 * 获取所有学生
	 * @return
	 */
	List<Student> findAllStudent();
	
	/**
	 * 添加学生
	 * @param student
	 */
	void addStudent(Student student);
	
	/**
	 * 根据ID查询学生
	 * @param id 学生ID
	 * @return
	 */
	Student getStudent(String num);
	
	/**
	 * 修改学生
	 * @param student
	 */
	void updateStudent(Student student);
	
	/**
	 * 删除学生
	 * @param id
	 */
	void deleteStudent(String num);
}
