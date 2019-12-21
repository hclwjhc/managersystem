package com.woniu.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Classes;
import com.woniu.pojo.Headmaster;
import com.woniu.pojo.Supervisor;
import com.woniu.pojo.Teacher;
import com.woniu.service.ISupervisorService;


@Controller
public class SupervisorAction {

	@Autowired
	ISupervisorService sups;
	private List<Classes> classes;
	
	private Classes classess;
	private Headmaster headmaster;
	private Teacher teacher;
	private Supervisor supervisor;
	
	public Headmaster getHeadmaster() {
		return headmaster;
	}

	public void setHeadmaster(Headmaster headmaster) {
		this.headmaster = headmaster;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}

	public Classes getClassess() {
		return classess;
	}

	public void setClassess(Classes classess) {
		this.classess = classess;
	}

	public List<Classes> getClasses() {
		return classes;
	}

	public void setClasses(List<Classes> classes) {
		this.classes = classes;
	}
	
	public String supervisorClassesFindAll() {
		classes = sups.findAll();
		return "supervisoClasses";
	}
	
	public String supervisorClassesSave() {
		System.out.println(classess.toString());
		sups.save(classess);
		return "supervisorClassesAdd";
	}
	
}
