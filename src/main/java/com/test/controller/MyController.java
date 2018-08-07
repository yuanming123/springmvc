package com.test.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.entity.Student;
import com.test.service.Service;


@Controller
public class MyController {
	
	@Autowired
	private Service service;
	
	@RequestMapping("/hello")
	public ModelAndView sayHello() {
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping("/index")
	public ModelAndView index() {
		Student student = service.queryStudentByName("小华");
		String name = student.getName();
		ModelAndView model = new ModelAndView();
		model.addObject("name", name);
		model.setViewName("index");
		return model;
	}
}
