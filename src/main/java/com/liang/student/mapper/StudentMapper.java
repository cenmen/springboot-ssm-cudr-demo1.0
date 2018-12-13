package com.liang.student.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.liang.student.beans.Student;

public interface StudentMapper {
	/**
	 * 获取所有的学生
	 * @return
	 */
	@Select("select * from student")
	List<Student> getStudents();
	
	/**
	 * 添加学生
	 * @param student
	 */
	@Insert("insert into student values(#{num}, #{name}, #{grade}, #{college})")
	void addStudent(Student student);
	
	/**
	 * 根据ID查询学生
	 * @param student
	 * @return
	 */
	@Select("select * from student where num = #{num}")
	Student getStudentById(Student student);
	
	/**
	 * 修改学生
	 * @param student
	 */
	@Update("update student set name = #{name}, grade = #{grade}, college = #{college} where num = #{num}")
	void updateStudent(Student student);
	
	/**
	 * 删除学生
	 * @param student
	 */
	@Delete("delete from student where num = #{num}")
	void deleteStudent(Student student);
}
