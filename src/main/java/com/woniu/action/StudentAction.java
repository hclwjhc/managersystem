package com.woniu.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Student;
import com.woniu.service.IStudentService;

@Controller
public class StudentAction {
	@Autowired
	IStudentService ss;
	private List<Student> stus;
	public List<Student> getStus() {
		return stus;
	}
	public void setStus(List<Student> stus) {
		this.stus = stus;
	}
	public String findAll() {
		stus = ss.findAll();
		return "success";
	}
}
