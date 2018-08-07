package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.dao.StudentMapper;
import com.test.entity.Student;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	private StudentMapper studentMapper;
	
	public Student queryStudentByName(String name) {
		return studentMapper.queryStudentByName(name);
	}
}
