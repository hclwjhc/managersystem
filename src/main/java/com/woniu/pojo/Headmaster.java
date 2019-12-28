package com.woniu.pojo;
// Generated 2019-12-20 10:16:45 by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Headmaster generated by hbm2java
 */
public class Headmaster implements java.io.Serializable {

	private Integer hid;
	private Stage stage;
	private Supervisor supervisor;
	private String hname;
	private Set classeses = new HashSet(0);
	private Set students = new HashSet(0);

	public Headmaster() {
	}

	public Headmaster(Stage stage, Supervisor supervisor, String hname, Set classeses, Set students) {
		this.stage = stage;
		this.supervisor = supervisor;
		this.hname = hname;
		this.classeses = classeses;
		this.students = students;
	}

	public Integer getHid() {
		return this.hid;
	}

	public void setHid(Integer hid) {
		this.hid = hid;
	}

	public Stage getStage() {
		return this.stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public Supervisor getSupervisor() {
		return this.supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}

	public String getHname() {
		return this.hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public Set getClasseses() {
		return this.classeses;
	}

	public void setClasseses(Set classeses) {
		this.classeses = classeses;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

}
