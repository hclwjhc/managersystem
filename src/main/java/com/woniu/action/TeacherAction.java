package com.woniu.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Classes;
import com.woniu.pojo.Teacher;
import com.woniu.service.ISupervisorService;
import com.woniu.service.ITeacherService;
@Controller
public class TeacherAction {

	@Autowired
	ITeacherService ts;
	@Autowired
	ISupervisorService sups;
	private Teacher teacher;
	List<Teacher> teachers;
	private Integer tid;
	private Classes classess;

	public Classes getClassess() {
		return classess;
	}

	public void setClassess(Classes classess) {
		this.classess = classess;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String teacherFindAll() {

		teachers = ts.findAll();
		return "showTeacher";
		
	}

	public String teacherPosition() {
		Integer cid_= classess.getCid();
		Integer tid_ = teacher.getTid();
		teacher.setTid(tid_);
		Classes classes = sups.findOne(cid_);
		classes.setTeacher(teacher);
		sups.update(classes);
		return "teacherUpdate";
		}

}
