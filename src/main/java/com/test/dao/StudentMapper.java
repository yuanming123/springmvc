package com.test.dao;

import java.util.List;

import com.test.entity.Student;


public interface StudentMapper {
	public Student queryStudentByName(String name);
	
	public List<Student> queryStudent();
	
	public int insertStudent(Student student);
}
