package com.woniu.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Classes;
import com.woniu.pojo.Headmaster;
import com.woniu.pojo.Supervisor;
import com.woniu.pojo.Teacher;
import com.woniu.service.IHeadmasterService;
import com.woniu.service.ISupervisorService;
import com.woniu.service.ITeacherService;


@Controller
public class SupervisorAction {

	@Autowired
	ISupervisorService sups;
	private List<Classes> classes;
	private Integer cid;
	private Classes classess;
	private Supervisor supervisor;
	
	

	public List<Classes> getClasses() {
		return classes;
	}

	public void setClasses(List<Classes> classes) {
		this.classes = classes;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Classes getClassess() {
		return classess;
	}

	public void setClassess(Classes classess) {
		this.classess = classess;
	}

	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}

	public String supervisorClassesFindAll() {
		classes = sups.findAll();
		return "supervisoClasses";
	}

	public String supervisorClassesSave() {
		sups.save(classess);
		return "supervisorClassesAdd";
	}

}
