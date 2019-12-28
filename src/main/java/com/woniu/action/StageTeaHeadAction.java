package com.woniu.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Teacher;
import com.woniu.service.IHeadmasterService;
import com.woniu.service.IStageService;
import com.woniu.service.ITeacherService;
import com.woniu.pojo.Headmaster;
import com.woniu.pojo.Stage;

@Controller
public class StageTeaHeadAction {

	@Autowired
	IStageService ss;
	@Autowired
	ITeacherService ts;
	@Autowired
	IHeadmasterService hs;

	private Stage stage;
	List<Stage> Stages;
	private Teacher teacher;
	List<Teacher> teachers;
	private Headmaster headmaster;
	List<Headmaster> headmasters;
	private Integer tid;
	private String tname;
	
	
	
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Headmaster getHeadmaster() {
		return headmaster;
	}
	public void setHeadmaster(Headmaster headmaster) {
		this.headmaster = headmaster;
	}
	public List<Headmaster> getHeadmasters() {
		return headmasters;
	}
	public void setHeadmasters(List<Headmaster> headmasters) {
		this.headmasters = headmasters;
	}
	public Stage getStage() {
		return stage;
	}
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	public List<Stage> getStages() {
		return Stages;
	}
	public void setStages(List<Stage> stages) {
		Stages = stages;
	}

	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public String stageTeacherFindOne() {
		System.out.println("11111111111111111111111111111111");
	
		Integer sid = stage.getSid();
		System.out.println(sid+"-------------------------------sid===================");
		teacher = ts.findBySid(sid);
		
		System.out.println(teacher.getTname()+"/////////////////////////////////////////////////////////////////////////");
		System.out.println(tid+"`````````````````````teachers``````````````````````````");
		return "stageTeacher";

	}

	public String stageHeadmasterFindOne() {
		System.out.println("222222222222222222222222222222222222222222");
		Integer sid = stage.getSid();
		System.out.println(sid+"-------------------------------sid===================");
		headmaster = hs.findHBySid(sid);
		//		hs.findAll();
		headmaster.setHname(headmaster.getHname());
		System.out.println(headmaster.getHname()+"..............................................................................................................");
		System.out.println(headmaster.getHid()+"`````````````````````teachers``````````````````````````");
		return "stageHeadmaster";

	}

}
