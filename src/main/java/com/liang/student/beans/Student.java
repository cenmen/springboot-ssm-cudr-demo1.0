package com.liang.student.beans;

import lombok.Data;

//lombok注解，在编译时自动为属性生成构造器，getter/setter，tostring等方法
@Data
public class Student {
	private String num;
	private String name;
	private String grade;
	private String college;
}
