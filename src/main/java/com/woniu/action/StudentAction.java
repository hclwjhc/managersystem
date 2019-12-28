package com.woniu.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Checkrecord;
import com.woniu.pojo.Classes;
import com.woniu.pojo.Examrecord;
import com.woniu.pojo.Headmaster;
import com.woniu.pojo.Stage;
import com.woniu.pojo.Student;
import com.woniu.pojo.Teacher;
import com.woniu.service.ICheckrecordService;
import com.woniu.service.IClassesSsrvice;
import com.woniu.service.IStudentService;

@Controller
public class StudentAction {
	@Autowired
	IStudentService ss;
	@Autowired
	IClassesSsrvice Ics;
	
	
	private List<Student> stus;
	private Student student;
	private Integer stuid;
	private Classes classes;
	private Checkrecord checkrecord;
	private Examrecord examrecord;
	private Teacher teacher;
	private Headmaster headmaster;
	private Stage stage;
	
	
	
	
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Stage getStage() {
		return stage;
	}
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	public Checkrecord getCheckrecord() {
		return checkrecord;
	}
	public void setCheckrecord(Checkrecord checkrecord) {
		this.checkrecord = checkrecord;
	}
	
	public Examrecord getExamrecord() {
		return examrecord;
	}
	public void setExamrecord(Examrecord examrecord) {
		this.examrecord = examrecord;
	}
	public Headmaster getHeadmaster() {
		return headmaster;
	}
	public void setHeadmaster(Headmaster headmaster) {
		this.headmaster = headmaster;
	}
	public Classes getClasses() {
		return classes;
	}
	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public List<Student> getStus() {
		return stus;
	}
	public void setStus(List<Student> stus) {
		this.stus = stus;
	}
	
	public Integer getStuid() {
		return stuid;
	}
	public void setStuid(Integer stuid) {
		this.stuid = stuid;
	}
	public String findAll() {
		stus = ss.findAll();
		//System.out.println(stus);
		return "success";
	}
	
	public String change_class() {
		//System.out.println(stuid);
		student=ss.findOne(stuid);
		return "change";
	}
	public String changeC() {
		
		classes = Ics.getCla(classes.getCid());
		System.out.println("-------------------"+stuid);
		
		student=ss.findOne(stuid);
		System.out.println("-----------------------------------"+student.getIdcard());
		student.setClasses(classes);
		
		ss.upd(student);
		return "changeC";
		
	}
	
	
	public String studentSave() {
		System.out.println(stage.getSid()+"---------");
		student.setCheckrecord(checkrecord);
		student.setClasses(classes);
		student.setTeacher(teacher);
		student.setExamrecord(examrecord);
		student.setHeadmaster(headmaster);
		student.setStage(stage);
		ss.save(student);
		return "studentSave";
		
	}
}
